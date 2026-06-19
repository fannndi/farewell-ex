package com.farewell.kernelmanager.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.farewell.kernelmanager.kernel.NativeLib
import kotlinx.coroutines.*
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

data class GpuState(
    val vendor: String = "Unknown", val model: String = "Unknown", val driverInfo: String = "Unknown",
    val freq: Int = 0, val busy: Int = 0, val temp: Float = 0f,
    val availableFreqs: List<Int> = emptyList(), val availablePolicies: List<String> = emptyList(),
    val isLoading: Boolean = true,
)

class GPUViewModel : ViewModel() {
    private val _state = MutableStateFlow(GpuState())
    val state: StateFlow<GpuState> = _state
    private var job: Job? = null

    init { startPolling() }

    private fun startPolling() {
        job?.cancel()
        job = viewModelScope.launch { while (isActive) { refresh(); delay(2000) } }
    }

    private suspend fun refresh() {
        if (!NativeLib.isAvailable()) return
        try {
            val vendor = NativeLib.getGpuVendor() ?: "Unknown"
            val model = NativeLib.getGpuModel() ?: "Unknown"
            val driverInfo = NativeLib.getGpuDriverInfo() ?: "Unknown"
            val freq = NativeLib.readGpuFreq() ?: 0
            val busy = NativeLib.readGpuBusy() ?: 0
            val freqsJson = NativeLib.getGpuAvailableFrequenciesNative()
            val freqs = try { org.json.JSONArray(freqsJson).let { arr -> (0 until arr.length()).map { arr.getInt(it) } } } catch (e: Exception) { emptyList() }
            val policiesJson = NativeLib.getGpuAvailablePoliciesNative()
            val policies = try { org.json.JSONArray(policiesJson).let { arr -> (0 until arr.length()).map { arr.getString(it) } } } catch (e: Exception) { emptyList() }
            _state.value = GpuState(vendor, model, driverInfo, freq, busy, 0f, freqs, policies, false)
        } catch (e: Exception) { }
    }

    fun setPowerLevels(min: Int, max: Int) {
        viewModelScope.launch(Dispatchers.IO) { if (NativeLib.isAvailable()) NativeLib.setGpuPowerLevelsNative(min, max) }
    }

    fun setForce(state: String, value: Boolean) {
        viewModelScope.launch(Dispatchers.IO) { if (NativeLib.isAvailable()) NativeLib.setGpuForceNative(state, value) }
    }

    fun setFreqLimit(min: Int, max: Int) {
        viewModelScope.launch(Dispatchers.IO) { if (NativeLib.isAvailable()) NativeLib.setGpuFreqLimitNative(min, max) }
    }

    fun resetStats() {
        viewModelScope.launch(Dispatchers.IO) { if (NativeLib.isAvailable()) NativeLib.resetGpuStatsNative() }
    }

    override fun onCleared() { job?.cancel() }
}
