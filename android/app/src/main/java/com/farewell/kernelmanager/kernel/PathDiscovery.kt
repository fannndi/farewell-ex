package com.farewell.kernelmanager.kernel

import android.util.Log

object PathDiscovery {
    private const val TAG = "PathDiscovery"

    fun discoverPowerSupplyPaths(): List<String> =
        ShellReader.read("find", "/sys/class/power_supply", "-maxdepth", "1", "-type", "d")
            ?.lines()?.drop(1) ?: emptyList()

    fun discoverPowerSupplyFiles(path: String): List<String> =
        ShellReader.read("ls", path)?.lines() ?: emptyList()

    fun discoverKgslDevice(): String? {
        val candidates = listOf(
            "cat /sys/class/kgsl/kgsl-3d0/gpuclk",
            "cat /sys/class/kgsl/kgsl-3d0/devfreq/cur_freq",
            "cat /sys/devices/platform/soc/*.qcom,kgsl-3d0/devfreq/cur_freq",
        )
        for (cmd in candidates) {
            val parts = cmd.split(" ")
            val result = ShellReader.read(*parts.toTypedArray())
            if (result != null) return parts.last()
        }
        return null
    }

    fun discoverCpuCount(): Int {
        val possible = ShellReader.read("cat", "/sys/devices/system/cpu/possible") ?: return 0
        val last = possible.split("-").lastOrNull()?.trim()?.toIntOrNull() ?: return 0
        return last + 1
    }

    fun discoverPowerSupplyBattery(): Map<String, String> {
        val result = mutableMapOf<String, String>()
        for (dir in discoverPowerSupplyPaths()) {
            val name = dir.substringAfterLast("/")
            for (f in listOf("capacity", "temp", "voltage_now", "current_now", "cycle_count", "status", "health")) {
                val path = "$dir/$f"
                val content = ShellReader.read("cat", path)
                if (content != null) result["$name/$f"] = content
            }
        }
        return result
    }
}
