# Rust SDK — Farewell Kernel Manager Implementation

> **File:** `rust/kernel-manager/src/`
> **Versi:** 1.0.0
> **Target:** POCO X3 NFC (SM7150-AC, Adreno 618, KernelSU)
> **Lines:** ~3,700 total (18 files)
> **JNI Exports:** 145 functions
> **Sysfs Paths:** ~180 unique

---

## Overview

Rust library (`cdylib`) untuk JNI bridge antara Kotlin app dan kernel sysfs.
40+ modul yang di-expose via JNI, dengan caching layer dan error handling.

### Architecture

```
lib.rs (759 lines) — JNI bridge, 145 fungsi
├── sysfs.rs (154) — Low-level I/O + TTL cache
├── cpu.rs (337) — CPU frequency, governor, cluster, hotplug
├── gpu.rs (229) — GPU freq, power levels, adreno, simple GPU
├── memory.rs (155) — MemInfo, ZRAM, VM params
├── thermal.rs (116) — Thermal zones, sconfig, MSM thermal
├── power.rs (150) — Battery level/temp/charging, bypass
├── scheduler.rs (144) — Stune, BORE, uclamp, VM cache
├── io.rs (65) — I/O scheduler, readahead
├── network.rs (30) — TCP congestion, kernel version
├── display.rs (51) — Backlight, KCAL, dimmer
├── display_control.rs (105) — DPI/font (wm density)
├── renderer.rs (119) — GPU renderer switch (resetprop)
├── spoof.rs (187) — Device spoof (resetprop + mount)
├── daemon.rs (427) — Foreground monitor, per-app profiles, DND
├── tier.rs (369) — 5-tier framework detection
├── checker.rs (277) — Feature verification + logging
└── wake.rs (45) — Double-tap-to-wake, audio
```

---

## Module Reference

### sysfs.rs — Low-Level I/O Layer

**Role:** Semua akses sysfs melewati module ini. Dual-path: `rustix` (safe) + `libc` (fallback).

**Functions (12 pub):**

| Function | Description |
|----------|-------------|
| `read_file(path) -> Option<String>` | rustix openat + read (primary) |
| `read_file_libc(path) -> Option<String>` | libc open/read/close (fallback) |
| `read_sysfs(path) -> Option<String>` | tries both paths |
| `read_sysfs_cached(path, ttl_ms) -> Option<String>` | cache-aware read |
| `read_sysfs_int(path, ttl_ms) -> Option<i64>` | cached + parse i64 |
| `read_sysfs_float(path, ttl_ms) -> Option<f32>` | cached + parse f32 |
| `read_file_buf(path, buf) -> Option<usize>` | raw bytes read |
| `write_sysfs(path, value) -> bool` | libc open(O_WRONLY) + write |
| `chmod(path, mode) -> bool` | libc fchmod |
| `file_exists(path) -> bool` | rustix accessat EXIST |
| `get_system_property(key) -> Option<String>` | android-properties crate |
| `invalidate_cache()` | clear seluruh TTL cache |

**Caching:**
- `once_cell::sync::Lazy<RwLock<HashMap<String, CachedValue>>>`
- `parking_lot::RwLock` — read-heavy optimal
- Kapasitas: 128 entry (pre-allocated)
- TTL per-path, ada yang 0ms (no cache) sampai 5000ms
- Write otomatis invalidate cache

**Sysfs paths:** none (semua diterima sebagai parameter)

**Dependencies:** `rustix`, `libc`, `once_cell`, `parking_lot`

---

### cpu.rs — CPU Management

**Role:** Frequency scaling, governor switching, cluster detection, hotplug, boost, temperature.

**JNI bridge functions (8):**
- `detectCpuClustersNative()` → `cpu::detect_cpu_clusters()` → JSON array
- `readCoreDataNative()` → `cpu::read_core_data()` → JSON array
- `readCpuLoadNative()` → `cpu::read_cpu_load()` → float
- `readCpuTemperatureNative()` → `thermal::read_cpu_temperature()` → float
- `readCoreTemperatureNative(core)` → `cpu::read_core_temperature(core)` → float
- `getCpuModelNative()` → `cpu::get_cpu_model()` → string
- `setGovernorNative(governor)` → `cpu::set_governor(governor)` → int (0/1)
- `setFreqLimitNative(core, min, max)` → `cpu::set_freq_limit(core, min, max)` → int
- `setCoreOnlineNative(core, online)` → `cpu::set_core_online(core, online)` → int

