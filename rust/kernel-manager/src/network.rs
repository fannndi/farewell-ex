use crate::sysfs::{self, SysfsError, SysfsResult};

/// Get current TCP congestion control algorithm.
///
/// **Sysfs path:** `/proc/sys/net/ipv4/tcp_congestion_control`
/// **Root:** Not required
/// **Returns:** Algorithm name (e.g., "cubic")
pub fn get_tcp_congestion() -> String {
    sysfs::read_sysfs_cached("/proc/sys/net/ipv4/tcp_congestion_control", 1000)
        .unwrap_or_else(|| "cubic".to_string())
}

/// Set TCP congestion control algorithm.
///
/// **Sysfs path:** `/proc/sys/net/ipv4/tcp_congestion_control`
/// **Root:** Required
/// **Returns:** `true` if written successfully
pub fn set_tcp_congestion(algo: &str) -> SysfsResult<bool> {
    let path = "/proc/sys/net/ipv4/tcp_congestion_control";
    sysfs::chmod(path, "644");
    let ok = sysfs::write_sysfs(path, algo);
    sysfs::chmod(path, "444");
    if ok { Ok(true) } else { Err(SysfsError::IoError(path.to_string())) }
}

/// Get available TCP congestion control algorithms.
///
/// **Sysfs path:** `/proc/sys/net/ipv4/tcp_available_congestion_control`
/// **Root:** Not required
/// **Returns:** Vec of algorithm name strings
pub fn get_available_tcp_congestion() -> Vec<String> {
    sysfs::read_sysfs_cached("/proc/sys/net/ipv4/tcp_available_congestion_control", 1000)
        .map(|c| c.split_whitespace().map(|s| s.to_string()).collect())
        .unwrap_or_default()
}

/// Toggle kernel dmesg restriction.
///
/// **Sysfs path:** `/proc/sys/kernel/dmesg_restrict`
/// **Root:** Required
/// **Returns:** `true` if written successfully
pub fn set_dmesg_restrict(enabled: bool) -> SysfsResult<bool> {
    let path = "/proc/sys/kernel/dmesg_restrict";
    sysfs::chmod(path, "644");
    let ok = sysfs::write_sysfs(path, if enabled { "1" } else { "0" });
    sysfs::chmod(path, "444");
    if ok { Ok(true) } else { Err(SysfsError::IoError(path.to_string())) }
}

/// Get kernel version string from `/proc/version`.
///
/// **Sysfs path:** `/proc/version`
/// **Root:** Not required
/// **Returns:** Kernel version string
pub fn get_kernel_version() -> String {
    sysfs::read_sysfs_cached("/proc/version", 0).unwrap_or_else(|| "Unknown".to_string())
}

/// Get current printk log level.
///
/// **Sysfs path:** `/proc/sys/kernel/printk`
/// **Root:** Not required
/// **Returns:** Space-separated printk values
pub fn get_printk() -> String {
    sysfs::read_sysfs_cached("/proc/sys/kernel/printk", 1000).unwrap_or_default()
}

/// Set printk console log level (first value).
///
/// **Sysfs path:** `/proc/sys/kernel/printk`
/// **Root:** Required
/// **Returns:** Ok(true) if written
pub fn set_printk(level: i32) -> SysfsResult<bool> {
    let path = "/proc/sys/kernel/printk";
    if !sysfs::file_exists(path) {
        return Err(SysfsError::NotFound(path.to_string()));
    }
    sysfs::chmod(path, "644");
    let ok = sysfs::write_sysfs(path, &level.to_string());
    sysfs::chmod(path, "444");
    if ok { Ok(true) } else { Err(SysfsError::IoError(path.to_string())) }
}

/// Get WireGuard module version.
///
/// **Sysfs path:** `/sys/module/wireguard/version`
/// **Root:** Not required
/// **Returns:** Version string or "not available"
pub fn get_wireguard_version() -> String {
    sysfs::read_sysfs_cached("/sys/module/wireguard/version", 5000)
        .unwrap_or_else(|| "not available".to_string())
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn test_tcp_congestion_path() {
        assert_eq!("/proc/sys/net/ipv4/tcp_congestion_control", "/proc/sys/net/ipv4/tcp_congestion_control");
    }

    #[test]
    fn test_available_tcp_congestion_path() {
        assert_eq!("/proc/sys/net/ipv4/tcp_available_congestion_control", "/proc/sys/net/ipv4/tcp_available_congestion_control");
    }

    #[test]
    fn test_dmesg_restrict_path() {
        assert_eq!("/proc/sys/kernel/dmesg_restrict", "/proc/sys/kernel/dmesg_restrict");
    }

    #[test]
    fn test_kernel_version_path() {
        assert_eq!("/proc/version", "/proc/version");
    }

    #[test]
    fn test_get_tcp_congestion_default() {
        let s = get_tcp_congestion();
        assert!(!s.is_empty());
    }

    #[test]
    fn test_get_kernel_version_default() {
        let v = get_kernel_version();
        // On non-Android, should return "Unknown"
        #[cfg(not(target_os = "android"))]
        assert_eq!(v, "Unknown");
    }

    #[test]
    fn test_available_tcp_congestion_fallback() {
        let v = get_available_tcp_congestion();
        // On non-Android, should be empty
        #[cfg(not(target_os = "android"))]
        assert!(v.is_empty());
    }
}
