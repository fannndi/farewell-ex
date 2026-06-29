# Farewell Kernel Manager

**Target:** POCO X3 NFC (surya/karna) — Qualcomm SM6150  
**Rust SDK:** 27 modules · 9,903 lines · 269 JNI exports  
**Knowledge:** 18 source repos · Stock ROM vendor extraction  

---

## Architecture

### ROM-Side Daemon (kernel tuning tanpa root)

```
┌──────────────────────────────────────────────────┐
│  farewelld — Native C daemon di vendor partition  │
├──────────────────────────────────────────────────┤
│  /vendor/bin/hw/farewelld                         │
│  /vendor/etc/init/farewell.rc                     │
│  /vendor/etc/selinux/farewell_service.cil          │
└────────────┬─────────────────────────────────────┘
             │ Unix socket: /dev/socket/farewell
┌────────────▼─────────────────────────────────────┐
│  App (untrusted_app)                              │
│                                                   │
│  ┌─────────────────────────────────────────────┐  │
│  │ SocketClient.kt                              │  │
│  │ send("write /sys/.../scaling_governor perf") │  │
│  │ send("check /sys/.../target_freq")           │  │
│  │ send("read /proc/version")                   │  │
│  └─────────────────────────────────────────────┘  │
└──────────────────────────────────────────────────┘
```

**Flow:** App → Unix socket → `farewelld` (vendor context) → sysfs write ✅  
**SELinux:** `farewell_service` domain diizinkan write ke semua sysfs path  

### App (tanpa daemon — fallback monitoring)

Jika daemon tidak terdeteksi, app tetap bisa:

| Mode | Bisa | Tidak Bisa |
|------|------|------------|
| **Monitoring** | CPU/GPU/Battery/Thermal read | — |
| **Diagnostic** | 43/43 PASS (cek fitur) | — |
| **Daemon connected** | All writes ✅ | — |
| **No daemon** | Read-only | Write sysfs ❌ |

---

## 18 Source References

| # | Repo | Digunakan Untuk |
|---|------|----------------|
| 1 | **SmartPack-Kernel-Manager** | Sysfs catalog, KCAL, bypass charging, hotplug |
| 2 | **Xtra-Kernel-Manager** | Rust JNI bridge, I/O engine pattern |
| 3 | **ZKM** | GPU discovery, Bus DCVS, Material 3 UI |
| 4 | **AZenith** | Game detection, bypass auto-discovery |
| 5 | **Encore Tweaks** | C++ daemon, SoC-aware profiler |
| 6 | **SkiaShift** | GPU renderer switch, resetprop |
| 7 | **DPIS** | DPI scaling, DisplayMetrics hooks |
| 8 | **COPG** | mmap COW property spoof |
| 9 | **Shizuku+API** | Binder IPC, UserService |
| 10 | **RvKernel** | Dynamic probing, Material 3 UI |
| 11 | **KernelSU-Next** | Kernel root, module system |
| 12 | **ZygiskNext** | Zygisk API, companion IPC |
| 13 | **Vector** | LSPlant ART hook |
| 14 | **LogFox** | Crash logging, logcat parser |
| 15 | **DevCheck** | KGSL IOCTL, BatteryManager API |
| 16 | **ZN-AuditPatch** | Audit log replacement |
| 17 | **FPSViewer** | SurfaceFlinger FPS overlay |
| 18 | **Xiaomi Stock ROM** | 200+ sysfs paths verified |

---

## Stock ROM Vendor Extraction

**Source:** `vendor/etc/init/*.rc` (271 sysfs references)  
**Source:** `vendor/etc/selinux/vendor_sepolicy.cil`  
**Source:** `vendor/build.prop`, `vendor/build_surya.prop`  

### Sysfs Path Catalog

| Kategori | Path | Fungsi |
|----------|------|--------|
| CPU Governor | `/sys/devices/system/cpu/cpufreq/policy0/scaling_governor` | Governor selection |
| CPU Freq | `/sys/devices/system/cpu/cpufreq/policy0/scaling_max_freq` | Max freq limit |
| CPU Core | `/sys/devices/system/cpu/cpu{N}/online` | Core online/offline |
| GPU Freq | `/sys/class/kgsl/kgsl-3d0/gpuclk` | GPU clock |
| GPU Power | `/sys/class/kgsl/kgsl-3d0/max_pwrlevel` | Power level |
| GPU Model | `/sys/kernel/gpu/gpu_model` | GPU model string |
| Xiaomi Charge | `/sys/class/qcom-battery/reverse_chg_mode` | Reverse charging |
| Xiaomi Charge | `/sys/class/qcom-battery/night_charging` | Night charging |
| Xiaomi Charge | `/sys/class/qcom-battery/cool_mode` | Cool mode |
| Xiaomi Charge | `/sys/class/qcom-battery/smart_batt` | Smart battery |
| Xiaomi Display | `/sys/devices/platform/kcal_ctrl.0/kcal` | KCAL color |
| Xiaomi Haptic | `/sys/bus/i2c/drivers/aw8697_haptic/2-005a/f0_save` | LRA freq |
| USB PD | `/sys/class/usbpd/usbpd0/usbpd_verifed` | USB PD auth |
| Battery | `/sys/class/power_supply/battery/capacity` | Battery level |
| Thermal | `/sys/class/thermal/thermal_message/sconfig` | Thermal config |
| Writable by | `farewell_service` (daemon) | via SELinux policy |

