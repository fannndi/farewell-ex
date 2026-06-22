# farewell-ex — Kernel Manager (Rust/Android)

**Target Device:** POCO X3 NFC (Qualcomm SM7150-AC, Adreno 618)
**Root:** KernelSU-Next + ZygiskNext + Vector
**Score:** 96/100 🟢 | 20 Rust modules | 7,055 lines | 295 tests | 159 features

> **Goal:** Reverse engineering 17 source repos → Rust kernel manager library → Android app
> **Companion:** ZygiskNext hook module + LSPosed DPI hooks — no conflict install

---

## 5-Tier Access System

| Tier | Framework | Detection | Features |
|------|-----------|-----------|----------|
| 1 | Non-ROOT | — | Read-only info |
| 2 | ADB | Shizuku | wm density, settings, FPS overlay |
| 3 | Full ROOT | KernelSU-Next | All sysfs, resetprop, device spoof |
| 4 | Zygisk | ZygiskNext | Per-app spoof/renderer |
| 5 | Xposed | Vector | Per-app DPI/font |

---

## Source References (17 repos — `training/references/`)

### Kernel Managers (11 sources)
| # | Repo | Language | Focus |
|---|------|----------|-------|
| 1 | Xtra-Kernel-Manager | Kotlin + Rust JNI | Native reader, modern UI |
| 2 | SmartPack-Kernel-Manager | Java | Battle-tested sysfs catalog |
| 3 | RvKernel-Manager | Kotlin/Compose | Dynamic sysfs probing |
| 4 | ZKM | Kotlin/Compose | Bus DCVS, GPU discovery |
| 5 | AZenith | C + Kotlin | Game detection, thermal |
| 6 | Encore Tweaks | C++ + Vue | Profile tuner, native daemon |
| 7 | SkiaShift | Kotlin + C++ | Per-app GPU renderer |
| 8 | COPG | C++ + shell | Zygisk device/CPU spoofing |
| 9 | DPIS | Java | Per-app DPI/font scaling |
| 10 | Shizuku | Java/Kotlin | Root alternative via Binder IPC |
| 11 | Shizuku-API | Java/Kotlin | Shizuku API interface |

### Frameworks & Tooling (6 sources)
| # | Repo | Language | Focus |
|---|------|----------|-------|
| 12 | KernelSU-Next | Rust + Kotlin | Kernel-based root, module system |
| 13 | ZygiskNext | C++ | Standalone Zygisk implementation |
| 14 | Vector | Java + Kotlin + C++ | Modern Xposed (LSPlant) |
| 15 | ZN-AuditPatch | C++ | Audit log replacement |
| 16 | LogFox | Kotlin | Crash logging + export |
| 17 | FPSViewer | Java | Realtime FPS counter overlay (by binhmod) |

**Total: 2,115+ files studied, 30 knowledge modules, 159/169 features implemented (93%)**

---

## Project Structure

