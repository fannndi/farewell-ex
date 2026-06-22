# Feature Catalog — Kernel Manager untuk POCO X3 NFC

> Implementasi vs 16 Source References (2,115 files dipelajari, 18 Rust module, 40+ Kt/Java)
> **Kolom Status:** ✅ = implemented | ⚠️ = partial | ❌ = missing/leftover

---

## 1. CPU Frequency & Governor

| # | Fitur | Source | Sysfs Path | Root | Status |
|---|-------|--------|------------|------|--------|
| 1 | Read current governor | Xtra-Kernel, SmartPack, Encore | `/sys/devices/system/cpu/cpu{N}/cpufreq/scaling_governor` | Ya | ✅ |
| 2 | Set governor | SmartPack, Encore | Echo ke path di atas | Ya | ✅ |
| 3 | List available governors | Xtra-Kernel | `/sys/devices/system/cpu/cpu{N}/cpufreq/scaling_available_governors` | Tidak | ✅ |
| 4 | Read scaling max freq | Xtra-Kernel | `/sys/devices/system/cpu/cpu{N}/cpufreq/scaling_max_freq` | Tidak | ✅ |
| 5 | Read scaling min freq | Xtra-Kernel | `/sys/devices/system/cpu/cpu{N}/cpufreq/scaling_min_freq` | Tidak | ✅ |
| 6 | Read cpuinfo max | SmartPack | `/sys/devices/system/cpu/cpu{N}/cpufreq/cpuinfo_max_freq` | Tidak | ✅ |
| 7 | Read current freq | Xtra-Kernel | `/sys/devices/system/cpu/cpu{N}/cpufreq/scaling_cur_freq` | Tidak | ✅ |
| 8 | Set max freq limit | Xtra-Kernel | `scaling_max_freq` | Ya | ✅ |
| 9 | Set min freq limit | Xtra-Kernel | `scaling_min_freq` | Ya | ✅ |
| 10 | Input boost ms | SmartPack, RvKernel | `/sys/devices/system/cpu/cpu_boost/input_boost_ms` | Ya | ✅ |
| 11 | Sched boost on input | RvKernel | `/sys/devices/system/cpu/cpu_boost/sched_boost_on_input` | Ya | ✅ |
| 12 | Core online/offline | Xtra-Kernel | `/sys/devices/system/cpu/cpu{N}/online` | Ya | ✅ |
| 13 | CPU EAS enable | AZenith | `/sys/devices/system/cpu/eas/enable` | Ya | ✅ |
| 14 | CPU DCVS disable | Encore | `/sys/devices/system/cpu/cpu{N}/core_ctrl/cpudcvs_disable` | Ya | ✅ |
| 15 | Hard limit max | SmartPack | `/sys/kernel/cpufreq_hardlimit/scaling_max_freq` | Ya | ✅ |
| 16 | MSM cpufreq limit | SmartPack, Encore | `/sys/kernel/msm_cpufreq_limit/cpufreq_limit` | Ya | ✅ |
| 17 | Cluster detection | Xtra-Kernel | group by (min_freq, max_freq) | Tidak | ✅ |
| 18 | Dynamic sysfs probing | RvKernel | Utils.testFile() | Tidak | ✅ |
| 19 | Screen-off max freq | SmartPack | `screen_off_max_freq` | Ya | ❌ |
| 20 | CoreCtl min cpus | SmartPack | `core_ctl/min_cpus` | Ya | ❌ |
| 21 | MSM Hotplug (12 params) | SmartPack | `/sys/module/msm_hotplug/parameters/` | Ya | ❌ |
| 22 | IntelliPlug (9 params) | SmartPack | `/sys/devices/virtual/misc/intelliplug/` | Ya | ❌ |
| 23 | AlucardHotplug (12 params) | SmartPack | `/sys/kernel/alucard_hotplug/` | Ya | ❌ |
| 24 | AutoSMP (4 params) | SmartPack | `/sys/module/autosmp/parameters/` | Ya | ❌ |
| 25 | BluPlug (6 params) | SmartPack | `/sys/module/blu_plug/parameters/` | Ya | ❌ |
| 26 | CPU time-in-state | SmartPack | `/cpufreq/stats/time_in_state` | Tidak | ⚠️ |
| 27 | CPU OPP table | SmartPack | `/cpu{N}/opp_table` | Tidak | ❌ |

**Done: 19/27 | Missing: 7 hotplug drivers + 2 stats | Partial: 1**

---

## 2. GPU Control

