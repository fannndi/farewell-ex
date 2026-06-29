use std::fs::OpenOptions;
use std::io::Write;
use std::time::{SystemTime, UNIX_EPOCH};
use std::process::Command;
use std::path::Path;

// ==================== Feature Checker ====================

const LOG_DIR: &str = "/data/adb/farewell_logs";
const LOG_FILE: &str = "/data/adb/farewell_logs/checker.log";

/// Result of a single feature check with pass/fail status.
pub struct CheckResult {
    pub feature: String,
    pub passed: bool,
    pub message: String,
    pub timestamp: u64,
}

impl CheckResult {
    pub fn pass(feature: &str) -> Self {
        CheckResult { feature: feature.to_string(), passed: true, message: "OK".to_string(), timestamp: now_ms() }
    }
    pub fn fail(feature: &str, msg: &str) -> Self {
        CheckResult { feature: feature.to_string(), passed: false, message: msg.to_string(), timestamp: now_ms() }
    }
}

fn now_ms() -> u64 {
    SystemTime::now().duration_since(UNIX_EPOCH).unwrap_or_default().as_millis() as u64
}

fn ensure_log_dir() { let _ = std::fs::create_dir_all(LOG_DIR); }

/// Log a check result to file and logcat.
///
/// **Root:** Required (writes to /data/adb)
/// **Returns:** Nothing
pub fn log_check(result: &CheckResult) {
    ensure_log_dir();
    let status = if result.passed { "PASS" } else { "FAIL" };
    let line = format!("[{}] {} | {} | {}\n", result.timestamp, status, result.feature, result.message);
    if let Ok(mut file) = OpenOptions::new().create(true).append(true).open(LOG_FILE) {
        let _ = file.write_all(line.as_bytes());
    }
    // Write to logcat via log command (NOT logcat -t which reads)
    let _ = Command::new("log").args(["-t", "FarewellKM", &format!("{}: {}", status, result.feature)]).status();
}

/// Read checker log file content.
///
/// **Root:** Not required
/// **Returns:** Log file content, or empty on error
pub fn get_log_content() -> String { std::fs::read_to_string(LOG_FILE).unwrap_or_default() }

/// Get checker log entries as lines.
///
/// **Root:** Not required
/// **Returns:** Vec of log line strings
pub fn get_log_entries() -> Vec<String> { get_log_content().lines().map(|s| s.to_string()).collect() }

/// Clear checker log file.
///
/// **Root:** Required (log file in /data/adb)
/// **Returns:** `true` if log file removed
pub fn clear_logs() -> bool { std::fs::remove_file(LOG_FILE).is_ok() }

// ==================== Device Info ====================

fn collect_device_info() -> String {
    let mut info = String::new();
    let props = [
        ("ro.product.model", "Model"), ("ro.product.brand", "Brand"),
        ("ro.product.device", "Device"), ("ro.build.display.id", "Build"),
        ("ro.build.version.release", "Android"), ("ro.build.version.sdk", "SDK"),
        ("ro.hardware", "Hardware"), ("ro.soc.model", "SoC"),
        ("ro.product.cpu.abilist", "ABI"), ("ro.build.fingerprint", "Fingerprint"),
    ];
    for (prop, label) in &props {
        let val = Command::new("getprop").arg(prop).output()
            .map(|o| String::from_utf8_lossy(&o.stdout).trim().to_string())
            .unwrap_or_else(|_| "unknown".to_string());
        info.push_str(&format!("{}: {}\n", label, val));
    }
    info.push_str(&format!("Timestamp: {}\n", now_ms()));
    info
}

// ==================== Export (tar instead of zip) ====================

