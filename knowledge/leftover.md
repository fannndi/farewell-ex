# Leftover Features — Membutuhkan System-Level Binary/Framework

Fitur-fitur berikut **tidak bisa diimplementasikan hanya dengan KernelSU root**.
Ditandai sebagai leftover untuk future implementation via custom binary yang ditanam di OS.

---

## 1. Per-App GPU Renderer (SkiaShift Perfect Mode)

**Status:** Global toggle implemented via `renderer.rs` (resetprop)
**Leftover:** Per-app perfect override (no flicker)

**Masalah:**
- Properties (`ro.hwui.use_vulkan`, `debug.hwui.renderer`) adalah process-wide shared memory
- Tidak bisa return value berbeda per-process tanpa hooking
- `wm density` + foreground detect punya 200-500ms flicker

**Solusi yang dibutuhkan:**
1. **ReZygisk** — Zygisk implementation untuk KernelSU, enable native injection
2. **Custom kernel module** — Patch kernel untuk per-process property mapping
3. **LSPosed** — Hook `__system_property_get` per-process

**File referensi:** `renderer.rs:117` (TODO marker)

---

## 2. Per-Process COW Property Spoof (COPG Advanced)

**Status:** Global device spoof implemented via `spoof.rs` (resetprop + mount --bind)
**Leftover:** Per-process COW (Copy-On-Write) property spoof

**Masalah:**
- COPG menggunakan `mmap(MAP_PRIVATE | MAP_FIXED)` pada `/dev/__properties__` pages
- Ini membuat copy private per-process, jadi perubahan tidak visible ke process lain
- Butuh Zygisk companion untuk inject mmap sebelum app specialization

**Solusi yang dibutuhkan:**
1. **ReZygisk companion** — Inject mmap per-process sebelum zygote fork
2. **Custom init binary** — Modify property service untuk per-process mapping

**File referensi:** `spoof.rs:184` (TODO marker)

---

## 3. Per-Process Android ID Forge (COPG Advanced)

**Status:** Global device spoof implemented
**Leftover:** Per-process Android ID spoof

**Masalah:**
- Android ID stored di `Settings.Secure` database, bukan system property
- COPG forge `Settings$Secure.sNameValueCache` di ART heap per-process
- Butuh JNI injection ke target process untuk modify cache

**Solusi yang dibutuhkan:**
1. **Zygisk JNI injection** — Inject ke zygote child sebelum app loads
2. **ptrace injection** — Attach ke target process, modify memory (fragile)

**File referensi:** `spoof.rs:184` (TODO marker)

---

## 4. Per-App DPI Without Flicker (DPIS Perfect Mode)

**Status:** Global DPI implemented via `display_control.rs` (wm density)
**Leftover:** Per-app DPI without 200-500ms flicker

**Masalah:**
- `wm density` triggers Configuration change → Activity recreation (visible flicker)
- DPIS hooks `Display.getMetrics()`, `ResourcesImpl.updateConfiguration()` per-process
- Intercept `Configuration.fontScale` at `launch-activity-item` lifecycle point
- Tidak ada shell command equivalent untuk per-app DisplayMetrics override

**Solusi yang dibutuhkan:**
1. **LSPosed** — Hook Display.getMetrics() per-process
2. **ReZygisk + LSPosed** — Install LSPosed via ReZygisk on KernelSU
3. **Custom WindowManager service** — Modify Android framework for per-app config

**File referensi:** `display_control.rs:102` (TODO marker)

---

## 5. Per-App Mount Namespace Isolation

**Status:** Global CPU spoof implemented via mount --bind
**Leftover:** Per-app /proc/cpuinfo spoof (different content per app)

**Masalah:**
- `mount --bind` affects all processes globally
- Per-app mount butuh `unshare(CLONE_NEWNS)` sebelum app specialization
- Zygote fork tidak inherit mount namespace dari shell

**Solusi yang dibutuhkan:**
1. **Zygisk companion** — `unshare(CLONE_NEWNS)` + mount --bind sebelum app start
2. **Custom zygote patch** — Modify zygote to support per-app mount namespaces
3. **Kernel namespace patch** — Custom kernel untuk per-app mount namespace

**File referensi:** `spoof.rs:184` (TODO marker)

---

## 6. Shizuku UserService (AIDL) — Replace Deprecated newProcess

**Status:** Shizuku shell exec implemented via `newProcess` (deprecated)
**Leftover:** UserService AIDL for proper service binding

**Masalah:**
- `Shizuku.newProcess()` deprecated, akan dihapus di API 14
- UserService butuh AIDL interface + ServiceConnection
- Lebih complex tapi lebih reliable

**Solusi yang dibutuhkan:**
1. Define AIDL interface `IShellService.aidl`
2. Implement `ShellService` di app
3. `Shizuku.bindUserService()` untuk start service as root/ADB
4. Route semua shell commands via UserService instead of newProcess

**File referensi:** `ShizukuManager.kt:39` (newProcess usage)

---

## Custom Binary Plan (Future)

Untuk implement leftover features tanpa framework external:

```
/system/bin/farewell-daemon
├── early-init: mount namespace setup
├── post-fs-data: property spoof + boot config
├── zygote-hook: per-process injection (custom)
├── foreground-monitor: per-app profile switching
└── property-override: per-process COW property
```

**Implementation path:**
1. Write daemon binary in Rust (cross-compile for Android)
2. Install as KernelSU module (`/data/adb/modules/farewell/`)
3. `post-fs-data.sh` starts daemon
4. Daemon hooks zygote via custom mechanism
5. Per-app features work without LSPosed/Zygisk

**Estimated complexity:** High — butuh custom zygote hooking mechanism
**Alternative:** Install ReZygisk → all leftover features unlocked
