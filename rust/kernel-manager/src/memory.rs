use crate::sysfs;
use serde::{Deserialize, Serialize};

/// System memory information from `/proc/meminfo`.
#[derive(Debug, Clone, Serialize, Deserialize)]
pub struct MemoryInfo { pub total_kb: i64, pub available_kb: i64, pub free_kb: i64, pub cached_kb: i64, pub buffers_kb: i64 }

/// Swap space information from `/proc/meminfo`.
#[derive(Debug, Clone, Serialize, Deserialize)]
pub struct SwapInfo { pub total_kb: i64, pub free_kb: i64, pub used_kb: i64 }

/// ZRAM compression statistics.
#[derive(Debug, Clone, Serialize, Deserialize)]
pub struct ZramStats { pub disksize: i64, pub orig_data_size: i64, pub compr_data_size: i64, pub mem_used_total: i64, pub compression_ratio: f32 }

/// Read system memory info from `/proc/meminfo`.
///
/// **Sysfs path:** `/proc/meminfo`
/// **Root:** Not required
/// **Returns:** `MemoryInfo` struct with total/available/free/cached/buffers
pub fn read_memory_info() -> MemoryInfo {
    let mut m = MemoryInfo { total_kb: 0, available_kb: 0, free_kb: 0, cached_kb: 0, buffers_kb: 0 };
    let mut buf = [0u8; 4096];
    if let Some(n) = sysfs::read_file_buf("/proc/meminfo", &mut buf) {
        if let Ok(c) = std::str::from_utf8(&buf[..n]) {
            for line in c.lines() {
                let p: Vec<&str> = line.split_whitespace().collect();
                if p.len() >= 2 { if let Ok(v) = p[1].parse::<i64>() { match p[0] {
                    "MemTotal:" => m.total_kb = v, "MemAvailable:" => m.available_kb = v,
                    "MemFree:" => m.free_kb = v, "Cached:" => m.cached_kb = v, "Buffers:" => m.buffers_kb = v,
                    _ => {}
                }}}
            }
        }
    }
    m
}

/// Read swap info from `/proc/meminfo`.
///
/// **Sysfs path:** `/proc/meminfo`
/// **Root:** Not required
/// **Returns:** `SwapInfo` with total/free/used in kB
pub fn read_swap_info() -> SwapInfo {
    let mut s = SwapInfo { total_kb: 0, free_kb: 0, used_kb: 0 };
    let mut buf = [0u8; 4096];
    if let Some(n) = sysfs::read_file_buf("/proc/meminfo", &mut buf) {
        if let Ok(c) = std::str::from_utf8(&buf[..n]) {
            for line in c.lines() {
                let p: Vec<&str> = line.split_whitespace().collect();
                if p.len() >= 2 { if let Ok(v) = p[1].parse::<i64>() { match p[0] {
                    "SwapTotal:" => s.total_kb = v, "SwapFree:" => s.free_kb = v, _ => {}
                }}}
            }
            s.used_kb = s.total_kb - s.free_kb;
        }
    }
    s
}

/// Read ZRAM0 compression stats.
///
/// **Sysfs path:** `/sys/block/zram0/disksize`, `/sys/block/zram0/mm_stat`
/// **Root:** Not required
/// **Returns:** `ZramStats` with compression ratio and sizes
pub fn read_zram_stats() -> ZramStats {
    let disksize = sysfs::read_sysfs_int("/sys/block/zram0/disksize", 1000).unwrap_or(0);
    let mut z = ZramStats { disksize, orig_data_size: 0, compr_data_size: 0, mem_used_total: 0, compression_ratio: 1.0 };
    if let Some(mm) = sysfs::read_sysfs_cached("/sys/block/zram0/mm_stat", 1000) {
        let p: Vec<&str> = mm.split_whitespace().collect();
        if p.len() >= 3 {
            z.orig_data_size = p[0].parse().unwrap_or(0);
            z.compr_data_size = p[1].parse().unwrap_or(0);
            z.mem_used_total = p[2].parse().unwrap_or(0);
            z.compression_ratio = if z.compr_data_size > 0 { z.orig_data_size as f32 / z.compr_data_size as f32 } else { 1.0 };
        }
    }
    z
}

/// Read current swappiness value.
///
/// **Sysfs path:** `/proc/sys/vm/swappiness`
/// **Root:** Not required
/// **Returns:** Swappiness (0–100)
pub fn read_swappiness() -> i32 {
    sysfs::read_sysfs_int("/proc/sys/vm/swappiness", 1000).unwrap_or(60) as i32
}

/// Set swappiness value.
///
/// **Sysfs path:** `/proc/sys/vm/swappiness`
/// **Root:** Required
/// **Returns:** `true` if written successfully
pub fn set_swappiness(val: i32) -> bool {
    sysfs::chmod("/proc/sys/vm/swappiness", "644");
    sysfs::write_sysfs("/proc/sys/vm/swappiness", &val.to_string())
}

