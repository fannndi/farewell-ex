# Module 22: Vector — Modern Xposed Framework

**Source:** `Vector/` by JingMatrix
**Status:** ✅ EXTRACTED

## Architecture

Zygisk module providing ART hooking via LSPlant + Dobby. Successor to LSPosed.

```
Vector Framework
├── Zygisk Entry → postAppSpecialize → DEX load → ART hook init
├── LSPlant → Core ART hooking engine
├── Dobby → Inline hooking
├── Legacy API → de.robv.android.xposed.* (full compatibility)
├── Modern API → libxposed (Chain, HookRecord, ExceptionMode)
├── VectorDeopter → Force ART deoptimization
├── Resource Hook → XResources, binary XML mutation
└── Daemon → Out-of-process privileged service
```

## Detection Methods

| Method | Path/Property |
|--------|---------------|
| Module dir | `/data/adb/modules/vector/` |
| LSPosed dir | `/data/adb/lspd/` or `/data/adb/modules/lsposed/` |
| Xposed property | `getprop persist.sys.lsposed` = "true" |
| Manager package | `org.lsposed.manager` |

## Key Patterns

- **Obfuscated class names** — fetched from daemon via IPC
- **IPC via Binder** — `ServiceManager.getService("activity")`
- **DEX trust elevation** — `lsplant::MakeDexFileTrusted()`
- **Deoptimization** — Forces ART to discard compiled code
- **XSharedPreferences bypass** — SELinux-safe preference zone

## Integration for Kernel Manager

1. Detect Vector/LSPosed via module paths + property
2. Per-app DPI/font via Xposed hooks (DPIS original)
3. Per-app renderer via Xposed hooks (SkiaShift original)