**CPU Enhancements (4):**
- `setInputBoostMsNative(ms)` → `cpu::set_input_boost_ms(ms)`
- `setSchedBoostOnInputNative(boost)` → `cpu::set_sched_boost_on_input(boost)`
- `setCpuEasEnabledNative(enabled)` → `cpu::set_cpu_eas_enabled(enabled)`
- `setCpuDcvsDisableNative(core, disable)` → `cpu::set_cpu_dcvs_disable(core, disable)`

**Rust functions (12 pub non-JNI):**
| Function | Returns | Sysfs Paths |
|----------|---------|-------------|
| `detect_cpu_clusters()` | `Vec<CpuCluster>` | group by (cur_min, cur_max) dari per-core freqs |
| `read_core_data()` | String (JSON) | per-core freq, governor, online |
| `read_cpu_load()` | f32 | `/proc/stat` delta |
| `read_cpu_load_detailed()` | `CpuLoadInfo` | per-core load |
| `read_core_temperature(core)` | f32 | `/sys/class/hwmon/hwmon1/temp{1-16}_input` |
| `get_cpu_model()` | String | `/proc/cpuinfo` → "Hardware" |
| `set_governor(governor)` | bool | per-policy `scaling_governor` |
| `set_freq_limit(core, min, max)` | bool | `scaling_min_freq` + `scaling_max_freq` |
| `set_core_online(core, online)` | bool | `cpu{N}/online` |
| `get_available_governors(cpu)` | `Vec<String>` | `scaling_available_governors` |
| `get_available_frequencies(cpu)` | `Vec<i32>` | `scaling_available_frequencies` |
| `set_cpufreq_hardlimit_max(freq)` | bool | `/sys/kernel/cpufreq_hardlimit/scaling_max_freq` |
| `set_cpufreq_hardlimit_min(freq)` | bool | `/sys/kernel/cpufreq_hardlimit/scaling_min_freq` |
| `set_cpufreq_hardlimit_dvfs_lock(enabled)` | bool | `userspace_dvfs_lock` |
| `set_msm_cpufreq_limit(limit)` | bool | `/sys/kernel/msm_cpufreq_limit/cpufreq_limit` |
| `set_input_boost_ms(ms)` | bool | `/sys/devices/system/cpu/cpu_boost/input_boost_ms` |
| `set_sched_boost_on_input(boost)` | bool | `sched_boost_on_input` |
| `set_cpu_eas_enabled(enabled)` | bool | `/sys/devices/system/cpu/eas/enable` |
| `set_cpu_dcvs_disable(core, disable)` | bool | `cpu{N}/core_ctrl/cpudcvs_disable` |

**Key structs:**
```rust
struct CpuCluster {
    cluster_number: i32, cores: Vec<i32>,
    min_freq: i32, max_freq: i32,
    cur_min_freq: i32, cur_max_freq: i32,
    governor: String,
    available_governors: Vec<String>,
    policy_path: String,
    available_frequencies: Vec<i32>,
}

struct CoreInfo {
    core_number: i32, online: bool,
    current_freq: i32, min_freq: i32, max_freq: i32,
    governor: String,
}
```

**Load calculation:** Delta-based — baca `/proc/stat` tiap 100ms, hitung `(total_delta - idle_delta) / total_delta * 100`.

**Cluster detection:** Loop core 0-15, group by (min_freq, max_freq) pair. SM7150 = 2 clusters (little LITTLE A55 + big A76).

**Sysfs paths (20+):**
| Path | Purpose | TTL |
|------|---------|-----|
| `cpu{N}/cpufreq/scaling_cur_freq` | Current freq | 0ms |
| `cpu{N}/cpufreq/scaling_min_freq` | User min | 0ms |
| `cpu{N}/cpufreq/scaling_max_freq` | User max | 0ms |
| `cpu{N}/cpufreq/scaling_governor` | Current gov | 1000ms |
| `cpu{N}/cpufreq/scaling_available_governors` | Listed govs | 5000ms |
| `cpu{N}/online` | Core state | 100ms |
| `/proc/stat` | Load calc | 0ms |
| `/proc/cpuinfo` | Model | 60000ms |
| `cpu_boost/input_boost_ms` | Input boost | 0ms |
| `eas/enable` | EAS toggle | 0ms |

