use std::collections::HashMap;
use std::process::Command;
use std::sync::atomic::{AtomicBool, Ordering};
use std::thread;
use std::time::Duration;
use crate::renderer;
use crate::spoof;
use crate::display_control;
use crate::sysfs;

const PROFILE_PATH: &str = "/data/local/tmp/farewell_profiles.json";
const BOOT_CONFIG_PATH: &str = "/data/local/tmp/farewell_boot_config.json";
const MONITOR_INTERVAL_MS: u64 = 500;

pub static MONITOR_ACTIVE: AtomicBool = AtomicBool::new(false);

// ==================== Foreground App Detection ====================

/// Get foreground app package name via `dumpsys`.
///
/// **Root:** Not required (ADB)
/// **Returns:** Package name string, or empty if unavailable
pub fn get_foreground_app() -> String {
    let output = Command::new("dumpsys")
        .args(["activity", "activities"])
        .output();
    match output {
        Ok(o) => {
            let stdout = String::from_utf8_lossy(&o.stdout);
            for line in stdout.lines() {
                if line.contains("mResumedActivity") || line.contains("mFocusedActivity") {
                    if let Some(pkg_start) = line.find("com.") {
                        let rest = &line[pkg_start..];
                        if let Some(end) = rest.find(|c: char| c == '/' || c == ' ' || c == '}') {
                            return rest[..end].to_string();
                        }
                    }
                    if let Some(pkg_start) = line.find("org.") {
                        let rest = &line[pkg_start..];
                        if let Some(end) = rest.find(|c: char| c == '/' || c == ' ' || c == '}') {
                            return rest[..end].to_string();
                        }
                    }
                }
            }
            String::new()
        }
        Err(_) => String::new(),
    }
}

/// Fallback foreground app detection via `dumpsys window`.
///
/// **Root:** Not required (ADB)
/// **Returns:** Package name string, or empty if unavailable
pub fn get_foreground_app_cmdline() -> String {
    let output = Command::new("sh")
        .arg("-c")
        .arg("dumpsys window | grep mCurrentFocus | head -1")
        .output();
    match output {
        Ok(o) => {
            let stdout = String::from_utf8_lossy(&o.stdout);
            for line in stdout.lines() {
                for prefix in &["com.", "org.", "io.", "app.", "me."] {
                    if let Some(start) = line.find(prefix) {
                        let rest = &line[start..];
                        if let Some(end) = rest.find(|c: char| c == '/' || c == ' ') {
                            return rest[..end].to_string();
                        }
                    }
                }
            }
            String::new()
        }
        Err(_) => String::new(),
    }
}

// ==================== Per-App Profile ====================

#[derive(Debug, Clone)]
pub struct AppProfile {
    pub package: String,
    pub renderer: String,
    pub density: i32,
    pub font_scale: f32,
    pub device_profile: String,
    pub cpu_governor: String,
    pub gpu_max_pwrlevel: i32,
    pub thermal_preset: String,
}

impl AppProfile {
    pub fn default_for(pkg: &str) -> Self {
        AppProfile {
            package: pkg.to_string(),
            renderer: "default".to_string(),
            density: 0,
            font_scale: 1.0,
            device_profile: "default".to_string(),
            cpu_governor: "default".to_string(),
            gpu_max_pwrlevel: -1,
            thermal_preset: "default".to_string(),
        }
    }
}

/// Manages per-app tuning profiles and applies them on foreground change.
pub struct ProfileManager {
    profiles: HashMap<String, AppProfile>,
    current_pkg: String,
    current_renderer: String,
    current_density: i32,
    current_font_scale: f32,
    current_device_profile: String,
    default_density: i32,
    default_font_scale: f32,
}

impl ProfileManager {
    pub fn new() -> Self {
        ProfileManager {
            profiles: HashMap::new(),
            current_pkg: String::new(),
            current_renderer: "default".to_string(),
            current_density: 0,
            current_font_scale: 1.0,
            current_device_profile: "default".to_string(),
            default_density: display_control::get_physical_density(),
            default_font_scale: 1.0,
        }
    }

