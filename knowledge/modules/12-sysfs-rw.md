# Module 12: sysfs-rw — Xtra-Kernel Rust Native

**Source:** `Xtra-Kernel-Manager/app/src/main/rust/xkm_native/src/lib.rs`
**Status:** ✅ DONE

## Architecture

JNI bridge — Rust functions exported via `extern "system"` for Java/Kotlin FFI.

**5 Modules:**
- `cpu` — CPU cluster detection, core data, load, temperature, model
- `gpu` — GPU freq, busy, vendor, model, available frequencies, driver info
- `memory` — Meminfo, ZRAM stats, swappiness, pressure, compression ratio
- `power` — Battery level/temp/voltage/current, charging, thermal zones, cycle count
- `utils` — System property getter

**JNI Functions (28 total):**

| Function | Rust Module | Return Type |
|----------|------------|-------------|
| `detectCpuClustersNative` | cpu | jstring (JSON array) |
| `readCoreDataNative` | cpu | jstring (JSON) |
| `readCpuLoadNative` | cpu | jfloat |
| `readCpuTemperatureNative` | cpu | jfloat |
| `readCoreTemperatureNative` | cpu | jfloat (per core) |
| `getCpuModelNative` | cpu | jstring |
| `readGpuFreqNative` | gpu | jint |
| `readGpuBusyNative` | gpu | jint |
| `resetGpuStatsNative` | gpu | void |
| `getGpuVendorNative` | gpu | jstring |
| `getGpuModelNative` | gpu | jstring |
| `getGpuAvailableFrequenciesNative` | gpu | jstring (JSON) |
| `getGpuAvailablePoliciesNative` | gpu | jstring (JSON) |
| `getGpuDriverInfoNative` | gpu | jstring |
| `readBatteryLevelNative` | power | jint |
| `readBatteryTempNative` | power | jint |
| `readBatteryVoltageNative` | power | jint |
| `readBatteryCurrentNative` | power | jint |
| `readDrainRateNative` | power | jint |
| `isChargingNative` | power | jint (0/1) |
| `readWakeupCountNative` | power | jint |
| `readSuspendCountNative` | power | jint |
| `readMemInfoNative` | memory | jstring (JSON) |
| `readZramSizeNative` | memory | jlong |
| `getMemoryPressureNative` | memory | jfloat |
| `readThermalZoneNative` | power | jfloat (per zone) |
| `getThermalZoneTypeNative` | power | jstring |
| `readThermalZonesNative` | power | jstring (JSON) |
| `readCycleCountNative` | power | jint |
| `readBatteryHealthNative` | power | jstring |
| `readBatteryCapacityLevelNative` | power | jfloat |
| `getZramCompressionRatioNative` | memory | jfloat |
| `getZramCompressedSizeNative` | memory | jlong |
| `getZramOrigDataSizeNative` | memory | jlong |
| `getZramAlgorithmNative` | memory | jstring |
| `getSwappinessNative` | memory | jint |
| `readMemInfoDetailedNative` | memory | jstring |
| `getSystemPropertyNative` | utils | jstring |
| `getGpuAvailableFrequenciesNative` | gpu | jstring (JSON) |
| `getGpuAvailablePoliciesNative` | gpu | jstring (JSON) |
| `getGpuDriverInfoNative` | gpu | jstring |
| `readZramDeviceStatsNative` | memory | jstring (JSON) |
| `getAvailableZramAlgorithmsNative` | memory | jstring (JSON) |

**Key Design Patterns:**
1. **JSON for complex data**: Clusters, meminfo, thermal zones, GPU freqs/policies returned as JSON strings
2. **Primitives for simple values**: Level, temp, voltage, freq returned as jint/jfloat
3. **Graceful degradation**: All functions use `unwrap_or_else(|_| "default")` — never panic
4. **Zero-arg JNI**: Most functions take only `env` and `_class` — data fetched from sysfs
5. **Module separation**: Each concern in its own module, lib.rs is pure JNI glue

**For Rust SDK:**
- The `cpu` module provides cluster detection + per-core data
- The `gpu` module provides multi-vendor detection (Adreno/Mali/etc)
- The `memory` module provides ZRAM + meminfo + pressure
- The `power` module provides battery + thermal + charging
- The `utils` module provides system property access