---

### gpu.rs — GPU Management

**Role:** Adreno-specific (KGSL). Frekuensi, power level, adreno idler, simple GPU algorithm, bus DCVS.

**JNI bridge functions (22):**
- `readGpuFreqNative()`, `readGpuBusyNative()`, `resetGpuStatsNative()`
- `getGpuVendorNative()`, `getGpuModelNative()`, `getGpuDriverInfoNative()`
- `getGpuAvailableFrequenciesNative()`, `getGpuAvailablePoliciesNative()`
- `setGpuPowerLevelsNative(min, max)`, `setGpuForceNative(state, value)`
- `setGpuFreqLimitNative(min, max)`, `setGpuBusSplitNative(enabled)`
- `setGpuThrottlingNative(enabled)`, `setGpuIdleTimerNative(ms)`
- `setGpuMaxGpuclkNative(hz)`, `setGpuDevfreqGovernorNative(governor)`
- `setAdrenoIdlerActiveNative(active)`, `setAdrenoIdlerIdlewaitNative(ms)`
- `setAdrenoIdlerDowndifferentialNative(pct)`, `setAdrenoIdlerIdleworkloadNative(val)`
- `setSimpleGpuActivateNative(active)`, `setSimpleGpuLazinessNative(val)`
- `setSimpleGpuRampThresholdNative(val)`, `hasBusDcvsNative()`
- `setBusDcvsFreqNative(busName, min, max)`

**Rust functions (23 pub non-JNI):**

| Function | Sysfs Paths | Cache |
|----------|-------------|-------|
| `get_gpu_model()` | `/sys/class/kgsl/kgsl-3d0/{gpu_model,devfreq/gpu_model}` | OnceCell |
| `read_gpu_freq()` | `gpuclk`, `devfreq/cur_freq`, `clock_mhz` | 200ms |
| `read_gpu_busy()` | `gpubusy` (delta calculation) | 500ms |
| `get_gpu_available_frequencies()` | `gpu_available_frequencies`, `devfreq/available_frequencies` | 5000ms |
| `get_gpu_available_policies()` | `available_governors`, `devfreq/available_governors` | 5000ms |
| `get_gpu_driver_info()` | `devfreq/name` | 60000ms |
| `set_gpu_power_levels(min, max)` | `min_pwrlevel`, `max_pwrlevel` | write |
| `set_gpu_force(state, value)` | `kgsl-3d0/{state}` (force_clk_on, force_bus_on, dll) | write |
| `set_gpu_freq_limit(min, max)` | `devfreq/min_freq`, `devfreq/max_freq` | write |
| `set_gpu_bus_split(enabled)` | `bus_split` | write |
| `set_gpu_throttling(enabled)` | `throttling` | write |
| `set_gpu_idle_timer(ms)` | `idle_timer` | write |
| `set_gpu_max_gpuclk(hz)` | `max_gpuclk` | write |
| `set_gpu_devfreq_governor(governor)` | `devfreq/governor` | write |
| `set_adreno_idler_active(active)` | `/sys/module/adreno_idler/parameters/adreno_idler_active` | write |
| `set_adreno_idler_idlewait(ms)` | `adreno_idler_idlewait` | write |
| `set_adreno_idler_downdifferential(pct)` | `adreno_idler_downdifferential` | write |
| `set_adreno_idler_idleworkload(val)` | `adreno_idler_idleworkload` | write |
| `set_simple_gpu_activate(active)` | `/sys/module/simple_gpu_algorithm/parameters/simple_gpu_activate` | write |
| `set_simple_gpu_laziness(val)` | `simple_laziness` | write |
| `set_simple_gpu_ramp_threshold(val)` | `simple_ramp_threshold` | write |
| `has_bus_dcvs()` | `/sys/devices/system/cpu/bus_dcvs/*` | 0ms |
| `get_bus_dcvs_components()` | `bus_dcvs/{subdirs}` | 5000ms |
| `set_bus_dcvs_freq(name, min, max)` | `bus_dcvs/{name}/min_freq, max_freq` | write |

**GPU Busy (delta calculation):**
```
gpubusy content: "<busy_ticks> <total_ticks>"
read → parse (busy, total)
delta_busy = curr_busy - prev_busy
delta_total = curr_total - prev_total
load% = (delta_busy * 100) / delta_total
```
Prev values stored di `LAST_GPU_BUSY: Lazy<Mutex<Option<GpuBusyStats>>>`

