# Leftover Features — Implementation Path (v2.0)

> **Status:** 5/6 features require ZygiskNext + LSPosed/Vector — install separately.
> **farewell-ex** hanya detect + provide config UI saat framework tersedia.
> **ZygiskNext:** github.com/Dr-TSNG/ZygiskNext
> **LSPosed:** github.com/LSPosed/LSPosed
> **Vector:** github.com/JingMatrix/Vector

---

## Tier System Rekap

| Tier | Framework | Fungsi | Referensi |
|------|-----------|--------|-----------|
| 3 | KernelSU-Next | Root akses, sysfs write, resetprop, mount | `modules/23-kernelsu-next.md` |
| 4 | ZygiskNext | Zygote hook, per-app mount namespace, mmap | `modules/21-zygisknext.md` |
| 5 | Vector | ART hook via LSPlant, Xposed API | `modules/22-vector.md` |

---

## 1. Per-App GPU Renderer — SkiaShift Perfect

**Status:** 🔧 Implementasi pending — butuh Vector module

**Yang sudah:** Global renderer switch (`renderer.rs` — resetprop)
**Yang kurang:** Per-app override via `__system_property_get` hook

**Implementation path:**
1. Buat Vector (Xposed) module yang hook `__system_property_get` di native
2. Hook 6 functions: `__system_property_get`, `__system_property_read_callback`, `__system_property_wait`, `__system_property_foreach`, `__system_property_find`, `__system_property_read`
3. Return value berbeda per-process berdasarkan foreground app
4. Deploy sebagai KernelSU module (`/data/adb/modules/farewell-renderer/`)

**Referensi:** `modules/22-vector.md` (LSPlant ART hook), `renderer.rs` (VULKAN_PROPS, OPENGL_PROPS)
**Tier unlock:** 5 (Vector)

---

## 2. Per-Process COW Property Spoof — COPG Complete

**Status:** 🔧 Implementasi pending — butuh ZygiskNext companion

**Yang sudah:** Global device spoof (`spoof.rs` — resetprop 16 props + mount --bind cpuinfo)
**Yang kurang:** Per-process `mmap(MAP_PRIVATE|MAP_FIXED)` pada `/dev/__properties__`

**Implementation path:**
1. Buat ZygiskNext companion process yang handle mmap injection
2. Di `postAppSpecialize` (sebelum app start), inject mmap untuk override properties
3. Copy-on-write: perubahan hanya visible ke process target
4. Deploy via KernelSU module

**Referensi:** `modules/21-zygisknext.md` (Module API v1, companion IPC)
**Tier unlock:** 4 (ZygiskNext)

---

## 3. Per-Process Android ID Forge

**Status:** 🔧 Implementasi pending — butuh ZygiskNext

**Yang sudah:** —
**Yang kurang:** Forge `Settings$Secure.sNameValueCache` di ART heap

**Implementation path:**
1. ZygiskNext companion → inject ke target process via ptrace/Zygote hook
2. Modify `Settings$Secure.AndroidId` in-memory
3. Atau hook `ContentResolver.query` untuk return forged value

**Referensi:** COPG (ART heap modification), `modules/21-zygisknext.md`
**Tier unlock:** 4 (ZygiskNext)

---

## 4. Per-App DPI Tanpa Flicker — DPIS Complete

**Status:** 🔧 Implementasi pending — butuh Vector module

**Yang sudah:** Global DPI (`display_control.rs` — `wm density`)
**Yang kurang:** Per-app DPI via `Display.getMetrics()` hook

**Implementation path:**
1. Buat Vector module yang hook `Display.getMetrics()`, `Display.getSize()`, `ResourcesImpl.updateConfiguration()`
2. Intercept `Configuration.fontScale` di `launch-activity-item` lifecycle
3. Return nilai DPI berbeda per-app berdasarkan package name
4. Zero flicker karena hook terjadi sebelum UI render

**Referensi:** `modules/22-vector.md` (ART hook), DPIS original (Xposed hooks)
**Tier unlock:** 5 (Vector)

---

## 5. Per-App Mount Namespace Isolation

**Status:** 🔧 Implementasi pending — butuh ZygiskNext companion

