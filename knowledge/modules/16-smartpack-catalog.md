# Module 16: SmartPack-Kernel-Manager — Sysfs Catalog

**Source:** `SmartPack-Kernel-Manager/` (Java battle-tested kernel manager)
**Status:** ✅ VERIFIED — CPUFreq.java paths + Control.java write chain confirmed

## Architecture

Java app with centralized "Write Chain" pattern for all sysfs writes.

```
UI → Module.setXxx()
  → Control.write(value, path)       → "echo 'value' > /path"
  → Control.runSetting(cmd, cat, id) → save to settings.json for apply-on-boot
  → RootUtils.runCommand(cmd)        → execute via libsu Shell
```

---

## Write Chain Pattern

```java
// Core path: Module → Control → Settings DB → Shell
Control.write("1", "/sys/class/kgsl/kgsl-3d0/force_clk_on");
  // returns: "echo '1' > /sys/class/kgsl/kgsl-3d0/force_clk_on"

Control.runSetting(cmd, ApplyOnBootFragment.CPU, id, context);
  // 1) Settings.putSetting(category, command, id) — persist to JSON
  // 2) RootUtils.runCommand(cmd) — execute NOW via libsu

// chmod pattern for write protection:
// For each CPU core:
//   Control.chmod("644", path_i)    → unlock
//   Control.write(value, path_i)    → write value
//   Control.chmod("444", path_i)    → re-lock
```

---

## Complete Sysfs Catalog

### CPU Frequency
| Path | Purpose |
|------|---------|
| `/sys/devices/system/cpu/present` | CPU count |
| `/sys/devices/system/cpu/cpu%d/cpufreq/scaling_cur_freq` | Current freq |
| `/sys/devices/system/cpu/cpu%d/cpufreq/scaling_available_frequencies` | Available freqs |
| `/sys/devices/system/cpu/cpu%d/cpufreq/scaling_max_freq` | Max limit |
| `/sys/devices/system/cpu/cpu%d/cpufreq/scaling_min_freq` | Min limit |
| `/sys/devices/system/cpu/cpu%d/cpufreq/scaling_governor` | Governor |
| `/sys/devices/system/cpu/cpu%d/cpufreq/scaling_available_governors` | Available governors |
| `/sys/devices/system/cpu/cpu%d/online` | Online/offline |
| `/sys/devices/system/cpu/cpu%d/cpufreq/stats/time_in_state` | Time in freq state |
| `/sys/devices/system/cpu/cpufreq/policy*/scaling_max_freq` | Policy max |
| `/sys/kernel/cpufreq_hardlimit/scaling_max_freq` | Hard limit max |
| `/sys/kernel/cpufreq_hardlimit/scaling_min_freq` | Hard limit min |
| `/sys/kernel/msm_cpufreq_limit/cpufreq_limit` | MSM limit |

### CPU Temperature
| Path | ÷ | Notes |
|------|---|-------|
| `/sys/class/thermal/thermal_zone0/temp` | 1000 | Generic |
| `/proc/mtktscpu/mtktscpu_temperature` | 1000 | MediaTek |

### CPU Hotplug (12+ drivers)
| Driver | Base Path |
|--------|-----------|
| CoreCtl | `/sys/devices/system/cpu/cpu%d/core_ctl/min_cpus` |
| MPDecision | prop-based service |
| MSMHotplug | `/sys/module/msm_hotplug/parameters/` |
| IntelliPlug | `/sys/devices/virtual/misc/intelliplug/` |
| AlucardHotplug | `/sys/kernel/alucard_hotplug/` |
| Adrenoboost | `/sys/module/adrenoboost/parameters/` |
| AutoSMP | `/sys/module/autosmp/parameters/` |

### GPU — Qualcomm Adreno (KGSL)
| Path | Purpose |
|------|---------|
| `/sys/devices/platform/kgsl-3d0.0/kgsl/kgsl-3d0/gpuclk` | Current freq |
| `/sys/devices/platform/kgsl-3d0.0/kgsl/kgsl-3d0/max_gpuclk` | Max freq |
| `/sys/devices/platform/kgsl-3d0.0/kgsl/kgsl-3d0/gpu_available_frequencies` | Available freqs |
| `/sys/class/kgsl/kgsl-3d0/gpuclk` | Current freq (devfreq) |
| `/sys/class/kgsl/kgsl-3d0/max_gpuclk` | Max freq (devfreq) |
| `/sys/class/kgsl/kgsl-3d0/devfreq/min_freq` | Min freq |
| `/sys/class/kgsl/kgsl-3d0/devfreq/governor` | GPU governor |
| `/sys/class/kgsl/kgsl-3d0/gpubusy` | Busy % |
| `/sys/class/kgsl/kgsl-3d0/max_pwrlevel` | Max power level |
| `/sys/class/kgsl/kgsl-3d0/min_pwrlevel` | Min power level |
| `/sys/class/kgsl/kgsl-3d0/num_pwrlevels` | Power levels count |
| `/sys/class/kgsl/kgsl-3d0/force_no_nap` | Force no nap |
| `/sys/class/kgsl/kgsl-3d0/force_bus_on` | Force bus on |
| `/sys/class/kgsl/kgsl-3d0/force_rail_on` | Force rail on |
| `/sys/class/kgsl/kgsl-3d0/force_clk_on` | Force clock on |
| `/sys/class/kgsl/kgsl-3d0/bus_split` | Bus split |
| `/sys/class/kgsl/kgsl-3d0/throttling` | Throttling |
| `/sys/class/kgsl/kgsl-3d0/idle_timer` | Idle timer |

