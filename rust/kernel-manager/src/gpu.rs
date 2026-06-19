use crate::sysfs;
use once_cell::sync::{Lazy, OnceCell};
use std::sync::Mutex;

struct GpuBusyStats { busy: i64, total: i64 }
static GPU_MODEL: OnceCell<String> = OnceCell::new();
static LAST_GPU_BUSY: Lazy<Mutex<Option<GpuBusyStats>>> = Lazy::new(|| Mutex::new(None));

pub fn get_gpu_model() -> String { GPU_MODEL.get_or_init(detect_adreno_model).clone() }

fn detect_adreno_model() -> String {
    for path in &["/sys/class/kgsl/kgsl-3d0/gpu_model", "/sys/class/kgsl/kgsl-3d0/devfreq/gpu_model"] {
        if let Some(model) = sysfs::read_sysfs_cached(path, 0) {
            let model = model.trim();
            if model.to_lowercase().starts_with("adreno") { return model.to_string(); }
            return format!("Adreno {}", model);
        }
    }
    "Adreno".to_string()
}

pub fn read_gpu_freq() -> i32 {
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

pub fn read_gpu_busy() -> i32 {
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
                        return if load == 0 && db > 0 { 1 } else { load.min(100) as i32 };
                    }
                    return 0;
                }
                *last = Some(GpuBusyStats { busy: curr_busy, total: curr_total });
            }
        }
    }
    sysfs::read_sysfs_int("/sys/class/kgsl/kgsl-3d0/gpu_busy_percentage", 0).unwrap_or(0) as i32
}

pub fn reset_gpu_stats() { *LAST_GPU_BUSY.lock().unwrap() = None; }

pub fn get_gpu_available_frequencies() -> Vec<i32> {
    for path in &["/sys/class/kgsl/kgsl-3d0/gpu_available_frequencies", "/sys/class/kgsl/kgsl-3d0/devfreq/available_frequencies"] {
        if let Some(content) = sysfs::read_sysfs_cached(path, 0) {
            let freqs: Vec<i32> = content.split_whitespace().filter_map(|s| s.parse::<i64>().ok())
                .map(|hz| if hz > 1_000_000 { (hz / 1_000_000) as i32 } else if hz > 1000 { (hz / 1000) as i32 } else { hz as i32 }).collect();
            if !freqs.is_empty() { return freqs; }
        }
    }
    vec![]
}

