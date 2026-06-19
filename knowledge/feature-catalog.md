# Feature Catalog — Kernel Manager untuk POCO X3 NFC

Berdasarkan Phase 2 study dari 11 source repositori. Organized by kategori fitur. Setiap fitur mencakup: source, sysfs/procfs path, root requirement, complexity.

---

## 1. CPU Frequency & Governor

### 1.1 Read/Write Governor
| Fitur | Source | Sysfs Path | Root | Complexity |
|-------|--------|------------|------|------------|
| Read current governor | Xtra-Kernel, SmartPack, Encore | `/sys/devices/system/cpu/cpu{N}/cpufreq/scaling_governor` | Ya | Rendah |
| Set governor | SmartPack, Encore | Echo ke path di atas | Ya | Rendah |
| List available governors | Xtra-Kernel | `/sys/devices/system/cpu/cpu{N}/cpufreq/scaling_available_governors` | Tidak | Rendah |
| Read scaling max freq | Xtra-Kernel | `/sys/devices/system/cpu/cpu{N}/cpufreq/scaling_max_freq` | Tidak | Rendah |
| Read scaling min freq | Xtra-Kernel | `/sys/devices/system/cpu/cpu{N}/cpufreq/scaling_min_freq` | Tidak | Rendah |
| Read cpuinfo max (hardware limit) | SmartPack | `/sys/devices/system/cpu/cpu{N}/cpufreq/cpuinfo_max_freq` | Tidak | Rendah |
| Read cpuinfo min | SmartPack | `/sys/devices/system/cpu/cpu{N}/cpufreq/cpuinfo_min_freq` | Tidak | Rendah |
| Read current freq | Xtra-Kernel | `/sys/devices/system/cpu/cpu{N}/cpufreq/scaling_cur_freq` | Tidak | Rendah |
| Read time in state | SmartPack | `/sys/devices/system/cpu/cpu{N}/cpufreq/stats/time_in_state` | Tidak | Rendah |
| Read OPP table | SmartPack | `/sys/devices/system/cpu/cpu{N}/opp_table` | Tidak | Rendah |

### 1.2 Frequency Limiting
| Fitur | Source | Sysfs Path | Root | Complexity |
|-------|--------|------------|------|------------|
| Set max freq limit | Xtra-Kernel, CPUControlUseCase | `scaling_max_freq` (per policy) | Ya | Rendah |
| Set min freq limit | Xtra-Kernel, CPUControlUseCase | `scaling_min_freq` (per policy) | Ya | Rendah |
| Screen-off max freq | SmartPack | `/sys/devices/system/cpu/cpu{N}/cpufreq/screen_off_max_freq` | Ya | Rendah |
| Freq lock (min=max) | Xtra-Kernel (CPUControlUseCase) | min=max = target | Ya | Sedang |
| Freq lock verification | Xtra-Kernel | Poll 10× 300ms, tolerance ±50MHz | Ya | Sedang |
| Hard limit max | SmartPack | `/sys/kernel/cpufreq_hardlimit/scaling_max_freq` | Ya | Rendah |
| Hard limit min | SmartPack | `/sys/kernel/cpufreq_hardlimit/scaling_min_freq` | Ya | Rendah |
| MSM cpufreq limit | SmartPack, Encore | `/sys/kernel/msm_cpufreq_limit/cpufreq_limit` | Ya | Rendah |

### 1.3 Cluster Detection
| Fitur | Source | Method | Root | Complexity |
|-------|--------|--------|------|------------|
| Group by min/max freq | Xtra-Kernel (Rust) | Loop cpu 0..15, group by (min_freq, max_freq) pair | Tidak | Sedang |
| Group by cpuinfo_max_freq | Xtra-Kernel (Kotlin fallback) | `cat cpuinfo_max_freq` per core → group by | Ya | Sedang |
| Dynamic sysfs probing | RvKernel | `Utils.testFile()` → hide/show UI | Tidak | Rendah |
| Parallel detection | Xtra-Kernel (CPUControlUseCase) | `coroutineScope { cores.map { async { ... } } }` | Ya | Sedang |

