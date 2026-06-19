# Module 13: Kotlin Bridge — Xtra-Kernel Android Layer

**Source:** `Xtra-Kernel-Manager/app/src/main/java/id/xms/xtrakernelmanager/`
**Status:** ✅ VERIFIED — source code read line-by-line for key files

---

## 1. Architecture

```
UI (Compose) → ViewModel → UseCases → KernelRepository
                                        ├── NativeLib (JNI, fast)  [PRIMARY]
                                        └── RootManager (su shell) [FALLBACK]
                                              ↓
PreferencesManager (DataStore + SharedPrefs for Xposed sync)
```

---

## 2. NativeLib.kt — JNI Bridge

### Loading
```kotlin
object NativeLib {
    private var isLoaded = false
    init {
        try {
            System.loadLibrary("xkm_native")
            isLoaded = true
        } catch (e: UnsatisfiedLinkError) { isLoaded = false }
    }
    fun isAvailable(): Boolean = isLoaded
}
```

### Safety Pattern (every function)
```kotlin
fun readXxx(): ReturnType? {
    if (!isLoaded) return null
    return try {
        val raw = readXxxNative()
        // optional: convert/normalize raw value
        raw
    } catch (e: Exception) {
        Log.e(TAG, "Native readXxx failed: ${e.message}")
        null
    }
}
```

### 22 Kotlin Wrapper Functions → 40 JNI Externals

| Kotlin Function | JNI External | Raw Type | Conversion |
|-----------------|-------------|----------|------------|
| `detectCpuClusters()` | `detectCpuClustersNative` | String (JSON) | parse to `List<ClusterInfo>` |
| `readCoreData()` | `readCoreDataNative` | String (JSON) | parse to `List<CoreData>` |
| `readCpuLoad()` | `readCpuLoadNative` | Float | 0.0–100.0 |
| `readCpuTemperature()` | `readCpuTemperatureNative` | Float | °C |
| `readGpuFreq()` | `readGpuFreqNative` | Int | MHz |
| `readGpuBusy()` | `readGpuBusyNative` | Int | 0–100 |
| `readBatteryLevel()` | `readBatteryLevelNative` | Int | 0–100 |
| `readBatteryTemp()` | `readBatteryTempNative` | Int | deci°C → **÷10** → °C |
| `readBatteryVoltage()` | `readBatteryVoltageNative` | Int | mV → **÷1000** → V |
| `readBatteryCurrent()` | `readBatteryCurrentNative` | Int | mA (+charge, -discharge) |
| `readDrainRate()` | `readDrainRateNative` | Int | mA |
| `isCharging()` | `isChargingNative` | Int | 0/1 → **== 1** → Boolean |
| `readWakeupCount()` | `readWakeupCountNative` | Int | |
| `readSuspendCount()` | `readSuspendCountNative` | Int | |
| `readMemInfo()` | `readMemInfoNative` | String (JSON) | parse to `MemInfo` |
| `readZramSize()` | `readZramSizeNative` | Long | bytes |
| `getMemoryPressure()` | `getMemoryPressureNative` | Float | ⚠️ 0.0–100.0 from Rust |
| `readThermalZones()` | `readThermalZonesNative` | String (JSON) | parse to `List<ThermalZone>` |
| `getZramCompressionRatio()` | `getZramCompressionRatioNative` | Float | |
| `getZramAlgorithm()` | `getZramAlgorithmNative` | String | |
| `getSwappiness()` | `getSwappinessNative` | Int | |
| `getSystemProperty(key)` | `getSystemPropertyNative` | String | |
| `getGpuVendor()` | `getGpuVendorNative` | String | |
| `getGpuModel()` | `getGpuModelNative` | String | |
| `getGpuAvailableFrequencies()` | `getGpuAvailableFrequenciesNative` | String (JSON) | → `List<Int>` |
| `getGpuAvailablePolicies()` | `getGpuAvailablePoliciesNative` | String (JSON) | → `List<String>` |
| `getGpuDriverInfo()` | `getGpuDriverInfoNative` | String | |
| `readCycleCount()` | `readCycleCountNative` | Int | |
| `readBatteryHealth()` | `readBatteryHealthNative` | String | |
| `readBatteryCapacityLevel()` | `readBatteryCapacityLevelNative` | Float | % of design |
| `getAvailableZramAlgorithms()` | `getAvailableZramAlgorithmsNative` | String (JSON) | → `List<String>` |
| `readZramDeviceStats(device)` | `readZramDeviceStatsNative` | String (JSON) | per-device |

