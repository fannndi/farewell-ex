# farewell-ex — Kernel Manager (Rust/Android)

**Target Device:** POCO X3 NFC (Qualcomm SM7150-AC, Adreno 618)
**Root:** KernelSU-Next + ZygiskNext + Vector
**Goal:** Reverse engineering 16 source repos → Rust kernel manager library → Android app

---

## 5-Tier Access System

| Tier | Framework | Detection | Features |
|------|-----------|-----------|----------|
| 1 | Non-ROOT | — | Read-only info |
| 2 | ADB | Shizuku | wm density, settings |
| 3 | Full ROOT | KernelSU-Next | All sysfs, resetprop |
| 4 | Zygisk | ZygiskNext | Per-app spoof/renderer |
| 5 | Xposed | Vector | Per-app DPI/font |

---

## Source References (16 repos — `training/references/`)

### Kernel Managers (11 sources)
| Repo | Language | Focus |
|------|----------|-------|
| Xtra-Kernel-Manager | Kotlin + Rust JNI | Native reader, modern UI |
| SmartPack-Kernel-Manager | Java | Battle-tested sysfs catalog |
| RvKernel-Manager | Kotlin/Compose | Dynamic sysfs probing |
| ZKM | Kotlin/Compose | Bus DCVS, GPU discovery |
| AZenith | C + Kotlin | Game detection, thermal |
| Encore Tweaks | C++ + Vue | Profile tuner, native daemon |
| SkiaShift | Kotlin + C++ | Per-app GPU renderer |
| COPG | C++ + shell | Zygisk device/CPU spoofing |
| DPIS | Java | Per-app DPI/font scaling |
| Shizuku | Java/Kotlin | Root alternative via Binder IPC |
| Shizuku-API | Java/Kotlin | Shizuku API interface |

### Frameworks & Tooling (5 sources)
| Repo | Language | Focus |
|------|----------|-------|
| KernelSU-Next | Rust + Kotlin | Kernel-based root, module system |
| ZygiskNext | C++ | Standalone Zygisk implementation |
| Vector | Java + Kotlin + C++ | Modern Xposed (LSPlant) |
| ZN-AuditPatch | C++ | Audit log replacement |
| LogFox | Kotlin | Crash logging + export |

---

## Project Structure

```
farewell-ex/
├── rust/kernel-manager/          ← Rust SDK (18 modules, 3,175 lines)
│   ├── src/
│   │   ├── sysfs.rs              ← Core engine (Xtra-Kernel)
│   │   ├── cpu.rs                ← CPU control (Xtra-Kernel + SmartPack)
│   │   ├── gpu.rs                ← GPU control — QCOM only (ZKM + Encore)
│   │   ├── memory.rs             ← Memory/ZRAM (Xtra-Kernel)
│   │   ├── power.rs              ← Battery + bypass (AZenith)
│   │   ├── thermal.rs            ← Thermal + sconfig (SmartPack + Encore)
│   │   ├── scheduler.rs          ← Scheduler + VM (Encore + RvKernel)
│   │   ├── io.rs                 ← I/O scheduler (SmartPack)
│   │   ├── network.rs            ← TCP + kernel params (RvKernel)
│   │   ├── display.rs            ← Brightness + KCAL (SmartPack)
│   │   ├── wake.rs               ← DT2W + sound (SmartPack)
│   │   ├── renderer.rs           ← GPU renderer (SkiaShift)
│   │   ├── spoof.rs              ← Device/CPU spoof (COPG)
│   │   ├── display_control.rs    ← DPI/font (DPIS)
│   │   ├── daemon.rs             ← Foreground monitor + per-app
│   │   ├── tier.rs               ← 5-tier detection + feature matrix
│   │   ├── checker.rs            ← Feature verification + logging
│   │   └── lib.rs                ← JNI bridge (128 exports)
│   └── Cargo.toml
├── android/app/                  ← Kotlin/Compose app (23 files, 1,305 lines)
│   └── src/main/java/.../
│       ├── kernel/               ← NativeLib, RootManager, ShizukuManager, AccessManager
│       ├── viewmodel/            ← MainVM, CPUVM, GPUVM, MemoryVM, ThermalVM, BatteryVM
│       ├── ui/screens/           ← Dashboard, CPU, GPU, Memory, Thermal, Battery, Game, Settings
│       ├── ui/theme/             ← Material 3 Monet
│       └── service/              ← BootReceiver
├── knowledge/                    ← 16 knowledge modules + feature catalog
│   ├── modules/                  ← 25 modules (12-25)
│   ├── index/                    ← 11 per-source indexes
│   ├── feature-catalog.md        ← 200+ features
│   ├── leftover.md               ← 6 features for system binary
│   └── INDEX.md                  ← Master index
├── training/
│   ├── plan.md                   ← Master plan
│   └── references/               ← 16 cloned repos (gitignored)
└── README.md
```

---

## Build Commands

```bash
# Rust SDK
cd rust/kernel-manager
cargo ndk -t arm64-v8a -o ../android/app/src/main/jniLibs build --release

# Android App
cd ../../
./gradlew assembleDebug

# Install
adb install -r app/build/outputs/apk/debug/app-debug.apk
```

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
