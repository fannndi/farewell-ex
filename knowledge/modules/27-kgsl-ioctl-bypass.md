# Module 27: KGSL IOCTL — Sysfs Bypass via /dev/kgsl-3d0

**Source:** `DevCheck.apk` reverse engineering (libdevcheck.so + libgpuinfo)
**Status:** ✅ EXTRACTED (reference code in `training/references/DevCheck-Sysfs-Bypass/`)

## Problem

MIUI 14 SELinux policy blocks `untrusted_app` from reading:
- `/sys/class/kgsl/kgsl-3d0/gpuclk` → Permission denied
- `/sys/class/kgsl/kgsl-3d0/gpubusy` → Permission denied
- `/sys/class/power_supply/battery/*` → Permission denied

Even Shizuku (ADB shell level) gets Permission denied on these paths.

## Solution: KGSL Char Device IOCTL

DevCheck bypasses SELinux by using **`/dev/kgsl-3d0` char device** with **`ioctl()`** instead of sysfs.

```
DevCheck → libdevcheck.so → libgpuinfo → open("/dev/kgsl-3d0")
    → ioctl(fd, KGSL_IOCTL_GETPROP, { type, buffer, size })
    → read GPU freq, busy, model, version
```

## SELinux Context Difference

| Access Path | SELinux Label | App Access |
|-------------|--------------|------------|
| `/sys/class/kgsl/kgsl-3d0/gpuclk` | `u:object_r:sysfs:s0` | **DENIED** (sysfs) |
| `/dev/kgsl-3d0` | `u:object_r:kgsl_device:s0` | **ALLOWED** (device) |

SELinux labels different sysfs vs device nodes differently. The KGSL char device has its own domain label that allows read IOCTL from apps.

## IOCTL Protocol

### `KGSL_IOCTL_GETPROP` (0x09)

```c
struct kgsl_device_getproperty {
    uint32_t type;    // property type ID
    void    *value;   // output buffer
    uint32_t size;    // buffer size
};
```

### Property Types (from DevCheck + KGSL header)

| Type | Constant | Purpose | Output |
|------|----------|---------|--------|
| 1 | `KGSL_PROP_VERSION` | Driver version | uint32_t |
| 2 | `KGSL_PROP_BUSY_CYCLES` | GPU busy cycles | `{uint64_t busy, uint64_t total}` |
| 6 | `KGSL_PROP_GPUCLK` | Current GPU freq | uint32_t (Hz) |
| 4 | `KGSL_PROP_GPU_ID` | GPU chip ID | uint32_t |
| 16 | `KGSL_PROP_VERSION_INFO` | GPU version | `{uint32_t drv_mj, drv_mn, dev_mj, dev_mn}` |
| 30 | `KGSL_PROP_GPUOBJ_INFO` | GPU objects | Binary |

## JNI Bridge for Rust

```rust
fn read_gpu_freq_ioctl() -> Option<i32> {
    let fd = unsafe { libc::open("/dev/kgsl-3d0\0", O_RDONLY) };
    if fd < 0 { return None; }
    let mut buf = [0u8; 8];
    let ret = kgsl_ioctl(fd, KGSL_IOCTL_GETPROP, &KgslGetProperty {
        prop_type: 6,    // KGSL_PROP_GPUCLK
        value: buf.as_mut_ptr() as _,
        size: buf.len() as u32,
    });
    libc::close(fd);
    if ret != 0 { return None; }
    let hz = u32::from_ne_bytes(buf[..4].try_into().unwrap());
    Some(if hz > 1_000_000 { hz / 1_000_000 } else if hz > 1000 { hz / 1000 } else { hz } as i32)
}
```

## Files

| File | Role |
|------|------|
| `references/DevCheck-Sysfs-Bypass/kgsl_ioctl.h` | C header with ioctl constants + structs |
| `references/DevCheck-Sysfs-Bypass/gpu_kgsl_ioctl.c` | C implementation |
| `references/DevCheck-Sysfs-Bypass/gpu_kgsl_ioctl.rs` | Rust binding + fallback chain |
| `references/DevCheck-Sysfs-Bypass/battery_android_api.kt` | BatteryManager alternative |
| `references/DevCheck-Sysfs-Bypass/thermal_athermal.c` | NDK AThermal thermal reading |
| `references/DevCheck-Sysfs-Bypass/fallback_chain.kt` | Orchestrator: IOCTL → API → sysfs → shell |
