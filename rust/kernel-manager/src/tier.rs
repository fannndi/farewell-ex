use std::process::Command;
use crate::sysfs;

// ==================== Tier System ====================
// Based on real projects:
//   KernelSU-Next: kernel root (kernel/ksud)
//   ZygiskNext: standalone Zygisk (zygisk module)
//   Vector: modern Xposed framework (LSPlant-based)
//   ZN-AuditPatch: audit log anti-detection

#[derive(Debug, Clone, Copy, PartialEq, Eq, PartialOrd, Ord)]
pub enum Tier {
    NonRoot = 1,
    Adb = 2,
    Root = 3,
    Zygisk = 4,
    Xposed = 5,
}

impl Tier {
    pub fn name(&self) -> &str {
        match self {
            Tier::NonRoot => "Non-ROOT",
            Tier::Adb => "ADB",
            Tier::Root => "Full ROOT",
            Tier::Zygisk => "ReZygisk/ZygiskNext",
            Tier::Xposed => "Vector/Xposed",
        }
    }
    pub fn description(&self) -> &str {
        match self {
            Tier::NonRoot => "Read-only: CPU/GPU/Battery/Thermal info",
            Tier::Adb => "Limited write: wm density, settings put",
            Tier::Root => "All sysfs writes, resetprop, mount --bind",
            Tier::Zygisk => "Per-app: device spoof, CPU spoof, renderer",
            Tier::Xposed => "Per-app: DPI, DisplayMetrics, font scaling",
        }
    }
}

// ==================== Framework Detection ====================

pub struct FrameworkStatus {
    pub kernelsu: bool,
    pub kernelsu_version: String,
    pub magisk: bool,
    pub magisk_version: String,
    pub zygisk_next: bool,
    pub zygisk_next_version: String,
    pub vector: bool,
    pub vector_version: String,
    pub zn_audit_patch: bool,
    pub shizuku: bool,
    pub resetprop: bool,
    pub current_tier: Tier,
}

impl FrameworkStatus {
    pub fn detect() -> Self {
        let ks = detect_kernelsu();
        let mag = detect_magisk();
        let zn = detect_zygisk_next();
        let vec = detect_vector();
        let audit = detect_zn_audit_patch();
        let shizuku = detect_shizuku();
        let rp = detect_resetprop();

        let tier = determine_tier(&ks.0, &mag.0, &zn.0, &vec.0, &shizuku, &rp);

        FrameworkStatus {
            kernelsu: ks.0,
            kernelsu_version: ks.1,
            magisk: mag.0,
            magisk_version: mag.1,
            zygisk_next: zn.0,
            zygisk_next_version: zn.1,
            vector: vec.0,
            vector_version: vec.1,
            zn_audit_patch: audit,
            shizuku,
            resetprop: rp,
            current_tier: tier,
        }
    }

    pub fn to_json(&self) -> String {
        format!(
            r#"{{"kernelsu":{},"kernelsu_version":"{}","magisk":{},"magisk_version":"{}","zygisk_next":{},"zygisk_next_version":"{}","vector":{},"vector_version":"{}","zn_audit_patch":{},"shizuku":{},"resetprop":{},"tier":{},"tier_name":"{}"}}"#,
            self.kernelsu, self.kernelsu_version,
            self.magisk, self.magisk_version,
            self.zygisk_next, self.zygisk_next_version,
            self.vector, self.vector_version,
            self.zn_audit_patch, self.shizuku, self.resetprop,
            self.current_tier as i32, self.current_tier.name()
        )
    }
}

// ==================== KernelSU-Next Detection ====================
// Source: KernelSU-Next kernel + userspace

fn detect_kernelsu() -> (bool, String) {
    // Method 1: Check /data/adb/ksu (KernelSU data dir)
    if sysfs::file_exists("/data/adb/ksu") {
        let ver = Command::new("ksud").arg("--version").output();
        let version = match ver {
            Ok(o) => String::from_utf8_lossy(&o.stdout).trim().to_string(),
            Err(_) => "unknown".to_string(),
        };
        return (true, version);
    }
    // Method 2: Check kernel module
    if sysfs::file_exists("/sys/module/ksu") || sysfs::file_exists("/sys/module/kernelsu") {
        return (true, "kernel".to_string());
    }
    // Method 3: Check ksud binary
    if sysfs::file_exists("/data/adb/ksud") {
        return (true, "ksud".to_string());
    }
    (false, String::new())
}

// ==================== Magisk Detection ====================

fn detect_magisk() -> (bool, String) {
    if sysfs::file_exists("/data/adb/magisk") || sysfs::file_exists("/data/adb/.magisk") {
        let ver = Command::new("magisk").arg("--version").output();
        let version = match ver {
            Ok(o) => String::from_utf8_lossy(&o.stdout).trim().to_string(),
            Err(_) => "unknown".to_string(),
        };
        return (true, version);
    }
    (false, String::new())
}

