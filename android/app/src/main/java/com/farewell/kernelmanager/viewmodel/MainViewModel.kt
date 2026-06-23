package com.farewell.kernelmanager.viewmodel

import android.os.Build
import android.util.Log
import com.farewell.kernelmanager.kernel.AccessManager
import com.farewell.kernelmanager.kernel.AccessMode
import com.farewell.kernelmanager.kernel.BatteryAndroidReader
import com.farewell.kernelmanager.kernel.NativeLib
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

data class DashboardState(
    val cpuLoad: Float = 0f,
    val cpuTemp: Float = 0f,
    val gpuFreq: Int = 0,
    val gpuLoad: Int = 0,
    val gpuTemp: Float = 0f,
    val gpuVendor: String = "Unknown",
    val gpuModel: String = "Unknown",
    val batteryLevel: Int = 0,
    val batteryTemp: Float = 0f,
    val batteryVoltage: Float = 0f,
    val batteryCurrent: Int = 0,
    val isCharging: Boolean = false,
    val ramUsedMb: Long = 0,
    val ramTotalMb: Long = 0,
    val accessMode: AccessMode = AccessMode.NON_ROOT,
    val deviceModel: String = "",
    val soc: String = "",
    val kernelVersion: String = "",
    val androidVersion: String = "",
)

class MainViewModel : PollingViewModel<DashboardState>(DashboardState(), intervalMs = 2000) {

    suspend fun detectAccessMode() {
        val mode = AccessManager.detectAccessMode()
        updateState { it.copy(accessMode = mode) }
    }

    private suspend fun shellRead(path: String): String = withContext(Dispatchers.IO) {
        if (AccessManager.currentMode == AccessMode.NON_ROOT) return@withContext ""
        AccessManager.readFile(path)
    }

    private var appContextRef: android.content.Context? = null
    private val appCtx get() = appContextRef

    fun setAppContext(ctx: android.content.Context) { appContextRef = ctx }

    override suspend fun refresh() {
        if (!NativeLib.isAvailable()) return
        try {
            var cpuLoad = NativeLib.readCpuLoad() ?: 0f
            var cpuTemp = NativeLib.readCpuTemperature() ?: 0f
            var gpuFreq = 0
            var gpuLoad = 0
            val gpuVendor = "Qualcomm"
            var gpuModel = "Adreno"
            var batteryLevel = 0
            var batteryTemp = 0f
            var batteryVoltage = 0f
            var batteryCurrent = 0
            var isCharging = false

            // GPU via IOCTL first (SELinux-safe)
            try {
                val f = NativeLib.readGpuFreqIoctlNative()
                if (f > 0) gpuFreq = f
            } catch (_: Exception) {}
            if (gpuFreq <= 0) {
                try { gpuFreq = NativeLib.readGpuFreq() ?: 0 } catch (_: Exception) {}
            }
            if (gpuFreq <= 0) {
                val s = shellRead("/sys/class/kgsl/kgsl-3d0/gpuclk")
                gpuFreq = s.toIntOrNull() ?: 0
                if (gpuFreq > 1000000) gpuFreq /= 1000000
            }

            try {
                val b = NativeLib.readGpuBusyIoctlNative()
                if (b > 0) gpuLoad = b
            } catch (_: Exception) {}
            if (gpuLoad <= 0) {
                try { gpuLoad = NativeLib.readGpuBusy() ?: 0 } catch (_: Exception) {}
            }
            if (gpuLoad <= 0) {
                val s = shellRead("/sys/class/kgsl/kgsl-3d0/gpubusy")
                val parts = s.split("\\s+".toRegex())
                if (parts.size >= 2) {
                    gpuLoad = parts[0].toLongOrNull()?.let { busy ->
                        parts[1].toLongOrNull()?.let { total ->
                            if (total > 0) ((busy * 100) / total).toInt() else 0
                        } ?: 0
                    } ?: 0
                }
            }

            try { gpuModel = NativeLib.readGpuModelIoctlNative() } catch (_: Exception) {}
            if (gpuModel == "Adreno") {
                try { gpuModel = NativeLib.getGpuModel() ?: "Adreno" } catch (_: Exception) {}
            }

            // Battery via Android API first (always works)
            appCtx?.let { ctx ->
                batteryLevel = BatteryAndroidReader.getLevel(ctx)
                if (batteryLevel <= 0) {
                    try { batteryLevel = NativeLib.readBatteryLevel() ?: 0 } catch (_: Exception) {}
                }

                batteryTemp = BatteryAndroidReader.getTemperature(ctx) / 10f
                if (batteryTemp <= 0f) {
                    try { batteryTemp = NativeLib.readBatteryTemp() ?: 0f } catch (_: Exception) {}
                }

                batteryVoltage = BatteryAndroidReader.getVoltage(ctx) / 1000f
                if (batteryVoltage <= 0f) {
                    try { batteryVoltage = NativeLib.readBatteryVoltage() ?: 0f } catch (_: Exception) {}
                }

                batteryCurrent = BatteryAndroidReader.getLevel(ctx).let {
                    // no BATTERY_PROPERTY_CURRENT_NOW on API < 35 via getIntProperty
                    0
                }
                if (batteryCurrent == 0) {
                    try { batteryCurrent = NativeLib.readBatteryCurrent() ?: 0 } catch (_: Exception) {}
                }

                isCharging = BatteryAndroidReader.isCharging(ctx)
            }

            // CPU load via shell fallback
            if (cpuLoad <= 0f) {
                val stat = shellRead("/proc/stat")
                if (stat.isNotEmpty()) {
                    val lines = stat.lines().filter { it.startsWith("cpu") && !it.startsWith("cpu ") }
                    if (lines.isNotEmpty()) {
                        var idle = 0L; var all = 0L
                        lines.forEach { line ->
                            val p = line.split("\\s+".toRegex())
                            if (p.size >= 5) {
                                idle += p[4].toLongOrNull() ?: 0
                                all += p.drop(1).sumOf { it.toLongOrNull() ?: 0 }
                            }
                        }
                        if (all > 0) cpuLoad = 100f - (idle.toFloat() / all * 100f)
                    }
                }
            }

            val memInfo = try {
                val json = NativeLib.readMemInfoNative()
                val obj = org.json.JSONObject(json)
                Pair(obj.getLong("total_kb") / 1024, (obj.getLong("total_kb") - obj.getLong("available_kb")) / 1024)
            } catch (_: Exception) { Pair(0L, 0L) }
            val soc = NativeLib.getSystemProperty("ro.soc.model") ?: ""
            val android = NativeLib.getSystemProperty("ro.build.version.release") ?: ""

            Log.d("MainViewModel", "GPU=${gpuFreq}MHz load=${gpuLoad}% bat=${batteryLevel}% temp=${batteryTemp}°C cpu=${cpuLoad}%")
            updateState {
                it.copy(
                    cpuLoad = cpuLoad, cpuTemp = cpuTemp, gpuFreq = gpuFreq, gpuLoad = gpuLoad,
                    gpuVendor = gpuVendor, gpuModel = gpuModel, batteryLevel = batteryLevel,
                    batteryTemp = batteryTemp, batteryVoltage = batteryVoltage, batteryCurrent = batteryCurrent,
                    isCharging = isCharging, ramUsedMb = memInfo.second, ramTotalMb = memInfo.first,
                    deviceModel = Build.MODEL, soc = soc, androidVersion = android,
                )
            }
        } catch (e: Exception) { Log.e("MainViewModel", "refresh failed", e) }
    }
}
