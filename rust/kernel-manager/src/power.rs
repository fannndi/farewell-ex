use crate::sysfs::{self, SysfsError, SysfsResult};
use serde::{Deserialize, Serialize};
use std::sync::Once;

static mut CAPACITY_FD: i32 = -1;
static mut TEMP_FD: i32 = -1;
static mut VOLTAGE_FD: i32 = -1;
static mut CURRENT_FD: i32 = -1;
static INIT: Once = Once::new();

/// Battery information including level, temperature, voltage, and health.
#[derive(Debug, Clone, Serialize, Deserialize)]
pub struct BatteryInfo {
    pub level: i32, pub temp: i32, pub voltage: i32, pub current: i32,
    pub charging: bool, pub health: String, pub cycle_count: i32,
    pub capacity_level: f32, pub status: String,
}

fn ensure_init() {
    INIT.call_once(|| unsafe {
        CAPACITY_FD = libc::open(b"/sys/class/power_supply/battery/capacity\0".as_ptr() as *const libc::c_char, libc::O_RDONLY);
        TEMP_FD = libc::open(b"/sys/class/power_supply/battery/temp\0".as_ptr() as *const libc::c_char, libc::O_RDONLY);
        VOLTAGE_FD = libc::open(b"/sys/class/power_supply/battery/voltage_now\0".as_ptr() as *const libc::c_char, libc::O_RDONLY);
        CURRENT_FD = libc::open(b"/sys/class/power_supply/battery/current_now\0".as_ptr() as *const libc::c_char, libc::O_RDONLY);
    });
}

unsafe fn read_fd_int(fd: i32) -> Option<i64> {
    if fd < 0 { return None; }
    let mut buf = [0u8; 32];
    unsafe { libc::lseek(fd, 0, libc::SEEK_SET); }
    let n = unsafe { libc::read(fd, buf.as_mut_ptr() as *mut libc::c_void, buf.len()) };
    if n <= 0 { return None; }
    unsafe { std::str::from_utf8_unchecked(&buf[..n as usize]).trim().parse().ok() }
}

/// Read battery level percentage.
///
/// **Sysfs path:** `/sys/class/power_supply/battery/capacity`
/// **Root:** Not required
/// **Returns:** Battery level (0–100)
pub fn read_battery_level() -> i32 {
    ensure_init();
    unsafe { if let Some(v) = read_fd_int(CAPACITY_FD) { return v as i32; } }
    sysfs::read_sysfs_int("/sys/class/power_supply/battery/capacity", 500).unwrap_or(0) as i32
}

/// Read battery temperature from sysfs.
///
/// **Sysfs path:** `/sys/class/power_supply/battery/temp`
/// **Root:** Not required
/// **Returns:** Temperature in tenths of °C (e.g., 300 = 30.0°C)
pub fn read_battery_temp() -> i32 {
    ensure_init();
    unsafe { if let Some(v) = read_fd_int(TEMP_FD) { return v as i32; } }
    sysfs::read_sysfs_int("/sys/class/power_supply/battery/temp", 500).unwrap_or(0) as i32
}

/// Read battery voltage in millivolts.
///
/// **Sysfs path:** `/sys/class/power_supply/battery/voltage_now`
/// **Root:** Not required
/// **Returns:** Voltage in mV
pub fn read_battery_voltage_mv() -> i32 {
    ensure_init();
    unsafe { if let Some(v) = read_fd_int(VOLTAGE_FD) { return (v / 1000) as i32; } }
    let v = sysfs::read_sysfs_int("/sys/class/power_supply/battery/voltage_now", 500).unwrap_or(0);
    (v / 1000) as i32
}

/// Read battery current in milliamps.
///
/// **Sysfs path:** `/sys/class/power_supply/battery/current_now`
/// **Root:** Not required
/// **Returns:** Current in mA (absolute value)
pub fn read_battery_current_ma() -> i32 {
    ensure_init();
    let raw = unsafe { read_fd_int(CURRENT_FD).unwrap_or_else(|| {
        sysfs::read_sysfs_int("/sys/class/power_supply/battery/current_now", 500).unwrap_or(0).into()
    })};
    let abs = raw.abs();
    if abs < 10000 { abs as i32 } else { (abs / 1000) as i32 }
}

/// Check if the battery is currently charging.
///
/// **Sysfs path:** `/sys/class/power_supply/battery/status`
/// **Root:** Not required
/// **Returns:** `true` if status contains "Charging"
pub fn is_charging() -> bool {
    sysfs::read_sysfs_cached("/sys/class/power_supply/battery/status", 500)
        .map(|s| s.contains("Charging")).unwrap_or(false)
}

