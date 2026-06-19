use crate::sysfs;

pub fn get_max_brightness() -> i32 {
    for path in &[
        "/sys/class/backlight/panel0-backlight/max_brightness",
        "/sys/class/leds/lcd-backlight/max_brightness",
        "/sys/class/leds/wled/brightness",
    ] {
        if let Some(val) = sysfs::read_sysfs_int(path, 1000) { return val as i32; }
    }
    0
}

pub fn get_current_brightness() -> i32 {
    for path in &[
        "/sys/class/backlight/panel0-backlight/brightness",
        "/sys/class/leds/lcd-backlight/brightness",
    ] {
        if let Some(val) = sysfs::read_sysfs_int(path, 500) { return val as i32; }
    }
    0
}

pub fn set_brightness(val: i32) -> bool {
    for path in &[
        "/sys/class/backlight/panel0-backlight/brightness",
        "/sys/class/leds/lcd-backlight/brightness",
    ] {
        if sysfs::file_exists(path) {
            sysfs::chmod(path, "644");
            let ok = sysfs::write_sysfs(path, &val.to_string());
            sysfs::chmod(path, "444"); return ok;
        }
    }
    false
}

pub fn set_kcal(r: i32, g: i32, b: i32) -> bool {
    let path = "/sys/devices/platform/kcal_ctrl.0/kcal";
    sysfs::chmod(path, "644");
    let ok = sysfs::write_sysfs(path, &format!("{} {} {}", r, g, b));
    sysfs::chmod(path, "444"); ok
}

pub fn set_backlight_dimmer_enabled(enabled: bool) -> bool {
    let path = "/sys/devices/virtual/misc/backlightdimmer/enabled";
    if !sysfs::file_exists(path) { return false; }
    sysfs::chmod(path, "644");
    let ok = sysfs::write_sysfs(path, if enabled { "1" } else { "0" });
    sysfs::chmod(path, "444"); ok
}