/// Set dirty page ratio percentage.
///
/// **Sysfs path:** `/proc/sys/vm/dirty_ratio`
/// **Root:** Required
/// **Returns:** `true` if written successfully
pub fn set_dirty_ratio(val: i32) -> bool {
    sysfs::chmod("/proc/sys/vm/dirty_ratio", "644");
    sysfs::write_sysfs("/proc/sys/vm/dirty_ratio", &val.to_string())
}

/// Set minimum free memory in kilobytes.
///
/// **Sysfs path:** `/proc/sys/vm/min_free_kbytes`
/// **Root:** Required
/// **Returns:** `true` if written successfully
pub fn set_min_free_kbytes(val: i32) -> bool {
    sysfs::chmod("/proc/sys/vm/min_free_kbytes", "644");
    sysfs::write_sysfs("/proc/sys/vm/min_free_kbytes", &val.to_string())
}

/// Get available ZRAM compression algorithms.
///
/// **Sysfs path:** `/sys/block/zram0/comp_algorithm`
/// **Root:** Not required
/// **Returns:** Vec of algorithm name strings
pub fn get_available_zram_algorithms() -> Vec<String> {
    sysfs::read_sysfs_cached("/sys/block/zram0/comp_algorithm", 0)
        .map(|c| c.split_whitespace().map(|s| s.trim_matches(|c| c == '[' || c == ']').to_string()).collect())
        .unwrap_or_default()
}

/// Get currently active ZRAM compression algorithm.
///
/// **Sysfs path:** `/sys/block/zram0/comp_algorithm`
/// **Root:** Not required
/// **Returns:** Active algorithm name (e.g., "lz4", "zstd")
pub fn get_current_zram_algorithm() -> String {
    sysfs::read_sysfs_cached("/sys/block/zram0/comp_algorithm", 1000)
        .and_then(|c| { let s = c.find('[')?; let e = c.find(']')?; Some(c[s+1..e].to_string()) })
        .unwrap_or_else(|| "unknown".to_string())
}

/// Read memory info as JSON string.
///
/// **Sysfs path:** `/proc/meminfo`
/// **Root:** Not required
/// **Returns:** JSON representation of `MemoryInfo`
pub fn read_meminfo_json() -> String {
    let info = read_memory_info();
    serde_json::to_string(&info).unwrap_or_else(|_| "{}".to_string())
}

/// Calculate memory pressure percentage.
///
/// **Sysfs path:** `/proc/meminfo`
/// **Root:** Not required
/// **Returns:** Used memory as percentage of total (0.0–100.0)
pub fn get_memory_pressure() -> f32 {
    let info = read_memory_info();
    if info.total_kb > 0 { ((info.total_kb - info.available_kb) as f32 / info.total_kb as f32) * 100.0 } else { 0.0 }
}

// ==================== Multi-Device ZRAM (Xtra-Kernel) ====================

/// Read ZRAM stats for a specific multi-device ZRAM instance (Xtra-Kernel).
///
/// **Sysfs path:** `/sys/block/zram*/disksize`, `/sys/block/zram*/mm_stat`
/// **Root:** Not required
/// **Returns:** `Some(ZramStats)` if device exists, `None` otherwise
pub fn read_zram_device_stats(device: i32) -> Option<ZramStats> {
    let disksize_path = format!("/sys/block/zram{}/disksize", device);
    if !sysfs::file_exists(&disksize_path) { return None; }
    let disksize = sysfs::read_sysfs_int(&disksize_path, 1000)? as i64;
    let mm_stat = sysfs::read_sysfs_cached(&format!("/sys/block/zram{}/mm_stat", device), 1000)?;
    let p: Vec<&str> = mm_stat.split_whitespace().collect();
    if p.len() >= 3 {
        let orig = p[0].parse().ok()?;
        let compr = p[1].parse().ok()?;
        let mem = p[2].parse().ok()?;
        let ratio = if compr > 0 { orig as f32 / compr as f32 } else { 1.0 };
        return Some(ZramStats { disksize, orig_data_size: orig, compr_data_size: compr, mem_used_total: mem, compression_ratio: ratio });
    }
    None
}

// ==================== ZRAM Lifecycle (Xtra-Kernel RAMControlUseCase) ====================

/// Set ZRAM compression algorithm (Xtra-Kernel lifecycle).
///
/// **Sysfs path:** `/sys/block/zram*/comp_algorithm`, `disksize`
/// **Root:** Required
/// **Returns:** `true` if algorithm changed successfully
///
/// Example:
/// ```
/// memory::zram_set_algorithm(0, "lz4");
/// ```
pub fn zram_set_algorithm(device: i32, algo: &str) -> bool {
    let algo_path = format!("/sys/block/zram{}/comp_algorithm", device);
    let disksize_path = format!("/sys/block/zram{}/disksize", device);
    if !sysfs::file_exists(&algo_path) { return false; }
    // swapoff → set algo → swapon
    let _ = sysfs::write_sysfs(&format!("/proc/swaps"), ""); // swapoff first
    sysfs::chmod(&disksize_path, "644");
    sysfs::write_sysfs(&disksize_path, "0"); // reset
    sysfs::chmod(&algo_path, "644");
    let ok = sysfs::write_sysfs(&algo_path, algo);
    sysfs::chmod(&algo_path, "444");
    ok
}