/// Read system wakeup count.
///
/// **Sysfs path:** `/sys/power/wakeup_count`
/// **Root:** Not required
/// **Returns:** Number of wakeup events
pub fn read_wakeup_count() -> i32 {
    sysfs::read_sysfs_int("/sys/power/wakeup_count", 1000).unwrap_or(0) as i32
}

/// Read successful suspend count from debug stats.
///
/// **Sysfs path:** `/sys/kernel/debug/suspend_stats/success`
/// **Root:** Not required
/// **Returns:** Number of successful suspend cycles
pub fn read_suspend_count() -> i32 {
    sysfs::read_sysfs_int("/sys/kernel/debug/suspend_stats/success", 1000).unwrap_or(0) as i32
}

/// Read battery cycle count.
///
/// **Sysfs path:** `/sys/class/power_supply/*/cycle_count`
/// **Root:** Not required
/// **Returns:** Cycle count, or -1 if unavailable
pub fn read_cycle_count() -> i32 {
    for path in &["/sys/class/power_supply/bms/cycle_count", "/sys/class/power_supply/battery/cycle_count", "/sys/class/power_supply/bat/cycle_count"] {
        if let Some(v) = sysfs::read_sysfs_int(path, 1000) { return v as i32; }
    }
    -1
}

/// Read battery health status string.
///
/// **Sysfs path:** `/sys/class/power_supply/battery/health`
/// **Root:** Not required
/// **Returns:** Health string (e.g., "Good", "Unknown")
pub fn read_battery_health() -> String {
    sysfs::read_sysfs_cached("/sys/class/power_supply/battery/health", 1000).unwrap_or_else(|| "Unknown".to_string())
}

/// Calculate battery capacity level as percentage of design capacity.
///
/// **Sysfs path:** `/sys/class/power_supply/battery/charge_full`, `charge_full_design`
/// **Root:** Not required
/// **Returns:** Capacity percentage (50.0–100.0)
pub fn read_battery_capacity_level() -> f32 {
    let design = sysfs::read_sysfs_int("/sys/class/power_supply/battery/charge_full_design", 5000).unwrap_or(0) as f32;
    let current = sysfs::read_sysfs_int("/sys/class/power_supply/battery/charge_full", 5000).unwrap_or(0) as f32;
    if design > 0.0 && current > 0.0 {
        let pct = (current / design) * 100.0;
        if pct >= 50.0 && pct <= 100.0 { return pct; }
    }
    100.0
}

/// Read battery status string.
///
/// **Sysfs path:** `/sys/class/power_supply/battery/status`
/// **Root:** Not required
/// **Returns:** Status (e.g., "Charging", "Discharging")
pub fn read_battery_status() -> String {
    sysfs::read_sysfs_cached("/sys/class/power_supply/battery/status", 500).unwrap_or_else(|| "Unknown".to_string())
}

/// Enable or disable bypass charging (disconnect battery when full).
///
/// **Sysfs path:** `/sys/class/power_supply/battery/input_suspend` and others
/// **Root:** Required
/// **Returns:** `true` if bypass was toggled
pub fn set_bypass_charging(enable: bool) -> SysfsResult<bool> {
    let val = if enable { "1" } else { "0" };
    let paths = [
        "/sys/class/power_supply/battery/input_suspend",
        "/sys/class/qcom-battery/bypass_charging_enable",
        "/sys/class/power_supply/battery/charging_enabled",
    ];
    for path in &paths {
        if sysfs::file_exists(path) {
            sysfs::chmod(path, "644");
            let ok = sysfs::write_sysfs(path, val);
            sysfs::chmod(path, "444");
            if ok { return Ok(true); }
            return Err(SysfsError::IoError(path.to_string()));
        }
    }
    Err(SysfsError::NotFound("no bypass path found".to_string()))
}

// ==================== Bypass Charging Auto-Discovery (AZenith) ====================