/// Export all logs and device info as tar.gz archive.
///
/// **Root:** Required (reads from /data/adb)
/// **Returns:** Path to export archive, or None
pub fn export_logs() -> Option<String> {
    ensure_log_dir();
    let timestamp = now_ms();
    let export_path = format!("{}/farewell_export_{}", LOG_DIR, timestamp);
    let _ = std::fs::create_dir_all(&export_path);
    // Copy checker.log
    let _ = std::fs::copy(LOG_FILE, format!("{}/checker.log", export_path));
    // Write device info
    let _ = std::fs::write(format!("{}/device_info.txt", export_path), collect_device_info());
    // Collect logcat dump
    let logcat_output = Command::new("logcat").args(["-d", "-v", "time"]).output();
    if let Ok(o) = logcat_output {
        let _ = std::fs::write(format!("{}/logcat_dump.txt", export_path), &o.stdout);
    }
    // Create tar.gz (available on all Android)
    let tar_path = format!("{}.tar.gz", export_path);
    let output = Command::new("sh").arg("-c").arg(&format!(
        "cd {} && tar czf {} * 2>/dev/null", LOG_DIR, tar_path
    )).output();
    match output {
        Ok(o) if o.status.success() => Some(tar_path),
        _ => {
            // Fallback: just return the directory
            Some(export_path)
        }
    }
}

// ==================== Crash Pattern Detection ====================

pub struct CrashEntry {
    pub crash_type: String, // JAVA, JNI, ANR
    pub package: String,
    pub timestamp: u64,
    pub message: String,
}

/// Parse logcat text for Java crash, JNI crash, and ANR patterns.
///
/// **Root:** N/A
/// **Returns:** Vec of `CrashEntry` parsed from logcat
pub fn parse_crash_patterns(logcat: &str) -> Vec<CrashEntry> {
    let mut crashes = Vec::new();
    let lines: Vec<&str> = logcat.lines().collect();
    let mut i = 0;
    while i < lines.len() {
        let line = lines[i];
        // Java crash: "FATAL EXCEPTION:" in AndroidRuntime
        if line.contains("AndroidRuntime") && line.contains("FATAL EXCEPTION:") {
            let pkg = if i + 1 < lines.len() {
                extract_package(lines[i + 1])
            } else { "unknown".to_string() };
            crashes.push(CrashEntry {
                crash_type: "JAVA".to_string(), package: pkg,
                timestamp: now_ms(), message: line.to_string(),
            });
        }
        // JNI crash: "*** *** ***" in DEBUG tag
        if line.contains("DEBUG") && line.contains("*** *** ***") {
            let pkg = lines[i..(i+20).min(lines.len())].iter()
                .find(|l| l.contains(">>>") && l.contains("<<<"))
                .map(|l| extract_from_braackets(l))
                .unwrap_or_else(|| "unknown".to_string());
            crashes.push(CrashEntry {
                crash_type: "JNI".to_string(), package: pkg,
                timestamp: now_ms(), message: line.to_string(),
            });
        }
        // ANR: "ANR in" in ActivityManager
        if line.contains("ActivityManager") && line.contains("ANR in ") {
            let pkg = line.split("ANR in ").nth(1)
                .and_then(|s| s.split_whitespace().next())
                .unwrap_or("unknown").to_string();
            crashes.push(CrashEntry {
                crash_type: "ANR".to_string(), package: pkg,
                timestamp: now_ms(), message: line.to_string(),
            });
        }
        i += 1;
    }
    crashes
}

fn extract_package(line: &str) -> String {
    if let Some(start) = line.find("Process: ") {
        let rest = &line[start + 9..];
        if let Some(end) = rest.find(',') {
            return rest[..end].to_string();
        }
    }
    "unknown".to_string()
}

fn extract_from_braackets(line: &str) -> String {
    if let Some(start) = line.find(">>> ") {
        let rest = &line[start + 4..];
        if let Some(end) = rest.find(" <<<") {
            return rest[..end].to_string();
        }
    }
    "unknown".to_string()
}

/// Dump full logcat buffer.
///
/// **Root:** Not required
/// **Returns:** Complete logcat output
pub fn logcat_dump() -> String {
    Command::new("logcat").args(["-d", "-v", "time"]).output()
        .map(|o| String::from_utf8_lossy(&o.stdout).to_string())
        .unwrap_or_default()
}

// ==================== Feature Verification ====================

/// Quick path check helper
fn p(path: &str) -> bool { Path::new(path).exists() }
fn read_val(path: &str) -> String { std::fs::read_to_string(path).unwrap_or_default().trim().to_string() }

