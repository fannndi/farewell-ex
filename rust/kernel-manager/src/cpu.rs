use crate::sysfs;
use once_cell::sync::{Lazy, OnceCell};
use serde::{Deserialize, Serialize};
use std::collections::HashMap;
use std::sync::Mutex;

/// Represents a CPU frequency cluster with shared min/max frequencies.
#[derive(Debug, Clone, Serialize, Deserialize)]
pub struct CpuCluster {
    pub cluster_number: i32,
    pub cores: Vec<i32>,
    pub max_freq: i32,
    pub min_freq: i32,
    #[serde(rename = "current_min_freq")]
    pub cur_min_freq: i32,
    #[serde(rename = "current_max_freq")]
    pub cur_max_freq: i32,
    pub governor: String,
    pub available_governors: Vec<String>,
    pub policy_path: String,
    pub available_frequencies: Vec<i32>,
}

/// Per-core CPU information (online status, frequency, governor).
#[derive(Debug, Clone, Serialize, Deserialize)]
pub struct CoreInfo {
    #[serde(rename = "core")]
    pub core_number: i32,
    pub online: bool,
    #[serde(rename = "freq")]
    pub current_freq: i32,
    pub min_freq: i32,
    pub max_freq: i32,
    pub governor: String,
}

/// CPU load data including per-core breakdown.
#[derive(Debug, Clone, Serialize, Deserialize)]
pub struct CpuLoadInfo {
    pub total_load: f32,
    pub per_core_load: Vec<f32>,
}

struct CpuStats {
    total_time: Vec<u64>,
    idle_time: Vec<u64>,
}

static CPU_STATS: Lazy<Mutex<CpuStats>> = Lazy::new(|| {
    Mutex::new(CpuStats {
        total_time: vec![0; 16],
        idle_time: vec![0; 16],
    })
});

static CPU_MODEL: OnceCell<String> = OnceCell::new();

/// Detect and enumerate CPU frequency clusters from sysfs.
///
/// **Sysfs path:** `/sys/devices/system/cpu/cpu*/cpufreq/`
/// **Root:** Not required
/// **Returns:** Vec of `CpuCluster` sorted by min frequency
pub fn detect_cpu_clusters() -> Vec<CpuCluster> {
    let mut clusters: HashMap<(i32, i32), Vec<i32>> = HashMap::new();

    for cpu in 0..16 {
        let min_path = format!("/sys/devices/system/cpu/cpu{}/cpufreq/scaling_min_freq", cpu);
        if !sysfs::file_exists(&min_path) { break; }

        let min_freq = sysfs::read_sysfs_int(&min_path, 1000).unwrap_or(0) as i32;
        let max_path = format!("/sys/devices/system/cpu/cpu{}/cpufreq/scaling_max_freq", cpu);
        let max_freq = sysfs::read_sysfs_int(&max_path, 1000).unwrap_or(0) as i32;

        if min_freq > 0 && max_freq > 0 {
            clusters.entry((min_freq, max_freq)).or_default().push(cpu);
        }
    }

    let mut result: Vec<CpuCluster> = clusters.into_iter().enumerate()
        .map(|(idx, ((min, max), cores))| {
            let first = cores[0];
            let governor_path = format!("/sys/devices/system/cpu/cpu{}/cpufreq/scaling_governor", first);
            let governor = sysfs::read_sysfs_cached(&governor_path, 1000)
                .unwrap_or_else(|| "unknown".to_string());
            let available_governors = get_available_governors(first);
            let available_freqs = get_available_frequencies(first);

            let cur_min = sysfs::read_sysfs_int(
                &format!("/sys/devices/system/cpu/cpu{}/cpufreq/scaling_min_freq", first), 1000
            ).unwrap_or(min) as i32;
            let cur_max = sysfs::read_sysfs_int(
                &format!("/sys/devices/system/cpu/cpu{}/cpufreq/scaling_max_freq", first), 1000
            ).unwrap_or(max) as i32;

            CpuCluster {
                cluster_number: idx as i32,
                cores,
                min_freq: min,
                max_freq: max,
                cur_min_freq: cur_min,
                cur_max_freq: cur_max,
                governor,
                available_governors,
                policy_path: format!("/sys/devices/system/cpu/cpu{}/cpufreq", first),
                available_frequencies: available_freqs,
            }
        }).collect();

    result.sort_by_key(|c| c.min_freq);
    for (idx, cluster) in result.iter_mut().enumerate() {
        cluster.cluster_number = idx as i32;
    }
    result
}

