# Module 19: AZenith — KernelSU Game Module

**Source:** `AZenith/` (C daemon + Kotlin manager)
**Status:** ✅ VERIFIED — dumpsys game detection + bypass charging + profile system confirmed

## Architecture

C daemon (`sys.azenith-service`) + Kotlin AppMonitor + 2090-line shell profiler + preload binary.

```
C daemon (main loop) → polls game state → applies profiles
  ├── dumpsys-based game detection (primary)
  ├── Kotlin AppMonitor (reflection-based, fallback)
  ├── azenithApplist.json (per-game config)
  └── sys.azenith-profilesettings.sh (per-SoC tuning)
```

---

## Game Detection

**C daemon:** `get_visible_package()` → `dumpsys window displays` → parses `Application tokens in top down Z order`
**Kotlin AppMonitor:** `IActivityTaskManager` reflection → `getFocusedRootTaskInfo()` → `ComponentName` extraction. Polls 500ms.
**MLBB special:** Unity's `:UnityKillsMe` subprocess → `pidof()` tracking

---

## Profile System

| Mode | Description |
|------|-------------|
| PERFORMANCE | Max CPU/GPU, DND, preload |
| BALANCED | Normal use |
| ECO_MODE | Battery saver, min freq |
| PERFCOMMON | Init/default |

Transition: Performance→Balanced has 10s screen-off grace period.

---

## Bypass Charging

Auto-discovery: iterates 60+ sysfs nodes, writes on value, measures current 10s, finds working node. Stores in `persist.sys.azenithconf.bypasspath`.

---

## Sysfs Paths (Key)

| Category | Paths |
|----------|-------|
| CPU Governor | `/sys/devices/system/cpu/cpu*/cpufreq/scaling_governor` |
| CPU Freq | `/sys/devices/system/cpu/*/cpufreq/scaling_{max,min}_freq` |
| CPU EAS | `/sys/devices/system/cpu/eas/enable` |
| GPU (MTK) | `/proc/gpufreq/gpufreq_opp_freq`, `/proc/gpufreqv2/fix_target_opp_index` |
| GPU (QC) | `/sys/class/kgsl/kgsl-3d0/devfreq/{min,max}_freq`, `adrenoboost` |
| GPU (Mali) | `/sys/devices/platform/soc/*.mali/devfreq/*.mali/governor` |
| GPU (Exynos) | `/sys/kernel/gpu/gpu_{max,min}_clock` |
| IO Scheduler | `/sys/block/sd*/queue/scheduler` |
| Thermal | `/sys/kernel/eara_thermal/enable` |
| DDR (MTK) | `/sys/devices/platform/10012000.dvfsrc/helio-dvfsrc/dvfsrc_req_ddr_opp` |
| Bus DCVS (QC) | `/sys/devices/system/cpu/bus_dcvs/LLCC/*/max_freq` |
| Renderer | `debug.hwui.renderer` (skiavk/skiagl) |

---

## Key Patterns

1. **dumpsys over procfs** — More reliable foreground detection
2. **Function pointer fallback** — Swap to return_true/false after 6 consecutive failures
3. **Per-game JSON options** — Each game has own perf_lite_mode, renderer, refresh_rate
4. **Bypass charging auto-discovery** — Probe 60+ nodes, measure current
5. **Sysfs write-lock** — chmod 644 → write → chmod 444
6. **SoC-vendor branching** — MTK/Qualcomm/Exynos specific paths
7. **FSTrim every 12h** — NAND longevity maintenance
