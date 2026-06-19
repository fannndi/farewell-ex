package com.farewell.kernelmanager.kernel

import android.util.Log

object NativeLib {
    private const val TAG = "NativeLib"
    private var isLoaded = false

    init {
        try {
            System.loadLibrary("farewell_native")
            isLoaded = true
            Log.d(TAG, "Native library loaded")
        } catch (e: UnsatisfiedLinkError) {
            Log.e(TAG, "Failed to load: ${e.message}")
            isLoaded = false
        }
    }

    fun isAvailable(): Boolean = isLoaded

    // CPU
    external fun detectCpuClustersNative(): String
    external fun readCoreDataNative(): String
    external fun readCpuLoadNative(): Float
    external fun readCpuTemperatureNative(): Float
    external fun readCoreTemperatureNative(core: Int): Float
    external fun getCpuModelNative(): String
    external fun setGovernorNative(governor: String): Int
    external fun setFreqLimitNative(core: Int, min: Int, max: Int): Int
    external fun setCoreOnlineNative(core: Int, online: Boolean): Int

    // GPU
    external fun readGpuFreqNative(): Int
    external fun readGpuBusyNative(): Int
    external fun resetGpuStatsNative()
    external fun getGpuVendorNative(): String
    external fun getGpuModelNative(): String
    external fun getGpuAvailableFrequenciesNative(): String
    external fun getGpuAvailablePoliciesNative(): String
    external fun getGpuDriverInfoNative(): String
    external fun setGpuPowerLevelsNative(min: Int, max: Int): Int
    external fun setGpuForceNative(state: String, value: Boolean): Int
    external fun setGpuFreqLimitNative(min: Int, max: Int): Int

    // Memory
    external fun readMemInfoNative(): String
    external fun readZramSizeNative(): Long
    external fun getMemoryPressureNative(): Float
    external fun getSwappinessNative(): Int
    external fun getZramCompressionRatioNative(): Float
    external fun getZramAlgorithmNative(): String
    external fun getAvailableZramAlgorithmsNative(): String
    external fun setSwappinessNative(value: Int): Int
    external fun setDirtyRatioNative(value: Int): Int
    external fun setMinFreeKbytesNative(value: Int): Int

    // Thermal
    external fun readThermalZonesNative(): String
    external fun setThermalSconfigNative(preset: String): Int

    // Power
    external fun readBatteryLevelNative(): Int
    external fun readBatteryTempNative(): Int
    external fun readBatteryVoltageNative(): Int
    external fun readBatteryCurrentNative(): Int
    external fun isChargingNative(): Int
    external fun readCycleCountNative(): Int
    external fun readBatteryHealthNative(): String
    external fun readBatteryCapacityLevelNative(): Float
    external fun setBypassChargingNative(enable: Boolean): Int

    // Sysfs Generic
    external fun getSystemPropertyNative(key: String): String
    external fun fileExistsNative(path: String): Boolean
    external fun readSysfsNative(path: String): String
    external fun writeSysfsNative(path: String, value: String): Boolean

    // GPU Enhancements
    external fun setGpuBusSplitNative(enabled: Boolean): Int
    external fun setGpuThrottlingNative(enabled: Boolean): Int
    external fun setGpuIdleTimerNative(ms: Int): Int
    external fun setGpuMaxGpuclkNative(hz: Long): Int
    external fun setGpuDevfreqGovernorNative(governor: String): Int
    external fun setAdrenoIdlerActiveNative(active: Boolean): Int
    external fun setAdrenoIdlerIdlewaitNative(ms: Int): Int
    external fun setAdrenoIdlerDowndifferentialNative(pct: Int): Int
    external fun setAdrenoIdlerIdleworkloadNative(value: Int): Int
    external fun setSimpleGpuActivateNative(active: Boolean): Int
    external fun setSimpleGpuLazinessNative(value: Int): Int
    external fun setSimpleGpuRampThresholdNative(value: Int): Int
    external fun hasBusDcvsNative(): Int
    external fun setBusDcvsFreqNative(busName: String, min: Int, max: Int): Int

    // Scheduler + VM
    external fun setStunePreferIdleNative(prefer: Boolean): Int
    external fun setStuneBoostNative(boost: Int): Int
    external fun setVfsCachePressureNative(pct: Int): Int
    external fun setSplitLockMitigateNative(enabled: Boolean): Int
    external fun setSchedBoreNative(enabled: Boolean): Int
    external fun setSchedUtilClampMinNative(value: Int): Int
    external fun setSchedUtilClampMaxNative(value: Int): Int
    external fun dropCachesNative(): Int

