package com.farewell.kernelmanager.viewmodel

import com.farewell.kernelmanager.kernel.NativeLib

data class GpuState(
    val vendor: String = "Unknown",
    val model: String = "Unknown",
    val driverInfo: String = "Unknown",
    val freq: Int = 0,
    val busy: Int = 0,
    val temp: Float = 0f,
    val availableFreqs: List<Int> = emptyList(),
    val availablePolicies: List<String> = emptyList(),
    val isLoading: Boolean = true,
)

class GPUViewModel : PollingViewModel<GpuState>(GpuState(), intervalMs = 2000) {

    override suspend fun refresh() {
        if (!NativeLib.isAvailable()) return
        val vendor = NativeLib.getGpuVendor() ?: "Unknown"
        val model = NativeLib.getGpuModel() ?: "Unknown"
        val driverInfo = NativeLib.getGpuDriverInfo() ?: "Unknown"
        val freq = NativeLib.readGpuFreq() ?: 0
        val busy = NativeLib.readGpuBusy() ?: 0
        val freqsJson = NativeLib.getGpuAvailableFrequenciesNative()
        val freqs = try { org.json.JSONArray(freqsJson).let { arr -> (0 until arr.length()).map { arr.getInt(it) } } } catch (_: Exception) { emptyList() }
        val policiesJson = NativeLib.getGpuAvailablePoliciesNative()
        val policies = try { org.json.JSONArray(policiesJson).let { arr -> (0 until arr.length()).map { arr.getString(it) } } } catch (_: Exception) { emptyList() }
        updateState { GpuState(vendor, model, driverInfo, freq, busy, 0f, freqs, policies, false) }
    }

    fun setPowerLevels(min: Int, max: Int) {
        viewModelScopeIO { NativeLib.setGpuPowerLevelsNative(min, max) }
    }

    fun setForce(state: String, value: Boolean) {
        viewModelScopeIO { NativeLib.setGpuForceNative(state, value) }
    }

    fun setFreqLimit(min: Int, max: Int) {
        viewModelScopeIO { NativeLib.setGpuFreqLimitNative(min, max) }
    }

    fun resetStats() {
        viewModelScopeIO { NativeLib.resetGpuStatsNative() }
    }
}