**Non-JNI:** `getVulkanVersion(context)` — pure Kotlin, PackageManager-based

### Unit Conversions (in Kotlin layer)
| Raw | Converted | Formula |
|-----|-----------|---------|
| deci°C (int) | °C (float) | `÷ 10.0f` |
| mV (int) | V (float) | `÷ 1000.0f` |
| 0/1 (int) | Boolean | `== 1` |
| JSON string | Data class | `JSONArray`/`JSONObject` |

### ⚠️ Inconsistency Found: Memory Pressure
- **Rust returns**: 0.0–100.0 (`* 100.0` on line 218)
- **Kotlin comment says**: 0.0–1.0
- **Impact**: UI shows percentage directly or needs `÷100`? Depends on how ViewModel uses it

---

## 3. RootManager.kt — Shell Operations via libsu

```kotlin
object RootManager {
    suspend fun isRootAvailable(): Boolean = withContext(Dispatchers.IO) {
        Shell.getShell().isRoot
    }
    suspend fun executeCommand(command: String): Result<String> = withContext(Dispatchers.IO) {
        val result = Shell.cmd(command).exec()
        if (result.isSuccess) Result.success(result.out.joinToString("\n"))
        else Result.failure(Exception("Failed: ${result.err.joinToString("\n")}"))
    }
}
```

### Operations
| Method | Shell Command |
|--------|--------------|
| `readFile(path)` | `cat $path 2>/dev/null` |
| `writeFile(path, content)` | `echo '$content' > $path` |
| `writeToNode(path, value)` | `echo '$value' > $path` |
| `readFromNode(path)` | `cat $path 2>/dev/null` |
| `fileExists(path)` | `[ -f $path ] && echo exists` |
| `getProp(name)` | `getprop $name` |
| `setProp(name, value)` | `setprop $name $value` |
| `installKernelSuModule(path)` | `ksud module install $path` (fallback: `magisk --install-module`) |
| `isModuleInstalled(id)` | `[ -d /data/adb/modules/$id ] && echo exists` |
| `rebootDevice()` | `reboot` |

### Debug Bypass (dev only)
```kotlin
private val DEBUG_BYPASS_DEVICES = setOf("I2219", "Android SDK built for x86_64", "sdk_gphone16k_x86_64")
fun isDebugBypassDevice(): Boolean = BuildConfig.DEBUG && Build.MODEL in DEBUG_BYPASS_DEVICES
```

---

## 4. KernelRepository.kt — Data Aggregation Layer

### Path Caching (6 paths)
```kotlin
private var cachedClusters: List<ClusterInfo>? = null
private var cachedGpuFreqPath: String? = null      // discovers which path works
private var cachedGpuBusyPath: String? = null
private var cachedGpuBasePath: String? = null       // /sys/class/kgsl/kgsl-3d0 or /sys/kernel/gpu
private var cachedCpuThermalPath: String? = null    // auto-discovers working zone
private var cachedGpuThermalZone: String? = null    // auto-discovers GPU zone
```

### Data Flow: `getCPUInfo()`

```
1. clusters = NativeLib.detectCpuClusters() ?? detectClustersAdvanced()
2. Fix Poco F1: ensure maxFreq in availableFrequencies
3. Fix Poco F5: sort clusters by maxFreq (prevents "jumping")
4. Re-index clusterNumber after sort

5. cores = NativeLib.readCoreData() ?? shell loop (getCoreInfo per core)
6. For each core: CoreInfo with normalized freq (÷1000)

7. temp = NativeLib.readCpuTemperature() ?? getCPUTemperature()
8. load = NativeLib.readCpuLoad() ?? getCPULoad()

return CPUInfo(cores, clusters, temperature, totalLoad)
```

### Fallback Cluster Detection (`detectClustersAdvanced`)
- Shell-based: `[ -d /sys/.../cpuN ] && echo exists`
- Groups by cpuinfo_max_freq (not min_freq like Rust)
- Same MHz normalization: all freqs ÷1000

