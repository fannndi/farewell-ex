use crate::sysfs::{self, SysfsError, SysfsResult};

// ── CABC (Content Adaptive Backlight Control) ──

fn cabc_path() -> &'static str {
    "/sys/devices/platform/kcal_ctrl.0/kcal"
}

pub fn has_cabc() -> bool {
    sysfs::file_exists(cabc_path())
}

pub fn set_cabc_ratio(ratio: i32) -> SysfsResult<bool> {
    if !(0..=255).contains(&ratio) { return Err(SysfsError::ParseError("ratios 0-255".into())); }
    let path = cabc_path();
    let current = sysfs::read_sysfs(path).unwrap_or_default();
    let parts: Vec<&str> = current.split(' ').collect();
    if parts.len() >= 3 {
        let new = format!("{} {} {} {} {} {}", parts[0], parts[1], parts[2], ratio, parts.get(4).unwrap_or(&"0"), parts.get(5).unwrap_or(&"0"));
        let _ = sysfs::chmod(path, "644");
        if sysfs::write_sysfs(path, &new) { return Ok(true); }
    }
    Err(SysfsError::IoError(path.into()))
}

// ── KCAL Color Control ──

fn kcal_paths() -> [&'static str; 3] {
    [
        "/sys/devices/platform/kcal_ctrl.0/kcal",
        "/sys/devices/platform/kcal_ctrl.0/kcal_cont",
        "/sys/devices/platform/kcal_ctrl.0/kcal_sat",
    ]
}

pub fn has_kcal() -> bool {
    kcal_paths().iter().any(|p| sysfs::file_exists(p))
}

pub fn set_kcal_rgb(r: i32, g: i32, b: i32) -> SysfsResult<bool> {
    for v in [&r, &g, &b] {
        if !(0..=255).contains(v) { return Err(SysfsError::ParseError("RGB 0-255".into())); }
    }
    let path = kcal_paths()[0];
    let val = format!("{} {} {}", r, g, b);
    let _ = sysfs::chmod(path, "644");
    if sysfs::write_sysfs(path, &val) { Ok(true) }
    else { Err(SysfsError::IoError(path.into())) }
}

pub fn get_kcal_values() -> String {
    let path = kcal_paths()[0];
    sysfs::read_sysfs_cached(path, 1000).unwrap_or_else(|| "unavailable".into())
}

pub fn set_kcal_contrast(val: i32) -> SysfsResult<bool> {
    if !(128..=256).contains(&val) { return Err(SysfsError::ParseError("contrast 128-256".into())); }
    let path = kcal_paths()[1];
    let _ = sysfs::chmod(path, "644");
    if sysfs::write_sysfs(path, &val.to_string()) { Ok(true) }
    else { Err(SysfsError::IoError(path.into())) }
}

pub fn set_kcal_saturation(val: i32) -> SysfsResult<bool> {
    if !(0..=256).contains(&val) { return Err(SysfsError::ParseError("saturation 0-256".into())); }
    let path = kcal_paths()[2];
    let _ = sysfs::chmod(path, "644");
    if sysfs::write_sysfs(path, &val.to_string()) { Ok(true) }
    else { Err(SysfsError::IoError(path.into())) }
}

// ── DFPS (Dynamic FPS) ──

fn dfps_path() -> &'static str {
    "/sys/devices/virtual/graphics/fb0/dyn_pu"
}

pub fn has_dfps() -> bool {
    sysfs::file_exists(dfps_path())
}

pub fn set_dfps(mode: i32) -> SysfsResult<bool> {
    let path = dfps_path();
    if !sysfs::file_exists(path) {
        let alt = "/sys/class/graphics/fb0/dyn_pu";
        if !sysfs::file_exists(alt) { return Err(SysfsError::NotFound("no DFPS path".into())); }
        return set_dfps_at(alt, mode);
    }
    set_dfps_at(path, mode)
}

fn set_dfps_at(path: &str, mode: i32) -> SysfsResult<bool> {
    let _ = sysfs::chmod(path, "644");
    if sysfs::write_sysfs(path, &mode.to_string()) { Ok(true) }
    else { Err(SysfsError::IoError(path.into())) }
}

pub fn get_dfps_mode() -> i32 {
    for p in &["/sys/devices/virtual/graphics/fb0/dyn_pu", "/sys/class/graphics/fb0/dyn_pu"] {
        if let Some(v) = sysfs::read_sysfs_int(p, 1000) { return v as i32; }
    }
    -1
}

// ── Display Histogram ──

pub fn has_histogram() -> bool {
    sysfs::file_exists("/sys/devices/virtual/graphics/fb0/hist_event")
}

pub fn set_histogram(enable: bool) -> SysfsResult<bool> {
    let path = "/sys/devices/virtual/graphics/fb0/hist_event";
    let _ = sysfs::chmod(path, "644");
    if sysfs::write_sysfs(path, if enable { "1" } else { "0" }) { Ok(true) }
    else { Err(SysfsError::IoError(path.into())) }
}

// ── MIPI DSI Register ──

pub fn has_mipi_reg() -> bool {
    sysfs::file_exists("/sys/class/drm/card0-DSI-1/mipi_reg")
}

pub fn read_mipi_reg() -> String {
    sysfs::read_sysfs_cached("/sys/class/drm/card0-DSI-1/mipi_reg", 1000).unwrap_or_default()
}

pub fn write_mipi_reg(val: &str) -> SysfsResult<bool> {
    let path = "/sys/class/drm/card0-DSI-1/mipi_reg";
    let _ = sysfs::chmod(path, "664");
    if sysfs::write_sysfs(path, val) { Ok(true) }
    else { Err(SysfsError::IoError(path.into())) }
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn test_kcal_rgb_bounds() {
        assert!(set_kcal_rgb(0, 128, 255).is_err());
        assert!(set_kcal_rgb(256, 0, 0).is_err());
        assert!(set_kcal_rgb(-1, 0, 0).is_err());
    }

    #[test]
    fn test_kcal_contrast_bounds() {
        assert!(set_kcal_contrast(128).is_err());
        assert!(set_kcal_contrast(200).is_err());
        assert!(set_kcal_contrast(300).is_err());
    }

    #[test]
    fn test_kcal_saturation_bounds() {
        assert!(set_kcal_saturation(128).is_err());
        assert!(set_kcal_saturation(300).is_err());
    }

    #[test]
    fn test_cabc_ratio_bounds() {
        assert!(set_cabc_ratio(128).is_err());
        assert!(set_cabc_ratio(300).is_err());
    }

    #[test]
    fn test_dfps_no_path() {
        let result = set_dfps(1);
        assert!(result.is_err());
    }

    #[test]
    fn test_has_kcal_no_root() {
        assert!(!has_kcal());
    }

    #[test]
    fn test_get_kcal_values_no_root() {
        assert_eq!(get_kcal_values(), "unavailable");
    }

    #[test]
    fn test_kcal_paths_format() {
        let paths = kcal_paths();
        assert!(paths.iter().all(|p| p.starts_with("/sys/")));
        assert_eq!(paths.len(), 3);
    }

    #[test]
    fn test_get_dfps_mode_no_root() {
        assert_eq!(get_dfps_mode(), -1);
    }
}
