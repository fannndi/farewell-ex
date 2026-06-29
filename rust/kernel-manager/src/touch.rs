use crate::sysfs;

const XIAOMI_TOUCH_DEV: &str = "/dev/xiaomi-touch";
const FOD_STATUS_PATH: &str = "/sys/class/touch/tp_dev/fod_status";
const TP_LOCKDOWN_PATH: &str = "/proc/tp_lockdown_info";
const TP_INFO_PATH: &str = "/proc/tp_info";
const TP_GESTURE_PATH: &str = "/proc/tp_gesture";

pub fn has_xiaomi_touch() -> bool {
    sysfs::file_exists(XIAOMI_TOUCH_DEV)
}

pub fn get_fod_status() -> String {
    sysfs::read_sysfs_cached(FOD_STATUS_PATH, 1000).unwrap_or_default()
}

pub fn has_fod() -> bool {
    sysfs::file_exists(FOD_STATUS_PATH)
}

pub fn has_tp_lockdown() -> bool {
    sysfs::file_exists(TP_LOCKDOWN_PATH)
}

pub fn read_tp_info() -> String {
    sysfs::read_sysfs(TP_INFO_PATH).unwrap_or_default()
}

pub fn read_tp_gesture() -> String {
    sysfs::read_sysfs(TP_GESTURE_PATH).unwrap_or_default()
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn test_path_constants() {
        assert_eq!(XIAOMI_TOUCH_DEV, "/dev/xiaomi-touch");
        assert_eq!(FOD_STATUS_PATH, "/sys/class/touch/tp_dev/fod_status");
        assert_eq!(TP_LOCKDOWN_PATH, "/proc/tp_lockdown_info");
        assert_eq!(TP_INFO_PATH, "/proc/tp_info");
        assert_eq!(TP_GESTURE_PATH, "/proc/tp_gesture");
    }

    #[test]
    fn test_has_xiaomi_touch_no_device() {
        assert!(!has_xiaomi_touch());
    }

    #[test]
    fn test_has_fod_no_device() {
        assert!(!has_fod());
    }

    #[test]
    fn test_has_tp_lockdown_no_root() {
        assert!(!has_tp_lockdown());
    }

    #[test]
    fn test_get_fod_status_nonexistent() {
        let s = get_fod_status();
        assert!(s.is_empty());
    }

    #[test]
    fn test_read_tp_info_nonexistent() {
        let s = read_tp_info();
        assert!(s.is_empty());
    }

    #[test]
    fn test_read_tp_gesture_nonexistent() {
        let s = read_tp_gesture();
        assert!(s.is_empty());
    }
}
