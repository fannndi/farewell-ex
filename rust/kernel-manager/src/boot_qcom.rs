use crate::sysfs::{self, SysfsError, SysfsResult};

// ── DSP/NPU Boot ──

fn boot_paths() -> [&'static str; 5] {
    [
        "/sys/kernel/boot_adsp/boot",
        "/sys/kernel/boot_cdsp/boot",
        "/sys/devices/virtual/npu/msm_npu/boot",
        "/sys/devices/virtual/cvp/cvp/boot",
        "/sys/kernel/boot_slpi/boot",
    ]
}

#[derive(Debug, Clone, PartialEq)]
pub enum DspType { Adsp, Cdsp, Npu, Cvp, Slpi }

pub fn has_dsp(dsp: &DspType) -> bool {
    let idx = match dsp {
        DspType::Adsp => 0, DspType::Cdsp => 1, DspType::Npu => 2,
        DspType::Cvp => 3, DspType::Slpi => 4,
    };
    sysfs::file_exists(boot_paths()[idx])
}

pub fn boot_dsp(dsp: &DspType) -> SysfsResult<bool> {
    let idx = match dsp {
        DspType::Adsp => 0, DspType::Cdsp => 1, DspType::Npu => 2,
        DspType::Cvp => 3, DspType::Slpi => 4,
    };
    let path = boot_paths()[idx];
    if !sysfs::file_exists(path) { return Err(SysfsError::NotFound(path.into())); }
    let _ = sysfs::chmod(path, "644");
    if sysfs::write_sysfs(path, "1") { Ok(true) }
    else { Err(SysfsError::IoError(path.into())) }
}

pub fn shutdown_dsp(dsp: &DspType) -> SysfsResult<bool> {
    let idx = match dsp {
        DspType::Adsp => 0, DspType::Cdsp => 1, DspType::Npu => 2,
        DspType::Cvp => 3, DspType::Slpi => 4,
    };
    let path = boot_paths()[idx];
    if !sysfs::file_exists(path) { return Err(SysfsError::NotFound(path.into())); }
    let _ = sysfs::chmod(path, "644");
    if sysfs::write_sysfs(path, "0") { Ok(true) }
    else { Err(SysfsError::IoError(path.into())) }
}

pub fn get_boot_status_json() -> String {
    let names = ["adsp", "cdsp", "npu", "cvp", "slpi"];
    let mut parts: Vec<String> = Vec::new();
    for (i, name) in names.iter().enumerate() {
        let v = sysfs::read_sysfs_cached(boot_paths()[i], 2000).unwrap_or_else(|| "?".into());
        parts.push(format!("\"{}\":\"{}\"", name, v.trim()));
    }
    format!("{{{}}}", parts.join(","))
}

// ── UFS Clock Scaling ──

fn ufs_clk_path() -> &'static str {
    "/sys/bus/platform/devices/1d84000.ufshc/clkscale_enable"
}

pub fn has_ufs_clkscale() -> bool {
    sysfs::file_exists(ufs_clk_path())
}

pub fn set_ufs_clkscale(enable: bool) -> SysfsResult<bool> {
    let path = ufs_clk_path();
    let _ = sysfs::chmod(path, "644");
    if sysfs::write_sysfs(path, if enable { "1" } else { "0" }) { Ok(true) }
    else { Err(SysfsError::IoError(path.into())) }
}

pub fn get_ufs_clkscale() -> String {
    sysfs::read_sysfs_cached(ufs_clk_path(), 2000).unwrap_or_else(|| "unavailable".into())
}

// ── Subsystem Restart ──

fn subsys_debug_path() -> &'static str {
    "/sys/module/subsystem_restart/parameters/enable_debug"
}

fn subsys_ramdumps_path() -> &'static str {
    "/sys/module/subsystem_restart/parameters/enable_ramdumps"
}

pub fn get_subsys_config_json() -> String {
    let debug = sysfs::read_sysfs_cached(subsys_debug_path(), 2000).unwrap_or_else(|| "?".into());
    let ramdumps = sysfs::read_sysfs_cached(subsys_ramdumps_path(), 2000).unwrap_or_else(|| "?".into());
    format!("{{\"enable_debug\":\"{}\",\"enable_ramdumps\":\"{}\"}}", debug.trim(), ramdumps.trim())
}

