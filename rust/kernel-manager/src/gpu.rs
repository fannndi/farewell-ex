use crate::sysfs;
use once_cell::sync::{Lazy, OnceCell};
use serde::Serialize;
use std::sync::Mutex;

#[derive(Debug, Clone, PartialEq)]
pub enum GpuVendor { Qualcomm, Mali, PowerVR, Nvidia, Unknown }

impl std::fmt::Display for GpuVendor {
    fn fmt(&self, f: &mut std::fmt::Formatter<'_>) -> std::fmt::Result {
        match self {
            GpuVendor::Qualcomm => write!(f, "Qualcomm"),
            GpuVendor::Mali => write!(f, "ARM Mali"),
            GpuVendor::PowerVR => write!(f, "PowerVR"),
            GpuVendor::Nvidia => write!(f, "NVIDIA"),
            GpuVendor::Unknown => write!(f, "Unknown"),
        }
    }
}

struct GpuBusyStats { busy: i64, total: i64 }
static GPU_INFO: OnceCell<(GpuVendor, String)> = OnceCell::new();
static LAST_GPU_BUSY: Lazy<Mutex<Option<GpuBusyStats>>> = Lazy::new(|| Mutex::new(None));

pub fn get_gpu_vendor() -> GpuVendor { GPU_INFO.get_or_init(detect_gpu).0.clone() }
pub fn get_gpu_model() -> String { GPU_INFO.get_or_init(detect_gpu).1.clone() }

fn detect_gpu() -> (GpuVendor, String) {
    if sysfs::file_exists("/sys/class/kgsl/kgsl-3d0/gpuclk") {
        let model = detect_adreno_model().unwrap_or_else(|| "Adreno".to_string());
        return (GpuVendor::Qualcomm, model);
    }
    for path in &["/sys/class/misc/mali0/device/gpuinfo", "/sys/devices/platform/mali/gpuinfo"] {
        if sysfs::file_exists(path) {
            let model = detect_mali_model().unwrap_or_else(|| "Mali".to_string());
            return (GpuVendor::Mali, model);
        }
    }
    if let Some(v) = detect_via_getprop() { return v; }
    (GpuVendor::Unknown, "Unknown GPU".to_string())
}

fn detect_adreno_model() -> Option<String> {
    for path in &["/sys/class/kgsl/kgsl-3d0/gpu_model", "/sys/class/kgsl/kgsl-3d0/devfreq/gpu_model"] {
        if let Some(model) = sysfs::read_sysfs_cached(path, 0) {
            let model = model.trim();
            if model.to_lowercase().starts_with("adreno") { return Some(model.to_string()); }
            return Some(format!("Adreno {}", model));
        }
    }
    None
}

fn detect_mali_model() -> Option<String> {
    for path in &["/sys/class/misc/mali0/device/gpuinfo", "/sys/devices/platform/mali/gpuinfo"] {
        if let Some(model) = sysfs::read_sysfs_cached(path, 0) {
            let model = model.trim();
            if model.to_lowercase().starts_with("mali") { return Some(model.to_string()); }
            return Some(format!("Mali {}", model));
        }
    }
    None
}

fn detect_via_getprop() -> Option<(GpuVendor, String)> {
    let vulkan = sysfs::get_system_property("ro.hardware.vulkan")?;
    let lower = vulkan.to_lowercase();
    if lower.contains("adreno") { return Some((GpuVendor::Qualcomm, "Adreno".to_string())); }
    if lower.contains("mali") { return Some((GpuVendor::Mali, "Mali".to_string())); }
    None
}

pub fn read_gpu_freq() -> i32 {
    let vendor = get_gpu_vendor();
    match vendor {
        GpuVendor::Qualcomm => read_adreno_freq(),
        GpuVendor::Mali => read_mali_freq(),
        _ => 0,
    }
}

