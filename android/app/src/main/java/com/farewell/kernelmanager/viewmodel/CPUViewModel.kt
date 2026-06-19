package com.farewell.kernelmanager.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.farewell.kernelmanager.kernel.*
import kotlinx.coroutines.*
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

data class CpuState(
    val clusters: List<NativeLib.ClusterInfo> = emptyList(),
    val cores: List<NativeLib.CoreData> = emptyList(),
    val cpuModel: String = "Unknown",
    val cpuLoad: Float = 0f,
    val cpuTemp: Float = 0f,
    val isLoading: Boolean = true,
)

class CPUViewModel : ViewModel() {
    private val _state = MutableStateFlow(CpuState())
    val state: StateFlow<CpuState> = _state
    private var job: Job? = null

    init { startPolling() }

    private fun startPolling() {
        job?.cancel()
        job = viewModelScope.launch {
            while (isActive) { refresh(); delay(2000) }
        }
    }

    private suspend fun refresh() {
        if (NativeLib.isAvailable()) {
            val clusters = NativeLib.detectCpuClusters() ?: emptyList()
            val cores = NativeLib.readCoreData() ?: emptyList()
            val model = NativeLib.getCpuModel() ?: "Unknown"
            val load = NativeLib.readCpuLoad() ?: 0f
            val temp = NativeLib.readCpuTemperature() ?: 0f
            _state.value = CpuState(clusters, cores, model, load, temp, false)
        }
    }

    fun setGovernor(governor: String) {
        viewModelScope.launch(Dispatchers.IO) {
            if (NativeLib.isAvailable()) NativeLib.setGovernorNative(governor)
            else AccessManager.executeCommand("echo '$governor' > /sys/devices/system/cpu/cpu*/cpufreq/scaling_governor")
        }
    }

    fun setFreqLimit(core: Int, min: Int, max: Int) {
        viewModelScope.launch(Dispatchers.IO) {
            if (NativeLib.isAvailable()) NativeLib.setFreqLimitNative(core, min, max)
        }
    }

    fun setCoreOnline(core: Int, online: Boolean) {
        viewModelScope.launch(Dispatchers.IO) {
            if (NativeLib.isAvailable()) NativeLib.setCoreOnlineNative(core, online)
        }
    }

    override fun onCleared() { job?.cancel() }
}
