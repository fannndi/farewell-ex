# Knowledge Index — Reverse Engineering Study

Total files: ~390 (7 repos)
Relevant kernel files: ~120 files
Status: ⬜ = TODO | ✅ = DONE

---

## SmartPack-Kernel-Manager (452 files, ~130 relevant)

### Root & Utils
| # | File | KB | Status |
|---|------|----|--------|
| S01 | utils/root/Control.java | 4.1 | ⬜ |
| S02 | utils/root/RootFile.java | 2.3 | ⬜ |
| S03 | utils/root/RootUtils.java | 4.3 | ⬜ |
| S04 | utils/Common.java | 8.3 | ⬜ |
| S05 | utils/Utils.java | 21.9 | ⬜ |
| S06 | utils/Device.java | 14.1 | ⬜ |

### CPU
| # | File | KB | Status |
|---|------|----|--------|
| S07 | utils/kernel/cpu/CPUFreq.java | 32 | ⬜ |
| S08 | utils/kernel/cpu/CPUTimes.java | 17.9 | ⬜ |
| S09 | utils/kernel/cpu/Misc.java | 6.7 | ⬜ |
| S10 | utils/kernel/cpu/Temperature.java | 6.4 | ⬜ |
| S11 | utils/kernel/cpu/MSMPerformance.java | 3.4 | ⬜ |
| S12 | utils/kernel/cpu/MSMSleeper.java | 4.3 | ⬜ |
| S13 | utils/kernel/cpu/boost/CPUBoost.java | 8.3 | ⬜ |
| S14 | utils/kernel/cpu/boost/CPUInputBoost.java | 7.4 | ⬜ |
| S15 | utils/kernel/cpu/boost/StuneBoost.java | 5.3 | ⬜ |
| S16 | utils/kernel/cpu/boost/VoxPopuli.java | 2.7 | ⬜ |

### CPU Hotplug
| # | File | KB | Status |
|---|------|----|--------|
| S17 | utils/kernel/cpuhotplug/CoreCtl.java | 6.8 | ⬜ |
| S18 | utils/kernel/cpuhotplug/MPDecision.java | 2.1 | ⬜ |
| S19 | utils/kernel/cpuhotplug/QcomBcl.java | 3.2 | ⬜ |
| S20 | utils/kernel/cpuhotplug/MSMHotplug.java | 12.4 | ⬜ |
| S21 | utils/kernel/cpuhotplug/AlucardHotplug.java | 17.8 | ⬜ |

### GPU
| # | File | KB | Status |
|---|------|----|--------|
| S22 | utils/kernel/gpu/GPU.java | 1.2 | ⬜ |
| S23 | utils/kernel/gpu/GPUFreq.java | 15.1 | ⬜ |
| S24 | utils/kernel/gpu/GPUMisc.java | 2.6 | ⬜ |
| S25 | utils/kernel/gpu/AdrenoIdler.java | 3.7 | ⬜ |
| S26 | utils/kernel/gpu/SimpleGPU.java | 2.9 | ⬜ |
| S27 | utils/kernel/gpu/DevfreqBoost.java | 3.2 | ⬜ |

### Memory & VM
| # | File | KB | Status |
|---|------|----|--------|
| S28 | utils/kernel/vm/VM.java | 3.9 | ⬜ |
| S29 | utils/kernel/vm/ZRAM.java | 4.1 | ⬜ |
| S30 | utils/kernel/vm/ZSwap.java | 2.7 | ⬜ |
| S31 | utils/kernel/ksm/KSM.java | 6.7 | ⬜ |

### I/O
| # | File | KB | Status |
|---|------|----|--------|
| S32 | utils/kernel/io/IO.java | 8.8 | ⬜ |
| S33 | utils/kernel/io/IOAdvanced.java | 8.8 | ⬜ |

### Thermal
| # | File | KB | Status |
|---|------|----|--------|
| S34 | utils/kernel/thermal/Thermal.java | 1.1 | ⬜ |
| S35 | utils/kernel/thermal/MSMThermal.java | 24 | ⬜ |
| S36 | utils/kernel/thermal/MSMThermalSimple.java | 3.9 | ⬜ |
| S37 | utils/kernel/thermal/Thermald.java | 1.8 | ⬜ |

### Battery
| # | File | KB | Status |
|---|------|----|--------|
| S38 | utils/kernel/battery/Battery.java | 17 | ⬜ |

### TCP / Misc / Wake
| # | File | KB | Status |
|---|------|----|--------|
| S39 | utils/kernel/misc/Misc.java | 15.9 | ⬜ |
| S40 | utils/kernel/wake/Wake.java | 1.2 | ⬜ |
| S41 | utils/kernel/wakelock/Wakelocks.java | 14.4 | ⬜ |
| S42 | utils/kernel/screen/Screen.java | 1.1 | ⬜ |