### GPU — Other Vendors
| GPU | Path Base |
|-----|-----------|
| **TI OMAP SGX** | `/sys/devices/platform/omap/pvrsrvkm.0/sgxfreq/` |
| **NVIDIA Tegra** | `/sys/kernel/tegra_gpu/gpu_rate` |
| **PowerVR** | `/sys/devices/platform/dfrgx/devfreq/dfrgx/` |
| **Mali** | `/sys/class/misc/mali0/device/` |

**GPU freq offset:** KGSL/OMAP/Tegra ÷1000000 (Hz→MHz), PowerVR ÷1000 (kHz→MHz)

### AdrenoIdler
| Path | Purpose |
|------|---------|
| `/sys/module/adreno_idler/parameters/adreno_idler_active` | Toggle |
| `/sys/module/adreno_idler/parameters/adreno_idler_idleworkload` | Idle workload |
| `/sys/module/adreno_idler/parameters/adreno_idler_downdifferential` | Down diff |

### Thermal
| Path | Notes |
|------|-------|
| `/sys/class/thermal/thermal_zone%d/temp` | Generic zone temp |
| `/sys/class/thermal/thermal_message/sconfig` | Xiaomi thermal config |
| `/sys/module/msm_thermal/parameters/enabled` | MSM thermal toggle |
| `/sys/kernel/msm_thermal/enabled` | MSM thermal (alt) |
| `/sys/module/msm_thermal_v2/parameters/enabled` | MSM thermal v2 |
| `/sys/module/simple_msm_thermal/parameters/enabled` | Simple msm thermal |

### Battery (Fast Charge)
| Path | Purpose |
|------|---------|
| `/sys/class/power_supply/battery/current_max` | Charge current |
| `/sys/class/power_supply/battery/constant_charge_current_max` | Constant current |
| `/sys/class/power_supply/battery/input_suspend` | Input suspend |
| `/sys/class/power_supply/usb/current_max` | USB current |
| `/sys/class/power_supply/usb/input_current_max` | USB input current |
| `/sys/kernel/fast_charge/force_fast_charge` | Force fast charge |
| `/sys/kernel/fast_charge/fcp_charge_voltage_max` | FCP voltage |

### VM
| Path | Purpose |
|------|---------|
| `/proc/sys/vm/swappiness` | Swappiness |
| `/proc/sys/vm/dirty_ratio` | Dirty ratio |
| `/proc/sys/vm/dirty_background_ratio` | Dirty bg ratio |
| `/proc/sys/vm/vfs_cache_pressure` | Cache pressure |
| `/proc/sys/vm/min_free_kbytes` | Min free |
| `/proc/sys/vm/overcommit_ratio` | Overcommit |
| `/sys/block/zram0/disksize` | ZRAM size |
| `/sys/block/zram0/comp_algorithm` | ZRAM algorithm |

### I/O Scheduler
| Path | Purpose |
|------|---------|
| `/sys/block/*/queue/scheduler` | I/O scheduler |
| `/sys/block/*/queue/read_ahead_kb` | Read-ahead |
| `/sys/block/*/queue/nr_requests` | Max requests |
| `/sys/block/*/queue/iostats` | I/O stats toggle |

### Screen / Display
| Path | Purpose |
|------|---------|
| `/sys/devices/virtual/graphics/fb0/modes` | Resolution modes |
| `/sys/devices/virtual/misc/backlightdimmer/dim_ratio` | Backlight dimmer |
| `/sys/devices/platform/kcal_ctrl.0/kcal` | KCAL color |
| `/sys/devices/virtual/misc/backlightdimmer/enabled` | Dimmer toggle |

### Wake Controls
| Path | Purpose |
|------|---------|
| `/sys/touchpanel/double_tap` | DT2W |
| `/sys/android_touch/sweep2wake` | S2W |
| `/sys/android_touch/tap2wake` | T2W |

### Sound
| Path | Purpose |
|------|---------|
| `/sys/kernel/sound_control_3/speaker_boost` | Speaker boost |
| `/sys/kernel/sound_control_3/gain_control` | Headphone gain |
| `/sys/kernel/sound_control_3/mic_boost` | Mic boost |

---

## Apply-on-Boot System

All settings persisted to JSON file, replayed at boot:
- `Settings.java` — JSON-file DB with (category, command, id) tuples
- `ApplyOnBoot.java` — reads DB, replays commands
- `OnBootReceiver.java` — BOOT_COMPLETED trigger

**Boot persistence categories:**
CPU, GPU, CPU Boost, CPU Hotplug, Thermal, Battery, VM, IO, Screen, Wake, Sound, KSM, LMK, Entropy, Misc
