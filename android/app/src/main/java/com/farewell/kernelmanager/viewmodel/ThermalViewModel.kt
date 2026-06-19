package com.farewell.kernelmanager.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.farewell.kernelmanager.kernel.NativeLib
import kotlinx.coroutines.*
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

data class ThermalState(
    val zones: List<NativeLib.ThermalZone> = emptyList(),
    val cpuTemp: Float = 0f, val selectedPreset: String = "default",
    val isLoading: Boolean = true,
)

class ThermalViewModel : ViewModel() {
    private val _state = MutableStateFlow(ThermalState())
    val state: StateFlow<ThermalState> = _state
    private var job: Job? = null

    init { startPolling() }

    private fun startPolling() {
        job?.cancel()
        job = viewModelScope.launch { while (isActive) { refresh(); delay(2000) } }
    }

    private suspend fun refresh() {
        if (!NativeLib.isAvailable()) return
        try {
            val zones = NativeLib.readThermalZones() ?: emptyList()
            val cpuTemp = NativeLib.readCpuTemperature() ?: 0f
            _state.value = ThermalState(zones, cpuTemp, _state.value.selectedPreset, false)
        } catch (e: Exception) { }
    }

    fun setPreset(preset: String) {
        viewModelScope.launch(Dispatchers.IO) { NativeLib.setThermalSconfigNative(preset) }
        _state.value = _state.value.copy(selectedPreset = preset)
    }

    override fun onCleared() { job?.cancel() }
}
