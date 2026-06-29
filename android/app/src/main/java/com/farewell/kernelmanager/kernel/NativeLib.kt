package com.farewell.kernelmanager.kernel

import android.util.Log

object NativeLib {
    private const val TAG = "NativeLib"
    private var isLoaded = false
    private var loadError: String? = null

    init {
        try {
            System.loadLibrary("farewell_native")
            isLoaded = true
            Log.d(TAG, "Native library loaded")
        } catch (e: UnsatisfiedLinkError) {
            loadError = e.message
            Log.e(TAG, "Failed to load: ${e.message}")
            Log.e(TAG, "ABI: ${android.os.Build.SUPPORTED_ABIS.joinToString()}")
            isLoaded = false
        } catch (e: Exception) {
            loadError = "${e.javaClass.simpleName}: ${e.message}"
            Log.e(TAG, "Unexpected error loading native lib", e)
            isLoaded = false
        }
    }

    fun loadStatus(): String = if (isLoaded) "loaded" else "failed: ${loadError ?: "unknown"}"

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

    // GPU IOCTL (SELinux-safe via /dev/kgsl-3d0)
    external fun readGpuFreqIoctlNative(): Int
    external fun readGpuBusyIoctlNative(): Int
    external fun readGpuModelIoctlNative(): String

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

    // Tier System
    external fun detectTierNative(): Int
    external fun getFrameworkStatusJsonNative(): String
    external fun getUnlockedFeaturesNative(): Int
    external fun getLockedFeaturesNative(): Int

    // Feature Checker
    external fun verifyFeatureNative(feature: String): String
    external fun verifyAllFeaturesNative(): Int
    external fun getCheckerLogNative(): String
    external fun clearCheckerLogNative(): Int
    external fun exportLogsNative(): String

    // Hotplug (QCOM)
    external fun getAvailableHotplugDriversNative(): String
    external fun getCoreCtlMinCpusNative(cluster: Int): Int
    external fun setCoreCtlMinCpusNative(cluster: Int, n: Int): Int
    external fun setCoreCtlMaxCpusNative(cluster: Int, n: Int): Int
    external fun setMsmHotplugEnabledNative(enabled: Boolean): Int

    // Screen State + Daemon
    external fun isScreenOnNative(): Int
    external fun fstrimAllNative(): Int
    external fun debounceWriteNative(path: String, value: String): Int

    // CPU Devfreq
    external fun getDevfreqCurFreqNative(device: String): Long
    external fun setDevfreqMinFreqNative(device: String, freq: Long): Int
    external fun setDevfreqMaxFreqNative(device: String, freq: Long): Int
    external fun setDevfreqGovernorNative(device: String, gov: String): Int
    external fun getQcomDevfreqDevicesNative(): String

    // Adrenoboost
    external fun getAdrenoboostNative(): Int
    external fun setAdrenoboostNative(value: Int): Int

    // Display Modes
    external fun getDisplayModesNative(): String
    external fun setDisplayModeNative(mode: String): Int

    // Charging Current
    external fun getConstantChargeCurrentMaxNative(): Int
    external fun setConstantChargeCurrentMaxNative(ua: Int): Int
    external fun getUsbCurrentMaxNative(): Int
    external fun setUsbCurrentMaxNative(ua: Int): Int

    // Cpuset
    external fun getCpusetCpusNative(group: String): String
    external fun setCpusetCpusNative(group: String, cpus: String): Int
    external fun getAvailableCpusetGroupsNative(): String

    // Disk Stats
    external fun readDiskStatsNative(): String

    // Debug Diagnostic
    external fun runDebugDiagnosticNative(tierName: String): String
    external fun readDebugLogNative(): String

    // ZygiskNext Companion
    external fun setZygiskPropertyOverrides(props: Array<String>): Unit
    external fun setZygiskRendererOverride(pkg: String, renderer: String): Unit
    external fun setZygiskCpuinfoSpoof(spoofPath: String): Unit
    external fun startZygiskHook(): Unit

