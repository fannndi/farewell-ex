# Module 12: sysfs-rw — Xtra-Kernel Rust Native

**Source:** `Xtra-Kernel-Manager/app/src/main/rust/xkm_native/src/`
**Status:** ✅ VERIFIED — source code read line-by-line, all functions accounted

---

## 1. Cargo.toml — Dependencies & Build

```toml
[package]
name = "xkm_native"
version = "1.0.0"
edition = "2024"

[lib]
crate-type = ["cdylib"]

[dependencies]
jni = "0.21"
serde = { version = "1.0", features = ["derive"] }
serde_json = "1.0"
libc = "0.2"
rustix = { version = "1.1.3", default-features = false, features = ["fs"] }
once_cell = "1.19"
parking_lot = "0.12"
android-properties = "0.2"

# Optional: advanced stats
procfs = { version = "0.18", optional = true, features = ["serde1"] }
walkdir = { version = "2.4", optional = true }

[features]
advanced = ["procfs", "walkdir"]

[profile.release]
opt-level = "z"
lto = "fat"
strip = "symbols"
panic = "abort"
codegen-units = 1
overflow-checks = false
```

**Key:** `edition = "2024"`, `android-properties` for system property reads, `parking_lot` for cache locks.

---

## 2. utils.rs — Core Sysfs Read/Write Engine

**Persistent FD pattern** — not used here; battery module uses it separately.

### File Reading Functions

| Function | Parameters | Returns | Mechanism |
|----------|-----------|---------|-----------|
| `read_file_rustix(path)` | `&str` | `Option<String>` | `rustix::fs::openat(CWD, path, RDONLY)` → `rustix::io::read` → buffer 512B → trim |
| `read_file_libc(path)` | `&str` | `Option<String>` | `libc::open()` → `libc::read()` (512B) → `libc::close()` |
| `read_sysfs(path)` | `&str` | `Option<String>` | `read_file_rustix(path).or_else(\|\| read_file_libc(path))` |
| `read_file_libc_buf(path, buf)` | `&str, &mut [u8]` | `Option<usize>` (bytes read) | Buffer-level read for large files (e.g., /proc/meminfo 4096B, /proc/stat 4096B) |

### TTL Cache

```rust
struct CachedValue {
    value: String,
    timestamp: Instant,
}

static VALUE_CACHE: Lazy<RwLock<HashMap<String, CachedValue>>> =
    Lazy::new(|| RwLock::new(HashMap::with_capacity(64)));

pub fn read_sysfs_cached(path: &str, ttl_ms: u64) -> Option<String> {
    // 1. Read lock → check cache hit + ttl not expired → return clone
    // 2. Read fresh via read_sysfs(path)
    // 3. Write lock → insert into cache → return
}
```

**TTL semantics:** 0ms = no cache (always re-read). `1000` = 1s cache.

### Typed Readers
| Function | Delegates To |
|----------|-------------|
| `read_sysfs_int(path, ttl_ms) → Option<i32>` | `read_sysfs_cached()?.parse().ok()` |
| `read_sysfs_float(path, ttl_ms) → Option<f32>` | `read_sysfs_cached()?.parse().ok()` |

### Dual-check file_exists
1. `rustix::fs::accessat(CWD, path, Access::EXISTS)` (unix)
2. Fallback: `libc::access(path, F_OK)`
3. Returns `false` if both fail

### System Properties
- `get_system_property(key) → Option<String>` — uses `android_properties::getprop(key)`
- Platform-gated: `#[cfg(target_os = "android")]` only; returns `None` on non-Android

### Platform Safety
```rust
#[cfg(windows)]
unsafe fn libc_read_safe(fd, buf, len) → reads with `len as u32`

#[cfg(not(windows))]
unsafe fn libc_read_safe(fd, buf, len) → reads with `len`
```

---

## 3. cpu/cpu.rs — CPU Clusters, Cores, Load, Temp

### Data Structures

