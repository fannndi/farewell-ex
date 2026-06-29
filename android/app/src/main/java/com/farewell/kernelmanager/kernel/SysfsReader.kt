package com.farewell.kernelmanager.kernel

import android.content.Context
import android.os.BatteryManager
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

object SysfsReader {
    private var appContext: Context? = null

    fun init(context: Context) { appContext = context.applicationContext }

    private suspend fun tryReadNative(path: String): String? {
        if (!NativeLib.isAvailable()) return null
        return try { NativeLib.readSysfsNative(path).takeIf { it.isNotEmpty() } } catch (_: Exception) { null }
    }

    private suspend fun tryReadShizuku(path: String): String? {
        if (!ShizukuManager.isShizukuAvailable()) return null
        return ShizukuManager.readFile(path).getOrNull()?.takeIf { it.isNotEmpty() }
    }

    private fun tryReadShell(path: String): String? = ShellReader.read("cat", path)?.takeIf { it.isNotEmpty() }

    private suspend fun tryReadRoot(path: String): String? {
        if (!AccessManager.isRootAvailable()) return null
        return RootManager.readFile(path).getOrNull()?.takeIf { it.isNotEmpty() }
    }

    suspend fun readSysfs(path: String): String? = withContext(Dispatchers.IO) {
        tryReadNative(path) ?: tryReadShizuku(path) ?: tryReadShell(path) ?: tryReadRoot(path)
    }

    suspend fun readSysfsInt(path: String): Long? = readSysfs(path)?.trim()?.toLongOrNull()
    suspend fun readSysfsIntDef(path: String, default: Int): Int = readSysfsInt(path)?.toInt() ?: default

    suspend fun fileExists(path: String): Boolean = withContext(Dispatchers.IO) {
        (try { NativeLib.isAvailable() && NativeLib.fileExistsNative(path) } catch (_: Exception) { false })
        || ShizukuManager.fileExists(path)
        || ShellReader.exists(path)
        || (AccessManager.isRootAvailable() && RootManager.fileExists(path))
    }

    // ── Battery (Android API first) ──

    private val batteryFilter = android.content.IntentFilter(android.content.Intent.ACTION_BATTERY_CHANGED)

    fun readBatteryLevel(): Int {
        val ctx = appContext ?: return NativeLib.readBatteryLevel() ?: 0
        val bm = ctx.getSystemService(Context.BATTERY_SERVICE) as? BatteryManager
        val api = bm?.getIntProperty(BatteryManager.BATTERY_PROPERTY_CAPACITY) ?: -1
        if (api in 0..100) return api
        val intent = ctx.registerReceiver(null, batteryFilter)
        val lvl = intent?.getIntExtra(BatteryManager.EXTRA_LEVEL, -1) ?: -1
        val scale = intent?.getIntExtra(BatteryManager.EXTRA_SCALE, -1) ?: -1
        return if (lvl >= 0 && scale > 0) (lvl * 100 / scale) else NativeLib.readBatteryLevel() ?: 0
    }

    fun readBatteryTemp(): Float {
        val ctx = appContext
        if (ctx != null) {
            val intent = ctx.registerReceiver(null, batteryFilter)
            val raw = intent?.getIntExtra(BatteryManager.EXTRA_TEMPERATURE, 0) ?: 0
            if (raw > 0) return raw / 10f
        }
        return NativeLib.readBatteryTemp() ?: 0f
    }

    fun readBatteryVoltage(): Float {
        val ctx = appContext
        if (ctx != null) {
            val intent = ctx.registerReceiver(null, batteryFilter)
            val raw = intent?.getIntExtra(BatteryManager.EXTRA_VOLTAGE, 0) ?: 0
            if (raw > 0) return raw / 1000f
        }
        return NativeLib.readBatteryVoltage() ?: 0f
    }

    fun isCharging(): Boolean {
        val ctx = appContext
        if (ctx != null) {
            val intent = ctx.registerReceiver(null, batteryFilter)
            val plugged = intent?.getIntExtra(BatteryManager.EXTRA_PLUGGED, 0) ?: 0
            if (plugged != 0) return true
        }
        return NativeLib.isCharging() ?: false
    }

    // ── CPU ──

    suspend fun readCpuFreqs(): Map<Int, Int> = withContext(Dispatchers.IO) {
        val result = mutableMapOf<Int, Int>()
        for (cpu in 0 until 8) {
            val freq = readSysfs("/sys/devices/system/cpu/cpu$cpu/cpufreq/scaling_cur_freq")
            val mhz = freq?.trim()?.toLongOrNull()?.let { (it / 1000).toInt() }
            if (mhz != null && mhz > 0) result[cpu] = mhz
        }
        result
    }

    suspend fun readGpuFreq(): Int = withContext(Dispatchers.IO) {
        val raw = readSysfs("/sys/class/kgsl/kgsl-3d0/gpuclk")
        val freq = raw?.trim()?.toLongOrNull() ?: return@withContext 0
        when {
            freq > 1_000_000 -> (freq / 1_000_000).toInt()
            freq > 1000 -> (freq / 1000).toInt()
            else -> freq.toInt()
        }
    }

    // ── Xiaomi charging (Shizuku-friendly) ──

    suspend fun readReverseCharge(): String = readSysfs("/sys/class/qcom-battery/reverse_chg_mode")
        ?: readSysfs("/sys/class/power_supply/battery/reverse_charge_mode") ?: "unavailable"

    suspend fun readNightCharging(): String = readSysfs("/sys/class/qcom-battery/night_charging") ?: "unavailable"
    suspend fun readCoolMode(): String = readSysfs("/sys/class/qcom-battery/cool_mode") ?: "unavailable"
    suspend fun readSmartBattery(): String = readSysfs("/sys/class/qcom-battery/smart_batt") ?: "unavailable"

    suspend fun readUfsClkscale(): String = readSysfs("/sys/bus/platform/devices/1d84000.ufshc/clkscale_enable")
        ?: "unavailable"

    // ── KGSL IOCTL (Tier 1, but needs JNI lib) ──

    fun readGpuFreqIoctl(): Int = if (NativeLib.isAvailable()) NativeLib.readGpuFreqIoctlNative() else 0
    fun readGpuBusyIoctl(): Int = if (NativeLib.isAvailable()) NativeLib.readGpuBusyIoctlNative() else 0
    fun readGpuModelIoctl(): String = if (NativeLib.isAvailable()) NativeLib.readGpuModelIoctlNative() else ""
}