fn read_adreno_freq() -> i32 {
    for path in &[
        "/sys/class/kgsl/kgsl-3d0/gpuclk",
        "/sys/class/kgsl/kgsl-3d0/devfreq/cur_freq",
        "/sys/class/kgsl/kgsl-3d0/clock_mhz",
    ] {
        if let Some(freq) = sysfs::read_sysfs_int(path, 200) {
            if freq > 1_000_000 { return (freq / 1_000_000) as i32; }
            if freq > 1000 { return (freq / 1000) as i32; }
            return freq as i32;
        }
    }
    0
}

fn read_mali_freq() -> i32 {
    for path in &["/sys/class/misc/mali0/device/clock", "/sys/devices/platform/mali/clock"] {
        if let Some(freq) = sysfs::read_sysfs_int(path, 200) {
            if freq > 1_000_000 { return (freq / 1_000_000) as i32; }
            return freq as i32;
        }
    }
    0
}

pub fn read_gpu_busy() -> i32 {
    match get_gpu_vendor() {
        GpuVendor::Qualcomm => read_adreno_busy(),
        GpuVendor::Mali => read_mali_busy(),
        _ => 0,
    }
}

pub fn reset_gpu_stats() {
    *LAST_GPU_BUSY.lock().unwrap() = None;
}

fn read_adreno_busy() -> i32 {
    if let Some(content) = sysfs::read_sysfs("/sys/class/kgsl/kgsl-3d0/gpubusy") {
        let parts: Vec<&str> = content.split_whitespace().collect();
        if parts.len() >= 2 {
            if let (Ok(curr_busy), Ok(curr_total)) = (parts[0].parse::<i64>(), parts[1].parse::<i64>()) {
                let mut last = LAST_GPU_BUSY.lock().unwrap();
                if let Some(prev) = &*last {
                    let (db, dt) = if curr_total < prev.total {
                        (curr_busy, curr_total)
                    } else {
                        (curr_busy.saturating_sub(prev.busy), curr_total.saturating_sub(prev.total))
                    };
                    *last = Some(GpuBusyStats { busy: curr_busy, total: curr_total });
                    if dt > 0 {
                        let load = (db * 100) / dt;
                        return if load == 0 && db > 0 { 1 } else { (load.min(100)) as i32 };
                    }
                    return 0;
                }
                *last = Some(GpuBusyStats { busy: curr_busy, total: curr_total });
            }
        }
    }
    sysfs::read_sysfs_int("/sys/class/kgsl/kgsl-3d0/gpu_busy_percentage", 0).unwrap_or(0) as i32
}

fn read_mali_busy() -> i32 {
    for path in &["/sys/class/misc/mali0/device/utilization", "/sys/devices/platform/mali/utilization"] {
        if let Some(busy) = sysfs::read_sysfs_int(path, 200) {
            return busy as i32;
        }
    }
    0
}

pub fn get_gpu_available_frequencies() -> Vec<i32> {
    for path in &[
        "/sys/class/kgsl/kgsl-3d0/gpu_available_frequencies",
        "/sys/class/kgsl/kgsl-3d0/devfreq/available_frequencies",
    ] {
        if let Some(content) = sysfs::read_sysfs_cached(path, 0) {
            let freqs: Vec<i32> = content.split_whitespace().filter_map(|s| s.parse::<i64>().ok())
                .map(|hz| if hz > 1_000_000 { (hz / 1_000_000) as i32 }
                    else if hz > 1000 { (hz / 1000) as i32 }
                    else { hz as i32 }).collect();
            if !freqs.is_empty() { return freqs; }
        }
    }
    vec![]
}

pub fn get_gpu_available_policies() -> Vec<String> {
    for path in &[
        "/sys/class/kgsl/kgsl-3d0/devfreq/available_governors",
        "/sys/class/kgsl/kgsl-3d0/available_governors",
    ] {
        if let Some(content) = sysfs::read_sysfs_cached(path, 0) {
            return content.split_whitespace().map(|s| s.to_string()).collect();
        }
    }
    vec![]
}

pub fn get_gpu_driver_info() -> String {
    for path in &["/sys/class/kgsl/kgsl-3d0/gpu_model", "/sys/class/kgsl/kgsl-3d0/devfreq/name"] {
        if let Some(info) = sysfs::read_sysfs_cached(path, 0) {
            if !info.is_empty() && info != "unknown" { return info; }
        }
    }
    "unknown".to_string()
}

