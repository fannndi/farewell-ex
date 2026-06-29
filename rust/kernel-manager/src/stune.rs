use crate::sysfs::{self, SysfsError, SysfsResult};

fn stune_path(group: &str, param: &str) -> String {
    if group.is_empty() {
        format!("/dev/stune/{}", param)
    } else {
        format!("/dev/stune/{}/{}", group, param)
    }
}

pub fn get_stune_value(group: &str, param: &str) -> String {
    sysfs::read_sysfs_cached(&stune_path(group, param), 2000).unwrap_or_default()
}

pub fn set_stune_value(group: &str, param: &str, value: &str) -> SysfsResult<bool> {
    let path = stune_path(group, param);
    sysfs::chmod(&path, "644");
    let ok = sysfs::write_sysfs(&path, value);
    sysfs::chmod(&path, "444");
    if ok { Ok(true) } else { Err(SysfsError::IoError(path)) }
}

pub fn set_stune_colocate(enabled: bool) -> SysfsResult<bool> {
    set_stune_value("", "schedtune.colocate", if enabled { "1" } else { "0" })
}

pub fn set_stune_sched_boost_no_override(group: &str, enabled: bool) -> SysfsResult<bool> {
    set_stune_value(group, "schedtune.sched_boost_no_override", if enabled { "1" } else { "0" })
}

pub fn get_stune_groups() -> Vec<String> {
    let base = "/dev/stune";
    let mut groups = Vec::new();
    if let Ok(entries) = std::fs::read_dir(base) {
        for entry in entries.flatten() {
            if entry.path().is_dir() {
                if let Some(name) = entry.file_name().to_str() {
                    groups.push(name.to_string());
                }
            }
        }
    }
    groups
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn test_stune_path_format() {
        let p = stune_path("top-app", "schedtune.boost");
        assert_eq!(p, "/dev/stune/top-app/schedtune.boost");
        let p = stune_path("foreground", "schedtune.prefer_idle");
        assert_eq!(p, "/dev/stune/foreground/schedtune.prefer_idle");
        let p = stune_path("", "schedtune.colocate");
        assert_eq!(p, "/dev/stune/schedtune.colocate");
    }

    #[test]
    fn test_stune_path_edge_cases() {
        let p = stune_path("system-background", "schedtune.colocate");
        assert_eq!(p, "/dev/stune/system-background/schedtune.colocate");
        let p = stune_path("nnapi-hal", "schedtune.boost");
        assert_eq!(p, "/dev/stune/nnapi-hal/schedtune.boost");
    }

    #[test]
    fn test_get_stune_value_nonexistent() {
        let v = get_stune_value("nonexistent", "schedtune.boost");
        assert!(v.is_empty());
    }

    #[test]
    fn test_set_stune_value_nonexistent() {
        assert!(set_stune_value("nonexistent", "schedtune.boost", "1").is_err());
    }

    #[test]
    fn test_set_stune_colocate_nonexistent() {
        assert!(set_stune_colocate(true).is_err());
    }

    #[test]
    fn test_set_stune_sched_boost_no_override_nonexistent() {
        assert!(set_stune_sched_boost_no_override("nonexistent", true).is_err());
    }

    #[test]
    fn test_get_stune_groups_no_root() {
        let groups = get_stune_groups();
        assert!(groups.is_empty());
    }
}