**Yang sudah:** Global `/proc/cpuinfo` spoof via `mount --bind`
**Yang kurang:** Per-app mount namespace via `unshare(CLONE_NEWNS)`

**Implementation path:**
1. ZygiskNext companion → hook Zygote fork
2. Sebelum app specialization, panggil `unshare(CLONE_NEWNS)`
3. Lalu `mount --bind {custom} /proc/cpuinfo` di namespace baru
4. Setiap app punya view `/proc/cpuinfo` sendiri

**Referensi:** `modules/21-zygisknext.md` (Module API v1, companion)
**Tier unlock:** 4 (ZygiskNext)

---

## 6. Shizuku UserService AIDL

**Status:** 🔧 Implementasi pending — upgrade dari deprecated API

**Yang sudah:** Shizuku shell exec via `Shizuku.newProcess()` (deprecated di API 14)
**Yang kurang:** UserService AIDL untuk proper service binding

**Implementation path:**
1. Define `IShellService.aidl` dengan method `exec(command)` → `String`
2. Implement `ShellService` di app process
3. `Shizuku.bindUserService()` untuk start service sebagai root/shell
4. Route semua shell commands via UserService, bukan `newProcess()`

**File:** `ShizukuManager.kt`
**Tier unlock:** 2 (ADB/Shizuku)

---

## Implementation Priority

```
Priority 1 — Vector module per-app renderer
  ├── Build Vector module (.apk)
  ├── Hook __system_property_get (6 functions)
  ├── Deploy via KernelSU module system
  └── (Sumber: modules/22-vector.md, renderer.rs)

Priority 2 — ZygiskNext companion COW spoof
  ├── Build ZygiskNext module (.zip)
  ├── mmap injection pada /dev/__properties__
  ├── Companion IPC untuk komunikasi dengan app
  └── (Sumber: modules/21-zygisknext.md, spoof.rs)

Priority 3 — Vector module per-app DPI
  ├── Hook Display.getMetrics() + ResourcesImpl
  ├── Package-based config lookup
  ├── Zero flicker config switch
  └── (Sumber: modules/22-vector.md, display_control.rs)

Priority 4 — Fix GPU IOCTL constants
  ├── Analisa kernel KGSL header untuk correct ioctl request code
  ├── Test dengan berbagai konfigurasi property type
  ├── Alternatif: port DevCheck's libgpuinfo library langsung
  └── (Referensi: modules/27-kgsl-ioctl-bypass.md)

Priority 5 — Shizuku UserService AIDL upgrade
  ├── Define IShellService.aidl
  ├── Implement ShellService
  ├── Replace newProcess() reflection with UserService
  └── (Referensi: modules/28-android-api-reading.md)
```

## SELinux Bypass Reference — DevCheck Analysis

**Source:** `DevCheck.apk` reverse engineering (libdevcheck.so + libgpuinfo)
**Status:** ✅ EXTRACTED — see `training/references/DevCheck-Sysfs-Bypass/`

### Key Findings

DevCheck reads system data WITHOUT root on MIUI 14 via:

| Data | Method | SELinux Label | Status |
|------|--------|--------------|--------|
| GPU | `/dev/kgsl-3d0` IOCTL | `kgsl_device` | ✅ Bisa (ioctl constant perlu tepat) |
| Battery | `BatteryManager` Android API | system API | ✅ Bisa |
| Temp | `AThermal` NDK C API | system API | ✅ Bisa (API 30+) |

### Why Not Sysfs

```
/sys/class/kgsl/*            → SELinux: sysfs → DENIED
/sys/class/power_supply/*    → SELinux: sysfs → DENIED
/proc/stat via JNI libc open → SELinux: proc  → DENIED

/dev/kgsl-3d0                → SELinux: kgsl_device → ALLOWED
BatteryManager.getIntProperty()  → system API → ALLOWED
AThermal_getThermalHeadroom()    → NDK API (API 30+) → ALLOWED
```

### Files

| File | Role |
|------|------|
| `training/references/DevCheck-Sysfs-Bypass/` | All reference source code |
| `knowledge/modules/27-kgsl-ioctl-bypass.md` | KGSL IOCTL documentation |
| `knowledge/modules/28-android-api-reading.md` | Android API reading |
| `knowledge/modules/29-fallback-chain.md` | Fallback chain architecture |
