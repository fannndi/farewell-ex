package com.farewell.kernelmanager.kernel

import android.content.Context
import android.os.BatteryManager
import android.os.Handler
import android.os.Looper
import android.util.Log

data class CpuLoad(val total: Float, val perCore: List<Int> = emptyList())
data class GpuInfo(val freq: Int = 0, val load: Int = 0, val model: String = "Adreno")
data class BatteryInfo(val level: Int = 0, val temp: Int = 0, val voltage: Int = 0, val charging: Boolean = false)

object DevCheckEngine {
    private const val TAG = "DevCheckEngine"
    private var batteryFilter = android.content.IntentFilter(android.content.Intent.ACTION_BATTERY_CHANGED)
    private var cpuLastTotal = 0L
    private var cpuLastIdle = 0L
    private var gpuLastBusy = 0L
    private var gpuLastTotal = 0L

    fun readCpuLoad(context: Context): CpuLoad {
        // Shell ProcessBuilder approach - bypasses JNI SELinux block on MIUI 14
        val raw = ShellReader.read("cat", "/proc/stat") ?: return CpuLoad(0f)
        val lines = raw.lines().filter { it.startsWith("cpu") && !it.startsWith("cpu ") }
        var totalLoad = 0f
        val perCore = mutableListOf<Int>()
        for (line in lines) {
            val parts = line.split("\\s+".toRegex()).drop(1)
            if (parts.size >= 4) {
                val user = parts[0].toLongOrNull() ?: 0
                val nice = parts[1].toLongOrNull() ?: 0
                val system = parts[2].toLongOrNull() ?: 0
                val idle = parts[3].toLongOrNull() ?: 0
                val total = user + nice + system + idle
                totalLoad = 100f * (total - cpuLastTotal - (idle - cpuLastIdle)) / (total - cpuLastTotal).coerceAtLeast(1)
                cpuLastTotal = total
                cpuLastIdle = idle
                perCore.add(totalLoad.toInt().coerceIn(0, 100))
            }
        }
        return CpuLoad(totalLoad.coerceIn(0f, 100f), perCore)
    }

    fun readCpuFreq(context: Context): Map<Int, Int> {
        val result = mutableMapOf<Int, Int>()
        val cpuCount = PathDiscovery.discoverCpuCount()
        for (i in 0 until cpuCount.coerceAtMost(12)) {
            val raw = ShellReader.read("cat", "/sys/devices/system/cpu/cpu$i/cpufreq/scaling_cur_freq")
            val freq = raw?.trim()?.toLongOrNull() ?: 0
            val mhz = (freq / 1000).toInt()
            if (mhz > 0) result[i] = mhz
        }
        return result
    }

    fun readGpuFreq(context: Context): Int {
        val raw = ShellReader.read("cat", "/sys/class/kgsl/kgsl-3d0/gpuclk") ?: return 0
        val freq = raw.trim().toLongOrNull() ?: 0
        if (freq > 1_000_000) return (freq / 1_000_000).toInt()
        if (freq > 1000) return (freq / 1000).toInt()
        return freq.toInt()
    }

    fun readGpuBusy(context: Context): Int {
        val raw = ShellReader.read("cat", "/sys/class/kgsl/kgsl-3d0/gpubusy") ?: return 0
        val parts = raw.trim().split("\\s+".toRegex())
        if (parts.size >= 2) {
            val busy = parts[0].toLongOrNull() ?: 0
            val total = parts[1].toLongOrNull() ?: 0
            if (total > gpuLastTotal && busy > gpuLastBusy) {
                val deltaBusy = busy - gpuLastBusy
                val deltaTotal = total - gpuLastTotal
                gpuLastBusy = busy
                gpuLastTotal = total
                if (deltaTotal > 0) return ((deltaBusy * 100) / deltaTotal).toInt().coerceIn(0, 100)
            } else {
                gpuLastBusy = busy
                gpuLastTotal = total
            }
        }
        return 0
    }

    fun readBatteryLevel(context: Context): Int {
        val bm = context.getSystemService(Context.BATTERY_SERVICE) as? BatteryManager
        val intent = context.registerReceiver(null, batteryFilter)
        val levelIntent = intent?.getIntExtra(BatteryManager.EXTRA_LEVEL, -1) ?: -1
        val scale = intent?.getIntExtra(BatteryManager.EXTRA_SCALE, -1) ?: -1
        return if (levelIntent >= 0 && scale > 0) levelIntent * 100 / scale else 0
    }

    fun readBatteryTemp(context: Context): Int {
        val intent = context.registerReceiver(null, batteryFilter)
        return intent?.getIntExtra(BatteryManager.EXTRA_TEMPERATURE, 0) ?: 0
    }

    fun readBatteryVoltage(context: Context): Int {
        val intent = context.registerReceiver(null, batteryFilter)
        return intent?.getIntExtra(BatteryManager.EXTRA_VOLTAGE, 0) ?: 0
    }

    fun readBatteryCharging(context: Context): Boolean {
        val intent = context.registerReceiver(null, batteryFilter)
        return (intent?.getIntExtra(BatteryManager.EXTRA_PLUGGED, 0) ?: 0) != 0
    }

    fun readCpuTemp(): Float {
        for (zone in 0..9) {
            val type = ShellReader.read("cat", "/sys/class/thermal/thermal_zone${zone}/type") ?: continue
            val lower = type.lowercase()
            if (lower.contains("cpu") || lower.contains("tsens") || lower == "pa") {
                val temp = ShellReader.readFloat("cat", "/sys/class/thermal/thermal_zone${zone}/temp") ?: continue
                return if (temp > 1000f) temp / 1000f else if (temp > 100f) temp / 10f else temp
            }
        }
        val temp = ShellReader.readFloat("cat", "/sys/class/thermal/thermal_zone0/temp") ?: return 0f
        return if (temp > 1000f) temp / 1000f else if (temp > 100f) temp / 10f else temp
    }

    fun readAll(context: Context) {
        Log.d(TAG, "CPU Load: ${readCpuLoad(context)}")
        Log.d(TAG, "CPU Freq: ${readCpuFreq(context)}")
        Log.d(TAG, "GPU Freq: ${readGpuFreq(context)} MHz")
        Log.d(TAG, "GPU Busy: ${readGpuBusy(context)}%")
        Log.d(TAG, "Battery: ${readBatteryLevel(context)}% / ${readBatteryTemp(context)/10f}°C")
        Log.d(TAG, "CPU Temp: ${readCpuTemp()}°C")
    }
}
