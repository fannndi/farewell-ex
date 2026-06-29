package com.farewell.kernelmanager.viewmodel

import androidx.lifecycle.viewModelScope
import com.farewell.kernelmanager.kernel.NativeLib
import com.farewell.kernelmanager.ui.components.TestResult
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import org.json.JSONArray

data class GpuState(
    val vendor: String = "Unknown", val model: String = "Unknown",
    val driverInfo: String = "Unknown", val freq: Int = 0, val busy: Int = 0,
    val temp: Float = 0f,
    val availableFreqs: List<Int> = emptyList(),
    val availablePolicies: List<String> = emptyList(),
    val currentGovernor: String = "",
    val forceClk: Boolean = false, val forceBus: Boolean = false,
    val forceRail: Boolean = false, val forceNoNap: Boolean = false,
    val isLoading: Boolean = true,
    val lastWriteOk: Boolean? = null,
)

class GPUViewModel : PollingViewModel<GpuState>(GpuState(), intervalMs = 2000) {
    val lastTest = mutableMapOf<String, TestResult>()

    override suspend fun refresh() {
        if (!NativeLib.isAvailable()) return
        val vendor = NativeLib.getGpuVendor() ?: "Unknown"
        val model = NativeLib.getGpuModel() ?: "Unknown"
        val driverInfo = NativeLib.getGpuDriverInfo() ?: "Unknown"
        val freq = NativeLib.readGpuFreq() ?: 0
        val busy = NativeLib.readGpuBusy() ?: 0
        val freqs = try { JSONArray(NativeLib.getGpuAvailableFrequenciesNative()).let { a -> (0 until a.length()).map { a.getInt(it) } } } catch (_: Exception) { emptyList() }
        val policies = try { JSONArray(NativeLib.getGpuAvailablePoliciesNative()).let { a -> (0 until a.length()).map { a.getString(it) } } } catch (_: Exception) { emptyList() }
        val gov = try { NativeLib.readSysfsNative("/sys/class/kgsl/kgsl-3d0/devfreq/governor").trim() } catch (_: Exception) { "" }
        val fClk = try { NativeLib.readSysfsNative("/sys/class/kgsl/kgsl-3d0/force_clk_on").trim() == "1" } catch (_: Exception) { false }
        val fBus = try { NativeLib.readSysfsNative("/sys/class/kgsl/kgsl-3d0/force_bus_on").trim() == "1" } catch (_: Exception) { false }
        val fRail = try { NativeLib.readSysfsNative("/sys/class/kgsl/kgsl-3d0/force_rail_on").trim() == "1" } catch (_: Exception) { false }
        val fNap = try { NativeLib.readSysfsNative("/sys/class/kgsl/kgsl-3d0/force_no_nap").trim() == "1" } catch (_: Exception) { false }
        updateState { GpuState(vendor, model, driverInfo, freq, busy, 0f, freqs, policies, gov, fClk, fBus, fRail, fNap, false, null) }
    }

    fun setForce(path: String, value: Boolean) { viewModelScopeIO { NativeLib.setGpuForceNative(path, value) } }
    fun setPowerLevels(min: Int, max: Int) { viewModelScopeIO { NativeLib.setGpuPowerLevelsNative(min, max) } }
    fun setDevfreqGovernor(gov: String) { viewModelScopeIO { NativeLib.setGpuDevfreqGovernorNative(gov) } }

    fun resetStats() { NativeLib.resetGpuStatsNative() }
    fun setGovernor(gov: String) { setDevfreqGovernor(gov) }
    fun testFreq() { test("freq") { NativeLib.readGpuFreqIoctlNative() > 0 || (NativeLib.readGpuFreq()?:0) > 0 } }
    fun testForce() { test("force") { NativeLib.setGpuForceNative("force_clk_on", true) == 1 } }
    fun testPowerLevels() { test("pwr") { NativeLib.setGpuPowerLevelsNative(0, 3) == 1 } }

    private fun test(key: String, block: suspend () -> Boolean) {
        viewModelScope.launch {
            lastTest[key] = TestResult.Loading
            val ok = withContext(Dispatchers.IO) { block() }
            lastTest[key] = if (ok) TestResult.Pass("OK") else TestResult.Fail("write failed")
        }
    }
}
