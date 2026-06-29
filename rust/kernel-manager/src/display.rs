use crate::sysfs;
use crate::sysfs::{SysfsError, SysfsResult};

/// Get max backlight brightness value.
///
/// **Sysfs path:** `/sys/class/backlight/*/max_brightness`
/// **Root:** Not required
/// **Returns:** Max brightness value
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

/// Get current backlight brightness value.
///
/// **Sysfs path:** `/sys/class/backlight/*/brightness`
/// **Root:** Not required
/// **Returns:** Current brightness value
pub fn get_current_brightness() -> i32 {
    for path in &[
        "/sys/class/backlight/panel0-backlight/brightness",
        "/sys/class/leds/lcd-backlight/brightness",
    ] {
        if let Some(val) = sysfs::read_sysfs_int(path, 500) { return val as i32; }
    }
    0
}

/// Set backlight brightness value.
///
/// **Sysfs path:** `/sys/class/backlight/*/brightness`
/// **Root:** Required
/// **Returns:** `true` if written successfully
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

/// Set KCAL color control (RGB).
///
/// **Sysfs path:** `/sys/devices/platform/kcal_ctrl.0/kcal`
/// **Root:** Required
/// **Returns:** `true` if written successfully
pub fn set_kcal(r: i32, g: i32, b: i32) -> bool {
    let path = "/sys/devices/platform/kcal_ctrl.0/kcal";
    sysfs::chmod(path, "644");
    let ok = sysfs::write_sysfs(path, &format!("{} {} {}", r, g, b));
    sysfs::chmod(path, "444"); ok
}

/// Toggle backlight dimmer (Encore).
///
/// **Sysfs path:** `/sys/devices/virtual/misc/backlightdimmer/enabled`
/// **Root:** Required
/// **Returns:** `true` if written successfully
pub fn set_backlight_dimmer_enabled(enabled: bool) -> bool {
    let path = "/sys/devices/virtual/misc/backlightdimmer/enabled";
    if !sysfs::file_exists(path) { return false; }
    sysfs::chmod(path, "644");
    let ok = sysfs::write_sysfs(path, if enabled { "1" } else { "0" });
    sysfs::chmod(path, "444"); ok
}

/// Read backlight dimmer status.
///
/// **Sysfs path:** `/sys/devices/virtual/misc/backlightdimmer/enabled`
/// **Root:** Not required
/// **Returns:** `true` if dimmer is enabled, `false` otherwise
pub fn get_backlight_dimmer() -> bool {
    let path = "/sys/devices/virtual/misc/backlightdimmer/enabled";
    sysfs::read_sysfs(path).map_or(false, |v| v.trim() == "1")
}

/// Enable/disable KCAL color control.
///
/// **Sysfs path:** `/sys/devices/platform/kcal_ctrl.0/kcal_enable`
/// **Root:** Required
/// **Returns:** `SysfsResult<bool>`
pub fn set_kcal_enable(enabled: bool) -> SysfsResult<bool> {
    let path = "/sys/devices/platform/kcal_ctrl.0/kcal_enable";
    let _ = sysfs::chmod(path, "644");
    if sysfs::write_sysfs(path, if enabled { "1" } else { "0" }) { Ok(true) }
    else { Err(SysfsError::IoError(path.into())) }
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn test_max_brightness_paths() {
        assert_eq!("/sys/class/backlight/panel0-backlight/max_brightness", "/sys/class/backlight/panel0-backlight/max_brightness");
        assert_eq!("/sys/class/leds/lcd-backlight/max_brightness", "/sys/class/leds/lcd-backlight/max_brightness");
    }

    #[test]
    fn test_brightness_paths() {
        assert_eq!("/sys/class/backlight/panel0-backlight/brightness", "/sys/class/backlight/panel0-backlight/brightness");
        assert_eq!("/sys/class/leds/lcd-backlight/brightness", "/sys/class/leds/lcd-backlight/brightness");
    }

    #[test]
    fn test_kcal_path() {
        assert_eq!("/sys/devices/platform/kcal_ctrl.0/kcal", "/sys/devices/platform/kcal_ctrl.0/kcal");
    }

    #[test]
    fn test_backlight_dimmer_path() {
        assert_eq!("/sys/devices/virtual/misc/backlightdimmer/enabled", "/sys/devices/virtual/misc/backlightdimmer/enabled");
    }

    #[test]
    fn test_set_kcal_format() {
        let formatted = format!("{} {} {}", 255, 255, 255);
        assert_eq!(formatted, "255 255 255");
        let formatted = format!("{} {} {}", 0, 128, 255);
        assert_eq!(formatted, "0 128 255");
    }
}
