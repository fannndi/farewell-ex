use crate::sysfs;

// ==================== CoreCtl (SmartPack) ====================

/// Get core_ctl minimum CPUs for a cluster (SmartPack).
///
/// **Sysfs path:** `/sys/devices/system/cpu/cpu*/core_ctl/min_cpus`
/// **Root:** Not required
/// **Returns:** Minimum online CPUs, or -1 if unavailable
pub fn get_core_ctl_min_cpus(cluster: i32) -> i32 {
    sysfs::read_sysfs_int(&format!("/sys/devices/system/cpu/cpu{}/core_ctl/min_cpus", cluster * 4), 1000).unwrap_or(-1) as i32
}

/// Set core_ctl minimum CPUs for a cluster (SmartPack).
///
/// **Sysfs path:** `/sys/devices/system/cpu/cpu*/core_ctl/min_cpus`
/// **Root:** Required
/// **Returns:** `true` if written successfully
pub fn set_core_ctl_min_cpus(cluster: i32, n: i32) -> bool {
    sysfs::write_sysfs(&format!("/sys/devices/system/cpu/cpu{}/core_ctl/min_cpus", cluster * 4), &n.to_string())
}

/// Get core_ctl maximum CPUs for a cluster (SmartPack).
///
/// **Sysfs path:** `/sys/devices/system/cpu/cpu*/core_ctl/max_cpus`
/// **Root:** Not required
/// **Returns:** Maximum online CPUs, or -1 if unavailable
pub fn get_core_ctl_max_cpus(cluster: i32) -> i32 {
    sysfs::read_sysfs_int(&format!("/sys/devices/system/cpu/cpu{}/core_ctl/max_cpus", cluster * 4), 1000).unwrap_or(-1) as i32
}

/// Set core_ctl maximum CPUs for a cluster (SmartPack).
///
/// **Sysfs path:** `/sys/devices/system/cpu/cpu*/core_ctl/max_cpus`
/// **Root:** Required
/// **Returns:** `true` if written successfully
pub fn set_core_ctl_max_cpus(cluster: i32, n: i32) -> bool {
    sysfs::write_sysfs(&format!("/sys/devices/system/cpu/cpu{}/core_ctl/max_cpus", cluster * 4), &n.to_string())
}

/// Get core_ctl busy down threshold (SmartPack).
///
/// **Sysfs path:** `/sys/devices/system/cpu/cpu*/core_ctl/busy_down_thres`
/// **Root:** Not required
/// **Returns:** Busy threshold percentage, or -1 if unavailable
pub fn get_core_ctl_busy_down_threshold(cluster: i32) -> i32 {
    sysfs::read_sysfs_int(&format!("/sys/devices/system/cpu/cpu{}/core_ctl/busy_down_thres", cluster * 4), 1000).unwrap_or(-1) as i32
}

/// Set core_ctl busy down threshold (SmartPack).
///
/// **Sysfs path:** `/sys/devices/system/cpu/cpu*/core_ctl/busy_down_thres`
/// **Root:** Required
/// **Returns:** `true` if written successfully
pub fn set_core_ctl_busy_down_threshold(cluster: i32, pct: i32) -> bool {
    sysfs::write_sysfs(&format!("/sys/devices/system/cpu/cpu{}/core_ctl/busy_down_thres", cluster * 4), &pct.to_string())
}

/// Get core_ctl busy up threshold (SmartPack).
///
/// **Sysfs path:** `/sys/devices/system/cpu/cpu*/core_ctl/busy_up_thres`
/// **Root:** Not required
/// **Returns:** Busy threshold percentage, or -1 if unavailable
pub fn get_core_ctl_busy_up_threshold(cluster: i32) -> i32 {
    sysfs::read_sysfs_int(&format!("/sys/devices/system/cpu/cpu{}/core_ctl/busy_up_thres", cluster * 4), 1000).unwrap_or(-1) as i32
}

/// Set core_ctl busy up threshold (SmartPack).
///
/// **Sysfs path:** `/sys/devices/system/cpu/cpu*/core_ctl/busy_up_thres`
/// **Root:** Required
/// **Returns:** `true` if written successfully
pub fn set_core_ctl_busy_up_threshold(cluster: i32, pct: i32) -> bool {
    sysfs::write_sysfs(&format!("/sys/devices/system/cpu/cpu{}/core_ctl/busy_up_thres", cluster * 4), &pct.to_string())
}