| # | Fitur | Source | Sysfs Path | Root | Status |
|---|-------|--------|------------|------|--------|
| 1 | Read current freq | Xtra-Kernel, ZKM | `/sys/class/kgsl/kgsl-3d0/gpuclk` | Tidak | ✅ |
| 2 | Read available freqs | Xtra-Kernel, ZKM | `gpu_available_frequencies` / `available_frequencies` | Tidak | ✅ |
| 3 | Set max freq | Xtra-Kernel | `max_gpuclk` / `devfreq/max_freq` | Ya | ✅ |
| 4 | Set min freq | Xtra-Kernel | `devfreq/min_freq` | Ya | ✅ |
| 5 | Devfreq governor | ZKM, SmartPack | `/sys/class/kgsl/kgsl-3d0/devfreq/governor` | Ya | ✅ |
| 6 | Read num power levels | SmartPack, Encore | `/sys/class/kgsl/kgsl-3d0/num_pwrlevels` | Tidak | ✅ |
| 7 | Set max power level | Encore, ZKM | `max_pwrlevel` | Ya | ✅ |
| 8 | Set min power level | Encore, ZKM | `min_pwrlevel` | Ya | ✅ |
| 9 | GPU force params (6) | Encore | `force_clk_on`, `force_bus_on`, `force_rail_on`, `force_no_nap`, `bus_split`, `throttling` | Ya | ✅ |
| 10 | GPU idle timer | Encore | `/sys/class/kgsl/kgsl-3d0/idle_timer` | Ya | ✅ |
| 11 | GPU busy percentage | Xtra-Kernel, ZKM | `/sys/class/kgsl/kgsl-3d0/gpubusy` (delta) | Tidak | ✅ |
| 12 | GPU temp (thermal zone) | Xtra-Kernel | Thermal zone "gpu"/"adreno"/"kgsl" | Tidak | ✅ |
| 13 | Adreno boost | ZKM, SmartPack | `devfreq/adrenoboost` | Ya | ❌ |
| 14 | Adreno Idler (5 params) | ZKM, SmartPack | `/sys/module/adreno_idler/parameters/*` | Ya | ✅ |
| 15 | Simple GPU (3 params) | ZKM | `/sys/module/simple_gpu_algorithm/parameters/*` | Ya | ✅ |
| 16 | Bus DCVS components | ZKM | `/sys/devices/system/cpu/bus_dcvs/` | Tidak | ✅ |
| 17 | Bus DCVS freq set | ZKM | bus_dcvs/{name}/{min,max}_freq | Ya | ✅ |
| 18 | GPU model detect | Xtra-Kernel | `gpu_model` / `devfreq/gpu_model` | Tidak | ✅ |
| 19 | GPU driver info | ZKM | `devfreq/name` | Tidak | ✅ |
| 20 | Multi-vendor: Mali | ZKM | `/sys/class/misc/mali0/device/gpuinfo` | Tidak | ❌ |
| 21 | Devfreq boost | SmartPack | `/sys/class/devfreq/*/boost` | Ya | ❌ |

**Done: 19/21 | Missing: Mali detection, devfreq boost, adreno boost**

---

## 3. Memory & ZRAM

| # | Fitur | Source | Path | Root | Status |
|---|-------|--------|------|------|--------|
| 1 | Read MemTotal | Xtra-Kernel | `/proc/meminfo` | Tidak | ✅ |
| 2 | Read MemAvailable | Xtra-Kernel | `/proc/meminfo` | Tidak | ✅ |
| 3 | Read Swap info | Xtra-Kernel | `/proc/meminfo` | Tidak | ✅ |
| 4 | Memory pressure | Xtra-Kernel | used/total * 100 | Tidak | ✅ |
| 5 | ZRAM disksize | Xtra-Kernel, RvKernel | `/sys/block/zram0/disksize` | Tidak | ✅ |
| 6 | ZRAM mm_stat (4 fields) | Xtra-Kernel | `/sys/block/zram0/mm_stat` | Tidak | ✅ |
| 7 | Compression ratio | Xtra-Kernel | orig / compr_data_size | Tidak | ✅ |
| 8 | ZRAM algorithm get | Xtra-Kernel | `/sys/block/zram0/comp_algorithm` | Tidak | ✅ |
| 9 | ZRAM algorithm set | Xtra-Kernel | comp_algorithm echo | Ya | ✅ |
| 10 | ZRAM size set | Xtra-Kernel | `swapoff` → `disksize=0` → set → `mkswap` → `swapon` | Ya | ✅ |
| 11 | Swappiness | Xtra-Kernel, RvKernel | `/proc/sys/vm/swappiness` | Ya | ✅ |
| 12 | Dirty ratio | Xtra-Kernel | `/proc/sys/vm/dirty_ratio` | Ya | ✅ |
| 13 | vfs_cache_pressure | Encore, SmartPack | `/proc/sys/vm/vfs_cache_pressure` | Ya | ✅ |
| 14 | min_free_kbytes | Xtra-Kernel | `/proc/sys/vm/min_free_kbytes` | Ya | ✅ |
| 15 | Drop caches | Encore | `echo 3 > /proc/sys/vm/drop_caches` | Ya | ✅ |
| 16 | ZSwap | SmartPack | `/sys/module/zswap/parameters/*` | Ya | ❌ |