### 1.4 CPU Hotplug
| Fitur | Source | Sysfs Path | Root | Complexity |
|-------|--------|------------|------|------------|
| Core online/offline | Xtra-Kernel | `/sys/devices/system/cpu/cpu{N}/online` | Ya | Rendah |
| CoreCtl min cpus | SmartPack | `/sys/devices/system/cpu/cpu{N}/core_ctl/min_cpus` | Ya | Rendah |
| MSM Hotplug | SmartPack | `/sys/module/msm_hotplug/parameters/` | Ya | Rendah |
| IntelliPlug | SmartPack | `/sys/devices/virtual/misc/intelliplug/` | Ya | Rendah |
| AlucardHotplug | SmartPack | `/sys/kernel/alucard_hotplug/` | Ya | Rendah |
| AutoSMP | SmartPack | `/sys/module/autosmp/parameters/` | Ya | Rendah |

### 1.5 CPU Boost
| Fitur | Source | Sysfs Path | Root | Complexity |
|-------|--------|------------|------|------------|
| Input boost ms | SmartPack, RvKernel | `/sys/devices/system/cpu/cpu_boost/input_boost_ms` | Ya | Rendah |
| Sched boost on input | RvKernel | `/sys/devices/system/cpu/cpu_boost/sched_boost_on_input` | Ya | Rendah |

---

## 2. GPU Control

### 2.1 GPU Frequency
| Fitur | Source | Sysfs Path | Root | Complexity |
|-------|--------|------------|------|------------|
| Read current freq | Xtra-Kernel, ZKM | `/sys/class/kgsl/kgsl-3d0/gpuclk` | Tidak | Rendah |
| Read available freqs | Xtra-Kernel, ZKM | `/sys/class/kgsl/kgsl-3d0/gpu_available_frequencies` | Tidak | Rendah |
| Set max freq | Xtra-Kernel (GPUControlUseCase) | `/sys/class/kgsl/kgsl-3d0/max_gpuclk` | Ya | Rendah |
| Set min freq | Xtra-Kernel (GPUControlUseCase) | `/sys/class/kgsl/kgsl-3d0/devfreq/min_freq` | Ya | Rendah |
| GPU freq lock | Xtra-Kernel (GPUControlUseCase) | Lock + disable throttling | Ya | Sedang |
| Devfreq governor | ZKM, SmartPack | `/sys/class/kgsl/kgsl-3d0/devfreq/governor` | Ya | Rendah |
| Devfreq boost | SmartPack | `/sys/class/devfreq/*/boost` | Ya | Rendah |

### 2.2 GPU Power Levels
| Fitur | Source | Sysfs Path | Root | Complexity |
|-------|--------|------------|------|------------|
| Read num power levels | SmartPack, Encore | `/sys/class/kgsl/kgsl-3d0/num_pwrlevels` | Tidak | Rendah |
| Read default power level | SmartPack | `/sys/class/kgsl/kgsl-3d0/default_pwrlevel` | Tidak | Rendah |
| Set max power level | Encore, ZKM | `/sys/class/kgsl/kgsl-3d0/max_pwrlevel` (lower = higher perf) | Ya | Rendah |
| Set min power level | Encore, ZKM | `/sys/class/kgsl/kgsl-3d0/min_pwrlevel` | Ya | Rendah |
| GPU force clk on | Encore, Xtra-Kernel | `/sys/class/kgsl/kgsl-3d0/force_clk_on` (0/1) | Ya | Rendah |
| GPU force bus on | Encore, Xtra-Kernel | `/sys/class/kgsl/kgsl-3d0/force_bus_on` (0/1) | Ya | Rendah |
| GPU force rail on | Encore | `/sys/class/kgsl/kgsl-3d0/force_rail_on` (0/1) | Ya | Rendah |
| GPU force no nap | Encore | `/sys/class/kgsl/kgsl-3d0/force_no_nap` (0/1) | Ya | Rendah |
| GPU bus split | Encore | `/sys/class/kgsl/kgsl-3d0/bus_split` (0/1) | Ya | Rendah |
| GPU throttling toggle | ZKM, Encore | `/sys/class/kgsl/kgsl-3d0/throttling` (0/1) | Ya | Rendah |
| GPU idle timer | Encore | `/sys/class/kgsl/kgsl-3d0/idle_timer` | Ya | Rendah |

