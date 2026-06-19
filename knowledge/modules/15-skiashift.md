# Module 15: SkiaShift — Per-App GPU Renderer Control

**Source:** `SkiaShift/` (LSPosed module)
**Status:** ✅ VERIFIED — bytehook+shadowhook import & 6 hook functions confirmed

## Architecture

3-layer system property interception — no direct GPU control.

```
Kotlin UI (Compose + Miguix) → App list, per-app dropdown, import/export
LSPosed Module              → SkiaShiftModule.kt, injects into scoped processes
Native Hook (skiashift.cpp) → ByteHook + ShadowHook, intercepts 6 property read functions
```

---

## GPU Interception Mechanism

SkiaShift does NOT control GPU directly. It intercepts **Android system property reads** to lie about which renderer is active.

HWUI decides rendering pipeline at init by reading:
- `ro.hwui.use_vulkan` — master toggle
- `debug.hwui.renderer` — explicit renderer (`skiavk` / `skiagl`)
- `debug.renderengine.backend` — threaded backend
- `debug.hwui.use_buffer_age` — Vulkan buffer-age
- `renderthread.skia.reduceopstasksplitting` — Vulkan task split
- `debug.hwui.skia_use_perf_hint` — perf hinting

---

## 6 Hooked Functions

| Function | Hook Tool | Scope | Why |
|----------|-----------|-------|-----|
| `__system_property_get` | ByteHook | All libs | Primary C API |
| `property_get` | ByteHook | All libs | Legacy NDK |
| `property_get_bool` | ByteHook | All libs | Boolean wrapper |
| `android::base::GetProperty` | ByteHook | All libs | C++ std::string |
| `android::base::GetBoolProperty` | ByteHook | All libs | C++ bool |
| `__system_property_read_callback` | ShadowHook | libc.so only | Internal Bionic calls |
| `__system_property_find` | ShadowHook | libc.so only | Internal Bionic |

**Why two engines:**
- **ByteHook** — PLT hook. Safe, catches external calls via GOT/PLT.
- **ShadowHook** — Inline hook. Catches internal calls within libc.so that bypass PLT.

---

## Per-App Flow

1. **Boot:** `BootReceiver` runs `resetprop` via `su -c` to set global renderer props
2. **Save:** `exportConfig()` writes `skiashift_config.json` to `/data/local/tmp/`
3. **App launch:** LSPosed injects `SkiaShiftModule.kt` into scoped process
4. **Module init:** loads `skiashift` native lib, reads config, matches processName
5. **Native:** `setRendererNative(renderer)` sets global `OVERRIDE_VALUE` char buffer
6. **On property query:** All 6 hooked functions check key, return overridden value or delegate

---

## Key Files

| File | Role |
|------|------|
| `skiashift.cpp` | Core native hook engine — 6 hooks, ByteHook+ShadowHook init |
| `SkiaShiftModule.kt` | LSPosed XposedModule entry, reads config, calls setRendererNative |
| `SkiaShiftProvider.kt` | ContentProvider for config URI |
| `MainActivity.kt` | Compose UI — app list, global toggle, import/export |
| `AppManager.kt` | App enumeration from PackageManager + LSPosed scope DB |
| `BootReceiver.kt` | Boot broadcast — applies global renderer via resetprop |

---

## Key Patterns

1. **Property interception** — Hook system property reads, not GPU hardware
2. **Dual hook engine** — ByteHook (PLT) + ShadowHook (inline) for complete coverage
3. **Per-app granularity** — Each app can have different renderer setting
4. **Config persistence** — JSON file at `/data/local/tmp/skiashift_config.json`
5. **resetprop** — Global renderer applied via Magisk resetprop on boot
6. **JNI bridge** — Kotlin ↔ C++ via standard JNI `extern "system"` exports