/// Read per-core CPU data as JSON string.
///
/// **Sysfs path:** `/sys/devices/system/cpu/cpu*/`
/// **Root:** Not required
/// **Returns:** JSON array of `CoreInfo`
pub fn read_core_data() -> String {
    let mut cores = Vec::new();
    for cpu in 0..16 {
        let online_path = format!("/sys/devices/system/cpu/cpu{}/online", cpu);
        let online = if cpu == 0 { true }
        else { sysfs::read_sysfs_int(&online_path, 100).unwrap_or(0) == 1 };

        let freq_path = format!("/sys/devices/system/cpu/cpu{}/cpufreq/scaling_cur_freq", cpu);
        if !online && !sysfs::file_exists(&freq_path) { break; }

        let current_freq = if online {
            sysfs::read_sysfs_int(&freq_path, 100).unwrap_or(0) as i32
        } else { 0 };

        cores.push(CoreInfo {
            core_number: cpu,
            online,
            current_freq,
            min_freq: sysfs::read_sysfs_int(
                &format!("/sys/devices/system/cpu/cpu{}/cpufreq/scaling_min_freq", cpu), 1000
            ).unwrap_or(0) as i32,
            max_freq: sysfs::read_sysfs_int(
                &format!("/sys/devices/system/cpu/cpu{}/cpufreq/scaling_max_freq", cpu), 1000
            ).unwrap_or(0) as i32,
            governor: sysfs::read_sysfs_cached(
                &format!("/sys/devices/system/cpu/cpu{}/cpufreq/scaling_governor", cpu), 1000
            ).unwrap_or_else(|| "unknown".to_string()),
        });
    }
    serde_json::to_string(&cores).unwrap_or_else(|_| "[]".to_string())
}

/// Read total CPU load percentage.
///
/// **Sysfs path:** `/proc/stat`
/// **Root:** Not required
/// **Returns:** Average load across all cores (0.0–100.0)
pub fn read_cpu_load() -> f32 {
    read_cpu_load_detailed().total_load
}

/// Read per-core and total CPU load.
///
/// **Sysfs path:** `/proc/stat`
/// **Root:** Not required
/// **Returns:** `CpuLoadInfo` with total and per-core loads
pub fn read_cpu_load_detailed() -> CpuLoadInfo {
    let mut buf = [0u8; 4096];
    if let Some(bytes_read) = sysfs::read_file_buf("/proc/stat", &mut buf) {
        if let Ok(content) = std::str::from_utf8(&buf[..bytes_read]) {
            let mut per_core_load = Vec::new();
            let mut total_load = 0.0f32;
            let mut cpu_index = 0;
            let mut stats = CPU_STATS.lock().unwrap();

            for line in content.lines() {
                if !line.starts_with("cpu") || line.starts_with("cpu ") { continue; }
                let parts: Vec<&str> = line.split_whitespace().collect();
                if parts.len() >= 5 {
                    let user: u64 = parts[1].parse().unwrap_or(0);
                    let nice: u64 = parts[2].parse().unwrap_or(0);
                    let system: u64 = parts[3].parse().unwrap_or(0);
                    let idle: u64 = parts[4].parse().unwrap_or(0);
                    let total = user + nice + system + idle;

                    let load = if cpu_index < stats.total_time.len() {
                        let dt = total.saturating_sub(stats.total_time[cpu_index]);
                        let di = idle.saturating_sub(stats.idle_time[cpu_index]);
                        if dt > 0 { 100.0 - (di as f32 / dt as f32 * 100.0) } else { 0.0 }
                    } else { 0.0 };

                    per_core_load.push(load.clamp(0.0, 100.0));
                    if cpu_index < stats.total_time.len() {
                        stats.total_time[cpu_index] = total;
                        stats.idle_time[cpu_index] = idle;
                    } else {
                        stats.total_time.push(total);
                        stats.idle_time.push(idle);
                    }
                    cpu_index += 1;
                }
            }
            if !per_core_load.is_empty() {
                total_load = per_core_load.iter().sum::<f32>() / per_core_load.len() as f32;
            }
            return CpuLoadInfo { total_load, per_core_load };
        }
    }
    CpuLoadInfo { total_load: 0.0, per_core_load: Vec::new() }
}