### Differential CPU Load (Kotlin fallback)
```kotlin
private var prevCpuIdle: Long = 0L
private var prevCpuTotal: Long = 0L

// From /proc/stat: cpu user nice system idle iowait ...
val idle = values[3] + (values[4] ?: 0)  // idle + iowait
val total = values.sum()
val load = 100 - ((diffTotal - diffIdle) / diffTotal * 100)
```

### GPU Info: Multi-source Detection
```
vendor/renderer = NativeLib.getGpuVendor()/getGpuModel()
                 ?? dumpsys SurfaceFlinger | grep GLES → regex match
                 ?? NativeLib.getSystemProperty("ro.hardware") → SoC name

freq = NativeLib.readGpuFreq()
     ?? cachedGpuFreqPath (once discovered)
     ?? fallback chain: gpuclk → clock_mhz → /sys/kernel/gpu/gpu_clock → devfreq/*

gpuLoad = NativeLib.readGpuBusy()
        ?? cachedGpuBusyPath (once discovered)
        ?? gpu_busy_percentage → gpu_busy

gpuTemp = NativeLib.readThermalZones()
        → find zone with "gpu"|"adreno"|"mali"|"3d"|"gpuss"|"kgsl"
        → fallback: zones 5–15 (common Qualcomm GPU zone range)
        → cache zone path
```

---

## 5. CPUControlUseCase.kt — CPU Frequency/Governor Control

### Cluster Cache (30s TTL)
```kotlin
private var cachedClusters: List<ClusterInfo>? = null
private var clusterCacheTime: Long = 0L
private const val CLUSTER_CACHE_TTL_MS = 30000L
```

### kHz→MHz Normalization (critical)
```kotlin
val needsNormalization = cluster.maxFreq > 10000  // sysfs returns kHz
if (needsNormalization) {
    cluster.copy(
        minFreq = cluster.minFreq / 1000,
        maxFreq = cluster.maxFreq / 1000,
        currentMinFreq = cluster.currentMinFreq / 1000,
        currentMaxFreq = cluster.currentMaxFreq / 1000,
        availableFrequencies = cluster.availableFrequencies.map { it / 1000 }
    )
}
```

**Key insight:** `KernelRepository` and `CPUControlUseCase` BOTH normalize independently — separate code paths for the same data.

### Parallel Core Detection
```kotlin
(0..15).map { coreNum -> async {
    val exists = RootManager.executeCommand("[ -d $basePath ] && echo exists")
    val online = RootManager.executeCommand("cat $basePath/online 2>/dev/null || echo 1")
    // ...read freqs, governor
    CoreInfo(...)
}}.awaitAll()  // All 16 cores in parallel
```

### Write-then-verify Pattern
After every sysfs write, re-read to confirm:
```kotlin
suspend fun setGovernor(governor: String): Boolean {
    // Write to all cores in single shell command
    val cmd = cores.joinToString(" && ") { core ->
        "echo '$governor' > /sys/devices/system/cpu/cpu$core/cpufreq/scaling_governor"
    }
    RootManager.executeCommand(cmd)
    // Verify: poll up to 5 times, 100ms interval
    return verifyGovernor(target=governor, attempts=5, delayMs=100)
}
```

---

## 6. Data Models

### ClusterInfo
```kotlin
data class ClusterInfo(
    val clusterNumber: Int,       // 0-indexed, sorted by maxFreq
    val cores: List<Int>,         // [0,1], [2,3,4,5,6,7]
    val minFreq: Int,             // cpuinfo_min_freq (MHz after normalization)
    val maxFreq: Int,             // cpuinfo_max_freq
    val currentMinFreq: Int,      // scaling_min_freq
    val currentMaxFreq: Int,      // scaling_max_freq
    val governor: String,         // "schedutil"
    val availableGovernors: List<String>,
    val availableFrequencies: List<Int>,  // MHz after normalization
    val policyPath: String        // "/sys/devices/system/cpu/cpu0/cpufreq"
)
```

### CoreData (from NativeLib)
```kotlin
data class CoreData(
    val core: Int,       // core number
    val online: Boolean,
    val freq: Int,       // kHz from Rust → NOT normalized here
    val governor: String
)
```

