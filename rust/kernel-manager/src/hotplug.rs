use crate::sysfs;

// ==================== CoreCtl (SmartPack) ====================

pub fn get_core_ctl_min_cpus(cluster: i32) -> i32 {
    sysfs::read_sysfs_int(&format!("/sys/devices/system/cpu/cpu{}/core_ctl/min_cpus", cluster * 4), 1000).unwrap_or(-1) as i32
}

pub fn set_core_ctl_min_cpus(cluster: i32, n: i32) -> bool {
    sysfs::write_sysfs(&format!("/sys/devices/system/cpu/cpu{}/core_ctl/min_cpus", cluster * 4), &n.to_string())
}

pub fn get_core_ctl_max_cpus(cluster: i32) -> i32 {
    sysfs::read_sysfs_int(&format!("/sys/devices/system/cpu/cpu{}/core_ctl/max_cpus", cluster * 4), 1000).unwrap_or(-1) as i32
}

pub fn set_core_ctl_max_cpus(cluster: i32, n: i32) -> bool {
    sysfs::write_sysfs(&format!("/sys/devices/system/cpu/cpu{}/core_ctl/max_cpus", cluster * 4), &n.to_string())
}

pub fn get_core_ctl_busy_down_threshold(cluster: i32) -> i32 {
    sysfs::read_sysfs_int(&format!("/sys/devices/system/cpu/cpu{}/core_ctl/busy_down_thres", cluster * 4), 1000).unwrap_or(-1) as i32
}

pub fn set_core_ctl_busy_down_threshold(cluster: i32, pct: i32) -> bool {
    sysfs::write_sysfs(&format!("/sys/devices/system/cpu/cpu{}/core_ctl/busy_down_thres", cluster * 4), &pct.to_string())
}

pub fn get_core_ctl_busy_up_threshold(cluster: i32) -> i32 {
    sysfs::read_sysfs_int(&format!("/sys/devices/system/cpu/cpu{}/core_ctl/busy_up_thres", cluster * 4), 1000).unwrap_or(-1) as i32
}

pub fn set_core_ctl_busy_up_threshold(cluster: i32, pct: i32) -> bool {
    sysfs::write_sysfs(&format!("/sys/devices/system/cpu/cpu{}/core_ctl/busy_up_thres", cluster * 4), &pct.to_string())
}

pub fn get_core_ctl_offline_delay_ms(cluster: i32) -> i32 {
    sysfs::read_sysfs_int(&format!("/sys/devices/system/cpu/cpu{}/core_ctl/offline_delay_ms", cluster * 4), 1000).unwrap_or(-1) as i32
}

pub fn set_core_ctl_offline_delay_ms(cluster: i32, ms: i32) -> bool {
    sysfs::write_sysfs(&format!("/sys/devices/system/cpu/cpu{}/core_ctl/offline_delay_ms", cluster * 4), &ms.to_string())
}

// ==================== MSM Hotplug (SmartPack) ====================

pub fn get_msm_hotplug_enabled() -> bool {
    sysfs::read_sysfs_int("/sys/module/msm_hotplug/parameters/enabled", 1000).unwrap_or(0) == 1
}

pub fn set_msm_hotplug_enabled(enabled: bool) -> bool {
    sysfs::write_sysfs("/sys/module/msm_hotplug/parameters/enabled", if enabled { "Y" } else { "N" })
}

pub fn get_msm_hotplug_min_cpus() -> i32 {
    sysfs::read_sysfs_int("/sys/module/msm_hotplug/parameters/min_cpus", 1000).unwrap_or(-1) as i32
}

pub fn set_msm_hotplug_min_cpus(n: i32) -> bool {
    sysfs::write_sysfs("/sys/module/msm_hotplug/parameters/min_cpus", &n.to_string())
}

pub fn get_msm_hotplug_max_cpus() -> i32 {
    sysfs::read_sysfs_int("/sys/module/msm_hotplug/parameters/max_cpus", 1000).unwrap_or(-1) as i32
}

pub fn set_msm_hotplug_max_cpus(n: i32) -> bool {
    sysfs::write_sysfs("/sys/module/msm_hotplug/parameters/max_cpus", &n.to_string())
}

pub fn get_msm_hotplug_def_suspend() -> i32 {
    sysfs::read_sysfs_int("/sys/module/msm_hotplug/parameters/def_suspend", 1000).unwrap_or(-1) as i32
}

pub fn set_msm_hotplug_def_suspend(n: i32) -> bool {
    sysfs::write_sysfs("/sys/module/msm_hotplug/parameters/def_suspend", &n.to_string())
}

// ==================== MPDecision (SmartPack) ====================

pub fn get_mpdecision_enabled() -> bool {
    sysfs::file_exists("/sys/kernel/msm_mpdecision/conf/enabled")
}

pub fn set_mpdecision_enabled(enabled: bool) -> bool {
    sysfs::write_sysfs("/sys/kernel/msm_mpdecision/conf/enabled", if enabled { "1" } else { "0" })
}

// ==================== Probe: hotplug drivers available ====================

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
