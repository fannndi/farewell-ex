use crate::sysfs;

pub fn get_tcp_congestion() -> String {
    sysfs::read_sysfs_cached("/proc/sys/net/ipv4/tcp_congestion_control", 1000)
        .unwrap_or_else(|| "cubic".to_string())
}

pub fn set_tcp_congestion(algo: &str) -> bool {
    let path = "/proc/sys/net/ipv4/tcp_congestion_control";
    sysfs::chmod(path, "644");
    let ok = sysfs::write_sysfs(path, algo);
    sysfs::chmod(path, "444"); ok
}

pub fn get_available_tcp_congestion() -> Vec<String> {
    sysfs::read_sysfs_cached("/proc/sys/net/ipv4/tcp_available_congestion_control", 1000)
        .map(|c| c.split_whitespace().map(|s| s.to_string()).collect())
        .unwrap_or_default()
}

pub fn set_dmesg_restrict(enabled: bool) -> bool {
    let path = "/proc/sys/kernel/dmesg_restrict";
    sysfs::chmod(path, "644");
    let ok = sysfs::write_sysfs(path, if enabled { "1" } else { "0" });
    sysfs::chmod(path, "444"); ok
}

pub fn get_kernel_version() -> String {
    sysfs::read_sysfs_cached("/proc/version", 0).unwrap_or_else(|| "Unknown".to_string())
}
