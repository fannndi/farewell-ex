package com.farewell.kernelmanager.viewmodel

import android.util.Log
import com.farewell.kernelmanager.kernel.native.NativeLib

data class ThermalState(
    val zones: List<NativeLib.ThermalZone> = emptyList(),
    val cpuTemp: Float = 0f,
    val selectedPreset: String = "default",
    val isLoading: Boolean = true,
)

class ThermalViewModel : PollingViewModel<ThermalState>(ThermalState(), intervalMs = 2000) {

    override suspend fun refresh() {
        if (!NativeLib.isAvailable()) return
        try {
            val zones = NativeLib.readThermalZones() ?: emptyList()
            val cpuTemp = NativeLib.readCpuTemperature() ?: 0f
            updateState { it.copy(zones = zones, cpuTemp = cpuTemp, isLoading = false) }
        } catch (e: Exception) { Log.e("ThermalViewModel", "refresh failed", e) }
    }

    fun setPreset(preset: String) {
        updateState { it.copy(selectedPreset = preset) }
        viewModelScopeIO { NativeLib.setThermalSconfigNative(preset) }
    }
}