/// Read temperature of a specific CPU core.
///
/// **Sysfs path:** `/sys/class/hwmon/hwmon1/temp*_input` or `/sys/devices/virtual/thermal/thermal_zone*/temp`
/// **Root:** Not required
/// **Returns:** Temperature in °C, or 0.0 if unavailable
pub fn read_core_temperature(core: i32) -> f32 {
    let paths = [
        format!("/sys/class/hwmon/hwmon1/temp{}_input", core + 1),
        format!("/sys/devices/virtual/thermal/thermal_zone{}/temp", core),
    ];
    for path in &paths {
        if let Some(temp) = sysfs::read_sysfs_float(path, 500) {
            let temp_c = if temp > 1000.0 { temp / 1000.0 } else { temp };
            if temp_c > 0.0 && temp_c < 150.0 { return temp_c; }
        }
    }
    0.0
}

/// Get CPU model name from `/proc/cpuinfo`.
///
/// **Sysfs path:** `/proc/cpuinfo`
/// **Root:** Not required
/// **Returns:** CPU model string (cached after first call)
pub fn get_cpu_model() -> String {
    CPU_MODEL.get_or_init(|| {
        let mut buf = [0u8; 2048];
        if let Some(bytes_read) = sysfs::read_file_buf("/proc/cpuinfo", &mut buf) {
            if let Ok(content) = std::str::from_utf8(&buf[..bytes_read]) {
                for line in content.lines() {
                    if line.starts_with("Hardware") || line.starts_with("Processor") {
                        if let Some(model) = line.split(':').nth(1) {
                            return model.trim().to_string();
                        }
                    }
                }
            }
        }
        "Unknown".to_string()
    }).clone()
}

/// Set CPU governor across all clusters.
///
/// **Sysfs path:** `/sys/devices/system/cpu/cpu*/cpufreq/scaling_governor`
/// **Root:** Required
/// **Returns:** `true` if all cores updated successfully
///
/// Example:
/// ```
/// cpu::set_governor("performance");
/// ```
pub fn set_governor(governor: &str) -> bool {
    let clusters = detect_cpu_clusters();
    let mut all_ok = true;
    for cluster in &clusters {
        for core in &cluster.cores {
            let path = format!("/sys/devices/system/cpu/cpu{}/cpufreq/scaling_governor", core);
            sysfs::chmod(&path, "644");
            if !sysfs::write_sysfs(&path, governor) { all_ok = false; }
        }
    }
    all_ok
}

/// Set min/max frequency limits for a specific CPU core.
///
/// **Sysfs path:** `/sys/devices/system/cpu/cpu*/cpufreq/scaling_min_freq`, `scaling_max_freq`
/// **Root:** Required
/// **Returns:** `true` if both limits written successfully
pub fn set_freq_limit(core: i32, min: i32, max: i32) -> bool {
    let min_path = format!("/sys/devices/system/cpu/cpu{}/cpufreq/scaling_min_freq", core);
    let max_path = format!("/sys/devices/system/cpu/cpu{}/cpufreq/scaling_max_freq", core);
    sysfs::chmod(&min_path, "644");
    sysfs::chmod(&max_path, "644");
    let r1 = sysfs::write_sysfs(&min_path, &format!("{}", min * 1000));
    let r2 = sysfs::write_sysfs(&max_path, &format!("{}", max * 1000));
    r1 && r2
}

/// Bring a CPU core online or offline (core 0 cannot be offlined).
///
/// **Sysfs path:** `/sys/devices/system/cpu/cpu*/online`
/// **Root:** Required
/// **Returns:** `true` if the core state was changed
pub fn set_core_online(core: i32, online: bool) -> bool {
    if core == 0 { return false; } // cpu0 cannot be offlined
    let path = format!("/sys/devices/system/cpu/cpu{}/online", core);
    sysfs::chmod(&path, "644");
    let ok = sysfs::write_sysfs(&path, if online { "1" } else { "0" });
    sysfs::chmod(&path, "444"); ok
}

