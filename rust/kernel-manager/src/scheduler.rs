use crate::sysfs;

// ==================== Sched Features (Encore) ====================

pub fn get_sched_features() -> String {
    sysfs::read_sysfs("/sys/kernel/debug/sched_features").unwrap_or_default()
}

pub fn set_sched_feature(feature: &str, enabled: bool) -> bool {
    let path = "/sys/kernel/debug/sched_features";
    let current = get_sched_features();
    let new_val = if enabled {
        if current.contains(feature) { current } else { format!("{} {}", current, feature) }
    } else {
        current.replace(feature, "").replace("  ", " ")
    };
    sysfs::chmod(path, "644");
    let ok = sysfs::write_sysfs(path, &new_val);
    sysfs::chmod(path, "444"); ok
}

// ==================== Stune Boost (Encore) ====================

pub fn set_stune_prefer_idle(prefer: bool) -> bool {
    let path = "/dev/stune/top-app/schedtune.prefer_idle";
    sysfs::chmod(path, "644");
    let ok = sysfs::write_sysfs(path, if prefer { "1" } else { "0" });
    sysfs::chmod(path, "444"); ok
}

pub fn set_stune_boost(boost: i32) -> bool {
    let path = "/dev/stune/top-app/schedtune.boost";
    sysfs::chmod(path, "644");
    let ok = sysfs::write_sysfs(path, &boost.to_string());
    sysfs::chmod(path, "444"); ok
}

// ==================== Split Lock (Encore) ====================

pub fn set_split_lock_mitigate(enabled: bool) -> bool {
    let path = "/proc/sys/kernel/split_lock_mitigate";
    sysfs::chmod(path, "644");
    let ok = sysfs::write_sysfs(path, if enabled { "1" } else { "0" });
    sysfs::chmod(path, "444"); ok
}

// ==================== Sched Lib (Encore) ====================

pub fn set_sched_lib_name(names: &str) -> bool {
    let path = "/proc/sys/kernel/sched_lib_name";
    sysfs::chmod(path, "644");
    let ok = sysfs::write_sysfs(path, names);
    sysfs::chmod(path, "444"); ok
}

pub fn set_sched_lib_mask_force(mask: i32) -> bool {
    let path = "/proc/sys/kernel/sched_lib_mask_force";
    sysfs::chmod(path, "644");
    let ok = sysfs::write_sysfs(path, &mask.to_string());
    sysfs::chmod(path, "444"); ok
}

// ==================== BORE Scheduler (RvKernel) ====================

pub fn set_sched_bore(enabled: bool) -> bool {
    let path = "/proc/sys/kernel/sched_bore";
    sysfs::chmod(path, "644");
    let ok = sysfs::write_sysfs(path, if enabled { "1" } else { "0" });
    sysfs::chmod(path, "444"); ok
}

pub fn set_sched_burst_update_period(ms: i32) -> bool {
    let path = "/proc/sys/kernel/sched_burst_update_period";
    sysfs::chmod(path, "644");
    let ok = sysfs::write_sysfs(path, &ms.to_string());
    sysfs::chmod(path, "444"); ok
}

pub fn set_sched_burst_smooth_up(enabled: bool) -> bool {
    let path = "/proc/sys/kernel/sched_burst_smooth_up";
    sysfs::chmod(path, "644");
    let ok = sysfs::write_sysfs(path, if enabled { "1" } else { "0" });
    sysfs::chmod(path, "444"); ok
}

pub fn set_sched_burst_graham(enabled: bool) -> bool {
    let path = "/proc/sys/kernel/sched_burst_graham";
    sysfs::chmod(path, "644");
    let ok = sysfs::write_sysfs(path, if enabled { "1" } else { "0" });
    sysfs::chmod(path, "444"); ok
}

// ==================== Uclamp (RvKernel) ====================

pub fn set_sched_util_clamp_min(val: i32) -> bool {
    let path = "/proc/sys/kernel/sched_util_clamp_min";
    sysfs::chmod(path, "644");
    let ok = sysfs::write_sysfs(path, &val.to_string());
    sysfs::chmod(path, "444"); ok
}

pub fn set_sched_util_clamp_max(val: i32) -> bool {
    let path = "/proc/sys/kernel/sched_util_clamp_max";
    sysfs::chmod(path, "644");
    let ok = sysfs::write_sysfs(path, &val.to_string());
    sysfs::chmod(path, "444"); ok
}

pub fn set_sched_util_clamp_min_rt_default(val: i32) -> bool {
    let path = "/proc/sys/kernel/sched_util_clamp_min_rt_default";
    sysfs::chmod(path, "644");
    let ok = sysfs::write_sysfs(path, &val.to_string());
    sysfs::chmod(path, "444"); ok
}

// ==================== Sched Autogroup (RvKernel) ====================

pub fn set_sched_autogroup_enabled(enabled: bool) -> bool {
    let path = "/proc/sys/kernel/sched_autogroup_enabled";
    sysfs::chmod(path, "644");
    let ok = sysfs::write_sysfs(path, if enabled { "1" } else { "0" });
    sysfs::chmod(path, "444"); ok
}

// ==================== VM Params (Encore) ====================

pub fn set_vfs_cache_pressure(pct: i32) -> bool {
    let path = "/proc/sys/vm/vfs_cache_pressure";
    sysfs::chmod(path, "644");
    let ok = sysfs::write_sysfs(path, &pct.to_string());
    sysfs::chmod(path, "444"); ok
}

pub fn set_overcommit_ratio(pct: i32) -> bool {
    let path = "/proc/sys/vm/overcommit_ratio";
    sysfs::chmod(path, "644");
    let ok = sysfs::write_sysfs(path, &pct.to_string());
    sysfs::chmod(path, "444"); ok
}

pub fn drop_caches() -> bool {
    sysfs::chmod("/proc/sys/vm/drop_caches", "644");
    sysfs::write_sysfs("/proc/sys/vm/drop_caches", "3")
}
