package com.farewell.kernelmanager.viewmodel

import android.os.Build
import android.util.Log
import com.farewell.kernelmanager.kernel.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

data class DashboardState(
    val cpuLoad: Float = 0f,
    val cpuTemp: Float = 0f,
    val cpuFreqs: Map<Int, Int> = emptyMap(),
    val gpuFreq: Int = 0,
    val gpuLoad: Int = 0,
    val gpuVendor: String = "Qualcomm",
    val gpuModel: String = "Adreno",
    val gpuGmem: Int = 0,
    val batteryLevel: Int = 0,
    val batteryTemp: Float = 0f,
    val batteryVoltage: Float = 0f,
    val batteryCurrent: Int = 0,
    val isCharging: Boolean = false,
    val batteryStatus: String = "Unknown",
    val batteryHealth: String = "Unknown",
    val batteryTech: String = "Unknown",
    val batteryCycleCount: Int = -1,
    val ramUsedMb: Long = 0,
    val ramTotalMb: Long = 0,
    val swapUsedMb: Long = 0,
    val hasSwap: Boolean = false,
    val accessMode: AccessMode = AccessMode.NON_ROOT,
    val deviceModel: String = "",
    val deviceName: String = "",
    val soc: String = "",
    val kernelVersion: String = "",
    val androidVersion: String = "",
    val panelName: String = "",
    val abis: String = "",
    val emmcLife: String = "",
)

class MainViewModel : PollingViewModel<DashboardState>(DashboardState(), intervalMs = 2000) {

    private var appContextRef: android.content.Context? = null
    private val appCtx get() = appContextRef
    private var sysInit = false

    fun setAppContext(ctx: android.content.Context) { appContextRef = ctx }

    suspend fun detectAccessMode() {
        val mode = AccessManager.detectAccessMode()
        updateState { it.copy(accessMode = mode) }
    }

    override suspend fun refresh() {
        val ctx = appCtx ?: return
        if (!NativeLib.isAvailable()) return

        if (!sysInit) {
            sysInit = true
            DeviceInfoReader.init(ctx)
            updateState {
                it.copy(
                    soc = SystemReader.getSoc(),
                    deviceName = SystemReader.getDeviceName(),
                    androidVersion = SystemReader.getAndroidVersion(),
                    abis = SystemReader.getAbiList(),
                    panelName = SystemReader.getPanelName(),
                )
            }
        }

        try {
            // CPU load via NativeLib
            val cpuLoad = try { NativeLib.readCpuLoad() ?: 0f } catch (_: Exception) { 0f }
            val cpuTemp = readCpuTemp()

            // GPU — model via sysfs or GL, freq/load via IOCTL or root
            val gpuFreq = readGpuFreq()
            val gpuLoad = readGpuLoad()
            var gpuModel = try { AccessManager.readFile("/sys/kernel/gpu/gpu_model").takeIf { it.isNotEmpty() } } catch (_: Exception) { null }
            if (gpuModel == null) try { NativeLib.readGpuModelIoctlNative().takeIf { it != "Adreno" } } catch (_: Exception) { null }
            if (gpuModel == null) try { NativeLib.getGpuModel()?.takeIf { it != "Adreno" } } catch (_: Exception) { null }
            if (gpuModel == null) gpuModel = GpuInfoReader.getGpuModel()
            val gpuGmem = SystemReader.getGmemSize()

            // Battery via Android API
            val batteryLevel = BatteryAndroidReader.getLevel(ctx)
            val batteryTemp = BatteryAndroidReader.getTemperature(ctx) / 10f
            val batteryVoltage = BatteryAndroidReader.getVoltage(ctx) / 1000f
            val isCharging = BatteryAndroidReader.isCharging(ctx)
            val batteryStatus = BatteryAndroidReader.getStatus(ctx)
            val batteryHealth = BatteryAndroidReader.getHealth(ctx)
            val batteryTech = BatteryAndroidReader.getTechnology(ctx)
            val batteryCycleCount = BatteryAndroidReader.getCycleCount()
            val hasSwap = BatteryAndroidReader.hasSwap()

            var batteryCurrent = 0
            try { batteryCurrent = NativeLib.readBatteryCurrent() ?: 0 } catch (_: Exception) {}
            if (batteryCurrent == 0) {
                AccessManager.readFile("/sys/class/power_supply/battery/current_now").let { raw ->
                    val cur = raw.toLongOrNull() ?: 0
                    batteryCurrent = if (cur > 10000) (cur / 1000).toInt() else if (cur > 0) cur.toInt() else 0
                }
            }

            val memInfo = try {
                val json = NativeLib.readMemInfoNative()
                val obj = org.json.JSONObject(json)
                Pair(obj.getLong("total_kb") / 1024, (obj.getLong("total_kb") - obj.getLong("available_kb")) / 1024)
            } catch (_: Exception) { Pair(0L, 0L) }

            Log.d("MainViewModel", "CPU=${cpuLoad}% GPU=${gpuFreq}MHz BAT=${batteryLevel}% T=${cpuTemp}°C")
            updateState {
                it.copy(
                    cpuLoad = cpuLoad, cpuTemp = cpuTemp, gpuFreq = gpuFreq, gpuLoad = gpuLoad,
                    gpuModel = gpuModel, gpuGmem = gpuGmem,
                    batteryLevel = batteryLevel, batteryTemp = batteryTemp, batteryVoltage = batteryVoltage,
                    batteryCurrent = batteryCurrent, isCharging = isCharging, batteryStatus = batteryStatus,
                    batteryHealth = batteryHealth, batteryTech = batteryTech, batteryCycleCount = batteryCycleCount,
                    ramUsedMb = memInfo.second, ramTotalMb = memInfo.first, hasSwap = hasSwap,
                    deviceModel = Build.MODEL,
                )
            }
        } catch (e: Exception) { Log.e("MainViewModel", "refresh failed", e) }
    }