    // Vector/Xposed
    external fun setVectorDpiOverride(pkg: String, dpi: Int): Unit
    external fun setVectorFontOverride(pkg: String, scale: Float): Unit
    external fun clearVectorOverrides(): Unit

    // Missing Features
    external fun getPrintkNative(): String
    external fun getWireguardVersionNative(): String
    external fun getSchedAutogroupEnabledNative(): Int
    external fun getOvercommitRatioNative(): Int
    external fun getChargeControlLimitNative(): Int

    // Scheduler
    external fun getSchedFeaturesNative(): String
    external fun setSchedFeatureNative(feature: String, enabled: Int): Int
    external fun setSchedLibNameNative(names: String): Int
    external fun setSchedLibMaskForceNative(mask: Int): Int
    external fun setSchedBurstUpdatePeriodNative(ms: Int): Int
    external fun setSchedBurstSmoothUpNative(enabled: Int): Int
    external fun setSchedBurstGrahamNative(enabled: Int): Int
    external fun setSchedAutogroupNative(enabled: Int): Int
    external fun setOvercommitRatioNative(pct: Int): Int
    external fun getCpusetMemsNative(group: String): String
    external fun setCpusetMemsNative(group: String, mems: String): Int
    external fun setSchedUtilClampMinRtDefaultNative(value: Int): Int

    // CPU
    external fun setCpufreqHardlimitMaxNative(freq: Long): Int
    external fun setCpufreqHardlimitMinNative(freq: Long): Int
    external fun setCpufreqHardlimitDvfsLockNative(enabled: Int): Int
    external fun setMsmCpufreqLimitNative(limit: Long): Int

    // Power
    external fun readWakeupCountNative(): Int
    external fun readSuspendCountNative(): Int

    // Network
    external fun setDmesgRestrictNative(enabled: Int): Int
    external fun setPrintkNative(level: Int): Int

    // Display
    external fun setBacklightDimmerNative(enabled: Int): Int

    // Thermal
    external fun setEaraFakeThrottleNative(enabled: Int): Int
    external fun setFpsgoForceNative(enabled: Int): Int

    // I/O
    external fun getIoSchedulerNative(device: String): String
    external fun getAvailableIoSchedulersNative(device: String): String
    external fun getIoReadaheadKbNative(device: String): Int
    external fun getIoNrRequestsNative(device: String): Int

    // GPU
    external fun getBusDcvsComponentsNative(): String
    external fun getBusDcvsFreqNative(busName: String): String

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

    // Xiaomi Charging
    external fun hasReverseChargeNative(): Int
    external fun setReverseChargeNative(enable: Int): Int
    external fun getReverseChargeNative(): String
    external fun hasNightChargingNative(): Int
    external fun setNightChargingNative(enable: Int): Int
    external fun getNightChargingNative(): String
    external fun hasCoolModeNative(): Int
    external fun setCoolModeNative(enable: Int): Int
    external fun getCoolModeNative(): String
    external fun hasSmartBatteryNative(): Int
    external fun setSmartBatteryNative(enable: Int): Int
    external fun getSmartBatteryNative(): String
    external fun hasInputSuspendNative(): Int
    external fun setInputSuspendNative(suspend: Int): Int
    external fun getUsbpdStatusNative(): String