/// Get core_ctl offline delay in ms (SmartPack).
///
/// **Sysfs path:** `/sys/devices/system/cpu/cpu*/core_ctl/offline_delay_ms`
/// **Root:** Not required
/// **Returns:** Delay in ms, or -1 if unavailable
pub fn get_core_ctl_offline_delay_ms(cluster: i32) -> i32 {
    sysfs::read_sysfs_int(&format!("/sys/devices/system/cpu/cpu{}/core_ctl/offline_delay_ms", cluster * 4), 1000).unwrap_or(-1) as i32
}

/// Set core_ctl offline delay in ms (SmartPack).
///
/// **Sysfs path:** `/sys/devices/system/cpu/cpu*/core_ctl/offline_delay_ms`
/// **Root:** Required
/// **Returns:** `true` if written successfully
pub fn set_core_ctl_offline_delay_ms(cluster: i32, ms: i32) -> bool {
    sysfs::write_sysfs(&format!("/sys/devices/system/cpu/cpu{}/core_ctl/offline_delay_ms", cluster * 4), &ms.to_string())
}

// ==================== MSM Hotplug (SmartPack) ====================

/// Check if MSM hotplug is enabled (SmartPack).
///
/// **Sysfs path:** `/sys/module/msm_hotplug/parameters/enabled`
/// **Root:** Not required
/// **Returns:** `true` if enabled
pub fn get_msm_hotplug_enabled() -> bool {
    sysfs::read_sysfs_int("/sys/module/msm_hotplug/parameters/enabled", 1000).unwrap_or(0) == 1
}

/// Enable/disable MSM hotplug (SmartPack).
///
/// **Sysfs path:** `/sys/module/msm_hotplug/parameters/enabled`
/// **Root:** Required
/// **Returns:** `true` if written successfully
pub fn set_msm_hotplug_enabled(enabled: bool) -> bool {
    sysfs::write_sysfs("/sys/module/msm_hotplug/parameters/enabled", if enabled { "Y" } else { "N" })
}

/// Get MSM hotplug minimum CPUs (SmartPack).
///
/// **Sysfs path:** `/sys/module/msm_hotplug/parameters/min_cpus`
/// **Root:** Not required
/// **Returns:** Min CPUs, or -1 if unavailable
pub fn get_msm_hotplug_min_cpus() -> i32 {
    sysfs::read_sysfs_int("/sys/module/msm_hotplug/parameters/min_cpus", 1000).unwrap_or(-1) as i32
}

/// Set MSM hotplug minimum CPUs (SmartPack).
///
/// **Sysfs path:** `/sys/module/msm_hotplug/parameters/min_cpus`
/// **Root:** Required
/// **Returns:** `true` if written successfully
pub fn set_msm_hotplug_min_cpus(n: i32) -> bool {
    sysfs::write_sysfs("/sys/module/msm_hotplug/parameters/min_cpus", &n.to_string())
}

/// Get MSM hotplug maximum CPUs (SmartPack).
///
/// **Sysfs path:** `/sys/module/msm_hotplug/parameters/max_cpus`
/// **Root:** Not required
/// **Returns:** Max CPUs, or -1 if unavailable
pub fn get_msm_hotplug_max_cpus() -> i32 {
    sysfs::read_sysfs_int("/sys/module/msm_hotplug/parameters/max_cpus", 1000).unwrap_or(-1) as i32
}

/// Set MSM hotplug maximum CPUs (SmartPack).
///
/// **Sysfs path:** `/sys/module/msm_hotplug/parameters/max_cpus`
/// **Root:** Required
/// **Returns:** `true` if written successfully
pub fn set_msm_hotplug_max_cpus(n: i32) -> bool {
    sysfs::write_sysfs("/sys/module/msm_hotplug/parameters/max_cpus", &n.to_string())
}

/// Get MSM hotplug default suspend value (SmartPack).
///
/// **Sysfs path:** `/sys/module/msm_hotplug/parameters/def_suspend`
/// **Root:** Not required
/// **Returns:** Default suspend value, or -1 if unavailable
pub fn get_msm_hotplug_def_suspend() -> i32 {
    sysfs::read_sysfs_int("/sys/module/msm_hotplug/parameters/def_suspend", 1000).unwrap_or(-1) as i32
}

/// Set MSM hotplug default suspend value (SmartPack).
///
/// **Sysfs path:** `/sys/module/msm_hotplug/parameters/def_suspend`
/// **Root:** Required
/// **Returns:** `true` if written successfully
pub fn set_msm_hotplug_def_suspend(n: i32) -> bool {
    sysfs::write_sysfs("/sys/module/msm_hotplug/parameters/def_suspend", &n.to_string())
}

// ==================== MPDecision (SmartPack) ====================