/// Get available CPU governors for a specific core.
///
/// **Sysfs path:** `/sys/devices/system/cpu/cpu*/cpufreq/scaling_available_governors`
/// **Root:** Not required
/// **Returns:** Vec of governor name strings
pub fn get_available_governors(cpu: i32) -> Vec<String> {
    let path = format!("/sys/devices/system/cpu/cpu{}/cpufreq/scaling_available_governors", cpu);
    sysfs::read_sysfs_cached(&path, 0)
        .map(|c| c.split_whitespace().map(|s| s.to_string()).collect())
        .unwrap_or_default()
}

/// Get available frequencies for a specific CPU core.
///
/// **Sysfs path:** `/sys/devices/system/cpu/cpu*/cpufreq/scaling_available_frequencies`
/// **Root:** Not required
/// **Returns:** Vec of frequencies in MHz
pub fn get_available_frequencies(cpu: i32) -> Vec<i32> {
    let path = format!("/sys/devices/system/cpu/cpu{}/cpufreq/scaling_available_frequencies", cpu);
    sysfs::read_sysfs_cached(&path, 0)
        .map(|c| c.split_whitespace().filter_map(|s| s.parse::<i64>().ok())
            .map(|hz| (hz / 1000) as i32).collect())
        .unwrap_or_default()
}

// ==================== Hard Limit (SmartPack) ====================

/// Set SmartPack CPU frequency hard-limit maximum.
///
/// **Sysfs path:** `/sys/kernel/cpufreq_hardlimit/scaling_max_freq`
/// **Root:** Required
/// **Returns:** `true` if written successfully
pub fn set_cpufreq_hardlimit_max(freq_khz: i64) -> bool {
    let path = "/sys/kernel/cpufreq_hardlimit/scaling_max_freq";
    if !sysfs::file_exists(path) { return false; }
    sysfs::chmod(path, "644");
    let ok = sysfs::write_sysfs(path, &freq_khz.to_string());
    sysfs::chmod(path, "444"); ok
}

/// Set SmartPack CPU frequency hard-limit minimum.
///
/// **Sysfs path:** `/sys/kernel/cpufreq_hardlimit/scaling_min_freq`
/// **Root:** Required
/// **Returns:** `true` if written successfully
pub fn set_cpufreq_hardlimit_min(freq_khz: i64) -> bool {
    let path = "/sys/kernel/cpufreq_hardlimit/scaling_min_freq";
    if !sysfs::file_exists(path) { return false; }
    sysfs::chmod(path, "644");
    let ok = sysfs::write_sysfs(path, &freq_khz.to_string());
    sysfs::chmod(path, "444"); ok
}

/// Toggle SmartPack userspace DVFS lock.
///
/// **Sysfs path:** `/sys/kernel/cpufreq_hardlimit/userspace_dvfs_lock`
/// **Root:** Required
/// **Returns:** `true` if written successfully
pub fn set_cpufreq_hardlimit_dvfs_lock(enabled: bool) -> bool {
    let path = "/sys/kernel/cpufreq_hardlimit/userspace_dvfs_lock";
    if !sysfs::file_exists(path) { return false; }
    sysfs::chmod(path, "644");
    let ok = sysfs::write_sysfs(path, if enabled { "1" } else { "0" });
    sysfs::chmod(path, "444"); ok
}

/// Set MSM CPU frequency limit (SmartPack).
///
/// **Sysfs path:** `/sys/kernel/msm_cpufreq_limit/cpufreq_limit`
/// **Root:** Required
/// **Returns:** `true` if written successfully
pub fn set_msm_cpufreq_limit(limit: i64) -> bool {
    let path = "/sys/kernel/msm_cpufreq_limit/cpufreq_limit";
    if !sysfs::file_exists(path) { return false; }
    sysfs::chmod(path, "644");
    let ok = sysfs::write_sysfs(path, &limit.to_string());
    sysfs::chmod(path, "444"); ok
}

// ==================== CPU Boost (SmartPack + RvKernel) ====================

/// Set CPU input boost duration in milliseconds.
///
/// **Sysfs path:** `/sys/devices/system/cpu/cpu_boost/input_boost_ms`
/// **Root:** Required
/// **Returns:** `true` if written successfully
pub fn set_input_boost_ms(ms: i32) -> bool {
    let path = "/sys/devices/system/cpu/cpu_boost/input_boost_ms";
    if !sysfs::file_exists(path) { return false; }
    sysfs::chmod(path, "644");
    let ok = sysfs::write_sysfs(path, &ms.to_string());
    sysfs::chmod(path, "444"); ok
}

