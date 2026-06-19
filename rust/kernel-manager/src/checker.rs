use std::fs::OpenOptions;
use std::io::Write;
use std::time::{SystemTime, UNIX_EPOCH};
use std::process::Command;

// ==================== Feature Checker ====================
// Verifies each feature works. Logs failures for LogFox.
// If critical feature fails, optionally crash.

const LOG_DIR: &str = "/data/local/tmp/farewell_logs";
const LOG_FILE: &str = "/data/local/tmp/farewell_logs/checker.log";

pub struct CheckResult {
    pub feature: String,
    pub passed: bool,
    pub message: String,
    pub timestamp: u64,
}

impl CheckResult {
    pub fn pass(feature: &str) -> Self {
        CheckResult {
            feature: feature.to_string(),
            passed: true,
            message: "OK".to_string(),
            timestamp: now_ms(),
        }
    }
    pub fn fail(feature: &str, msg: &str) -> Self {
        CheckResult {
            feature: feature.to_string(),
            passed: false,
            message: msg.to_string(),
            timestamp: now_ms(),
        }
    }
}

fn now_ms() -> u64 {
    SystemTime::now().duration_since(UNIX_EPOCH).unwrap_or_default().as_millis() as u64
}

fn ensure_log_dir() {
    let _ = std::fs::create_dir_all(LOG_DIR);
}

pub fn log_check(result: &CheckResult) {
    ensure_log_dir();
    let status = if result.passed { "PASS" } else { "FAIL" };
    let line = format!(
        "[{}] {} | {} | {}\n",
        result.timestamp, status, result.feature, result.message
    );
    if let Ok(mut file) = OpenOptions::new().create(true).append(true).open(LOG_FILE) {
        let _ = file.write_all(line.as_bytes());
    }
    // Also log to logcat for LogFox
    log_to_logcat(&result.feature, status, &result.message);
}

fn log_to_logcat(tag: &str, status: &str, msg: &str) {
    let log_tag = "FarewellKM";
    let priority = if status == "PASS" { "D" } else { "E" };
    let log_msg = format!("[{}] {}: {}", status, tag, msg);
    Command::new("logcat")
        .args(["-t", "1", "-s", &format!("{}:{}", log_tag, priority)])
        .status();
    // Direct logcat write via /dev/kmsg or just use println for Rust-side logging
    eprintln!("{}: {}", log_tag, log_msg);
}

pub fn get_log_content() -> String {
    std::fs::read_to_string(LOG_FILE).unwrap_or_default()
}

pub fn get_log_entries() -> Vec<String> {
    get_log_content().lines().map(|s| s.to_string()).collect()
}

pub fn clear_logs() -> bool {
    std::fs::remove_file(LOG_FILE).is_ok()
}

pub fn export_logs_zip() -> Option<String> {
    ensure_log_dir();
    let timestamp = now_ms();
    let zip_path = format!("{}/farewell_logs_{}.zip", LOG_DIR, timestamp);

    // Collect device info
    let device_info = collect_device_info();
    let info_path = format!("{}/device_info.txt", LOG_DIR);
    let _ = std::fs::write(&info_path, &device_info);

    // Create zip with logcat + checker log + device info
    let output = Command::new("sh").arg("-c").arg(&format!(
        "cd {} && zip -r {} checker.log device_info.txt 2>/dev/null",
        LOG_DIR, zip_path
    )).output();

    match output {
        Ok(o) if o.status.success() => Some(zip_path),
        _ => None,
    }
}

