package com.farewell.kernelmanager.viewmodel

import android.os.Build
import android.util.Log
import com.farewell.kernelmanager.kernel.AccessManager
import com.farewell.kernelmanager.kernel.AccessMode
import com.farewell.kernelmanager.kernel.BatteryAndroidReader
import com.farewell.kernelmanager.kernel.DevCheckEngine
import com.farewell.kernelmanager.kernel.NativeLib
import com.farewell.kernelmanager.kernel.ShellReader
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

data class DashboardState(
    val cpuLoad: Float = 0f,
    val cpuTemp: Float = 0f,
    val gpuFreq: Int = 0,
    val gpuLoad: Int = 0,
    val gpuTemp: Float = 0f,
    val gpuVendor: String = "Qualcomm",
    val gpuModel: String = "Adreno",
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

    private var appContextRef: android.content.Context? = null
    private val appCtx get() = appContextRef

    fun setAppContext(ctx: android.content.Context) { appContextRef = ctx }

    suspend fun detectAccessMode() {
        val mode = AccessManager.detectAccessMode()
        updateState { it.copy(accessMode = mode) }
    }

    override suspend fun refresh() {
        val ctx = appCtx ?: return

        try {
            // === CPU Load — Shell /proc/stat (bypasses SELinux block on JNI) ===
            var cpuLoad = 0f
            var cpuTemp = 0f
            var gpuFreq = 0
            var gpuLoad = 0
            var gpuVendor = "Qualcomm"
            var gpuModel = "Adreno"
            var batteryLevel = 0
            var batteryTemp = 0f
            var batteryVoltage = 0f
            var batteryCurrent = 0
            var isCharging = false

            // CPU via DevCheckEngine ShellReader (works on MIUI 14)
            val cpuInfo = DevCheckEngine.readCpuLoad(ctx)
            cpuLoad = cpuInfo.total

            // CPU Temp via Shell (thermal zone works from untrusted_app)
            cpuTemp = DevCheckEngine.readCpuTemp()

            // GPU — try shell, else NativeLib, else IOCTL
            val shellGpuFreq = DevCheckEngine.readGpuFreq(ctx)
            if (shellGpuFreq > 0) {
                gpuFreq = shellGpuFreq
            } else {
                // Try NativeLib
                try { gpuFreq = NativeLib.readGpuFreq() ?: 0 } catch (_: Exception) {}
            }
            if (gpuFreq <= 0) {
                try { gpuFreq = NativeLib.readGpuFreqIoctlNative() } catch (_: Exception) {}
            }

            val shellGpuBusy = DevCheckEngine.readGpuBusy(ctx)
            if (shellGpuBusy > 0) {
                gpuLoad = shellGpuBusy
            } else {
                try { gpuLoad = NativeLib.readGpuBusy() ?: 0 } catch (_: Exception) {}
            }
            if (gpuLoad <= 0) {
                try { gpuLoad = NativeLib.readGpuBusyIoctlNative() } catch (_: Exception) {}
            }

            try { gpuModel = NativeLib.readGpuModelIoctlNative() } catch (_: Exception) {}
            if (gpuModel == "Adreno") {
                try { gpuModel = NativeLib.getGpuModel() ?: "Adreno" } catch (_: Exception) {}
            }

            // Battery via Android API (always works)
            batteryLevel = DevCheckEngine.readBatteryLevel(ctx)
            batteryTemp = DevCheckEngine.readBatteryTemp(ctx) / 10f
            batteryVoltage = DevCheckEngine.readBatteryVoltage(ctx) / 1000f
            isCharging = DevCheckEngine.readBatteryCharging(ctx)

            // Battery current via NativeLib fallback
            try { batteryCurrent = NativeLib.readBatteryCurrent() ?: 0 } catch (_: Exception) {}
            if (batteryCurrent == 0) {
                val raw = ShellReader.read("cat", "/sys/class/power_supply/battery/current_now")
                if (raw != null) {
                    val cur = raw.toLongOrNull() ?: 0L
                    batteryCurrent = if (cur > 10000) (cur / 1000).toInt() else if (cur > 0) cur.toInt() else 0
                }
            }

            // RAM via NativeLib (falls back gracefully)
            val memInfo = try {
                val json = NativeLib.readMemInfoNative()
                val obj = org.json.JSONObject(json)
                Pair(obj.getLong("total_kb") / 1024, (obj.getLong("total_kb") - obj.getLong("available_kb")) / 1024)
            } catch (_: Exception) { Pair(0L, 0L) }

            val soc = NativeLib.getSystemProperty("ro.soc.model") ?: ""
            val android = NativeLib.getSystemProperty("ro.build.version.release") ?: ""

            Log.d("MainViewModel", "CPU=${cpuLoad}% GPU=${gpuFreq}MHz BAT=${batteryLevel}% T=${cpuTemp}°C")
            updateState {
                it.copy(
                    cpuLoad = cpuLoad, cpuTemp = cpuTemp, gpuFreq = gpuFreq, gpuLoad = gpuLoad,
                    gpuVendor = gpuVendor, gpuModel = gpuModel, batteryLevel = batteryLevel,
                    batteryTemp = batteryTemp, batteryVoltage = batteryVoltage, batteryCurrent = batteryCurrent,
                    isCharging = isCharging, ramUsedMb = memInfo.second, ramTotalMb = memInfo.first,
                    deviceModel = Build.MODEL, soc = soc, androidVersion = android,
                )
            }
        } catch (e: Exception) {
            Log.e("MainViewModel", "refresh failed", e)
        }
    }
}
