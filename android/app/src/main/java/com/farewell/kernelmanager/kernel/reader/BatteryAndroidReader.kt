package com.farewell.kernelmanager.kernel.reader

import android.content.Context
import android.content.IntentFilter
import android.os.BatteryManager

object BatteryAndroidReader {
    private val filter = IntentFilter(android.content.Intent.ACTION_BATTERY_CHANGED)

    fun getLevel(context: Context): Int {
        val i = context.registerReceiver(null, filter) ?: return 0
        val l = i.getIntExtra(BatteryManager.EXTRA_LEVEL, -1)
        val s = i.getIntExtra(BatteryManager.EXTRA_SCALE, -1)
        return if (l >= 0 && s > 0) l * 100 / s else 0
    }

    fun getTemperature(context: Context): Int {
        val i = context.registerReceiver(null, filter) ?: return 0
        return i.getIntExtra(BatteryManager.EXTRA_TEMPERATURE, 0) // tenths °C
    }

    fun getVoltage(context: Context): Int {
        val i = context.registerReceiver(null, filter) ?: return 0
        return i.getIntExtra(BatteryManager.EXTRA_VOLTAGE, 0) // mV
    }

    fun isCharging(context: Context): Boolean {
        return context.registerReceiver(null, filter)
            ?.getIntExtra(BatteryManager.EXTRA_PLUGGED, 0) != 0
    }

    fun getStatus(context: Context): String = when (
        context.registerReceiver(null, filter)?.getIntExtra(BatteryManager.EXTRA_STATUS, -1)
    ) {
        BatteryManager.BATTERY_STATUS_CHARGING -> "Charging"
        BatteryManager.BATTERY_STATUS_DISCHARGING -> "Discharging"
        BatteryManager.BATTERY_STATUS_FULL -> "Full"
        BatteryManager.BATTERY_STATUS_NOT_CHARGING -> "Not Charging"
        else -> "Unknown"
    }

    fun getHealth(context: Context): String = when (
        context.registerReceiver(null, filter)?.getIntExtra(BatteryManager.EXTRA_HEALTH, -1)
    ) {
        BatteryManager.BATTERY_HEALTH_GOOD -> "Good"
        BatteryManager.BATTERY_HEALTH_OVERHEAT -> "Overheat"
        BatteryManager.BATTERY_HEALTH_DEAD -> "Dead"
        BatteryManager.BATTERY_HEALTH_OVER_VOLTAGE -> "Over Voltage"
        BatteryManager.BATTERY_HEALTH_COLD -> "Cold"
        else -> "Unknown"
    }

    fun getTechnology(context: Context): String {
        val i = context.registerReceiver(null, filter)
        return i?.getStringExtra(BatteryManager.EXTRA_TECHNOLOGY) ?: "Unknown"
    }

    fun getCycleCount(): Int {
        try {
            for (path in listOf(
                "/sys/class/power_supply/bms/cycle_count",
                "/sys/class/power_supply/battery/cycle_count",
                "/sys/class/power_supply/battery/battery_cycle_count"
            )) {
                val v = ShellReader.read("cat", path)?.trim()?.toIntOrNull()
                if (v != null && v >= 0) return v
            }
        } catch (_: Exception) {}
        return -1
    }

    fun isDualCell(): Boolean {
        return ShellReader.exists("/sys/class/power_supply/battery/cell1_volt")
    }

    fun hasSwap(): Boolean = try {
        ShellReader.read("cat", "/proc/swaps")?.contains("zram", ignoreCase = true) == true
    } catch (_: Exception) { false }

    fun getChargeFull(): Int = try {
        ShellReader.read("cat", "/sys/class/power_supply/battery/charge_full")?.trim()?.toIntOrNull() ?: 0
    } catch (_: Exception) { 0 }

    fun getChargeFullDesign(): Int = try {
        ShellReader.read("cat", "/sys/class/power_supply/battery/charge_full_design")?.trim()?.toIntOrNull() ?: 0
    } catch (_: Exception) { 0 }
}
