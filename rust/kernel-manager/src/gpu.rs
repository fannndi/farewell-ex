use crate::sysfs;
use once_cell::sync::{Lazy, OnceCell};
use std::sync::Mutex;

struct GpuBusyStats { busy: i64, total: i64 }
static GPU_MODEL: OnceCell<String> = OnceCell::new();
static LAST_GPU_BUSY: Lazy<Mutex<Option<GpuBusyStats>>> = Lazy::new(|| Mutex::new(None));

/// Get GPU model name (cached, detects Adreno model).
///
/// **Sysfs path:** `/sys/class/kgsl/kgsl-3d0/gpu_model`
/// **Root:** Not required
/// **Returns:** GPU model string (e.g., "Adreno 618")
pub fn get_gpu_model() -> String { GPU_MODEL.get_or_init(detect_adreno_model).clone() }

/// Get GPU vendor name.
///
/// **Sysfs path:** N/A (hardcoded)
/// **Root:** Not required
/// **Returns:** "Qualcomm"
pub fn get_gpu_vendor() -> String { "Qualcomm".to_string() }

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

/// Read current GPU frequency.
///
/// **Sysfs path:** `/sys/class/kgsl/kgsl-3d0/gpuclk` or `devfreq/cur_freq`
/// **Root:** Not required
/// **Returns:** Frequency in MHz
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