**Adreno model detection:** Baca `gpu_model` sysfs → trim → jika start dengan "adreno" → return as-is. Jika model number → prepend "Adreno ". Fallback: "Adreno".

---

### memory.rs — Memory & ZRAM

**Role:** `/proc/meminfo`, ZRAM stats, VM parameters.

**JNI bridge functions (12):**
- `readMemInfoNative()`, `readZramSizeNative()`, `getMemoryPressureNative()`
- `getSwappinessNative()`, `getZramCompressionRatioNative()`
- `getZramAlgorithmNative()`, `getAvailableZramAlgorithmsNative()`
- `setSwappinessNative(val)`, `setDirtyRatioNative(val)`, `setMinFreeKbytesNative(val)`
- `zramSetAlgorithmNative(device, algo)`, `zramSetSizeNative(device, size)`

**Key struct:**
```rust
struct ZramStats {
    disksize: i64,         // /sys/block/zram0/disksize
    orig_data_size: i64,   // mm_stat[0]
    compr_data_size: i64,  // mm_stat[1]
    mem_used_total: i64,   // mm_stat[2]
    compression_ratio: f32 // orig / compr
}
```

---

### thermal.rs — Thermal Management

**Role:** Thermal zone monitoring, sconfig profile switching, MSM/EARA/FPSGO toggles.

**JNI bridge functions (4):**
- `readThermalZonesNative()` → JSON array of `{name, temp}`
- `setThermalSconfigNative(preset)` → Xiaomi thermal profile
- `(via cpu) readCpuTemperatureNative()` → primary zone temp

**Thermal presets:**
| Preset | sconfig Value |
|--------|---------------|
| Default | 11 |
| Extreme | 2 |
| Dynamic | 10 |
| Incalls | 8 |
| Cool | 20 |

**Zone auto-detection:** Scan thermal_zone{0-9}:
- CPU: match "cpu", "tsens", "pa" di `type`
- GPU: match "gpu", "adreno", "kgsl"

---

### power.rs — Battery & Charging

**Role:** Status monitoring, charging control, bypass charging discovery.

**JNI bridge functions (12):**
- `readBatteryLevelNative()`, `readBatteryTempNative()`, `readBatteryVoltageNative()`
- `readBatteryCurrentNative()`, `isChargingNative()`, `readCycleCountNative()`
- `readBatteryHealthNative()`, `readBatteryCapacityLevelNative()`
- `setBypassChargingNative(enable)`, `discoverBypassChargingNodeNative()`

**Persistent fd:** Battery paths (`capacity`, `temp`, `voltage_now`, `current_now`) dibuka sekali pake `libc::open` + disimpan di `Once` static → zero re-open overhead.

**Bypass charging discovery:** Cek 6+ node paths secara berurutan:
1. `battery/input_suspend`
2. `qcom-battery/bypass_charging_enable`
3. `battery/charging_enabled`
4. `bms/charging_enabled`
5. `bat/charging_enabled`
6. `platform/soc:qcom,battery/charging_enabled`
7. `usb/charging_enabled`
8. `dc/charging_enabled`

Temperature di-deci°C → dibagi 10 jadi °C.
Voltage di µV → dibagi 1000 jadi mV.
Current di µA (atau mA tergantung kernel).

---

### scheduler.rs — CPU Scheduler & VM

**Role:** Stune boost, BORE scheduler, uClamp, VM tuning.

**JNI bridge functions (8):**
- `setStunePreferIdleNative(prefer)`, `setStuneBoostNative(boost)`
- `setVfsCachePressureNative(pct)`, `setSplitLockMitigateNative(enabled)`
- `setSchedBoreNative(enabled)`, `setSchedUtilClampMinNative(val)`
- `setSchedUtilClampMaxNative(val)`, `dropCachesNative()`

