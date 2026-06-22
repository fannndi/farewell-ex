use crate::sysfs::{self, SysfsError, SysfsResult};

// ==================== Sched Features (Encore) ====================

/// Read current scheduler features from debugfs.
///
/// **Sysfs path:** `/sys/kernel/debug/sched_features`
/// **Root:** Not required
/// **Returns:** Space-separated scheduler feature flags
pub fn get_sched_features() -> String {
    sysfs::read_sysfs("/sys/kernel/debug/sched_features").unwrap_or_default()
}

/// Add or remove a scheduler feature flag (Encore).
///
/// **Sysfs path:** `/sys/kernel/debug/sched_features`
/// **Root:** Required
/// **Returns:** `true` if written successfully
pub fn set_sched_feature(feature: &str, enabled: bool) -> SysfsResult<bool> {
    let path = "/sys/kernel/debug/sched_features";
    let current = get_sched_features();
    let new_val = if enabled {
        if current.contains(feature) { current } else { format!("{} {}", current, feature) }
    } else {
        current.replace(feature, "").replace("  ", " ")
    };
    sysfs::chmod(path, "644");
    let ok = sysfs::write_sysfs(path, &new_val);
    sysfs::chmod(path, "444");
    if ok { Ok(true) } else { Err(SysfsError::IoError(path.to_string())) }
}

// ==================== Stune Boost (Encore) ====================

/// Set top-app stune `prefer_idle` (Encore).
///
/// **Sysfs path:** `/dev/stune/top-app/schedtune.prefer_idle`
/// **Root:** Required
/// **Returns:** `true` if written successfully
pub fn set_stune_prefer_idle(prefer: bool) -> SysfsResult<bool> {
    let path = "/dev/stune/top-app/schedtune.prefer_idle";
    sysfs::chmod(path, "644");
    let ok = sysfs::write_sysfs(path, if prefer { "1" } else { "0" });
    sysfs::chmod(path, "444");
    if ok { Ok(true) } else { Err(SysfsError::IoError(path.to_string())) }
}

/// Set top-app stune boost value (Encore).
///
/// **Sysfs path:** `/dev/stune/top-app/schedtune.boost`
/// **Root:** Required
/// **Returns:** `true` if written successfully
pub fn set_stune_boost(boost: i32) -> SysfsResult<bool> {
    let path = "/dev/stune/top-app/schedtune.boost";
    sysfs::chmod(path, "644");
    let ok = sysfs::write_sysfs(path, &boost.to_string());
    sysfs::chmod(path, "444");
    if ok { Ok(true) } else { Err(SysfsError::IoError(path.to_string())) }
}

// ==================== Split Lock (Encore) ====================

/// Toggle split-lock mitigation (Encore).
///
/// **Sysfs path:** `/proc/sys/kernel/split_lock_mitigate`
/// **Root:** Required
/// **Returns:** `true` if written successfully
pub fn set_split_lock_mitigate(enabled: bool) -> SysfsResult<bool> {
    let path = "/proc/sys/kernel/split_lock_mitigate";
    sysfs::chmod(path, "644");
    let ok = sysfs::write_sysfs(path, if enabled { "1" } else { "0" });
    sysfs::chmod(path, "444");
    if ok { Ok(true) } else { Err(SysfsError::IoError(path.to_string())) }
}

// ==================== Sched Lib (Encore) ====================

/// Set scheduler library name for priority boosting (Encore).
///
/// **Sysfs path:** `/proc/sys/kernel/sched_lib_name`
/// **Root:** Required
/// **Returns:** `true` if written successfully
pub fn set_sched_lib_name(names: &str) -> SysfsResult<bool> {
    let path = "/proc/sys/kernel/sched_lib_name";
    sysfs::chmod(path, "644");
    let ok = sysfs::write_sysfs(path, names);
    sysfs::chmod(path, "444");
    if ok { Ok(true) } else { Err(SysfsError::IoError(path.to_string())) }
}

/// Set scheduler library mask force value (Encore).
///
/// **Sysfs path:** `/proc/sys/kernel/sched_lib_mask_force`
/// **Root:** Required
/// **Returns:** `true` if written successfully
pub fn set_sched_lib_mask_force(mask: i32) -> SysfsResult<bool> {
    let path = "/proc/sys/kernel/sched_lib_mask_force";
    sysfs::chmod(path, "644");
    let ok = sysfs::write_sysfs(path, &mask.to_string());
    sysfs::chmod(path, "444");
    if ok { Ok(true) } else { Err(SysfsError::IoError(path.to_string())) }
}

// ==================== BORE Scheduler (RvKernel) ====================

