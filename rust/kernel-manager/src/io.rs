use crate::sysfs;

/// Get current I/O scheduler for a block device.
///
/// **Sysfs path:** `/sys/block/*/queue/scheduler`
/// **Root:** Not required
/// **Returns:** Current scheduler name (e.g., "cfq", "noop")
pub fn get_io_scheduler(device: &str) -> String {
    let path = format!("/sys/block/{}/queue/scheduler", device);
    if let Some(content) = sysfs::read_sysfs_cached(&path, 1000) {
        // Format: [current] other1 other2
        if let Some(start) = content.find('[') {
            if let Some(end) = content.find(']') {
                return content[start+1..end].to_string();
            }
        }
        return content.split_whitespace().next().unwrap_or("none").to_string();
    }
    "none".to_string()
}

/// Set I/O scheduler for a block device.
///
/// **Sysfs path:** `/sys/block/*/queue/scheduler`
/// **Root:** Required
/// **Returns:** `true` if written successfully
pub fn set_io_scheduler(device: &str, scheduler: &str) -> bool {
    let path = format!("/sys/block/{}/queue/scheduler", device);
    sysfs::chmod(&path, "644");
    let ok = sysfs::write_sysfs(&path, scheduler);
    sysfs::chmod(&path, "444"); ok
}

/// Get available I/O schedulers for a block device.
///
/// **Sysfs path:** `/sys/block/*/queue/scheduler`
/// **Root:** Not required
/// **Returns:** Vec of scheduler name strings
pub fn get_available_io_schedulers(device: &str) -> Vec<String> {
    let path = format!("/sys/block/{}/queue/scheduler", device);
    sysfs::read_sysfs_cached(&path, 1000)
        .map(|c| c.replace('[', "").replace(']', "").split_whitespace().map(|s| s.to_string()).collect())
        .unwrap_or_default()
}

/// Get read-ahead size in KB for a block device.
///
/// **Sysfs path:** `/sys/block/*/queue/read_ahead_kb`
/// **Root:** Not required
/// **Returns:** Read-ahead in KB
pub fn get_io_readahead_kb(device: &str) -> i32 {
    let path = format!("/sys/block/{}/queue/read_ahead_kb", device);
    sysfs::read_sysfs_int(&path, 1000).unwrap_or(0) as i32
}

/// Set read-ahead size in KB for a block device.
///
/// **Sysfs path:** `/sys/block/*/queue/read_ahead_kb`
/// **Root:** Required
/// **Returns:** `true` if written successfully
pub fn set_io_readahead_kb(device: &str, kb: i32) -> bool {
    let path = format!("/sys/block/{}/queue/read_ahead_kb", device);
    sysfs::chmod(&path, "644");
    let ok = sysfs::write_sysfs(&path, &kb.to_string());
    sysfs::chmod(&path, "444"); ok
}

/// Get max number of I/O requests for a block device.
///
/// **Sysfs path:** `/sys/block/*/queue/nr_requests`
/// **Root:** Not required
/// **Returns:** Max requests count
pub fn get_io_nr_requests(device: &str) -> i32 {
    let path = format!("/sys/block/{}/queue/nr_requests", device);
    sysfs::read_sysfs_int(&path, 1000).unwrap_or(0) as i32
}

/// Set max number of I/O requests for a block device.
///
/// **Sysfs path:** `/sys/block/*/queue/nr_requests`
/// **Root:** Required
/// **Returns:** `true` if written successfully
pub fn set_io_nr_requests(device: &str, nr: i32) -> bool {
    let path = format!("/sys/block/{}/queue/nr_requests", device);
    sysfs::chmod(&path, "644");
    let ok = sysfs::write_sysfs(&path, &nr.to_string());
    sysfs::chmod(&path, "444"); ok
}

/// Check if I/O stats are enabled for a block device.
///
/// **Sysfs path:** `/sys/block/*/queue/iostats`
/// **Root:** Not required
/// **Returns:** `true` if iostats enabled
pub fn get_io_stats_enabled(device: &str) -> bool {
    let path = format!("/sys/block/{}/queue/iostats", device);
    sysfs::read_sysfs_int(&path, 1000).unwrap_or(1) == 1
}

/// Enable/disable I/O stats for a block device.
///
/// **Sysfs path:** `/sys/block/*/queue/iostats`
/// **Root:** Required
/// **Returns:** `true` if written successfully
pub fn set_io_stats_enabled(device: &str, enabled: bool) -> bool {
    let path = format!("/sys/block/{}/queue/iostats", device);
    sysfs::chmod(&path, "644");
    let ok = sysfs::write_sysfs(&path, if enabled { "1" } else { "0" });
    sysfs::chmod(&path, "444"); ok
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn test_format_scheduler_path() {
        let p = format!("/sys/block/{}/queue/scheduler", "sda");
        assert_eq!(p, "/sys/block/sda/queue/scheduler");
    }

    #[test]
    fn test_format_readahead_path() {
        let p = format!("/sys/block/{}/queue/read_ahead_kb", "mmcblk0");
        assert_eq!(p, "/sys/block/mmcblk0/queue/read_ahead_kb");
    }

    #[test]
    fn test_format_nr_requests_path() {
        let p = format!("/sys/block/{}/queue/nr_requests", "sda");
        assert_eq!(p, "/sys/block/sda/queue/nr_requests");
    }

    #[test]
    fn test_format_iostats_path() {
        let p = format!("/sys/block/{}/queue/iostats", "nvme0n1");
        assert_eq!(p, "/sys/block/nvme0n1/queue/iostats");
    }

    #[test]
    fn test_io_path_edge_cases() {
        let p = format!("/sys/block/{}/queue/scheduler", "");
        assert_eq!(p, "/sys/block//queue/scheduler");
    }

    #[test]
    fn test_get_io_scheduler_nonexistent() {
        let s = get_io_scheduler("farewell_nonexistent_device");
        assert_eq!(s, "none");
    }

    #[test]
    fn test_available_schedulers_nonexistent() {
        let v = get_available_io_schedulers("farewell_nonexistent_device");
        assert!(v.is_empty());
    }

    #[test]
    fn test_scheduler_bracket_parsing() {
        let content = "[none] mq-deadline kyber";
        let active = content.find('[').and_then(|s| content.find(']')).map(|e| &content[1..e]);
        assert_eq!(active, Some("none"));
    }
}
