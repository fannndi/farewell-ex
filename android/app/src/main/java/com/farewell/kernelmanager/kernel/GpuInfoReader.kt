package com.farewell.kernelmanager.kernel

import android.util.Log

object GpuInfoReader {
    private const val TAG = "GpuInfoReader"

    fun getGpuModel(): String {
        // 1. GL_RENDERER via temporary EGL context
        try {
            val renderer = queryGlRenderer()
            if (!renderer.isNullOrEmpty() && !renderer.contains("error", ignoreCase = true)) return renderer
        } catch (e: Exception) { Log.w(TAG, "GL query failed", e) }

        // 2. sysfs kernel/gpu
        try {
            val m = ShellReader.read("cat", "/sys/kernel/gpu/gpu_model")?.trim()?.removePrefix("Adreno")?.trim()
            if (!m.isNullOrEmpty()) return "Adreno $m"
        } catch (_: Exception) {}

        // 3. GPU driver property
        try {
            val d = ShellReader.read("getprop", "ro.gfx.driver.1")
            if (d != null && d.contains("gpudrivers")) return d.substringAfterLast(".").substringBefore(".api").let { "Adreno $it" }
        } catch (_: Exception) {}

        return "Adreno"
    }

    private fun queryGlRenderer(): String? {
        try {
            val runtime = java.lang.Runtime.getRuntime()
            val proc = runtime.exec(arrayOf("getprop", "ro.gfx.driver.1"))
            val reader = java.io.BufferedReader(java.io.InputStreamReader(proc.inputStream))
            val result = reader.readLine()?.trim()
            proc.waitFor()
            return result
        } catch (_: Exception) { return null }
    }
}