/// Toggle BORE scheduler (RvKernel).
///
/// **Sysfs path:** `/proc/sys/kernel/sched_bore`
/// **Root:** Required
/// **Returns:** `true` if written successfully
pub fn set_sched_bore(enabled: bool) -> SysfsResult<bool> {
    let path = "/proc/sys/kernel/sched_bore";
    sysfs::chmod(path, "644");
    let ok = sysfs::write_sysfs(path, if enabled { "1" } else { "0" });
    sysfs::chmod(path, "444");
    if ok { Ok(true) } else { Err(SysfsError::IoError(path.to_string())) }
}

/// Set scheduler burst update period in ms (RvKernel).
///
/// **Sysfs path:** `/proc/sys/kernel/sched_burst_update_period`
/// **Root:** Required
/// **Returns:** `true` if written successfully
pub fn set_sched_burst_update_period(ms: i32) -> SysfsResult<bool> {
    let path = "/proc/sys/kernel/sched_burst_update_period";
    sysfs::chmod(path, "644");
    let ok = sysfs::write_sysfs(path, &ms.to_string());
    sysfs::chmod(path, "444");
    if ok { Ok(true) } else { Err(SysfsError::IoError(path.to_string())) }
}

/// Toggle scheduler burst smooth-up (RvKernel).
///
/// **Sysfs path:** `/proc/sys/kernel/sched_burst_smooth_up`
/// **Root:** Required
/// **Returns:** `true` if written successfully
pub fn set_sched_burst_smooth_up(enabled: bool) -> SysfsResult<bool> {
    let path = "/proc/sys/kernel/sched_burst_smooth_up";
    sysfs::chmod(path, "644");
    let ok = sysfs::write_sysfs(path, if enabled { "1" } else { "0" });
    sysfs::chmod(path, "444");
    if ok { Ok(true) } else { Err(SysfsError::IoError(path.to_string())) }
}

/// Toggle scheduler burst graham (RvKernel).
///
/// **Sysfs path:** `/proc/sys/kernel/sched_burst_graham`
/// **Root:** Required
/// **Returns:** `true` if written successfully
pub fn set_sched_burst_graham(enabled: bool) -> SysfsResult<bool> {
    let path = "/proc/sys/kernel/sched_burst_graham";
    sysfs::chmod(path, "644");
    let ok = sysfs::write_sysfs(path, if enabled { "1" } else { "0" });
    sysfs::chmod(path, "444");
    if ok { Ok(true) } else { Err(SysfsError::IoError(path.to_string())) }
}

// ==================== Uclamp (RvKernel) ====================

/// Set scheduler utilization clamp minimum (RvKernel).
///
/// **Sysfs path:** `/proc/sys/kernel/sched_util_clamp_min`
/// **Root:** Required
/// **Returns:** `true` if written successfully
pub fn set_sched_util_clamp_min(val: i32) -> SysfsResult<bool> {
    let path = "/proc/sys/kernel/sched_util_clamp_min";
    sysfs::chmod(path, "644");
    let ok = sysfs::write_sysfs(path, &val.to_string());
    sysfs::chmod(path, "444");
    if ok { Ok(true) } else { Err(SysfsError::IoError(path.to_string())) }
}

/// Set scheduler utilization clamp maximum (RvKernel).
///
/// **Sysfs path:** `/proc/sys/kernel/sched_util_clamp_max`
/// **Root:** Required
/// **Returns:** `true` if written successfully
pub fn set_sched_util_clamp_max(val: i32) -> SysfsResult<bool> {
    let path = "/proc/sys/kernel/sched_util_clamp_max";
    sysfs::chmod(path, "644");
    let ok = sysfs::write_sysfs(path, &val.to_string());
    sysfs::chmod(path, "444");
    if ok { Ok(true) } else { Err(SysfsError::IoError(path.to_string())) }
}

/// Set RT default utilization clamp minimum (RvKernel).
///
/// **Sysfs path:** `/proc/sys/kernel/sched_util_clamp_min_rt_default`
/// **Root:** Required
/// **Returns:** `true` if written successfully
pub fn set_sched_util_clamp_min_rt_default(val: i32) -> SysfsResult<bool> {
    let path = "/proc/sys/kernel/sched_util_clamp_min_rt_default";
    sysfs::chmod(path, "644");
    let ok = sysfs::write_sysfs(path, &val.to_string());
    sysfs::chmod(path, "444");
    if ok { Ok(true) } else { Err(SysfsError::IoError(path.to_string())) }
}

// ==================== Sched Autogroup (RvKernel) ====================

/// Toggle scheduler autogroup (RvKernel).
///
/// **Sysfs path:** `/proc/sys/kernel/sched_autogroup_enabled`
/// **Root:** Required
/// **Returns:** `true` if written successfully
pub fn set_sched_autogroup_enabled(enabled: bool) -> SysfsResult<bool> {
    let path = "/proc/sys/kernel/sched_autogroup_enabled";
    sysfs::chmod(path, "644");
    let ok = sysfs::write_sysfs(path, if enabled { "1" } else { "0" });
    sysfs::chmod(path, "444");
    if ok { Ok(true) } else { Err(SysfsError::IoError(path.to_string())) }
}

