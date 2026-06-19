# Rust SDK Design — Based on Xtra-Kernel Reverse Engineering

**Target:** `rust/kernel-manager/src/`
**Reference:** Xtra-Kernel-Manager xkm_native

## Architecture (from Xtra-Kernel)

```
lib.rs              → JNI bridge, 34+ exported functions
├── cpu/cpu.rs      → Cluster detection, core data, load, temp, model
├── cpu/mod.rs      → re-exports
├── gpu/gpu.rs      → Multi-vendor detection (Adreno/Mali), freq, busy, freq table
├── gpu/mod.rs      → re-exports
├── memory/memory.rs → Meminfo, ZRAM stats, swappiness, pressure
├── memory/mod.rs   → re-exports
├── power/power.rs  → Battery (persistent FD), charging, cycle count, capacity
├── power/thermal.rs → Zone auto-detection (cpu/tsens), temp reading
├── power/mod.rs    → re-exports
├── disk/disk.rs    → Disk I/O stats (exists, NOT wired into lib.rs)
├── disk/mod.rs     → re-exports
└── utils.rs        → Sysfs read (rustix+libc), TTL cache, system property, file_exists
```

**Note:** `disk/` module exists in source but is NOT imported in `lib.rs`. Unused.

## Key Design Decisions (from Xtra-Kernel)

### 1. Dual-path sysfs reading
- **Primary**: `rustix::fs::openat()` — safe POSIX, zero overhead
- **Fallback**: `libc::open/read` — unsafe but universal
- **Pattern**: `read_sysfs() = read_file_rustix().or_else(|| read_file_libc())`

### 2. TTL-based caching
- `RwLock<HashMap<String, CachedValue>>` — global cache
- Configurable TTL per path (0ms = no cache, 1000ms = 1s cache)
- Battery uses persistent FD (zero-overhead reads, no re-open)

### 3. Multi-vendor GPU detection (5-fallback chain)
1. `/sys/class/kgsl/kgsl-3d0/gpuclk` → Adreno
2. `/sys/class/misc/mali0/device/gpuinfo` → Mali
3. `dumpsys SurfaceFlinger` → renderer string
4. `/proc/cpuinfo` → GPU hints
5. `ro.hardware.vulkan` property → Vulkan GPU

### 4. Delta-based load calculation
- CPU: reads `/proc/stat`, stores total/idle time, calculates delta
- GPU: reads `gpubusy` (busy/total ticks), calculates delta

### 5. Release profile (size-optimized)
```toml
[profile.release]
opt-level = "z"
lto = "fat"
strip = "symbols"
panic = "abort"
codegen-units = 1
overflow-checks = false
```

## Cargo.toml Template

```toml
[package]
name = "kernel-manager"
version = "0.1.0"
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

[profile.release]
opt-level = "z"
lto = "fat"
strip = "symbols"
panic = "abort"
codegen-units = 1
```

## SM7150-AC (Adreno 618) Specific Paths

| Module | Sysfs Paths |
|--------|------------|
| CPU clusters | policy0 (2x A55), policy6 (6x A76) |
| GPU | kgsl-3d0/gpuclk, devfreq/cur_freq, gpubusy |
| Battery | power_supply/battery/capacity, temp, voltage_now, current_now |
| Thermal | thermal_zone*/temp (auto-detect cpu/tsens) |
| ZRAM | zram0/disksize, mm_stat, comp_algorithm |
| VM | /proc/sys/vm/swappiness, dirty_ratio |