    private suspend fun readCpuTemp(): Float = withContext(Dispatchers.IO) {
        for (zone in 0..9) {
            val type = AccessManager.readFile("/sys/class/thermal/thermal_zone${zone}/type").takeIf { it.isNotEmpty() } ?: continue
            val lower = type.lowercase()
            if (lower.contains("cpu") || lower.contains("tsens") || lower == "pa") {
                val raw = AccessManager.readFile("/sys/class/thermal/thermal_zone${zone}/temp")
                val temp = raw.toFloatOrNull() ?: continue
                return@withContext if (temp > 1000f) temp / 1000f else if (temp > 100f) temp / 10f else temp
            }
        }
        val raw = AccessManager.readFile("/sys/class/thermal/thermal_zone0/temp")
        val temp = raw.toFloatOrNull() ?: return@withContext 0f
        if (temp > 1000f) temp / 1000f else if (temp > 100f) temp / 10f else temp
    }

    private suspend fun readSysfsInt(path: String): Long? {
        return try { NativeLib.readSysfsNative(path).toLongOrNull() } catch (_: Exception) { null }
            ?: try { AccessManager.readFile(path).toLongOrNull() } catch (_: Exception) { null }
            ?: ShellReader.read("cat", path)?.trim()?.toLongOrNull()
    }

    private suspend fun readGpuFreq(): Int = withContext(Dispatchers.IO) {
        // Try: IOCTL → kernel/gpu/clock_mhz → kgsl-3d0/gpuclk → kgsl-3d0/devfreq
        try { NativeLib.readGpuFreqIoctlNative().takeIf { it > 0 } } catch (_: Exception) { null }
        ?: readSysfsInt("/sys/kernel/gpu/gpu_clock")?.toInt()?.takeIf { it > 0 }
        ?: readSysfsInt("/sys/devices/platform/soc/5000000.qcom,kgsl-3d0/kgsl/kgsl-3d0/clock_mhz")?.toInt()?.takeIf { it > 0 }
        ?: run {
            val raw = AccessManager.readFile("/sys/class/kgsl/kgsl-3d0/gpuclk")
            val freq = raw.trim().toLongOrNull() ?: return@run null
            if (freq > 1_000_000) (freq / 1_000_000).toInt() else if (freq > 1000) (freq / 1000).toInt() else freq.toInt()
        } ?: 0
    }

    private suspend fun readGpuLoad(): Int = withContext(Dispatchers.IO) {
        try { NativeLib.readGpuBusyIoctlNative().takeIf { it > 0 } } catch (_: Exception) { null }
        ?: readSysfsInt("/sys/kernel/gpu/gpu_busy")?.toInt()?.takeIf { it in 0..100 }
        ?: readSysfsInt("/sys/devices/platform/soc/5000000.qcom,kgsl-3d0/kgsl/kgsl-3d0/gpu_busy_percentage")?.toInt()?.takeIf { it in 0..100 }
        ?: run {
            val raw = AccessManager.readFile("/sys/class/kgsl/kgsl-3d0/gpubusy")
            val parts = raw.trim().split("\\s+".toRegex())
            if (parts.size >= 2) {
                val busy = parts[0].toLongOrNull() ?: 0
                val total = parts[1].toLongOrNull() ?: 0
                if (total > 0) ((busy * 100) / total).toInt().coerceIn(0, 100) else 0
            } else 0
        } ?: 0
    }
}
