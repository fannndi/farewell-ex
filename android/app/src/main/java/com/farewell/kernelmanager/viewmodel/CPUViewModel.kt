package com.farewell.kernelmanager.viewmodel

import com.farewell.kernelmanager.kernel.NativeLib
import com.farewell.kernelmanager.kernel.SysfsReader

data class CpuState(
    val clusters: List<NativeLib.ClusterInfo> = emptyList(),
    val cores: List<NativeLib.CoreData> = emptyList(),
    val cpuModel: String = "Unknown",
    val cpuLoad: Float = 0f,
    val cpuTemp: Float = 0f,
    val cpuFreqs: Map<Int, Int> = emptyMap(),
    val isLoading: Boolean = true,
)

class CPUViewModel : PollingViewModel<CpuState>(CpuState(), intervalMs = 2000) {

    override suspend fun refresh() {
        val clusters = if (NativeLib.isAvailable()) NativeLib.detectCpuClusters() ?: emptyList() else emptyList()
        val cores = if (NativeLib.isAvailable()) NativeLib.readCoreData() ?: emptyList() else emptyList()
        val model = if (NativeLib.isAvailable()) NativeLib.getCpuModel() ?: "Unknown" else "Unknown"
        val load = if (NativeLib.isAvailable()) NativeLib.readCpuLoad() ?: 0f else 0f
        val temp = if (NativeLib.isAvailable()) NativeLib.readCpuTemperature() ?: 0f else 0f
        val freqs = SysfsReader.readCpuFreqs()
        updateState { CpuState(clusters, cores, model, load, temp, freqs, false) }
    }

    fun setGovernor(cluster: Int, governor: String) {
        viewModelScopeIO { NativeLib.setGovernorNative(governor) }
    }

    fun setFreqLimit(core: Int, min: Int, max: Int) {
        viewModelScopeIO { NativeLib.setFreqLimitNative(core, min, max) }
    }

    fun setCoreOnline(core: Int, online: Boolean) {
        viewModelScopeIO { NativeLib.setCoreOnlineNative(core, online) }
    }
}
