use crate::sysfs::{self, SysfsError, SysfsResult};

// ── Xiaomi Reverse Charging (3-layer) ──

fn reverse_charge_paths() -> [&'static str; 3] {
    [
        "/sys/class/power_supply/wireless/reverse_chg_mode",
        "/sys/class/qcom-battery/reverse_chg_mode",
        "/sys/class/power_supply/battery/reverse_charge_mode",
    ]
}

pub fn has_reverse_charge() -> bool {
    reverse_charge_paths().iter().any(|p| sysfs::file_exists(p))
}

pub fn set_reverse_charge(enable: bool) -> SysfsResult<bool> {
    let val = if enable { "1" } else { "0" };
    for path in reverse_charge_paths() {
        if sysfs::file_exists(path) {
            let _ = sysfs::chmod(path, "644");
            if sysfs::write_sysfs(path, val) { return Ok(true); }
        }
    }
    Err(SysfsError::NotFound("no reverse charge path".into()))
}

pub fn get_reverse_charge() -> String {
    for path in reverse_charge_paths() {
        if let Some(v) = sysfs::read_sysfs_cached(path, 1000) { return v; }
    }
    "unavailable".into()
}

// ── Night Charging ──

fn night_charging_path() -> &'static str {
    "/sys/class/qcom-battery/night_charging"
}

pub fn has_night_charging() -> bool {
    sysfs::file_exists(night_charging_path())
}

pub fn set_night_charging(enable: bool) -> SysfsResult<bool> {
    let path = night_charging_path();
    let _ = sysfs::chmod(path, "644");
    if sysfs::write_sysfs(path, if enable { "1" } else { "0" }) { Ok(true) }
    else { Err(SysfsError::IoError(path.into())) }
}

pub fn get_night_charging() -> String {
    sysfs::read_sysfs_cached(night_charging_path(), 1000).unwrap_or_else(|| "unavailable".into())
}

// ── Cool Mode ──

fn cool_mode_paths() -> [&'static str; 2] {
    [
        "/sys/class/qcom-battery/cool_mode",
        "/sys/class/power_supply/main/cool_mode",
    ]
}

pub fn has_cool_mode() -> bool {
    cool_mode_paths().iter().any(|p| sysfs::file_exists(p))
}

pub fn set_cool_mode(enable: bool) -> SysfsResult<bool> {
    let val = if enable { "1" } else { "0" };
    for path in cool_mode_paths() {
        if sysfs::file_exists(path) {
            let _ = sysfs::chmod(path, "644");
            if sysfs::write_sysfs(path, val) { return Ok(true); }
        }
    }
    Err(SysfsError::NotFound("no cool mode path".into()))
}

pub fn get_cool_mode() -> String {
    for path in cool_mode_paths() {
        if let Some(v) = sysfs::read_sysfs_cached(path, 1000) { return v; }
    }
    "unavailable".into()
}

// ── Smart Battery ──

fn smart_batt_path() -> &'static str {
    "/sys/class/qcom-battery/smart_batt"
}

pub fn has_smart_battery() -> bool {
    sysfs::file_exists(smart_batt_path())
}

pub fn set_smart_battery(enable: bool) -> SysfsResult<bool> {
    let path = smart_batt_path();
    let _ = sysfs::chmod(path, "644");
    if sysfs::write_sysfs(path, if enable { "1" } else { "0" }) { Ok(true) }
    else { Err(SysfsError::IoError(path.into())) }
}

pub fn get_smart_battery() -> String {
    sysfs::read_sysfs_cached(smart_batt_path(), 1000).unwrap_or_else(|| "unavailable".into())
}

// ── Input Suspend (bypass charging alt) ──

fn input_suspend_path() -> &'static str {
    "/sys/class/qcom-battery/input_suspend"
}

pub fn has_input_suspend() -> bool {
    sysfs::file_exists(input_suspend_path())
}

pub fn set_input_suspend(suspend: bool) -> SysfsResult<bool> {
    let path = input_suspend_path();
    let _ = sysfs::chmod(path, "644");
    if sysfs::write_sysfs(path, if suspend { "1" } else { "0" }) { Ok(true) }
    else { Err(SysfsError::IoError(path.into())) }
}

// ── USB PD Authentication ──

fn usbpd_paths() -> [&'static str; 5] {
    [
        "/sys/class/usbpd/usbpd0/usbpd_verifed",
        "/sys/class/usbpd/usbpd0/request_vdm_cmd",
        "/sys/class/usbpd/usbpd0/verify_process",
        "/sys/class/power_supply/usb/pd_authentication",
        "/sys/class/power_supply/bms/authentic",
    ]
}

pub fn get_usbpd_status() -> Vec<(String, String)> {
    usbpd_paths().iter().map(|p| {
        let v = sysfs::read_sysfs_cached(p, 2000).unwrap_or_else(|| "?".into());
        (p.rsplit('/').next().unwrap_or(p).to_string(), v)
    }).collect()
}

pub fn set_usbpd_verified(enable: bool) -> SysfsResult<bool> {
    let path = "/sys/class/power_supply/bms/authentic";
    if !sysfs::file_exists(path) { return Err(SysfsError::NotFound(path.into())); }
    let _ = sysfs::chmod(path, "644");
    if sysfs::write_sysfs(path, if enable { "1" } else { "0" }) { Ok(true) }
    else { Err(SysfsError::IoError(path.into())) }
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn test_reverse_charge_paths_format() {
        let paths = reverse_charge_paths();
        assert!(paths.iter().all(|p| p.starts_with("/sys/")));
        assert_eq!(paths.len(), 3);
    }

    #[test]
    fn test_cool_mode_paths_format() {
        let paths = cool_mode_paths();
        assert!(paths.iter().all(|p| p.starts_with("/sys/")));
    }

    #[test]
    fn test_usbpd_paths_format() {
        let paths = usbpd_paths();
        assert!(paths.iter().all(|p| p.starts_with("/sys/")));
        assert_eq!(paths.len(), 5);
    }

    #[test]
    fn test_has_reverse_charge_no_root() {
        let result = has_reverse_charge();
        assert!(!result);
    }

    #[test]
    fn test_set_reverse_charge_no_root() {
        let result = set_reverse_charge(true);
        assert!(result.is_err());
    }

    #[test]
    fn test_get_usbpd_status_empty() {
        let status = get_usbpd_status();
        assert!(status.iter().all(|(_, v)| v == "?"));
    }
}
