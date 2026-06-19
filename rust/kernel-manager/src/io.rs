use crate::sysfs;

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

pub fn set_io_scheduler(device: &str, scheduler: &str) -> bool {
    let path = format!("/sys/block/{}/queue/scheduler", device);
    sysfs::chmod(&path, "644");
    let ok = sysfs::write_sysfs(&path, scheduler);
    sysfs::chmod(&path, "444"); ok
}

pub fn get_available_io_schedulers(device: &str) -> Vec<String> {
    let path = format!("/sys/block/{}/queue/scheduler", device);
    sysfs::read_sysfs_cached(&path, 1000)
        .map(|c| c.replace('[', "").replace(']', "").split_whitespace().map(|s| s.to_string()).collect())
        .unwrap_or_default()
}

pub fn get_io_readahead_kb(device: &str) -> i32 {
    let path = format!("/sys/block/{}/queue/read_ahead_kb", device);
    sysfs::read_sysfs_int(&path, 1000).unwrap_or(0) as i32
}

pub fn set_io_readahead_kb(device: &str, kb: i32) -> bool {
    let path = format!("/sys/block/{}/queue/read_ahead_kb", device);
    sysfs::chmod(&path, "644");
    let ok = sysfs::write_sysfs(&path, &kb.to_string());
    sysfs::chmod(&path, "444"); ok
}

pub fn get_io_nr_requests(device: &str) -> i32 {
    let path = format!("/sys/block/{}/queue/nr_requests", device);
    sysfs::read_sysfs_int(&path, 1000).unwrap_or(0) as i32
}

pub fn set_io_nr_requests(device: &str, nr: i32) -> bool {
    let path = format!("/sys/block/{}/queue/nr_requests", device);
    sysfs::chmod(&path, "644");
    let ok = sysfs::write_sysfs(&path, &nr.to_string());
    sysfs::chmod(&path, "444"); ok
}

pub fn get_io_stats_enabled(device: &str) -> bool {
    let path = format!("/sys/block/{}/queue/iostats", device);
    sysfs::read_sysfs_int(&path, 1000).unwrap_or(1) == 1
}

pub fn set_io_stats_enabled(device: &str, enabled: bool) -> bool {
    let path = format!("/sys/block/{}/queue/iostats", device);
    sysfs::chmod(&path, "644");
    let ok = sysfs::write_sysfs(&path, if enabled { "1" } else { "0" });
    sysfs::chmod(&path, "444"); ok
}