    fun hasReverseCharge(): Boolean? = if (!isLoaded) null else try { hasReverseChargeNative() == 1 } catch (e: Exception) { null }
    fun setReverseCharge(enable: Boolean): Boolean = isLoaded && try { setReverseChargeNative(if (enable) 1 else 0) == 1 } catch (e: Exception) { false }
    fun getReverseCharge(): String? = if (!isLoaded) null else try { getReverseChargeNative() } catch (e: Exception) { null }
    fun hasNightCharging(): Boolean? = if (!isLoaded) null else try { hasNightChargingNative() == 1 } catch (e: Exception) { null }
    fun setNightCharging(enable: Boolean): Boolean = isLoaded && try { setNightChargingNative(if (enable) 1 else 0) == 1 } catch (e: Exception) { false }
    fun getNightCharging(): String? = if (!isLoaded) null else try { getNightChargingNative() } catch (e: Exception) { null }
    fun hasCoolMode(): Boolean? = if (!isLoaded) null else try { hasCoolModeNative() == 1 } catch (e: Exception) { null }
    fun setCoolMode(enable: Boolean): Boolean = isLoaded && try { setCoolModeNative(if (enable) 1 else 0) == 1 } catch (e: Exception) { false }
    fun getCoolMode(): String? = if (!isLoaded) null else try { getCoolModeNative() } catch (e: Exception) { null }
    fun hasSmartBattery(): Boolean? = if (!isLoaded) null else try { hasSmartBatteryNative() == 1 } catch (e: Exception) { null }
    fun setSmartBattery(enable: Boolean): Boolean = isLoaded && try { setSmartBatteryNative(if (enable) 1 else 0) == 1 } catch (e: Exception) { false }
    fun getSmartBattery(): String? = if (!isLoaded) null else try { getSmartBatteryNative() } catch (e: Exception) { null }
    fun hasInputSuspend(): Boolean? = if (!isLoaded) null else try { hasInputSuspendNative() == 1 } catch (e: Exception) { null }
    fun setInputSuspend(suspend: Boolean): Boolean = isLoaded && try { setInputSuspendNative(if (suspend) 1 else 0) == 1 } catch (e: Exception) { false }
    fun getUsbpdStatus(): Map<String, String>? = if (!isLoaded) null else try {
        val json = getUsbpdStatusNative()
        val obj = org.json.JSONObject(json)
        obj.keys().asSequence().associateWith { obj.getString(it) }
    } catch (e: Exception) { null }

    // Xiaomi Display
    external fun hasKcalNative(): Int
    external fun setKcalRgbNative(r: Int, g: Int, b: Int): Int
    external fun getKcalValuesNative(): String
    external fun setKcalContrastNative(value: Int): Int
    external fun setKcalSaturationNative(value: Int): Int
    external fun hasDfpsNative(): Int
    external fun setDfpsNative(mode: Int): Int
    external fun getDfpsModeNative(): Int
    external fun hasHistogramNative(): Int
    external fun setHistogramNative(enable: Int): Int
    external fun hasMipiRegNative(): Int
    external fun readMipiRegNative(): String

    fun hasKcal(): Boolean? = if (!isLoaded) null else try { hasKcalNative() == 1 } catch (e: Exception) { null }
    fun setKcalRgb(r: Int, g: Int, b: Int): Boolean = isLoaded && try { setKcalRgbNative(r, g, b) == 1 } catch (e: Exception) { false }
    fun getKcalValues(): String? = if (!isLoaded) null else try { getKcalValuesNative() } catch (e: Exception) { null }
    fun setKcalContrast(v: Int): Boolean = isLoaded && try { setKcalContrastNative(v) == 1 } catch (e: Exception) { false }
    fun setKcalSaturation(v: Int): Boolean = isLoaded && try { setKcalSaturationNative(v) == 1 } catch (e: Exception) { false }
    fun hasDfps(): Boolean? = if (!isLoaded) null else try { hasDfpsNative() == 1 } catch (e: Exception) { null }
    fun setDfps(mode: Int): Boolean = isLoaded && try { setDfpsNative(mode) == 1 } catch (e: Exception) { false }
    fun getDfpsMode(): Int? = if (!isLoaded) null else try { getDfpsModeNative() } catch (e: Exception) { null }
    fun hasHistogram(): Boolean? = if (!isLoaded) null else try { hasHistogramNative() == 1 } catch (e: Exception) { null }
    fun setHistogram(enable: Boolean): Boolean = isLoaded && try { setHistogramNative(if (enable) 1 else 0) == 1 } catch (e: Exception) { false }
    fun hasMipiReg(): Boolean? = if (!isLoaded) null else try { hasMipiRegNative() == 1 } catch (e: Exception) { null }
    fun readMipiReg(): String? = if (!isLoaded) null else try { readMipiRegNative() } catch (e: Exception) { null }

