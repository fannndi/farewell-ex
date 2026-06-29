package com.farewell.kernelmanager.kernel

object CpuReader {
    private var prevTotal = 0L
    private var prevIdle = 0L

    fun getCpuLoad(): Float {
        val stat = ShellReader.read("cat", "/proc/stat") ?: return 0f
        val first = stat.lines().firstOrNull { it.startsWith("cpu ") } ?: return 0f
        val parts = first.split("\\s+".toRegex()).drop(1)
        if (parts.size < 4) return 0f
        val user = parts[0].toLongOrNull() ?: 0
        val nice = parts[1].toLongOrNull() ?: 0
        val sys = parts[2].toLongOrNull() ?: 0
        val idle = parts[3].toLongOrNull() ?: 0
        val total = user + nice + sys + idle
        val dt = total - prevTotal
        val di = idle - prevIdle
        prevTotal = total
        prevIdle = idle
        return if (dt > 0) 100f * (dt - di) / dt else 0f
    }

    fun getCpuFreqs(): Map<Int, Int> {
        val map = mutableMapOf<Int, Int>()
        for (i in 0 until 12) {
            val raw = ShellReader.read("cat", "/sys/devices/system/cpu/cpu$i/cpufreq/scaling_cur_freq")
            val freq = raw?.trim()?.toLongOrNull() ?: 0L
            if (freq > 0) map[i] = (freq / 1000).toInt()
        }
        return map
    }

    fun getCpuOnline(): Map<Int, Boolean> {
        val map = mutableMapOf<Int, Boolean>()
        map[0] = true
        for (i in 1 until 12) {
            val raw = ShellReader.read("cat", "/sys/devices/system/cpu/cpu$i/online")
            map[i] = raw?.trim() == "1"
        }
        return map
    }

    fun getCoreTemp(): Float {
        for (zone in 0..9) {
            val type = ShellReader.read("cat", "/sys/class/thermal/thermal_zone${zone}/type") ?: continue
            if (type.lowercase().contains("cpu") || type.lowercase().contains("tsens") || type == "pa") {
                val temp = ShellReader.read("cat", "/sys/class/thermal/thermal_zone${zone}/temp")?.trim()?.toFloatOrNull() ?: continue
                return if (temp > 1000f) temp / 1000f else if (temp > 100f) temp / 10f else temp
            }
        }
        return 0f
    }

    fun getTimeInState(core: Int): Map<Int, Int> {
        val map = mutableMapOf<Int, Int>()
        val raw = ShellReader.read("cat", "/sys/devices/system/cpu/cpu$core/cpufreq/stats/time_in_state") ?: return map
        raw.lines().forEach { line ->
            val parts = line.split("\\s+".toRegex())
            if (parts.size >= 2) {
                val freq = parts[0].toIntOrNull() ?: return@forEach
                val time = parts[1].toIntOrNull() ?: 0
                map[freq / 1000] = time
            }
        }
        return map
    }
}