**Done: 15/16 | Missing: ZSwap parameters**

---

## 4. Thermal Management

| # | Fitur | Source | Sysfs Path | Root | Status |
|---|-------|--------|------------|------|--------|
| 1 | Thermal zones scan | Xtra-Kernel | `thermal_zone{N}/temp` | Tidak | ✅ |
| 2 | CPU zone auto-detect | Xtra-Kernel | match "cpu"/"tsens"/"pa" | Tidak | ✅ |
| 3 | GPU zone auto-detect | Xtra-Kernel | match "gpu"/"adreno"/"kgsl" | Tidak | ✅ |
| 4 | Xiaomi sconfig | Xtra-Kernel | `/sys/class/thermal/thermal_message/sconfig` | Ya | ✅ |
| 5 | MSM thermal toggle | SmartPack | `/sys/module/msm_thermal/parameters/enabled` | Ya | ✅ |
| 6 | Simple MSM thermal | SmartPack | `/sys/module/simple_msm_thermal/parameters/enabled` | Ya | ✅ |
| 7 | EARA thermal disable | Encore, ZKM, AZenith | `/sys/kernel/eara_thermal/enable` | Ya | ✅ |
| 8 | FPSGO control | Xtra-Kernel | `/sys/kernel/fpsgo/common/*` | Ya | ✅ |
| 9 | Thermal presets (5) | Xtra-Kernel | sconfig = 2/8/10/11/20 | Ya | ✅ |
| 10 | Charge current max | SmartPack, AZenith | `/sys/class/power_supply/battery/constant_charge_current_max` | Ya | ✅ |
| 11 | USB current max | SmartPack | `/sys/class/power_supply/usb/current_max` | Ya | ❌ |

**Done: 10/11 | Missing: USB current_max**

---

## 5. Power & Battery

| # | Fitur | Source | Path | Root | Status |
|---|-------|--------|------|------|--------|
| 1 | Battery level | Xtra-Kernel | `/sys/class/power_supply/battery/capacity` | Tidak | ✅ |
| 2 | Battery temp | Xtra-Kernel | `/sys/class/power_supply/battery/temp` | Tidak | ✅ |
| 3 | Battery voltage | Xtra-Kernel | `/sys/class/power_supply/battery/voltage_now` | Tidak | ✅ |
| 4 | Battery current | Xtra-Kernel | `/sys/class/power_supply/battery/current_now` | Tidak | ✅ |
| 5 | Charging status | Xtra-Kernel | status contains "Charging" | Tidak | ✅ |
| 6 | Battery health | Xtra-Kernel | `/sys/class/power_supply/battery/health` | Tidak | ✅ |
| 7 | Cycle count | Xtra-Kernel | `/sys/class/power_supply/{bms,battery,bat}/cycle_count` | Tidak | ✅ |
| 8 | Capacity level | Xtra-Kernel | charge_full / charge_full_design * 100 | Tidak | ✅ |
| 9 | Bypass charging | AZenith | Auto-discovery: 6+ nodes | Ya | ✅ |
| 10 | Charging limit | Xtra-Kernel | `/sys/class/power_supply/battery/charge_control_limit` | Ya | ❌ |
| 11 | Wakeup count | Xtra-Kernel | `/sys/power/wakeup_count` | Tidak | ⚠️ |
| 12 | Suspend count | Xtra-Kernel | `/sys/kernel/debug/suspend_stats/success` | Tidak | ❌ |
| 13 | constant_charge_current_max | SmartPack | `/sys/class/power_supply/battery/constant_charge_current_max` | Ya | ❌ |
| 14 | restricted_current | AZenith | `/sys/class/qcom-battery/restricted_current` | Ya | ❌ |

