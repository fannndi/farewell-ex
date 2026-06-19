# Module 24: ZN-AuditPatch — Audit Log Replacement

**Source:** `ZN-AuditPatch/` by aviraxp
**Status:** ✅ EXTRACTED

## Architecture

ZygiskNext module that replaces sensitive SELinux audit context in logd.

```
ZN-AuditPatch
├── ZygiskNext Module → injected into logd process
├── PLT Hook → hooks vasprintf() in logd's libc
├── String Replacement → replaces tcontext=u:r:su:s0 / magisk:s0
│   → with tcontext=u:r:priv_app:s0:c512,c768
└── Boot Workaround → resetprop + ctl.restart logd
```

## Hook Flow

1. ZN loads `.so` into logd (declared in `zn_modules.txt`)
2. `onModuleLoaded()` → find linker base via `dl_iterate_phdr`
3. PLT-hook `vasprintf` in logd's libc
4. After original runs → scan output for sensitive patterns
5. `memmove` + `memcpy` in-place replacement
6. Safety: `has_quote_after()` — skip if already quoted

## Detection

| Method | Path |
|--------|------|
| Module dir | `/data/adb/modules/zn_audit_patch/` |
| Audit module | `/data/adb/modules/audit_patch/` |

## Integration for Kernel Manager

1. Detect ZN-AuditPatch via module path
2. Use PLT hooking pattern for other log interception
3. Boot workaround pattern (resetprop + ctl.restart)
4. SHA-256 integrity verification pattern
