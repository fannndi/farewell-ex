use crate::sysfs;
use serde::{Deserialize, Serialize};

#[derive(Debug, Clone, Serialize, Deserialize)]
pub struct MemoryInfo { pub total_kb: i64, pub available_kb: i64, pub free_kb: i64, pub cached_kb: i64, pub buffers_kb: i64 }

#[derive(Debug, Clone, Serialize, Deserialize)]
pub struct SwapInfo { pub total_kb: i64, pub free_kb: i64, pub used_kb: i64 }

#[derive(Debug, Clone, Serialize, Deserialize)]
pub struct ZramStats { pub disksize: i64, pub orig_data_size: i64, pub compr_data_size: i64, pub mem_used_total: i64, pub compression_ratio: f32 }

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

pub fn read_swappiness() -> i32 {
    sysfs::read_sysfs_int("/proc/sys/vm/swappiness", 1000).unwrap_or(60) as i32
}

pub fn set_swappiness(val: i32) -> bool {
    sysfs::chmod("/proc/sys/vm/swappiness", "644");
    sysfs::write_sysfs("/proc/sys/vm/swappiness", &val.to_string())
}

pub fn set_dirty_ratio(val: i32) -> bool {
    sysfs::chmod("/proc/sys/vm/dirty_ratio", "644");
    sysfs::write_sysfs("/proc/sys/vm/dirty_ratio", &val.to_string())
}

pub fn set_min_free_kbytes(val: i32) -> bool {
    sysfs::chmod("/proc/sys/vm/min_free_kbytes", "644");
    sysfs::write_sysfs("/proc/sys/vm/min_free_kbytes", &val.to_string())
}

pub fn get_available_zram_algorithms() -> Vec<String> {
    sysfs::read_sysfs_cached("/sys/block/zram0/comp_algorithm", 0)
        .map(|c| c.split_whitespace().map(|s| s.trim_matches(|c| c == '[' || c == ']').to_string()).collect())
        .unwrap_or_default()
}

pub fn get_current_zram_algorithm() -> String {
    sysfs::read_sysfs_cached("/sys/block/zram0/comp_algorithm", 1000)
        .and_then(|c| { let s = c.find('[')?; let e = c.find(']')?; Some(c[s+1..e].to_string()) })
        .unwrap_or_else(|| "unknown".to_string())
}

pub fn read_meminfo_json() -> String {
    let info = read_memory_info();
    serde_json::to_string(&info).unwrap_or_else(|_| "{}".to_string())
}

pub fn get_memory_pressure() -> f32 {
    let info = read_memory_info();
    if info.total_kb > 0 { ((info.total_kb - info.available_kb) as f32 / info.total_kb as f32) * 100.0 } else { 0.0 }
}