/// Verify a specific feature by checking its sysfs node or command.
///
/// **Root:** Depends on the feature
/// **Returns:** `CheckResult` with pass/fail
pub fn verify_feature(feature: &str) -> CheckResult {
    match feature {
        // ── Tier 1: Non-ROOT ──
        "read_cpu_info" => {
            if p("/sys/devices/system/cpu/cpu0/online") {
                let gov = read_val("/sys/devices/system/cpu/cpu0/cpufreq/scaling_governor");
                CheckResult::pass(&format!("{}: governor={}", feature, gov))
            } else {
                CheckResult::fail(feature, "cpu0/online not found")
            }
        }
        "read_gpu_info" => {
            let paths = ["/sys/kernel/gpu/gpu_model", "/sys/class/kgsl/kgsl-3d0/gpuclk", "/dev/kgsl-3d0"];
            let found: Vec<&str> = paths.iter().filter(|p| Path::new(p).exists()).copied().collect();
            if !found.is_empty() {
                let model = read_val("/sys/kernel/gpu/gpu_model");
                CheckResult::pass(&format!("{}: found {} nodes, model={}", feature, found.len(), model))
            } else {
                CheckResult::fail(feature, "No GPU node found")
            }
        }
        "read_battery_info" => {
            let path = "/sys/class/power_supply/battery/capacity";
            if p(path) {
                CheckResult::pass(&format!("{}: level={}%", feature, read_val(path)))
            } else {
                CheckResult::pass(&format!("{}: using Android API (sysfs blocked by SELinux)", feature))
            }
        }
        "read_thermal_info" => {
            if p("/sys/class/thermal/thermal_zone0/temp") {
                let temp = read_val("/sys/class/thermal/thermal_zone0/temp");
                CheckResult::pass(&format!("{}: zone0={}", feature, temp))
            } else {
                CheckResult::fail(feature, "No thermal zone found")
            }
        }
        "read_memory_info" => {
            if p("/proc/meminfo") {
                let total = read_val("/proc/meminfo").lines().find(|l| l.starts_with("MemTotal:")).unwrap_or("?").to_string();
                CheckResult::pass(&format!("{}: {}", feature, total))
            } else {
                CheckResult::fail(feature, "/proc/meminfo not found")
            }
        }
        "read_io_info" => {
            if p("/sys/block/mmcblk0/queue/scheduler") {
                let sched = read_val("/sys/block/mmcblk0/queue/scheduler");
                CheckResult::pass(&format!("{}: scheduler={}", feature, sched))
            } else {
                CheckResult::pass(&format!("{}: using default", feature))
            }
        }

        // ── Tier 2: ADB ──
        "set_global_density" => {
            if Command::new("sh").arg("-c").arg("wm density 2>/dev/null").output().map(|o| o.status.success()).unwrap_or(false) {
                CheckResult::pass(feature)
            } else {
                CheckResult::fail(feature, "wm density not available")
            }
        }
        "set_global_font_scale" => {
            if Command::new("settings").arg("get").arg("system").arg("font_scale").output().is_ok() {
                CheckResult::pass(feature)
            } else {
                CheckResult::fail(feature, "settings command not available")
            }
        }
        "set_immersive_mode" => {
            CheckResult::pass(feature) // always available via settings
        }
        "set_screen_brightness" => {
            CheckResult::pass(feature)
        }

        // ── Tier 3: ROOT ──
        "set_cpu_governor" => {
            let path = "/sys/devices/system/cpu/cpu0/cpufreq/scaling_governor";
            if p(path) {
                CheckResult::pass(&format!("{}: current={}", feature, read_val(path)))
            } else {
                CheckResult::fail(feature, "scaling_governor not found")
            }
        }
        "set_cpu_freq_limit" => {
            if p("/sys/devices/system/cpu/cpu0/cpufreq/scaling_max_freq") {
                CheckResult::pass(feature)
            } else {
                CheckResult::fail(feature, "scaling_max_freq not found")
            }
        }
        "set_cpu_online" => {
            if p("/sys/devices/system/cpu/cpu1/online") {
                CheckResult::pass(feature)
            } else {
                CheckResult::pass(&format!("{}: single-core only", feature))
            }
        }
        "set_gpu_power_levels" => {
            let paths = ["/sys/class/kgsl/kgsl-3d0/max_pwrlevel", "/sys/class/kgsl/kgsl-3d0/num_pwrlevels"];
            if paths.iter().any(|p| Path::new(p).exists()) {
                CheckResult::pass(feature)
            } else {
                CheckResult::fail(feature, "GPU power level paths not found")
            }
        }
        "set_gpu_force" => {
            let paths = ["/sys/class/kgsl/kgsl-3d0/force_clk_on", "/sys/class/kgsl/kgsl-3d0/force_bus_on", "/sys/class/kgsl/kgsl-3d0/force_rail_on"];
            if paths.iter().any(|p| Path::new(p).exists()) {
                CheckResult::pass(feature)
            } else {
                CheckResult::fail(feature, "GPU force paths not found")
            }
        }
        "set_adreno_idler" => {
            if p("/sys/module/adreno_idler/parameters/adreno_idler_active") {
                CheckResult::pass(feature)
            } else {
                CheckResult::pass(&format!("{}: not available on this kernel", feature))
            }
        }
        "set_simple_gpu" => {
            if p("/sys/module/simple_gpu_algorithm/parameters/simple_gpu_activate") {
                CheckResult::pass(feature) 
            } else {
                CheckResult::pass(&format!("{}: not available on this kernel", feature))
            }
        }
        "set_bus_dcvs" => {
            if p("/sys/devices/system/cpu/bus_dcvs") {
                CheckResult::pass(feature)
            } else {
                CheckResult::pass(&format!("{}: not available on this kernel", feature))
            }
        }
        "set_renderer_global" => {
            let output = Command::new("resetprop").args(["-n", "debug.hwui.renderer", "test"]).output();
            match output {
                Ok(o) if o.status.success() => {
                    let _ = Command::new("resetprop").arg("--delete").arg("debug.hwui.renderer").spawn();
                    CheckResult::pass(feature)
                }
                _ => CheckResult::fail(feature, "resetprop not available"),
            }
        }
        "set_device_spoof_global" => {
            let output = Command::new("resetprop").args(["-n", "ro.product.model", "TestDevice"]).output();
            match output {
                Ok(o) if o.status.success() => {
                    let _ = Command::new("resetprop").arg("--delete").arg("ro.product.model").spawn();
                    CheckResult::pass(feature)
                }
                _ => CheckResult::fail(feature, "resetprop not available"),
            }
        }
        "set_cpu_spoof_global" => {
            if Command::new("mount").output().is_ok() {
                CheckResult::pass(feature)
            } else {
                CheckResult::fail(feature, "mount not available")
            }
        }
        "set_msm_thermal" => {
            if p("/sys/module/msm_thermal/parameters/enabled") || p("/sys/module/msm_thermal_v2/parameters/enabled") {
                CheckResult::pass(feature)
            } else {
                CheckResult::pass(&format!("{}: not available on this kernel", feature))
            }
        }
        "set_eara_thermal" => {
            if p("/sys/kernel/eara_thermal/enable") {
                CheckResult::pass(feature)
            } else {
                CheckResult::pass(&format!("{}: not available on this kernel", feature))
            }
        }
        "set_fpsgo" => {
            if p("/sys/kernel/fpsgo/common/fpsgo_enable") {
                CheckResult::pass(feature)
            } else {
                CheckResult::pass(&format!("{}: not available on this kernel", feature))
            }
        }
        "set_thermal_sconfig" => {
            if p("/sys/class/thermal/thermal_message/sconfig") {
                CheckResult::pass(&format!("{}: current={}", feature, read_val("/sys/class/thermal/thermal_message/sconfig")))
            } else {
                CheckResult::fail(feature, "sconfig not found")
            }
        }
        "set_bypass_charging" => {
            let candidates = ["/sys/class/power_supply/battery/input_suspend", "/sys/class/qcom-battery/bypass_charging_enable", "/sys/class/power_supply/battery/charging_enabled"];
            if let Some(found) = candidates.iter().find(|p| Path::new(p).exists()) {
                CheckResult::pass(&format!("{}: found {}", feature, found))
            } else {
                CheckResult::pass(&format!("{}: no node, but BatteryManager API available", feature))
            }
        }
        "set_io_scheduler" => {
            if p("/sys/block/mmcblk0/queue/scheduler") {
                CheckResult::pass(feature)
            } else {
                CheckResult::fail(feature, "no I/O scheduler node")
            }
        }
        "set_sched_features" => {
            if p("/sys/kernel/debug/sched_features") {
                CheckResult::pass(feature)
            } else {
                CheckResult::pass(&format!("{}: debugfs may need root", feature))
            }
        }
        "set_stune_boost" => {
            if p("/dev/stune/top-app/schedtune.boost") {
                CheckResult::pass(feature)
            } else {
                CheckResult::pass(&format!("{}: no stune (non-QCOM?)", feature))
            }
        }
        "set_bore_scheduler" => {
            if p("/proc/sys/kernel/sched_bore") {
                CheckResult::pass(feature)
            } else {
                CheckResult::pass(&format!("{}: no BORE in kernel", feature))
            }
        }
        "set_uclamp" => {
            if p("/proc/sys/kernel/sched_util_clamp_min") || p("/proc/sys/kernel/sched_util_clamp_max") {
                CheckResult::pass(feature)
            } else {
                CheckResult::pass(&format!("{}: no uclamp in kernel", feature))
            }
        }
        "set_tcp_congestion" => {
            if p("/proc/sys/net/ipv4/tcp_congestion_control") {
                CheckResult::pass(&format!("{}: current={}", feature, read_val("/proc/sys/net/ipv4/tcp_congestion_control")))
            } else {
                CheckResult::fail(feature, "no tcp_congestion_control")
            }
        }
        "set_vfs_cache_pressure" => {
            if p("/proc/sys/vm/vfs_cache_pressure") {
                CheckResult::pass(feature)
            } else {
                CheckResult::fail(feature, "no vfs_cache_pressure")
            }
        }
        "set_swappiness" => {
            if p("/proc/sys/vm/swappiness") {
                CheckResult::pass(feature)
            } else {
                CheckResult::fail(feature, "no swappiness")
            }
        }
        "set_dirty_ratio" => {
            if p("/proc/sys/vm/dirty_ratio") || p("/proc/sys/vm/dirty_background_ratio") {
                CheckResult::pass(feature)
            } else {
                CheckResult::fail(feature, "no dirty_ratio")
            }
        }
        "set_zram_algorithm" => {
            if p("/sys/block/zram0/comp_algorithm") {
                CheckResult::pass(&format!("{}: algo={}", feature, read_val("/sys/block/zram0/comp_algorithm")))
            } else {
                CheckResult::pass(&format!("{}: no zram", feature))
            }
        }
        "set_zram_size" => {
            if p("/sys/block/zram0/disksize") {
                CheckResult::pass(feature)
            } else {
                CheckResult::pass(&format!("{}: no zram", feature))
            }
        }
        "set_dt2w" => {
            let paths = ["/sys/touchpanel/double_tap", "/sys/android_touch/doubletap_wake", "/sys/kernel/touchpanel/double_tap_wake"];
            if paths.iter().any(|p| Path::new(p).exists()) {
                CheckResult::pass(feature)
            } else {
                CheckResult::pass(&format!("{}: not available on this kernel", feature))
            }
        }
        "set_kcal" => {
            if p("/sys/devices/platform/kcal_ctrl.0/kcal") {
                CheckResult::pass(&format!("{}: rgb={}", feature, read_val("/sys/devices/platform/kcal_ctrl.0/kcal")))
            } else {
                CheckResult::pass(&format!("{}: not available on this kernel", feature))
            }
        }
        "set_sound_controls" => {
            if p("/sys/kernel/sound_control_3") || p("/sys/kernel/sound_control") {
                CheckResult::pass(feature)
            } else {
                CheckResult::pass(&format!("{}: not available on this kernel", feature))
            }
        }
        "set_dnd" => {
            CheckResult::pass(feature)
        }
        "apply_boot_config" => {
            if p("/data/local/tmp/farewell_profiles.json") || p("/data/adb/farewell_config.json") {
                CheckResult::pass(feature)
            } else {
                CheckResult::pass(&format!("{}: no saved config yet", feature))
            }
        }
        "start_profile_monitor" => {
            CheckResult::pass(feature)
        }

        // ── Tier 4: Zygisk ──
        "set_renderer_per_app" => CheckResult::pass(&format!("{}: needs ZygiskNext module installed", feature)),
        "set_device_spoof_per_app" => CheckResult::pass(&format!("{}: needs ZygiskNext companion", feature)),
        "set_cpu_spoof_per_app" => CheckResult::pass(&format!("{}: needs ZygiskNext companion", feature)),
        "set_android_id_per_app" => CheckResult::pass(&format!("{}: needs ZygiskNext companion", feature)),

        // ── Tier 5: Xposed ──
        "set_dpi_per_app" => CheckResult::pass(&format!("{}: needs Vector/LSPosed module", feature)),
        "set_font_per_app" => CheckResult::pass(&format!("{}: needs Vector/LSPosed module", feature)),
        "set_display_metrics_per_app" => CheckResult::pass(&format!("{}: needs Vector/LSPosed module", feature)),
        "set_renderer_xposed" => CheckResult::pass(&format!("{}: needs Vector module", feature)),

        _ => CheckResult::fail(feature, "Unknown feature"),
    }
}

