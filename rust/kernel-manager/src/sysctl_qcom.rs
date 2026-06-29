use crate::sysfs;
use crate::sysfs::{SysfsError, SysfsResult};

pub fn set_sched_latency_ns(ns: i32) -> SysfsResult<bool> {
    let path = "/proc/sys/kernel/sched_latency_ns";
    let _ = sysfs::chmod(path, "644");
    if sysfs::write_sysfs(path, &ns.to_string()) { Ok(true) }
    else { Err(SysfsError::IoError(path.into())) }
}

pub fn set_sched_wakeup_granularity_ns(ns: i32) -> SysfsResult<bool> {
    let path = "/proc/sys/kernel/sched_wakeup_granularity_ns";
    let _ = sysfs::chmod(path, "644");
    if sysfs::write_sysfs(path, &ns.to_string()) { Ok(true) }
    else { Err(SysfsError::IoError(path.into())) }
}

pub fn set_sched_child_runs_first(enabled: bool) -> SysfsResult<bool> {
    let path = "/proc/sys/kernel/sched_child_runs_first";
    let _ = sysfs::chmod(path, "644");
    if sysfs::write_sysfs(path, if enabled { "1" } else { "0" }) { Ok(true) }
    else { Err(SysfsError::IoError(path.into())) }
}

pub fn set_randomize_va_space(level: i32) -> SysfsResult<bool> {
    let path = "/proc/sys/kernel/randomize_va_space";
    let _ = sysfs::chmod(path, "644");
    if sysfs::write_sysfs(path, &level.to_string()) { Ok(true) }
    else { Err(SysfsError::IoError(path.into())) }
}

pub fn set_dirty_expire_centisecs(val: i32) -> SysfsResult<bool> {
    let path = "/proc/sys/vm/dirty_expire_centisecs";
    let _ = sysfs::chmod(path, "644");
    if sysfs::write_sysfs(path, &val.to_string()) { Ok(true) }
    else { Err(SysfsError::IoError(path.into())) }
}

pub fn set_dirty_background_ratio(pct: i32) -> SysfsResult<bool> {
    let path = "/proc/sys/vm/dirty_background_ratio";
    let _ = sysfs::chmod(path, "644");
    if sysfs::write_sysfs(path, &pct.to_string()) { Ok(true) }
    else { Err(SysfsError::IoError(path.into())) }
}

pub fn set_overcommit_memory(mode: i32) -> SysfsResult<bool> {
    let path = "/proc/sys/vm/overcommit_memory";
    let _ = sysfs::chmod(path, "644");
    if sysfs::write_sysfs(path, &mode.to_string()) { Ok(true) }
    else { Err(SysfsError::IoError(path.into())) }
}

pub fn set_extra_free_kbytes(kb: i32) -> SysfsResult<bool> {
    let path = "/proc/sys/vm/extra_free_kbytes";
    let _ = sysfs::chmod(path, "644");
    if sysfs::write_sysfs(path, &kb.to_string()) { Ok(true) }
    else { Err(SysfsError::IoError(path.into())) }
}

pub fn set_drop_caches_level(level: i32) -> SysfsResult<bool> {
    let path = "/proc/sys/vm/drop_caches";
    let _ = sysfs::chmod(path, "644");
    if sysfs::write_sysfs(path, &level.to_string()) { Ok(true) }
    else { Err(SysfsError::IoError(path.into())) }
}

pub fn set_perf_event_paranoid(level: i32) -> SysfsResult<bool> {
    let path = "/proc/sys/kernel/perf_event_paranoid";
    let _ = sysfs::chmod(path, "644");
    if sysfs::write_sysfs(path, &level.to_string()) { Ok(true) }
    else { Err(SysfsError::IoError(path.into())) }
}

pub fn set_kptr_restrict(level: i32) -> SysfsResult<bool> {
    let path = "/proc/sys/kernel/kptr_restrict";
    let _ = sysfs::chmod(path, "644");
    if sysfs::write_sysfs(path, &level.to_string()) { Ok(true) }
    else { Err(SysfsError::IoError(path.into())) }
}

pub fn set_tcp_default_init_rwnd(val: i32) -> SysfsResult<bool> {
    let path = "/proc/sys/net/ipv4/tcp_default_init_rwnd";
    let _ = sysfs::chmod(path, "644");
    if sysfs::write_sysfs(path, &val.to_string()) { Ok(true) }
    else { Err(SysfsError::IoError(path.into())) }
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn test_set_sched_latency_ns_path_format() {
        assert!(set_sched_latency_ns(10000000).is_err());
    }

    #[test]
    fn test_set_sched_wakeup_granularity_ns_path_format() {
        assert!(set_sched_wakeup_granularity_ns(2000000).is_err());
    }

    #[test]
    fn test_set_sched_child_runs_first_path_format() {
        assert!(set_sched_child_runs_first(true).is_err());
    }

    #[test]
    fn test_set_randomize_va_space_path_format() {
        assert!(set_randomize_va_space(2).is_err());
    }

    #[test]
    fn test_set_dirty_expire_centisecs_path_format() {
        assert!(set_dirty_expire_centisecs(3000).is_err());
    }

    #[test]
    fn test_set_dirty_background_ratio_path_format() {
        assert!(set_dirty_background_ratio(5).is_err());
    }

    #[test]
    fn test_set_overcommit_memory_path_format() {
        assert!(set_overcommit_memory(0).is_err());
    }

    #[test]
    fn test_set_extra_free_kbytes_path_format() {
        assert!(set_extra_free_kbytes(24358).is_err());
    }

    #[test]
    fn test_set_drop_caches_level_path_format() {
        assert!(set_drop_caches_level(1).is_err());
    }

    #[test]
    fn test_set_perf_event_paranoid_path_format() {
        assert!(set_perf_event_paranoid(2).is_err());
    }

    #[test]
    fn test_set_kptr_restrict_path_format() {
        assert!(set_kptr_restrict(2).is_err());
    }

    #[test]
    fn test_set_tcp_default_init_rwnd_path_format() {
        assert!(set_tcp_default_init_rwnd(10).is_err());
    }
}
