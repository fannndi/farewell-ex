package com.farewell.kernelmanager.viewmodel

import com.farewell.kernelmanager.kernel.native.NativeLib

data class GpuState(
    val vendor: String = "Unknown",
    val model: String = "Unknown",
    val driverInfo: String = "Unknown",
    val freq: Int = 0,
    val busy: Int = 0,
    val temp: Float = 0f,
    val availableFreqs: List<Int> = emptyList(),
    val availablePolicies: List<String> = emptyList(),
    val currentGovernor: String = "",
    val forceClk: Boolean = false,
    val forceBus: Boolean = false,
    val forceRail: Boolean = false,
    val forceNoNap: Boolean = false,
    val isLoading: Boolean = true,
    val lastWriteOk: Boolean? = null,
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
        val gov = try { NativeLib.readSysfsNative("/sys/class/kgsl/kgsl-3d0/devfreq/governor").trim() } catch (_: Exception) { "" }
        val forceClk = try { NativeLib.readSysfsNative("/sys/class/kgsl/kgsl-3d0/force_clk_on").trim() == "1" } catch (_: Exception) { false }
        val forceBus = try { NativeLib.readSysfsNative("/sys/class/kgsl/kgsl-3d0/force_bus_on").trim() == "1" } catch (_: Exception) { false }
        val forceRail = try { NativeLib.readSysfsNative("/sys/class/kgsl/kgsl-3d0/force_rail_on").trim() == "1" } catch (_: Exception) { false }
        val forceNoNap = try { NativeLib.readSysfsNative("/sys/class/kgsl/kgsl-3d0/force_no_nap").trim() == "1" } catch (_: Exception) { false }
        updateState { GpuState(vendor, model, driverInfo, freq, busy, 0f, freqs, policies, gov, forceClk, forceBus, forceRail, forceNoNap, false, null) }
    }

    fun setForce(path: String, value: Boolean) {
        viewModelScopeIO {
            val ok = NativeLib.setGpuForceNative(path, value)
            updateState { it.copy(lastWriteOk = ok == 1) }
        }
    }

    fun setPowerLevels(min: Int, max: Int) {
        viewModelScopeIO { NativeLib.setGpuPowerLevelsNative(min, max) }
    }

    fun setFreqLimit(min: Int, max: Int) {
        viewModelScopeIO { NativeLib.setGpuFreqLimitNative(min, max) }
    }

    fun setGovernor(governor: String) {
        viewModelScopeIO {
            val ok = NativeLib.setGpuDevfreqGovernorNative(governor)
            updateState { it.copy(lastWriteOk = ok == 1) }
        }
    }

    fun resetStats() {
        viewModelScopeIO { NativeLib.resetGpuStatsNative() }
    }
}
