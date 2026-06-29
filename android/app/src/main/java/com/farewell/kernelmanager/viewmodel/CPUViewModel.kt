package com.farewell.kernelmanager.viewmodel

import androidx.lifecycle.viewModelScope
import com.farewell.kernelmanager.kernel.NativeLib
import com.farewell.kernelmanager.kernel.SysfsReader
import com.farewell.kernelmanager.ui.components.TestResult
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

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
    val lastTest = mutableMapOf<String, TestResult>()

    override suspend fun refresh() {
        val clusters = if (NativeLib.isAvailable()) NativeLib.detectCpuClusters() ?: emptyList() else emptyList()
        val cores = if (NativeLib.isAvailable()) NativeLib.readCoreData() ?: emptyList() else emptyList()
        val model = if (NativeLib.isAvailable()) NativeLib.getCpuModel() ?: "Unknown" else "Unknown"
        val load = if (NativeLib.isAvailable()) NativeLib.readCpuLoad() ?: 0f else 0f
        val temp = if (NativeLib.isAvailable()) NativeLib.readCpuTemperature() ?: 0f else 0f
        val freqs = SysfsReader.readCpuFreqs()
        updateState { CpuState(clusters, cores, model, load, temp, freqs, false) }
    }

    fun setGovernor(cluster: Int, governor: String) { viewModelScopeIO { NativeLib.setGovernorNative(governor) } }
    fun setFreqLimit(core: Int, min: Int, max: Int) { viewModelScopeIO { NativeLib.setFreqLimitNative(core, min, max) } }
    fun setCoreOnline(core: Int, online: Boolean) { viewModelScopeIO { NativeLib.setCoreOnlineNative(core, online) } }

    // ── Test methods ──
    fun testGovernor(name: String = "performance") { test("governor") { NativeLib.setGovernorNative(name) == 1 } }
    fun testFreqLimit() { test("freq_max") { NativeLib.setFreqLimitNative(0, 300000, 2400000) == 1 } }
    fun testCoreOnline(core: Int) { test("core_$core") { NativeLib.setCoreOnlineNative(core, true) == 1 } }
    fun testInputBoost() { test("input_boost") { NativeLib.setInputBoostMsNative(500) == 1 } }
    fun testStune() { test("stune") { NativeLib.setStuneBoostNative(10) == 1 } }

    private fun test(key: String, block: suspend () -> Boolean) {
        viewModelScope.launch {
            lastTest[key] = TestResult.Loading
            val ok = withContext(Dispatchers.IO) { block() }
            lastTest[key] = if (ok) TestResult.Pass("OK") else TestResult.Fail("write failed")
        }
    }
}