    // Haptic
    external fun hasAw8697Native(): Int
    external fun hasLraCalibrationNative(): Int
    external fun readLraCalibrationNative(): String
    external fun readAw8697F0Native(busAddr: String): String
    external fun hasCustomWaveNative(): Int
    external fun writeCustomWaveNative(busAddr: String, data: String): Int

    fun hasAw8697(): Boolean? = if (!isLoaded) null else try { hasAw8697Native() == 1 } catch (e: Exception) { null }
    fun hasLraCalibration(): Boolean? = if (!isLoaded) null else try { hasLraCalibrationNative() == 1 } catch (e: Exception) { null }
    fun readLraCalibration(): String? = if (!isLoaded) null else try { readLraCalibrationNative() } catch (e: Exception) { null }
    fun readAw8697F0(busAddr: String): String? = if (!isLoaded) null else try { readAw8697F0Native(busAddr) } catch (e: Exception) { null }
    fun hasCustomWave(): Boolean? = if (!isLoaded) null else try { hasCustomWaveNative() == 1 } catch (e: Exception) { null }
    fun writeCustomWave(busAddr: String, data: String): Boolean = isLoaded && try { writeCustomWaveNative(busAddr, data) == 1 } catch (e: Exception) { false }

    // Boot QCOM
    external fun getBootStatusJsonNative(): String
    external fun hasUfsClkscaleNative(): Int
    external fun setUfsClkscaleNative(enable: Int): Int
    external fun getUfsClkscaleNative(): String
    external fun getSubsysConfigJsonNative(): String
    external fun hasUsbIclNative(): Int
    external fun setUsbIclNative(active: Int, valMa: Int): Int
    external fun getUsbIclNative(): String
    external fun getPilTimeoutsJsonNative(): String
    external fun hasDloadNative(): Int
    external fun setDloadNative(enable: Int): Int
    external fun shutdownWlanNative(): Int

    fun getBootStatusJson(): String? = if (!isLoaded) null else try { getBootStatusJsonNative() } catch (e: Exception) { null }
    fun hasUfsClkscale(): Boolean? = if (!isLoaded) null else try { hasUfsClkscaleNative() == 1 } catch (e: Exception) { null }
    fun setUfsClkscale(enable: Boolean): Boolean = isLoaded && try { setUfsClkscaleNative(if (enable) 1 else 0) == 1 } catch (e: Exception) { false }
    fun getUfsClkscale(): String? = if (!isLoaded) null else try { getUfsClkscaleNative() } catch (e: Exception) { null }
    fun getSubsysConfigJson(): String? = if (!isLoaded) null else try { getSubsysConfigJsonNative() } catch (e: Exception) { null }
    fun hasUsbIcl(): Boolean? = if (!isLoaded) null else try { hasUsbIclNative() == 1 } catch (e: Exception) { null }
    fun setUsbIcl(active: Boolean, valMa: Int): Boolean = isLoaded && try { setUsbIclNative(if (active) 1 else 0, valMa) == 1 } catch (e: Exception) { false }
    fun getUsbIcl(): String? = if (!isLoaded) null else try { getUsbIclNative() } catch (e: Exception) { null }
    fun getPilTimeoutsJson(): String? = if (!isLoaded) null else try { getPilTimeoutsJsonNative() } catch (e: Exception) { null }
    fun hasDload(): Boolean? = if (!isLoaded) null else try { hasDloadNative() == 1 } catch (e: Exception) { null }
    fun setDload(enable: Boolean): Boolean = isLoaded && try { setDloadNative(if (enable) 1 else 0) == 1 } catch (e: Exception) { false }
    fun shutdownWlan(): Boolean = isLoaded && try { shutdownWlanNative() == 1 } catch (e: Exception) { false }