    pub fn add_profile(&mut self, profile: AppProfile) {
        self.profiles.insert(profile.package.clone(), profile);
    }

    pub fn remove_profile(&mut self, pkg: &str) {
        self.profiles.remove(pkg);
    }

    pub fn list_profiles(&self) -> Vec<String> {
        self.profiles.keys().cloned().collect()
    }

    pub fn load_profiles_json(&mut self, json: &str) -> bool {
        self.profiles.clear();
        match serde_json::from_str::<Vec<AppProfileJson>>(json) {
            Ok(arr) => {
                for p in arr {
                    self.profiles.insert(p.package.clone(), AppProfile {
                        package: p.package,
                        renderer: p.renderer,
                        density: p.density,
                        font_scale: p.font_scale,
                        device_profile: p.device_profile,
                        cpu_governor: p.cpu_governor,
                        gpu_max_pwrlevel: p.gpu_max_pwrlevel,
                        thermal_preset: p.thermal_preset,
                    });
                }
                true
            }
            Err(_) => false,
        }
    }

    pub fn save_profiles_json(&self) -> String {
        let arr: Vec<AppProfileJson> = self.profiles.values().map(|p| AppProfileJson {
            package: p.package.clone(),
            renderer: p.renderer.clone(),
            density: p.density,
            font_scale: p.font_scale,
            device_profile: p.device_profile.clone(),
            cpu_governor: p.cpu_governor.clone(),
            gpu_max_pwrlevel: p.gpu_max_pwrlevel,
            thermal_preset: p.thermal_preset.clone(),
        }).collect();
        serde_json::to_string_pretty(&arr).unwrap_or_else(|_| "[]".to_string())
    }

    pub fn apply_profile(&mut self, pkg: &str) {
        if pkg == self.current_pkg { return; }
        self.current_pkg = pkg.to_string();

        if let Some(profile) = self.profiles.get(pkg) {
            // Renderer
            if profile.renderer != "default" && profile.renderer != self.current_renderer {
                renderer::set_renderer(&profile.renderer);
                self.current_renderer = profile.renderer.clone();
            }
            // Density
            if profile.density > 0 && profile.density != self.current_density {
                display_control::set_global_density(profile.density);
                self.current_density = profile.density;
            }
            // Font scale
            if profile.font_scale != 1.0 && profile.font_scale != self.current_font_scale {
                display_control::set_global_font_scale(profile.font_scale);
                self.current_font_scale = profile.font_scale;
            }
            // Device spoof
            if profile.device_profile != "default" && profile.device_profile != self.current_device_profile {
                spoof::apply_device_profile(&profile.device_profile);
                self.current_device_profile = profile.device_profile.clone();
            }
            // CPU governor
            if profile.cpu_governor != "default" {
                crate::cpu::set_governor(&profile.cpu_governor);
            }
            // GPU power level
            if profile.gpu_max_pwrlevel >= 0 {
                crate::gpu::set_gpu_power_levels(0, profile.gpu_max_pwrlevel);
            }
            // Thermal preset
            if profile.thermal_preset != "default" {
                crate::thermal::set_thermal_sconfig(&profile.thermal_preset);
            }
        } else {
            // No profile for this app — restore defaults
            self.restore_defaults();
        }
    }

    pub fn restore_defaults(&mut self) {
        if self.current_renderer != "default" {
            // Don't force renderer back, let user's global setting stand
            self.current_renderer = "default".to_string();
        }
        if self.current_density != 0 && self.current_density != self.default_density {
            display_control::reset_global_density();
            self.current_density = 0;
        }
        if self.current_font_scale != 1.0 {
            display_control::set_global_font_scale(self.default_font_scale);
            self.current_font_scale = self.default_font_scale;
        }
        if self.current_device_profile != "default" {
            spoof::restore_all_spoofs();
            self.current_device_profile = "default".to_string();
        }
    }