// ── Dload Mode ──

fn dload_path() -> &'static str {
    "/sys/kernel/dload/emmc_dload"
}

pub fn has_dload() -> bool {
    sysfs::file_exists(dload_path())
}

pub fn set_dload(enable: bool) -> SysfsResult<bool> {
    let path = dload_path();
    let _ = sysfs::chmod(path, "644");
    if sysfs::write_sysfs(path, if enable { "1" } else { "0" }) { Ok(true) }
    else { Err(SysfsError::IoError(path.into())) }
}

// ── WLAN Shutdown ──

fn wlan_shutdown_path() -> &'static str {
    "/sys/kernel/shutdown_wlan/shutdown"
}

pub fn shutdown_wlan() -> SysfsResult<bool> {
    let path = wlan_shutdown_path();
    if !sysfs::file_exists(path) { return Err(SysfsError::NotFound(path.into())); }
    let _ = sysfs::chmod(path, "644");
    if sysfs::write_sysfs(path, "1") { Ok(true) }
    else { Err(SysfsError::IoError(path.into())) }
}

// ── USB ICL (Input Current Limit) ──

fn usb_icl_active_path() -> &'static str {
    "/sys/kernel/debug/pmic-votable/USB_ICL/force_active"
}

fn usb_icl_val_path() -> &'static str {
    "/sys/kernel/debug/pmic-votable/USB_ICL/force_val"
}

pub fn has_usb_icl() -> bool {
    sysfs::file_exists(usb_icl_active_path())
}

pub fn set_usb_icl(active: bool, val_ma: i32) -> SysfsResult<bool> {
    let act_path = usb_icl_active_path();
    let val_path = usb_icl_val_path();
    if !sysfs::file_exists(act_path) { return Err(SysfsError::NotFound(act_path.into())); }
    let _ = sysfs::chmod(act_path, "644");
    let _ = sysfs::chmod(val_path, "644");

    if !sysfs::write_sysfs(val_path, &val_ma.to_string()) { return Err(SysfsError::IoError(val_path.into())); }
    if !sysfs::write_sysfs(act_path, if active { "1" } else { "0" }) { return Err(SysfsError::IoError(act_path.into())); }
    Ok(true)
}

pub fn get_usb_icl() -> String {
    let active = sysfs::read_sysfs_cached(usb_icl_active_path(), 1000).unwrap_or_else(|| "?".into());
    let val = sysfs::read_sysfs_cached(usb_icl_val_path(), 1000).unwrap_or_else(|| "?".into());
    format!("{{\"active\":\"{}\",\"val_ma\":\"{}\"}}", active.trim(), val.trim())
}

// ── Convenience Boot Fns ──

pub fn set_boot_adsp() -> SysfsResult<bool> { boot_dsp(&DspType::Adsp) }
pub fn set_boot_cdsp() -> SysfsResult<bool> { boot_dsp(&DspType::Cdsp) }
pub fn set_boot_npu() -> SysfsResult<bool> { boot_dsp(&DspType::Npu) }
pub fn set_boot_cvp() -> SysfsResult<bool> { boot_dsp(&DspType::Cvp) }
pub fn set_boot_slpi() -> SysfsResult<bool> { boot_dsp(&DspType::Slpi) }

fn boot_type_name(dsp: &DspType) -> &'static str {
    match dsp {
        DspType::Adsp => "adsp", DspType::Cdsp => "cdsp",
        DspType::Npu => "npu", DspType::Cvp => "cvp", DspType::Slpi => "slpi",
    }
}

pub fn get_dsp_name(dsp: &DspType) -> String {
    boot_type_name(dsp).to_string()
}

// ── PIL Timeouts (Modem boot) ──

fn pil_mba_path() -> &'static str {
    "/sys/module/pil_msa/parameters/pbl_mba_boot_timeout_ms"
}

fn pil_modem_path() -> &'static str {
    "/sys/module/pil_msa/parameters/modem_auth_timeout_ms"
}

fn pil_proxy_path() -> &'static str {
    "/sys/module/peripheral_loader/parameters/proxy_timeout_ms"
}