```rust
pub struct CpuCluster {
    pub cluster_number: i32,          // 0, 1, 2... (sorted by min_freq)
    pub cores: Vec<i32>,              // e.g., [0, 1], [2, 3, 4, 5, 6, 7]
    pub max_freq: i32,                // cpuinfo_max_freq (hardware limit)
    pub min_freq: i32,                // cpuinfo_min_freq
    pub cur_min_freq: i32,            // scaling_min_freq (current limit)
    pub cur_max_freq: i32,            // scaling_max_freq
    pub governor: String,             // e.g., "schedutil"
    pub available_governors: Vec<String>,
    pub policy_path: String,          // e.g., "/sys/devices/system/cpu/cpu0/cpufreq"
}

pub struct CoreInfo {
    pub core_number: i32,
    pub online: bool,
    pub current_freq: i32,
    pub min_freq: i32,
    pub max_freq: i32,
    pub governor: String,
}

pub struct CpuLoadInfo {
    pub total_load: f32,
    pub per_core_load: Vec<f32>,      // 0.0–100.0
}
```

### Cluster Detection Algorithm — `detect_cpu_clusters()`

1. Loop cpu 0..16, check if `scaling_min_freq` exists (`file_exists`)
2. Read `scaling_min_freq` + `scaling_max_freq` per core
3. Group by `(min_freq, max_freq)` pair → each unique pair = cluster
4. For each cluster: read governor, available_governors, cur_min_freq, cur_max_freq from first core
5. Sort clusters by `min_freq` ascending → reassign `cluster_number`
6. Return `Vec<CpuCluster>` serialized as JSON

**Key design:** Groups cores by identical min/max freq pairs, not by policy*/ directory names.

### Core Data — `read_core_data()`

1. Loop cpu 0..16
2. Check online: cpu0 always online, others via `/sys/devices/system/cpu/cpu{N}/online`
3. If not online AND `scaling_cur_freq` doesn't exist → stop scanning (break)
4. Read per-core: current_freq, min_freq, max_freq, governor
5. Return JSON array of `CoreInfo`

**Edge case:** Breaks at first non-existing CPU beyond actual count (determined by freq file presence).

### CPU Load — Delta-based (`/proc/stat`)

```rust
static CPU_STATS: Lazy<Mutex<CpuStats>> = Lazy::new(|| {
    Mutex::new(CpuStats { total_time: vec![0; 16], idle_time: vec![0; 16] })
});
```

- Reads `/proc/stat` via `read_file_libc_buf` (4096B buffer)
- Parses `cpuN` lines, extracts user+nice+system+idle
- Calculates: `load = 100.0 - (idle_diff / total_diff * 100.0)`
- Stores previous total/idle for delta calculation
- Clamp 0.0–100.0

### Core Temperature — `read_core_temperature(core)`

Try paths:
1. `/sys/class/hwmon/hwmon1/temp{N+1}_input`
2. `/sys/devices/virtual/thermal/thermal_zone{N}/temp`

Normalize: if temp > 1000.0 → `/ 1000.0` (millidegrees → degrees). Valid range: 0–150°C.

### CPU Model — `get_cpu_model()`

- `OnceCell<String>` — cached after first read
- Reads `/proc/cpuinfo`
- First match: `Hardware` field, fallback: `Processor` field
- Trims and returns

---

## 4. gpu/gpu.rs — Multi-Vendor GPU Detection & Stats

### Vendor Enum
```rust
pub enum GpuVendor { Qualcomm, Mali, PowerVR, Nvidia, Unknown }
```

### GPU Info Cache
```rust
static GPU_INFO: OnceCell<(GpuVendor, String)> = OnceCell::new();
```

### 5-Step GPU Detection Chain (`detect_gpu()`)

| Step | Check | How | Example Result |
|------|-------|-----|----------------|
| 1 | KGSL presence | `file_exists("/sys/class/kgsl/kgsl-3d0/gpuclk")` + `detect_adreno_model()` | `(Qualcomm, "Adreno 618")` |
| 2 | Mali presence | `file_exists` on `/sys/class/misc/mali0/device/gpuinfo`, `/sys/devices/platform/mali/gpuinfo`, `/dev/mali0` | `(Mali, "Mali G76")` |
| 3 | SurfaceFlinger | `dumpsys SurfaceFlinger` → parse GLES renderer string | Any vendor |
| 4 | CPU info | `grep /proc/cpuinfo` for "adreno"/"mali" | Heuristic |
| 5 | System property | `ro.hardware.vulkan` | Heuristic |

