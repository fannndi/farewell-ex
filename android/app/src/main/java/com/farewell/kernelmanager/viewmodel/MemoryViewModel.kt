package com.farewell.kernelmanager.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.farewell.kernelmanager.kernel.NativeLib
import kotlinx.coroutines.*
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

data class MemoryState(
    val totalMb: Long = 0, val availableMb: Long = 0, val usedMb: Long = 0, val cachedMb: Long = 0,
    val swapTotalMb: Long = 0, val swapUsedMb: Long = 0,
    val zramDisksize: Long = 0, val zramRatio: Float = 0f, val zramAlgorithm: String = "unknown",
    val swappiness: Int = 60, val dirtyRatio: Int = 20, val minFreeKbytes: Int = 0,
    val pressure: Float = 0f, val availableAlgorithms: List<String> = emptyList(),
    val isLoading: Boolean = true,
)

class MemoryViewModel : ViewModel() {
    private val _state = MutableStateFlow(MemoryState())
    val state: StateFlow<MemoryState> = _state
    private var job: Job? = null

    init { startPolling() }

    private fun startPolling() {
        job?.cancel()
        job = viewModelScope.launch { while (isActive) { refresh(); delay(3000) } }
    }

    private suspend fun refresh() {
        if (!NativeLib.isAvailable()) return
        try {
            val memJson = NativeLib.readMemInfoNative()
            val memObj = org.json.JSONObject(memJson)
            val total = memObj.getLong("total_kb")
            val available = memObj.getLong("available_kb")
            val cached = memObj.getLong("cached_kb")
            val swapTotal = try { memObj.getLong("swap_total_kb") } catch (e: Exception) { 0L }
            val zramSize = NativeLib.readZramSizeNative()
            val ratio = NativeLib.getZramCompressionRatioNative()
            val algo = NativeLib.getZramAlgorithmNative()
            val swappiness = NativeLib.getSwappinessNative()
            val pressure = NativeLib.getMemoryPressureNative()
            val algosJson = NativeLib.getAvailableZramAlgorithmsNative()
            val algos = try { org.json.JSONArray(algosJson).let { arr -> (0 until arr.length()).map { arr.getString(it) } } } catch (e: Exception) { emptyList() }
            _state.value = MemoryState(
                totalMb = total / 1024, availableMb = available / 1024, usedMb = (total - available) / 1024,
                cachedMb = cached / 1024, swapTotalMb = swapTotal / 1024, swapUsedMb = 0,
                zramDisksize = zramSize, zramRatio = ratio, zramAlgorithm = algo,
                swappiness = swappiness, pressure = pressure, availableAlgorithms = algos, isLoading = false
            )
        } catch (e: Exception) { }
    }

    fun setSwappiness(value: Int) {
        viewModelScope.launch(Dispatchers.IO) { NativeLib.setSwappinessNative(value) }
        _state.value = _state.value.copy(swappiness = value)
    }

    fun setDirtyRatio(value: Int) {
        viewModelScope.launch(Dispatchers.IO) { NativeLib.setDirtyRatioNative(value) }
        _state.value = _state.value.copy(dirtyRatio = value)
    }

    override fun onCleared() { job?.cancel() }
}