### 2.3 GPU Busy & Temp
| Fitur | Source | Sysfs Path | Root | Complexity |
|-------|--------|------------|------|------------|
| GPU busy percentage | Xtra-Kernel, ZKM | `/sys/class/kgsl/kgsl-3d0/gpubusy` (delta) | Tidak | Rendah |
| GPU busy % fallback | Xtra-Kernel (KernelRepository) | `/sys/class/kgsl/kgsl-3d0/gpu_busy_percentage` | Tidak | Rendah |
| GPU temperature | Xtra-Kernel (GPUControlUseCase) | Thermal zone with "gpu"/"kgsl"/"adreno" | Tidak | Rendah |

### 2.4 Adreno-Specific
| Fitur | Source | Sysfs Path | Root | Complexity |
|-------|--------|------------|------|------------|
| Adreno boost | ZKM, SmartPack | `/sys/class/kgsl/kgsl-3d0/devfreq/adrenoboost` | Ya | Rendah |
| Adreno Idler toggle | ZKM, SmartPack | `/sys/module/adreno_idler/parameters/adreno_idler_active` | Ya | Rendah |
| Idler idlewait | ZKM | `/sys/module/adreno_idler/parameters/adreno_idler_idlewait` | Ya | Rendah |
| Idler downdifferential | ZKM | `/sys/module/adreno_idler/parameters/adreno_idler_downdifferential` | Ya | Rendah |
| Idler idleworkload | ZKM | `/sys/module/adreno_idler/parameters/adreno_idler_idleworkload` | Ya | Rendah |
| Simple GPU algorithm | ZKM | `/sys/module/simple_gpu_algorithm/parameters/*` | Ya | Rendah |
| Adrenoboost | Encore | `/sys/module/adrenoboost/parameters/` | Ya | Rendah |

### 2.5 Bus DCVS (Dynamic Voltage & Clock Scaling)
| Fitur | Source | Sysfs Path | Root | Complexity |
|-------|--------|------------|------|------------|
| List bus components | ZKM (AdrenoUtils) | `/sys/devices/system/cpu/bus_dcvs/` subdirs | Tidak | Rendah |
| Read bus freq | ZKM | `bus_dcvs/{busName}/available_frequencies` | Tidak | Rendah |
| Set bus freq | ZKM | `bus_dcvs/{busName}/max_freq` + `min_freq` | Ya | Sedang |
| Bus monitor | ZKM | `/sys/class/devfreq/kgsl-busmon/*` | Tidak | Rendah |

### 2.6 GPU Multi-Vendor Detection
| Fitur | Source | Method | Root | Complexity |
|-------|--------|--------|------|------------|
| KGSL detection | Xtra-Kernel (Rust) | `file_exists("/sys/class/kgsl/kgsl-3d0/gpuclk")` | Tidak | Rendah |
| Adreno model | Xtra-Kernel (Rust) | `gpu_model` or `devfreq/gpu_model` | Tidak | Rendah |
| Mali detection | Xtra-Kernel (Rust), ZKM | `/sys/class/misc/mali0/device/gpuinfo` | Tidak | Rendah |
| SurfaceFlinger fallback | Xtra-Kernel (GPUControlUseCase) | `dumpsys SurfaceFlinger | grep GLES` | Tidak | Sedang |
| ro.hardware.vulkan probe | Xtra-Kernel (Rust) | System property | Tidak | Rendah |

---

## 3. Memory & ZRAM

### 3.1 Memory Info
| Fitur | Source | Method | Root | Complexity |
|-------|--------|--------|------|------------|
| Read MemTotal | Xtra-Kernel | `/proc/meminfo` → parse | Tidak | Rendah |
| Read MemAvailable | Xtra-Kernel | `/proc/meminfo` → parse | Tidak | Rendah |
| Read Swap info | Xtra-Kernel | `/proc/meminfo` → SwapTotal/SwapFree | Tidak | Rendah |
| Read memory pressure | Xtra-Kernel | `used/total * 100` | Tidak | Rendah |

