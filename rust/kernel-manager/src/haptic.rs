use crate::sysfs::{self, SysfsError, SysfsResult};

// ── AW8697 Haptic Driver ──

fn aw8697_paths() -> [&'static str; 4] {
    [
        "/sys/bus/i2c/drivers/aw8697_haptic/2-005a",
        "/sys/bus/i2c/drivers/aw8697_haptic/3-005a",
        "/sys/bus/i2c/drivers/aw8697_haptic/0-005a",
        "/sys/bus/i2c/drivers/awinic_haptic/3-005a",
    ]
}

pub fn has_aw8697() -> bool {
    aw8697_paths().iter().any(|base| sysfs::file_exists(&format!("{}/f0_save", base)))
}

// ── LRA Calibration ──

fn lra_cal_path() -> &'static str {
    "/sys/class/qcom-haptics/lra_calibration"
}

fn lra_imp_path() -> &'static str {
    "/sys/class/qcom-haptics/lra_impedance"
}

pub fn has_lra_calibration() -> bool {
    sysfs::file_exists(lra_cal_path()) || sysfs::file_exists(lra_imp_path())
}

pub fn read_lra_calibration() -> String {
    sysfs::read_sysfs_cached(lra_cal_path(), 2000).unwrap_or_else(|| {
        sysfs::read_sysfs_cached(lra_imp_path(), 2000).unwrap_or_else(|| "unavailable".into())
    })
}

pub fn read_aw8697_f0(bus_addr: &str) -> String {
    let path = format!("/sys/bus/i2c/drivers/aw8697_haptic/{}/f0_save", bus_addr);
    sysfs::read_sysfs_cached(&path, 5000).unwrap_or_else(|| {
        let alt = format!("/sys/bus/i2c/drivers/awinic_haptic/{}/f0_save", bus_addr);
        sysfs::read_sysfs_cached(&alt, 5000).unwrap_or_else(|| "unavailable".into())
    })
}

// ── Custom Waveform ──

pub fn has_custom_wave() -> bool {
    aw8697_paths().iter().any(|base| sysfs::file_exists(&format!("{}/custom_wave", base)))
}

pub fn write_custom_wave(bus_addr: &str, data: &str) -> SysfsResult<bool> {
    let path = format!("/sys/bus/i2c/drivers/aw8697_haptic/{}/custom_wave", bus_addr);
    let _ = sysfs::chmod(&path, "666");
    if sysfs::write_sysfs(&path, data) { Ok(true) }
    else { Err(SysfsError::IoError(path)) }
}

// ── Oscillator Save ──

pub fn read_osc_save(bus_addr: &str) -> String {
    let path = format!("/sys/bus/i2c/drivers/aw8697_haptic/{}/osc_save", bus_addr);
    sysfs::read_sysfs_cached(&path, 5000).unwrap_or_else(|| "unavailable".into())
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn test_aw8697_paths_format() {
        let paths = aw8697_paths();
        assert!(paths.iter().all(|p| p.starts_with("/sys/")));
    }

    #[test]
    fn test_has_aw8697_no_root() {
        assert!(!has_aw8697());
    }

    #[test]
    fn test_read_lra_calibration_no_root() {
        assert_eq!(read_lra_calibration(), "unavailable");
    }

    #[test]
    fn test_read_aw8697_f0_no_root() {
        let val = read_aw8697_f0("2-005a");
        assert_eq!(val, "unavailable");
    }

    #[test]
    fn test_read_osc_save_no_root() {
        let val = read_osc_save("2-005a");
        assert_eq!(val, "unavailable");
    }

    #[test]
    fn test_write_custom_wave_no_root() {
        let result = write_custom_wave("2-005a", "1 2 3");
        assert!(result.is_err());
    }

    #[test]
    fn test_has_lra_calibration_no_root() {
        assert!(!has_lra_calibration());
    }

    #[test]
    fn test_has_custom_wave_no_root() {
        assert!(!has_custom_wave());
    }
}
