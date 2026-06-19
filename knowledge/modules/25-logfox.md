# Module 25: LogFox — Crash Logging

**Source:** `LogFox/` by F0x1d
**Status:** ✅ EXTRACTED

## Architecture

LogCat reader with crash detection, recording, and export.

```
LogFox
├── Terminal Abstraction → Default/Runtime | Root/libsu | Shizuku/AIDL
├── Logcat Reader → `-v uid -v epoch` format
├── Crash Detection → 3 types: Java, JNI, ANR
├── Crash Persistence → Room DB + log files
├── Export → ZIP with device info + crash logs
└── Foreground Service → Background log collection
```

## Terminal Abstraction

| Terminal | Mechanism | Privilege |
|----------|-----------|-----------|
| Default | `Runtime.getRuntime().exec()` | None |
| Root | `Shell.cmd()` (libsu) | Root |
| Shizuku | `UserService` AIDL | ADB |

## Crash Detection

| Type | First Line Pattern | Package Extraction |
|------|-------------------|-------------------|
| Java | `AndroidRuntime` + `FATAL EXCEPTION:` | Line 2: `Process: com.example.app` |
| JNI | `DEBUG` + `*** *** *** ***` | `>>> com.example.app <<<` |
| ANR | `ActivityManager` + `ANR in` | First line: `ANR in com.example.app` |

## LogLine Format

```
.{14} .{5,}? .{1,5} .{1,5} . (.+?): (.+)
timestamp uid pid tid level tag content
```

## Export ZIP Structure

```
device_YYYYMMDD_HHMMSS.txt   ← Build.* fields
app_YYYYMMDD_HHMMSS.txt      ← App info
crash_YYYYMMDD_HHMMSS.log    ← Formatted crash
dump_YYYYMMDD_HHMMSS.log     ← Log dump
```

## Integration for Kernel Manager

1. Use Terminal abstraction pattern (Default/Root/Shizuku)
2. Use crash detection pattern for feature verification failures
3. Use export pattern (ZIP + device info) for tester log collection
4. Use foreground service pattern for background monitoring
