# Module 21: ZygiskNext — Standalone Zygisk Implementation

**Source:** `ZygiskNext/` by Dr-TSNG
**Status:** ✅ EXTRACTED

## Architecture

Standalone Zygisk implementation for KernelSU/Magisk/APatch.

```
ZygiskNext Module
├── ZN Linker (custom, stealth) → preloads modules into zygote
├── Module API v1 → PLT hook, inline hook, symbol resolver
├── Dual injection → Zygote (per-app) + service processes
└── Companion IPC → Unix socket for native modules
```

## Detection Methods

| Method | Path/Property |
|--------|---------------|
| Module dir | `/data/adb/modules/zygisk_next/` |
| ReZygisk dir | `/data/adb/modules/rezygisk/` |
| Zygisk property | `getprop persist.sys.zygisk` = "true" |
| ksud binary | `/data/adb/ksud` (KernelSU indicator) |

## Module API v1

- `zn_api.pltHook(lib, sym, replace)` — PLT hook by symbol name
- `zn_api.inlineHook(target, replace, backup)` — Inline hook
- `zn_api.symbolResolver(lib, sym)` — Resolve symbol address
- Companion process via Unix socket for native modules

## Integration for Kernel Manager

1. Detect ZygiskNext via module paths + property
2. Use ZN API for per-app features (renderer, spoof)
3. Companion process for heavy lifting (mount --bind, etc.)
