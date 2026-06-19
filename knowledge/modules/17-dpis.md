# Module 17: DPIS — Per-App DPI/Font Scaling

**Source:** `DPIS/` (Xposed module)
**Status:** ✅ VERIFIED — inline_hook_arm64 + mmap trampoline in dpis_native.cpp confirmed

## Architecture

4-layer hook system for DisplayMetrics + font scaling, with Flutter native support.

```
DpiConfigStore (SharedPrefs) → per-package config
  → AppProcessHookInstaller → builds HookExecutionPlan
    → DisplayHookInstaller        hooks Display.getMetrics/getSize/getDisplayInfo
    → ForceTextSizeHookInstaller  hooks TextView.setTextSize/Paint.setTextSize
    → HyperOsFlutterFont*         native hooks for Flutter font
```

---

## DisplayMetrics Hook

Intercepts 5 `android.view.Display` methods:
- `getMetrics()` / `getRealMetrics()` — rewrites densityDpi, density, scaledDensity, widthPx, heightPx
- `getSize()` / `getRealSize()` — rewrites Point
- `getDisplayInfo()` — rewrites logicalDensityDpi, logicalWidth, appWidth, smallestNominalAppWidth/Height

**Math:**
- `viewportScale = targetWidthDp / sourceSmallestWidthDp`
- New `densityDpi = sourceDpi * (sourceSmallest / targetSmallest)` — inverse scale
- Physical pixels unchanged — only logical dp shifts

---

## Font Hook — 4 Domains

| Domain | Hook Target | Method |
|--------|-------------|--------|
| Resources | scaledDensity | DisplayMetrics rewrite |
| TextView | setTextSize | SP→PX conversion with factor |
| Paint | setTextSize | Absolute unit fallback |
| Flutter | ParagraphBuilder::Create/pushStyle | ARM64 inline hook |

---

## Native Hook (ARM64)

**Target libs:** libflutter.so, libhyper_os_flutter.so, libapp.so
**Technique:** Custom inline hook + GOT hook
- `inline_hook_arm64()` — mmap trampoline, movabs+br patch, handles BL/B relocation
- GOT hook — mprotect + pointer swap for `libweather_app.so`
- Polling — background thread polls dl_iterate_phdr, up to 60 attempts @ 1s

---

## Key Patterns

1. **Domain arbitration** — Resources → TextView → Paint → Flutter. Layers are selectively activated to prevent double-scaling
2. **Provenance tracking** — Atomic flags + ThreadLocal prevent infinite recursion
3. **Dual config delivery** — Local SharedPrefs + LSPosed remote delivery
4. **Debug properties** — All config overridable via `debug.dpis.*` system properties
5. **CLI config** — Process can receive config via `/proc/self/cmdline` key=value
