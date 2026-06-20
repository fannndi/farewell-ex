use crate::sysfs;
use serde::{Deserialize, Serialize};

#[derive(Debug, Clone, Serialize, Deserialize)]
pub struct ThermalZone { pub name: String, pub temp: f32 }

pub fn read_cpu_temperature() -> f32 {
    for zone in 0..10 {
        let type_path = format!("/sys/class/thermal/thermal_zone{}/type", zone);
        if let Some(t) = sysfs::read_sysfs_cached(&type_path, 0) {
            let lower = t.to_lowercase();
            if lower.contains("cpu") || lower.contains("tsens") || lower == "pa" {
                return read_thermal_zone(zone);
            }
        }
    }
    read_thermal_zone(0)
}

pub fn read_thermal_zone(zone: i32) -> f32 {
    let path = format!("/sys/class/thermal/thermal_zone{}/temp", zone);
    if let Some(temp) = sysfs::read_sysfs_float(&path, 500) {
        let temp_c = if temp > 1000.0 { temp / 1000.0 } else { temp };
        if temp_c > 0.0 && temp_c < 150.0 { return temp_c; }
    }
    0.0
}

pub fn get_thermal_zone_type(zone: i32) -> String {
    sysfs::read_sysfs_cached(&format!("/sys/class/thermal/thermal_zone{}/type", zone), 0)
        .unwrap_or_else(|| format!("zone{}", zone))
}

pub fn read_thermal_zones_json() -> String {
    let mut zones = Vec::new();
    for zone in 0..100 {
        let temp = read_thermal_zone(zone);
        if temp > 0.0 {
            let zone_type = get_thermal_zone_type(zone);
            zones.push(ThermalZone { name: format!("{}:{}", zone, zone_type), temp });
        }
    }
    serde_json::to_string(&zones).unwrap_or_else(|_| "[]".to_string())
}

pub fn set_thermal_sconfig(preset: &str) -> bool {
    let path = "/sys/class/thermal/thermal_message/sconfig";
    let value = match preset {
        "default" | "class0" => "11",
        "extreme" => "2",
        "dynamic" => "10",
        "incalls" => "8",
        "cool" => "20",
        _ => "11",
    };
    sysfs::chmod(path, "644");
    let ok = sysfs::write_sysfs(path, value);
    sysfs::chmod(path, "444");
    ok
}

// ==================== MSM Thermal (SmartPack) ====================

pub fn set_msm_thermal_enabled(enabled: bool) -> bool {
    let val = if enabled { "Y" } else { "N" };
    let paths = [
        "/sys/module/msm_thermal/parameters/enabled",
        "/sys/module/msm_thermal_v2/parameters/enabled",
        "/sys/module/simple_msm_thermal/parameters/enabled",
    ];
    let mut ok = false;
    for path in &paths {
        if sysfs::file_exists(path) {
            sysfs::chmod(path, "644");
            if sysfs::write_sysfs(path, val) { ok = true; }
            sysfs::chmod(path, "444");
        }
    }
    ok
}

// ==================== EARA Thermal (Encore + ZKM + AZenith) ====================

pub fn set_eara_thermal_enabled(enabled: bool) -> bool {
    let path = "/sys/kernel/eara_thermal/enable";
    if !sysfs::file_exists(path) { return false; }
    sysfs::chmod(path, "644");
    let ok = sysfs::write_sysfs(path, if enabled { "1" } else { "0" });
    sysfs::chmod(path, "444"); ok
}

pub fn set_eara_fake_throttle(enabled: bool) -> bool {
    let path = "/sys/kernel/eara_thermal/fake_throttle";
    if !sysfs::file_exists(path) { return false; }
    sysfs::chmod(path, "644");
    let ok = sysfs::write_sysfs(path, if enabled { "1" } else { "0" });
    sysfs::chmod(path, "444"); ok
}

// ==================== FPSGO (Encore + ZKM) ====================

pub fn set_fpsgo_enabled(enabled: bool) -> bool {
    let path = "/sys/kernel/fpsgo/common/fpsgo_enable";
    if !sysfs::file_exists(path) { return false; }
    sysfs::chmod(path, "644");
    let ok = sysfs::write_sysfs(path, if enabled { "1" } else { "0" });
    sysfs::chmod(path, "444"); ok
}

pub fn set_fpsgo_force(enabled: bool) -> bool {
    let path = "/sys/kernel/fpsgo/common/force_onoff";
    if !sysfs::file_exists(path) { return false; }
    sysfs::chmod(path, "644");
    let ok = sysfs::write_sysfs(path, if enabled { "1" } else { "0" });
    sysfs::chmod(path, "444"); ok
}
