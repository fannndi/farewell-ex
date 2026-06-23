# Module 28: Android API Reading — BatteryManager + AThermal

**Source:** `DevCheck.apk` reverse engineering
**Status:** ✅ EXTRACTED

## Android BatteryManager API

### Usage

```kotlin
val bm = context.getSystemService(Context.BATTERY_SERVICE) as BatteryManager
val level = bm.getIntProperty(BatteryManager.BATTERY_PROPERTY_CAPACITY)  // 0-100
```

No permissions required beyond normal app runtime. Works on ALL Android versions.

### Available Properties

| Property | Method | Returns |
|----------|--------|---------|
| Capacity (level) | `BATTERY_PROPERTY_CAPACITY` | 0-100 (percent) |
| Temperature | `BATTERY_PROPERTY_TEMPERATURE` | tenths of °C (300 = 30.0°C) |
| Voltage | `BATTERY_PROPERTY_VOLTAGE_NOW` | mV |
| Current | `BATTERY_PROPERTY_CURRENT_NOW` | µA (negative = discharging) |
| Charge Counter | `BATTERY_PROPERTY_CHARGE_COUNTER` | µAh |
| Energy Counter | `BATTERY_PROPERTY_ENERGY_COUNTER` | nWh |

### Intent Fallback (Most Reliable)

```kotlin
val intent = context.registerReceiver(null, IntentFilter(Intent.ACTION_BATTERY_CHANGED))
val level = intent.getIntExtra(BatteryManager.EXTRA_LEVEL, -1)
val scale = intent.getIntExtra(BatteryManager.EXTRA_SCALE, -1)
val pct = level * 100 / scale  // 0-100
```

This sticky intent works even when `getIntProperty` returns 0 on some devices.

### Pros/Cons

| Aspect | Rating |
|--------|--------|
| SELinux bypass | ✅ Always works |
| Root required | ❌ No |
| Accuracy | ✅ Exact values from kernel |
| Battery status | ✅ Charging/Discharging/Full |
| Cycle count | ❌ Not available (needs sysfs `/sys/class/power_supply/bms/cycle_count`) |

## Android NDK AThermal API

Available since Android 11 (API 30). Returns thermal headroom percentage.

```c
#include <nativehelper/AThermal.h>

AThermalManager* manager = AThermal_acquireManager();
float headroom = AThermal_getThermalHeadroom(manager, 1000);
AThermal_releaseManager(manager);
// headroom = 0.0 (cool) to 1.0 (throttling threshold)
```

### Temperature Estimation

AThermal gives headroom, not actual temperature. Estimate:

```
temp_°C = 40 + (headroom * 60)
```

| Headroom | Estimated Temp | Meaning |
|----------|---------------|---------|
| 0.0 | ~40°C | Cool/idle |
| 0.25 | ~55°C | Warm |
| 0.5 | ~70°C | Hot |
| 0.75 | ~85°C | Near throttling |
| 1.0 | ~100°C | Throttling imminent |

## Fallback Chain Priority

```
1. Android API (BatteryManager / AThermal)
   → Always works, no root, bypasses SELinux
2. KGSL IOCTL (/dev/kgsl-3d0)
   → Works for GPU (char device, different SELinux domain)
3. Sysfs (NativeLib JNI)
   → Works on permissive SELinux or non-MIUI ROMs
4. Shell (Shizuku / RootManager)
   → Works if Shizuku running or rooted
```

## Files

| File | Role |
|------|------|
| `references/DevCheck-Sysfs-Bypass/battery_android_api.kt` | Kotlin BatteryReader |
| `references/DevCheck-Sysfs-Bypass/thermal_athermal.c` | C AThermal NDK wrapper |
| `references/DevCheck-Sysfs-Bypass/fallback_chain.kt` | Orchestrator |