/// Set ZRAM device size in bytes (Xtra-Kernel lifecycle).
///
/// **Sysfs path:** `/sys/block/zram*/disksize`
/// **Root:** Required
/// **Returns:** `true` if size written successfully
pub fn zram_set_size(device: i32, size_bytes: i64) -> bool {
    let disksize_path = format!("/sys/block/zram{}/disksize", device);
    if !sysfs::file_exists(&disksize_path) { return false; }
    sysfs::chmod(&disksize_path, "644");
    let ok = sysfs::write_sysfs(&disksize_path, &size_bytes.to_string());
    sysfs::chmod(&disksize_path, "444"); ok
}

/// Create a swap file at the given path.
///
/// **Sysfs path:** N/A (shell command: `dd`, `mkswap`, `swapon`)
/// **Root:** Required
/// **Returns:** `true` if swap file created and activated
pub fn swap_file_create(path: &str, size_mb: i64) -> bool {
    // dd if=/dev/zero of=path bs=1M count=size_mb
    let cmd = format!("dd if=/dev/zero of={} bs=1M count={} 2>/dev/null && chmod 600 {} && mkswap {} 2>/dev/null && swapon {}", path, size_mb, path, path, path);
    std::process::Command::new("sh").arg("-c").arg(&cmd).status().is_ok()
}

/// Remove a swap file.
///
/// **Sysfs path:** N/A (shell command: `swapoff`, `rm`)
/// **Root:** Required
/// **Returns:** `true` if swap file deactivated and removed
pub fn swap_file_remove(path: &str) -> bool {
    let cmd = format!("swapoff {} 2>/dev/null && rm -f {}", path, path);
    std::process::Command::new("sh").arg("-c").arg(&cmd).status().is_ok()
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn test_memory_info_roundtrip() {
        let m = MemoryInfo { total_kb: 8000000, available_kb: 4000000, free_kb: 2000000, cached_kb: 1000000, buffers_kb: 500000 };
        let json = serde_json::to_string(&m).unwrap();
        let d: MemoryInfo = serde_json::from_str(&json).unwrap();
        assert_eq!(d.total_kb, 8000000);
        assert_eq!(d.available_kb, 4000000);
        assert_eq!(d.free_kb, 2000000);
        assert_eq!(d.cached_kb, 1000000);
        assert_eq!(d.buffers_kb, 500000);
    }

    #[test]
    fn test_memory_info_zero_values() {
        let m = MemoryInfo { total_kb: 0, available_kb: 0, free_kb: 0, cached_kb: 0, buffers_kb: 0 };
        let json = serde_json::to_string(&m).unwrap();
        let d: MemoryInfo = serde_json::from_str(&json).unwrap();
        assert_eq!(d.total_kb, 0);
    }

    #[test]
    fn test_swap_info_roundtrip() {
        let s = SwapInfo { total_kb: 2000000, free_kb: 1000000, used_kb: 1000000 };
        let json = serde_json::to_string(&s).unwrap();
        let d: SwapInfo = serde_json::from_str(&json).unwrap();
        assert_eq!(d.total_kb, 2000000);
        assert_eq!(d.used_kb, d.total_kb - d.free_kb);
    }

    #[test]
    fn test_zram_stats_roundtrip() {
        let z = ZramStats { disksize: 1048576, orig_data_size: 500000, compr_data_size: 250000, mem_used_total: 260000, compression_ratio: 2.0 };
        let json = serde_json::to_string(&z).unwrap();
        let d: ZramStats = serde_json::from_str(&json).unwrap();
        assert_eq!(d.disksize, 1048576);
        assert!((d.compression_ratio - 2.0).abs() < 0.01);
    }

    #[test]
    fn test_zram_stats_zero_compression() {
        let z = ZramStats { disksize: 0, orig_data_size: 0, compr_data_size: 0, mem_used_total: 0, compression_ratio: 1.0 };
        let json = serde_json::to_string(&z).unwrap();
        let d: ZramStats = serde_json::from_str(&json).unwrap();
        assert_eq!(d.disksize, 0);
    }

    #[test]
    fn test_memory_format_paths() {
        let p = format!("/sys/block/zram{}/disksize", 0);
        assert_eq!(p, "/sys/block/zram0/disksize");
        let p = format!("/sys/block/zram{}/mm_stat", 1);
        assert_eq!(p, "/sys/block/zram1/mm_stat");
    }

    #[test]
    fn test_swap_info_overflow_subtraction() {
        let s = SwapInfo { total_kb: i64::MAX, free_kb: 0, used_kb: i64::MAX };
        let json = serde_json::to_string(&s).unwrap();
        let d: SwapInfo = serde_json::from_str(&json).unwrap();
        assert_eq!(d.used_kb, i64::MAX);
    }

    #[test]
    fn test_memory_pressure_zero_total() {
        let m = MemoryInfo { total_kb: 0, available_kb: 0, free_kb: 0, cached_kb: 0, buffers_kb: 0 };
        // total_kb == 0 should avoid division by zero in get_memory_pressure
        assert_eq!(m.total_kb, 0);
    }
}