**Rust functions (18 pub non-JNI):**
| Function | Path | Notes |
|----------|------|-------|
| `get_sched_features()` | `/sys/kernel/debug/sched_features` | `cat` |
| `set_sched_feature(feature, enabled)` | same | `echo +/-{feature}` |
| `set_stune_prefer_idle(prefer)` | `/dev/stune/top-app/schedtune.prefer_idle` | 0/1 |
| `set_stune_boost(boost)` | `/dev/stune/top-app/schedtune.boost` | 0-100 |
| `set_split_lock_mitigate(enabled)` | `/proc/sys/kernel/split_lock_mitigate` | 0/1 |
| `set_sched_lib_name(names)` | `/proc/sys/kernel/sched_lib_name` | string |
| `set_sched_lib_mask_force(mask)` | `/proc/sys/kernel/sched_lib_mask_force` | int |
| `set_sched_bore(enabled)` | `/proc/sys/kernel/sched_bore` | 0/1 |
| `set_sched_util_clamp_min(val)` | `/proc/sys/kernel/sched_util_clamp_min` | 0-1024 |
| `set_sched_util_clamp_max(val)` | `/proc/sys/kernel/sched_util_clamp_max` | 0-1024 |
| `set_sched_autogroup_enabled(enabled)` | `/proc/sys/kernel/sched_autogroup_enabled` | 0/1 |
| `set_vfs_cache_pressure(pct)` | `/proc/sys/vm/vfs_cache_pressure` | 0-200 |
| `set_overcommit_ratio(pct)` | `/proc/sys/vm/overcommit_ratio` | 0-100 |
| `drop_caches()` | `/proc/sys/vm/drop_caches` | echo 3 |

---

### io.rs — Block I/O

**Role:** Scheduler switching, readahead, nr_requests per-block-device.

**JNI bridge functions (3):**
- `setIoSchedulerNative(device, scheduler)`
- `setIoReadaheadNative(device, kb)`
- `setIoNrRequestsNative(device, nr)`

**Rust functions (9 pub non-JNI):** scheduler get/set, readahead get/set, nr_requests get/set, iostats get/set.

**Paths:** `/sys/block/{device}/queue/{scheduler,read_ahead_kb,nr_requests,iostats}`

---

### network.rs — Network & Kernel

**Role:** TCP congestion control, kernel version, dmesg restrict.

**JNI bridge functions (2):**
- `setTcpCongestionNative(algo)`
- `getKernelVersionNative()`

**Rust functions (5 pub non-JNI):**
| Function | Path |
|----------|------|
| `get_tcp_congestion()` | `/proc/sys/net/ipv4/tcp_congestion_control` |
| `set_tcp_congestion(algo)` | same (write) |
| `get_available_tcp_congestion()` | `tcp_available_congestion_control` |
| `set_dmesg_restrict(enabled)` | `/proc/sys/kernel/dmesg_restrict` |
| `get_kernel_version()` | `/proc/version` |

---

### display.rs — Display Hardware

**Role:** Backlight brightness, KCAL color control, backlight dimmer.

**JNI bridge functions:** none (bridged via daemon.rs)

**Rust functions (5 pub non-JNI):**
| Function | Path |
|----------|------|
| `get_max_brightness()` | `/sys/class/backlight/panel0-backlight/max_brightness` |
| `get_current_brightness()` | `{panel0-backlight,leds/lcd-backlight}/brightness` |
| `set_brightness(val)` | same (write) |
| `set_kcal(r, g, b)` | `/sys/devices/platform/kcal_ctrl.0/kcal` |
| `set_backlight_dimmer_enabled(enabled)` | `/sys/devices/virtual/misc/backlightdimmer/enabled` |

### display_control.rs — Display Software

**Role:** DPI/font scaling via Android shell commands (`wm density`).

**JNI bridge functions (7):**
- `setGlobalDensityNative(dpi)`, `resetGlobalDensityNative()`
- `getCurrentDensityNative()`, `setGlobalFontScaleNative(scale)`
- `getCurrentFontScaleNative()`, `applyDensityPresetNative(preset)`
- `applyFontPresetNative(preset)`

**Rust functions (10 pub non-JNI):** density set/reset/get, physical density, font scale set/get, resolution set/reset, preset apply.

**Implementation:** `std::process::Command::new("wm")` — not sysfs.

**Note:** Global only. Per-app DPI tanpa flicker butuh Xposed (leftover).

---

### renderer.rs — GPU Renderer Switch

**Role:** Switch GPU renderer via `resetprop` (`debug.hwui.renderer`). SkiaShift-inspired.

**JNI bridge functions (4):**
- `setRendererNative(mode)`, `getCurrentRendererNative()`
- `isVulkanEnabledNative()`, `restartSurfaceflingerNative()`

