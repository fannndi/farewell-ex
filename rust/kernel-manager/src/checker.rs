use std::fs::OpenOptions;
use std::io::Write;
use std::time::{SystemTime, UNIX_EPOCH};
use std::process::Command;
use std::path::Path;

// ==================== Feature Checker ====================

const LOG_DIR: &str = "/data/adb/farewell_logs";
const LOG_FILE: &str = "/data/adb/farewell_logs/checker.log";

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

pub fn get_log_content() -> String { std::fs::read_to_string(LOG_FILE).unwrap_or_default() }

pub fn get_log_entries() -> Vec<String> { get_log_content().lines().map(|s| s.to_string()).collect() }

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

pub fn logcat_dump() -> String {
    Command::new("logcat").args(["-d", "-v", "time"]).output()
        .map(|o| String::from_utf8_lossy(&o.stdout).to_string())
        .unwrap_or_default()
}

// ==================== Feature Verification ====================

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

pub fn get_pass_rate(results: &[CheckResult]) -> f64 {
    if results.is_empty() { return 100.0; }
    let passed = results.iter().filter(|r| r.passed).count();
    (passed as f64 / results.len() as f64) * 100.0
}

pub fn get_failed_features(results: &[CheckResult]) -> Vec<String> {
    results.iter().filter(|r| !r.passed).map(|r| format!("{}: {}", r.feature, r.message)).collect()
}