### 3.2 ZRAM
| Fitur | Source | Sysfs Path | Root | Complexity |
|-------|--------|------------|------|------------|
| Read zram disksize | Xtra-Kernel, RvKernel | `/sys/block/zram0/disksize` | Tidak | Rendah |
| Read zram stats | Xtra-Kernel (Rust) | `/sys/block/zram0/mm_stat` | Tidak | Rendah |
| Compression ratio | Xtra-Kernel (Rust) | `orig_data_size / compr_data_size` | Tidak | Rendah |
| Read current algorithm | Xtra-Kernel (Rust) | `/sys/block/zram0/comp_algorithm` → parse `[lz4]` | Tidak | Rendah |
| List available algorithms | Xtra-Kernel (Rust) | `/sys/block/zram0/comp_algorithm` → split | Tidak | Rendah |
| Set zram algorithm | Xtra-Kernel (RAMControlUseCase) | Echo ke comp_algorithm | Ya | Sedang |
| Set zram disksize | Xtra-Kernel (RAMControlUseCase) | `swapoff` → `disksize=0` → set → `mkswap` → `swapon` | Ya | Tinggi |

### 3.3 VM Parameters
| Fitur | Source | Sysfs Path | Root | Complexity |
|-------|--------|------------|------|------------|
| Read/write swappiness | Xtra-Kernel, RvKernel | `/proc/sys/vm/swappiness` (0-200) | Ya | Rendah |
| Read/write dirty_ratio | Xtra-Kernel | `/proc/sys/vm/dirty_ratio` | Ya | Rendah |
| Read/write vfs_cache_pressure | Encore, SmartPack | `/proc/sys/vm/vfs_cache_pressure` | Ya | Rendah |
| Read/write min_free_kbytes | Xtra-Kernel (RAMControlUseCase) | `/proc/sys/vm/min_free_kbytes` | Ya | Rendah |
| Drop caches | Encore, Xtra-Kernel (GameControlUseCase) | `echo 3 > /proc/sys/vm/drop_caches` | Ya | Rendah |

---

## 4. Thermal Management

### 4.1 Thermal Zones
| Fitur | Source | Sysfs Path | Root | Complexity |
|-------|--------|------------|------|------------|
| Read all thermal zones | Xtra-Kernel (Rust) | `/sys/class/thermal/thermal_zone{N}/temp` | Tidak | Rendah |
| Zone auto-detect (CPU) | Xtra-Kernel (Rust) | Scan zones 0..9, match "cpu"/"tsens"/"pa" | Tidak | Rendah |
| Zone auto-detect (GPU) | Xtra-Kernel (KernelRepository) | Scan zones 0..99, match "gpu"/"adreno"/"kgsl" | Tidak | Rendah |
| Read CPU temperature | Xtra-Kernel | Primary thermal zone | Tidak | Rendah |

### 4.2 Thermal Profiles
| Fitur | Source | Sysfs Path | Root | Complexity |
|-------|--------|------------|------|------------|
| Xiaomi sconfig | Xtra-Kernel (ThermalControlUseCase) | `/sys/class/thermal/thermal_message/sconfig` | Ya | Rendah |
| MSM thermal toggle | SmartPack | `/sys/module/msm_thermal/parameters/enabled` | Ya | Rendah |
| MSM thermal v2 | SmartPack | `/sys/module/msm_thermal_v2/parameters/enabled` | Ya | Rendah |
| Simple MSM thermal | SmartPack | `/sys/module/simple_msm_thermal/parameters/enabled` | Ya | Rendah |
| EARA thermal disable | Encore, ZKM, AZenith | `/sys/kernel/eara_thermal/enable` | Ya | Rendah |

### 4.3 Thermal Presets
| Fitur | Source | Class | Root | Complexity |
|-------|--------|-------|------|------------|
| Preset: Class 0 (Default) | Xtra-Kernel | `sconfig=11` | Ya | Rendah |
| Preset: Extreme | Xtra-Kernel | `sconfig=2` (max performance) | Ya | Rendah |
| Preset: Dynamic | Xtra-Kernel | `sconfig=10` | Ya | Rendah |
| Preset: Incalls | Xtra-Kernel | `sconfig=8` | Ya | Rendah |
| Preset: Thermal 20 | Xtra-Kernel | `sconfig=20` (cool) | Ya | Rendah |

---

## 5. Power & Battery

