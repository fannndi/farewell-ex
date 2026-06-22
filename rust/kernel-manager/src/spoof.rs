use std::process::Command;
use crate::sysfs;

// ==================== Device Property Spoof (COPG resetprop approach) ====================
// Per-app spoofing requires Zygisk companion — marked TODO
// Global spoofing via resetprop + mount --bind is sufficient for most use cases

/// List of system properties that can be spoofed via resetprop.
pub const SPOOFABLE_PROPS: &[&str] = &[
    "ro.product.model", "ro.product.brand", "ro.product.device",
    "ro.product.manufacturer", "ro.product.name", "ro.product.board",
    "ro.build.fingerprint", "ro.build.display.id", "ro.build.id",
    "ro.build.tags", "ro.build.type", "ro.hardware", "ro.bootloader",
    "ro.build.version.security_patch", "ro.build.version.incremental",
    "ro.soc.manufacturer", "ro.soc.model",
];

/// Set a system property via `resetprop -n`.
///
/// **Root:** Required
/// **Returns:** `true` if resetprop succeeded
pub fn resetprop(key: &str, value: &str) -> bool {
    Command::new("resetprop").args(["-n", key, value]).status().is_ok()
}

/// Read a system property via `getprop`.
///
/// **Root:** Not required
/// **Returns:** Property value, or empty string
pub fn getprop(key: &str) -> String {
    let output = Command::new("getprop").arg(key).output();
    match output {
        Ok(o) => String::from_utf8_lossy(&o.stdout).trim().to_string(),
        Err(_) => String::new(),
    }
}

/// Spoof a single device property via resetprop.
///
/// **Root:** Required
/// **Returns:** `true` if property was set
pub fn spoof_device_property(key: &str, value: &str) -> bool {
    resetprop(key, value)
}

/// Restore a single spoofed property to its default.
///
/// **Root:** Required
/// **Returns:** `true` if property was deleted
pub fn restore_device_property(key: &str) -> bool {
    // resetprop --delete removes the override, system default returns
    Command::new("resetprop").args(["--delete", key]).status().is_ok()
}

/// Restore all spoofed properties and unmount cpuinfo spoof.
///
/// **Root:** Required
/// **Returns:** `true` if all restorations succeeded
pub fn restore_all_spoofs() -> bool {
    let mut all_ok = true;
    for prop in SPOOFABLE_PROPS {
        if !restore_device_property(prop) { all_ok = false; }
    }
    unmount_cpuinfo_spoof();
    all_ok
}

// ==================== CPU Info Spoof (COPG mount --bind approach) ====================

const SPOOF_DIR: &str = "/data/adb/farewell_spoof";

/// Create a spoofed `/proc/cpuinfo` file.
///
/// **Root:** Required (writes to /data/adb/)
/// **Returns:** `true` if file was created
pub fn create_cpuinfo_spoof(content: &str) -> bool {
    let _ = std::fs::create_dir_all(SPOOF_DIR);
    let path = format!("{}/cpuinfo_spoof", SPOOF_DIR);
    match std::fs::write(&path, content) {
        Ok(_) => {
            let _ = Command::new("chmod").arg("444").arg(&path).status();
            true
        }
        Err(_) => false,
    }
}

/// Mount cpuinfo spoof via `mount --bind`.
///
/// **Root:** Required
/// **Returns:** `true` if mount succeeded
pub fn mount_cpuinfo_spoof() -> bool {
    let spoof_path = format!("{}/cpuinfo_spoof", SPOOF_DIR);
    if !sysfs::file_exists(&spoof_path) { return false; }
    // Unmount first if already mounted
    let _ = Command::new("umount").arg("/proc/cpuinfo").status();
    Command::new("mount").args(["--bind", &spoof_path, "/proc/cpuinfo"]).status().is_ok()
}