### Profiles
| # | File | KB | Status |
|---|------|----|--------|
| S43 | fragments/tools/ProfileFragment.java | 25.7 | ⬜ |
| S44 | database/tools/profiles/Profiles.java | 5.8 | ⬜ |
| S45 | services/boot/ApplyOnBoot.java | 14.4 | ⬜ |

---

## Xtra-Kernel-Manager (451 files, ~50 relevant)

### Rust Native (xkm_native)
| # | File | KB | Status |
|---|------|----|--------|
| X01 | rust/xkm_native/src/lib.rs | — | ✅ |
| X02 | rust/xkm_native/src/utils.rs | — | ✅ |
| X03 | rust/xkm_native/src/cpu/cpu.rs | — | ✅ |
| X04 | rust/xkm_native/src/cpu/mod.rs | — | ✅ |
| X05 | rust/xkm_native/src/gpu/gpu.rs | — | ✅ |
| X06 | rust/xkm_native/src/gpu/mod.rs | — | ✅ |
| X07 | rust/xkm_native/src/power/power.rs | — | ✅ |
| X08 | rust/xkm_native/src/power/thermal.rs | — | ✅ |
| X09 | rust/xkm_native/src/power/mod.rs | — | ✅ |
| X10 | rust/xkm_native/src/memory/memory.rs | — | ✅ |
| X11 | rust/xkm_native/src/memory/mod.rs | — | ✅ |
| X12 | rust/xkm_native/Cargo.toml | — | ✅ |

### Kotlin — Native Bridge
| # | File | KB | Status |
|---|------|----|--------|
| X13 | domain/native/NativeLib.kt | — | ⬜ |
| X14 | domain/root/RootManager.kt | — | ⬜ |
| X15 | utils/RootShell.kt | — | ⬜ |

### Kotlin — Domain Logic
| # | File | KB | Status |
|---|------|----|--------|
| X16 | domain/SmartCPULocker.kt | — | ⬜ |
| X17 | domain/usecase/CPUControlUseCase.kt | — | ⬜ |
| X18 | domain/usecase/GPUControlUseCase.kt | — | ⬜ |
| X19 | domain/usecase/ThermalControlUseCase.kt | — | ⬜ |

### Kotlin — Data Models
| # | File | KB | Status |
|---|------|----|--------|
| X20 | data/model/CPUInfo.kt | — | ⬜ |
| X21 | data/model/GPUInfo.kt | — | ⬜ |
| X22 | data/model/BatteryInfo.kt | — | ⬜ |
| X23 | data/model/ThermalPolicy.kt | — | ⬜ |
| X24 | data/model/CPULockState.kt | — | ⬜ |

### Kotlin — Repository
| # | File | KB | Status |
|---|------|----|--------|
| X25 | data/repository/KernelRepository.kt | — | ⬜ |
| X26 | data/repository/BatteryRepository.kt | — | ⬜ |

### Kotlin — Services
| # | File | KB | Status |
|---|------|----|--------|
| X27 | service/KernelConfigService.kt | — | ⬜ |
| X28 | service/BatteryInfoService.kt | — | ⬜ |

---

## RvKernel-Manager (118 files, ~15 relevant)

| # | File | KB | Status |
|---|------|----|--------|
| R01 | utils/Utils.kt | — | ⬜ |
| R02 | utils/SoCUtils.kt | — | ⬜ |
| R03 | utils/KernelUtils.kt | — | ⬜ |
| R04 | utils/BatteryUtils.kt | — | ⬜ |
| R05 | ui/soc/SoCViewModel.kt | — | ⬜ |
| R06 | ui/soc/SoCScreen.kt | — | ⬜ |
| R07 | ui/kernelParameter/KernelParameterViewModel.kt | — | ⬜ |
| R08 | ui/kernelParameter/KernelParameterScreen.kt | — | ⬜ |
| R09 | ui/battery/BatteryViewModel.kt | — | ⬜ |
| R10 | ui/battery/BatteryScreen.kt | — | ⬜ |
| R11 | ui/navigation/NavigationRoute.kt | — | ⬜ |
| R12 | ui/navigation/NavigationBar.kt | — | ⬜ |
| R13 | ui/theme/Theme.kt | — | ⬜ |
| R14 | ui/battery/BatteryPreference.kt | — | ⬜ |

---

## ZKM (443 files, ~99 relevant)

### GPU — Adreno
| # | File | KB | Status |
|---|------|----|--------|
| Z01 | utils/AdrenoUtils.kt | 7.2 | ⬜ |
| Z02 | utils/GenericGpuUtils.kt | 6.3 | ⬜ |
| Z03 | ui/gpu/adreno/AdrenoScreen.kt | 19.5 | ⬜ |
| Z04 | ui/gpu/adreno/tabs/AdrenoFreqTab.kt | 12.9 | ⬜ |
| Z05 | ui/gpu/adreno/tabs/AdrenoPowerTab.kt | 10.3 | ⬜ |
| Z06 | ui/gpu/adreno/tabs/AdrenoThermalTab.kt | 13 | ⬜ |
| Z07 | ui/gpu/adreno/tabs/AdrenoAdvancedTab.kt | 18.4 | ⬜ |
| Z08 | ui/gpu/adreno/tabs/AdrenoBusTab.kt | 18.7 | ⬜ |
| Z09 | ui/gpu/adreno/viewmodel/AdrenoViewModel.kt | 12.8 | ⬜ |

