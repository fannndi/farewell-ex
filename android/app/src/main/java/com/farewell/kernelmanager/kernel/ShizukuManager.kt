package com.farewell.kernelmanager.kernel

import android.content.pm.PackageManager
import android.util.Log
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

object ShizukuManager {
    private const val TAG = "ShizukuManager"
    private var newProcessMethod: java.lang.reflect.Method? = null

    init {
        try {
            newProcessMethod = rikka.shizuku.Shizuku::class.java.getDeclaredMethod(
                "newProcess", Array<String>::class.java, Array<String>::class.java, String::class.java
            )
            newProcessMethod?.isAccessible = true
            Log.d(TAG, "Shizuku newProcess method resolved: ${newProcessMethod != null}")
        } catch (e: Exception) {
            Log.e(TAG, "Failed to resolve newProcess: ${e.message}")
        }
    }

    fun isShizukuRunning(): Boolean = try {
        rikka.shizuku.Shizuku.pingBinder()
    } catch (_: Exception) { false }

    fun isShizukuAvailable(): Boolean = try {
        rikka.shizuku.Shizuku.pingBinder() && rikka.shizuku.Shizuku.getVersion() > 0
    } catch (_: Exception) { false }

    fun checkPermission(): Int = try {
        rikka.shizuku.Shizuku.checkSelfPermission()
    } catch (_: Exception) { PackageManager.PERMISSION_DENIED }

    fun requestPermission(requestCode: Int) {
        try { rikka.shizuku.Shizuku.requestPermission(requestCode) }
        catch (e: Exception) { Log.e(TAG, "requestPermission failed", e) }
    }

    suspend fun executeCommand(command: String): Result<String> = withContext(Dispatchers.IO) {
        try {
            var process: java.lang.Process
            var usedShizuku = false
            if (newProcessMethod != null) {
                try {
                    process = newProcessMethod!!.invoke(null, arrayOf("sh", "-c", command), null, null) as java.lang.Process
                    usedShizuku = true
                } catch (e: Exception) {
                    Log.w(TAG, "Shizuku newProcess failed: ${e.message}, fallback to Runtime.exec")
                    process = Runtime.getRuntime().exec(arrayOf("sh", "-c", command))
                }
            } else {
                process = Runtime.getRuntime().exec(arrayOf("sh", "-c", command))
            }
            val output = process.inputStream.bufferedReader().readText().trim()
            val error = process.errorStream.bufferedReader().readText().trim()
            val exitCode = process.waitFor()
            process.destroy()
            Log.d(TAG, "$command → exit=$exitCode out=${output.take(80)} err=${error.take(80)} (shizuku=$usedShizuku)")
            if (exitCode == 0) Result.success(output)
            else Result.failure(Exception(error.ifEmpty { "exit=$exitCode" }))
        } catch (e: Exception) { Result.failure(e) }
    }

    suspend fun readFile(path: String): Result<String> = executeCommand("cat '$path' 2>&1")
    suspend fun writeFile(path: String, content: String): Result<Unit> = executeCommand("echo '$content' > $path").map { Unit }
    suspend fun fileExists(path: String): Boolean {
        return try {
            executeCommand("[ -f $path ] && echo exists || [ -d $path ] && echo exists").getOrNull() == "exists"
        } catch (_: Exception) { false }
    }
}