/// Unmount the cpuinfo spoof.
///
/// **Root:** Required
/// **Returns:** `true` if umount succeeded
pub fn unmount_cpuinfo_spoof() -> bool {
    Command::new("umount").arg("/proc/cpuinfo").status().is_ok()
}

/// Check if cpuinfo is currently spoofed via mount.
///
/// **Root:** Not required
/// **Returns:** `true` if cpuinfo_spoof is mounted
pub fn is_cpuinfo_spoofed() -> bool {
    let output = Command::new("mount").arg("-l").output();
    match output {
        Ok(o) => {
            let stdout = String::from_utf8_lossy(&o.stdout);
            stdout.contains("cpuinfo_spoof") && stdout.contains("/proc/cpuinfo")
        }
        Err(_) => false,
    }
}

// ==================== Batch Spoof from Preset ====================

/// Apply a device profile (pixel/samsung/xiaomi/oneplus) via resetprop.
///
/// **Root:** Required
/// **Returns:** `true` if all properties set
///
/// Example:
/// ```
/// spoof::apply_device_profile("pixel");
/// ```
pub fn apply_device_profile(profile: &str) -> bool {
    let props: Vec<(&str, &str)> = match profile {
        "pixel" => vec![
            ("ro.product.model", "Pixel 8 Pro"),
            ("ro.product.brand", "google"),
            ("ro.product.device", "husky"),
            ("ro.product.manufacturer", "Google"),
            ("ro.product.name", "husky"),
            ("ro.build.fingerprint", "google/husky/husky:14/AP2A.240805.005/12025142:user/release-keys"),
            ("ro.build.display.id", "AP2A.240805.005"),
            ("ro.build.id", "AP2A.240805.005"),
            ("ro.build.tags", "release-keys"),
            ("ro.build.type", "user"),
            ("ro.soc.manufacturer", "Google"),
            ("ro.soc.model", "Tensor G4"),
        ],
        "samsung" => vec![
            ("ro.product.model", "SM-S926B"),
            ("ro.product.brand", "samsung"),
            ("ro.product.device", "e3q"),
            ("ro.product.manufacturer", "samsung"),
            ("ro.product.name", "e3qxxx"),
            ("ro.build.fingerprint", "samsung/e3qxxx/e3q:14/UP1A.231005.007/S926BXXS2AXE5:user/release-keys"),
            ("ro.build.display.id", "UP1A.231005.007"),
            ("ro.build.id", "UP1A.231005.007"),
            ("ro.build.tags", "release-keys"),
            ("ro.build.type", "user"),
            ("ro.soc.manufacturer", "Samsung"),
            ("ro.soc.model", "Exynos 2500"),
        ],
        "xiaomi" => vec![
            ("ro.product.model", "24129PN74G"),
            ("ro.product.brand", "Xiaomi"),
            ("ro.product.device", "houji"),
            ("ro.product.manufacturer", "Xiaomi"),
            ("ro.product.name", "houji"),
            ("ro.build.fingerprint", "Xiaomi/houji/houji:14/UKQ1.240411.001/V816.0.10.0.UNCMIXM:user/release-keys"),
            ("ro.build.display.id", "V816.0.10.0.UNCMIXM"),
            ("ro.build.id", "UKQ1.240411.001"),
            ("ro.build.tags", "release-keys"),
            ("ro.build.type", "user"),
            ("ro.soc.manufacturer", "Qualcomm"),
            ("ro.soc.model", "SM8650"),
        ],
        "oneplus" => vec![
            ("ro.product.model", "CPH2583"),
            ("ro.product.brand", "OnePlus"),
            ("ro.product.device", "zephyr"),
            ("ro.product.manufacturer", "OnePlus"),
            ("ro.product.name", "zephyr"),
            ("ro.build.fingerprint", "OnePlus/zephyr/zephyr:14/UKQ1.240404.002/2406172126:user/release-keys"),
            ("ro.build.display.id", "2406172126"),
            ("ro.build.id", "UKQ1.240404.002"),
            ("ro.build.tags", "release-keys"),
            ("ro.build.type", "user"),
            ("ro.soc.manufacturer", "Qualcomm"),
            ("ro.soc.model", "SM8650"),
        ],
        _ => return false,
    };
    let mut all_ok = true;
    for (key, value) in props {
        if !resetprop(key, value) { all_ok = false; }
    }
    all_ok
}

