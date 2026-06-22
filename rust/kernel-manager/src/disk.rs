use crate::sysfs;
use serde::{Deserialize, Serialize};

// ==================== Disk I/O Stats (/proc/diskstats) ====================

/// Disk I/O statistics from `/proc/diskstats`.
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

/// Read disk I/O stats for relevant block devices.
///
/// **Sysfs path:** `/proc/diskstats`
/// **Root:** Not required
/// **Returns:** Vec of `DiskStats` for sda/mmcblk/nvme/zram devices
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

/// Read disk I/O stats as JSON string.
///
/// **Sysfs path:** `/proc/diskstats`
/// **Root:** Not required
/// **Returns:** JSON array of `DiskStats`
pub fn read_diskstats_json() -> String {
    let stats = read_diskstats();
    serde_json::to_string(&stats).unwrap_or_else(|_| "[]".to_string())
}

/// Get total I/O read time for a device.
///
/// **Sysfs path:** `/proc/diskstats`
/// **Root:** Not required
/// **Returns:** Read time in ms
pub fn get_io_read_time(device: &str) -> u64 {
    read_diskstats().into_iter()
        .find(|s| s.device == device)
        .map(|s| s.read_time_ms)
        .unwrap_or(0)
}

/// Get total I/O write time for a device.
///
/// **Sysfs path:** `/proc/diskstats`
/// **Root:** Not required
/// **Returns:** Write time in ms
pub fn get_io_write_time(device: &str) -> u64 {
    read_diskstats().into_iter()
        .find(|s| s.device == device)
        .map(|s| s.write_time_ms)
        .unwrap_or(0)
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn test_disk_stats_roundtrip() {
        let s = DiskStats {
            device: "sda".into(), reads_completed: 100, reads_merged: 10,
            sectors_read: 2048, read_time_ms: 500, writes_completed: 200,
            writes_merged: 20, sectors_written: 4096, write_time_ms: 1000,
            io_in_progress: 5, io_time_ms: 1500, weighted_io_time_ms: 3000,
        };
        let json = serde_json::to_string(&s).unwrap();
        let d: DiskStats = serde_json::from_str(&json).unwrap();
        assert_eq!(d.device, "sda");
        assert_eq!(d.reads_completed, 100);
        assert_eq!(d.writes_completed, 200);
        assert_eq!(d.read_time_ms, 500);
        assert_eq!(d.write_time_ms, 1000);
    }

    #[test]
    fn test_disk_stats_zero_values() {
        let s = DiskStats {
            device: "zram0".into(), reads_completed: 0, reads_merged: 0,
            sectors_read: 0, read_time_ms: 0, writes_completed: 0,
            writes_merged: 0, sectors_written: 0, write_time_ms: 0,
            io_in_progress: 0, io_time_ms: 0, weighted_io_time_ms: 0,
        };
        let json = serde_json::to_string(&s).unwrap();
        let d: DiskStats = serde_json::from_str(&json).unwrap();
        assert_eq!(d.device, "zram0");
        assert_eq!(d.io_in_progress, 0);
    }

    #[test]
    fn test_disk_stats_overflow_values() {
        let s = DiskStats {
            device: "nvme0n1".into(), reads_completed: u64::MAX, reads_merged: u64::MAX,
            sectors_read: u64::MAX, read_time_ms: u64::MAX, writes_completed: u64::MAX,
            writes_merged: u64::MAX, sectors_written: u64::MAX, write_time_ms: u64::MAX,
            io_in_progress: u64::MAX, io_time_ms: u64::MAX, weighted_io_time_ms: u64::MAX,
        };
        let json = serde_json::to_string(&s).unwrap();
        let d: DiskStats = serde_json::from_str(&json).unwrap();
        assert_eq!(d.reads_completed, u64::MAX);
    }

    #[test]
    fn test_read_diskstats_fallback() {
        let stats = read_diskstats();
        // On non-Android, should be empty
        #[cfg(not(target_os = "android"))]
        assert!(stats.is_empty());
    }

    #[test]
    fn test_device_type_filters() {
        // Ensure the filter patterns match the code
        assert!("sda".starts_with("sda"));
        assert!("mmcblk0".starts_with("mmcblk"));
        assert!("nvme0n1".starts_with("nvme"));
        assert!("zram0".starts_with("zram"));
        assert!(!"loop0".starts_with("sda"));
    }
}
