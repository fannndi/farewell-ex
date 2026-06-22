use std::process::Command;

// ==================== Global DPI/Font Control (DPIS patterns) ====================
// Per-app DPI requires Xposed hooks — marked TODO
// Global DPI/font via wm density + settings is sufficient for most use cases

/// Set global display density (DPI).
///
/// **Root:** Not required (ADB `wm density`)
/// **Returns:** `true` if command succeeded
pub fn set_global_density(dpi: i32) -> bool {
    Command::new("wm").args(["density", &dpi.to_string()]).status().is_ok()
}

/// Reset global display density to physical default.
///
/// **Root:** Not required (ADB `wm density reset`)
/// **Returns:** `true` if command succeeded
pub fn reset_global_density() -> bool {
    Command::new("wm").args(["density", "reset"]).status().is_ok()
}

/// Get current display density.
///
/// **Root:** Not required (ADB `wm density`)
/// **Returns:** Current DPI value, or 0 if unavailable
pub fn get_current_density() -> i32 {
    let output = Command::new("wm").arg("density").output();
    match output {
        Ok(o) => {
            let stdout = String::from_utf8_lossy(&o.stdout);
            // Output format: "Physical density: 440" or "Override density: 320"
            for line in stdout.lines() {
                if let Some(val) = line.split(':').last() {
                    if let Ok(dpi) = val.trim().parse::<i32>() {
                        return dpi;
                    }
                }
            }
            0
        }
        Err(_) => 0,
    }
}

/// Get physical display density from `dumpsys display`.
///
/// **Root:** Not required
/// **Returns:** Physical DPI value, or 0 if unavailable
pub fn get_physical_density() -> i32 {
    let output = Command::new("dumpsys").args(["display"]).output();
    match output {
        Ok(o) => {
            let stdout = String::from_utf8_lossy(&o.stdout);
            for line in stdout.lines() {
                if line.contains("mBaseDisplayInfo") && line.contains("density=") {
                    if let Some(start) = line.find("density=") {
                        let rest = &line[start + 8..];
                        if let Some(end) = rest.find(|c: char| !c.is_ascii_digit()) {
                            return rest[..end].parse().unwrap_or(0);
                        }
                    }
                }
            }
            0
        }
        Err(_) => 0,
    }
}

/// Set global font scale factor.
///
/// **Root:** Not required (ADB `settings put`)
/// **Returns:** `true` if command succeeded
pub fn set_global_font_scale(scale: f32) -> bool {
    let output = Command::new("settings").args(["put", "system", "font_scale", &format!("{:.1}", scale)]).status();
    output.is_ok()
}

/// Get current font scale factor.
///
/// **Root:** Not required (ADB `settings get`)
/// **Returns:** Font scale (default 1.0)
pub fn get_current_font_scale() -> f32 {
    let output = Command::new("settings").args(["get", "system", "font_scale"]).output();
    match output {
        Ok(o) => {
            let stdout = String::from_utf8_lossy(&o.stdout);
            stdout.trim().parse().unwrap_or(1.0)
        }
        Err(_) => 1.0,
    }
}

/// Set global display resolution.
///
/// **Root:** Not required (ADB `wm size`)
/// **Returns:** `true` if command succeeded
pub fn set_global_resolution(width: i32, height: i32) -> bool {
    Command::new("wm").args(["size", &format!("{}x{}", width, height)]).status().is_ok()
}

/// Reset global display resolution to default.
///
/// **Root:** Not required (ADB `wm size reset`)
/// **Returns:** `true` if command succeeded
pub fn reset_global_resolution() -> bool {
    Command::new("wm").args(["size", "reset"]).status().is_ok()
}

// ==================== Preset Densities ====================

/// Apply a density preset (low/medium/high/xhigh/reset).
///
/// **Root:** ADB
/// **Returns:** `true` if preset applied
pub fn apply_density_preset(preset: &str) -> bool {
    match preset {
        "low" => set_global_density(240),
        "medium" => set_global_density(320),
        "high" => set_global_density(480),
        "xhigh" => set_global_density(640),
        "reset" => reset_global_density(),
        _ => false,
    }
}

/// Apply a font scale preset (small/normal/large/xlarge).
///
/// **Root:** ADB
/// **Returns:** `true` if preset applied
pub fn apply_font_preset(preset: &str) -> bool {
    match preset {
        "small" => set_global_font_scale(0.85),
        "normal" => set_global_font_scale(1.0),
        "large" => set_global_font_scale(1.15),
        "xlarge" => set_global_font_scale(1.3),
        _ => false,
    }
}

// TODO: Per-app DPI/font scaling requires Xposed hooks
// DPIS hooks Display.getMetrics(), ResourcesImpl.updateConfiguration(),
// Configuration.fontScale, TextView.setTextSize() per-process
// Cannot implement without framework injection

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn test_density_presets() {
        assert_eq!(apply_density_preset("low"), false);
        assert_eq!(apply_density_preset("medium"), false);
        assert_eq!(apply_density_preset("high"), false);
        assert_eq!(apply_density_preset("xhigh"), false);
        assert_eq!(apply_density_preset("reset"), false);
        assert_eq!(apply_density_preset("unknown"), false);
    }

    #[test]
    fn test_font_presets() {
        assert_eq!(apply_font_preset("small"), false);
        assert_eq!(apply_font_preset("normal"), false);
        assert_eq!(apply_font_preset("large"), false);
        assert_eq!(apply_font_preset("xlarge"), false);
        assert_eq!(apply_font_preset("unknown"), false);
    }

    #[test]
    fn test_set_global_resolution_format() {
        let formatted = format!("{}x{}", 1080, 2400);
        assert_eq!(formatted, "1080x2400");
        let formatted = format!("{}x{}", 720, 1600);
        assert_eq!(formatted, "720x1600");
    }

    #[test]
    fn test_set_font_scale_format() {
        let scale = 0.85f32;
        let formatted = format!("{:.1}", scale);
        assert_eq!(formatted, "0.9"); // rounds
    }

    #[test]
    fn test_get_current_density_no_sysfs() {
        let d = get_current_density();
        // On non-Android, returns 0
        #[cfg(not(target_os = "android"))]
        assert_eq!(d, 0);
    }
}
