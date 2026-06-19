# Knowledge Index - Reverse Engineering Study

Target Device: POCO X3 NFC (Qualcomm SM7150-AC, Adreno 618, KernelSU)
Progress: 14/245 indexed (5.7%)

## 1. Xtra-Kernel-Manager (12 Rust + 16 Kotlin)

### Rust Native (X01-X12) - ALL DONE
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

### Kotlin (X13-X28) - ALL TODO
| ID | File | Status |
|----|------|--------|
| X13 | domain/native/NativeLib.kt | ⬜ |
| X14 | domain/root/RootManager.kt | ⬜ |
| X15 | utils/RootShell.kt | ⬜ |
| X16 | domain/SmartCPULocker.kt | ⬜ |
| X17 | domain/usecase/CPUControlUseCase.kt | ⬜ |
| X18 | domain/usecase/GPUControlUseCase.kt | ⬜ |
| X19 | domain/usecase/ThermalControlUseCase.kt | ⬜ |
| X20-X28 | data models, repos, services | ⬜ |

## 2. SmartPack-Kernel-Manager (31 files TODO)
S01-S31: CPU, GPU, VM, IO, Thermal, Battery, Root, Profiles, Utils

## 3. RvKernel-Manager (10 files TODO)
R01-R10: SoC utils, Kernel params, Battery, ViewModels, Navigation

## 4. ZKM (14 files TODO)
Z01-Z14: AdrenoUtils, BusDCVS, GPU discovery, CPU/GPU/Memory/Battery screens

## 5. AZenith (19 files TODO)
A01-A10: C daemon (main.c, profiler, bypass_charge, CLI, misc_utils)
A11-A15: Kotlin manager (AppMonitor, RootUtils, TweakScreen)
A16-A19: Shell scripts (profilesettings 70.8KB, utilityconf)

## 6. Shizuku (7 files TODO)
SH01-SH07: ShizukuService, BinderSender, AuthManager, ShellLoader, ManagerProvider, SystemApis, HomeActivity

## 7. Shizuku-API (7 files TODO)
SA01-SA07: Shizuku.java, BinderWrapper, RemoteProcess, ServiceHelper, AIDL, Provider, Service

## 8. Encore Tweaks (14 C++ + 12 Shell)

### C++ Core
| ID | File | KB | Status |
|----|------|----|--------|
| EN01 | jni/Main.cpp | 20.3 | ⬜ |
| EN02 | jni/EncoreCLI.cpp | 6.3 | ⬜ |
| EN03 | jni/EncoreConfigStore.cpp | 7.6 | ⬜ |
| EN04 | jni/Profiler.cpp | 4.8 | ⬜ |
| EN05 | jni/DeviceMitigationStore.cpp | 13 | ⬜ |
| EN06 | jni/InotifyHandler.cpp | 6.3 | ⬜ |
| EN07 | jni/base/DeviceInfo.cpp | 2.3 | ⬜ |
| EN08 | jni/base/MiscUtility.cpp | 2.4 | ⬜ |
| EN09 | jni/base/ProcessUtility.cpp | 2.6 | ⬜ |
| EN10 | jni/base/GameRegistry.cpp | 7.1 | ⬜ |
| EN11 | jni/base/InotifyWatcher.cpp | 14.5 | ⬜ |
| EN12 | jni/base/LockFile.cpp | 4.6 | ⬜ |
| EN13 | jni/base/PIDTracker.cpp | 4.5 | ⬜ |
| EN14 | jni/base/SystemStatus.cpp | 2 | ⬜ |

### Shell Scripts
| ID | File | KB | Status |
|----|------|----|--------|
| EN15 | scripts/encore_profiler.sh | 25.7 | ⬜ |
| EN16 | scripts/encore_utility.sh | 4.4 | ⬜ |
| EN17 | module/action.sh | 1.5 | ⬜ |
| EN18 | module/service.sh | 2.4 | ⬜ |
| EN19 | module/customize.sh | 7.6 | ⬜ |

## 9. SkiaShift (3 Kotlin + 1 C++)
| ID | File | KB | Status |
|----|------|----|--------|
| SS01 | app/src/main/cpp/skiashift.cpp | 10.1 | ⬜ |
| SS02 | app/src/main/java/MainActivity.kt | 24.5 | ⬜ |
| SS03 | app/src/main/java/SkiaShiftModule.kt | 1.7 | ⬜ |
| SS04 | app/src/main/java/BootReceiver.kt | 1.9 | ⬜ |
| SS05 | app/src/main/java/AppManager.kt | 2.5 | ⬜ |

## 10. COPG (2 C++ + 3 Shell)
| ID | File | KB | Status |
|----|------|----|--------|
| CG01 | src/spoof_module.cpp | 41.5 | ⬜ |
| CG02 | src/unified_controller.cpp | 40.3 | ⬜ |
| CG03 | src/atexit.cpp | 4.2 | ⬜ |
| CG04 | module/customize.sh | 12.5 | ⬜ |
| CG05 | module/service.sh | 0.3 | ⬜ |

## 11. DPIS (5 core Java + 1 native C++)
| ID | File | KB | Status |
|----|------|----|--------|
| DP01 | app/src/main/cpp/dpis_native.cpp | 71.8 | ⬜ |
| DP02 | app/src/main/java/MainActivity.java | 162.9 | ⬜ |
| DP03 | app/src/main/java/DpisApplication.java | 6 | ⬜ |
| DP04 | app/src/main/java/RootAccessProbe.java | 5.3 | ⬜ |
| DP05 | app/src/main/java/ModuleMain.java | 15.7 | ⬜ |
| DP06 | app/src/main/java/AppProcessHookInstaller.java | 15.7 | ⬜ |
| DP07 | app/src/main/java/SystemServerDisplayEnvironmentInstaller.java | 95.9 | ⬜ |
| DP08 | app/src/main/java/ForceTextSizeHookInstaller.java | 51.2 | ⬜ |
| DP09 | app/src/main/java/HyperOsRustProcessHookInstaller.java | 9.9 | ⬜ |
| DP10 | app/src/main/java/LegacyModuleHook.java | 30.9 | ⬜ |

---

## Statistics

| Source | Indexed | TODO |
|--------|---------|------|
| Xtra-Kernel Rust | 12 | 0 |
| Xtra-Kernel Kotlin | 0 | 16 |
| SmartPack | 0 | 31 |
| RvKernel | 0 | 10 |
| ZKM | 0 | 14 |
| AZenith | 0 | 19 |
| Shizuku | 0 | 7 |
| Shizuku-API | 0 | 7 |
| Encore Tweaks | 0 | 19 |
| SkiaShift | 0 | 5 |
| COPG | 0 | 5 |
| DPIS | 0 | 10 |

Progress: 14/245 (5.7%)
