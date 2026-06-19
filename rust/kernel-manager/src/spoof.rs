use std::process::Command;
use crate::sysfs;

// ==================== Device Property Spoof (COPG resetprop approach) ====================
// Per-app spoofing requires Zygisk companion — marked TODO
// Global spoofing via resetprop + mount --bind is sufficient for most use cases

pub const SPOOFABLE_PROPS: &[&str] = &[
    "ro.product.model", "ro.product.brand", "ro.product.device",
    "ro.product.manufacturer", "ro.product.name", "ro.product.board",
    "ro.build.fingerprint", "ro.build.display.id", "ro.build.id",
    "ro.build.tags", "ro.build.type", "ro.hardware", "ro.bootloader",
    "ro.build.version.security_patch", "ro.build.version.incremental",
    "ro.soc.manufacturer", "ro.soc.model",
];

pub fn resetprop(key: &str, value: &str) -> bool {
    Command::new("resetprop").args([key, value]).status().is_ok()
}

pub fn getprop(key: &str) -> String {
    let output = Command::new("getprop").arg(key).output();
    match output {
        Ok(o) => String::from_utf8_lossy(&o.stdout).trim().to_string(),
        Err(_) => String::new(),
    }
}

pub fn spoof_device_property(key: &str, value: &str) -> bool {
    resetprop(key, value)
}

pub fn restore_device_property(key: &str) -> bool {
    // resetprop --delete removes the override, system default returns
    Command::new("resetprop").args(["--delete", key]).status().is_ok()
}

pub fn restore_all_spoofs() -> bool {
    let mut all_ok = true;
    for prop in SPOOFABLE_PROPS {
        if !restore_device_property(prop) { all_ok = false; }
    }
    unmount_cpuinfo_spoof();
    all_ok
}

// ==================== CPU Info Spoof (COPG mount --bind approach) ====================

const SPOOF_DIR: &str = "/data/local/tmp";

pub fn create_cpuinfo_spoof(content: &str) -> bool {
    let path = format!("{}/cpuinfo_spoof", SPOOF_DIR);
    match std::fs::write(&path, content) {
        Ok(_) => {
            let _ = Command::new("chmod").arg("444").arg(&path).status();
            true
        }
        Err(_) => false,
    }
}

pub fn mount_cpuinfo_spoof() -> bool {
    let spoof_path = format!("{}/cpuinfo_spoof", SPOOF_DIR);
    if !sysfs::file_exists(&spoof_path) { return false; }
    // Unmount first if already mounted
    let _ = Command::new("umount").arg("/proc/cpuinfo").status();
    Command::new("mount").args(["--bind", &spoof_path, "/proc/cpuinfo"]).status().is_ok()
}

pub fn unmount_cpuinfo_spoof() -> bool {
    Command::new("umount").arg("/proc/cpuinfo").status().is_ok()
}

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