### Adreno Model Detection (`detect_adreno_model()`)
- Read `/sys/class/kgsl/kgsl-3d0/gpu_model` or `devfreq/gpu_model`
- Check if starts with "Adreno" → use as-is, else prepend "Adreno "

### Mali Model Detection
- Read `/sys/class/misc/mali0/device/gpuinfo` or `/sys/devices/platform/mali/gpuinfo`

### Freq Reading

| GPU | Path | Normalization |
|-----|------|--------------|
| Adreno | `/sys/class/kgsl/kgsl-3d0/gpuclk` → `devfreq/cur_freq` → `clock_mhz` | >1M ÷1M, >1000 ÷1000, else raw → MHz |
| Mali | `/sys/class/misc/mali0/device/clock` → `platform/mali/clock` | >1M ÷1M |

### GPU Busy — Delta-based (`/proc/gpubusy`)

```rust
static LAST_GPU_BUSY: Lazy<Mutex<Option<GpuBusyStats>>> = Lazy::new(|| Mutex::new(None));
```

1. Read `/sys/class/kgsl/kgsl-3d0/gpubusy` → "busy total" space-separated
2. Calculate delta vs previous reading
3. Handle counter overflow: if `curr_total < last.total` → use absolute values
4. `load = (delta_busy * 100) / delta_total`, min 1 if there's any activity, max 100
5. Fallback: `gpu_busy_percentage` file if no delta possible

For Mali: `/sys/class/misc/mali0/device/utilization` (single integer 0-100)

### Available Frequencies
- Reads from `gpu_available_frequencies` or `devfreq/available_frequencies`
- Normalizes Hz → MHz using same logic as freq reading
- Returns `Vec<i32>`

### Available Governors (Policies)
- Reads from `devfreq/available_governors` or `kgsl-3d0/available_governors`
- Returns `Vec<String>`

### Driver Info
- Reads `gpu_model` or `devfreq/name` for driver identification

---

## 5. memory/memory.rs — MemInfo, Swap, ZRAM, Swappiness

### Data Structures

```rust
pub struct MemoryInfo {
    pub total_kb: i64,
    pub available_kb: i64,
    pub free_kb: i64,
    pub cached_kb: i64,
    pub buffers_kb: i64,
}

pub struct SwapInfo {
    pub total_kb: i64,
    pub free_kb: i64,
    pub used_kb: i64,       // total - free (calculated, not read)
    pub cached_kb: i64,
}

pub struct ZramStats {
    pub disksize: i64,
    pub orig_data_size: i64,     // uncompressed data
    pub compr_data_size: i64,    // compressed data
    pub mem_used_total: i64,     // zram memory used (including metadata)
    pub compression_ratio: f32,  // orig / compr
}

pub struct MemInfoDetailed {
    pub memory: MemoryInfo,
    pub swap: SwapInfo,
    pub zram: ZramStats,
    pub swappiness: i32,
}
```

### MemInfo — `/proc/meminfo` parsing

Reads full file via `read_file_libc_buf` with 4096B buffer.
Lines parsed by whitespace-split, matches key names:
- `MemTotal:`, `MemAvailable:`, `MemFree:`, `Cached:`, `Buffers:` → `MemoryInfo`
- `SwapTotal:`, `SwapFree:`, `SwapCached:` → `SwapInfo` (used_kb calculated)

### ZRAM — `/sys/block/zram0/` paths

| Path | Method |
|------|--------|
| `disksize` | `read_sysfs_int(path, 1000)` |
| `mm_stat` | `read_sysfs_cached(path, 1000)` → split whitespace, parse positions 0=orig, 1=compr, 2=mem_used |
| `comp_algorithm` | `read_sysfs_cached(path, 0)` → strip brackets `[lz4]` → current algo |

**Compression ratio:** `orig_data_size / compr_data_size`, defaults to 1.0 if zero

