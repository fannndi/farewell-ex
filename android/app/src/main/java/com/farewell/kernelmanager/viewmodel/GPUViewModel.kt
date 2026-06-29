package com.farewell.kernelmanager.viewmodel

import androidx.lifecycle.viewModelScope
import com.farewell.kernelmanager.kernel.AccessManager
import com.farewell.kernelmanager.kernel.NativeLib
import com.farewell.kernelmanager.ui.components.TestResult
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import org.json.JSONArray

data class GpuState(
    val vendor: String = "Unknown", val model: String = "Unknown",
    val driverInfo: String = "Unknown", val freq: Int = 0, val busy: Int = 0,
    val temp: Float = 0f, val isLoading: Boolean = true,
    val availableFreqs: List<Int> = emptyList(),
    val availablePolicies: List<String> = emptyList(),
    val currentGovernor: String = "",
    val forceClk: Boolean = false, val forceBus: Boolean = false,
    val forceRail: Boolean = false, val forceNoNap: Boolean = false,
    val lastWriteOk: Boolean? = null,
)

class GPUViewModel : PollingViewModel<GpuState>(GpuState(), intervalMs = 2000) {
    val lastTest = mutableMapOf<String, TestResult>()

    override suspend fun refresh() {
        if (!NativeLib.isAvailable()) return
        updateState {
            GpuState(
                NativeLib.getGpuVendor() ?: "Unknown",
                NativeLib.getGpuModel() ?: "Unknown",
                NativeLib.getGpuDriverInfo() ?: "Unknown",
                NativeLib.readGpuFreq() ?: 0,
                NativeLib.readGpuBusy() ?: 0, 0f, false,
                try { JSONArray(NativeLib.getGpuAvailableFrequenciesNative()).let { a -> (0 until a.length()).map { a.getInt(it) } } } catch (_: Exception) { emptyList() },
                try { JSONArray(NativeLib.getGpuAvailablePoliciesNative()).let { a -> (0 until a.length()).map { a.getString(it) } } } catch (_: Exception) { emptyList() },
                try { NativeLib.readSysfsNative("/sys/class/kgsl/kgsl-3d0/devfreq/governor").trim() } catch (_: Exception) { "" },
                try { NativeLib.readSysfsNative("/sys/class/kgsl/kgsl-3d0/force_clk_on").trim() == "1" } catch (_: Exception) { false },
                try { NativeLib.readSysfsNative("/sys/class/kgsl/kgsl-3d0/force_bus_on").trim() == "1" } catch (_: Exception) { false },
                try { NativeLib.readSysfsNative("/sys/class/kgsl/kgsl-3d0/force_rail_on").trim() == "1" } catch (_: Exception) { false },
                try { NativeLib.readSysfsNative("/sys/class/kgsl/kgsl-3d0/force_no_nap").trim() == "1" } catch (_: Exception) { false },
            )
        }
    }

    // ── WRITE via su shell ──
    fun setForce(path: String, value: Boolean) {
        viewModelScopeIO {
            AccessManager.writeFile("/sys/class/kgsl/kgsl-3d0/$path", if (value) "1" else "0")
        }
    }
    fun setPowerLevels(min: Int, max: Int) {
        viewModelScopeIO {
            AccessManager.writeFile("/sys/class/kgsl/kgsl-3d0/min_pwrlevel", min.toString())
            AccessManager.writeFile("/sys/class/kgsl/kgsl-3d0/max_pwrlevel", max.toString())
        }
    }
    fun resetStats() { NativeLib.resetGpuStatsNative() }
    fun setGovernor(gov: String) { setDevfreqGovernor(gov) }
    fun setDevfreqGovernor(gov: String) {
        viewModelScopeIO { AccessManager.writeFile("/sys/class/kgsl/kgsl-3d0/devfreq/governor", gov) }
    }

    // ── TEST ──
    fun testFreq() { test("freq") { NativeLib.readGpuFreq()?:0 > 0 } }
    fun testForce() { test("force") { AccessManager.writeFile("/sys/class/kgsl/kgsl-3d0/force_clk_on", "1") } }
    fun testPowerLevels() { test("pwr") { AccessManager.writeFile("/sys/class/kgsl/kgsl-3d0/max_pwrlevel", "3") } }

    private fun test(key: String, block: suspend () -> Boolean) {
        viewModelScope.launch {
            lastTest[key] = TestResult.Loading
            val ok = withContext(Dispatchers.IO) { block() }
            lastTest[key] = if (ok) TestResult.Pass("OK") else TestResult.Fail("write failed")
        }
    }
}