### HAL Services (from vendor/etc/init/*.rc)

| Service | Binary | Fungsi |
|---------|--------|--------|
| `vendor.xiaomi.hardware.micharge` | `.../micharge@1.0-service` | Xiaomi charging control |
| `vendor.xiaomi.hardware.displayfeature` | `.../displayfeature@1.0-service` | Display features |
| `vendor.xiaomi.hardware.touchfeature` | `.../touchfeature@1.0-service` | Touch control |
| `vendor.xiaomi.hardware.vibratorfeature` | `.../vibratorfeature.service` | Haptic control |
| `batterysecret` | `vendor/bin/batterysecret` | USB PD authentication |

---

## Build

```bash
# 1. Rust SDK (native library)
cd rust/kernel-manager
cargo ndk -t arm64-v8a -o ../../android/app/src/main/jniLibs build --release

# 2. Android app
cd android
$env:JAVA_HOME = "C:\Program Files\Android\openjdk\jdk-21.0.8"
./gradlew assembleDebug
# → android/app/build/outputs/apk/debug/app-arm64-v8a-debug.apk

# 3. Farewell daemon (ROM-side)
cd tools
aarch64-linux-android31-clang -O2 -static -o farewelld farewelld.c
```

---

## Inject ke Custom ROM

```
1. Unpack super.img (simg2img + lpunpack)
2. Mount vendor.img
3. copy farewelld → vendor/bin/hw/         (chmod 755)
4. copy farewell.rc → vendor/etc/init/      (chmod 644)
5. copy farewell_service.cil → vendor/etc/selinux/ (chmod 644)
6. Edit vendor_file_contexts → +1 baris
7. Umount → repack super.img
8. fastboot flash super super.img
9. Install app via adb
```

---

## Diagnostic

| Feature | Rust | JNI | Kotlin UI |
|---------|------|-----|-----------|
| CPU Governor R/W | ✅ cpu.rs | ✅ | ✅ SoCScreen |
| CPU Freq R/W | ✅ cpu.rs | ✅ | ✅ SoCScreen |
| GPU Freq/Model | ✅ gpu.rs | ✅ | ✅ SoCScreen |
| GPU Power Levels | ✅ gpu.rs | ✅ | ✅ SoCScreen |
| Battery API | ✅ power.rs | ✅ | ✅ Dashboard |
| Xiaomi Charging | ✅ power_xiaomi.rs | ✅ | ✅ Battery |
| KCAL Display | ✅ display_xiaomi.rs | ✅ | ✅ Display |
| AW8697 Haptic | ✅ haptic.rs | ✅ | ✅ Xiaomi |
| QCOM Boot | ✅ boot_qcom.rs | ✅ | ✅ Xiaomi |
| STune/Cpuset | ✅ stune.rs | ✅ | ✅ SoC Adv |
| Memory/ZRAM | ✅ memory.rs | ✅ | ✅ Memory |
| Thermal | ✅ thermal.rs | ✅ | ✅ Thermal |
| Kernel Params | ✅ network.rs, sysctl_qcom.rs | ✅ | ✅ Kernel |
| Feature Checker | ✅ checker.rs | ✅ | ✅ Diagnostic |

**Total: 151/169 fitur (89%) — 27 Rust modules, 269 JNI exports**

---

## Project Structure

```
farewell-ex/
├── rust/kernel-manager/src/    ← 27 Rust modules (sysfs engine)
├── android/app/src/main/java/  ← Kotlin/Compose UI
│   ├── kernel/                 ← NativeLib, AccessManager, daemon
│   ├── viewmodel/              ← 7+ ViewModels
│   └── ui/                     ← Compose screens + widgets
├── knowledge/                  ← Feature catalog + references
├── tools/                      ← Daemon source + build scripts
├── data/                       ← Project registry
└── training/references/        ← 18 cloned source repos
```