```
farewell-ex/
├── rust/kernel-manager/          ← Rust SDK (20 modules, 7,055 lines, 295 tests)
│   ├── src/
│   │   ├── sysfs.rs              ← Core engine: dual-path I/O + TTL cache
│   │   ├── cpu.rs                ← CPU freq/governor/cluster/hotplug (Xtra-Kernel + SmartPack)
│   │   ├── gpu.rs                ← GPU KGSL + adreno + bus DCVS (ZKM + Encore)
│   │   ├── memory.rs             ← MemInfo + ZRAM + VM params (Xtra-Kernel)
│   │   ├── power.rs              ← Battery + bypass + charging current (AZenith + SmartPack)
│   │   ├── thermal.rs            ← Thermal zones + sconfig + MSM/EARA/FPSGO (SmartPack + Encore)
│   │   ├── scheduler.rs          ← Stune + BORE + uClamp + cpuset (Encore + RvKernel)
│   │   ├── io.rs                 ← I/O scheduler + readahead (SmartPack)
│   │   ├── network.rs            ← TCP + kernel params + printk + WireGuard (RvKernel)
│   │   ├── display.rs            ← Backlight + KCAL + dimmer (SmartPack)
│   │   ├── wake.rs               ← DT2W + sound boost (SmartPack)
│   │   ├── renderer.rs           ← GPU renderer switch via resetprop (SkiaShift)
│   │   ├── spoof.rs              ← Device/CPU spoof via resetprop + mount (COPG)
│   │   ├── display_control.rs    ← DPI/font scaling via wm density (DPIS)
│   │   ├── daemon.rs             ← Foreground monitor + per-app profiles + screen state (AZenith)
│   │   ├── tier.rs               ← 5-tier framework detection + feature matrix
│   │   ├── checker.rs            ← Feature verification + crash logging
│   │   ├── hotplug.rs            ← CoreCtl + MSM hotplug drivers (SmartPack)
│   │   ├── disk.rs               ← /proc/diskstats I/O counters (Xtra-Kernel)
│   │   └── lib.rs                ← JNI bridge (97+ exports)
│   └── Cargo.toml
├── android/app/                  ← Kotlin/Compose app (26 files, 1,612 lines)
│   └── src/main/java/.../
│       ├── kernel/               ← NativeLib (284 lines), Root, Shizuku, Access
│       ├── viewmodel/            ← 6 VMs: Main, CPU, GPU, Memory, Thermal, Battery
│       ├── ui/screens/           ← 8 screens: Dashboard, CPU, GPU, Mem, Thermal, Battery, Game, Settings
│       ├── ui/settings/          ← TierAccessScreen (135 lines, 5-tier bar)
│       ├── service/              ← BootReceiver + FpsOverlayService
│       └── ui/theme/             ← Material 3 Monet
├── farewell-companion/           ← KernelSU module (Tier 4-5)
│   ├── zygisk/main.cpp           ← ZygiskNext PLT hook: __system_property_get
│   ├── xposed/FarewellXposed.java ← LSPosed hook: DisplayMetrics + font
│   ├── module.prop               ← Module metadata
│   └── post-fs-data.sh           ← Boot config
├── knowledge/                    ← 30 knowledge modules + feature catalog
│   ├── modules/                  ← 26 modules (12-26, including FPSViewer)
│   ├── index/                    ← 11 per-source indexes (385+ lines each)
│   ├── feature-catalog.md        ← 169 features with ✅/⚠️/🔧 status
│   ├── leftover.md               ← 6 leftover → implementation path
│   ├── rust-sdk.md               ← 500+ line Rust implementation reference
│   └── INDEX.md                  ← Master index (17 sources)
├── training/
│   ├── plan.md                   ← Master training plan
│   └── references/               ← 17 cloned repos (gitignored)
└── README.md
```

---

## Quick Start

### 1. Clone + Setup Toolchain

```powershell
git clone https://github.com/fannndi/farewell-ex.git
cd farewell-ex

# Install Rust for Android
rustup target add aarch64-linux-android
cargo install cargo-ndk
```

### 2. Build Rust SDK (ARM64)

```powershell
cd rust/kernel-manager
cargo ndk -t arm64-v8a -o ../android/app/src/main/jniLibs build --release
```

### 3. Build APK

> Buka `android/` di **IntelliJ IDEA** (File → Open). Gradle auto-sync, lalu **Build → Build APK**.

Atau command line:

```powershell
cd android
./gradlew assembleDebug
apk di: android/app/build/outputs/apk/debug/app-debug.apk
```

### 4. Install

```powershell
adb install -r app-debug.apk
```

---

## Install Companion Module (Tier 4-5)

```powershell
# Pack companion module
cd farewell-companion
zip -r farewell-companion.zip * -x "*.git*"

# Install via KernelSU Manager or adb
adb push farewell-companion.zip /sdcard/
adb shell su -c "ksud module install /sdcard/farewell-companion.zip"
adb reboot
```

**Zero conflict.** ZygiskNext auto-loads `libfarewell.so` from `/data/adb/modules/farewell/zygisk/`. LSPosed auto-loads `FarewellXposed.apk`. Both coexist with other modules.

---

## Feature Checker

```kotlin
// Detect tier
val tier = NativeLib.detectTierNative() // 1-5

// Verify feature
val result = NativeLib.verifyFeatureNative("set_cpu_governor") // "PASS: OK" or "FAIL: reason"

// Export logs for tester
val zipPath = NativeLib.exportLogsNative() // ZIP with device info + checker log
```

## Rust API

```rust
use farewell_native;

// CPU
let clusters = cpu::detect_cpu_clusters();
cpu::set_governor("performance")?;

// GPU
let freq = gpu::read_gpu_freq();
gpu::set_gpu_power_levels(0, 2)?;

// Battery
let level = power::read_battery_level();
power::set_bypass_charging(true)?;

// All writes return Result<bool, SysfsError>
```

## Stats

| Metric | Value |
|--------|-------|
| Rust modules | 20 |
| Rust lines | 7,055 |
| Rust unit tests | 295 |
| Kotlin files | 26 |
| Kotlin lines | 1,612 |
| JNI exports | 97+ |
| Features | 159/169 (93%) |
| Knowledge modules | 30 |
| Sysfs paths | 180+ unique |
| Score | 96/100 🟢 |