/// Auto-discover bypass charging node by testing candidates (AZenith).
///
/// **Sysfs path:** Various `/sys/class/power_supply/*` and `/sys/class/qcom-battery/*`
/// **Root:** Required
/// **Returns:** Path to working bypass node, or None
pub fn discover_bypass_charging_node() -> Option<String> {
    let candidates = [
        "/sys/class/power_supply/battery/input_suspend",
        "/sys/class/qcom-battery/bypass_charging_enable",
        "/sys/class/power_supply/battery/charging_enabled",
        "/sys/class/power_supply/bms/charging_enabled",
        "/sys/class/power_supply/bat/charging_enabled",
        "/sys/devices/platform/soc:qcom,battery/charging_enabled",
        "/sys/class/power_supply/usb/charging_enabled",
        "/sys/class/power_supply/dc/charging_enabled",
        "/sys/class/power_supply/battery/constant_charge_current_max",
        "/sys/class/qcom-battery/restricted_current",
    ];
    for path in &candidates {
        if sysfs::file_exists(path) {
            sysfs::chmod(path, "644");
            if sysfs::write_sysfs(path, "1") {
                // Verify: read current_now, if drops → working node
                std::thread::sleep(std::time::Duration::from_millis(500));
                let current = read_battery_current_ma();
                if current.abs() < 1000 {
                    return Some(path.to_string());
                }
                sysfs::write_sysfs(path, "0");
            }
        }
    }
    None
}

// ==================== Charging Current (SmartPack) ====================

/// Read constant charge current max in microamps (SmartPack).
///
/// **Sysfs path:** `/sys/class/power_supply/battery/constant_charge_current_max`
/// **Root:** Not required
/// **Returns:** Current in µA, or -1 if unavailable
pub fn get_constant_charge_current_max() -> i32 {
    sysfs::read_sysfs_int("/sys/class/power_supply/battery/constant_charge_current_max", 1000).unwrap_or(-1) as i32
}

/// Set constant charge current max in microamps (SmartPack).
///
/// **Sysfs path:** `/sys/class/power_supply/battery/constant_charge_current_max`
/// **Root:** Required
/// **Returns:** `true` if written successfully
pub fn set_constant_charge_current_max(ua: i32) -> SysfsResult<bool> {
    let path = "/sys/class/power_supply/battery/constant_charge_current_max";
    sysfs::chmod(path, "644");
    let ok = sysfs::write_sysfs(path, &ua.to_string());
    sysfs::chmod(path, "444");
    if ok { Ok(true) } else { Err(SysfsError::IoError(path.to_string())) }
}

/// Read USB max input current in microamps (SmartPack).
///
/// **Sysfs path:** `/sys/class/power_supply/usb/current_max`
/// **Root:** Not required
/// **Returns:** Current in µA, or -1 if unavailable
pub fn get_usb_current_max() -> i32 {
    sysfs::read_sysfs_int("/sys/class/power_supply/usb/current_max", 1000).unwrap_or(-1) as i32
}

/// Set USB max input current in microamps (SmartPack).
///
/// **Sysfs path:** `/sys/class/power_supply/usb/current_max`
/// **Root:** Required
/// **Returns:** `true` if written successfully
pub fn set_usb_current_max(ua: i32) -> SysfsResult<bool> {
    let path = "/sys/class/power_supply/usb/current_max";
    sysfs::chmod(path, "644");
    let ok = sysfs::write_sysfs(path, &ua.to_string());
    sysfs::chmod(path, "444");
    if ok { Ok(true) } else { Err(SysfsError::IoError(path.to_string())) }
}

pub fn get_charge_control_limit() -> i32 {
    sysfs::read_sysfs_int("/sys/class/power_supply/battery/charge_control_limit", 1000).unwrap_or(-1) as i32
}