// ==================== ZygiskNext Detection ====================
// Source: Dr-TSNG/ZygiskNext
// Module path: /data/adb/modules/zygisk_next or /data/adb/modules/rezygisk

fn detect_zygisk_next() -> (bool, String) {
    let paths = [
        "/data/adb/modules/zygisk_next",
        "/data/adb/modules/rezygisk",
        "/data/adb/zygisk",
    ];
    for path in &paths {
        if sysfs::file_exists(path) {
            let ver_path = format!("{}/module.prop", path);
            let version = if let Some(content) = sysfs::read_sysfs_cached(&ver_path, 0) {
                content.lines()
                    .find(|l| l.starts_with("version="))
                    .map(|l| l.trim_start_matches("version=").to_string())
                    .unwrap_or_else(|| "unknown".to_string())
            } else {
                "unknown".to_string()
            };
            return (true, version);
        }
    }
    // Check system property
    let output = Command::new("getprop").arg("persist.sys.zygisk").output();
    if let Ok(o) = output {
        let val = String::from_utf8_lossy(&o.stdout).trim().to_string();
        if val == "true" || val == "1" {
            return (true, "property".to_string());
        }
    }
    (false, String::new())
}

// ==================== Vector (Xposed) Detection ====================
// Source: JingMatrix/Vector
// Module path: /data/adb/modules/vector or /data/adb/lspd

fn detect_vector() -> (bool, String) {
    let paths = [
        "/data/adb/modules/vector",
        "/data/adb/modules/zygisk_lsposed",
        "/data/adb/modules/riru_lsposed",
        "/data/adb/lspd",
        "/data/adb/modules/lsposed",
    ];
    for path in &paths {
        if sysfs::file_exists(path) {
            let ver_path = format!("{}/module.prop", path);
            let version = if let Some(content) = sysfs::read_sysfs_cached(&ver_path, 0) {
                content.lines()
                    .find(|l| l.starts_with("version="))
                    .map(|l| l.trim_start_matches("version=").to_string())
                    .unwrap_or_else(|| "unknown".to_string())
            } else {
                "unknown".to_string()
            };
            return (true, version);
        }
    }
    // Check system property
    let output = Command::new("getprop").arg("persist.sys.lsposed").output();
    if let Ok(o) = output {
        let val = String::from_utf8_lossy(&o.stdout).trim().to_string();
        if val == "true" || val == "1" {
            return (true, "property".to_string());
        }
    }
    (false, String::new())
}

// ==================== ZN-AuditPatch Detection ====================
// Source: aviraxp/ZN-AuditPatch
// Module path: /data/adb/modules/zn_audit_patch

fn detect_zn_audit_patch() -> bool {
    sysfs::file_exists("/data/adb/modules/zn_audit_patch")
        || sysfs::file_exists("/data/adb/modules/audit_patch")
}

// ==================== Shizuku Detection ====================

fn detect_shizuku() -> bool {
    // Check if Shizuku server is running via property
    let output = Command::new("getprop").arg("persist.sys.shizuku").output();
    if let Ok(o) = output {
        let val = String::from_utf8_lossy(&o.stdout).trim().to_string();
        if val == "true" || val == "1" { return true; }
    }
    // Check Shizuku manager app
    sysfs::file_exists("/data/data/moe.shizuku.manager")
}

// ==================== resetprop Detection ====================

fn detect_resetprop() -> bool {
    Command::new("which").arg("resetprop").output()
        .map(|o| o.status.success())
        .unwrap_or(false)
        || sysfs::file_exists("/system/bin/resetprop")
        || sysfs::file_exists("/data/adb/magisk/magiskpolicy")
}

// ==================== Tier Determination ====================

fn determine_tier(
    kernelsu: &bool,
    magisk: &bool,
    zygisk_next: &bool,
    vector: &bool,
    shizuku: &bool,
    resetprop: &bool,
) -> Tier {
    // Tier 5: Xposed (Vector/LSPosed)
    if *vector {
        return Tier::Xposed;
    }
    // Tier 4: Zygisk (ZygiskNext)
    if *zygisk_next {
        return Tier::Zygisk;
    }
    // Tier 3: Root (KernelSU or Magisk with resetprop)
    if *kernelsu || *magisk {
        return Tier::Root;
    }
    // Tier 2: ADB (Shizuku)
    if *shizuku {
        return Tier::Adb;
    }
    // Tier 1: Non-Root
    Tier::NonRoot
}

// ==================== Feature Unlock Check ====================

pub struct FeatureUnlock {
    pub name: String,
    pub min_tier: Tier,
    pub description: String,
    pub unlocked: bool,
}