**Done: 9/14 | Missing: charge_control_limit, suspend_count, restricted_current, charge_current + USB current | Partial: wakeup_count**

---

## 6. I/O Scheduler

| # | Fitur | Source | Path | Root | Status |
|---|-------|--------|------|------|--------|
| 1 | List I/O schedulers | SmartPack, RvKernel | `/sys/block/{device}/queue/scheduler` | Tidak | ✅ |
| 2 | Set I/O scheduler | SmartPack, RvKernel | Echo ke scheduler | Ya | ✅ |
| 3 | Read-ahead kb | Encore, SmartPack | `read_ahead_kb` | Ya | ✅ |
| 4 | NR requests | Encore, SmartPack | `nr_requests` | Ya | ✅ |
| 5 | I/O stats toggle | SmartPack | `iostats` | Ya | ✅ |

**Done: 5/5 | Complete.**

---

## 7. Scheduler & CPU Tuning

| # | Fitur | Source | Path | Root | Status |
|---|-------|--------|------|------|--------|
| 1 | Sched features read | Encore | `/sys/kernel/debug/sched_features` | Ya | ✅ |
| 2 | Stune prefer_idle | Encore | `/dev/stune/top-app/schedtune.prefer_idle` | Ya | ✅ |
| 3 | Stune boost | Encore | `/dev/stune/top-app/schedtune.boost` | Ya | ✅ |
| 4 | Split lock mitigate | Encore | `/proc/sys/kernel/split_lock_mitigate` | Ya | ✅ |
| 5 | BORE scheduler | RvKernel | `/proc/sys/kernel/sched_bore` | Ya | ✅ |
| 6 | uClamp min/max | RvKernel | `sched_util_clamp_{min,max}` | Ya | ✅ |
| 7 | VFS cache pressure | Encore | `/proc/sys/vm/vfs_cache_pressure` | Ya | ✅ |
| 8 | Drop caches | Encore | `/proc/sys/vm/drop_caches` | Ya | ✅ |
| 9 | Overcommit ratio | — | `/proc/sys/vm/overcommit_ratio` | Ya | ✅ |
| 10 | Sched lib name | Encore | `/proc/sys/kernel/sched_lib_name` | Ya | ✅ |
| 11 | Sched lib mask force | Encore | `/proc/sys/kernel/sched_lib_mask_force` | Ya | ✅ |
| 12 | Sched autogroup | RvKernel | `sched_autogroup_enabled` | Ya | ✅ |
| 13 | Sched burst params (3) | RvKernel | `sched_burst_update_period`, `sched_burst_smooth_up`, `sched_burst_graham` | Ya | ✅ |
| 14 | sched_feature toggle | Encore | NExT_BUDDY, NO_TTWU_QUEUE | Ya | ⚠️ |
| 15 | uclamp min_rt_default | RvKernel | `sched_util_clamp_min_rt_default` | Ya | ✅ |

**Done: 14/15 | Partial: sched_feature toggle**

---

## 8. Network

| # | Fitur | Source | Path | Root | Status |
|---|-------|--------|------|------|--------|
| 1 | TCP congestion read | RvKernel | `/proc/sys/net/ipv4/tcp_congestion_control` | Tidak | ✅ |
| 2 | TCP congestion set | RvKernel | echo ke path | Ya | ✅ |
| 3 | Available congestion | RvKernel | `tcp_available_congestion_control` | Tidak | ✅ |
| 4 | DMESG restrict | RvKernel | `/proc/sys/kernel/dmesg_restrict` | Ya | ✅ |
| 5 | Kernel version | RvKernel | `/proc/version` | Tidak | ✅ |
| 6 | WireGuard version | RvKernel | `/sys/module/wireguard/version` | Tidak | ❌ |

**Done: 5/6 | Missing: WireGuard version**

---

## 9. Display & Wake