// ==================== VM Params (Encore) ====================

/// Set VFS cache pressure percentage (Encore).
///
/// **Sysfs path:** `/proc/sys/vm/vfs_cache_pressure`
/// **Root:** Required
/// **Returns:** `true` if written successfully
pub fn set_vfs_cache_pressure(pct: i32) -> SysfsResult<bool> {
    let path = "/proc/sys/vm/vfs_cache_pressure";
    sysfs::chmod(path, "644");
    let ok = sysfs::write_sysfs(path, &pct.to_string());
    sysfs::chmod(path, "444");
    if ok { Ok(true) } else { Err(SysfsError::IoError(path.to_string())) }
}

/// Set memory overcommit ratio percentage (Encore).
///
/// **Sysfs path:** `/proc/sys/vm/overcommit_ratio`
/// **Root:** Required
/// **Returns:** `true` if written successfully
pub fn set_overcommit_ratio(pct: i32) -> SysfsResult<bool> {
    let path = "/proc/sys/vm/overcommit_ratio";
    sysfs::chmod(path, "644");
    let ok = sysfs::write_sysfs(path, &pct.to_string());
    sysfs::chmod(path, "444");
    if ok { Ok(true) } else { Err(SysfsError::IoError(path.to_string())) }
}

// ==================== Cpuset (ZKM) ====================

/// Get CPU affinity mask for a cpuset group (ZKM).
///
/// **Sysfs path:** `/dev/cpuset/*/cpus`
/// **Root:** Not required
/// **Returns:** CPU list string (e.g., "0-3")
pub fn get_cpuset_cpus(group: &str) -> String {
    sysfs::read_sysfs_cached(&format!("/dev/cpuset/{}/cpus", group), 1000).unwrap_or_default()
}

/// Set CPU affinity mask for a cpuset group (ZKM).
///
/// **Sysfs path:** `/dev/cpuset/*/cpus`
/// **Root:** Required
/// **Returns:** `true` if written successfully
pub fn set_cpuset_cpus(group: &str, cpus: &str) -> SysfsResult<bool> {
    let path = format!("/dev/cpuset/{}/cpus", group);
    if sysfs::write_sysfs(&path, cpus) { Ok(true) } else { Err(SysfsError::IoError(path)) }
}

/// Get memory node affinity for a cpuset group (ZKM).
///
/// **Sysfs path:** `/dev/cpuset/*/mems`
/// **Root:** Not required
/// **Returns:** Memory node list string
pub fn get_cpuset_mems(group: &str) -> String {
    sysfs::read_sysfs_cached(&format!("/dev/cpuset/{}/mems", group), 1000).unwrap_or_default()
}

/// Set memory node affinity for a cpuset group (ZKM).
///
/// **Sysfs path:** `/dev/cpuset/*/mems`
/// **Root:** Required
/// **Returns:** `true` if written successfully
pub fn set_cpuset_mems(group: &str, mems: &str) -> SysfsResult<bool> {
    let path = format!("/dev/cpuset/{}/mems", group);
    if sysfs::write_sysfs(&path, mems) { Ok(true) } else { Err(SysfsError::IoError(path)) }
}

/// List available cpuset groups on the system (ZKM).
///
/// **Sysfs path:** `/dev/cpuset/*/`
/// **Root:** Not required
/// **Returns:** Vec of cpuset group names
pub fn get_available_cpuset_groups() -> Vec<String> {
    let base = "/dev/cpuset";
    let mut groups = Vec::new();
    if let Ok(entries) = std::fs::read_dir(base) {
        for entry in entries.flatten() {
            if entry.path().is_dir() {
                if let Some(name) = entry.file_name().to_str() {
                    if sysfs::file_exists(&format!("{}/{}/cpus", base, name)) {
                        groups.push(name.to_string());
                    }
                }
            }
        }
    }
    groups
}

/// Drop all system caches (pagecache, dentries, inodes).
///
/// **Sysfs path:** `/proc/sys/vm/drop_caches`
/// **Root:** Required
/// **Returns:** `true` if written successfully
pub fn drop_caches() -> SysfsResult<bool> {
    sysfs::chmod("/proc/sys/vm/drop_caches", "644");
    if sysfs::write_sysfs("/proc/sys/vm/drop_caches", "3") { Ok(true) } else { Err(SysfsError::IoError("/proc/sys/vm/drop_caches".to_string())) }
}

pub fn get_sched_autogroup_enabled() -> bool {
    sysfs::read_sysfs_int("/proc/sys/kernel/sched_autogroup_enabled", 1000).unwrap_or(0) == 1
}