/// Toggle scheduler boost on input event.
///
/// **Sysfs path:** `/sys/devices/system/cpu/cpu_boost/sched_boost_on_input`
/// **Root:** Required
/// **Returns:** `true` if written successfully
pub fn set_sched_boost_on_input(boost: bool) -> bool {
    let path = "/sys/devices/system/cpu/cpu_boost/sched_boost_on_input";
    if !sysfs::file_exists(path) { return false; }
    sysfs::chmod(path, "644");
    let ok = sysfs::write_sysfs(path, if boost { "1" } else { "0" });
    sysfs::chmod(path, "444"); ok
}

// ==================== CPU EAS (AZenith) ====================

/// Toggle CPU Energy-Aware Scheduling (AZenith).
///
/// **Sysfs path:** `/sys/devices/system/cpu/eas/enable`
/// **Root:** Required
/// **Returns:** `true` if written successfully
pub fn set_cpu_eas_enabled(enabled: bool) -> bool {
    let path = "/sys/devices/system/cpu/eas/enable";
    if !sysfs::file_exists(path) { return false; }
    sysfs::chmod(path, "644");
    let ok = sysfs::write_sysfs(path, if enabled { "1" } else { "0" });
    sysfs::chmod(path, "444"); ok
}

// ==================== CPU DCVS Disable (Encore) ====================

/// Disable CPU DCVS for a specific core (Encore).
///
/// **Sysfs path:** `/sys/devices/system/cpu/cpu*/core_ctrl/cpudcvs_disable`
/// **Root:** Required
/// **Returns:** `true` if written successfully
pub fn set_cpu_dcvs_disable(core: i32, disable: bool) -> bool {
    let path = format!("/sys/devices/system/cpu/cpu{}/core_ctrl/cpudcvs_disable", core);
    if !sysfs::file_exists(&path) { return false; }
    sysfs::chmod(&path, "644");
    let ok = sysfs::write_sysfs(&path, if disable { "1" } else { "0" });
    sysfs::chmod(&path, "444"); ok
}

// ==================== Devfreq Generic (QCOM CPU/MEM) ====================

/// Get available devfreq frequencies for a device (CPU/MEM bus).
///
/// **Sysfs path:** `/sys/class/devfreq/*/available_frequencies`
/// **Root:** Not required
/// **Returns:** Vec of available frequencies in Hz
pub fn get_devfreq_available_frequencies(device: &str) -> Vec<i64> {
    let content = sysfs::read_sysfs_cached(&format!("/sys/class/devfreq/{}/available_frequencies", device), 5000);
    match content {
        Some(s) => s.split_whitespace().filter_map(|v| v.parse::<i64>().ok()).collect(),
        None => Vec::new(),
    }
}

/// Get current devfreq frequency for a device.
///
/// **Sysfs path:** `/sys/class/devfreq/*/cur_freq`
/// **Root:** Not required
/// **Returns:** Current frequency in Hz
pub fn get_devfreq_cur_freq(device: &str) -> i64 {
    sysfs::read_sysfs_int(&format!("/sys/class/devfreq/{}/cur_freq", device), 200).unwrap_or(0)
}

/// Set minimum devfreq frequency for a device.
///
/// **Sysfs path:** `/sys/class/devfreq/*/min_freq`
/// **Root:** Required
/// **Returns:** `true` if written successfully
pub fn set_devfreq_min_freq(device: &str, freq: i64) -> bool {
    sysfs::write_sysfs(&format!("/sys/class/devfreq/{}/min_freq", device), &freq.to_string())
}

/// Set maximum devfreq frequency for a device.
///
/// **Sysfs path:** `/sys/class/devfreq/*/max_freq`
/// **Root:** Required
/// **Returns:** `true` if written successfully
pub fn set_devfreq_max_freq(device: &str, freq: i64) -> bool {
    sysfs::write_sysfs(&format!("/sys/class/devfreq/{}/max_freq", device), &freq.to_string())
}

/// Get current devfreq governor for a device.
///
/// **Sysfs path:** `/sys/class/devfreq/*/governor`
/// **Root:** Not required
/// **Returns:** Governor name string
pub fn get_devfreq_governor(device: &str) -> String {
    sysfs::read_sysfs_cached(&format!("/sys/class/devfreq/{}/governor", device), 1000).unwrap_or_default()
}