pub fn get_gpu_available_policies() -> Vec<String> {
    for path in &["/sys/class/kgsl/kgsl-3d0/devfreq/available_governors", "/sys/class/kgsl/kgsl-3d0/available_governors"] {
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
    let mut ok = true;
    for (path, val) in &[(format!("{}/min_pwrlevel", base), min_pwr), (format!("{}/max_pwrlevel", base), max_pwr)] {
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
    sysfs::chmod(&path, "444"); ok
}

pub fn set_gpu_freq_limit(min_mhz: i32, max_mhz: i32) -> bool {
    let base = "/sys/class/kgsl/kgsl-3d0";
    sysfs::chmod(&format!("{}/devfreq/min_freq", base), "644");
    sysfs::chmod(&format!("{}/devfreq/max_freq", base), "644");
    let r1 = sysfs::write_sysfs(&format!("{}/devfreq/min_freq", base), &format!("{}", min_mhz * 1_000_000));
    let r2 = sysfs::write_sysfs(&format!("{}/devfreq/max_freq", base), &format!("{}", max_mhz * 1_000_000));
    r1 && r2
}

// ==================== Force Params (Encore) ====================

pub fn set_gpu_bus_split(enabled: bool) -> bool {
    let path = "/sys/class/kgsl/kgsl-3d0/bus_split";
    sysfs::chmod(path, "644"); let ok = sysfs::write_sysfs(path, if enabled { "1" } else { "0" }); sysfs::chmod(path, "444"); ok
}

pub fn set_gpu_throttling(enabled: bool) -> bool {
    let path = "/sys/class/kgsl/kgsl-3d0/throttling";
    sysfs::chmod(path, "644"); let ok = sysfs::write_sysfs(path, if enabled { "1" } else { "0" }); sysfs::chmod(path, "444"); ok
}

pub fn set_gpu_idle_timer(ms: i32) -> bool {
    let path = "/sys/class/kgsl/kgsl-3d0/idle_timer";
    sysfs::chmod(path, "644"); let ok = sysfs::write_sysfs(path, &ms.to_string()); sysfs::chmod(path, "444"); ok
}

pub fn set_gpu_max_gpuclk(hz: i64) -> bool {
    let path = "/sys/class/kgsl/kgsl-3d0/max_gpuclk";
    sysfs::chmod(path, "644"); let ok = sysfs::write_sysfs(path, &hz.to_string()); sysfs::chmod(path, "444"); ok
}

pub fn set_gpu_devfreq_governor(governor: &str) -> bool {
    let path = "/sys/class/kgsl/kgsl-3d0/devfreq/governor";
    sysfs::chmod(path, "644"); let ok = sysfs::write_sysfs(path, governor); sysfs::chmod(path, "444"); ok
}

// ==================== Adreno Idler (ZKM) ====================

pub fn set_adreno_idler_active(active: bool) -> bool {
    let path = "/sys/module/adreno_idler/parameters/adreno_idler_active";
    sysfs::chmod(path, "644"); let ok = sysfs::write_sysfs(path, if active { "Y" } else { "N" }); sysfs::chmod(path, "444"); ok
}

pub fn set_adreno_idler_idlewait(ms: i32) -> bool {
    let path = "/sys/module/adreno_idler/parameters/adreno_idler_idlewait";
    sysfs::chmod(path, "644"); let ok = sysfs::write_sysfs(path, &ms.to_string()); sysfs::chmod(path, "444"); ok
}

pub fn set_adreno_idler_downdifferential(pct: i32) -> bool {
    let path = "/sys/module/adreno_idler/parameters/adreno_idler_downdifferential";
    sysfs::chmod(path, "644"); let ok = sysfs::write_sysfs(path, &pct.to_string()); sysfs::chmod(path, "444"); ok
}

pub fn set_adreno_idler_idleworkload(val: i32) -> bool {
    let path = "/sys/module/adreno_idler/parameters/adreno_idler_idleworkload";
    sysfs::chmod(path, "644"); let ok = sysfs::write_sysfs(path, &val.to_string()); sysfs::chmod(path, "444"); ok
}

// ==================== Simple GPU Algorithm (ZKM) ====================

pub fn set_simple_gpu_activate(active: bool) -> bool {
    let path = "/sys/module/simple_gpu_algorithm/parameters/simple_gpu_activate";
    sysfs::chmod(path, "644"); let ok = sysfs::write_sysfs(path, if active { "Y" } else { "N" }); sysfs::chmod(path, "444"); ok
}

pub fn set_simple_gpu_laziness(val: i32) -> bool {
    let path = "/sys/module/simple_gpu_algorithm/parameters/simple_laziness";
    sysfs::chmod(path, "644"); let ok = sysfs::write_sysfs(path, &val.to_string()); sysfs::chmod(path, "444"); ok
}

pub fn set_simple_gpu_ramp_threshold(val: i32) -> bool {
    let path = "/sys/module/simple_gpu_algorithm/parameters/simple_ramp_threshold";
    sysfs::chmod(path, "644"); let ok = sysfs::write_sysfs(path, &val.to_string()); sysfs::chmod(path, "444"); ok
}

// ==================== Bus DCVS (ZKM) ====================

pub fn has_bus_dcvs() -> bool { sysfs::file_exists("/sys/devices/system/cpu/bus_dcvs") }

pub fn get_bus_dcvs_components() -> Vec<String> {
    let base = "/sys/devices/system/cpu/bus_dcvs";
    let mut components = Vec::new();
    for name in &["LLCC", "DDR", "GPU", "CPU"] {
        if sysfs::file_exists(&format!("{}/{}", base, name)) { components.push(name.to_string()); }
    }
    components
}

pub fn get_bus_dcvs_freq(bus_name: &str) -> Vec<i32> {
    let base = "/sys/devices/system/cpu/bus_dcvs";
    for path in &[format!("{}/{}/available_frequencies", base, bus_name), format!("{}/{}/0/available_frequencies", base, bus_name)] {
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
    sysfs::chmod(&format!("{}/{}/min_freq", base, bus_name), "644");
    sysfs::chmod(&format!("{}/{}/max_freq", base, bus_name), "644");
    sysfs::write_sysfs(&format!("{}/{}/min_freq", base, bus_name), "0");
    let r1 = sysfs::write_sysfs(&format!("{}/{}/max_freq", base, bus_name), &format!("{}", max_freq * 1000));
    let r2 = sysfs::write_sysfs(&format!("{}/{}/min_freq", base, bus_name), &format!("{}", min_freq * 1000));
    r1 && r2
}