    pub fn start_monitor(&mut self) {
        while MONITOR_ACTIVE.load(Ordering::Relaxed) {
            let foreground = get_foreground_app();
            if !foreground.is_empty() && foreground != self.current_pkg {
                self.apply_profile(&foreground);
            } else if foreground.is_empty() {
                let fallback = get_foreground_app_cmdline();
                if !fallback.is_empty() && fallback != self.current_pkg {
                    self.apply_profile(&fallback);
                }
            }
            thread::sleep(Duration::from_millis(MONITOR_INTERVAL_MS));
        }
    }

    pub fn start_monitor_thread() {
        if MONITOR_ACTIVE.swap(true, Ordering::Relaxed) { return; }
        thread::spawn(|| {
            let mut mgr = ProfileManager::new();
            if let Ok(json) = std::fs::read_to_string(PROFILE_PATH) {
                mgr.load_profiles_json(&json);
            }
            mgr.start_monitor();
        });
    }
}

#[derive(serde::Serialize, serde::Deserialize)]
struct AppProfileJson {
    package: String,
    renderer: String,
    density: i32,
    font_scale: f32,
    device_profile: String,
    cpu_governor: String,
    gpu_max_pwrlevel: i32,
    thermal_preset: String,
}

/// Save app profiles JSON to a file.
///
/// **Root:** Required
/// **Returns:** `true` if file was written successfully
pub fn save_profiles_to_file(path: &str, json: &str) -> bool {
    std::fs::write(path, json).is_ok()
}

/// Load app profiles JSON from a file.
///
/// **Root:** Not required
/// **Returns:** JSON string, or "[]" on error
pub fn load_profiles_from_file(path: &str) -> String {
    std::fs::read_to_string(path).unwrap_or_else(|_| "[]".to_string())
}

// ==================== Framework Detection ====================

/// Check if ReZygisk module is installed.
///
/// **Root:** Not required
/// **Returns:** `true` if ReZygisk is present
pub fn has_rezygisk() -> bool {
    sysfs::file_exists("/data/adb/rezygisk")
        || sysfs::file_exists("/data/adb/modules/rezygisk")
        || sysfs::file_exists("/data/adb/ksu/modules/rezygisk")
}

/// Check if LSPosed/Vector module is installed.
///
/// **Root:** Not required
/// **Returns:** `true` if LSPosed is present
pub fn has_lsposed() -> bool {
    sysfs::file_exists("/data/adb/lspd")
        || sysfs::file_exists("/data/adb/modules/zygisk_lsposed")
        || sysfs::file_exists("/data/adb/modules/riru_lsposed")
}

/// Check if KernelSU is installed.
///
/// **Root:** Not required
/// **Returns:** `true` if KernelSU is present
pub fn has_kernelsu() -> bool {
    sysfs::file_exists("/data/adb/ksu")
        || sysfs::file_exists("/data/adb/modules")
        || sysfs::file_exists("/sys/module/kernelsu")
}

/// Check if Magisk is installed.
///
/// **Root:** Not required
/// **Returns:** `true` if Magisk is present
pub fn has_magisk() -> bool {
    sysfs::file_exists("/data/adb/magisk")
        || sysfs::file_exists("/data/adb/.magisk")
}

/// Check if resetprop tool is available.
///
/// **Root:** Not required
/// **Returns:** `true` if resetprop exists
pub fn has_resetprop() -> bool {
    Command::new("which").arg("resetprop").output()
        .map(|o| o.status.success())
        .unwrap_or(false)
        || sysfs::file_exists("/system/bin/resetprop")
        || sysfs::file_exists("/data/adb/magisk/magiskpolicy")
}

/// Get comma-separated string of detected frameworks.
///
/// **Root:** Not required
/// **Returns:** Framework list (e.g., "KernelSU, Magisk, resetprop") or "none"
pub fn get_framework_status() -> String {
    let mut status = Vec::new();
    if has_kernelsu() { status.push("KernelSU"); }
    if has_magisk() { status.push("Magisk"); }
    if has_rezygisk() { status.push("ReZygisk"); }
    if has_lsposed() { status.push("LSPosed"); }
    if has_resetprop() { status.push("resetprop"); }
    if status.is_empty() { "none".to_string() } else { status.join(", ") }
}

