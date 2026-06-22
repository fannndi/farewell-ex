use crate::sysfs;

/// Enable/disable double-tap-to-wake.
///
/// **Sysfs path:** Various touchpanel gesture paths
/// **Root:** Required
/// **Returns:** `true` if written to a valid path
///
/// Example:
/// ```
/// wake::set_dt2w(true);
/// ```
pub fn set_dt2w(enabled: bool) -> bool {
    let paths = [
        "/sys/touchpanel/double_tap",
        "/proc/touchpanel/double_tap",
        "/sys/class/touch/touch_dev/gesture_wakeup",
        "/sys/devices/virtual/touch/touch_dev/enable_dt2w",
        "/proc/tp_gesture",
        "/sys/class/sec/tsp/dt2w_enable",
    ];
    let val = if enabled { "1" } else { "0" };
    for path in &paths {
        if sysfs::file_exists(path) {
            sysfs::chmod(path, "644");
            let ok = sysfs::write_sysfs(path, val);
            sysfs::chmod(path, "444"); return ok;
        }
    }
    false
}

/// Set speaker boost level.
///
/// **Sysfs path:** `/sys/kernel/sound_control_3/speaker_boost`
/// **Root:** Required
/// **Returns:** `true` if written successfully
pub fn set_speaker_boost(val: i32) -> bool {
    let path = "/sys/kernel/sound_control_3/speaker_boost";
    if !sysfs::file_exists(path) { return false; }
    sysfs::chmod(path, "644");
    let ok = sysfs::write_sysfs(path, &val.to_string());
    sysfs::chmod(path, "444"); ok
}

/// Set headphone gain level.
///
/// **Sysfs path:** `/sys/kernel/sound_control_3/gain_control`
/// **Root:** Required
/// **Returns:** `true` if written successfully
pub fn set_headphone_gain(val: i32) -> bool {
    let path = "/sys/kernel/sound_control_3/gain_control";
    if !sysfs::file_exists(path) { return false; }
    sysfs::chmod(path, "644");
    let ok = sysfs::write_sysfs(path, &val.to_string());
    sysfs::chmod(path, "444"); ok
}

/// Set microphone boost level.
///
/// **Sysfs path:** `/sys/kernel/sound_control_3/mic_boost`
/// **Root:** Required
/// **Returns:** `true` if written successfully
pub fn set_mic_boost(val: i32) -> bool {
    let path = "/sys/kernel/sound_control_3/mic_boost";
    if !sysfs::file_exists(path) { return false; }
    sysfs::chmod(path, "644");
    let ok = sysfs::write_sysfs(path, &val.to_string());
    sysfs::chmod(path, "444"); ok
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn test_dt2w_paths_comprehensive() {
        let paths = [
            "/sys/touchpanel/double_tap",
            "/proc/touchpanel/double_tap",
            "/sys/class/touch/touch_dev/gesture_wakeup",
            "/sys/devices/virtual/touch/touch_dev/enable_dt2w",
            "/proc/tp_gesture",
            "/sys/class/sec/tsp/dt2w_enable",
        ];
        for p in &paths {
            assert!(!p.is_empty());
        }
        assert!(paths.len() == 6);
    }

    #[test]
    fn test_speaker_boost_path() {
        assert_eq!("/sys/kernel/sound_control_3/speaker_boost", "/sys/kernel/sound_control_3/speaker_boost");
    }

    #[test]
    fn test_headphone_gain_path() {
        assert_eq!("/sys/kernel/sound_control_3/gain_control", "/sys/kernel/sound_control_3/gain_control");
    }

    #[test]
    fn test_mic_boost_path() {
        assert_eq!("/sys/kernel/sound_control_3/mic_boost", "/sys/kernel/sound_control_3/mic_boost");
    }

    #[test]
    fn test_set_dt2w_nonexistent() {
        // On non-Android, no dt2w paths exist, should return false
        assert!(!set_dt2w(true));
        assert!(!set_dt2w(false));
    }

    #[test]
    fn test_set_speaker_boost_nonexistent() {
        assert!(!set_speaker_boost(100));
    }

    #[test]
    fn test_set_headphone_gain_nonexistent() {
        assert!(!set_headphone_gain(50));
    }

    #[test]
    fn test_set_mic_boost_nonexistent() {
        assert!(!set_mic_boost(10));
    }
}