/// Set devfreq governor for a device.
///
/// **Sysfs path:** `/sys/class/devfreq/*/governor`
/// **Root:** Required
/// **Returns:** `true` if written successfully
pub fn set_devfreq_governor(device: &str, gov: &str) -> bool {
    sysfs::write_sysfs(&format!("/sys/class/devfreq/{}/governor", device), gov)
}

// QCOM SM7150-specific devfreq devices
pub const QCOM_DEVICES: &[&str] = &[
    "soc:qcom,cpubw",
    "soc:qcom,memlat-cpu0",
    "soc:qcom,memlat-cpu6",
];

/// List available QCOM SM7150 devfreq devices.
///
/// **Sysfs path:** `/sys/class/devfreq/soc:qcom,*`
/// **Root:** Not required
/// **Returns:** Vec of available device name strings
pub fn get_qcom_devfreq_devices() -> Vec<String> {
    QCOM_DEVICES.iter().filter(|d| sysfs::file_exists(&format!("/sys/class/devfreq/{}", d))).map(|s| s.to_string()).collect()
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn test_cpu_cluster_roundtrip() {
        let c = CpuCluster {
            cluster_number: 0, cores: vec![0, 1, 2, 3],
            max_freq: 2400000, min_freq: 300000,
            cur_min_freq: 300000, cur_max_freq: 2400000,
            governor: "schedutil".into(),
            available_governors: vec!["schedutil".into(), "performance".into()],
            policy_path: "/sys/devices/system/cpu/cpu0/cpufreq".into(),
            available_frequencies: vec![300, 600, 1200, 2400],
        };
        let json = serde_json::to_string(&c).unwrap();
        let d: CpuCluster = serde_json::from_str(&json).unwrap();
        assert_eq!(d.cluster_number, 0);
        assert_eq!(d.cores.len(), 4);
        assert_eq!(d.governor, "schedutil");
        assert!(json.contains("current_min_freq"));
        assert!(json.contains("current_max_freq"));
    }

    #[test]
    fn test_core_info_roundtrip() {
        let c = CoreInfo { core_number: 3, online: true, current_freq: 1800000, min_freq: 300000, max_freq: 2400000, governor: "performance".into() };
        let json = serde_json::to_string(&c).unwrap();
        let d: CoreInfo = serde_json::from_str(&json).unwrap();
        assert_eq!(d.core_number, 3);
        assert!(d.online);
        assert!(json.contains("\"core\":3"));
        assert!(json.contains("\"freq\":1800000"));
    }

    #[test]
    fn test_cpu_load_info_roundtrip() {
        let l = CpuLoadInfo { total_load: 42.5, per_core_load: vec![35.0, 50.0] };
        let json = serde_json::to_string(&l).unwrap();
        let d: CpuLoadInfo = serde_json::from_str(&json).unwrap();
        assert!((d.total_load - 42.5).abs() < f32::EPSILON);
        assert_eq!(d.per_core_load.len(), 2);
    }

    #[test]
    fn test_cpu_cluster_empty_fields() {
        let c = CpuCluster {
            cluster_number: 0, cores: vec![],
            max_freq: 0, min_freq: 0,
            cur_min_freq: 0, cur_max_freq: 0,
            governor: String::new(),
            available_governors: vec![],
            policy_path: String::new(),
            available_frequencies: vec![],
        };
        let json = serde_json::to_string(&c).unwrap();
        let d: CpuCluster = serde_json::from_str(&json).unwrap();
        assert!(d.cores.is_empty());
        assert!(d.governor.is_empty());
    }

    #[test]
    fn test_cpu_format_paths() {
        for cpu in 0..4 {
            let p = format!("/sys/devices/system/cpu/cpu{}/cpufreq/scaling_cur_freq", cpu);
            assert!(p.contains(&format!("cpu{}", cpu)));
        }
    }

    #[test]
    fn test_qcom_devices_const() {
        assert!(QCOM_DEVICES.contains(&"soc:qcom,cpubw"));
    }

    #[test]
    fn test_core_online_cpu0_rejected() {
        assert!(!set_core_online(0, false));
    }
}
