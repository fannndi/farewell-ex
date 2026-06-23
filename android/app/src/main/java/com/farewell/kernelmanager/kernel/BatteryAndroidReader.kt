package com.farewell.kernelmanager.kernel

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
}