    // I/O
    external fun setIoSchedulerNative(device: String, scheduler: String): Int
    external fun setIoReadaheadNative(device: String, kb: Int): Int
    external fun setIoNrRequestsNative(device: String, nr: Int): Int

    // Network
    external fun setTcpCongestionNative(algo: String): Int
    external fun getKernelVersionNative(): String

    // CPU Enhancements
    external fun setInputBoostMsNative(ms: Int): Int
    external fun setSchedBoostOnInputNative(boost: Boolean): Int
    external fun setCpuEasEnabledNative(enabled: Boolean): Int
    external fun setCpuDcvsDisableNative(core: Int, disable: Boolean): Int

    // Thermal Enhancements
    external fun setMsmThermalEnabledNative(enabled: Boolean): Int
    external fun setEarathEnabledNative(enabled: Boolean): Int
    external fun setFpsgoEnabledNative(enabled: Boolean): Int

    // Power Enhancements
    external fun discoverBypassChargingNodeNative(): String

    // Memory Enhancements
    external fun zramSetAlgorithmNative(device: Int, algo: String): Int
    external fun zramSetSizeNative(device: Int, size: Long): Int

    // Renderer (SkiaShift resetprop)
    external fun setRendererNative(mode: String): Int
    external fun getCurrentRendererNative(): String
    external fun isVulkanEnabledNative(): Int
    external fun restartSurfaceflingerNative(): Int

    // Spoof (COPG resetprop + mount)
    external fun spoofDevicePropertyNative(key: String, value: String): Int
    external fun restoreDevicePropertyNative(key: String): Int
    external fun restoreAllSpoofsNative(): Int
    external fun mountCpuinfoSpoofNative(): Int
    external fun unmountCpuinfoSpoofNative(): Int
    external fun isCpuinfoSpoofedNative(): Int
    external fun applyDeviceProfileNative(profile: String): Int

    // Display Control (DPIS wm density)
    external fun setGlobalDensityNative(dpi: Int): Int
    external fun resetGlobalDensityNative(): Int
    external fun getCurrentDensityNative(): Int
    external fun setGlobalFontScaleNative(scale: Float): Int
    external fun getCurrentFontScaleNative(): Float
    external fun applyDensityPresetNative(preset: String): Int
    external fun applyFontPresetNative(preset: String): Int

    // Daemon (Foreground Monitor + Per-App)
    external fun getForegroundAppNative(): String
    external fun startProfileMonitorNative(): Int
    external fun saveProfilesNative(json: String): Int
    external fun loadProfilesNative(): String

    // Framework Detection
    external fun hasKernelSuNative(): Int
    external fun hasMagiskNative(): Int
    external fun hasRezygiskNative(): Int
    external fun hasLsposedNative(): Int
    external fun hasResetpropNative(): Int
    external fun getFrameworkStatusNative(): String

    // DND + Game Controls
    external fun setDndEnabledNative(enabled: Boolean): Int
    external fun setImmersiveModeNative(pkg: String, enabled: Boolean): Int
    external fun dropCachesAndKillNative(): Int
    external fun setScreenBrightnessNative(value: Int): Int
    external fun setScreenBrightnessModeManualNative(): Int

    // Apply-on-Boot
    external fun saveBootConfigNative(config: String): Int
    external fun loadBootConfigNative(): String
    external fun applyBootConfigNative(): Int

    // Kotlin wrappers
    fun detectCpuClusters(): List<ClusterInfo>? {
        if (!isLoaded) return null
        return try {
            val json = detectCpuClustersNative()
            org.json.JSONArray(json).let { arr ->
                (0 until arr.length()).map { i ->
                    val obj = arr.getJSONObject(i)
                    ClusterInfo(
                        clusterNumber = obj.getInt("cluster_number"),
                        cores = (0 until obj.getJSONArray("cores").length()).map { obj.getJSONArray("cores").getInt(it) },
                        minFreq = obj.getInt("min_freq"),
                        maxFreq = obj.getInt("max_freq"),
                        currentMinFreq = obj.getInt("current_min_freq"),
                        currentMaxFreq = obj.getInt("current_max_freq"),
                        governor = obj.getString("governor"),
                        availableGovernors = (0 until obj.getJSONArray("available_governors").length()).map { obj.getJSONArray("available_governors").getString(it) },
                        policyPath = obj.getString("policy_path"),
                        availableFrequencies = (0 until obj.getJSONArray("available_frequencies").length()).map { obj.getJSONArray("available_frequencies").getInt(it) }
                    )
                }
            }
        } catch (e: Exception) { Log.e(TAG, "detectCpuClusters failed: ${e.message}"); null }
    }

