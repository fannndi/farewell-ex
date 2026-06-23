# Module 29: Fallback Chain Architecture

**Source:** farewell-ex app (MainViewModel, ShizukuManager, BatteryAndroidReader)
**Status:** ✅ IMPLEMENTED — tested on MIUI 14 (Android 13, POCO X3 NFC)

## Problem Solved

MIUI 14 SELinux blocks `untrusted_app` from reading critical sysfs paths:
- GPU (`/sys/class/kgsl/kgsl-3d0/*`)
- Battery (`/sys/class/power_supply/battery/*`)
- CPU load (`/proc/stat` via JNI)

No single access method works for all paths. Need a **fallback chain**.

## Architecture

```
┌─────────────────────────────────────────────────┐
│                   MainViewModel                  │
│                    refresh()                     │
├─────────────────────────────────────────────────┤
│                  FallbackChain                   │
│                                                  │
│  GPU:  IOCTL → sysfs → shell                    │
│  Bat:  AndroidAPI → sysfs → shell               │
│  CPU:  NativeLib → Shizuku shell → error         │
│  Temp: NativeLib thermal zone → 0                 │
└─────────────────────────────────────────────────┘
```

## Access Methods Tested on MIUI 14

| Method | SELinux Level | GPU | Battery | CPU | Cost |
|--------|--------------|-----|---------|-----|------|
| NativeLib (JNI) | `untrusted_app` | ❌ | ❌ | ❌ | None |
| `/dev/kgsl-3d0` (IOCTL) | `kgsl_device` | ✅ (constant varies) | — | — | None |
| `BatteryManager` API | system API | — | ✅ | — | None |
| Shizuku `newProcess` | `shell` (ADB) | ❌ | ❌ | ✅ | Shizuku |
| Root (KernelSU) | `root` | ✅ | ✅ | ✅ | Root access |

## Working Reads

| Data | Method | Code | Result |
|------|--------|------|--------|
| CPU Load | Shizuku shell `/proc/stat` | `Runtime.exec("cat /proc/stat")` via newProcess | ✅ 56.9% |
| CPU Temp | Thermal zone via NativeLib | `sysfs::read_sysfs("/sys/class/thermal/thermal_zone*/temp")` | ✅ 37°C |
| Battery Level | Android `BatteryManager` intent | `BatteryManager.EXTRA_LEVEL * 100 / EXTRA_SCALE` | ✅ 64% |
| Battery Temp | Android `BatteryManager` intent | `BatteryManager.EXTRA_TEMPERATURE / 10` | ✅ 41°C |
| GPU Freq | ALL METHODS FAILED | IOCTL constants wrong, SELinux blocks everything | ❌ 0 MHz |
| GPU Load | ALL METHODS FAILED | Same as above | ❌ 0% |

## Why GPU IOCTL Failed

Device node `/dev/kgsl-3d0` exists with `crw-rw-rw-` permissions. But:
1. `cat /dev/kgsl-3d0` → returns "OH HAI GPU" (test message) ✅ device accessible
2. `ioctl(fd, KGSL_IOCTL_GETPROP, ...)` → returns -1
3. Root cause: IOCTL request constant differs per kernel version. DevCheck may use hardcoded offsets or version-specific values. Requires kernel header analysis or reverse engineering to get correct values.

## Key Implementation Files

| File | Function |
|------|----------|
| `kernel/AccessManager.kt` | Access mode detection (ROOT/SHIZUKU/NON_ROOT) |
| `kernel/ShizukuManager.kt` | Shizuku IPC via reflection on `newProcess()` |
| `kernel/BatteryAndroidReader.kt` | BatteryManager intent API |
| `kernel/RootManager.kt` | Root shell via libsu |
| `kernel/NativeLib.kt` | Rust JNI bridge (IOCTL + sysfs) |
| `viewmodel/MainViewModel.kt` | Refresh loop with fallback chain |
| `ui/screens/AccessScreen.kt` | 5-tier access checker UI |
| `ui/screens/Dashboard.kt` | HomeScreen with tuning sections |

## Known Limitations

1. **GPU IOCTL**: Requires correct IOCTL request constant per kernel/SoC. Currently returns 0 for all paths on MIUI 14 + Adreno 618.
2. **Shizuku**: `newProcess()` is deprecated in API 14. Future-proofing requires UserService AIDL (see leftover.md).
3. **BatteryManager**: Works for level/temp/voltage but NOT cycle count (requires sysfs or root).
4. **CPU load**: Only works via Shizuku shell (JNI reads blocked by SELinux).
