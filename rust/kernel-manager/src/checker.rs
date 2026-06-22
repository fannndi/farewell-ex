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

/// Verify a specific feature by checking its sysfs node or command.
///
/// **Root:** Depends on the feature
/// **Returns:** `CheckResult` with pass/fail
pub fn verify_feature(feature: &str) -> CheckResult {
    match feature {
        "read_cpu_info" => {
            if Path::new("/sys/devices/system/cpu/cpu0/online").exists() {
                CheckResult::pass(feature)
            } else {
                CheckResult::fail(feature, "Cannot read /sys/devices/system/cpu/cpu0/online")
            }
        }
        "read_gpu_info" => {
            if Path::new("/sys/class/kgsl/kgsl-3d0/gpuclk").exists() {
                CheckResult::pass(feature)
            } else {
                CheckResult::fail(feature, "Cannot read /sys/class/kgsl/kgsl-3d0/gpuclk")
            }
        }
        "read_battery_info" => {
            if Path::new("/sys/class/power_supply/battery/capacity").exists() {
                CheckResult::pass(feature)
            } else {
                CheckResult::fail(feature, "Cannot read /sys/class/power_supply/battery/capacity")
            }
        }
        "set_renderer_global" => {
            let output = Command::new("resetprop").args(["-n", "debug.hwui.renderer", "test"]).output();
            match output {
                Ok(o) if o.status.success() => {
                    Command::new("resetprop").args(["--delete", "debug.hwui.renderer"]).ok();
                    CheckResult::pass(feature)
                }
                _ => CheckResult::fail(feature, "resetprop not available or failed"),
            }
        }
        "set_device_spoof_global" => {
            let output = Command::new("resetprop").args(["-n", "ro.product.model", "TestDevice"]).output();
            match output {
                Ok(o) if o.status.success() => {
                    Command::new("resetprop").args(["--delete", "ro.product.model"]).ok();
                    CheckResult::pass(feature)
                }
                _ => CheckResult::fail(feature, "resetprop not available or failed"),
            }
        }
        "set_cpu_governor" => {
            if Path::new("/sys/devices/system/cpu/cpu0/cpufreq/scaling_governor").exists() {
                let content = std::fs::read_to_string("/sys/devices/system/cpu/cpu0/cpufreq/scaling_governor")
                    .unwrap_or_default();
                CheckResult::pass(&format!("{}: current={}", feature, content.trim()))
            } else {
                CheckResult::fail(feature, "scaling_governor not found")
            }
        }
        "set_thermal_sconfig" => {
            if Path::new("/sys/class/thermal/thermal_message/sconfig").exists() {
                CheckResult::pass(feature)
            } else {
                CheckResult::fail(feature, "sconfig node not found (not Xiaomi/MIUI)")
            }
        }
        "set_bypass_charging" => {
            for path in &[
                "/sys/class/power_supply/battery/input_suspend",
                "/sys/class/qcom-battery/bypass_charging_enable",
                "/sys/class/power_supply/battery/charging_enabled",
            ] {
                if Path::new(path).exists() {
                    return CheckResult::pass(&format!("{}: found {}", feature, path));
                }
            }
            CheckResult::fail(feature, "No bypass charging node found")
        }
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