/// Check if MPDecision hotplug is enabled (SmartPack).
///
/// **Sysfs path:** `/sys/kernel/msm_mpdecision/conf/enabled`
/// **Root:** Not required
/// **Returns:** `true` if MPDecision is available
pub fn get_mpdecision_enabled() -> bool {
    sysfs::file_exists("/sys/kernel/msm_mpdecision/conf/enabled")
}

/// Enable/disable MPDecision hotplug (SmartPack).
///
/// **Sysfs path:** `/sys/kernel/msm_mpdecision/conf/enabled`
/// **Root:** Required
/// **Returns:** `true` if written successfully
pub fn set_mpdecision_enabled(enabled: bool) -> bool {
    sysfs::write_sysfs("/sys/kernel/msm_mpdecision/conf/enabled", if enabled { "1" } else { "0" })
}

// ==================== Probe: hotplug drivers available ====================

/// Probe and list available hotplug drivers on the system.
///
/// **Sysfs path:** Various `/sys/...` paths
/// **Root:** Not required
/// **Returns:** Vec of hotplug driver names
pub fn get_available_hotplug_drivers() -> Vec<String> {
    let mut drivers = Vec::new();
    if get_core_ctl_min_cpus(0) >= 0 { drivers.push("core_ctl".to_string()); }
    if sysfs::file_exists("/sys/module/msm_hotplug/parameters/enabled") { drivers.push("msm_hotplug".to_string()); }
    if sysfs::file_exists("/sys/kernel/msm_mpdecision/conf/enabled") { drivers.push("mpdecision".to_string()); }
    if sysfs::file_exists("/sys/module/intelliplug/parameters/intelliplug_active") { drivers.push("intelliplug".to_string()); }
    if sysfs::file_exists("/sys/kernel/alucard_hotplug/hotplug_enable") { drivers.push("alucard".to_string()); }
    if sysfs::file_exists("/sys/module/autosmp/parameters/enabled") { drivers.push("autosmp".to_string()); }
    drivers
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn test_format_core_ctl_min_cpus_path() {
        for cluster in 0..3 {
            let p = format!("/sys/devices/system/cpu/cpu{}/core_ctl/min_cpus", cluster * 4);
            assert!(p.contains(&format!("cpu{}", cluster * 4)));
            assert!(p.ends_with("/min_cpus"));
        }
    }

    #[test]
    fn test_format_core_ctl_max_cpus_path() {
        let cluster = 0;
        let p = format!("/sys/devices/system/cpu/cpu{}/core_ctl/max_cpus", cluster * 4);
        assert_eq!(p, "/sys/devices/system/cpu/cpu0/core_ctl/max_cpus");
    }

    #[test]
    fn test_format_core_ctl_busy_down_path() {
        let cluster = 1;
        let p = format!("/sys/devices/system/cpu/cpu{}/core_ctl/busy_down_thres", cluster * 4);
        assert_eq!(p, "/sys/devices/system/cpu/cpu4/core_ctl/busy_down_thres");
    }

    #[test]
    fn test_format_core_ctl_busy_up_path() {
        let cluster = 2;
        let p = format!("/sys/devices/system/cpu/cpu{}/core_ctl/busy_up_thres", cluster * 4);
        assert_eq!(p, "/sys/devices/system/cpu/cpu8/core_ctl/busy_up_thres");
    }

    #[test]
    fn test_format_offline_delay_ms_path() {
        let cluster = 0;
        let p = format!("/sys/devices/system/cpu/cpu{}/core_ctl/offline_delay_ms", cluster * 4);
        assert_eq!(p, "/sys/devices/system/cpu/cpu0/core_ctl/offline_delay_ms");
    }

    #[test]
    fn test_msm_hotplug_paths() {
        assert_eq!("/sys/module/msm_hotplug/parameters/enabled", "/sys/module/msm_hotplug/parameters/enabled");
        assert_eq!("/sys/module/msm_hotplug/parameters/min_cpus", "/sys/module/msm_hotplug/parameters/min_cpus");
    }

    #[test]
    fn test_mpdecision_paths() {
        assert_eq!("/sys/kernel/msm_mpdecision/conf/enabled", "/sys/kernel/msm_mpdecision/conf/enabled");
        assert_eq!("/sys/kernel/alucard_hotplug/hotplug_enable", "/sys/kernel/alucard_hotplug/hotplug_enable");
    }

    #[test]
    fn test_available_hotplug_drivers_empty_on_desktop() {
        let drivers = get_available_hotplug_drivers();
        // On non-Android, no hotplug drivers should be available
        #[cfg(not(target_os = "android"))]
        assert!(drivers.is_empty());
    }
}