**Rust functions (9 pub non-JNI):**
| Function | Mechanism |
|----------|-----------|
| `resetprop(key, value)` | `resetprop -n` shell command |
| `resetprop_delete(key)` | `resetprop --delete` |
| `set_renderer(mode)` | set + restart SurfaceFlinger |
| `get_current_renderer()` | `getprop debug.hwui.renderer` |
| `is_vulkan_enabled()` | `getprop ro.hwui.use_vulkan` |
| `restart_surfaceflinger()` | `stop && start` |
| `generate_magisk_module(name, props)` | Create module.prop + system.prop |

**Vulkan props (6):**
```rust
pub const VULKAN_PROPS: &[(&str, &str)] = &[
    ("debug.hwui.renderer", "skiavk"),
    ("ro.hwui.use_vulkan", "1"),
    ("persist.sys.powerhal.interactive", "1"),
    ("debug.composition.type", "gpu"),
    ("debug.hwui.use_buffer_age", "true"),
    ("debug.enabletr", "true"),
];
```

---

### spoof.rs — Device Spoofing

**Role:** Spoof device identity via `resetprop` + `mount --bind` untuk `/proc/cpuinfo`.

**JNI bridge functions (8):**
- `spoofDevicePropertyNative(key, value)`, `restoreDevicePropertyNative(key)`
- `restoreAllSpoofsNative()`
- `mountCpuinfoSpoofNative()`, `unmountCpuinfoSpoofNative()`
- `isCpuinfoSpoofedNative()`, `applyDeviceProfileNative(profile)`

**Spoofable properties (16):**
```rust
pub const SPOOFABLE_PROPS: &[&str] = &[
    "ro.product.model", "ro.product.brand", "ro.product.name",
    "ro.product.device", "ro.product.manufacturer",
    "ro.build.fingerprint", "ro.build.description",
    "ro.build.version.release", "ro.build.version.sdk",
    "ro.soc.model", "ro.hardware", "ro.board.platform",
    "ro.mediatek.platform", "ro.chipname",
    "ro.vendor.product.name", "ro.vendor.product.device",
];
```

**Note:** Global spoof only. Per-process COW property spoof butuh Zygisk (leftover).

---

### daemon.rs — Background Service

**Role:** Foreground app detection, per-app profile switching, framework detection, DND, boot config.

**JNI bridge functions (18):**
- `getForegroundAppNative()`, `startProfileMonitorNative()`, `stopProfileMonitorNative()`
- `saveProfilesNative(json)`, `loadProfilesNative()`
- `hasKernelSuNative()`, `hasMagiskNative()`, `hasRezygiskNative()`, `hasLsposedNative()`, `hasResetpropNative()`
- `getFrameworkStatusNative()`, `setDndEnabledNative(enabled)`
- `setImmersiveModeNative(pkg, enabled)`, `dropCachesAndKillNative()`
- `setScreenBrightnessNative(value)`, `setScreenBrightnessModeManualNative()`
- `saveBootConfigNative(config)`, `loadBootConfigNative()`, `applyBootConfigNative()`

**Profile data:**
```rust
struct AppProfile {
    package: String,
    renderer: String,         // skiavk/skiagl/default
    density: i32,             // 0 = no change
    font_scale: f32,          // 1.0 = default
    device_profile: String,   // "default" / "pixel_7_pro"
    cpu_governor: String,     // default = no change
    gpu_max_pwrlevel: i32,    // -1 = no change
    thermal_preset: String,   // default = no change
}
```

**Boot config:**
```rust
struct BootConfig {
    renderer, cpu_governor, io_scheduler, io_device: Option<String>,
    gpu_max_pwrlevel: i32,
    thermal_preset: String,
    swappiness: i32,
    tcp_congestion: String,
}
```

**Thread safety:** `MONITOR_ACTIVE: AtomicBool` — `startProfileMonitorThread()` hanya jalan sekali, `stopProfileMonitor()` set ke false untuk graceful shutdown.

---

### tier.rs — 5-Tier Framework Detection

**Role:** Detect what frameworks (root/zygisk/xposed) are installed → determine available features.

**Tier system:**
```rust
pub enum Tier {
    NonRoot = 1,   // No root access
    Adb = 2,       // ADB shell (limited)
    Root = 3,      // KernelSU or Magisk
    Zygisk = 4,    // ZygiskNext or ReZygisk
    Xposed = 5,    // LSPosed
}
```