// ==================== DND Control (AZenith/Xtra-Kernel GameControl) ====================

/// Enable/disable Do Not Disturb mode.
///
/// **Root:** Not required (ADB settings)
/// **Returns:** `true` if settings put succeeded
pub fn set_dnd_enabled(enabled: bool) -> bool {
    let val = if enabled { "0" } else { "1" };
    Command::new("settings").args(["put", "global", "heads_up_notifications_enabled", val]).status().is_ok()
}

/// Enable/disable immersive mode for a package.
///
/// **Root:** Not required (ADB settings)
/// **Returns:** `true` if settings put succeeded
pub fn set_immersive_mode(pkg: &str, enabled: bool) -> bool {
    let mode = if enabled { "immersive.full=" } else { "" };
    let val = if enabled { format!("{}{}", mode, pkg) } else { "".to_string() };
    Command::new("settings").args(["put", "global", "policy_control", &val]).status().is_ok()
}

/// Drop caches and kill background apps.
///
/// **Root:** Required
/// **Returns:** Always `true`
pub fn drop_caches_and_kill() -> bool {
    let _ = Command::new("sh").arg("-c").arg("sync && echo 3 > /proc/sys/vm/drop_caches && am kill-all").status();
    true
}

/// Set screen brightness via settings.
///
/// **Root:** Not required (ADB settings)
/// **Returns:** `true` if settings put succeeded
pub fn set_screen_brightness(value: i32) -> bool {
    Command::new("settings").args(["put", "system", "screen_brightness", &value.to_string()]).status().is_ok()
}

/// Set screen brightness to manual mode.
///
/// **Root:** Not required (ADB settings)
/// **Returns:** `true` if settings put succeeded
pub fn set_screen_brightness_mode_manual() -> bool {
    Command::new("settings").args(["put", "system", "screen_brightness_mode", "0"]).status().is_ok()
}

// ==================== Apply-on-Boot ====================

/// Save boot config JSON for apply-on-boot.
///
/// **Root:** Required
/// **Returns:** `true` if file was written
pub fn save_boot_config(config: &str) -> bool {
    std::fs::write(BOOT_CONFIG_PATH, config).is_ok()
}

/// Load boot config JSON.
///
/// **Root:** Not required
/// **Returns:** JSON string, or "{}" on error
pub fn load_boot_config() -> String {
    std::fs::read_to_string(BOOT_CONFIG_PATH).unwrap_or_else(|_| "{}".to_string())
}

/// Apply saved boot config (renderer, governor, thermal, etc.).
///
/// **Root:** Required
/// **Returns:** `true` if config parsed and applied
pub fn apply_boot_config() -> bool {
    let config = load_boot_config();
    if config == "{}" { return false; }
    match serde_json::from_str::<BootConfig>(&config) {
        Ok(cfg) => {
            if cfg.renderer != "default" { renderer::set_renderer(&cfg.renderer); }
            if cfg.cpu_governor != "default" { crate::cpu::set_governor(&cfg.cpu_governor); }
            if cfg.gpu_max_pwrlevel >= 0 { crate::gpu::set_gpu_power_levels(0, cfg.gpu_max_pwrlevel); }
            if cfg.thermal_preset != "default" { crate::thermal::set_thermal_sconfig(&cfg.thermal_preset); }
            if cfg.swappiness > 0 { crate::memory::set_swappiness(cfg.swappiness); }
            if cfg.io_scheduler != "default" {
                if let Some(dev) = &cfg.io_device {
                    crate::io::set_io_scheduler(dev, &cfg.io_scheduler);
                }
            }
            if cfg.tcp_congestion != "default" { crate::network::set_tcp_congestion(&cfg.tcp_congestion); }
            true
        }
        Err(_) => false,
    }
}