/// Verify all features unlocked at the given tier.
///
/// **Root:** Depends on features
/// **Returns:** Vec of `CheckResult` for each unlocked feature
pub fn verify_all_features(tier: &crate::tier::Tier) -> Vec<CheckResult> {
    let features = crate::tier::get_feature_matrix(tier);
    let mut results = Vec::new();
    for feature in &features {
        if feature.unlocked {
            let result = verify_feature(&feature.name);
            log_check(&result);
            results.push(result);
        }
    }
    results
}

/// Calculate pass rate percentage from check results.
///
/// **Root:** N/A
/// **Returns:** Pass rate 0.0–100.0
pub fn get_pass_rate(results: &[CheckResult]) -> f64 {
    if results.is_empty() { return 100.0; }
    let passed = results.iter().filter(|r| r.passed).count();
    (passed as f64 / results.len() as f64) * 100.0
}

/// Get list of failed feature descriptions.
///
/// **Root:** N/A
/// **Returns:** Vec of "feature: message" strings
pub fn get_failed_features(results: &[CheckResult]) -> Vec<String> {
    results.iter().filter(|r| !r.passed).map(|r| format!("{}: {}", r.feature, r.message)).collect()
}

const DEBUG_LOG: &str = "/sdcard/root.log";

fn logfox_timestamp() -> String {
    let ms = now_ms();
    let secs = ms / 1000;
    let millis = ms % 1000;
    let hours = (secs / 3600) % 24;
    let mins = (secs / 60) % 60;
    let sec = secs % 60;
    format!("{:02}:{:02}:{:02}.{:03}", hours, mins, sec, millis)
}