pub fn set_gpu_power_levels(min_pwr: i32, max_pwr: i32) -> bool {
    let base = "/sys/class/kgsl/kgsl-3d0";
    let paths = [
        (format!("{}/min_pwrlevel", base), min_pwr),
        (format!("{}/max_pwrlevel", base), max_pwr),
    ];
    let mut ok = true;
    for (path, val) in &paths {
        sysfs::chmod(path, "644");
        if !sysfs::write_sysfs(path, &val.to_string()) { ok = false; }
        sysfs::chmod(path, "444");
    }
    ok
}

pub fn set_gpu_force(state: &str, value: bool) -> bool {
    let path = format!("/sys/class/kgsl/kgsl-3d0/{}", state);
    sysfs::chmod(&path, "644");
    let ok = sysfs::write_sysfs(&path, if value { "1" } else { "0" });
    sysfs::chmod(&path, "444");
    ok
}

pub fn set_gpu_freq_limit(min_mhz: i32, max_mhz: i32) -> bool {
    let base = "/sys/class/kgsl/kgsl-3d0";
    let min_path = format!("{}/devfreq/min_freq", base);
    let max_path = format!("{}/devfreq/max_freq", base);
    sysfs::chmod(&min_path, "644");
    sysfs::chmod(&max_path, "644");
    let r1 = sysfs::write_sysfs(&min_path, &format!("{}", min_mhz * 1_000_000));
    let r2 = sysfs::write_sysfs(&max_path, &format!("{}", max_mhz * 1_000_000));
    r1 && r2
}

// ==================== GPU Force Params (Encore) ====================

pub fn set_gpu_bus_split(enabled: bool) -> bool {
    let path = "/sys/class/kgsl/kgsl-3d0/bus_split";
    sysfs::chmod(path, "644");
    let ok = sysfs::write_sysfs(path, if enabled { "1" } else { "0" });
    sysfs::chmod(path, "444"); ok
}

pub fn set_gpu_throttling(enabled: bool) -> bool {
    let path = "/sys/class/kgsl/kgsl-3d0/throttling";
    sysfs::chmod(path, "644");
    let ok = sysfs::write_sysfs(path, if enabled { "1" } else { "0" });
    sysfs::chmod(path, "444"); ok
}

pub fn set_gpu_idle_timer(ms: i32) -> bool {
    let path = "/sys/class/kgsl/kgsl-3d0/idle_timer";
    sysfs::chmod(path, "644");
    let ok = sysfs::write_sysfs(path, &ms.to_string());
    sysfs::chmod(path, "444"); ok
}

pub fn set_gpu_max_gpuclk(hz: i64) -> bool {
    let path = "/sys/class/kgsl/kgsl-3d0/max_gpuclk";
    sysfs::chmod(path, "644");
    let ok = sysfs::write_sysfs(path, &hz.to_string());
    sysfs::chmod(path, "444"); ok
}

pub fn set_gpu_devfreq_governor(governor: &str) -> bool {
    let path = "/sys/class/kgsl/kgsl-3d0/devfreq/governor";
    sysfs::chmod(path, "644");
    let ok = sysfs::write_sysfs(path, governor);
    sysfs::chmod(path, "444"); ok
}

// ==================== Adreno Idler (ZKM) ====================

pub fn set_adreno_idler_active(active: bool) -> bool {
    let path = "/sys/module/adreno_idler/parameters/adreno_idler_active";
    sysfs::chmod(path, "644");
    let ok = sysfs::write_sysfs(path, if active { "Y" } else { "N" });
    sysfs::chmod(path, "444"); ok
}

pub fn set_adreno_idler_idlewait(ms: i32) -> bool {
    let path = "/sys/module/adreno_idler/parameters/adreno_idler_idlewait";
    sysfs::chmod(path, "644");
    let ok = sysfs::write_sysfs(path, &ms.to_string());
    sysfs::chmod(path, "444"); ok
}

