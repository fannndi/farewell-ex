# Module 30: DevCheck Parameter Map — Complete Rootless Hardware Detection

**Source:** DevCheck.apk (flar2.devcheck) reverse engineering
**Status:** ✅ VERIFIED — 80+ parameters readable without root

## Architecture

DevCheck reads hardware using a **4-layer fallback chain**:

```
Layer 1: Java Android API    → always works (BatteryManager, DisplayMetrics, etc.)
Layer 2: Shell ProcessBuilder → works via Shizuku/shell context
Layer 3: sysfs direct read    → blocked on MIUI 14 (SELinux)
Layer 4: Native JNI IOCTL     → works for /dev/kgsl-3d0 (different SELinux label)
```

## Complete Parameter Map

### CPU (18 parameters)

| Parameter | DevCheck Method | KM Reads? | Root |
|-----------|----------------|-----------|------|
| Core count | `/sys/devices/system/cpu/possible` | ✅ `detect_cpu_clusters()` | none |
| Cluster topology | `cpu*/topology/core_siblings_list` | ✅ | none |
| Per-core online | `cpu*/online` | ✅ | none |
| Current freq | `cpu*/cpufreq/scaling_cur_freq` | ✅ | none |
| Min freq | `cpuinfo_min_freq` | ✅ | none |
| Max freq | `cpuinfo_max_freq` | ✅ | none |
| Governor | `scaling_governor` | ✅ | none |
| Available govs | `scaling_available_governors` | ✅ | none |
| Available freqs | `scaling_available_frequencies` | ✅ | none |
| Time in state | `cpufreq/stats/cpu*/time_in_state` | ❌ **MISSING** | none |
| CPU model | `/proc/cpuinfo` | ✅ | none |
| CPU architecture | `Build.CPU_ABI` | ❌ **MISSING** | none |
| CPU load | `/proc/stat` | ✅ (via Shizuku) | Shizuku |
| Core temperature | `thermal_zone*/temp` | ✅ | none |
| SoC name | `ro.soc.model` | ❌ **MISSING** | none |
| Input boost | `cpu_boost/input_boost_ms` | ✅ (write) | root |
| EAS enabled | `eas/enable` | ✅ (write) | root |
| CPUFreq hardlimit | `cpufreq_hardlimit/*` | ✅ (write) | root |

### GPU (18 parameters)

| Parameter | DevCheck Method | KM Reads? | Root |
|-----------|----------------|-----------|------|
| GPU model | `kgsl-3d0/gpu_model` | ✅ | none |
| GPU vendor | Hardcoded "Qualcomm" | ✅ | none |
| Current freq | `gpuclk`, `devfreq/cur_freq` | ✅ | none |
| Max freq | `max_gpuclk` | ✅ (IOCTL) | none |
| Min freq | Not read by DevCheck | ✅ (write) | root |
| GPU busy | `gpubusy` (two ints) | ✅ | none |
| Busy pct | `gpu_busy_percentage` | ✅ | none |
| Governor | `devfreq/governor` | ✅ | none |
| Available freqs | `gpu_available_frequencies` | ✅ | none |
| Available govs | `available_governors` | ✅ | none |
| Power levels | `min_pwrlevel`, `max_pwrlevel` | ✅ (write) | root |
| Force params | `force_clk_on`, etc. | ✅ (write) | root |
| Throttling | `throttling` | ✅ (write) | root |
| Adrenoboost | `adrenoboost/parameters` | ✅ | none/root |
| Bus DCVS | `bus_dcvs/*` | ✅ | none |
| GMEM size | `gmem_size` | ❌ **MISSING** | none |
| Runtime active | `power/runtime_active_time` | ❌ **MISSING** | none |
| Adreno Idler | `adreno_idler/parameters/*` | ✅ (write) | root |

### Battery (16 parameters)

| Parameter | DevCheck Method | KM Reads? | Root |
|-----------|----------------|-----------|------|
| Level | `BatteryManager` API | ✅ | none |
| Temperature | `BatteryManager` API | ✅ | none |
| Voltage | `BatteryManager` API / sysfs | ✅ | none |
| Current | `BatteryManager` API / 50+ paths | ✅ | none |
| Status | `BATTERY_CHANGED` intent | ✅ | none |
| Health | `BatteryManager` API | ✅ | none |
| Technology | `BATTERY_CHANGED` intent | ❌ **MISSING** | none |
| Max voltage | `BATTERY_CHANGED` intent | ❌ **MISSING** | none |
| Design capacity | `charge_full_design` | ✅ | none |
| Cycle count | `cycle_count` (3 paths) | ✅ | none |
| Charge full | `charge_full` | ✅ | none |
| Dual cell | `cell1_volt` + `cell2_volt` | ❌ **MISSING** | none |
| Charge current | `constant_charge_current_max` | ✅ | none/root |
| USB current | `usb/current_max` | ✅ | none/root |
| Charge control | `charge_control_limit` | ✅ | none |
| Drain rate | Calculated from deltas | ❌ **MISSING** | none |

