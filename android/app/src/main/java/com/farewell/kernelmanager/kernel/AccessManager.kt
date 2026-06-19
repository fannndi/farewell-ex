package com.farewell.kernelmanager.kernel

import android.util.Log
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

enum class AccessMode { NON_ROOT, SHIZUKU, ROOT }

object AccessManager {
    private const val TAG = "AccessManager"
    var currentMode: AccessMode = AccessMode.NON_ROOT
        private set
    private var rootAvailable = false
    private var shizukuAvailable = false

    suspend fun detectAccessMode(): AccessMode {
        rootAvailable = RootManager.isRootAvailable()
        shizukuAvailable = ShizukuManager.isShizukuAvailable() && ShizukuManager.checkPermission() == android.content.pm.PackageManager.PERMISSION_GRANTED
        currentMode = when {
            rootAvailable -> AccessMode.ROOT
            shizukuAvailable -> AccessMode.SHIZUKU
            else -> AccessMode.NON_ROOT
        }
        Log.d(TAG, "Access mode: $currentMode (root=$rootAvailable, shizuku=$shizukuAvailable)")
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