### Multi-Device ZRAM — `read_zram_device_stats(device: i32)`
- Dynamic path: `/sys/block/zram{device}/disksize`
- Existence check via `file_exists()` before reading
- Same parsing as zram0

### Memory Pressure
```rust
pub fn get_memory_pressure() -> f32 {
    let used = total_kb - available_kb;
    (used / total_kb) * 100.0
}
```
**Returns 0.0–100.0 (percentage)** — Kotlin expects 0.0–1.0? Inconsistency alert.

### Available ZRAM Algorithms
- Parses `comp_algorithm` content → split by whitespace → strip `[` `]` brackets
- Returns `Vec<String>`

---

## 6. power/power.rs — Battery + Power Management

### Persistent FD Pattern (Critical Optimization)

```rust
static mut CAPACITY_FD: RawFd = -1;
static mut TEMP_FD: RawFd = -1;
static mut VOLTAGE_FD: RawFd = -1;
static mut CURRENT_FD: RawFd = -1;
static INIT: Once = Once::new();

fn ensure_init() {
    INIT.call_once(|| unsafe {
        // Open FDs at init, NEVER close
        CAPACITY_FD = libc::open("/sys/class/power_supply/battery/capacity\0", O_RDONLY);
        // ... same for temp, voltage_now, current_now
    });
}
```

**Flow each read:**
1. `ensure_init()` — once per process
2. `lseek(fd, 0, SEEK_SET)` — rewind to beginning
3. `libc::read(fd, buf, 32)` — read directly from persisted FD
4. Parse UTF-8 → trim → parse int
5. If FD read fails → fallback to `utils::read_sysfs_int()` (standard cached read)

**Why:** Zero syscall overhead after init — no `open()`/`close()` per read.

### Voltage Path
```
/sys/class/power_supply/battery/voltage_now  → microvolts (µV)
→ `voltage_uv / 1000` → millivolts (mV) as i32
```
**Note:** Returns mV. Kotlin converts mV → V (`/ 1000.0f`).

### Current Drain — `read_drain_rate_ma()`
```rust
let raw_value = read CURRENT_FD or fallback to read_sysfs;
let abs_val = raw_value.abs();
if abs_val < 10000 {
    abs_val as i32  // already µA → return as mA? No, this IS mA
} else {
    (abs_val / 1000) as i32  // µA → mA
}
```
**Logic:** If value < 10000, assume it's already mA. If > 10000, it's µA → ÷1000.

### Battery Status/Health
- `is_charging()`: checks `/sys/class/power_supply/battery/status` contains "Charging"
- `read_battery_health()`: reads `/sys/class/power_supply/battery/health` → string
- `read_battery_capacity_level()`: `charge_full / charge_full_design * 100.0` (50–100% sanity range)

### Power Management
| Function | Path | Notes |
|----------|------|-------|
| `read_wakeup_count()` | `/sys/power/wakeup_count` | |
| `read_suspend_count()` | `/sys/kernel/debug/suspend_stats/success` | Requires debugfs |
| `read_cycle_count()` | `/sys/class/power_supply/{bms,battery,bat}/cycle_count` | 3-path fallback |

---

## 7. power/thermal.rs — Thermal Zones

### Zone Auto-Detection
```rust
static PRIMARY_THERMAL_ZONE: OnceCell<i32> = OnceCell::new();

fn get_primary_thermal_zone() -> i32 {
    // Scans zones 0..9, first match: type contains "cpu" OR "tsens" OR == "pa"
}
```

### Zone Reading
| Function | Path | Normalization |
|----------|------|--------------|
| `read_thermal_zone(zone)` | `/sys/class/thermal/thermal_zone{N}/temp` | if >1000 → ÷1000 |
| `get_thermal_zone_type(zone)` | `/sys/class/thermal/thermal_zone{N}/type` | |
| `read_thermal_zones()` | All zones 0..99 with temp > 0 | JSON array `[{name, temp}]` |
| `read_cpu_temperature()` | Primary zone temp | |

