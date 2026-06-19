package com.farewell.kernelmanager.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.farewell.kernelmanager.kernel.*
import kotlinx.coroutines.*
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

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

class MainViewModel : ViewModel() {
    private val _state = MutableStateFlow(DashboardState())
    val state: StateFlow<DashboardState> = _state
    private var pollingJob: Job? = null

    init { startPolling() }

    private fun startPolling() {
        pollingJob?.cancel()
        pollingJob = viewModelScope.launch {
            while (isActive) {
                refreshData()
                delay(2000)
            }
        }
    }

    suspend fun detectAccessMode() {
        val mode = AccessManager.detectAccessMode()
        _state.value = _state.value.copy(accessMode = mode)
    }

    private suspend fun refreshData() {
        if (_state.value.accessMode == AccessMode.NON_ROOT && NativeLib.isAvailable()) {
            val cpuLoad = NativeLib.readCpuLoad() ?: 0f
            val cpuTemp = NativeLib.readCpuTemperature() ?: 0f
            val gpuFreq = NativeLib.readGpuFreq() ?: 0
            val gpuLoad = NativeLib.readGpuBusy() ?: 0
            val gpuVendor = NativeLib.getGpuVendor() ?: "Unknown"
            val gpuModel = NativeLib.getGpuModel() ?: "Unknown"
            val batteryLevel = NativeLib.readBatteryLevel() ?: 0
            val batteryTemp = NativeLib.readBatteryTemp() ?: 0f
            val batteryVoltage = NativeLib.readBatteryVoltage() ?: 0f
            val batteryCurrent = NativeLib.readBatteryCurrent() ?: 0
            val isCharging = NativeLib.isCharging() ?: false
            val memInfo = try {
                val json = NativeLib.readMemInfoNative()
                val obj = org.json.JSONObject(json)
                Pair(obj.getLong("total_kb") / 1024, (obj.getLong("total_kb") - obj.getLong("available_kb")) / 1024)
            } catch (e: Exception) { Pair(0L, 0L) }
            val soc = NativeLib.getSystemProperty("ro.soc.model") ?: ""
            val android = NativeLib.getSystemProperty("ro.build.version.release") ?: ""

            _state.value = _state.value.copy(
                cpuLoad = cpuLoad, cpuTemp = cpuTemp, gpuFreq = gpuFreq, gpuLoad = gpuLoad,
                gpuVendor = gpuVendor, gpuModel = gpuModel, batteryLevel = batteryLevel,
                batteryTemp = batteryTemp, batteryVoltage = batteryVoltage, batteryCurrent = batteryCurrent,
                isCharging = isCharging, ramUsedMb = memInfo.second, ramTotalMb = memInfo.first,
                deviceModel = android.os.Build.MODEL, soc = soc, androidVersion = android,
            )
        }
    }

    override fun onCleared() { pollingJob?.cancel() }
}
