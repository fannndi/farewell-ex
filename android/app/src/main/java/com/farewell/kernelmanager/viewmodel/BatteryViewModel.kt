package com.farewell.kernelmanager.viewmodel

import android.util.Log
import androidx.lifecycle.viewModelScope
import com.farewell.kernelmanager.kernel.AccessManager
import com.farewell.kernelmanager.kernel.NativeLib
import com.farewell.kernelmanager.kernel.SysfsReader
import com.farewell.kernelmanager.ui.components.TestResult
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

data class BatteryState(
    val level: Int = 0, val temp: Float = 0f, val voltage: Float = 0f,
    val current: Int = 0, val isCharging: Boolean = false,
    val health: String = "Unknown", val cycleCount: Int = 0,
    val capacityLevel: Float = 100f, val status: String = "Unknown",
    val chargeCurrentMax: Int = 0, val usbCurrentMax: Int = 0,
    val bypassEnabled: Boolean = false,
    val reverseCharge: Boolean = false, val nightCharging: Boolean = false,
    val coolMode: Boolean = false, val smartBattery: Boolean = false,
    val isLoading: Boolean = true,
)

class BatteryViewModel : PollingViewModel<BatteryState>(BatteryState(), intervalMs = 3000) {
    val lastTest = mutableMapOf<String, TestResult>()

    override suspend fun refresh() {
        try {
            val level = SysfsReader.readBatteryLevel()
            val temp = SysfsReader.readBatteryTemp()
            val voltage = SysfsReader.readBatteryVoltage()
            val charging = SysfsReader.isCharging()
            val current = NativeLib.readBatteryCurrent() ?: 0
            val health = NativeLib.readBatteryHealth() ?: "Unknown"
            val cycle = NativeLib.readCycleCount() ?: -1
            val capLevel = NativeLib.readBatteryCapacityLevel() ?: 100f
            val chargeMax = if (NativeLib.isAvailable()) NativeLib.getConstantChargeCurrentMaxNative() else 0
            val usbMax = if (NativeLib.isAvailable()) NativeLib.getUsbCurrentMaxNative() else 0
            updateState { BatteryState(level = level, temp = temp, voltage = voltage, current = current, isCharging = charging, health = health, cycleCount = cycle, capacityLevel = capLevel, chargeCurrentMax = chargeMax, usbCurrentMax = usbMax, isLoading = false) }
        } catch (e: Exception) { Log.e("BatteryVM", "refresh failed", e) }
    }

    // ── WRITE via su shell ──
    fun toggleBypass(enable: Boolean) {
        viewModelScopeIO { AccessManager.writeFile("/sys/class/power_supply/battery/input_suspend", if (enable) "1" else "0") }
    }
    fun setChargeCurrentMax(ua: Int) {
        viewModelScopeIO { AccessManager.writeFile("/sys/class/power_supply/battery/constant_charge_current_max", ua.toString()) }
    }
    fun setUsbCurrentMax(ua: Int) {
        viewModelScopeIO { AccessManager.writeFile("/sys/class/power_supply/usb/current_max", ua.toString()) }
    }
    fun setReverseCharge(on: Boolean) {
        val path = "/sys/class/qcom-battery/reverse_chg_mode"
        viewModelScopeIO { AccessManager.writeFile(path, if (on) "1" else "0").also { updateState { it.copy(reverseCharge = on) } } }
    }
    fun setNightCharging(on: Boolean) {
        viewModelScopeIO { AccessManager.writeFile("/sys/class/qcom-battery/night_charging", if (on) "1" else "0").also { updateState { it.copy(nightCharging = on) } } }
    }
    fun setCoolMode(on: Boolean) {
        viewModelScopeIO { AccessManager.writeFile("/sys/class/qcom-battery/cool_mode", if (on) "1" else "0").also { updateState { it.copy(coolMode = on) } } }
    }
    fun setSmartBattery(on: Boolean) {
        viewModelScopeIO { AccessManager.writeFile("/sys/class/qcom-battery/smart_batt", if (on) "1" else "0").also { updateState { it.copy(smartBattery = on) } } }
    }

    // ── TEST ──
    fun testBypass() { test("bypass") { AccessManager.writeFile("/sys/class/power_supply/battery/input_suspend", "1") } }
    fun testReverse() { test("reverse") { AccessManager.writeFile("/sys/class/qcom-battery/reverse_chg_mode", "1") } }
    private fun test(key: String, block: suspend () -> Boolean) {
        viewModelScope.launch { lastTest[key] = TestResult.Loading; lastTest[key] = if (withContext(Dispatchers.IO) { block() }) TestResult.Pass("OK") else TestResult.Fail("failed") }
    }
}
