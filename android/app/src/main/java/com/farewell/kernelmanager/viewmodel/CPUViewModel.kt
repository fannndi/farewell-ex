package com.farewell.kernelmanager.viewmodel

import androidx.lifecycle.viewModelScope
import com.farewell.kernelmanager.kernel.AccessManager
import com.farewell.kernelmanager.kernel.NativeLib
import com.farewell.kernelmanager.kernel.SysfsReader
import com.farewell.kernelmanager.ui.components.TestResult
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

data class CpuState(
    val clusters: List<NativeLib.ClusterInfo> = emptyList(),
    val cores: List<NativeLib.CoreData> = emptyList(),
    val cpuModel: String = "Unknown", val cpuLoad: Float = 0f,
    val cpuTemp: Float = 0f, val cpuFreqs: Map<Int, Int> = emptyMap(),
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

    // ── WRITE via su shell (AccessManager → RootManager) ──

    fun setGovernor(cluster: Int, governor: String) {
        viewModelScopeIO {
            val path = "/sys/devices/system/cpu/cpufreq/policy${cluster * 4}/scaling_governor"
            AccessManager.writeFile(path, governor)
        }
    }

    fun setFreqLimit(core: Int, min: Int, max: Int) {
        viewModelScopeIO {
            AccessManager.writeFile("/sys/devices/system/cpu/cpu$core/cpufreq/scaling_max_freq", max.toString())
            AccessManager.writeFile("/sys/devices/system/cpu/cpu$core/cpufreq/scaling_min_freq", min.toString())
        }
    }

    fun setCoreOnline(core: Int, online: Boolean) {
        viewModelScopeIO {
            AccessManager.writeFile("/sys/devices/system/cpu/cpu$core/online", if (online) "1" else "0")
        }
    }

    // ── TEST with result ──

    fun testGovernor(name: String = "performance") {
        test("gov") {
            val path = "/sys/devices/system/cpu/cpu0/cpufreq/scaling_governor"
            AccessManager.writeFile(path, name)
        }
    }

    fun testFreqLimit() {
        test("freq") {
            AccessManager.writeFile("/sys/devices/system/cpu/cpu0/cpufreq/scaling_max_freq", "2400000") &&
            AccessManager.writeFile("/sys/devices/system/cpu/cpu0/cpufreq/scaling_min_freq", "300000")
        }
    }

    fun testCoreOnline(core: Int) {
        test("core$core") {
            AccessManager.writeFile("/sys/devices/system/cpu/cpu$core/online", "1")
        }
    }

    private fun test(key: String, block: suspend () -> Boolean) {
        viewModelScope.launch {
            lastTest[key] = TestResult.Loading
            val ok = withContext(Dispatchers.IO) { block() }
            lastTest[key] = if (ok) TestResult.Pass("OK") else TestResult.Fail("write failed")
        }
    }
}