    fun readCoreData(): List<CoreData>? {
        if (!isLoaded) return null
        return try {
            val json = readCoreDataNative()
            org.json.JSONArray(json).let { arr ->
                (0 until arr.length()).map { i ->
                    val obj = arr.getJSONObject(i)
                    CoreData(
                        core = obj.getInt("core"),
                        online = obj.getBoolean("online"),
                        freq = obj.getInt("freq"),
                        minFreq = obj.getInt("min_freq"),
                        maxFreq = obj.getInt("max_freq"),
                        governor = obj.getString("governor")
                    )
                }
            }
        } catch (e: Exception) { Log.e(TAG, "readCoreData failed: ${e.message}"); null }
    }

    fun readCpuLoad(): Float? = if (!isLoaded) null else try { readCpuLoadNative() } catch (e: Exception) { null }
    fun readCpuTemperature(): Float? = if (!isLoaded) null else try { readCpuTemperatureNative() } catch (e: Exception) { null }
    fun readCoreTemperature(core: Int): Float? = if (!isLoaded) null else try { readCoreTemperatureNative(core) } catch (e: Exception) { null }
    fun getCpuModel(): String? = if (!isLoaded) null else try { getCpuModelNative() } catch (e: Exception) { null }

    fun readGpuFreq(): Int? = if (!isLoaded) null else try { readGpuFreqNative() } catch (e: Exception) { null }
    fun readGpuBusy(): Int? = if (!isLoaded) null else try { readGpuBusyNative() } catch (e: Exception) { null }
    fun getGpuVendor(): String? = if (!isLoaded) null else try { getGpuVendorNative() } catch (e: Exception) { null }
    fun getGpuModel(): String? = if (!isLoaded) null else try { getGpuModelNative() } catch (e: Exception) { null }
    fun getGpuDriverInfo(): String? = if (!isLoaded) null else try { getGpuDriverInfoNative() } catch (e: Exception) { null }
    fun getSystemProperty(key: String): String? = if (!isLoaded) null else try { getSystemPropertyNative(key) } catch (e: Exception) { null }
    fun readThermalZones(): List<ThermalZone>? = if (!isLoaded) null else try {
        val json = readThermalZonesNative()
        org.json.JSONArray(json).let { arr ->
            (0 until arr.length()).map { i ->
                val obj = arr.getJSONObject(i)
                ThermalZone(name = obj.getString("name"), temp = obj.getDouble("temp").toFloat())
            }
        }
    } catch (e: Exception) { null }

    fun readBatteryLevel(): Int? = if (!isLoaded) null else try { readBatteryLevelNative() } catch (e: Exception) { null }
    fun readBatteryTemp(): Float? = if (!isLoaded) null else try { readBatteryTempNative() / 10.0f } catch (e: Exception) { null }
    fun readBatteryVoltage(): Float? = if (!isLoaded) null else try { readBatteryVoltageNative() / 1000.0f } catch (e: Exception) { null }
    fun readBatteryCurrent(): Int? = if (!isLoaded) null else try { readBatteryCurrentNative() } catch (e: Exception) { null }
    fun isCharging(): Boolean? = if (!isLoaded) null else try { isChargingNative() == 1 } catch (e: Exception) { null }
    fun readCycleCount(): Int? = if (!isLoaded) null else try { readCycleCountNative() } catch (e: Exception) { null }
    fun readBatteryHealth(): String? = if (!isLoaded) null else try { readBatteryHealthNative() } catch (e: Exception) { null }
    fun readBatteryCapacityLevel(): Float? = if (!isLoaded) null else try { readBatteryCapacityLevelNative() } catch (e: Exception) { null }

    data class ClusterInfo(val clusterNumber: Int, val cores: List<Int>, val minFreq: Int, val maxFreq: Int,
                           val currentMinFreq: Int, val currentMaxFreq: Int, val governor: String,
                           val availableGovernors: List<String>, val policyPath: String, val availableFrequencies: List<Int>)
    data class CoreData(val core: Int, val online: Boolean, val freq: Int, val minFreq: Int, val maxFreq: Int, val governor: String)
    data class ThermalZone(val name: String, val temp: Float)
}