### Thermal (8 parameters)

| Parameter | DevCheck Method | KM Reads? | Root |
|-----------|----------------|-----------|------|
| Zone temps | `thermal_zone*/temp` | ✅ | none |
| Zone types | `thermal_zone*/type` | ✅ | none |
| CPU temp | Matches "cpu"/"tsens" | ✅ | none |
| GPU die temp | Type matching | ❌ **MISSING** | none |
| MSM thermal | `msm_thermal/parameters/enabled` | ✅ (write) | root |
| sconfig | `thermal_message/sconfig` | ✅ (write) | root |
| EARA thermal | `eara_thermal/enable` | ✅ (write) | root |
| FPSGO | `fpsgo/common/fpsgo_enable` | ✅ (write) | root |

### Display (10 parameters)

| Parameter | DevCheck Method | KM Reads? | Root |
|-----------|----------------|-----------|------|
| Resolution | `DisplayMetrics` API | ❌ **MISSING** | none |
| Density | `DisplayMetrics` API | ❌ **MISSING** | none |
| Physical size | Calculated | ❌ **MISSING** | none |
| Refresh rate | `Display.getRefreshRate()` | ❌ **MISSING** | none |
| HDR support | `Display.isHdr()` | ❌ **MISSING** | none |
| Panel name | `grep ms_fb_panel_info` | ❌ **MISSING** | none |
| Backlight max | `backlight/*/max_brightness` | ✅ | none |
| KCAL | `kcal_ctrl.0/kcal` | ✅ (write) | root |
| Display mode | `fb0/mode` | ✅ (write) | root |

### Network / IO / Storage (10 parameters)

| Parameter | DevCheck Method | KM Reads? | Root |
|-----------|----------------|-----------|------|
| TCP congestion | `tcp_congestion_control` | ✅ | none |
| Kernel version | `/proc/version` | ✅ | none |
| I/O scheduler | `queue/scheduler` | ✅ | none |
| Read-ahead | `queue/read_ahead_kb` | ✅ | none |
| NR requests | `queue/nr_requests` | ✅ | none |
| Disk R/W stats | `/proc/diskstats` | ✅ | none |
| eMMC lifetime | `mmcblk0/device/life_time` | ❌ **MISSING** | none |
| Swap detection | `cat /proc/swaps` | ❌ **MISSING** | none |

### System / SoC (15 parameters)

| Parameter | DevCheck Method | KM Reads? | Root |
|-----------|----------------|-----------|------|
| SoC model | `ro.soc.model` | ❌ **MISSING** | none |
| Platform | `ro.board.platform` | ❌ **MISSING** | none |
| Manufacturer | `Build.MANUFACTURER` | ❌ **MISSING** | none |
| Model | `Build.MODEL` | ✅ (only this one) | none |
| Android version | `Build.VERSION.RELEASE` | ❌ **MISSING** | none |
| Security patch | `Build.VERSION.SECURITY_PATCH` | ❌ **MISSING** | none |
| Kernel version | `/proc/version` | ✅ | none |
| ABI list | `Build.SUPPORTED_ABIS` | ❌ **MISSING** | none |
| Fingerprint | `Build.FINGERPRINT` | ❌ **MISSING** | none |
| Bootloader | `Build.BOOTLOADER` | ❌ **MISSING** | none |
| Sensors | `SensorManager` | ❌ **MISSING** | none |
| Camera | `CameraManager` | ❌ **MISSING** | none |

## Farewell KM — Parameter Gap Priority

### HIGH priority (implement now)
1. `ro.soc.model` → SoC name
2. `DisplayMetrics` → resolution, density
3. `Display.getRefreshRate()`, `Display.isHdr()` → display
4. `grep ms_fb_panel_info` → panel name
5. `gmem_size` → GPU GMEM size
6. Battery technology, max voltage from sticky intent

### MEDIUM priority
7. `time_in_state` → CPU frequency stats
8. `power/runtime_active_time` → GPU active time
9. `cat /proc/swaps` → swap detection
10. Dual cell battery detection
11. `mmcblk0/device/life_time` → eMMC health

### LOW priority (nice to have)
12. Sensor enumeration
13. Camera characteristics
14. Network MAC/IP
15. eMMC partition map