    // Sysctl QCOM (proc/sys paths from stock ROM)
    external fun setSchedLatencyNsNative(ns: Int): Int
    external fun setSchedWakeupGranularityNsNative(ns: Int): Int
    external fun setSchedChildRunsFirstNative(enabled: Boolean): Int
    external fun setRandomizeVaSpaceNative(level: Int): Int
    external fun setDirtyExpireCentisecsNative(`val`: Int): Int
    external fun setDirtyBackgroundRatioNative(pct: Int): Int
    external fun setOvercommitMemoryNative(mode: Int): Int
    external fun setExtraFreeKbytesNative(kb: Int): Int
    external fun setDropCachesLevelNative(level: Int): Int
    external fun setPerfEventParanoidNative(level: Int): Int
    external fun setKptrRestrictNative(level: Int): Int
    external fun setTcpDefaultInitRwndNative(`val`: Int): Int

    fun setSchedLatencyNs(ns: Int): Boolean = isLoaded && try { setSchedLatencyNsNative(ns) == 1 } catch (e: Exception) { false }
    fun setSchedWakeupGranularityNs(ns: Int): Boolean = isLoaded && try { setSchedWakeupGranularityNsNative(ns) == 1 } catch (e: Exception) { false }
    fun setSchedChildRunsFirst(enabled: Boolean): Boolean = isLoaded && try { setSchedChildRunsFirstNative(enabled) == 1 } catch (e: Exception) { false }
    fun setRandomizeVaSpace(level: Int): Boolean = isLoaded && try { setRandomizeVaSpaceNative(level) == 1 } catch (e: Exception) { false }
    fun setDirtyExpireCentisecs(v: Int): Boolean = isLoaded && try { setDirtyExpireCentisecsNative(v) == 1 } catch (e: Exception) { false }
    fun setDirtyBackgroundRatio(pct: Int): Boolean = isLoaded && try { setDirtyBackgroundRatioNative(pct) == 1 } catch (e: Exception) { false }
    fun setOvercommitMemory(mode: Int): Boolean = isLoaded && try { setOvercommitMemoryNative(mode) == 1 } catch (e: Exception) { false }
    fun setExtraFreeKbytes(kb: Int): Boolean = isLoaded && try { setExtraFreeKbytesNative(kb) == 1 } catch (e: Exception) { false }
    fun setDropCachesLevel(level: Int): Boolean = isLoaded && try { setDropCachesLevelNative(level) == 1 } catch (e: Exception) { false }
    fun setPerfEventParanoid(level: Int): Boolean = isLoaded && try { setPerfEventParanoidNative(level) == 1 } catch (e: Exception) { false }
    fun setKptrRestrict(level: Int): Boolean = isLoaded && try { setKptrRestrictNative(level) == 1 } catch (e: Exception) { false }
    fun setTcpDefaultInitRwnd(v: Int): Boolean = isLoaded && try { setTcpDefaultInitRwndNative(v) == 1 } catch (e: Exception) { false }

    // Boot QCOM Extended
    external fun setBootAdspNative(): Int
    external fun setBootCdspNative(): Int
    external fun setBootNpuNative(): Int
    external fun setBootCvpNative(): Int
    external fun setBootSlpiNative(): Int
    external fun setPblMbaTimeoutMsNative(ms: Int): Int
    external fun setModemAuthTimeoutMsNative(ms: Int): Int

    fun setBootAdsp(): Boolean = isLoaded && try { setBootAdspNative() == 1 } catch (e: Exception) { false }
    fun setBootCdsp(): Boolean = isLoaded && try { setBootCdspNative() == 1 } catch (e: Exception) { false }
    fun setBootNpu(): Boolean = isLoaded && try { setBootNpuNative() == 1 } catch (e: Exception) { false }
    fun setBootCvp(): Boolean = isLoaded && try { setBootCvpNative() == 1 } catch (e: Exception) { false }
    fun setBootSlpi(): Boolean = isLoaded && try { setBootSlpiNative() == 1 } catch (e: Exception) { false }
    fun setPblMbaTimeoutMs(ms: Int): Boolean = isLoaded && try { setPblMbaTimeoutMsNative(ms) == 1 } catch (e: Exception) { false }
    fun setModemAuthTimeoutMs(ms: Int): Boolean = isLoaded && try { setModemAuthTimeoutMsNative(ms) == 1 } catch (e: Exception) { false }

