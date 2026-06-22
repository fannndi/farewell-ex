use crate::sysfs;
use once_cell::sync::{Lazy, OnceCell};
use serde::{Deserialize, Serialize};
use std::collections::HashMap;
use std::sync::Mutex;

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

pub fn read_cpu_load() -> f32 {
    read_cpu_load_detailed().total_load
}

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

pub fn set_freq_limit(core: i32, min: i32, max: i32) -> bool {
    let min_path = format!("/sys/devices/system/cpu/cpu{}/cpufreq/scaling_min_freq", core);
    let max_path = format!("/sys/devices/system/cpu/cpu{}/cpufreq/scaling_max_freq", core);
    sysfs::chmod(&min_path, "644");
    sysfs::chmod(&max_path, "644");
    let r1 = sysfs::write_sysfs(&min_path, &format!("{}", min * 1000));
    let r2 = sysfs::write_sysfs(&max_path, &format!("{}", max * 1000));
    r1 && r2
}

pub fn set_core_online(core: i32, online: bool) -> bool {
    if core == 0 { return false; } // cpu0 cannot be offlined
    let path = format!("/sys/devices/system/cpu/cpu{}/online", core);
    sysfs::chmod(&path, "644");
    let ok = sysfs::write_sysfs(&path, if online { "1" } else { "0" });
    sysfs::chmod(&path, "444"); ok
}

pub fn get_available_governors(cpu: i32) -> Vec<String> {
    let path = format!("/sys/devices/system/cpu/cpu{}/cpufreq/scaling_available_governors", cpu);
    sysfs::read_sysfs_cached(&path, 0)
        .map(|c| c.split_whitespace().map(|s| s.to_string()).collect())
        .unwrap_or_default()
}

pub fn get_available_frequencies(cpu: i32) -> Vec<i32> {
    let path = format!("/sys/devices/system/cpu/cpu{}/cpufreq/scaling_available_frequencies", cpu);
    sysfs::read_sysfs_cached(&path, 0)
        .map(|c| c.split_whitespace().filter_map(|s| s.parse::<i64>().ok())
            .map(|hz| (hz / 1000) as i32).collect())
        .unwrap_or_default()
}

// ==================== Hard Limit (SmartPack) ====================

pub fn set_cpufreq_hardlimit_max(freq_khz: i64) -> bool {
    let path = "/sys/kernel/cpufreq_hardlimit/scaling_max_freq";
    if !sysfs::file_exists(path) { return false; }
    sysfs::chmod(path, "644");
    let ok = sysfs::write_sysfs(path, &freq_khz.to_string());
    sysfs::chmod(path, "444"); ok
}

pub fn set_cpufreq_hardlimit_min(freq_khz: i64) -> bool {
    let path = "/sys/kernel/cpufreq_hardlimit/scaling_min_freq";
    if !sysfs::file_exists(path) { return false; }
    sysfs::chmod(path, "644");
    let ok = sysfs::write_sysfs(path, &freq_khz.to_string());
    sysfs::chmod(path, "444"); ok
}

pub fn set_cpufreq_hardlimit_dvfs_lock(enabled: bool) -> bool {
    let path = "/sys/kernel/cpufreq_hardlimit/userspace_dvfs_lock";
    if !sysfs::file_exists(path) { return false; }
    sysfs::chmod(path, "644");
    let ok = sysfs::write_sysfs(path, if enabled { "1" } else { "0" });
    sysfs::chmod(path, "444"); ok
}

pub fn set_msm_cpufreq_limit(limit: i64) -> bool {
    let path = "/sys/kernel/msm_cpufreq_limit/cpufreq_limit";
    if !sysfs::file_exists(path) { return false; }
    sysfs::chmod(path, "644");
    let ok = sysfs::write_sysfs(path, &limit.to_string());
    sysfs::chmod(path, "444"); ok
}

// ==================== CPU Boost (SmartPack + RvKernel) ====================

pub fn set_input_boost_ms(ms: i32) -> bool {
    let path = "/sys/devices/system/cpu/cpu_boost/input_boost_ms";
    if !sysfs::file_exists(path) { return false; }
    sysfs::chmod(path, "644");
    let ok = sysfs::write_sysfs(path, &ms.to_string());
    sysfs::chmod(path, "444"); ok
}

pub fn set_sched_boost_on_input(boost: bool) -> bool {
    let path = "/sys/devices/system/cpu/cpu_boost/sched_boost_on_input";
    if !sysfs::file_exists(path) { return false; }
    sysfs::chmod(path, "644");
    let ok = sysfs::write_sysfs(path, if boost { "1" } else { "0" });
    sysfs::chmod(path, "444"); ok
}

// ==================== CPU EAS (AZenith) ====================

pub fn set_cpu_eas_enabled(enabled: bool) -> bool {
    let path = "/sys/devices/system/cpu/eas/enable";
    if !sysfs::file_exists(path) { return false; }
    sysfs::chmod(path, "644");
    let ok = sysfs::write_sysfs(path, if enabled { "1" } else { "0" });
    sysfs::chmod(path, "444"); ok
}

// ==================== CPU DCVS Disable (Encore) ====================

pub fn set_cpu_dcvs_disable(core: i32, disable: bool) -> bool {
    let path = format!("/sys/devices/system/cpu/cpu{}/core_ctrl/cpudcvs_disable", core);
    if !sysfs::file_exists(&path) { return false; }
    sysfs::chmod(&path, "644");
    let ok = sysfs::write_sysfs(&path, if disable { "1" } else { "0" });
    sysfs::chmod(&path, "444"); ok
}

// ==================== Devfreq Generic (QCOM CPU/MEM) ====================

pub fn get_devfreq_available_frequencies(device: &str) -> Vec<i64> {
    let content = sysfs::read_sysfs_cached(&format!("/sys/class/devfreq/{}/available_frequencies", device), 5000);
    match content {
        Some(s) => s.split_whitespace().filter_map(|v| v.parse::<i64>().ok()).collect(),
        None => Vec::new(),
    }
}

pub fn get_devfreq_cur_freq(device: &str) -> i64 {
    sysfs::read_sysfs_int(&format!("/sys/class/devfreq/{}/cur_freq", device), 200).unwrap_or(0)
}

pub fn set_devfreq_min_freq(device: &str, freq: i64) -> bool {
    sysfs::write_sysfs(&format!("/sys/class/devfreq/{}/min_freq", device), &freq.to_string())
}

pub fn set_devfreq_max_freq(device: &str, freq: i64) -> bool {
    sysfs::write_sysfs(&format!("/sys/class/devfreq/{}/max_freq", device), &freq.to_string())
}

pub fn get_devfreq_governor(device: &str) -> String {
    sysfs::read_sysfs_cached(&format!("/sys/class/devfreq/{}/governor", device), 1000).unwrap_or_default()
}

pub fn set_devfreq_governor(device: &str, gov: &str) -> bool {
    sysfs::write_sysfs(&format!("/sys/class/devfreq/{}/governor", device), gov)
}

// QCOM SM7150-specific devfreq devices
pub const QCOM_DEVICES: &[&str] = &[
    "soc:qcom,cpubw",
    "soc:qcom,memlat-cpu0",
    "soc:qcom,memlat-cpu6",
];

pub fn get_qcom_devfreq_devices() -> Vec<String> {
    QCOM_DEVICES.iter().filter(|d| sysfs::file_exists(&format!("/sys/class/devfreq/{}", d))).map(|s| s.to_string()).collect()
}