### 5.1 Battery Status
| Fitur | Source | Sysfs Path | Root | Complexity |
|-------|--------|------------|------|------------|
| Battery level | Xtra-Kernel (Rust, persistent FD) | `/sys/class/power_supply/battery/capacity` | Tidak | Rendah |
| Battery temp | Xtra-Kernel (Rust, persistent FD) | `/sys/class/power_supply/battery/temp` (deci°C) | Tidak | Rendah |
| Battery voltage | Xtra-Kernel (Rust, persistent FD) | `/sys/class/power_supply/battery/voltage_now` (µV) | Tidak | Rendah |
| Battery current | Xtra-Kernel (Rust, persistent FD) | `/sys/class/power_supply/battery/current_now` (µA/mA) | Tidak | Rendah |
| Charging status | Xtra-Kernel (Rust) | `status` → contains "Charging" | Tidak | Rendah |
| Battery health | Xtra-Kernel (Rust) | `/sys/class/power_supply/battery/health` | Tidak | Rendah |
| Cycle count | Xtra-Kernel (Rust) | `/sys/class/power_supply/{bms,battery,bat}/cycle_count` | Tidak | Rendah |
| Capacity level (health %) | Xtra-Kernel (Rust) | `charge_full / charge_full_design * 100` | Tidak | Rendah |

### 5.2 Charging Control
| Fitur | Source | Sysfs Path | Root | Complexity |
|-------|--------|------------|------|------------|
| Charge current max | SmartPack, AZenith | `/sys/class/power_supply/battery/constant_charge_current_max` | Ya | Rendah |
| USB current max | SmartPack | `/sys/class/power_supply/usb/current_max` | Ya | Rendah |
| Bypass charging | AZenith | Auto-discovery: 60+ nodes, measure 10s | Ya | Tinggi |
| Bypass (Qualcomm) | AZenith, Xtra-Kernel (FunctionalRom) | `/sys/class/power_supply/battery/input_suspend` | Ya | Rendah |
| Bypass (qcom-battery) | AZenith | `/sys/class/qcom-battery/bypass_charging_enable` | Ya | Rendah |
| Charging limit | Xtra-Kernel (FunctionalRom) | `/sys/class/power_supply/battery/charge_control_limit` | Ya | Rendah |

### 5.3 Power Stats
| Fitur | Source | Path | Root | Complexity |
|-------|--------|------|------|------------|
| Wakeup count | Xtra-Kernel (Rust) | `/sys/power/wakeup_count` | Tidak | Rendah |
| Suspend count | Xtra-Kernel (Rust) | `/sys/kernel/debug/suspend_stats/success` | Tidak | Rendah |

---

## 6. I/O Scheduler

| Fitur | Source | Sysfs Path | Root | Complexity |
|-------|--------|------------|------|------------|
| List I/O schedulers | SmartPack, RvKernel | `/sys/block/{sda,mmcblk0}/queue/scheduler` | Tidak | Rendah |
| Set I/O scheduler | SmartPack, RvKernel | Echo ke scheduler | Ya | Rendah |
| Read-ahead kb | Encore, SmartPack | `/sys/block/{sda,mmcblk0}/queue/read_ahead_kb` | Ya | Rendah |
| NR requests | Encore, SmartPack | `/sys/block/{sda,mmcblk0}/queue/nr_requests` | Ya | Rendah |
| I/O stats toggle | SmartPack | `/sys/block/{sda,mmcblk0}/queue/iostats` | Ya | Rendah |

---

## 7. Scheduler & CPU Tuning

| Fitur | Source | Sysfs Path | Root | Complexity |
|-------|--------|------------|------|------------|
| Sched features | Encore | `/sys/kernel/debug/sched_features` (NEXT_BUDDY, NO_TTWU_QUEUE) | Ya | Sedang |
| Schedtune prefer_idle | Encore | `/dev/stune/top-app/schedtune.prefer_idle` | Ya | Rendah |
| Schedtune boost | Encore | `/dev/stune/top-app/schedtune.boost` | Ya | Rendah |
| Sched lib name | Encore | `/proc/sys/kernel/sched_lib_name` | Ya | Rendah |
| Sched lib mask force | Encore | `/proc/sys/kernel/sched_lib_mask_force` | Ya | Rendah |
| Split lock mitigate | Encore | `/proc/sys/kernel/split_lock_mitigate` | Ya | Rendah |
| BORE scheduler | RvKernel | `/proc/sys/kernel/sched_bore` / `sched_burst_*` | Ya | Sedang |
| uclamp settings | RvKernel | `/proc/sys/kernel/sched_util_clamp_{min,max,min_rt_default}` | Ya | Sedang |
| Sched autogroup | RvKernel | `/proc/sys/kernel/sched_autogroup_enabled` | Ya | Rendah |
| CPU EAS enable | AZenith | `/sys/devices/system/cpu/eas/enable` | Ya | Rendah |
| CPU DCVS disable | Encore | `/sys/devices/system/cpu/cpu{N}/core_ctrl/cpudcvs_disable` | Ya | Rendah |

