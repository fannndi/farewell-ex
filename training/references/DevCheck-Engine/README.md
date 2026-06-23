# DevCheck Engine — Reverse Engineering Reference

**Source:** `DevCheck.apk` (flar2.devcheck)
**Extracted:** 2026-06-23 via jadx + manual analysis
**Status:** Reference source — NOT a buildable project

## Architecture

```
┌──────────────────────────────────────────────────┐
│               DevCheck Engine                      │
│                                                     │
│  Java/Kotlin Layer (decompiled)                     │
│  ├── GpuBridge → nGetAdrenoInfo() / nGetMaliInfo() │
│  ├── MainBridge → native system info init           │
│  ├── ThermalHeadroomNative → getThermalHeadroom()  │
│  ├── BenchSuiteBridge → 40+ benchmark methods      │
│  ├── BatteryMonitorService → BatteryManager API    │
│  └── Monitor*Window → overlay monitoring windows   │
│                                                     │
│  Native Layer (libdevcheck.so, libbenchmarksuite.so)│
│  ├── GpuBridge → open("/dev/kgsl-3d0") + IOCTL     │
│  │   └── libgpuinfo → get_gpu_id/get_gpu_name/etc  │
│  ├── ThermalHeadroomNative → AThermal NDK           │
│  └── BenchSuiteBridge → GPU/CPU/memory benchmarks   │
└──────────────────────────────────────────────────┘
```

## Key Files

| File | Description |
|------|-------------|
| `java/flar2/devcheck/nativebridge/GpuBridge.java` | JNI → AdrenoInfo/MaliInfo via /dev/kgsl-3d0 IOCTL |
| `java/flar2/devcheck/nativebridge/MainBridge.java` | JNI → native system info |
| `java/flar2/devcheck/temperature/ThermalHeadroomNative.java` | AThermal NDK API wrapper |
| `java/flar2/devcheck/gpu/adreno/AdrenoInfo.java` | Adreno GPU data class |
| `java/flar2/devcheck/gpu/mali/MaliInfo.java` | Mali GPU data class |
| `java/flar2/devcheck/monitors/` | Overlay monitors (CPU, GPU, Current, Temp...) |
| `java/flar2/devcheck/BatteryMonitor/` | BatteryManager API service |
| `java/flar2/devcheck/utils/` | Shell utilities, Shizuku integration |
| `lib/arm64-v8a/libdevcheck.so` | Native library (KGSL IOCTL + AThermal) |
| `lib/arm64-v8a/libbenchmarksuite.so` | Benchmark native library |

## Key Technique: GPU via /dev/kgsl-3d0 IOCTL

DevCheck reads GPU data WITHOUT root by:
1. Loading `libdevcheck.so` (System.loadLibrary)
2. Calling `GpuBridge.nGetAdrenoInfo()` (JNI)
3. Native code: `open("/dev/kgsl-3d0")` → `ioctl(fd, KGSL_IOCTL_GETPROP, ...)`
4. Returns AdrenoInfo with chip ID, GPU ID, GMEM size, MMU status

The IOCTL works because `/dev/kgsl-3d0` has SELinux label `kgsl_device`
which is different from `sysfs` that SELinux blocks.

## Battery Reading (No Root)

DevCheck uses `BatteryManager.getIntProperty()` Java API, NOT sysfs.
Works on ALL Android versions without root.

## Thermal Reading

Uses Android NDK `AThermal_getThermalHeadroom()` via native bridge.
Available since API 30 (Android 11).

## Obfuscation

DevCheck uses string obfuscation for:
- Native library names (e.g., `RIhTGWkqQvGL.bEBl`)
- Some sysfs paths
- Some shell commands

The native lib names stored in `RIhTGWkqQvGL` class are populated at
runtime by an obfuscation layer (defpackage).
