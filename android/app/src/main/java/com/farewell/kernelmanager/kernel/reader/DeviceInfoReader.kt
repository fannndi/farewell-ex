package com.farewell.kernelmanager.kernel.reader

import android.content.Context
import android.util.DisplayMetrics
import android.view.WindowManager
import android.os.Build

object DeviceInfoReader {
    private var metrics: DisplayMetrics? = null

    fun init(context: Context) {
        val wm = context.getSystemService(Context.WINDOW_SERVICE) as? WindowManager
        metrics = DisplayMetrics().also { wm?.defaultDisplay?.getRealMetrics(it) }
    }

    fun getSoC(): String = try {
        ShellReader.read("getprop", "ro.soc.model")
            ?: ShellReader.read("getprop", "ro.chipname")
            ?: ShellReader.read("getprop", "ro.board.platform")
            ?: Build.HARDWARE
    } catch (_: Exception) { Build.HARDWARE }

    fun getDeviceName(): String = try {
        ShellReader.read("getprop", "ro.product.marketname")
            ?: ShellReader.read("getprop", "ro.product.vendor.marketname")
            ?: Build.MODEL
    } catch (_: Exception) { Build.MODEL }

    fun getResolution(): String {
        val m = metrics ?: DisplayMetrics().also { init(com.farewell.kernelmanager.App().applicationContext) }
        return "${m?.widthPixels}x${m?.heightPixels}"
    }

    fun getScreenDpi(): Int = metrics?.densityDpi ?: 0

    fun getRefreshRate(): Float = 0f // Display.getRefreshRate() needs Activity context

    fun isHdr(): Boolean = false // Display.isHdr() needs Activity context

    fun getPanelName(): String = try {
        ShellReader.read("grep", "panel_name", "/sys/devices/virtual/graphics/fb0/msm_fb_panel_info")
            ?.substringAfter("panel_name=")
            ?.trim() ?: ""
    } catch (_: Exception) { "" }

    fun getKernelVersion(): String = try {
        ShellReader.read("cat", "/proc/version")?.substringBefore(" (") ?: ""
    } catch (_: Exception) { "" }

    fun getAndroidVersion(): String = Build.VERSION.RELEASE ?: ""
    fun getSecurityPatch(): String = Build.VERSION.SECURITY_PATCH ?: ""
    fun getBootloader(): String = Build.BOOTLOADER ?: ""
    fun getFingerprint(): String = Build.FINGERPRINT ?: ""
    fun getManufacturer(): String = Build.MANUFACTURER ?: ""
    fun getAbiList(): String = Build.SUPPORTED_ABIS?.joinToString(", ") ?: ""
}