fn collect_device_info() -> String {
    let mut info = String::new();
    let props = [
        ("ro.product.model", "Model"),
        ("ro.product.brand", "Brand"),
        ("ro.product.device", "Device"),
        ("ro.build.display.id", "Build"),
        ("ro.build.version.release", "Android"),
        ("ro.build.version.sdk", "SDK"),
        ("ro.hardware", "Hardware"),
        ("ro.soc.model", "SoC"),
        ("ro.product.cpu.abilist", "ABI"),
        ("ro.build.fingerprint", "Fingerprint"),
    ];
    for (prop, label) in &props {
        let output = Command::new("getprop").arg(prop).output();
        let val = match output {
            Ok(o) => String::from_utf8_lossy(&o.stdout).trim().to_string(),
            Err(_) => "unknown".to_string(),
        };
        info.push_str(&format!("{}: {}\n", label, val));
    }
    info.push_str(&format!("Timestamp: {}\n", now_ms()));
    info
}

// ==================== Feature Verification ====================

pub fn verify_feature(feature: &str) -> CheckResult {
    match feature {
        // Tier 1: Non-ROOT (read-only)
        "read_cpu_info" => {
            if std::fs::read_to_string("/sys/devices/system/cpu/cpu0/online").is_ok() {
                CheckResult::pass(feature)
            } else {
                CheckResult::fail(feature, "Cannot read /sys/devices/system/cpu/cpu0/online")
            }
        }
        "read_gpu_info" => {
            if std::fs::read_to_string("/sys/class/kgsl/kgsl-3d0/gpuclk").is_ok() {
                CheckResult::pass(feature)
            } else {
                CheckResult::fail(feature, "Cannot read /sys/class/kgsl/kgsl-3d0/gpuclk")
            }
        }
        "read_battery_info" => {
            if std::fs::read_to_string("/sys/class/power_supply/battery/capacity").is_ok() {
                CheckResult::pass(feature)
            } else {
                CheckResult::fail(feature, "Cannot read /sys/class/power_supply/battery/capacity")
            }
        }
        // Tier 3: ROOT
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
            let output = Command::new("resetprop").args(["ro.product.model", "TestDevice"]).output();
            match output {
                Ok(o) if o.status.success() => {
                    Command::new("resetprop").args(["--delete", "ro.product.model"]).ok();
                    CheckResult::pass(feature)
                }
                _ => CheckResult::fail(feature, "resetprop not available or failed"),
            }
        }
        "set_cpu_governor" => {
            if sysfs::file_exists("/sys/devices/system/cpu/cpu0/cpufreq/scaling_governor") {
                let content = std::fs::read_to_string("/sys/devices/system/cpu/cpu0/cpufreq/scaling_governor")
                    .unwrap_or_default();
                CheckResult::pass(&format!("{}: current={}", feature, content.trim()))
            } else {
                CheckResult::fail(feature, "scaling_governor not found")
            }
        }
        "set_thermal_sconfig" => {
            if sysfs::file_exists("/sys/class/thermal/thermal_message/sconfig") {
                CheckResult::pass(feature)
            } else {
                CheckResult::fail(feature, "sconfig node not found (not Xiaomi/MIUI)")
            }
        }
        "set_bypass_charging" => {
            let paths = [
                "/sys/class/power_supply/battery/input_suspend",
                "/sys/class/qcom-battery/bypass_charging_enable",
                "/sys/class/power_supply/battery/charging_enabled",
            ];
            for path in &paths {
                if sysfs::file_exists(path) {
                    return CheckResult::pass(&format!("{}: found {}", feature, path));
                }
            }
            CheckResult::fail(feature, "No bypass charging node found")
        }
        // Tier 4: Zygisk
        "set_renderer_per_app" => {
            if crate::tier::detect_zygisk_next().0 {
                CheckResult::pass(feature)
            } else {
                CheckResult::fail(feature, "ZygiskNext not detected")
            }
        }
        // Tier 5: Xposed
        "set_dpi_per_app" => {
            if crate::tier::detect_vector().0 {
                CheckResult::pass(feature)
            } else {
                CheckResult::fail(feature, "Vector/LSPosed not detected")
            }
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
    results.iter()
        .filter(|r| !r.passed)
        .map(|r| format!("{}: {}", r.feature, r.message))
        .collect()
}
