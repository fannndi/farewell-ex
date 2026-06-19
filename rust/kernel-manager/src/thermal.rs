use crate::sysfs;
use serde::Serialize;

#[derive(Debug, Clone, Serialize, Deserialize)]
pub struct ThermalZone { pub name: String, pub temp: f32 }

use serde::Deserialize;

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
    sysfs::chmod(path, "666");
    let ok = sysfs::write_sysfs(path, value);
    sysfs::chmod(path, "444");
    ok
}
