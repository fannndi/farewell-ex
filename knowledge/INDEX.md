# Knowledge Index — Reverse Engineering Study

Target Device: POCO X3 NFC (Qualcomm SM7150-AC, Adreno 618, KernelSU)
Progress: 14/217 indexed (6.5%)

## 1. Xtra-Kernel-Manager (12 Rust + 16 Kotlin)

### Rust Native (X01-X12) — ALL DONE
| ID | File | Status |
|----|------|--------|
| X01 | src/lib.rs | ✅ |
| X02 | src/utils.rs | ✅ |
| X03 | src/cpu/cpu.rs | ✅ |
| X04 | src/cpu/mod.rs | ✅ |
| X05 | src/gpu/gpu.rs | ✅ |
| X06 | src/gpu/mod.rs | ✅ |
| X07 | src/power/power.rs | ✅ |
| X08 | src/power/thermal.rs | ✅ |
| X09 | src/power/mod.rs | ✅ |
| X10 | src/memory/memory.rs | ✅ |
| X11 | src/memory/mod.rs | ✅ |
| X12 | Cargo.toml | ✅ |

### Kotlin (X13-X28) — ALL TODO
| ID | File | Status |
|----|------|--------|
| X13 | domain/native/NativeLib.kt | ⬜ |
| X14 | domain/root/RootManager.kt | ⬜ |
| X15 | utils/RootShell.kt | ⬜ |
| X16 | domain/SmartCPULocker.kt | ⬜ |
| X17-X28 | use cases, models, repos, services | ⬜ |

## 2. SmartPack-Kernel-Manager (31 files TODO)

### CPU (S07-S15)
| ID | File | Status |
|----|------|--------|
| S07 | CPUFreq.java (32KB) | ⬜ |
| S08 | CPUTimes.java (17.9KB) | ⬜ |
| S11 | MSMPerformance.java | ⬜ |
| S13 | CPUBoost.java | ⬜ |
| S14 | CPUInputBoost.java | ⬜ |

### GPU (S16-S20)
| ID | File | Status |
|----|------|--------|
| S17 | GPUFreq.java (15.1KB) | ⬜ |
| S19 | AdrenoIdler.java | ⬜ |

### Memory/VM/IO/Thermal
| ID | File | Status |
|----|------|--------|
| S22 | ZRAM.java | ⬜ |
| S24 | IO.java | ⬜ |
| S26 | MSMThermal.java (24KB) | ⬜ |
| S28 | Battery.java (17KB) | ⬜ |

### Root/Utils
| ID | File | Status |
|----|------|--------|
| S01 | Control.java | ⬜ |
| S05 | Utils.java (21.9KB) | ⬜ |
| S06 | Device.java (14.1KB) | ⬜ |

### Profiles
| ID | File | Status |
|----|------|--------|
| S29 | ProfileFragment.java | ⬜ |
| S31 | ApplyOnBoot.java | ⬜ |

## 3. RvKernel-Manager (10 files TODO)

| ID | File | Status |
|----|------|--------|
| R01 | utils/Utils.kt | ⬜ |
| R02 | utils/SoCUtils.kt | ⬜ |
| R03 | utils/KernelUtils.kt | ⬜ |
| R04 | utils/BatteryUtils.kt | ⬜ |
| R05-R07 | ViewModels | ⬜ |
| R08 | NavigationRoute.kt | ⬜ |

## 4. ZKM (14 files TODO)

| ID | File | Status |
|----|------|--------|
| Z01 | AdrenoUtils.kt (7.2KB) | ⬜ |
| Z02 | GenericGpuUtils.kt | ⬜ |
| Z06 | AdrenoBusTab.kt (18.7KB) | ⬜ |
| Z09 | CpuGpuUtils.kt | ⬜ |
| Z13 | OverallScreen.kt (72.1KB) | ⬜ |

## 5. AZenith (19 files TODO)

### C Daemon (A01-A10)
| ID | File | Status |
|----|------|--------|
| A01 | main.c (23KB) | ⬜ |
| A02 | AZenith_profiler.c | ⬜ |
| A03 | bypass_charge.c (14.8KB) | ⬜ |
| A04 | CLI.c (10.1KB) | ⬜ |
| A09 | misc_utils.c (17.4KB) | ⬜ |

### Kotlin Manager (A11-A15)
| ID | File | Status |
|----|------|--------|
| A11 | AppMonitor.kt (18.9KB) | ⬜ |
| A12 | RootUtils.kt | ⬜ |
| A15 | TweakScreen.kt (46.3KB) | ⬜ |

### Shell Scripts (A16-A19)
| ID | File | Status |
|----|------|--------|
| A16 | sys.azenith-profilesettings.sh (70.8KB) | ⬜ |
| A17 | sys.azenith-utilityconf.sh | ⬜ |

## 6. Shizuku (7 files TODO)
SH01-SH07: server, binder, auth, shell, manager, utils, home

## 7. Shizuku-API (7 files TODO)
SA01-SA07: Shizuku.java, BinderWrapper, RemoteProcess, ServiceHelper, AIDL, Provider, Service

## 8. Encore Tweaks — BELUM DI-CLONE
@todo: clone https://github.com/Rem01Gaming/encore.git

## 9. SkiaShift — BELUM DI-CLONE
@todo: clone https://github.com/Jefino9488/SkiaShift.git

## 10. COPG — BELUM DI-CLONE
@todo: clone https://github.com/AlirezaParsi/COPG.git

## 11. DPIS — BELUM DI-CLONE
@todo: clone https://github.com/Kwensiu/DPIS.git

---

## Statistics

| Source | Indexed | TODO |
|--------|---------|------|
| Xtra-Kernel (Rust) | 12 | 0 |
| Xtra-Kernel (Kotlin) | 0 | 16 |
| SmartPack | 0 | 31 |
| RvKernel | 0 | 10 |
| ZKM | 0 | 14 |
| AZenith | 0 | 19 |
| Shizuku | 0 | 7 |
| Shizuku-API | 0 | 7 |
| Encore | 0 | TBD |
| SkiaShift | 0 | TBD |
| COPG | 0 | TBD |
| DPIS | 0 | TBD |

**Progress: 14/217 (6.5%)**
