package com.farewell.kernelmanager.viewmodel

import android.util.Log
import com.farewell.kernelmanager.kernel.native.NativeLib

data class MemoryState(
    val totalMb: Long = 0, val availableMb: Long = 0, val usedMb: Long = 0, val cachedMb: Long = 0,
    val swapTotalMb: Long = 0, val swapUsedMb: Long = 0,
    val zramDisksize: Long = 0, val zramRatio: Float = 0f, val zramAlgorithm: String = "unknown",
    val swappiness: Int = 60, val dirtyRatio: Int = 20, val minFreeKbytes: Int = 0,
    val pressure: Float = 0f, val availableAlgorithms: List<String> = emptyList(),
    val isLoading: Boolean = true,
)

class MemoryViewModel : PollingViewModel<MemoryState>(MemoryState(), intervalMs = 3000) {

    override suspend fun refresh() {
        if (!NativeLib.isAvailable()) return
        try {
            val memJson = NativeLib.readMemInfoNative()
            val memObj = org.json.JSONObject(memJson)
            val total = memObj.getLong("total_kb")
            val available = memObj.getLong("available_kb")
            val cached = memObj.getLong("cached_kb")
            val swapTotal = try { memObj.getLong("swap_total_kb") } catch (_: Exception) { 0L }
            val zramSize = NativeLib.readZramSizeNative()
            val ratio = NativeLib.getZramCompressionRatioNative()
            val algo = NativeLib.getZramAlgorithmNative()
            val swappiness = NativeLib.getSwappinessNative()
            val pressure = NativeLib.getMemoryPressureNative()
            val algosJson = NativeLib.getAvailableZramAlgorithmsNative()
            val algos = try { org.json.JSONArray(algosJson).let { arr -> (0 until arr.length()).map { arr.getString(it) } } } catch (_: Exception) { emptyList() }
            updateState {
                MemoryState(
                    totalMb = total / 1024, availableMb = available / 1024, usedMb = (total - available) / 1024,
                    cachedMb = cached / 1024, swapTotalMb = swapTotal / 1024, swapUsedMb = 0,
                    zramDisksize = zramSize, zramRatio = ratio, zramAlgorithm = algo,
                    swappiness = swappiness, pressure = pressure, availableAlgorithms = algos, isLoading = false
                )
            }
        } catch (e: Exception) { Log.e("MemoryViewModel", "refresh failed", e) }
    }

    fun setSwappiness(value: Int) {
        updateState { it.copy(swappiness = value) }
        viewModelScopeIO { NativeLib.setSwappinessNative(value) }
    }

    fun setDirtyRatio(value: Int) {
        updateState { it.copy(dirtyRatio = value) }
        viewModelScopeIO { NativeLib.setDirtyRatioNative(value) }
    }
}
