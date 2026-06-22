use crate::sysfs;
use serde::{Deserialize, Serialize};

// ==================== Disk I/O Stats (/proc/diskstats) ====================

#[derive(Debug, Clone, Serialize, Deserialize)]
pub struct DiskStats {
    pub device: String,
    pub reads_completed: u64,
    pub reads_merged: u64,
    pub sectors_read: u64,
    pub read_time_ms: u64,
    pub writes_completed: u64,
    pub writes_merged: u64,
    pub sectors_written: u64,
    pub write_time_ms: u64,
    pub io_in_progress: u64,
    pub io_time_ms: u64,
    pub weighted_io_time_ms: u64,
}

pub fn read_diskstats() -> Vec<DiskStats> {
    let content = match sysfs::read_sysfs("/proc/diskstats") {
        Some(c) => c,
        None => return Vec::new(),
    };
    
    content.lines()
        .filter_map(|line| {
            let parts: Vec<&str> = line.split_whitespace().collect();
            if parts.len() < 14 { return None; }
            Some(DiskStats {
                device: parts[2].to_string(),
                reads_completed: parts[3].parse().unwrap_or(0),
                reads_merged: parts[4].parse().unwrap_or(0),
                sectors_read: parts[5].parse().unwrap_or(0),
                read_time_ms: parts[6].parse().unwrap_or(0),
                writes_completed: parts[7].parse().unwrap_or(0),
                writes_merged: parts[8].parse().unwrap_or(0),
                sectors_written: parts[9].parse().unwrap_or(0),
                write_time_ms: parts[10].parse().unwrap_or(0),
                io_in_progress: parts[11].parse().unwrap_or(0),
                io_time_ms: parts[12].parse().unwrap_or(0),
                weighted_io_time_ms: parts[13].parse().unwrap_or(0),
            })
        })
        .filter(|d| d.device.starts_with("sda") || d.device.starts_with("mmcblk") || d.device.starts_with("nvme") || d.device.starts_with("zram"))
        .collect()
}

pub fn read_diskstats_json() -> String {
    let stats = read_diskstats();
    serde_json::to_string(&stats).unwrap_or_else(|_| "[]".to_string())
}

pub fn get_io_read_time(device: &str) -> u64 {
    read_diskstats().into_iter()
        .find(|s| s.device == device)
        .map(|s| s.read_time_ms)
        .unwrap_or(0)
}

pub fn get_io_write_time(device: &str) -> u64 {
    read_diskstats().into_iter()
        .find(|s| s.device == device)
        .map(|s| s.write_time_ms)
        .unwrap_or(0)
}