| # | Fitur | Source | Path | Root | Status |
|---|-------|--------|------|------|--------|
| 1 | Backlight brightness | — | `/sys/class/backlight/panel0-backlight/brightness` | Ya | ✅ |
| 2 | KCAL color control | SmartPack | `/sys/devices/platform/kcal_ctrl.0/kcal` | Ya | ✅ |
| 3 | Backlight dimmer | SmartPack | `/sys/devices/virtual/misc/backlightdimmer/enabled` | Ya | ✅ |
| 4 | DPI override (global) | DPIS | `wm density` | Ya | ✅ |
| 5 | Font scaling (global) | DPIS | `settings put system font_scale` | Ya | ✅ |
| 6 | Per-app DPI (no flicker) | DPIS | Xposed hooks on Display.getMetrics() | Ya (Xposed) | ❌ |
| 7 | DT2W (5 paths) | SmartPack | `/sys/touchpanel/double_tap`, etc | Ya | ✅ |
| 8 | Speaker boost | — | `/sys/kernel/sound_control_3/speaker_boost` | Ya | ✅ |
| 9 | Headphone gain | — | `/sys/kernel/sound_control_3/gain_control` | Ya | ✅ |
| 10 | Mic boost | — | `/sys/kernel/sound_control_3/mic_boost` | Ya | ✅ |
| 11 | Resolution override | — | `wm size` | Ya | ✅ |

**Done: 10/11 | Missing: Per-app DPI (leftover, needs Xposed)**

---

## 10. Gaming Features

| # | Fitur | Source | Method | Root | Status |
|---|-------|--------|--------|------|--------|
| 1 | Foreground app detect | AZenith, Encore | `dumpsys window` | Tidak | ✅ |
| 2 | Per-game profiles | AZenith, Encore | ProfileManager + foreground trigger | Ya | ✅ |
| 3 | DND on gaming | AZenith | `settings put heads_up_notifications_enabled 0` | Ya | ✅ |
| 4 | Monster Mode | Xtra-Kernel | CPU max + GPU force + RAM clear | Ya | ✅ |
| 5 | RAM clear | Xtra-Kernel | `sync` → `drop_caches` → `am kill-all` | Ya | ✅ |
| 6 | GPU renderer switch | SkiaShift | `resetprop debug.hwui.renderer` | Ya | ✅ |
| 7 | Immersive mode | AZenith | `settings put policy_control` | Ya | ✅ |
| 8 | FPS overlay | ZKM | Overlay service | Ya | ❌ |
| 9 | Game preload (madvise) | AZenith | madvise touch game libs | Ya | ❌ |
| 10 | MLBB special handler | AZenith | PID tracking `UnityKillsMe` | Ya | ❌ |
| 11 | Esports mode | Xtra-Kernel | DND + performance + touch | Ya | ⚠️ |

**Done: 7/11 | Missing: FPS overlay, game preload, MLBB handler | Partial: esports mode**

---

## 11. Spoofing & Hooks

| # | Fitur | Source | Method | Root | Status |
|---|-------|--------|--------|------|--------|
| 1 | Device model spoof | COPG | `resetprop` 16 properties | Ya | ✅ |
| 2 | CPU info spoof | COPG | `mount --bind /proc/cpuinfo` | Ya | ✅ |
| 3 | Per-process COW prop | COPG | `mmap(MAP_PRIVATE|MAP_FIXED)` via ZygiskNext companion | Ya (Tier 4) | 🔧 pending |
| 4 | Android ID forge | COPG | ART heap modification via ZygiskNext | Ya (Tier 4) | 🔧 pending |
| 5 | Per-app renderer (perf) | SkiaShift | 6 sysprop hooks via Vector module | Ya (Tier 5) | 🔧 pending |
| 6 | Per-app DPI (perf) | DPIS | Display + TextView hooks via Vector module | Ya (Tier 5) | 🔧 pending |
| 7 | Generate Magisk module | — | `generate_magisk_module()` | Ya | ✅ |

**Done: 3/7 | Pending: 3 per-process features (Vector/ZygiskNext modules, unlockable) | Missing: 0**

---

## 12. Root & IPC

| # | Fitur | Source | Method | Root | Status |
|---|-------|--------|--------|------|--------|
| 1 | Root detection | Xtra-Kernel | `file_exists` kernelsu/magisk | Tidak | ✅ |
| 2 | Shell command exec | Xtra-Kernel | Rust sysfs::write via libc | Ya | ✅ |
| 3 | Shizuku IPC | Shizuku | ContentProvider → Binder | ADB/Root | ✅ |
| 4 | KernelSU module install | Xtra-Kernel | `ksud module install` | Ya | ⚠️ |
| 5 | UserService AIDL | Shizuku | `app_process` daemon | Ya | ❌ |
| 6 | Framework detection | Xtra-Kernel | Tier 1-5: KSU/Magisk/Zygisk/LSPosed | Tidak | ✅ |

**Done: 4/6 | Missing: UserService AIDL, KernelSU module install not wrapped**

---

## 13. Kernel Parameters

