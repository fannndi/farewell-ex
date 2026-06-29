package com.farewell.kernelmanager.viewmodel

import android.util.Log
import androidx.lifecycle.viewModelScope
import com.farewell.kernelmanager.kernel.AccessManager
import com.farewell.kernelmanager.kernel.NativeLib
import com.farewell.kernelmanager.ui.components.TestResult
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

data class ThermalState(
    val zones: List<NativeLib.ThermalZone> = emptyList(),
    val cpuTemp: Float = 0f, val selectedPreset: String = "default",
    val isLoading: Boolean = true,
)

class ThermalViewModel : PollingViewModel<ThermalState>(ThermalState(), intervalMs = 2000) {
    val lastTest = mutableMapOf<String, TestResult>()

    override suspend fun refresh() {
        if (!NativeLib.isAvailable()) return
        try {
            val zones = NativeLib.readThermalZones() ?: emptyList()
            val cpuTemp = NativeLib.readCpuTemperature() ?: 0f
            updateState { it.copy(zones = zones, cpuTemp = cpuTemp, isLoading = false) }
        } catch (e: Exception) { Log.e("ThermalVM", "refresh failed", e) }
    }

    // Preset map: default=11, extreme=2, dynamic=10, incalls=8, cool=20
    fun setPreset(preset: String) {
        val valMap = mapOf("default" to "11", "class0" to "11", "extreme" to "2", "dynamic" to "10", "incalls" to "8", "cool" to "20")
        val value = valMap[preset] ?: "11"
        viewModelScopeIO {
            AccessManager.writeFile("/sys/class/thermal/thermal_message/sconfig", value)
            updateState { it.copy(selectedPreset = preset) }
        }
    }
    fun setMsmThermal(on: Boolean) { viewModelScopeIO { AccessManager.writeFile("/sys/module/msm_thermal/parameters/enabled", if (on) "Y" else "N") } }
    fun setEaraThermal(on: Boolean) { viewModelScopeIO { AccessManager.writeFile("/sys/kernel/eara_thermal/enable", if (on) "1" else "0") } }

    fun testPreset() { test("preset") { AccessManager.writeFile("/sys/class/thermal/thermal_message/sconfig", "11") } }
    private fun test(key: String, block: suspend () -> Boolean) {
        viewModelScope.launch { lastTest[key] = TestResult.Loading; lastTest[key] = if (withContext(Dispatchers.IO) { block() }) TestResult.Pass("OK") else TestResult.Fail("failed") }
    }
}