    // STune
    external fun getStuneValueNative(group: String, param: String): String
    external fun setStuneValueNative(group: String, param: String, value: String): Int
    external fun setStuneColocateNative(enabled: Int): Int
    external fun setStuneSchedBoostNoOverrideNative(group: String, enabled: Int): Int
    external fun getStuneGroupsNative(): String

    fun getStuneValue(group: String, param: String): String? = if (!isLoaded) null else try { getStuneValueNative(group, param) } catch (e: Exception) { null }
    fun setStuneValue(group: String, param: String, value: String): Boolean = isLoaded && try { setStuneValueNative(group, param, value) == 1 } catch (e: Exception) { false }
    fun setStuneColocate(enabled: Boolean): Boolean = isLoaded && try { setStuneColocateNative(if (enabled) 1 else 0) == 1 } catch (e: Exception) { false }
    fun setStuneSchedBoostNoOverride(group: String, enabled: Boolean): Boolean = isLoaded && try { setStuneSchedBoostNoOverrideNative(group, if (enabled) 1 else 0) == 1 } catch (e: Exception) { false }
    fun getStuneGroups(): List<String>? = if (!isLoaded) null else try {
        val arr = org.json.JSONArray(getStuneGroupsNative())
        (0 until arr.length()).map { arr.getString(it) }
    } catch (e: Exception) { null }

    // Touch HAL
    external fun hasXiaomiTouchNative(): Int
    external fun getFodStatusNative(): String
    external fun hasFodNative(): Int
    external fun hasTpLockdownNative(): Int
    external fun readTpInfoNative(): String
    external fun readTpGestureNative(): String

    fun hasXiaomiTouch(): Boolean? = if (!isLoaded) null else try { hasXiaomiTouchNative() == 1 } catch (e: Exception) { null }
    fun getFodStatus(): String? = if (!isLoaded) null else try { getFodStatusNative() } catch (e: Exception) { null }
    fun hasFod(): Boolean? = if (!isLoaded) null else try { hasFodNative() == 1 } catch (e: Exception) { null }
    fun hasTpLockdown(): Boolean? = if (!isLoaded) null else try { hasTpLockdownNative() == 1 } catch (e: Exception) { null }
    fun readTpInfo(): String? = if (!isLoaded) null else try { readTpInfoNative() } catch (e: Exception) { null }
    fun readTpGesture(): String? = if (!isLoaded) null else try { readTpGestureNative() } catch (e: Exception) { null }

    // === Missing Features Kotlin Wrappers ===

    // Scheduler
    fun getSchedFeatures(): String? = if (!isLoaded) null else try { getSchedFeaturesNative() } catch (e: Exception) { null }
    fun setSchedFeature(feature: String, enabled: Boolean): Boolean = isLoaded && try { setSchedFeatureNative(feature, if (enabled) 1 else 0) == 1 } catch (e: Exception) { false }
    fun setSchedLibName(names: String): Boolean = isLoaded && try { setSchedLibNameNative(names) == 1 } catch (e: Exception) { false }
    fun setSchedLibMaskForce(mask: Int): Boolean = isLoaded && try { setSchedLibMaskForceNative(mask) == 1 } catch (e: Exception) { false }
    fun setSchedBurstUpdatePeriod(ms: Int): Boolean = isLoaded && try { setSchedBurstUpdatePeriodNative(ms) == 1 } catch (e: Exception) { false }
    fun setSchedBurstSmoothUp(enabled: Boolean): Boolean = isLoaded && try { setSchedBurstSmoothUpNative(if (enabled) 1 else 0) == 1 } catch (e: Exception) { false }
    fun setSchedBurstGraham(enabled: Boolean): Boolean = isLoaded && try { setSchedBurstGrahamNative(if (enabled) 1 else 0) == 1 } catch (e: Exception) { false }
    fun setSchedAutogroup(enabled: Boolean): Boolean = isLoaded && try { setSchedAutogroupNative(if (enabled) 1 else 0) == 1 } catch (e: Exception) { false }
    fun setOvercommitRatio(pct: Int): Boolean = isLoaded && try { setOvercommitRatioNative(pct) == 1 } catch (e: Exception) { false }
    fun getCpusetMems(group: String): String? = if (!isLoaded) null else try { getCpusetMemsNative(group) } catch (e: Exception) { null }
    fun setCpusetMems(group: String, mems: String): Boolean = isLoaded && try { setCpusetMemsNative(group, mems) == 1 } catch (e: Exception) { false }
    fun setSchedUtilClampMinRtDefault(value: Int): Boolean = isLoaded && try { setSchedUtilClampMinRtDefaultNative(value) == 1 } catch (e: Exception) { false }

