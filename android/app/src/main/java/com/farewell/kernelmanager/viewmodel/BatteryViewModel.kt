package com.farewell.kernelmanager.viewmodel

import android.util.Log
import com.farewell.kernelmanager.kernel.NativeLib

data class BatteryState(
    val level: Int = 0, val temp: Float = 0f, val voltage: Float = 0f,
    val current: Int = 0, val isCharging: Boolean = false,
    val health: String = "Unknown", val cycleCount: Int = 0,
    val capacityLevel: Float = 100f, val status: String = "Unknown",
    val bypassEnabled: Boolean = false,
    val chargeCurrentMax: Int = 0,
    val usbCurrentMax: Int = 0,
    val isLoading: Boolean = true,
)

class BatteryViewModel : PollingViewModel<BatteryState>(BatteryState(), intervalMs = 3000) {

    override suspend fun refresh() {
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
            val chargeMax = NativeLib.getConstantChargeCurrentMaxNative()
            val usbMax = NativeLib.getUsbCurrentMaxNative()
            updateState {
                BatteryState(level, temp, voltage, current, isCharging, health, cycle, capLevel,
                    "Unknown", it.bypassEnabled, chargeMax, usbMax, false)
            }
        } catch (e: Exception) { Log.e("BatteryViewModel", "refresh failed", e) }
    }

    fun toggleBypass(enable: Boolean) {
        updateState { it.copy(bypassEnabled = enable) }
        viewModelScopeIO { NativeLib.setBypassChargingNative(enable) }
    }

    fun setChargeCurrentMax(ua: Int) {
        updateState { it.copy(chargeCurrentMax = ua) }
        viewModelScopeIO { NativeLib.setConstantChargeCurrentMaxNative(ua) }
    }

    fun setUsbCurrentMax(ua: Int) {
        updateState { it.copy(usbCurrentMax = ua) }
        viewModelScopeIO { NativeLib.setUsbCurrentMaxNative(ua) }
    }
}