#[derive(serde::Serialize, serde::Deserialize)]
/// Persisted boot configuration for apply-on-boot.
pub struct BootConfig {
    pub renderer: String,
    pub cpu_governor: String,
    pub gpu_max_pwrlevel: i32,
    pub thermal_preset: String,
    pub swappiness: i32,
    pub io_scheduler: String,
    pub io_device: Option<String>,
    pub tcp_congestion: String,
}

impl BootConfig {
    pub fn default() -> Self {
        BootConfig {
            renderer: "default".to_string(),
            cpu_governor: "default".to_string(),
            gpu_max_pwrlevel: -1,
            thermal_preset: "default".to_string(),
            swappiness: 0,
            io_scheduler: "default".to_string(),
            io_device: None,
            tcp_congestion: "default".to_string(),
        }
    }
}

// LEFTOVER: Perfect per-app renderer override (no flicker)
// Requires: ReZygisk or LSPosed for per-process __system_property_get hooking

// LEFTOVER: Per-process COW property spoof

// LEFTOVER: Per-process Android ID forge

// LEFTOVER: Per-app DPI without flicker
// Requires: LSPosed hooks on Display.getMetrics(), ResourcesImpl.updateConfiguration()

// LEFTOVER: Per-app mount namespace isolation
// Requires: Zygisk companion with unshare(CLONE_NEWNS) before app specialization

// ==================== Screen State Tracking (AZenith) ====================

/// Check if the screen is currently on.
///
/// **Root:** Not required (dumpsys)
/// **Returns:** `true` if screen is awake
pub fn is_screen_on() -> bool {
    sysfs::read_sysfs_cached("/sys/power/state", 0).is_some() || {
        Command::new("dumpsys").args(["power"]).output()
            .map(|o| String::from_utf8_lossy(&o.stdout).contains("mWakefulness=Awake"))
            .unwrap_or(true)
    }
}

/// Wait up to `ms` milliseconds for screen to turn on.
///
/// **Root:** Not required
/// **Returns:** Nothing
pub fn set_screen_grace_period(ms: u64) {
    for _ in 0..(ms / 500) {
        if !is_screen_on() { thread::sleep(Duration::from_millis(500)); }
        else { break; }
    }
}

// ==================== Failure Debounce (AZenith) ====================

/// Write to a sysfs path with retry and debounce.
///
/// **Root:** Required
/// **Returns:** `true` if write succeeded within retries
pub fn debounce_write(path: &str, value: &str, max_retries: u32) -> bool {
    for attempt in 0..max_retries {
        if attempt > 0 { thread::sleep(Duration::from_millis(50)); }
        let ok = sysfs::chmod(path, "644");
        if !ok { continue; }
        let written = sysfs::write_sysfs(path, value);
        sysfs::chmod(path, "444");
        if written { return true; }
    }
    false
}

/// Track failure count and return true after 6 consecutive failures.
///
/// **Root:** N/A
/// **Returns:** `true` if 6+ failures reached (counter resets)
pub fn has_excessive_failures(fail_count: &mut u32) -> bool {
    *fail_count += 1;
    if *fail_count >= 6 {
        *fail_count = 0;
        true
    } else { false }
}

// ==================== Periodic FSTrim (AZenith) ====================

/// Run `fstrim -v /data` to discard unused blocks.
///
/// **Root:** Required
/// **Returns:** `true` if fstrim succeeded
pub fn fstrim_all() -> bool {
    Command::new("fstrim").args(["-v", "/data"]).output()
        .map(|o| o.status.success())
        .unwrap_or(false)
}

