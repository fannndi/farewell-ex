use std::process::Command;

// ==================== GPU Renderer Switch (SkiaShift resetprop approach) ====================
// Per-app requires LSPosed hooks — marked TODO
// Global switching via resetprop is sufficient for most use cases

pub const VULKAN_PROPS: &[(&str, &str)] = &[
    ("ro.hwui.use_vulkan", "true"),
    ("debug.hwui.renderer", "skiavk"),
    ("debug.renderengine.backend", "skiavkthreaded"),
    ("debug.hwui.use_buffer_age", "true"),
    ("renderthread.skia.reduceopstasksplitting", "true"),
    ("debug.hwui.skia_use_perf_hint", "true"),
];

pub const OPENGL_PROPS: &[(&str, &str)] = &[
    ("ro.hwui.use_vulkan", "false"),
    ("debug.hwui.renderer", "skiagl"),
    ("debug.renderengine.backend", "skiaglthreaded"),
    ("debug.hwui.use_buffer_age", "false"),
    ("debug.hwui.skia_use_perf_hint", "true"),
];

pub fn resetprop(key: &str, value: &str) -> bool {
    Command::new("resetprop").args(["-n", key, value]).status().is_ok()
}

pub fn resetprop_delete(key: &str) -> bool {
    Command::new("resetprop").args(["--delete", key]).status().is_ok()
}

pub fn set_renderer(mode: &str) -> bool {
    let props = match mode {
        "vulkan" => VULKAN_PROPS,
        "opengl" | "gl" => OPENGL_PROPS,
        _ => return false,
    };
    let mut all_ok = true;
    for (key, value) in props {
        if !resetprop(key, value) { all_ok = false; }
    }
    // Clean up Vulkan-only prop for OpenGL
    if mode == "opengl" || mode == "gl" {
        resetprop_delete("renderthread.skia.reduceopstasksplitting");
    }
    all_ok
}

pub fn get_current_renderer() -> String {
    let output = Command::new("getprop").arg("debug.hwui.renderer").output();
    match output {
        Ok(o) => String::from_utf8_lossy(&o.stdout).trim().to_string(),
        Err(_) => "unknown".to_string(),
    }
}

pub fn is_vulkan_enabled() -> bool {
    let output = Command::new("getprop").arg("ro.hwui.use_vulkan").output();
    match output {
        Ok(o) => String::from_utf8_lossy(&o.stdout).trim() == "true",
        Err(_) => false,
    }
}

pub fn restart_surfaceflinger() -> bool {
    Command::new("stop").status().is_ok() && Command::new("start").status().is_ok()
}

// ==================== Magisk Module Generator ====================

pub fn generate_magisk_module(module_name: &str, props: &[(&str, &str)]) -> bool {
    let module_dir = format!("/data/adb/modules/{}", module_name);
    let _ = Command::new("mkdir").arg("-p").arg(&module_dir).status();

    // module.prop
    let module_prop = format!(
        "id={}\nname={}\nversion=1.0\nversionCode=1\nauthor=farewell\ndescription=Farewell Kernel Manager auto-generated module",
        module_name, module_name
    );
    let _ = std::fs::write(format!("{}/module.prop", module_dir), module_prop);

    // system.prop
    let system_prop: String = props.iter()
        .map(|(k, v)| format!("{}={}", k, v))
        .collect::<Vec<_>>()
        .join("\n");
    let _ = std::fs::write(format!("{}/system.prop", module_dir), system_prop);

    // post-fs-data.sh
    let post_fs: String = props.iter()
        .map(|(k, v)| format!("resetprop -n \"{}\" \"{}\"", k, v))
        .collect::<Vec<_>>()
        .join("\n");
    let post_fs_content = format!("#!/system/bin/sh\n{}\n", post_fs);
    let _ = std::fs::write(format!("{}/post-fs-data.sh", module_dir), post_fs_content);
    let _ = Command::new("chmod").arg("0755").arg(format!("{}/post-fs-data.sh", module_dir)).status();

    true
}

pub fn remove_magisk_module(module_name: &str) -> bool {
    let module_dir = format!("/data/adb/modules/{}", module_name);
    Command::new("rm").args(["-rf", &module_dir]).status().is_ok()
}

pub fn list_magisk_modules() -> Vec<String> {
    let output = Command::new("ls").arg("/data/adb/modules/").output();
    match output {
        Ok(o) => String::from_utf8_lossy(&o.stdout)
            .split_whitespace()
            .map(|s| s.to_string())
            .collect(),
        Err(_) => vec![],
    }
}

// TODO: Per-app renderer override requires LSPosed hooks
// SkiaShift hooks __system_property_get per-process
// Cannot implement without framework injection
