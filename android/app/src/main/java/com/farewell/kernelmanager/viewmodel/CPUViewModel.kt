package com.farewell.kernelmanager.viewmodel

import com.farewell.kernelmanager.kernel.NativeLib

data class CpuState(
    val clusters: List<NativeLib.ClusterInfo> = emptyList(),
    val cores: List<NativeLib.CoreData> = emptyList(),
    val cpuModel: String = "Unknown",
    val cpuLoad: Float = 0f,
    val cpuTemp: Float = 0f,
    val isLoading: Boolean = true,
)

class CPUViewModel : PollingViewModel<CpuState>(CpuState(), intervalMs = 2000) {

    override suspend fun refresh() {
        if (!NativeLib.isAvailable()) return
        val clusters = NativeLib.detectCpuClusters() ?: emptyList()
        val cores = NativeLib.readCoreData() ?: emptyList()
        val model = NativeLib.getCpuModel() ?: "Unknown"
        val load = NativeLib.readCpuLoad() ?: 0f
        val temp = NativeLib.readCpuTemperature() ?: 0f
        updateState { CpuState(clusters, cores, model, load, temp, false) }
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