pub fn set_charge_control_limit(limit: i32) -> SysfsResult<bool> {
    let path = "/sys/class/power_supply/battery/charge_control_limit";
    if !sysfs::file_exists(path) { return Err(SysfsError::NotFound(path.to_string())); }
    sysfs::chmod(path, "644");
    let ok = sysfs::write_sysfs(path, &limit.to_string());
    sysfs::chmod(path, "444");
    if ok { Ok(true) } else { Err(SysfsError::IoError(path.to_string())) }
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn test_battery_info_roundtrip() {
        let b = BatteryInfo { level: 85, temp: 320, voltage: 4200, current: -500, charging: true, health: "Good".into(), cycle_count: 150, capacity_level: 92.5, status: "Charging".into() };
        let json = serde_json::to_string(&b).unwrap();
        let d: BatteryInfo = serde_json::from_str(&json).unwrap();
        assert_eq!(d.level, 85);
        assert!(d.charging);
        assert_eq!(d.health, "Good");
    }

    #[test]
    fn test_battery_info_zero_values() {
        let b = BatteryInfo { level: 0, temp: 0, voltage: 0, current: 0, charging: false, health: String::new(), cycle_count: 0, capacity_level: 0.0, status: String::new() };
        let json = serde_json::to_string(&b).unwrap();
        let d: BatteryInfo = serde_json::from_str(&json).unwrap();
        assert_eq!(d.level, 0);
        assert!(!d.charging);
    }

    #[test]
    fn test_battery_info_overflow_values() {
        let b = BatteryInfo { level: 100, temp: 999, voltage: 5000, current: 2000, charging: true, health: "Overheat".into(), cycle_count: 9999, capacity_level: 100.0, status: "Full".into() };
        let json = serde_json::to_string(&b).unwrap();
        let d: BatteryInfo = serde_json::from_str(&json).unwrap();
        assert_eq!(d.level, 100);
        assert_eq!(d.cycle_count, 9999);
    }

    #[test]
    fn test_battery_format_paths() {
        assert_eq!("/sys/class/power_supply/battery/capacity", "/sys/class/power_supply/battery/capacity");
        assert_eq!("/sys/class/power_supply/battery/temp", "/sys/class/power_supply/battery/temp");
        assert_eq!("/sys/class/power_supply/bms/cycle_count", "/sys/class/power_supply/bms/cycle_count");
    }

    #[test]
    fn test_bypass_candidates_const() {
        let candidates = [
            "/sys/class/power_supply/battery/input_suspend",
            "/sys/class/qcom-battery/bypass_charging_enable",
            "/sys/class/power_supply/battery/charging_enabled",
        ];
        assert!(candidates.contains(&"/sys/class/power_supply/battery/input_suspend"));
        assert!(candidates.contains(&"/sys/class/power_supply/battery/charging_enabled"));
    }

    #[test]
    fn test_constant_charge_current_max_paths() {
        let p = "/sys/class/power_supply/battery/constant_charge_current_max";
        assert_eq!(p, "/sys/class/power_supply/battery/constant_charge_current_max");
    }

    #[test]
    fn test_battery_info_negative_current() {
        let b = BatteryInfo { level: 50, temp: 250, voltage: 3800, current: -300, charging: false, health: "Good".into(), cycle_count: 0, capacity_level: 80.0, status: "Discharging".into() };
        let json = serde_json::to_string(&b).unwrap();
        let d: BatteryInfo = serde_json::from_str(&json).unwrap();
        assert_eq!(d.current, -300);
        assert!(!d.charging);
    }

    #[test]
    fn test_battery_info_max_boundary() {
        let b = BatteryInfo { level: 100, temp: 0, voltage: 0, current: i32::MAX, charging: true, health: String::new(), cycle_count: i32::MAX, capacity_level: 100.0, status: String::new() };
        let json = serde_json::to_string(&b).unwrap();
        let d: BatteryInfo = serde_json::from_str(&json).unwrap();
        assert_eq!(d.level, 100);
        assert_eq!(d.current, i32::MAX);
        assert_eq!(d.cycle_count, i32::MAX);
    }

    #[test]
    fn test_battery_info_i32_min_values() {
        let b = BatteryInfo { level: 0, temp: i32::MIN, voltage: 0, current: i32::MIN, charging: false, health: "Dead".into(), cycle_count: 0, capacity_level: 0.0, status: String::new() };
        let json = serde_json::to_string(&b).unwrap();
        let d: BatteryInfo = serde_json::from_str(&json).unwrap();
        assert_eq!(d.temp, i32::MIN);
    }

    #[test]
    fn test_battery_info_empty_strings() {
        let b = BatteryInfo { level: 0, temp: 0, voltage: 0, current: 0, charging: false, health: "".into(), cycle_count: 0, capacity_level: 0.0, status: "".into() };
        let json = serde_json::to_string(&b).unwrap();
        let d: BatteryInfo = serde_json::from_str(&json).unwrap();
        assert!(d.health.is_empty());
        assert!(d.status.is_empty());
    }

    #[test]
    fn test_set_bypass_charging_no_nodes() {
        #[cfg(not(target_os = "android"))]
        assert!(!set_bypass_charging(true));
    }

    #[test]
    fn test_discover_bypass_charging_node_none() {
        #[cfg(not(target_os = "android"))]
        assert!(discover_bypass_charging_node().is_none());
    }

    #[test]
    fn test_read_battery_level_nonexistent() {
        let level = read_battery_level();
        #[cfg(not(target_os = "android"))]
        assert_eq!(level, 0);
    }

    #[test]
    fn test_set_constant_charge_current_max_nonexistent() {
        assert!(!set_constant_charge_current_max(1000000));
    }

    #[test]
    fn test_set_usb_current_max_nonexistent() {
        assert!(!set_usb_current_max(2000000));
    }
}
