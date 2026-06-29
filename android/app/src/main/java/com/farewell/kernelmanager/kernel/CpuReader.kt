package com.farewell.kernelmanager.kernel

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

object CpuReader {
    private var prevTotal = 0L
    private var prevIdle = 0L

    suspend fun getCpuLoad(): Float = withContext(Dispatchers.IO) {
        val stat = AccessManager.readFile("/proc/stat").takeIf { it.isNotEmpty() }
            ?: ShellReader.read("cat", "/proc/stat") ?: return@withContext 0f

        val first = stat.lines().firstOrNull { it.startsWith("cpu ") } ?: return@withContext 0f
        val parts = first.split("\\s+".toRegex()).drop(1)
        if (parts.size < 4) return@withContext 0f
        val user = parts[0].toLongOrNull() ?: 0
        val nice = parts[1].toLongOrNull() ?: 0
        val sys = parts[2].toLongOrNull() ?: 0
        val idle = parts[3].toLongOrNull() ?: 0
        val total = user + nice + sys + idle
        val dt = total - prevTotal
        val di = idle - prevIdle
        prevTotal = total
        prevIdle = idle
        if (dt > 0) 100f * (dt - di) / dt else 0f
    }

    suspend fun getCpuFreqs(): Map<Int, Int> = withContext(Dispatchers.IO) {
        val map = mutableMapOf<Int, Int>()
        for (i in 0 until 8) {
            val raw = AccessManager.readFile("/sys/devices/system/cpu/cpu$i/cpufreq/scaling_cur_freq")
            val freq = raw.trim().toLongOrNull() ?: 0L
            if (freq > 0) map[i] = (freq / 1000).toInt()
        }
        map
    }

    suspend fun getCpuOnline(): Map<Int, Boolean> = withContext(Dispatchers.IO) {
        val map = mutableMapOf<Int, Boolean>()
        for (i in 0 until 8) {
            val raw = AccessManager.readFile("/sys/devices/system/cpu/cpu$i/online")
            map[i] = raw.trim() == "1"
        }
        map
    }

    suspend fun getCoreTemp(): Float = withContext(Dispatchers.IO) {
        for (zone in 0..9) {
            val type = AccessManager.readFile("/sys/class/thermal/thermal_zone${zone}/type").takeIf { it.isNotEmpty() }
                ?: continue
            if (type.lowercase().contains("cpu") || type.lowercase().contains("tsens") || type == "pa" || type.contains("pm")) {
                val raw = AccessManager.readFile("/sys/class/thermal/thermal_zone${zone}/temp")
                val temp = raw.trim().toFloatOrNull() ?: continue
                return@withContext if (temp > 1000f) temp / 1000f else if (temp > 100f) temp / 10f else temp
            }
        }
        0f
    }

    suspend fun getTimeInState(core: Int): Map<Int, Int> = withContext(Dispatchers.IO) {
        val map = mutableMapOf<Int, Int>()
        val raw = AccessManager.readFile("/sys/devices/system/cpu/cpu$core/cpufreq/stats/time_in_state")
            .takeIf { it.isNotEmpty() } ?: return@withContext map
        raw.lines().forEach { line ->
            val parts = line.split("\\s+".toRegex())
            if (parts.size >= 2) {
                val freq = parts[0].toIntOrNull() ?: return@forEach
                val time = parts[1].toIntOrNull() ?: 0
                map[freq / 1000] = time
            }
        }
        map
    }
}