| # | Fitur | Source | Path | Root | Status |
|---|-------|--------|------|------|--------|
| 1 | SELinux status | Xtra-Kernel | `getenforce` command | Tidak | ✅ |
| 2 | Kernel version | RvKernel | `/proc/version` | Tidak | ✅ |
| 3 | DMESG restrict | RvKernel | `/proc/sys/kernel/dmesg_restrict` | Ya | ✅ |
| 4 | Printk level | RvKernel | `/proc/sys/kernel/printk` | Ya | ❌ |

**Done: 3/4 | Missing: printk level**

---

## 14. Apply-on-Boot & Profiles

| # | Fitur | Source | Method | Root | Status |
|---|-------|--------|--------|------|--------|
| 1 | Boot config save/load | SmartPack, Xtra-Kernel | JSON → `/data/local/tmp/` | Ya | ✅ |
| 2 | Boot config apply | SmartPack, Xtra-Kernel | Replay renderer/cpu/gpu/thermal/io/tcp | Ya | ✅ |
| 3 | Per-app profiles | AZenith, Encore | ProfileManager + foreground trigger | Ya | ✅ |
| 4 | Profile: Performance | Encore, Xtra-Kernel | Max CPU/GPU/IO | Ya | ✅ |
| 5 | Profile: Balance | Encore, Xtra-Kernel | Default governors | Ya | ✅ |
| 6 | Profile: Powersave | Encore, Xtra-Kernel | Min freq + max thermal | Ya | ✅ |
| 7 | Profile: Game/Monster | Xtra-Kernel | GPU force + DND + RAM clear | Ya | ✅ |
| 8 | TOML config import/export | Xtra-Kernel | Config → TOML file | Tidak | ❌ |
| 9 | init.d support | SmartPack | Init script on boot | Ya | ❌ |

**Done: 7/9 | Missing: TOML config export, init.d suppor**

---

## 15. Feature Checker & Logging

| # | Fitur | Source | Method | Root | Status |
|---|-------|--------|--------|------|--------|
| 1 | Single feature verify | Xtra-Kernel | write + readback verification | Ya | ✅ |
| 2 | All features verify | — | batch run verifyFeature() | Ya | ✅ |
| 3 | Checker log | — | `/data/adb/farewell_logs/checker.log` | Ya | ✅ |
| 4 | Logcat parser | — | parse crash patterns | Ya | ✅ |
| 5 | Log export (tar.gz) | — | archive + compress | Ya | ✅ |
| 6 | LogFox crash logging | LogFox | Logcat monitoring + export | Tidak | ✅ |

**Done: 6/6 | Complete.**

---

## Summary

| Kategori | Total | Done | Missing | Persentase |
|----------|-------|------|---------|-----------|
| 1. CPU & Governor | 27 | 19 | 8 | 70% |
| 2. GPU Control | 21 | 19 | 2 | 90% |
| 3. Memory & ZRAM | 16 | 15 | 1 | 94% |
| 4. Thermal | 11 | 10 | 1 | 91% |
| 5. Power & Battery | 14 | 9 | 5 | 64% |
| 6. I/O Scheduler | 5 | 5 | 0 | 100% |
| 7. Scheduler & CPU | 15 | 14 | 1 | 93% |
| 8. Network | 6 | 5 | 1 | 83% |
| 9. Display & Wake | 11 | 10 | 1 | 91% |
| 10. Gaming | 11 | 7 | 4 | 64% |
| 11. Spoofing & Hooks | 7 | 3 | 4 | 43% |
| 12. Root & IPC | 6 | 4 | 2 | 67% |
| 13. Kernel Params | 4 | 3 | 1 | 75% |
| 14. Apply-on-Boot | 9 | 7 | 2 | 78% |
| 15. Checker & Logs | 6 | 6 | 0 | 100% |
| **TOTAL** | **169** | **136** | **33** | **80%** |

### Prioritas Implementasi

**Easy (no system dep, straight sysfs writes):**
1. CPU hotplug drivers (msm_hotplug, intelliplug, alucard, autosmp)
2. charge_control_limit + constant_charge_current_max
3. Printk level
4. WireGuard version
5. ZSwap parameters
6. FPS overlay service
7. TOML config export

**Medium (new Kotlin services):**
8. Kernel flasher (ZKM approach)
9. CPU time-in-state stats
10. USB current_max

**Hard (needs Zygisk/LSPosed):**
11. Per-process COW spoof
12. Per-app renderer/Dpi
13. Per-app mount namespace
14. Android ID forge
15. Shizuku UserService AIDL