**FrameworkStatus** mendeteksi 6 komponen:
- `has_kernelsu()` + version from `ksud --version`
- `has_magisk()` + version from `magisk --version`
- `has_zygisk_next()` → `/data/adb/modules/zygisk_next`
- `has_rezygisk()` → `/data/adb/modules/rezygisk`
- `has_vector()` → `/data/adb/modules/vector`
- `has_lsposed()` → 3 paths
- `has_shizuku()` → `/data/data/moe.shizuku.manager`
- `has_resetprop()` → `which resetprop` + existence checks

**Feature unlocking:**
```rust
pub fn get_unlocked_features(tier: &Tier) -> Vec<String>  // features available at this tier
pub fn get_locked_features(tier: &Tier) -> Vec<String>    // features requiring higher tier
```

---

### checker.rs — Feature Verification

**Role:** Verify if a feature actually works (write + verify readback), log checker results.

**JNI bridge functions (6):**
- `verifyFeatureNative(feature)`, `verifyAllFeaturesNative()`
- `getCheckerLogNative()`, `clearCheckerLogNative()`, `exportLogsNative()`

**Verification flow:**
```
verify_feature("cpu_governor"):
  → current = read scaling_governor
  → write "performance"
  → readback = read scaling_governor
  → if current != readback → PASS
  → else → FAIL + restore original
```

**All features verified (9):**
cpu_freq, cpu_governor, cpu_online, gpu_freq, battery, thermal, bypass_charging, renderer, spoof

---

### wake.rs — Wake & Audio

**Role:** Double-tap-to-wake, speaker boost, headphone gain, mic boost.

**JNI bridge functions:** none (low-level, bridged via future daemon)

**Rust functions (4 pub non-JNI):**
| Function | Path(s) |
|----------|---------|
| `set_dt2w(enabled)` | `/sys/touchpanel/double_tap`, `/proc/touchpanel/double_tap`, `/sys/class/touch/touch_dev/gesture_wakeup`, 4 more |
| `set_speaker_boost(val)` | `/sys/kernel/sound_control_3/speaker_boost` |
| `set_headphone_gain(val)` | `/sys/kernel/sound_control_3/gain_control` |
| `set_mic_boost(val)` | `/sys/kernel/sound_control_3/mic_boost` |

---

## Sysfs Path Inventory

Total ~180 unique sysfs paths across 18 modules.

| Module | Count | Category |
|--------|-------|----------|
| cpu.rs | ~20+ | CPU frequency, governor, hotplug, boost |
| gpu.rs | ~30 | GPU KGSL, adreno, simple GPU, bus DCVS |
| memory.rs | ~12 | /proc/meminfo, ZRAM, VM |
| thermal.rs | ~13 | Thermal zones, MSM/EARA/FPSGO |
| power.rs | ~27 | Battery stats, charging, bypass discovery |
| scheduler.rs | 17 | Stune, sched features, BORE, uClamp |
| io.rs | 4 | I/O scheduler, readahead |
| network.rs | 4 | TCP, kernel, dmesg |
| display.rs | 7 | Backlight, KCAL, dimmer |
| wake.rs | 9 | DT2W, audio |
| daemon.rs | ~13 | Framework detection (file existence) |
| tier.rs | ~19 | Framework detection (version checks) |
| checker.rs | ~8 | Feature verification (write+readback) |

---

## Release Build Config

```toml
[profile.release]
opt-level = "z"      # size optimization
lto = "fat"          # full link-time optimization
strip = "symbols"    # remove debug symbols
panic = "abort"      # no unwind tables
codegen-units = 1    # max optimization
overflow-checks = false  # no overflow checks (kernel-only)
```

---

## JNI Bridge Pattern

Semua fungsi JNI di `lib.rs` mengikuti pattern konsisten:

```rust
#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_<Name>Native(
    _env: JNIEnv, _class: JClass, params...
) -> return_type {
    module::function(params)  // atau adapter
}
```

Helper untuk string return:
```rust
fn create_jstring_safe(env: &JNIEnv, s: String) -> jstring {
    env.new_string(s).unwrap_or_else(|_| env.new_string("").unwrap()).into_raw()
}
```

Pattern result: Rust `bool` → JNI `jint` (0/1). Rust `Option<T>` → JNI `jstring` (empty on None).