---

## 8. Network

| Fitur | Source | Sysfs Path | Root | Complexity |
|-------|--------|------------|------|------------|
| TCP congestion control | RvKernel, Xtra-Kernel | `/proc/sys/net/ipv4/tcp_congestion_control` | Ya | Rendah |
| Available congestion algorithms | RvKernel | `/proc/sys/net/ipv4/tcp_available_congestion_control` | Tidak | Rendah |
| WireGuard version | RvKernel | `/sys/module/wireguard/version` | Tidak | Rendah |

---

## 9. Display

| Fitur | Source | Method | Root | Complexity |
|-------|--------|--------|------|------------|
| Refresh rate control | AZenith, Xtra-Kernel (FunctionalRom) | `settings put system peak_refresh_rate {hz}` | Ya | Rendah |
| Brightness unlock | Xtra-Kernel (FunctionalRom) | `/sys/class/backlight/*/max_brightness` (4095=1000nits) | Ya | Rendah |
| KCAL color control | SmartPack | `/sys/devices/platform/kcal_ctrl.0/kcal` | Ya | Rendah |
| Backlight dimmer | SmartPack | `/sys/devices/virtual/misc/backlightdimmer/*` | Ya | Rendah |
| DPI override | DPIS | Per-app via Xposed hooks | Ya (Xposed) | Tinggi |
| Font scaling | DPIS | Per-app via DisplayMetrics hooks | Ya (Xposed) | Tinggi |

---

## 10. Gaming Features

| Fitur | Source | Method | Root | Complexity |
|-------|--------|--------|------|------------|
| Foreground app detection | AZenith, Encore | `dumpsys window displays` parse OR `IActivityTaskManager` | Tidak | Sedang |
| Game list management | Encore | JSON gamelist `azenithApplist.json` | Tidak | Rendah |
| Per-game profiles | AZenith, Encore | perf_lite_mode, DND, renderer, refresh_rate | Ya | Sedang |
| DND on gaming | AZenith, Xtra-Kernel (GameControlUseCase) | `settings put global heads_up_notifications_enabled 0` | Ya | Rendah |
| Monster Mode (max perf) | Xtra-Kernel (GameControlUseCase) | CPU max + GPU force + RAM clear | Ya | Tinggi |
| Game Boost | Xtra-Kernel (GameControlUseCase) | Performance + Dynamic thermal + Monster Mode | Ya | Sedang |
| RAM clear | Xtra-Kernel (GameControlUseCase) | `sync` → `drop_caches` → `am kill-all` | Ya | Rendah |
| FPS monitor | ZKM | Overlay service | Ya | Sedang |
| Esports mode | Xtra-Kernel | DND + performance + touch | Ya | Sedang |
| GPU renderer switch | SkiaShift, AZenith | `debug.hwui.renderer` (skiavk/skiagl) | Ya (LSPosed) | Sedang |
| Game preload | AZenith | `madvise` touch game .so libs to page cache | Ya | Sedang |
| MLBB special handler | AZenith | PID tracking subprocess `:UnityKillsMe` | Ya | Rendah |

---

## 11. Spoofing & Hooks

| Fitur | Source | Method | Root | Complexity |
|-------|--------|--------|------|------------|
| Device model spoof | COPG | `env->SetStaticObjectField` on `android.os.Build` | Ya (Zygisk) | Sedang |
| CPU info spoof | COPG | `mount --bind <spoof> /proc/cpuinfo` | Ya (Zygisk) | Sedang |
| COW property spoof | COPG | `mmap(MAP_PRIVATE|MAP_FIXED)` on `/dev/__properties__` | Ya (Zygisk) | Tinggi |
| Android ID forge | COPG | Forge `Settings$Secure.sNameValueCache` in ART heap | Ya (Zygisk) | Tinggi |
| System property hook | SkiaShift | ByteHook (PLT) + ShadowHook (inline), 6 functions | Ya (LSPosed) | Tinggi |
| Display hook | DPIS | Xposed `Display.getMetrics()`, `getSize()`, etc | Ya (Xposed) | Sedang |
| Font hook | DPIS | `TextView.setTextSize()`, `Paint.setTextSize()` | Ya (Xposed) | Sedang |