pub fn set_adreno_idler_downdifferential(pct: i32) -> bool {
    let path = "/sys/module/adreno_idler/parameters/adreno_idler_downdifferential";
    sysfs::chmod(path, "644");
    let ok = sysfs::write_sysfs(path, &pct.to_string());
    sysfs::chmod(path, "444"); ok
}

pub fn set_adreno_idler_idleworkload(val: i32) -> bool {
    let path = "/sys/module/adreno_idler/parameters/adreno_idler_idleworkload";
    sysfs::chmod(path, "644");
    let ok = sysfs::write_sysfs(path, &val.to_string());
    sysfs::chmod(path, "444"); ok
}

// ==================== Simple GPU Algorithm (ZKM) ====================

pub fn set_simple_gpu_activate(active: bool) -> bool {
    let path = "/sys/module/simple_gpu_algorithm/parameters/simple_gpu_activate";
    sysfs::chmod(path, "644");
    let ok = sysfs::write_sysfs(path, if active { "Y" } else { "N" });
    sysfs::chmod(path, "444"); ok
}

pub fn set_simple_gpu_laziness(val: i32) -> bool {
    let path = "/sys/module/simple_gpu_algorithm/parameters/simple_laziness";
    sysfs::chmod(path, "644");
    let ok = sysfs::write_sysfs(path, &val.to_string());
    sysfs::chmod(path, "444"); ok
}

pub fn set_simple_gpu_ramp_threshold(val: i32) -> bool {
    let path = "/sys/module/simple_gpu_algorithm/parameters/simple_ramp_threshold";
    sysfs::chmod(path, "644");
    let ok = sysfs::write_sysfs(path, &val.to_string());
    sysfs::chmod(path, "444"); ok
}

// ==================== Bus DCVS (ZKM) ====================

pub fn has_bus_dcvs() -> bool {
    sysfs::file_exists("/sys/devices/system/cpu/bus_dcvs")
}

pub fn get_bus_dcvs_components() -> Vec<String> {
    let base = "/sys/devices/system/cpu/bus_dcvs";
    let mut components = Vec::new();
    if let Some(content) = sysfs::read_sysfs_cached(
        &format!("{}/{}", base, "list"), 0) {
        components = content.split_whitespace().map(|s| s.to_string()).collect();
    }
    if components.is_empty() {
        // Fallback: try reading subdirs via shell
        for name in &["LLCC", "DDR", "GPU", "CPU"] {
            if sysfs::file_exists(&format!("{}/{}", base, name)) {
                components.push(name.to_string());
            }
        }
    }
    components
}

pub fn get_bus_dcvs_freq(bus_name: &str) -> Vec<i32> {
    let base = "/sys/devices/system/cpu/bus_dcvs";
    let paths = [
        format!("{}/{}/available_frequencies", base, bus_name),
        format!("{}/{}/0/available_frequencies", base, bus_name),
    ];
    for path in &paths {
        if let Some(content) = sysfs::read_sysfs_cached(path, 0) {
            let freqs: Vec<i32> = content.split_whitespace().filter_map(|s| s.parse::<i64>().ok())
                .map(|hz| (hz / 1000) as i32).collect();
            if !freqs.is_empty() { return freqs; }
        }
    }
    vec![]
}

pub fn set_bus_dcvs_freq(bus_name: &str, min_freq: i32, max_freq: i32) -> bool {
    let base = "/sys/devices/system/cpu/bus_dcvs";
    let min_path = format!("{}/{}/min_freq", base, bus_name);
    let max_path = format!("{}/{}/max_freq", base, bus_name);
    // Brute-force boundary: expand min to absolute min first
    sysfs::chmod(&min_path, "644");
    sysfs::chmod(&max_path, "644");
    sysfs::write_sysfs(&min_path, "0");
    let r1 = sysfs::write_sysfs(&max_path, &format!("{}", max_freq * 1000));
    let r2 = sysfs::write_sysfs(&min_path, &format!("{}", min_freq * 1000));
    r1 && r2
}