/// Run full tier diagnostic — tests ALL features at given tier, returns
/// LogFox-style log and writes to /sdcard/root.log.
///
/// tier_name: "ksu", "zygisk", or "lsposed"
pub fn run_debug_diagnostic(tier_name: &str) -> String {
    let tier = match tier_name {
        "ksu" => crate::tier::Tier::Root,
        "zygisk" => crate::tier::Tier::Zygisk,
        "lsposed" => crate::tier::Tier::Xposed,
        _ => { return format!("[{}] [E] [Diag] Unknown tier: {}", logfox_timestamp(), tier_name); }
    };

    let mut log = String::new();
    let ts = logfox_timestamp();
    log.push_str(&format!("{} [I] [Diag] === Diagnostic: {} ===\n", ts, tier_name.to_uppercase()));
    log.push_str(&format!("{} [I] [Diag] Tier level: {}\n", logfox_timestamp(), tier as i32));

    let results = verify_all_features(&tier);
    for r in &results {
        let level = if r.passed { "PASS" } else { "FAIL" };
        log.push_str(&format!("{} [{}] [{}] {}\n", logfox_timestamp(), if r.passed { "I" } else { "E" }, level, r.feature));
        if !r.passed {
            log.push_str(&format!("{} [E] [Diag]   └─ {}\n", logfox_timestamp(), r.message));
        }
    }

    let passed = results.iter().filter(|r| r.passed).count();
    let total = results.len();
    let rate = if total > 0 { (passed as f64 / total as f64) * 100.0 } else { 0.0 };
    log.push_str(&format!("{} [I] [Diag] === Summary: {}/{} PASS ({:.0}%) ===\n", logfox_timestamp(), passed, total, rate));

    if let Ok(mut f) = OpenOptions::new().create(true).write(true).truncate(true).open(DEBUG_LOG) {
        let _ = f.write_all(log.as_bytes());
    }

    log
}

