# Farewell Kernel Manager — KernelSU/ZygiskNext/Vector

**Target:** POCO X3 NFC (surya/karna) — Qualcomm SM6150
**Root:** KernelSU-Next + ZygiskNext + Vector (5-tier access)
**Score:** 96/100 🟢 | 27 Rust modules | 9,903 lines | 269 JNI exports | 151/169 features

> Reverse engineering 18 source repos → Rust SDK → Android Compose app
> POCO X3 NFC specific — sysfs paths verified against stock ROM V14.0.1.0.SJGMIXM

---

## 5-Tier Access System

| Tier | Framework | What Works |
|------|-----------|------------|
| 1 | Non-ROOT | Read CPU/GPU/Battery/Thermal/Memory/IO via Android API + KGSL IOCTL |
| 2 | Shizuku/ADB | Shell commands, wm density, settings put, brightness |
| 3 | **KernelSU-Next** | All sysfs writes, resetprop, mount --bind, governor/freq/GPU/thermal |
| 4 | ZygiskNext | Per-app device spoof, CPU spoof, renderer override |
| 5 | Vector/Xposed | Per-app DPI, font scale, DisplayMetrics, renderer |

## Features (151/169 — 89%)

### CPU & Governor (22/27 ✅)
Read/write governor, freq limits, core online/offline, cluster detection, input boost, CPU EAS, DCVS disable, hard limit, MSM cpufreq limit, CoreCtl, MSM hotplug. Missing: legacy hotplug drivers (IntelliPlug, Alucard, AutoSMP, BluPlug), time-in-state, OPP table.

### GPU Control (19/21 ✅)
KGSL IOCTL bypass (SELinux-safe), freq/busy/power levels, Adreno Idler, Simple GPU, Adrenoboost, Bus DCVS, model/driver detect. Missing: Mali support, devfreq boost.

### Memory & ZRAM (15/16 ✅)
MemTotal/Available/Swap, ZRAM stats/size/algorithm, swappiness, dirty ratio, min free kbytes, vfs cache pressure. Missing: ZSwap.

### Thermal (10/11 ✅)
Multi-zone reading, MSM thermal toggle, EARA thermal, FPSGO, sconfig preset. Missing: USB current_max direct path.

### Power & Battery (12/14 ✅)
Battery level/temp/voltage/current/health/capacity/cycle count, bypass charging, charge current max, USB current max, wakeup/suspend count. Missing: charge_control_limit, restricted_current.

### Xiaomi HAL (10/10 ✅)
Reverse charging (3-layer), night charging, cool mode, smart battery, input suspend, USB PD auth, KCAL RGB/contrast/saturation, DFPS, histogram, AW8697 haptic LRA calibration, custom waveform.

### I/O, Network, Scheduler (20/20 ✅)
I/O scheduler/readahead/nr_requests, TCP congestion, WireGuard, printk, dmesg, sched features, sched BORE, uclamp, stune boost/prefer_idle, cpuset, sched autogroup, BORE scheduler, split lock, sched lib name.

### Qualcomm Boot (8/8 ✅)
ADSP/CDSP/NPU/CVP/SLPI boot, UFS clock scaling, subsystem restart, USB ICL, PIL timeouts, dload mode, WLAN shutdown.

### Stock ROM Sysfs Paths (72/154 — 47%)
Verified from `vendor/etc/init/*.rc`:
- CPU: governor, freq, core online ✅
- GPU: `/sys/kernel/gpu/gpu_model`, clock_mhz (via root) ✅
- Xiaomi: `/sys/class/qcom-battery/*` (30+ paths) ✅
- AW8697 haptic: I2C driver paths ✅
- STune: `/dev/stune/*` ✅
- Touch: `/dev/xiaomi-touch`, `/proc/tp_*` ✅
- USB: `/sys/class/usbpd/usbpd0/*` ✅

## Knowledge Base (Obsidian Vault)

```
_farewell-agent/
├── universal/ecc/          — 122 ECC skills (general coding)
├── stacks/android/         — Android-specific patterns
│   ├── surya-sysfs-catalog     — 200+ SM6150 sysfs paths
│   ├── surya-xiaomi-hals       — Xiaomi HAL services
│   ├── kgsl-ioctl-bypass       — KGSL IOCTL approach
│   ├── android-api-reading     — BatteryManager/AThermal
│   ├── root-detection-frameworks — 5-tier explained
│   ├── per-app-hooks           — Zygisk/Xposed patterns
│   └── sysfs-patterns          — Qualcomm sysfs reference
└── projects/003-farewell-ex/  — Project knowledge (48 files)
    ├── 01..12-smartpack-reference   — Deep study per source
    ├── 12..30-*                      — Knowledge modules
    ├── feature-catalog               — 169 features status
    ├── leftover                      — 6 pending features
    └── rust-sdk                      — Rust API reference
```

## Build

```bash
# Rust SDK
cd rust/kernel-manager
rustup target add aarch64-linux-android
cargo ndk -t arm64-v8a -o ../../android/app/src/main/jniLibs build --release

# Android APK
cd android
./gradlew assembleDebug
# → android/app/build/outputs/apk/debug/app-arm64-v8a-debug.apk

# Install
adb install -r android/app/build/outputs/apk/debug/app-arm64-v8a-debug.apk
```

## Source References (18 repos)

| # | Repo | Language | What We Used |
|---|------|----------|-------------|
| 1 | SmartPack-Kernel-Manager | Java | Sysfs catalog, hotplug, KCAL, bypass charging |
| 2 | Xtra-Kernel-Manager | Kotlin+Rust | JNI bridge pattern, Rust I/O engine |
| 3 | ZKM | Kotlin/Compose | GPU discovery, Bus DCVS, Material 3 |
| 4 | AZenith | C+Kotlin | Game detection, bypass auto-discovery |
| 5 | Encore Tweaks | C+++Vue | C++ daemon, SoC-aware profiler |
| 6 | SkiaShift | Kotlin+C++ | GPU renderer switch, resetprop |
| 7 | DPIS | Java+Xposed | DPI scaling, DisplayMetrics hooks |
| 8 | COPG | C++ | mmap COW property spoof |
| 9 | Shizuku+API | Java/Kotlin | Binder IPC, UserService |
| 10 | RvKernel | Kotlin/Comp. | Dynamic probing, Material 3 UI |
| 11 | KernelSU-Next | Rust+Kotlin | Kernel root, module system |
| 12 | ZygiskNext | C++ | Zygisk API, companion IPC |
| 13 | Vector | Java+C++ | LSPlant ART hook |
| 14 | LogFox | Kotlin | Crash logging, logcat parser |
| 15 | DevCheck | C+Java | KGSL IOCTL, BatteryManager API |
| 16 | ZN-AuditPatch | C++ | Audit log replacement |
| 17 | FPSViewer | Java | SurfaceFlinger FPS overlay |
| 18 | Xiaomi Stock ROM | — | 200+ sysfs paths verified |