    // CPU
    fun setCpufreqHardlimitMax(freq: Long): Boolean = isLoaded && try { setCpufreqHardlimitMaxNative(freq) == 1 } catch (e: Exception) { false }
    fun setCpufreqHardlimitMin(freq: Long): Boolean = isLoaded && try { setCpufreqHardlimitMinNative(freq) == 1 } catch (e: Exception) { false }
    fun setCpufreqHardlimitDvfsLock(enabled: Boolean): Boolean = isLoaded && try { setCpufreqHardlimitDvfsLockNative(if (enabled) 1 else 0) == 1 } catch (e: Exception) { false }
    fun setMsmCpufreqLimit(limit: Long): Boolean = isLoaded && try { setMsmCpufreqLimitNative(limit) == 1 } catch (e: Exception) { false }

    // Power
    fun readWakeupCount(): Int? = if (!isLoaded) null else try { readWakeupCountNative() } catch (e: Exception) { null }
    fun readSuspendCount(): Int? = if (!isLoaded) null else try { readSuspendCountNative() } catch (e: Exception) { null }

    // Network
    fun setDmesgRestrict(enabled: Boolean): Boolean = isLoaded && try { setDmesgRestrictNative(if (enabled) 1 else 0) == 1 } catch (e: Exception) { false }
    fun setPrintk(level: Int): Boolean = isLoaded && try { setPrintkNative(level) == 1 } catch (e: Exception) { false }

    // Display
    fun setBacklightDimmer(enabled: Boolean): Boolean = isLoaded && try { setBacklightDimmerNative(if (enabled) 1 else 0) == 1 } catch (e: Exception) { false }

    // Thermal
    fun setEaraFakeThrottle(enabled: Boolean): Boolean = isLoaded && try { setEaraFakeThrottleNative(if (enabled) 1 else 0) == 1 } catch (e: Exception) { false }
    fun setFpsgoForce(enabled: Boolean): Boolean = isLoaded && try { setFpsgoForceNative(if (enabled) 1 else 0) == 1 } catch (e: Exception) { false }

    // I/O
    fun getIoScheduler(device: String): String? = if (!isLoaded) null else try { getIoSchedulerNative(device) } catch (e: Exception) { null }
    fun getAvailableIoSchedulers(device: String): String? = if (!isLoaded) null else try { getAvailableIoSchedulersNative(device) } catch (e: Exception) { null }
    fun getIoReadaheadKb(device: String): Int? = if (!isLoaded) null else try { getIoReadaheadKbNative(device) } catch (e: Exception) { null }
    fun getIoNrRequests(device: String): Int? = if (!isLoaded) null else try { getIoNrRequestsNative(device) } catch (e: Exception) { null }

    // GPU
    fun getBusDcvsComponents(): String? = if (!isLoaded) null else try { getBusDcvsComponentsNative() } catch (e: Exception) { null }
    fun getBusDcvsFreq(busName: String): String? = if (!isLoaded) null else try { getBusDcvsFreqNative(busName) } catch (e: Exception) { null }

    data class ClusterInfo(val clusterNumber: Int, val cores: List<Int>, val minFreq: Int, val maxFreq: Int,
                           val currentMinFreq: Int, val currentMaxFreq: Int, val governor: String,
                           val availableGovernors: List<String>, val policyPath: String, val availableFrequencies: List<Int>)
    data class CoreData(val core: Int, val online: Boolean, val freq: Int, val minFreq: Int, val maxFreq: Int, val governor: String)
    data class ThermalZone(val name: String, val temp: Float)
}
