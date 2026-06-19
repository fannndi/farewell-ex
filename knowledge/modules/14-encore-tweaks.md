# Module 14: Encore Tweaks — Native Daemon + Shell Profiler

**Source:** `encore/` (Magisk/KSU module)
**Status:** ✅ VERIFIED — source code read (Main.cpp poll loop + profiler.sh 914 lines)

## Architecture

4-layer system: Vue WebUI → Native C++ daemon → Shell profiler → sysfs/procfs writes.

```
WebUI (Vue 3 + Pinia)     → config.json, gamelist.json
Native Daemon (encored)   → poll() loop, eventfd, inotify, game detection
Java Companion            → foreground app, screen state, battery saver
Shell Profiler            → 914 lines, all sysfs/procfs kernel writes
```

---

## Core C++ Modules

| Module | Role |
|--------|------|
| `Main.cpp` | Entry point, CLI dispatch, poll() loop, profile selection, 3-strike game debounce |
| `EncoreCLI.cpp` | CLI router: daemon, setup_gamelist, check_gamelist, version |
| `EncoreConfigStore.cpp` | JSON config (rapidjson), preferences + CPU governor per profile |
| `DeviceMitigationStore.cpp` | Per-device sysfs skip rules, match/contains/regex operators |
| `Profiler.cpp` | Sets ENCORE_* env vars, calls encore_profiler via system() |
| `InotifyHandler.cpp` | inotify watches on gamelist, config, device_mitigation, system_status |
| `SystemStatus` | Reader for system_status file (key=value format) |
| `PIDTracker` | Thread-based PID death detection, pidfd_open or kill(pid,0) fallback |
| `LockFile` | fcntl(F_SETLK/F_SETLKW) singleton lock |
| `GameRegistry` | JSON gamelist loader, scans /data/data/<pkg> for installed games |
| `DeviceInfo` | uname(), /proc/device-tree/model, ro.product.model |

---

## Shell Profiler (914 lines)

**Path:** `scripts/encore_profiler.sh`
**Trigger:** Native daemon calls `encore_profiler <profile>` via system()
**Profiles:** perfcommon, performance, balance, powersave
**SoC families:** MediaTek, Qualcomm, Exynos, Unisoc, Tensor, Tegra, Kirin

---

## Sysfs/Procfs Paths — Comprehensive Catalog

### CPU Frequency
| Path | Action |
|------|--------|
| `/sys/devices/system/cpu/cpu*/cpufreq/scaling_governor` | Set governor |
| `/sys/devices/system/cpu/cpufreq/policy*/scaling_governor` | Set governor (alt) |
| `/sys/devices/system/cpu/*/cpufreq/scaling_max_freq` | Lock max freq |
| `/sys/devices/system/cpu/*/cpufreq/scaling_min_freq` | Lock min freq |
| `/sys/devices/system/cpu/cpufreq/policy*/scaling_available_frequencies` | List available |

### MediaTek PPM
| Path | Action |
|------|--------|
| `/proc/ppm/policy/hard_userlimit_max_cpu_freq` | Lock cluster max |
| `/proc/ppm/policy/hard_userlimit_min_cpu_freq` | Lock cluster min |
| `/proc/ppm/policy_status` | Disable PWR_THRO/THERMAL throttling |
| `/proc/cpufreq/cpufreq_cci_mode` | CCI mode |
| `/proc/cpufreq/cpufreq_power_mode` | Power mode (3=perf) |

### MediaTek GPU
| Path | Action |
|------|--------|
| `/proc/gpufreq/gpufreq_opp_freq` | Fix GPU OPP freq |
| `/proc/gpufreqv2/fix_target_opp_index` | Fix GPU OPP index |
| `/proc/gpufreq/gpufreq_power_limited` | Disable battery/thermal limits |

### Qualcomm (KGSL + CPU DCVS)
| Path | Action |
|------|--------|
| `/sys/class/kgsl/kgsl-3d0/max_pwrlevel` | GPU max power level |
| `/sys/class/kgsl/kgsl-3d0/min_pwrlevel` | GPU min power level |
| `/sys/class/kgsl/kgsl-3d0/num_pwrlevels` | Read power levels count |
| `/sys/class/kgsl/kgsl-3d0/gpuclk` | GPU clock |
| `/sys/class/kgsl/kgsl-3d0/force_clk_on` | Force clock on |
| `/sys/class/kgsl/kgsl-3d0/force_bus_on` | Force bus on |
| `/sys/class/kgsl/kgsl-3d0/force_rail_on` | Force rail on |
| `/sys/class/kgsl/kgsl-3d0/force_no_nap` | Force no nap |
| `/sys/devices/system/cpu/cpu*/core_ctrl/cpudcvs_disable` | Disable CPU DCVS |

### Devfreq (Generic)
| Path | Action |
|------|--------|
| `/sys/class/devfreq/*/available_frequencies` | List freqs |
| `/sys/class/devfreq/*/max_freq` | Lock max |
| `/sys/class/devfreq/*/min_freq` | Lock min |

### DRAM/DDR
| Path | Action |
|------|--------|
| `/sys/kernel/helio-dvfsrc/dvfsrc_force_vcore_dvfs_opp` | Force vcore OPP |
| `/sys/devices/platform/*.dvfsrc/helio-dvfsrc/dvfsrc_req_ddr_opp` | DDR OPP request |

### Scheduler & Stune
| Path | Action |
|------|--------|
| `/sys/kernel/debug/sched_features` | NEXT_BUDDY, NO_TTWU_QUEUE |
| `/dev/stune/top-app/schedtune.prefer_idle` | Prefer idle CPU |
| `/dev/stune/top-app/schedtune.boost` | Boost top-app |
| `/proc/sys/kernel/sched_lib_name` | Game library names |
| `/proc/sys/kernel/split_lock_mitigate` | Split lock (0=disable) |

### I/O
| Path | Action |
|------|--------|
| `/sys/block/mmcblk*/queue/read_ahead_kb` | Read-ahead (perf=32, bal=128) |
| `/sys/block/mmcblk*/queue/nr_requests` | Max I/O requests |

### Power & Thermal
| Path | Action |
|------|--------|
| `/sys/kernel/eara_thermal/enable` | Disable eara thermal |
| `/sys/class/thermal/thermal_zone*/policy` | Set step_wise governor |

### Other
| Path | Action |
|------|--------|
| `/proc/sys/vm/vfs_cache_pressure` | Perf=80, Bal=120 |
| `/proc/sys/vm/drop_caches` | Drop caches (3) |
| `/sys/kernel/fpsgo/common/force_onoff` | Disable FPSGO |

---

## Key Patterns

1. **Profile-based** — All tweaks organized by profile (performance/balance/powersave)
2. **SoC-aware** — 7 chipset families with per-SoC functions
3. **Device mitigation** — Skip specific sysfs nodes per device model
4. **inotify watch** — Hot-reload config/gamelist without restart
5. **3-strike game detection** — Debounce foreground app detection
6. **env var passing** — Native daemon sets ENCORE_* vars, shell reads them
7. **pidfd_open** — Modern PID death detection (Linux 5.3+), fallback to kill()