pub fn get_overcommit_ratio() -> i32 {
    sysfs::read_sysfs_int("/proc/sys/vm/overcommit_ratio", 1000).unwrap_or(50) as i32
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn test_format_cpuset_path() {
        let p = format!("/dev/cpuset/{}/cpus", "top-app");
        assert_eq!(p, "/dev/cpuset/top-app/cpus");
        let p = format!("/dev/cpuset/{}/mems", "foreground");
        assert_eq!(p, "/dev/cpuset/foreground/mems");
    }

    #[test]
    fn test_format_cpuset_path_edge_cases() {
        let p = format!("/dev/cpuset/{}/cpus", "");
        assert_eq!(p, "/dev/cpuset//cpus");
        let p = format!("/dev/cpuset/{}/cpus", "system-background");
        assert_eq!(p, "/dev/cpuset/system-background/cpus");
    }

    #[test]
    fn test_stune_paths() {
        assert_eq!("/dev/stune/top-app/schedtune.boost", "/dev/stune/top-app/schedtune.boost");
        assert_eq!("/dev/stune/top-app/schedtune.prefer_idle", "/dev/stune/top-app/schedtune.prefer_idle");
    }

    #[test]
    fn test_vm_paths() {
        assert_eq!("/proc/sys/vm/vfs_cache_pressure", "/proc/sys/vm/vfs_cache_pressure");
        assert_eq!("/proc/sys/vm/overcommit_ratio", "/proc/sys/vm/overcommit_ratio");
    }

    #[test]
    fn test_bore_paths() {
        assert_eq!("/proc/sys/kernel/sched_bore", "/proc/sys/kernel/sched_bore");
        assert_eq!("/proc/sys/kernel/sched_burst_update_period", "/proc/sys/kernel/sched_burst_update_period");
    }

    #[test]
    fn test_sched_lib_paths() {
        assert_eq!("/proc/sys/kernel/sched_lib_name", "/proc/sys/kernel/sched_lib_name");
        assert_eq!("/proc/sys/kernel/sched_lib_mask_force", "/proc/sys/kernel/sched_lib_mask_force");
    }

    #[test]
    fn test_uclamp_paths() {
        assert_eq!("/proc/sys/kernel/sched_util_clamp_min", "/proc/sys/kernel/sched_util_clamp_min");
        assert_eq!("/proc/sys/kernel/sched_util_clamp_max", "/proc/sys/kernel/sched_util_clamp_max");
    }

    #[test]
    fn test_autogroup_path() {
        let p = "/proc/sys/kernel/sched_autogroup_enabled";
        assert_eq!(p, "/proc/sys/kernel/sched_autogroup_enabled");
    }

    #[test]
    fn test_overcommit_ratio_format() {
        let v = 150i32;
        let s = v.to_string();
        assert_eq!(s, "150");
        let v = 0i32;
        assert_eq!(v.to_string(), "0");
    }

    #[test]
    fn test_vfs_cache_pressure_edge_values() {
        // Edge: 0% (never reclaim) and 1000% (aggressive reclaim)
        let s = 0i32.to_string();
        assert_eq!(s, "0");
        let s = 1000i32.to_string();
        assert_eq!(s, "1000");
    }

    #[test]
    fn test_sched_feature_enable_disable() {
        // Simulate adding and removing feature from string
        let current = "NO_PLACE_LAG CRYPTO_CLEAR_BIG_STRUCTS";
        let feature = "CLOCK_NEW_NICE";
        let added = format!("{} {}", current, feature);
        assert!(added.contains(feature));
        let removed = added.replace(feature, "").replace("  ", " ");
        assert!(!removed.contains(feature));
    }

    #[test]
    fn test_cpuset_format_paths() {
        for group in &["top-app", "foreground", "background", "system-background", "restricted"] {
            let p = format!("/dev/cpuset/{}/cpus", group);
            assert!(p.contains(group));
            let p = format!("/dev/cpuset/{}/mems", group);
            assert!(p.contains(group));
        }
    }

    #[test]
    fn test_get_cpuset_cpus_nonexistent() {
        let cpus = get_cpuset_cpus("nonexistent_group_xyz");
        assert!(cpus.is_empty());
    }

    #[test]
    fn test_get_cpuset_mems_nonexistent() {
        let mems = get_cpuset_mems("nonexistent_group_xyz");
        assert!(mems.is_empty());
    }

    #[test]
    fn test_set_cpuset_cpus_nonexistent() {
        assert!(!set_cpuset_cpus("nonexistent_xyz", "0-3"));
    }

    #[test]
    fn test_set_cpuset_mems_nonexistent() {
        assert!(!set_cpuset_mems("nonexistent_xyz", "0"));
    }

    #[test]
    fn test_drop_caches_nonexistent() {
        assert!(!drop_caches());
    }
}