---

## 12. Root & IPC

| Fitur | Source | Method | Root | Complexity |
|-------|--------|--------|------|------------|
| Root detection | Xtra-Kernel (RootManager) | `Shell.getShell().isRoot` (libsu) | Ya | Rendah |
| Shell command execution | Xtra-Kernel (RootManager) | `Shell.cmd(command).exec()` | Ya | Rendah |
| Shizuku Binder IPC | Shizuku | ContentProvider bridge → Binder delivery | ADB/Root | Tinggi |
| Shizuku BinderWrapper | Shizuku-API | Tunnel arbitrary Binder calls through privileged process | ADB/Root | Tinggi |
| UserService (daemon) | Shizuku | `app_process` spawn, runs as root/shell UID | Ya | Tinggi |
| KernelSU module install | Xtra-Kernel (RootManager) | `ksud module install` (fallback: magisk) | Ya | Rendah |

---

## 13. Kernel Parameters

| Fitur | Source | Sysfs Path | Root | Complexity |
|-------|--------|------------|------|------------|
| SELinux status | Xtra-Kernel | `getenforce` | Tidak | Rendah |
| DMESG restrict | RvKernel | `/proc/sys/kernel/dmesg_restrict` | Ya | Rendah |
| Printk level | RvKernel | `/proc/sys/kernel/printk` | Ya | Rendah |
| Kernel version | RvKernel | `/proc/version` | Tidak | Rendah |

---

## 14. Apply-on-Boot & Profiles

| Fitur | Source | Method | Root | Complexity |
|-------|--------|--------|------|------------|
| Set-on-boot per subsystem | SmartPack, Xtra-Kernel | JSON DB → replayed via BootReceiver | Ya | Sedang |
| Profile: Performance | Encore, Xtra-Kernel | Max CPU/GPU/IO, min thermal | Ya | Rendah |
| Profile: Balance | Encore, Xtra-Kernel | Default governors, moderate | Ya | Rendah |
| Profile: Powersave | Encore, Xtra-Kernel | Min freq, max thermal, power save | Ya | Rendah |
| Profile: Game/Monster | Xtra-Kernel, AZenith | Performance + DND + GPU force | Ya | Rendah |
| TOML config import/export | Xtra-Kernel (TuningViewModel) | Config → TOML file | Tidak | Rendah |
| Set-on-boot via init.d | SmartPack, Xtra-Kernel | Init script on boot | Ya | Rendah |

---

## 15. Cross-Source Comparison (POCO X3 NFC Priority)

| Komponen | Best Source | Alasan |
|----------|-------------|--------|
| Rust sysfs SDK | Xtra-Kernel | Already written, 40 JNI functions, persistent FDs |
| Kotlin JNI bridge | Xtra-Kernel | NativeLib.kt pattern — safe, nullable, try/catch |
| Sysfs catalog | SmartPack | Most comprehensive (385 files), battle-tested |
| GPU Bus DCVS | ZKM | AdrenoUtils — IPC-first, brute-force boundary setter |
| GPU power levels | Encore | 6 KGSL force params (clk/bus/rail/nap/split/throttle) |
| CPU hotplug | SmartPack | 12+ drivers supported (intelliplug, alucard, etc.) |
| Thermal management | AZenith | sconfig + EARA + daemon-based game detection |
| Bypass charging | AZenith | 60+ nodes auto-discovery |
| Game detection | AZenith + Encore | dumpsys + IActivityTaskManager + PID tracking |
| Device spoofing | COPG | Build fields + mount bind + COW properties |
| GPU renderer switch | SkiaShift | 6 hooked system property functions |
| DPI/display override | DPIS | DisplayMetrics hooks + font scaling |
| Root IPC | Shizuku | BinderWrapper tunnels arbitrary calls |
| Material 3 UI | RvKernel | Dynamic color (Monet), clean ViewModel pattern |
| Preferences | Xtra-Kernel | DataStore + SharedPrefs (Xposed cross-read) |