### GPUInfo
```kotlin
data class GPUInfo(
    val vendor: String,           // "Qualcomm", "ARM Mali", "Unknown"
    val renderer: String,         // "Adreno 618"
    val openglVersion: String,    // from dumpsys SurfaceFlinger
    val vulkanVersion: String,    // from PackageManager
    val gpuMemory: String,        // detected or estimated
    val computeUnits: Int,        // hardcoded by model
    val currentFreq: Int,         // MHz
    val minFreq: Int,             // MHz
    val maxFreq: Int,             // MHz
    val availableFreqs: List<Int>,// MHz
    val powerLevel: Int,
    val numPwrLevels: Int,        // 8 default
    val rendererType: String,     // "OpenGL" or "Vulkan"
    val gpuLoad: Int,             // 0–100
    val temperature: Float        // °C
)
```

### MemInfo
```kotlin
data class MemInfo(
    val totalKb: Long,        // MemTotal
    val availableKb: Long,    // MemAvailable
    val freeKb: Long,         // MemFree
    val cachedKb: Long,       // Cached
    val buffersKb: Long       // Buffers
)
```

### PowerInfo
```kotlin
data class PowerInfo(
    val screenOnTime: Long,        // ms
    val screenOffTime: Long,
    val drainRate: Int,            // mA (+drain, -charge)
    val batteryLevel: Int,         // 0–100
    val batteryTemp: Float,        // °C
    val batteryVoltage: Float,     // V
    val isCharging: Boolean,
    val wakeupCount: Int,
    val suspendCount: Int,
    val deepSleepPercentage: Float,
    val activeDrainRate: Float,    // %/hour screen on
    val idleDrainRate: Float       // %/hour screen off
)
```

---

## 7. Key Patterns for Our Rust SDK

| Pattern | Where | Our SDK Implication |
|---------|-------|-------------------|
| Native-first, shell fallback | KernelRepository | Rust SDK IS the native layer — no JNI fallback needed for sysfs |
| Path auto-discovery + cache | KernelRepository | SDK should discover working paths, cache them |
| kHz→MHz normalization | CPUControlUseCase | SDK returns raw kHz, let Kotlin normalize (or SDK normalizes) |
| 30s cluster cache TTL | CPUControlUseCase | SDK should cache cluster info |
| Parallel core detection | CPUControlUseCase | SDK already does this in Rust |
| Write-then-verify | CPUControlUseCase | SDK should support verify-after-write |
| GPU vendor detection chain | KernelRepository | 5-step: native → dumpsys → property → SoC |
| Thermal zone auto-discovery | KernelRepository | Scan zones, match patterns, cache |
| Differential CPU/GPU load | cpu.rs, KernelRepository | Delta-based from /proc/stat |
| Persistent FDs for battery | power.rs | Already implemented — zero re-open |
| Dual preferences | PreferencesManager | DataStore (async) + SharedPrefs (Xposed sync) |

---

## 8. Files Studied (verified)

| File | Lines | Role | Verified |
|------|-------|------|----------|
| NativeLib.kt | 686 | JNI bridge | ✅ |
| RootManager.kt | 135 | Root shell wrapper | ✅ |
| KernelRepository.kt | 780 | Data aggregation, GPU/CPU/temp detection | ✅ |
| CPUControlUseCase.kt | 801 | CPU freq/governor control | ✅ |
| GPUControlUseCase.kt | 928 | Adreno GPU control (NOT fully verified) | ⬜ |
| PreferencesManager.kt | 1072 | Dual storage preferences | ⬜ |
| TuningViewModel.kt | 1984 | Central ViewModel | ⬜ |
| HomeScreen.kt | 936+ | Dashboard UI | ⬜ |
| RAMControlUseCase.kt | 424 | RAM/ZRAM management | ⬜ |
| GameControlUseCase.kt | 781 | Gaming overlay | ⬜ |
| ThermalControlUseCase.kt | 76 | Xiaomi thermal | ⬜ |
| FunctionalRomUseCase.kt | 430 | ROM-specific features | ⬜ |
| CPUInfo.kt | 31 | Data classes | ✅ |
| GPUInfo.kt | 19 | Data classes | ✅ |
| BatteryInfo.kt | 16 | Data classes | ✅ |
| PowerInfo.kt | 57 | Data class + formatters | ✅ |
