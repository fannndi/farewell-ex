package com.farewell.kernelmanager.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.farewell.kernelmanager.kernel.NativeLib
import kotlinx.coroutines.*
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

data class BatteryState(
    val level: Int = 0, val temp: Float = 0f, val voltage: Float = 0f,
    val current: Int = 0, val isCharging: Boolean = false,
    val health: String = "Unknown", val cycleCount: Int = 0,
    val capacityLevel: Float = 100f, val status: String = "Unknown",
    val bypassEnabled: Boolean = false,
    val isLoading: Boolean = true,
)

class BatteryViewModel : ViewModel() {
    private val _state = MutableStateFlow(BatteryState())
    val state: StateFlow<BatteryState> = _state
    private var job: Job? = null

    init { startPolling() }

    private fun startPolling() {
        job?.cancel()
        job = viewModelScope.launch { while (isActive) { refresh(); delay(3000) } }
    }

    private suspend fun refresh() {
        if (!NativeLib.isAvailable()) return
        try {
            val level = NativeLib.readBatteryLevel() ?: 0
            val temp = NativeLib.readBatteryTemp() ?: 0f
            val voltage = NativeLib.readBatteryVoltage() ?: 0f
            val current = NativeLib.readBatteryCurrent() ?: 0
            val isCharging = NativeLib.isCharging() ?: false
            val health = NativeLib.readBatteryHealth() ?: "Unknown"
            val cycle = NativeLib.readCycleCount() ?: -1
            val capLevel = NativeLib.readBatteryCapacityLevel() ?: 100f
            _state.value = BatteryState(level, temp, voltage, current, isCharging, health, cycle, capLevel, "Unknown", _state.value.bypassEnabled, false)
        } catch (e: Exception) { }
    }

    fun toggleBypass(enable: Boolean) {
        viewModelScope.launch(Dispatchers.IO) {
            NativeLib.setBypassChargingNative(enable)
            _state.value = _state.value.copy(bypassEnabled = enable)
        }
    }

    override fun onCleared() { job?.cancel() }
}