**Zone type format in JSON:** `"{index}:{type}"` e.g., `"0:tsens_tz_sensor0"`

---

## 8. disk/disk.rs — Disk I/O Stats (UNUSED)

**Exists in source but NOT wired in `lib.rs`** — no `mod disk;` import, no JNI exports.

### Data Structures
```rust
pub struct DiskStats {
    pub read_bytes: u64,
    pub write_bytes: u64,
    pub read_speed: u64,     // bytes/sec (delta-based)
    pub write_speed: u64,
}
```

### Mechanism
- Reads `/proc/diskstats`
- Tries devices: `"sda"`, `"mmcblk0"`, `"dm-0"`
- Parses: field 5 = read sectors, field 9 = write sectors
- `SECTOR_SIZE = 512`
- Speed: delta-based using `DiskState` with timestamps
- Returns first matching device

---

## 9. lib.rs — JNI Bridge (40 Functions)

### Bootstrap
```rust
mod cpu; mod gpu; mod memory; mod power; mod utils;
// Note: NO `mod disk;`

#[unsafe(no_mangle)]
pub extern "system" fn JNI_OnLoad(...) -> jint {
    jni::sys::JNI_VERSION_1_6
}
```

### JNI Naming Convention
```
Java_id_xms_xtrakernelmanager_domain_native_NativeLib_{functionName}
```

### All 40 Exported JNI Functions

| # | JNI Function | Rust Module | Return | Params | Notes |
|---|-------------|-------------|--------|--------|-------|
| 1 | `detectCpuClustersNative` | cpu | jstring (JSON) | — | Clusters as JSON array |
| 2 | `readCoreDataNative` | cpu | jstring (JSON) | — | CoreInfo JSON array |
| 3 | `readCpuLoadNative` | cpu | jfloat | — | 0.0–100.0 |
| 4 | `readCpuTemperatureNative` | power | jfloat | — | Delegates to power::read_cpu_temperature |
| 5 | `readCoreTemperatureNative` | cpu | jfloat | core: jint | Per-core temp |
| 6 | `getCpuModelNative` | cpu | jstring | — | |
| 7 | `readGpuFreqNative` | gpu | jint | — | MHz |
| 8 | `readGpuBusyNative` | gpu | jint | — | 0–100 |
| 9 | `resetGpuStatsNative` | gpu | void | — | Resets delta base |
| 10 | `getGpuVendorNative` | gpu | jstring | — | |
| 11 | `getGpuModelNative` | gpu | jstring | — | |
| 12 | `readBatteryLevelNative` | power | jint | — | 0–100 |
| 13 | `readBatteryTempNative` | power | jint | — | deciCelsius |
| 14 | `readBatteryVoltageNative` | power | jint | — | mV |
| 15 | `readBatteryCurrentNative` | power | jint | — | mA |
| 16 | `readDrainRateNative` | power | jint | — | mA |
| 17 | `isChargingNative` | power | jint | — | 0/1 |
| 18 | `readWakeupCountNative` | power | jint | — | |
| 19 | `readSuspendCountNative` | power | jint | — | |
| 20 | `readMemInfoNative` | memory | jstring (JSON) | — | MemoryInfo |
| 21 | `readZramSizeNative` | memory | jlong | — | |
| 22 | `getMemoryPressureNative` | memory | jfloat | — | 0.0–100.0 (!! not 0.0–1.0) |
| 23 | `readThermalZoneNative` | power | jfloat | zone: jint | °C |
| 24 | `getThermalZoneTypeNative` | power | jstring | zone: jint | |
| 25 | `readThermalZonesNative` | power | jstring (JSON) | — | [{name, temp}] |
| 26 | `readCycleCountNative` | power | jint | — | -1 if not found |
| 27 | `readBatteryHealthNative` | power | jstring | — | |
| 28 | `readBatteryCapacityLevelNative` | power | jfloat | — | 50.0–100.0 |
| 29 | `getZramCompressionRatioNative` | memory | jfloat | — | |
| 30 | `getZramCompressedSizeNative` | memory | jlong | — | |
| 31 | `getZramOrigDataSizeNative` | memory | jlong | — | |
| 32 | `getZramAlgorithmNative` | memory | jstring | — | |
| 33 | `getSwappinessNative` | memory | jint | — | |
| 34 | `readMemInfoDetailedNative` | memory | jstring (JSON) | — | MemInfoDetailed |
| 35 | `getSystemPropertyNative` | utils | jstring | key: JString | |
| 36 | `getGpuAvailableFrequenciesNative` | gpu | jstring (JSON) | — | Vec<i32> |
| 37 | `getGpuAvailablePoliciesNative` | gpu | jstring (JSON) | — | Vec<String> |
| 38 | `getGpuDriverInfoNative` | gpu | jstring | — | |
| 39 | `readZramDeviceStatsNative` | memory | jstring (JSON) | device: jint | |
| 40 | `getAvailableZramAlgorithmsNative` | memory | jstring (JSON) | — | |

