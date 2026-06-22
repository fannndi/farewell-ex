# Module 26: FPSViewer — Floating FPS Counter

**Source:** github.com/binhmod/FPSViewer
**Status:** ✅ INTEGRATED

## Architecture

Lightweight floating overlay (30KB APK) showing realtime FPS.

```
FPSViewer
├── FpsOverlayService.kt   ← Floating overlay Service
├── FPSReader.java         ← SurfaceFlinger latency parsing
├── FrameTimer.java        ← Rolling window (128 frames)
└── OverlayWindow.kt       ← WindowManager overlay
```

## How FPS is Calculated

1. `dumpsys SurfaceFlinger --latency` → array of 128 timestamp pairs
2. Delta = last_timestamp - first_timestamp (nanoseconds)
3. FPS = (count * 1_000_000_000) / delta
4. Update every 500ms

## Integration into Farewell-EX

**File:** `service/FpsOverlayService.kt` (58 lines)

**Method:** Read SurfaceFlinger latency via shell (`dumpsys SurfaceFlinger --latency`), parse timestamps, calculate rolling average FPS.

**Permissions needed:**
- `SYSTEM_ALERT_WINDOW` (overlay permission)
- Shell root access OR Shizuku

**UI:** Toggle in Settings screen → start/stop overlay

## Dependencies

- No APK dependency — logic embedded directly into farewell-ex
- Uses same `dumpsys SurfaceFlinger` method as FPSViewer
- 30KB reference APK replaced by ~60 lines Kotlin

## Performance

- CPU usage: < 1% (reading latency data only)
- Memory: ~2MB overlay window
- Refresh: 500ms interval
