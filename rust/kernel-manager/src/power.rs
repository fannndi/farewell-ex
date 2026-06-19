use crate::sysfs;
use serde::{Deserialize, Serialize};
use std::sync::Once;

static mut CAPACITY_FD: i32 = -1;
static mut TEMP_FD: i32 = -1;
static mut VOLTAGE_FD: i32 = -1;
static mut CURRENT_FD: i32 = -1;
static INIT: Once = Once::new();

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

pub fn read_battery_level() -> i32 {
    ensure_init();
    unsafe { if let Some(v) = read_fd_int(CAPACITY_FD) { return v as i32; } }
    sysfs::read_sysfs_int("/sys/class/power_supply/battery/capacity", 500).unwrap_or(0) as i32
}

pub fn read_battery_temp() -> i32 {
    ensure_init();
    unsafe { if let Some(v) = read_fd_int(TEMP_FD) { return v as i32; } }
    sysfs::read_sysfs_int("/sys/class/power_supply/battery/temp", 500).unwrap_or(0) as i32
}

pub fn read_battery_voltage_mv() -> i32 {
    ensure_init();
    unsafe { if let Some(v) = read_fd_int(VOLTAGE_FD) { return (v / 1000) as i32; } }
    let v = sysfs::read_sysfs_int("/sys/class/power_supply/battery/voltage_now", 500).unwrap_or(0);
    (v / 1000) as i32
}

pub fn read_battery_current_ma() -> i32 {
    ensure_init();
    let raw = unsafe { read_fd_int(CURRENT_FD).unwrap_or_else(|| {
        sysfs::read_sysfs_int("/sys/class/power_supply/battery/current_now", 500).unwrap_or(0).into()
    })};
    let abs = raw.abs();
    if abs < 10000 { abs as i32 } else { (abs / 1000) as i32 }
}

pub fn is_charging() -> bool {
    sysfs::read_sysfs_cached("/sys/class/power_supply/battery/status", 500)
        .map(|s| s.contains("Charging")).unwrap_or(false)
}

pub fn read_wakeup_count() -> i32 {
    sysfs::read_sysfs_int("/sys/power/wakeup_count", 1000).unwrap_or(0) as i32
}

pub fn read_suspend_count() -> i32 {
    sysfs::read_sysfs_int("/sys/kernel/debug/suspend_stats/success", 1000).unwrap_or(0) as i32
}

pub fn read_cycle_count() -> i32 {
    for path in &["/sys/class/power_supply/bms/cycle_count", "/sys/class/power_supply/battery/cycle_count", "/sys/class/power_supply/bat/cycle_count"] {
        if let Some(v) = sysfs::read_sysfs_int(path, 1000) { return v as i32; }
    }
    -1
}

pub fn read_battery_health() -> String {
    sysfs::read_sysfs_cached("/sys/class/power_supply/battery/health", 1000).unwrap_or_else(|| "Unknown".to_string())
}

pub fn read_battery_capacity_level() -> f32 {
    let design = sysfs::read_sysfs_int("/sys/class/power_supply/battery/charge_full_design", 5000).unwrap_or(0) as f32;
    let current = sysfs::read_sysfs_int("/sys/class/power_supply/battery/charge_full", 5000).unwrap_or(0) as f32;
    if design > 0.0 && current > 0.0 {
        let pct = (current / design) * 100.0;
        if pct >= 50.0 && pct <= 100.0 { return pct; }
    }
    100.0
}

pub fn read_battery_status() -> String {
    sysfs::read_sysfs_cached("/sys/class/power_supply/battery/status", 500).unwrap_or_else(|| "Unknown".to_string())
}

pub fn set_bypass_charging(enable: bool) -> bool {
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
            return ok;
        }
    }
    false
}
