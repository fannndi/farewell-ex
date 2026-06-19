# Module 18: ZKM — Zygisk Kernel Manager

**Source:** `ZKM/` (Kotlin/Compose kernel manager)
**Status:** ✅ VERIFIED — AdrenoUtils.kt IPC pattern + GenericGpuUtils.rs 3-tier discovery confirmed

## Architecture

4-layer: Compose UI → Utils (singleton objects) → IPC/Shell → sysfs/procfs

**GPU-Type Routing:** `CpuGpuUtils.getGpuType()` detects at runtime → routes to Adreno/MediaTek/Generic screen.

---

## GPU Discovery

Three-tier search in `GenericGpuUtils.getGpuPath()`:
1. `find /sys/class/devfreq/ -iname "*.mali"` (shell find)
2. Static fallback list (kgsl, tegra, dfrgx)
3. Manual scan + validation (`available_frequencies` or `available_governors` exists)

**Samsung DVFS Lock:** checks `dvfs_min_lock`/`dvfs_max_lock` instead of standard `min_freq`/`max_freq`

---

## Bus DCVS

Discovery: `/sys/devices/system/cpu/bus_dcvs/` → list subdirs
Two-level path probing for freq reading
Smart frequency setter: brute-force boundary algorithm — expand min/max, set, restore

---

## Sysfs Paths

### Adreno
| Path | Purpose |
|------|---------|
| `/sys/class/kgsl/kgsl-3d0/min_clock_mhz` | Min GPU clock |
| `/sys/class/kgsl/kgsl-3d0/max_clock_mhz` | Max GPU clock |
| `/sys/class/kgsl/kgsl-3d0/gpuclk` | Current freq |
| `/sys/class/kgsl/kgsl-3d0/gpu_available_frequencies` | Available freqs |
| `/sys/class/kgsl/kgsl-3d0/devfreq/governor` | GPU governor |
| `/sys/class/kgsl/kgsl-3d0/devfreq/adrenoboost` | Boost level |
| `/sys/class/kgsl/kgsl-3d0/throttling` | Throttle toggle |
| `/sys/module/adreno_idler/parameters/*` | Idler params |
| `/sys/devices/system/cpu/bus_dcvs/*` | Bus DCVS |
| `/sys/class/devfreq/kgsl-busmon/*` | Bus monitor |

### MediaTek
| Path | Purpose |
|------|---------|
| `/sys/module/ged/parameters/*` | GPU DVFS, boost, game mode |
| `/sys/kernel/ged/hal/*` | Custom boost freq, utilization |
| `/proc/gpufreqv2/fix_target_opp_index` | Freq lock (v2) |
| `/proc/gpufreq/gpufreq_opp_freq` | Freq lock (legacy) |
| `/proc/ppm/enabled` | PPM toggle |
| `/proc/ppm/policy_status` | Throttle policies |
| `/proc/cpufreq/cpufreq_cci_mode` | CCI mode |
| `/sys/kernel/eara_thermal/enable` | EARA thermal |
| `/sys/kernel/fpsgo/common/fpsgo_enable` | FPS governance |

### Generic
| Path | Purpose |
|------|---------|
| `/sys/devices/system/cpu/cpufreq/policy*/*` | CPU freq/governor |
| `/sys/devices/system/cpu/cpu_boost/input_boost_ms` | Input boost |
| `/dev/cpuset/*/cpus` | Task affinity |
| `/sys/block/zram0/comp_algorithm` | ZRAM algo |

---

## IPC Pattern (IPC-first, Shell fallback)

```kotlin
fun readData(path: String): String {
    RootIpcManager.ipc?.readNode(path)  // AIDL over RootService
        ?: Utils.readFile(path)          // Shell cat
}
```

**Key:** IPC uses `IMtkService` AIDL binding — avoids shell overhead per call.