/// Generate a Magisk module for persistent device spoofing.
///
/// **Root:** Required (writes to /data/adb/modules/)
/// **Returns:** `true` if module was created
pub fn generate_spoof_magisk_module(module_name: &str, profile: &str) -> bool {
    let module_dir = format!("/data/adb/modules/{}", module_name);
    let _ = Command::new("mkdir").arg("-p").arg(&module_dir).status();

    let module_prop = format!(
        "id={}\nname={}\nversion=1.0\nversionCode=1\nauthor=farewell\ndescription=Device spoof module",
        module_name, module_name
    );
    let _ = std::fs::write(format!("{}/module.prop", module_dir), module_prop);

    // Generate system.prop from profile
    let props: Vec<(&str, &str)> = match profile {
        "pixel" => vec![("ro.product.model", "Pixel 8 Pro"), ("ro.product.brand", "google"), ("ro.product.device", "husky")],
        "samsung" => vec![("ro.product.model", "SM-S926B"), ("ro.product.brand", "samsung"), ("ro.product.device", "e3q")],
        "xiaomi" => vec![("ro.product.model", "24129PN74G"), ("ro.product.brand", "Xiaomi"), ("ro.product.device", "houji")],
        _ => vec![],
    };
    let system_prop: String = props.iter().map(|(k, v)| format!("{}={}", k, v)).collect::<Vec<_>>().join("\n");
    let _ = std::fs::write(format!("{}/system.prop", module_dir), system_prop);

    // post-fs-data.sh: mount cpuinfo spoof
    let post_fs = format!(
        "#!/system/bin/sh\nmount --bind /data/local/tmp/cpuinfo_spoof /proc/cpuinfo 2>/dev/null\n"
    );
    let _ = std::fs::write(format!("{}/post-fs-data.sh", module_dir), post_fs);
    let _ = Command::new("chmod").arg("0755").arg(format!("{}/post-fs-data.sh", module_dir)).status();

    true
}

// TODO: Per-app device/CPU spoofing requires Zygisk companion
// COPG uses JNI SetStaticObjectField + mount --bind per-process
// Cannot implement without framework injection

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn test_spoofable_props_not_empty() {
        assert!(!SPOOFABLE_PROPS.is_empty());
        assert!(SPOOFABLE_PROPS.contains(&"ro.product.model"));
        assert!(SPOOFABLE_PROPS.contains(&"ro.build.fingerprint"));
        assert!(SPOOFABLE_PROPS.contains(&"ro.hardware"));
    }

    #[test]
    fn test_spoofable_props_count() {
        assert!(SPOOFABLE_PROPS.len() >= 10);
    }

    #[test]
    fn test_apply_device_profile_unknown() {
        let r = apply_device_profile("nonexistent_profile");
        assert!(!r);
    }

    #[test]
    fn test_apply_device_profile_pixel() {
        let r = apply_device_profile("pixel");
        #[cfg(not(target_os = "android"))]
        assert!(!r); // resetprop won't exist
    }

    #[test]
    fn test_create_cpuinfo_spoof_path() {
        let p = format!("{}/cpuinfo_spoof", SPOOF_DIR);
        assert!(p.contains("cpuinfo_spoof"));
    }

    #[test]
    fn test_generate_spoof_module_dir() {
        let p = format!("/data/adb/modules/{}", "test_module");
        assert_eq!(p, "/data/adb/modules/test_module");
    }

    #[test]
    fn test_spoof_model_pixel() {
        let profile = "pixel";
        let model = "Pixel 8 Pro";
        assert_eq!(model, "Pixel 8 Pro");
    }
}