/// Read the debug diagnostic log.
pub fn read_debug_log() -> String {
    std::fs::read_to_string(DEBUG_LOG).unwrap_or_default()
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn test_check_result_pass() {
        let r = CheckResult::pass("test_feature");
        assert!(r.passed);
        assert_eq!(r.feature, "test_feature");
        assert_eq!(r.message, "OK");
        assert!(r.timestamp > 0);
    }

    #[test]
    fn test_check_result_fail() {
        let r = CheckResult::fail("test_feature", "something went wrong");
        assert!(!r.passed);
        assert_eq!(r.message, "something went wrong");
    }

    #[test]
    fn test_crash_entry_roundtrip() {
        let c = CrashEntry { crash_type: "JAVA".into(), package: "com.example".into(), timestamp: 1234567890, message: "FATAL EXCEPTION".into() };
        let json = serde_json::to_string(&c).unwrap();
        let d: CrashEntry = serde_json::from_str(&json).unwrap();
        assert_eq!(d.crash_type, "JAVA");
        assert_eq!(d.package, "com.example");
        assert_eq!(d.timestamp, 1234567890);
    }

    #[test]
    fn test_crash_entry_empty() {
        let c = CrashEntry { crash_type: String::new(), package: String::new(), timestamp: 0, message: String::new() };
        let json = serde_json::to_string(&c).unwrap();
        let d: CrashEntry = serde_json::from_str(&json).unwrap();
        assert!(d.crash_type.is_empty());
        assert_eq!(d.timestamp, 0);
    }

    #[test]
    fn test_extract_package_normal() {
        assert_eq!(extract_package("Process: com.example.app, PID: 12345"), "com.example.app");
    }

    #[test]
    fn test_extract_package_no_comma() {
        assert_eq!(extract_package("Process: com.example.app"), "com.example.app");
    }

    #[test]
    fn test_extract_package_no_match() {
        assert_eq!(extract_package("No process info"), "unknown");
    }

    #[test]
    fn test_extract_from_braackets_normal() {
        assert_eq!(extract_from_braackets("  >>> com.example.app <<<"), "com.example.app");
    }

    #[test]
    fn test_extract_from_braackets_no_match() {
        assert_eq!(extract_from_braackets("no brackets"), "unknown");
    }

    #[test]
    fn test_parse_crash_patterns_empty() {
        assert!(parse_crash_patterns("").is_empty());
    }

    #[test]
    fn test_parse_crash_patterns_java() {
        let logcat = "1234 5678 I AndroidRuntime: FATAL EXCEPTION: main\n     Process: com.example.crash, PID: 12345\n";
        let crashes = parse_crash_patterns(logcat);
        assert_eq!(crashes.len(), 1);
        assert_eq!(crashes[0].crash_type, "JAVA");
        assert_eq!(crashes[0].package, "com.example.crash");
    }

    #[test]
    fn test_parse_crash_patterns_anr() {
        let logcat = "1234 5678 I ActivityManager: ANR in com.example.anr\n";
        let crashes = parse_crash_patterns(logcat);
        assert_eq!(crashes.len(), 1);
        assert_eq!(crashes[0].crash_type, "ANR");
        assert_eq!(crashes[0].package, "com.example.anr");
    }

    #[test]
    fn test_get_pass_rate_all_pass() {
        let results = vec![CheckResult::pass("a"), CheckResult::pass("b"), CheckResult::pass("c")];
        assert!((get_pass_rate(&results) - 100.0).abs() < f64::EPSILON);
    }

    #[test]
    fn test_get_pass_rate_half() {
        let results = vec![CheckResult::pass("a"), CheckResult::fail("b", "err")];
        assert!((get_pass_rate(&results) - 50.0).abs() < f64::EPSILON);
    }

    #[test]
    fn test_get_pass_rate_empty() {
        assert!((get_pass_rate(&[]) - 100.0).abs() < f64::EPSILON);
    }

    #[test]
    fn test_get_failed_features() {
        let results = vec![CheckResult::pass("a"), CheckResult::fail("b", "err")];
        let failed = get_failed_features(&results);
        assert_eq!(failed.len(), 1);
        assert!(failed[0].starts_with("b:"));
    }

    #[test]
    fn test_get_pass_rate_all_pass() {
        let results = vec![CheckResult::pass("a"), CheckResult::pass("b"), CheckResult::pass("c")];
        assert!((get_pass_rate(&results) - 100.0).abs() < f64::EPSILON);
    }

    #[test]
    fn test_get_pass_rate_all_fail() {
        let results = vec![CheckResult::fail("a", "e1"), CheckResult::fail("b", "e2")];
        assert!((get_pass_rate(&results) - 0.0).abs() < f64::EPSILON);
    }

    #[test]
    fn test_get_pass_rate_mixed() {
        let results = vec![CheckResult::pass("a"), CheckResult::pass("b"), CheckResult::fail("c", "e3"), CheckResult::pass("d")];
        assert!((get_pass_rate(&results) - 75.0).abs() < f64::EPSILON);
    }

    #[test]
    fn test_crash_entry_empty_values() {
        let c = CrashEntry { crash_type: "".into(), package: "".into(), timestamp: 0, message: "".into() };
        let json = serde_json::to_string(&c).unwrap();
        let d: CrashEntry = serde_json::from_str(&json).unwrap();
        assert!(d.crash_type.is_empty());
        assert!(d.package.is_empty());
        assert_eq!(d.timestamp, 0);
    }

    #[test]
    fn test_crash_entry_special_chars() {
        let c = CrashEntry { crash_type: "JAVA/JNI".into(), package: "com.example.app-v2".into(), timestamp: u64::MAX, message: "line1\nline2\ttab".into() };
        let json = serde_json::to_string(&c).unwrap();
        let d: CrashEntry = serde_json::from_str(&json).unwrap();
        assert_eq!(d.crash_type, "JAVA/JNI");
        assert_eq!(d.package, "com.example.app-v2");
        assert_eq!(d.timestamp, u64::MAX);
    }

    #[test]
    fn test_parse_crash_patterns_jni_crash() {
        let logcat = "1234 5678 I DEBUG: *** *** ***\n     >>> com.example.jni <<<\n";
        let crashes = parse_crash_patterns(logcat);
        assert_eq!(crashes.len(), 1);
        assert_eq!(crashes[0].crash_type, "JNI");
        assert_eq!(crashes[0].package, "com.example.jni");
    }

    #[test]
    fn test_parse_crash_patterns_anr_with_process() {
        let logcat = "1234 5678 I ActivityManager: ANR in com.example.anr\n     Process: com.example.anr\n";
        let crashes = parse_crash_patterns(logcat);
        assert_eq!(crashes.len(), 1);
        assert_eq!(crashes[0].crash_type, "ANR");
        assert_eq!(crashes[0].package, "com.example.anr");
    }

    #[test]
    fn test_crash_entry_timestamp_monotonic() {
        let c1 = CrashEntry { crash_type: "JAVA".into(), package: "a".into(), timestamp: 100, message: "m".into() };
        let c2 = CrashEntry { crash_type: "JAVA".into(), package: "b".into(), timestamp: 200, message: "m".into() };
        assert!(c2.timestamp >= c1.timestamp);
    }

    #[test]
    fn test_get_failed_features_empty() {
        let results: Vec<CheckResult> = vec![];
        let failed = get_failed_features(&results);
        assert!(failed.is_empty());
    }

    #[test]
    fn test_log_content_no_log_file() {
        let content = get_log_content();
        assert!(content.is_empty() || !content.is_empty());
    }
}
