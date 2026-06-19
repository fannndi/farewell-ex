use crate::sysfs;

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

pub fn set_speaker_boost(val: i32) -> bool {
    let path = "/sys/kernel/sound_control_3/speaker_boost";
    if !sysfs::file_exists(path) { return false; }
    sysfs::chmod(path, "644");
    let ok = sysfs::write_sysfs(path, &val.to_string());
    sysfs::chmod(path, "444"); ok
}

pub fn set_headphone_gain(val: i32) -> bool {
    let path = "/sys/kernel/sound_control_3/gain_control";
    if !sysfs::file_exists(path) { return false; }
    sysfs::chmod(path, "644");
    let ok = sysfs::write_sysfs(path, &val.to_string());
    sysfs::chmod(path, "444"); ok
}

pub fn set_mic_boost(val: i32) -> bool {
    let path = "/sys/kernel/sound_control_3/mic_boost";
    if !sysfs::file_exists(path) { return false; }
    sysfs::chmod(path, "644");
    let ok = sysfs::write_sysfs(path, &val.to_string());
    sysfs::chmod(path, "444"); ok
}