/// Check if at least 12 hours have passed since last fstrim.
///
/// **Root:** N/A
/// **Returns:** `true` if fstrim should run
pub fn should_run_fstrim(last_trim_hour: &mut u64) -> bool {
    use std::time::{SystemTime, UNIX_EPOCH};
    let now = SystemTime::now().duration_since(UNIX_EPOCH).unwrap_or_default().as_secs() / 3600;
    if now - *last_trim_hour >= 12 {
        *last_trim_hour = now;
        true
    } else { false }
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn test_boot_config_roundtrip() {
        let cfg = BootConfig {
            renderer: "vulkan".into(),
            cpu_governor: "performance".into(),
            gpu_max_pwrlevel: 2,
            thermal_preset: "extreme".into(),
            swappiness: 100,
            io_scheduler: "bfq".into(),
            io_device: Some("sda".into()),
            tcp_congestion: "bbr".into(),
        };
        let json = serde_json::to_string(&cfg).unwrap();
        let d: BootConfig = serde_json::from_str(&json).unwrap();
        assert_eq!(d.renderer, "vulkan");
        assert_eq!(d.cpu_governor, "performance");
        assert_eq!(d.gpu_max_pwrlevel, 2);
        assert_eq!(d.swappiness, 100);
        assert_eq!(d.io_scheduler, "bfq");
        assert_eq!(d.io_device, Some("sda".into()));
        assert_eq!(d.tcp_congestion, "bbr");
    }

    #[test]
    fn test_boot_config_default() {
        let cfg = BootConfig::default();
        assert_eq!(cfg.renderer, "default");
        assert_eq!(cfg.cpu_governor, "default");
        assert_eq!(cfg.gpu_max_pwrlevel, -1);
        assert_eq!(cfg.swappiness, 0);
        assert!(cfg.io_device.is_none());
    }

    #[test]
    fn test_app_profile_default() {
        let p = AppProfile::default_for("com.example.app");
        assert_eq!(p.package, "com.example.app");
        assert_eq!(p.renderer, "default");
        assert_eq!(p.density, 0);
        assert!((p.font_scale - 1.0).abs() < f32::EPSILON);
        assert_eq!(p.device_profile, "default");
        assert_eq!(p.gpu_max_pwrlevel, -1);
    }

    #[test]
    fn test_app_profile_json_roundtrip() {
        let profiles = vec![AppProfileJson {
            package: "com.test".into(), renderer: "vulkan".into(), density: 320,
            font_scale: 1.0, device_profile: "pixel".into(), cpu_governor: "performance".into(),
            gpu_max_pwrlevel: 2, thermal_preset: "default".into(),
        }];
        let json = serde_json::to_string(&profiles).unwrap();
        let d: Vec<AppProfileJson> = serde_json::from_str(&json).unwrap();
        assert_eq!(d.len(), 1);
        assert_eq!(d[0].package, "com.test");
        assert_eq!(d[0].renderer, "vulkan");
    }

    #[test]
    fn test_profile_manager_add_remove() {
        let mut mgr = ProfileManager {
            profiles: HashMap::new(),
            current_pkg: String::new(),
            current_renderer: "default".into(),
            current_density: 0,
            current_font_scale: 1.0,
            current_device_profile: "default".into(),
            default_density: 0,
            default_font_scale: 1.0,
        };
        let profile = AppProfile::default_for("com.test");
        mgr.add_profile(profile);
        assert_eq!(mgr.list_profiles().len(), 1);
        mgr.remove_profile("com.test");
        assert_eq!(mgr.list_profiles().len(), 0);
    }

    #[test]
    fn test_has_excessive_failures() {
        let mut count = 0u32;
        for _ in 0..5 {
            assert!(!has_excessive_failures(&mut count));
        }
        assert!(has_excessive_failures(&mut count));
        assert_eq!(count, 0);
    }

    #[test]
    fn test_should_run_fstrim_first() {
        let mut last = 0u64;
        assert!(should_run_fstrim(&mut last));
        assert!(last > 0);
    }

    #[test]
    fn test_should_run_fstrim_not_yet() {
        let mut last = 999999;
        assert!(!should_run_fstrim(&mut last));
    }

    #[test]
    fn test_monitor_interval_const() {
        assert_eq!(MONITOR_INTERVAL_MS, 500);
    }
}
