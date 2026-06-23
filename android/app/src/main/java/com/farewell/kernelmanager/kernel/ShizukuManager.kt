package com.farewell.kernelmanager.kernel

import android.content.ComponentName
import android.content.ServiceConnection
import android.content.pm.PackageManager
import android.os.IBinder
import android.util.Log
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

object ShizukuManager {
    private const val TAG = "ShizukuManager"
    private var isBound = false
    private var isRunning = false
    private var uid: Int = -1

    fun isShizukuRunning(): Boolean = try {
        rikka.shizuku.Shizuku.pingBinder()
    } catch (e: Exception) { false }

    fun isShizukuAvailable(): Boolean {
        return try { rikka.shizuku.Shizuku.pingBinder() && rikka.shizuku.Shizuku.getVersion() > 0 }
        catch (e: Exception) { false }
    }

    fun checkPermission(): Int {
        return try {
            rikka.shizuku.Shizuku.checkSelfPermission()
        } catch (e: Exception) { PackageManager.PERMISSION_DENIED }
    }

    fun requestPermission(requestCode: Int) {
        try { rikka.shizuku.Shizuku.requestPermission(requestCode) }
        catch (e: Exception) { Log.e(TAG, "requestPermission failed", e) }
    }

    suspend fun executeCommand(command: String): Result<String> = withContext(Dispatchers.IO) {
        try {
            val process = Runtime.getRuntime().exec(arrayOf("sh", "-c", command))
            val output = process.inputStream.bufferedReader().readText().trim()
            val error = process.errorStream.bufferedReader().readText().trim()
            val exitCode = process.waitFor()
            process.destroy()
            if (exitCode == 0) Result.success(output)
            else Result.failure(Exception(error))
        } catch (e: Exception) { Result.failure(e) }
    }

    suspend fun readFile(path: String): Result<String> = executeCommand("cat $path 2>/dev/null")
    suspend fun writeFile(path: String, content: String): Result<Unit> = executeCommand("echo '$content' > $path").map { Unit }
    suspend fun fileExists(path: String): Boolean {
        return try {
            val result = executeCommand("[ -f $path ] && echo exists || [ -d $path ] && echo exists")
            result.getOrNull() == "exists"
        } catch (e: Exception) { false }
    }
}
