package com.farewell.kernelmanager.kernel

import android.util.Log
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

enum class AccessMode { NON_ROOT, SHIZUKU, ROOT }

object AccessManager {
    private const val TAG = "AccessManager"
    var currentMode: AccessMode = AccessMode.NON_ROOT
    var rootAvailable = false
    var shizukuAvailable = false
    private var detectCount = 0

    suspend fun detectAccessMode(): AccessMode {
        detectCount++
        rootAvailable = RootManager.isRootAvailable()
        val shizukuRunning = ShizukuManager.isShizukuAvailable()
        val shizukuGranted = ShizukuManager.checkPermission() == android.content.pm.PackageManager.PERMISSION_GRANTED
        if (shizukuRunning && !shizukuGranted) {
            ShizukuManager.requestPermission(1001)
        }
        shizukuAvailable = shizukuRunning && shizukuGranted
        if (!rootAvailable) {
            try {
                val tier = NativeLib.detectTierNative()
                rootAvailable = tier >= 3
            } catch (_: Exception) { }
        }
        currentMode = when {
            rootAvailable -> AccessMode.ROOT
            shizukuAvailable -> AccessMode.SHIZUKU
            else -> AccessMode.NON_ROOT
        }
        if (detectCount <= 3 || rootAvailable) {
            Log.d(TAG, "Access mode: $currentMode (root=$rootAvailable, shizuku=$shizukuAvailable, detect#$detectCount)")
        }
        return currentMode
    }

    fun isRootAvailable() = rootAvailable
    fun isShizukuAvailable() = shizukuAvailable

    suspend fun readFile(path: String): String = withContext(Dispatchers.IO) {
        when (currentMode) {
            AccessMode.ROOT -> RootManager.readFile(path).getOrNull() ?: ""
            AccessMode.SHIZUKU -> ShizukuManager.readFile(path).getOrNull() ?: ""
            AccessMode.NON_ROOT -> {
                try {
                    if (NativeLib.isAvailable() && NativeLib.fileExistsNative(path)) {
                        NativeLib.readSysfsNative(path)
                    } else ""
                } catch (e: Exception) { "" }
            }
        }
    }

    suspend fun writeFile(path: String, value: String): Boolean = withContext(Dispatchers.IO) {
        when (currentMode) {
            AccessMode.ROOT -> RootManager.writeFile(path, value).isSuccess
            AccessMode.SHIZUKU -> ShizukuManager.writeFile(path, value).isSuccess
            AccessMode.NON_ROOT -> false
        }
    }

    suspend fun executeCommand(command: String): String = withContext(Dispatchers.IO) {
        when (currentMode) {
            AccessMode.ROOT -> RootManager.executeCommand(command).getOrNull() ?: ""
            AccessMode.SHIZUKU -> ShizukuManager.executeCommand(command).getOrNull() ?: ""
            AccessMode.NON_ROOT -> ""
        }
    }

    suspend fun fileExists(path: String): Boolean = withContext(Dispatchers.IO) {
        when (currentMode) {
            AccessMode.ROOT -> RootManager.fileExists(path)
            AccessMode.SHIZUKU -> ShizukuManager.fileExists(path)
            AccessMode.NON_ROOT -> {
                try { NativeLib.isAvailable() && NativeLib.fileExistsNative(path) }
                catch (e: Exception) { false }
            }
        }
    }
}