/// Read GPU busy/idle load percentage.
///
/// **Sysfs path:** `/sys/class/kgsl/kgsl-3d0/gpubusy`
/// **Root:** Not required
/// **Returns:** GPU load percentage (0–100)
pub fn read_gpu_busy() -> i32 {
    if let Some(content) = sysfs::read_sysfs_cached("/sys/class/kgsl/kgsl-3d0/gpubusy", 500) {
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

/// Reset GPU busy stats tracking.
///
/// **Sysfs path:** N/A (in-memory)
/// **Root:** Not required
/// **Returns:** Nothing
pub fn reset_gpu_stats() { *LAST_GPU_BUSY.lock().unwrap() = None; }

/// Get available GPU frequencies.
///
/// **Sysfs path:** `/sys/class/kgsl/kgsl-3d0/gpu_available_frequencies`
/// **Root:** Not required
/// **Returns:** Vec of frequencies in MHz
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

/// Get available GPU power/performance policies.
///
/// **Sysfs path:** `/sys/class/kgsl/kgsl-3d0/devfreq/available_governors`
/// **Root:** Not required
/// **Returns:** Vec of governor/policy name strings
pub fn get_gpu_available_policies() -> Vec<String> {
    for path in &["/sys/class/kgsl/kgsl-3d0/devfreq/available_governors", "/sys/class/kgsl/kgsl-3d0/available_governors"] {
        if let Some(content) = sysfs::read_sysfs_cached(path, 0) {
            return content.split_whitespace().map(|s| s.to_string()).collect();
        }
    }
    vec![]
}

/// Get GPU driver/info string.
///
/// **Sysfs path:** `/sys/class/kgsl/kgsl-3d0/gpu_model` or `devfreq/name`
/// **Root:** Not required
/// **Returns:** Driver info string or "unknown"
pub fn get_gpu_driver_info() -> String {
    for path in &["/sys/class/kgsl/kgsl-3d0/gpu_model", "/sys/class/kgsl/kgsl-3d0/devfreq/name"] {
        if let Some(info) = sysfs::read_sysfs_cached(path, 0) {
            if !info.is_empty() && info != "unknown" { return info; }
        }
    }
    "unknown".to_string()
}

/// Set GPU min/max power levels.
///
/// **Sysfs path:** `/sys/class/kgsl/kgsl-3d0/min_pwrlevel`, `max_pwrlevel`
/// **Root:** Required
/// **Returns:** `true` if both levels written successfully
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

/// Force GPU clock/bus/rail state on or off.
///
/// **Sysfs path:** `/sys/class/kgsl/kgsl-3d0/{state}`
/// **Root:** Required
/// **Returns:** `true` if written successfully
pub fn set_gpu_force(state: &str, value: bool) -> bool {
    let path = format!("/sys/class/kgsl/kgsl-3d0/{}", state);
    sysfs::chmod(&path, "644");
    let ok = sysfs::write_sysfs(&path, if value { "1" } else { "0" });
    sysfs::chmod(&path, "444"); ok
}

/// Set GPU frequency min/max limits via devfreq.
///
/// **Sysfs path:** `/sys/class/kgsl/kgsl-3d0/devfreq/min_freq`, `max_freq`
/// **Root:** Required
/// **Returns:** `true` if both limits written successfully
pub fn set_gpu_freq_limit(min_mhz: i32, max_mhz: i32) -> bool {
    let base = "/sys/class/kgsl/kgsl-3d0";
    sysfs::chmod(&format!("{}/devfreq/min_freq", base), "644");
    sysfs::chmod(&format!("{}/devfreq/max_freq", base), "644");
    let r1 = sysfs::write_sysfs(&format!("{}/devfreq/min_freq", base), &format!("{}", min_mhz * 1_000_000));
    let r2 = sysfs::write_sysfs(&format!("{}/devfreq/max_freq", base), &format!("{}", max_mhz * 1_000_000));
    r1 && r2
}

// ==================== Force Params (Encore) ====================

/// Enable/disable GPU bus split (Encore).
///
/// **Sysfs path:** `/sys/class/kgsl/kgsl-3d0/bus_split`
/// **Root:** Required
/// **Returns:** `true` if written successfully
pub fn set_gpu_bus_split(enabled: bool) -> bool {
    let path = "/sys/class/kgsl/kgsl-3d0/bus_split";
    sysfs::chmod(path, "644"); let ok = sysfs::write_sysfs(path, if enabled { "1" } else { "0" }); sysfs::chmod(path, "444"); ok
}

/// Enable/disable GPU thermal throttling.
///
/// **Sysfs path:** `/sys/class/kgsl/kgsl-3d0/throttling`
/// **Root:** Required
/// **Returns:** `true` if written successfully
pub fn set_gpu_throttling(enabled: bool) -> bool {
    let path = "/sys/class/kgsl/kgsl-3d0/throttling";
    sysfs::chmod(path, "644"); let ok = sysfs::write_sysfs(path, if enabled { "1" } else { "0" }); sysfs::chmod(path, "444"); ok
}

/// Set GPU idle timer value in milliseconds.
///
/// **Sysfs path:** `/sys/class/kgsl/kgsl-3d0/idle_timer`
/// **Root:** Required
/// **Returns:** `true` if written successfully
pub fn set_gpu_idle_timer(ms: i32) -> bool {
    let path = "/sys/class/kgsl/kgsl-3d0/idle_timer";
    sysfs::chmod(path, "644"); let ok = sysfs::write_sysfs(path, &ms.to_string()); sysfs::chmod(path, "444"); ok
}

/// Set GPU maximum clock in Hz.
///
/// **Sysfs path:** `/sys/class/kgsl/kgsl-3d0/max_gpuclk`
/// **Root:** Required
/// **Returns:** `true` if written successfully
pub fn set_gpu_max_gpuclk(hz: i64) -> bool {
    let path = "/sys/class/kgsl/kgsl-3d0/max_gpuclk";
    sysfs::chmod(path, "644"); let ok = sysfs::write_sysfs(path, &hz.to_string()); sysfs::chmod(path, "444"); ok
}

/// Set GPU devfreq governor.
///
/// **Sysfs path:** `/sys/class/kgsl/kgsl-3d0/devfreq/governor`
/// **Root:** Required
/// **Returns:** `true` if written successfully
pub fn set_gpu_devfreq_governor(governor: &str) -> bool {
    let path = "/sys/class/kgsl/kgsl-3d0/devfreq/governor";
    sysfs::chmod(path, "644"); let ok = sysfs::write_sysfs(path, governor); sysfs::chmod(path, "444"); ok
}

// ==================== Adreno Idler (ZKM) ====================

/// Toggle Adreno Idler module active state (ZKM).
///
/// **Sysfs path:** `/sys/module/adreno_idler/parameters/adreno_idler_active`
/// **Root:** Required
/// **Returns:** `true` if written successfully
pub fn set_adreno_idler_active(active: bool) -> bool {
    let path = "/sys/module/adreno_idler/parameters/adreno_idler_active";
    if !sysfs::file_exists(path) { return false; }
    sysfs::chmod(path, "644"); let ok = sysfs::write_sysfs(path, if active { "Y" } else { "N" }); sysfs::chmod(path, "444"); ok
}

/// Set Adreno Idler idle wait in ms (ZKM).
///
/// **Sysfs path:** `/sys/module/adreno_idler/parameters/adreno_idler_idlewait`
/// **Root:** Required
/// **Returns:** `true` if written successfully
pub fn set_adreno_idler_idlewait(ms: i32) -> bool {
    let path = "/sys/module/adreno_idler/parameters/adreno_idler_idlewait";
    if !sysfs::file_exists(path) { return false; }
    sysfs::chmod(path, "644"); let ok = sysfs::write_sysfs(path, &ms.to_string()); sysfs::chmod(path, "444"); ok
}

/// Set Adreno Idler down-differential percentage (ZKM).
///
/// **Sysfs path:** `/sys/module/adreno_idler/parameters/adreno_idler_downdifferential`
/// **Root:** Required
/// **Returns:** `true` if written successfully
pub fn set_adreno_idler_downdifferential(pct: i32) -> bool {
    let path = "/sys/module/adreno_idler/parameters/adreno_idler_downdifferential";
    if !sysfs::file_exists(path) { return false; }
    sysfs::chmod(path, "644"); let ok = sysfs::write_sysfs(path, &pct.to_string()); sysfs::chmod(path, "444"); ok
}

/// Set Adreno Idler idle workload value (ZKM).
///
/// **Sysfs path:** `/sys/module/adreno_idler/parameters/adreno_idler_idleworkload`
/// **Root:** Required
/// **Returns:** `true` if written successfully
pub fn set_adreno_idler_idleworkload(val: i32) -> bool {
    let path = "/sys/module/adreno_idler/parameters/adreno_idler_idleworkload";
    if !sysfs::file_exists(path) { return false; }
    sysfs::chmod(path, "644"); let ok = sysfs::write_sysfs(path, &val.to_string()); sysfs::chmod(path, "444"); ok
}

// ==================== Simple GPU Algorithm (ZKM) ====================

/// Toggle Simple GPU Algorithm (ZKM).
///
/// **Sysfs path:** `/sys/module/simple_gpu_algorithm/parameters/simple_gpu_activate`
/// **Root:** Required
/// **Returns:** `true` if written successfully
pub fn set_simple_gpu_activate(active: bool) -> bool {
    let path = "/sys/module/simple_gpu_algorithm/parameters/simple_gpu_activate";
    if !sysfs::file_exists(path) { return false; }
    sysfs::chmod(path, "644"); let ok = sysfs::write_sysfs(path, if active { "Y" } else { "N" }); sysfs::chmod(path, "444"); ok
}

/// Set Simple GPU Algorithm laziness value (ZKM).
///
/// **Sysfs path:** `/sys/module/simple_gpu_algorithm/parameters/simple_laziness`
/// **Root:** Required
/// **Returns:** `true` if written successfully
pub fn set_simple_gpu_laziness(val: i32) -> bool {
    let path = "/sys/module/simple_gpu_algorithm/parameters/simple_laziness";
    if !sysfs::file_exists(path) { return false; }
    sysfs::chmod(path, "644"); let ok = sysfs::write_sysfs(path, &val.to_string()); sysfs::chmod(path, "444"); ok
}

/// Set Simple GPU Algorithm ramp threshold (ZKM).
///
/// **Sysfs path:** `/sys/module/simple_gpu_algorithm/parameters/simple_ramp_threshold`
/// **Root:** Required
/// **Returns:** `true` if written successfully
pub fn set_simple_gpu_ramp_threshold(val: i32) -> bool {
    let path = "/sys/module/simple_gpu_algorithm/parameters/simple_ramp_threshold";
    if !sysfs::file_exists(path) { return false; }
    sysfs::chmod(path, "644"); let ok = sysfs::write_sysfs(path, &val.to_string()); sysfs::chmod(path, "444"); ok
}

// ==================== Bus DCVS (ZKM) ====================

/// Check if bus DCVS interface exists.
///
/// **Sysfs path:** `/sys/devices/system/cpu/bus_dcvs`
/// **Root:** Not required
/// **Returns:** `true` if bus DCVS is available
pub fn has_bus_dcvs() -> bool { sysfs::file_exists("/sys/devices/system/cpu/bus_dcvs") }

/// List available bus DCVS components (LLCC, DDR, GPU, CPU).
///
/// **Sysfs path:** `/sys/devices/system/cpu/bus_dcvs/*`
/// **Root:** Not required
/// **Returns:** Vec of component name strings
pub fn get_bus_dcvs_components() -> Vec<String> {
    let base = "/sys/devices/system/cpu/bus_dcvs";
    let mut components = Vec::new();
    for name in &["LLCC", "DDR", "GPU", "CPU"] {
        if sysfs::file_exists(&format!("{}/{}", base, name)) { components.push(name.to_string()); }
    }
    components
}

/// Get available frequencies for a bus DCVS component.
///
/// **Sysfs path:** `/sys/devices/system/cpu/bus_dcvs/*/available_frequencies`
/// **Root:** Not required
/// **Returns:** Vec of frequencies in kHz
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

/// Set min/max frequency for a bus DCVS component.
///
/// **Sysfs path:** `/sys/devices/system/cpu/bus_dcvs/*/min_freq`, `max_freq`
/// **Root:** Required
/// **Returns:** `true` if both limits written successfully
pub fn set_bus_dcvs_freq(bus_name: &str, min_freq: i32, max_freq: i32) -> bool {
    let base = "/sys/devices/system/cpu/bus_dcvs";
    sysfs::chmod(&format!("{}/{}/min_freq", base, bus_name), "644");
    sysfs::chmod(&format!("{}/{}/max_freq", base, bus_name), "644");
    sysfs::write_sysfs(&format!("{}/{}/min_freq", base, bus_name), "0");
    let r1 = sysfs::write_sysfs(&format!("{}/{}/max_freq", base, bus_name), &format!("{}", max_freq * 1000));
    let r2 = sysfs::write_sysfs(&format!("{}/{}/min_freq", base, bus_name), &format!("{}", min_freq * 1000));
    r1 && r2
}

// ==================== Adrenoboost (SmartPack) ====================

/// Read current adrenoboost level (SmartPack).
///
/// **Sysfs path:** `/sys/module/adrenoboost/parameters/adrenoboost`
/// **Root:** Not required
/// **Returns:** Boost level (0–2)
pub fn get_adrenoboost() -> i32 {
    sysfs::read_sysfs_int("/sys/module/adrenoboost/parameters/adrenoboost", 1000).unwrap_or(0) as i32
}

/// Set adrenoboost level (SmartPack), clamped to 0–2.
///
/// **Sysfs path:** `/sys/module/adrenoboost/parameters/adrenoboost`
/// **Root:** Required
/// **Returns:** `true` if written successfully
pub fn set_adrenoboost(val: i32) -> bool {
    let v = val.clamp(0, 2);
    let path = "/sys/module/adrenoboost/parameters/adrenoboost";
    sysfs::chmod(path, "644");
    let ok = sysfs::write_sysfs(path, &v.to_string());
    sysfs::chmod(path, "444"); ok
}

// ==================== Display Modes (SmartPack) ====================

/// Get available display modes from fb0.
///
/// **Sysfs path:** `/sys/devices/virtual/graphics/fb0/modes`
/// **Root:** Not required
/// **Returns:** Vec of display mode strings
pub fn get_display_modes() -> Vec<String> {
    match sysfs::read_sysfs_cached("/sys/devices/virtual/graphics/fb0/modes", 5000) {
        Some(s) => s.split_whitespace().map(|m| m.to_string()).collect(),
        None => Vec::new(),
    }
}

/// Set display mode via fb0.
///
/// **Sysfs path:** `/sys/devices/virtual/graphics/fb0/mode`
/// **Root:** Required
/// **Returns:** `true` if written successfully
pub fn set_display_mode(mode: &str) -> bool {
    sysfs::write_sysfs("/sys/devices/virtual/graphics/fb0/mode", mode)
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn test_gpu_vendor() {
        assert_eq!(get_gpu_vendor(), "Qualcomm");
    }

    #[test]
    fn test_gpu_model_default_nonexistent() {
        // On non-Android, sysfs paths don't exist so fallback is just "Adreno"
        let model = detect_adreno_model();
        assert!(!model.is_empty());
    }

    #[test]
    fn test_gpu_busy_stats_format() {
        let s = GpuBusyStats { busy: 50, total: 100 };
        assert_eq!(s.busy, 50);
        assert_eq!(s.total, 100);
    }

    #[test]
    fn test_gpu_format_paths() {
        let p = format!("/sys/class/kgsl/kgsl-3d0/{}", "gpuclk");
        assert_eq!(p, "/sys/class/kgsl/kgsl-3d0/gpuclk");
        let p = format!("/sys/class/kgsl/kgsl-3d0/{}", "bus_split");
        assert_eq!(p, "/sys/class/kgsl/kgsl-3d0/bus_split");
    }

    #[test]
    fn test_gpu_force_params_path() {
        let p = format!("/sys/class/kgsl/kgsl-3d0/{}", "throttling");
        assert_eq!(p, "/sys/class/kgsl/kgsl-3d0/throttling");
    }

    #[test]
    fn test_display_modes_path() {
        let p = "/sys/devices/virtual/graphics/fb0/modes";
        assert_eq!(p, "/sys/devices/virtual/graphics/fb0/modes");
    }

    #[test]
    fn test_bus_dcvs_format_paths() {
        for name in &["LLCC", "DDR", "GPU"] {
            let p = format!("/sys/devices/system/cpu/bus_dcvs/{}/min_freq", name);
            assert!(p.contains(name));
            assert!(p.ends_with("/min_freq"));
        }
    }

    #[test]
    fn test_reset_gpu_stats() {
        reset_gpu_stats();
        // After reset, should be able to read again without error
    }

    #[test]
    fn test_adreno_idler_paths() {
        assert_eq!(
            "/sys/module/adreno_idler/parameters/adreno_idler_active",
            "/sys/module/adreno_idler/parameters/adreno_idler_active"
        );
    }

    #[test]
    fn test_simple_gpu_algorithm_paths() {
        assert_eq!(
            "/sys/module/simple_gpu_algorithm/parameters/simple_gpu_activate",
            "/sys/module/simple_gpu_algorithm/parameters/simple_gpu_activate"
        );
    }
}