### CPU / SoC / Scheduler
| # | File | KB | Status |
|---|------|----|--------|
| Z10 | ui/socmenu/CpuGpuScreen.kt | 40.1 | ⬜ |
| Z11 | ui/socmenu/CpuGpuUtils.kt | 11.6 | ⬜ |
| Z12 | ui/socmenu/SchedulerScreen.kt | 17.6 | ⬜ |
| Z13 | ui/socmenu/SchdulerUtils.kt | 2.2 | ⬜ |
| Z14 | ui/soc/SoCScreen.kt | 17.1 | ⬜ |

### Memory
| # | File | KB | Status |
|---|------|----|--------|
| Z15 | ui/socmenu/MemoryScreen.kt | 20.7 | ⬜ |
| Z16 | ui/socmenu/MemoryUtils.kt | 4.1 | ⬜ |

### Battery
| # | File | KB | Status |
|---|------|----|--------|
| Z17 | ui/socmenu/BatteryUtils.kt | 15.9 | ⬜ |
| Z18 | ui/home/menu/BatteryControllerScreen.kt | 40 | ⬜ |
| Z19 | ui/home/menu/BatteryControllerUtils.kt | 12.9 | ⬜ |
| Z20 | services/BatteryMonitorService.kt | 13.2 | ⬜ |

### Thermal
| # | File | KB | Status |
|---|------|----|--------|
| Z21 | ui/home/menu/ThermalUtils.kt | 8.4 | ⬜ |
| Z22 | ui/home/menu/ThermalDevicesScreen.kt | 49.8 | ⬜ |

### Root
| # | File | KB | Status |
|---|------|----|--------|
| Z23 | utils/RootIpcManager.kt | 1.5 | ⬜ |
| Z24 | utils/ShellExecutor.kt | 1.6 | ⬜ |
| Z25 | services/MtkRootService.kt | 1.9 | ⬜ |

### Overall / Home
| # | File | KB | Status |
|---|------|----|--------|
| Z26 | ui/overall/OverallScreen.kt | 72.1 | ⬜ |
| Z27 | ui/overall/OverallUtils.kt | 22.1 | ⬜ |

---

## AZenith (11 files, 0 source — closed source)

| # | File | KB | Status |
|---|------|----|--------|
| A01 | README.md | 6.3 | ✅ DONE |

---

## Shizuku (300 files, ~20 relevant)

| # | File | KB | Status |
|---|------|----|--------|
| SH01 | server/ShizukuService.java | 23.6 | ⬜ |
| SH02 | server/BinderSender.java | 6.7 | ⬜ |
| SH03 | server/ShizukuUserServiceManager.java | 3.2 | ⬜ |
| SH04 | authorization/AuthorizationManager.kt | 3.4 | ⬜ |
| SH05 | shell/ShizukuShellLoader.java | 6.5 | ⬜ |
| SH06 | manager/ShizukuManagerProvider.kt | 2.7 | ⬜ |
| SH07 | utils/ShizukuSystemApis.kt | 3.4 | ⬜ |

---

## Shizuku-API (119 files, ~15 relevant)

| # | File | KB | Status |
|---|------|----|--------|
| SA01 | api/Shizuku.java | 36.2 | ⬜ |
| SA02 | api/ShizukuBinderWrapper.java | 2.7 | ⬜ |
| SA03 | api/ShizukuRemoteProcess.java | 4.0 | ⬜ |
| SA04 | api/ShizukuServiceConnection.java | 2.1 | ⬜ |
| SA05 | api/ShizukuSystemProperties.java | 1.1 | ⬜ |
| SA06 | api/SystemServiceHelper.java | 5 | ⬜ |
| SA07 | aidl/IShizukuService.aidl | 1.4 | ⬜ |
| SA08 | provider/ShizukuProvider.java | 9.1 | ⬜ |
| SA09 | server-shared/Service.java | 11.5 | ⬜ |

---

## Statistics

| Source | Total | Relevant | Status |
|--------|-------|----------|--------|
| SmartPack | 452 | 45 | 0/45 ⬜ |
| Xtra-Kernel | 451 | 28 | 0/28 ⬜ |
| RvKernel | 118 | 14 | 0/14 ⬜ |
| ZKM | 443 | 27 | 0/27 ⬜ |
| AZenith | 11 | 1 | 1/1 ✅ |
| Shizuku | 300 | 7 | 0/7 ⬜ |
| Shizuku-API | 119 | 9 | 0/9 ⬜ |
| **Total** | **1894** | **131** | **2/131** |

Progress: **10.7%** (14/131)