### Helper: `create_jstring_safe`
```rust
fn create_jstring_safe(env: &JNIEnv, s: String) -> jstring {
    env.new_string(s)
        .unwrap_or_else(|_| env.new_string("").unwrap())
        .into_raw()
}
```

---

## 10. Cross-Cutting Patterns

| Pattern | Where | Detail |
|---------|-------|--------|
| **JSON bridge** | All complex returns | Rust serializes with `serde_json`, Kotlin parses |
| **Persistent FDs** | power.rs | Battery reads via `libc::open()` once, `lseek`+`read` always — zero re-open |
| **Delta calculation** | CPU load, GPU busy | Store previous state, calculate diff, handle overflow |
| **OnceCell caching** | GPU, CPU model, thermal zone | `OnceCell` for immutable, process-lifetime cache |
| **TTL caching** | utils | `RwLock<HashMap>` with configurable TTL per path |
| **Dual-path reading** | utils | `rustix` (safe) primary → `libc` (unsafe) fallback |
| **Graceful degradation** | Every function | Returns 0/empty/"unknown"/null on failure, never panics |
| **CLAMP validation** | Temp, capacity | Sanity ranges prevent obviously wrong values |
| **Multi-vendor GPU** | gpu.rs | 5-step fallback chain with vendor enum |
| **cluster grouping** | cpu.rs | Groups cores by identical (min_freq, max_freq) pairs |
| **break-on-nonexist** | cpu.rs | Stops scanning CPUs when freq file not found |

---

## 11. Files in Module

| File | Lines | Role |
|------|-------|------|
| `Cargo.toml` | 39 | Dependencies, features, release profile |
| `lib.rs` | 369 | JNI bridge — 40 exported functions |
| `cpu/cpu.rs` | 312 | Cluster detection, core data, load delta, model |
| `cpu/mod.rs` | — | Exports |
| `gpu/gpu.rs` | 431 | Multi-vendor detection, freq, busy, policies |
| `gpu/mod.rs` | — | Exports |
| `memory/memory.rs` | 255 | MemInfo, SwapInfo, ZramStats, swappiness |
| `memory/mod.rs` | — | Exports |
| `power/power.rs` | 190 | Battery persistent FD, health, cycle count |
| `power/thermal.rs` | 66 | Thermal zone auto-detect, temp, type |
| `power/mod.rs` | — | Exports |
| `disk/disk.rs` | 93 | **EXISTS but NOT WIRED** — no `mod disk` in lib.rs |
| `disk/mod.rs` | — | Exists but unwired |
| `utils.rs` | 211 | Core sysfs read, TTL cache, file_exists, properties |

---

## 12. Unit Format Chain

```
Rust (raw)           → Kotlin (conversion)   → UI

/sys/.../temp:       deci°C (int)            → /10.0f → °C
/sys/.../voltage_now: µV (int)               → /1000 → mV → /1000 → V
/sys/.../current_now: µA or mA (int)          → abs <10000 = mA, else µA/1000
/sys/.../gpuclk:     Hz (int)                → >1M /1M, >1000 /1000 → MHz
/proc/meminfo:       kB                      → kB (no conversion)
/proc/stat:          jiffies (delta)          → 100.0 - (idle/total)*100
```