pub fn get_pil_timeouts_json() -> String {
    let mba = sysfs::read_sysfs_cached(pil_mba_path(), 5000).unwrap_or_else(|| "?".into());
    let modem = sysfs::read_sysfs_cached(pil_modem_path(), 5000).unwrap_or_else(|| "?".into());
    let proxy = sysfs::read_sysfs_cached(pil_proxy_path(), 5000).unwrap_or_else(|| "?".into());
    format!("{{\"pbl_mba_timeout_ms\":\"{}\",\"modem_auth_timeout_ms\":\"{}\",\"proxy_timeout_ms\":\"{}\"}}",
            mba.trim(), modem.trim(), proxy.trim())
}

pub fn set_pbl_mba_timeout_ms(ms: i32) -> SysfsResult<bool> {
    let path = pil_mba_path();
    let _ = sysfs::chmod(path, "644");
    if sysfs::write_sysfs(path, &ms.to_string()) { Ok(true) }
    else { Err(SysfsError::IoError(path.into())) }
}

pub fn set_modem_auth_timeout_ms(ms: i32) -> SysfsResult<bool> {
    let path = pil_modem_path();
    let _ = sysfs::chmod(path, "644");
    if sysfs::write_sysfs(path, &ms.to_string()) { Ok(true) }
    else { Err(SysfsError::IoError(path.into())) }
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn test_dsp_types() {
        assert_eq!(DspType::Adsp, DspType::Adsp);
        assert_ne!(DspType::Adsp, DspType::Cdsp);
    }

    #[test]
    fn test_boot_paths_format() {
        let paths = boot_paths();
        assert!(paths.iter().all(|p| p.starts_with("/sys/")));
        assert_eq!(paths.len(), 5);
    }

    #[test]
    fn test_has_dsp_no_root() {
        assert!(!has_dsp(&DspType::Adsp));
        assert!(!has_dsp(&DspType::Cdsp));
    }

    #[test]
    fn test_boot_dsp_no_root() {
        assert!(boot_dsp(&DspType::Adsp).is_err());
        assert!(boot_dsp(&DspType::Cdsp).is_err());
    }

    #[test]
    fn test_has_ufs_clkscale_no_root() {
        assert!(!has_ufs_clkscale());
    }

    #[test]
    fn test_set_ufs_clkscale_no_root() {
        assert!(set_ufs_clkscale(true).is_err());
    }

    #[test]
    fn test_has_dload_no_root() {
        assert!(!has_dload());
    }

    #[test]
    fn test_shutdown_wlan_no_root() {
        assert!(shutdown_wlan().is_err());
    }

    #[test]
    fn test_has_usb_icl_no_root() {
        assert!(!has_usb_icl());
    }

    #[test]
    fn test_get_boot_status_json_format() {
        let json = get_boot_status_json();
        assert!(json.starts_with('{'));
        assert!(json.ends_with('}'));
        assert!(json.contains("adsp"));
        assert!(json.contains("slpi"));
    }

    #[test]
    fn test_get_subsys_config_json_format() {
        let json = get_subsys_config_json();
        assert!(json.starts_with('{'));
        assert!(json.contains("enable_debug"));
    }

    #[test]
    fn test_convenience_boot_fns_no_root() {
        assert!(set_boot_adsp().is_err());
        assert!(set_boot_cdsp().is_err());
        assert!(set_boot_npu().is_err());
        assert!(set_boot_cvp().is_err());
        assert!(set_boot_slpi().is_err());
    }

    #[test]
    fn test_dsp_name() {
        assert_eq!(get_dsp_name(&DspType::Adsp), "adsp");
        assert_eq!(get_dsp_name(&DspType::Cdsp), "cdsp");
        assert_eq!(get_dsp_name(&DspType::Npu), "npu");
        assert_eq!(get_dsp_name(&DspType::Cvp), "cvp");
        assert_eq!(get_dsp_name(&DspType::Slpi), "slpi");
    }

    #[test]
    fn test_set_pil_timeouts_no_root() {
        assert!(set_pbl_mba_timeout_ms(10000).is_err());
        assert!(set_modem_auth_timeout_ms(5000).is_err());
    }

    #[test]
    fn test_pil_timeout_value_format() {
        let ms = 15000i32;
        assert_eq!(ms.to_string(), "15000");
        let ms = 0i32;
        assert_eq!(ms.to_string(), "0");
    }
}
