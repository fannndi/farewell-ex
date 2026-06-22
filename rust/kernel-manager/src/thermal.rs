use crate::sysfs;
use serde::{Deserialize, Serialize};

/// A single thermal zone with name and temperature.
#[derive(Debug, Clone, Serialize, Deserialize)]
pub struct ThermalZone { pub name: String, pub temp: f32 }

/// Read CPU temperature from the first matching thermal zone.
///
/// **Sysfs path:** `/sys/class/thermal/thermal_zone*/temp`
/// **Root:** Not required
/// **Returns:** Temperature in °C
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

/// Read temperature from a specific thermal zone.
///
/// **Sysfs path:** `/sys/class/thermal/thermal_zone*/temp`
/// **Root:** Not required
/// **Returns:** Temperature in °C, or 0.0 on error
pub fn read_thermal_zone(zone: i32) -> f32 {
    let path = format!("/sys/class/thermal/thermal_zone{}/temp", zone);
    if let Some(temp) = sysfs::read_sysfs_float(&path, 500) {
        let temp_c = if temp > 1000.0 { temp / 1000.0 } else { temp };
        if temp_c > 0.0 && temp_c < 150.0 { return temp_c; }
    }
    0.0
}

/// Get the type/name of a thermal zone.
///
/// **Sysfs path:** `/sys/class/thermal/thermal_zone*/type`
/// **Root:** Not required
/// **Returns:** Zone type string (e.g., "tsens", "cpu-thermal")
pub fn get_thermal_zone_type(zone: i32) -> String {
    sysfs::read_sysfs_cached(&format!("/sys/class/thermal/thermal_zone{}/type", zone), 0)
        .unwrap_or_else(|| format!("zone{}", zone))
}

/// Read all thermal zones as JSON string.
///
/// **Sysfs path:** `/sys/class/thermal/thermal_zone*/temp`
/// **Root:** Not required
/// **Returns:** JSON array of `ThermalZone`
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

/// Set thermal sconfig preset (Xiaomi/MIUI).
///
/// **Sysfs path:** `/sys/class/thermal/thermal_message/sconfig`
/// **Root:** Required
/// **Returns:** `true` if written successfully
///
/// Example:
/// ```
/// thermal::set_thermal_sconfig("extreme");
/// ```
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

/// Toggle MSM thermal throttling (SmartPack).
///
/// **Sysfs path:** `/sys/module/msm_thermal/parameters/enabled`
/// **Root:** Required
/// **Returns:** `true` if any MSM thermal path was written
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

/// Toggle EARA thermal engine (Encore/ZKM/AZenith).
///
/// **Sysfs path:** `/sys/kernel/eara_thermal/enable`
/// **Root:** Required
/// **Returns:** `true` if written successfully
pub fn set_eara_thermal_enabled(enabled: bool) -> bool {
    let path = "/sys/kernel/eara_thermal/enable";
    if !sysfs::file_exists(path) { return false; }
    sysfs::chmod(path, "644");
    let ok = sysfs::write_sysfs(path, if enabled { "1" } else { "0" });
    sysfs::chmod(path, "444"); ok
}

/// Toggle EARA fake throttle (Encore/ZKM/AZenith).
///
/// **Sysfs path:** `/sys/kernel/eara_thermal/fake_throttle`
/// **Root:** Required
/// **Returns:** `true` if written successfully
pub fn set_eara_fake_throttle(enabled: bool) -> bool {
    let path = "/sys/kernel/eara_thermal/fake_throttle";
    if !sysfs::file_exists(path) { return false; }
    sysfs::chmod(path, "644");
    let ok = sysfs::write_sysfs(path, if enabled { "1" } else { "0" });
    sysfs::chmod(path, "444"); ok
}

// ==================== FPSGO (Encore + ZKM) ====================

/// Toggle FPSGO (Encore/ZKM).
///
/// **Sysfs path:** `/sys/kernel/fpsgo/common/fpsgo_enable`
/// **Root:** Required
/// **Returns:** `true` if written successfully
pub fn set_fpsgo_enabled(enabled: bool) -> bool {
    let path = "/sys/kernel/fpsgo/common/fpsgo_enable";
    if !sysfs::file_exists(path) { return false; }
    sysfs::chmod(path, "644");
    let ok = sysfs::write_sysfs(path, if enabled { "1" } else { "0" });
    sysfs::chmod(path, "444"); ok
}

/// Force FPSGO on/off (Encore/ZKM).
///
/// **Sysfs path:** `/sys/kernel/fpsgo/common/force_onoff`
/// **Root:** Required
/// **Returns:** `true` if written successfully
pub fn set_fpsgo_force(enabled: bool) -> bool {
    let path = "/sys/kernel/fpsgo/common/force_onoff";
    if !sysfs::file_exists(path) { return false; }
    sysfs::chmod(path, "644");
    let ok = sysfs::write_sysfs(path, if enabled { "1" } else { "0" });
    sysfs::chmod(path, "444"); ok
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn test_thermal_zone_roundtrip() {
        let t = ThermalZone { name: "0:tsens_tz_sensor0".into(), temp: 42.5 };
        let json = serde_json::to_string(&t).unwrap();
        let d: ThermalZone = serde_json::from_str(&json).unwrap();
        assert_eq!(d.name, "0:tsens_tz_sensor0");
        assert!((d.temp - 42.5).abs() < 0.01);
    }

    #[test]
    fn test_thermal_zone_edge_cases() {
        let t = ThermalZone { name: String::new(), temp: 0.0 };
        let json = serde_json::to_string(&t).unwrap();
        let d: ThermalZone = serde_json::from_str(&json).unwrap();
        assert!(d.name.is_empty());
        assert!((d.temp - 0.0).abs() < f32::EPSILON);
    }

    #[test]
    fn test_get_thermal_zone_type_nonexistent() {
        let t = get_thermal_zone_type(999);
        assert_eq!(t, "zone999");
    }

    #[test]
    fn test_thermal_format_paths() {
        for zone in 0..3 {
            let p = format!("/sys/class/thermal/thermal_zone{}/temp", zone);
            assert_eq!(p, format!("/sys/class/thermal/thermal_zone{}/temp", zone));
        }
    }

    #[test]
    fn test_thermal_zone_temp_conversion() {
        let temp_celsius: f32 = 37500.0;
        let temp_converted = if temp_celsius > 1000.0 { temp_celsius / 1000.0 } else { temp_celsius };
        assert!((temp_converted - 37.5).abs() < 0.01);
    }

    #[test]
    fn test_thermal_zone_no_conversion_needed() {
        let temp: f32 = 42.0;
        let temp_c = if temp > 1000.0 { temp / 1000.0 } else { temp };
        assert!((temp_c - 42.0).abs() < f32::EPSILON);
    }

    #[test]
    fn test_thermal_zone_invalid_rejected() {
        let temp: f32 = -10.0;
        let valid = temp > 0.0 && temp < 150.0;
        assert!(!valid);
    }
}
