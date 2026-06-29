package com.farewell.kernelmanager.kernel.reader

import android.os.Build

object SystemReader {
    fun getSoc(): String = try {
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

    fun getAndroidVersion(): String = Build.VERSION.RELEASE ?: ""
    fun getSecurityPatch(): String = Build.VERSION.SECURITY_PATCH ?: ""
    fun getBootloader(): String = Build.BOOTLOADER ?: ""
    fun getFingerprint(): String = Build.FINGERPRINT ?: ""
    fun getManufacturer(): String = Build.MANUFACTURER ?: ""
    fun getModel(): String = Build.MODEL ?: ""
    fun getAbiList(): String = Build.SUPPORTED_ABIS?.joinToString(", ") ?: ""
    fun getHardware(): String = Build.HARDWARE ?: ""
    fun getKernelVersion(): String = try {
        ShellReader.read("cat", "/proc/version")?.substringBefore(" (") ?: Build.VERSION.RELEASE
    } catch (_: Exception) { Build.VERSION.RELEASE }

    fun getPanelName(): String = try {
        ShellReader.read("grep", "panel_name", "/sys/devices/virtual/graphics/fb0/msm_fb_panel_info")
            ?.substringAfter("panel_name=")?.trim() ?: ""
    } catch (_: Exception) { "" }

    fun getEmmcLifetime(): String = try {
        val preEol = ShellReader.read("cat", "/sys/block/mmcblk0/device/pre_eol_info")?.trim() ?: ""
        val lifeTime = ShellReader.read("cat", "/sys/block/mmcblk0/device/life_time")?.trim() ?: ""
        if (preEol.isNotEmpty() || lifeTime.isNotEmpty()) "preEOL=$preEol life=$lifeTime" else ""
    } catch (_: Exception) { "" }

    fun getGmemSize(): Int = try {
        ShellReader.read("cat", "/sys/class/kgsl/kgsl-3d0/gmem_size")?.trim()?.toIntOrNull() ?: 0
    } catch (_: Exception) { 0 }
}