pub fn get_feature_matrix(tier: &Tier) -> Vec<FeatureUnlock> {
    let features = vec![
        // Tier 1: Non-ROOT
        ("read_cpu_info", Tier::NonRoot, "Read CPU info (freq, governor, clusters)"),
        ("read_gpu_info", Tier::NonRoot, "Read GPU info (model, freq, load)"),
        ("read_battery_info", Tier::NonRoot, "Read battery (level, temp, voltage)"),
        ("read_thermal_info", Tier::NonRoot, "Read thermal zones"),
        ("read_memory_info", Tier::NonRoot, "Read memory/ZRAM info"),
        ("read_io_info", Tier::NonRoot, "Read I/O scheduler info"),

        // Tier 2: ADB
        ("set_global_density", Tier::Adb, "Global DPI via wm density"),
        ("set_global_font_scale", Tier::Adb, "Global font scale via settings"),
        ("set_immersive_mode", Tier::Adb, "Immersive mode via settings"),
        ("set_screen_brightness", Tier::Adb, "Screen brightness via settings"),

        // Tier 3: ROOT
        ("set_cpu_governor", Tier::Root, "Switch CPU governor"),
        ("set_cpu_freq_limit", Tier::Root, "Set CPU frequency limits"),
        ("set_cpu_online", Tier::Root, "Online/offline CPU cores"),
        ("set_gpu_power_levels", Tier::Root, "GPU power level control"),
        ("set_gpu_force", Tier::Root, "GPU force params (clk/bus/rail)"),
        ("set_adreno_idler", Tier::Root, "Adreno Idler params"),
        ("set_simple_gpu", Tier::Root, "Simple GPU Algorithm"),
        ("set_bus_dcvs", Tier::Root, "Bus DCVS freq control"),
        ("set_renderer_global", Tier::Root, "Global GPU renderer (resetprop)"),
        ("set_device_spoof_global", Tier::Root, "Global device spoof (resetprop)"),
        ("set_cpu_spoof_global", Tier::Root, "Global CPU spoof (mount --bind)"),
        ("set_msm_thermal", Tier::Root, "MSM thermal toggle"),
        ("set_eara_thermal", Tier::Root, "EARA thermal toggle"),
        ("set_fpsgo", Tier::Root, "FPSGO toggle"),
        ("set_thermal_sconfig", Tier::Root, "Thermal sconfig preset"),
        ("set_bypass_charging", Tier::Root, "Bypass charging control"),
        ("set_io_scheduler", Tier::Root, "I/O scheduler switch"),
        ("set_sched_features", Tier::Root, "Scheduler features toggle"),
        ("set_stune_boost", Tier::Root, "Stune boost control"),
        ("set_bore_scheduler", Tier::Root, "BORE scheduler"),
        ("set_uclamp", Tier::Root, "Uclamp min/max control"),
        ("set_tcp_congestion", Tier::Root, "TCP congestion control"),
        ("set_vfs_cache_pressure", Tier::Root, "VFS cache pressure"),
        ("set_swappiness", Tier::Root, "Swappiness control"),
        ("set_dirty_ratio", Tier::Root, "Dirty ratio control"),
        ("set_zram_algorithm", Tier::Root, "ZRAM algorithm switch"),
        ("set_zram_size", Tier::Root, "ZRAM size control"),
        ("set_dt2w", Tier::Root, "Double-tap-to-wake"),
        ("set_kcal", Tier::Root, "KCAL color control"),
        ("set_sound_controls", Tier::Root, "Sound boost controls"),
        ("set_dnd", Tier::Root, "Do Not Disturb"),
        ("apply_boot_config", Tier::Root, "Apply settings on boot"),
        ("start_profile_monitor", Tier::Root, "Foreground app monitor"),

        // Tier 4: Zygisk (ZygiskNext)
        ("set_renderer_per_app", Tier::Zygisk, "Per-app GPU renderer (SkiaShift)"),
        ("set_device_spoof_per_app", Tier::Zygisk, "Per-app device spoof (COPG)"),
        ("set_cpu_spoof_per_app", Tier::Zygisk, "Per-app CPU spoof (COPG)"),
        ("set_android_id_per_app", Tier::Zygisk, "Per-app Android ID (COPG)"),

        // Tier 5: Xposed (Vector)
        ("set_dpi_per_app", Tier::Xposed, "Per-app DPI (DPIS)"),
        ("set_font_per_app", Tier::Xposed, "Per-app font scale (DPIS)"),
        ("set_display_metrics_per_app", Tier::Xposed, "Per-app DisplayMetrics (DPIS)"),
        ("set_renderer_xposed", Tier::Xposed, "Per-app renderer via Xposed"),
    ];

    features.into_iter().map(|(name, min_tier, desc)| {
        FeatureUnlock {
            name: name.to_string(),
            min_tier,
            description: desc.to_string(),
            unlocked: *tier >= min_tier,
        }
    }).collect()
}

pub fn get_unlocked_features(tier: &Tier) -> Vec<String> {
    get_feature_matrix(tier).iter()
        .filter(|f| f.unlocked)
        .map(|f| f.name.clone())
        .collect()
}

pub fn get_locked_features(tier: &Tier) -> Vec<String> {
    get_feature_matrix(tier).iter()
        .filter(|f| !f.unlocked)
        .map(|f| f.name.clone())
        .collect()
}
