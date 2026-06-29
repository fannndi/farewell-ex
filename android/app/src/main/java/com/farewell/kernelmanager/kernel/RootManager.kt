package com.farewell.kernelmanager.kernel

import android.util.Log
import com.topjohnwu.superuser.Shell
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

object RootManager {
    private const val TAG = "RootManager"

    suspend fun isRootAvailable(): Boolean = withContext(Dispatchers.IO) {
        try { Shell.getShell().isRoot } catch (e: Exception) { false }
    }

    /** Set SELinux permissive — diperlukan untuk sysfs write */
    suspend fun setSELinuxPermissive(): Boolean = withContext(Dispatchers.IO) {
        try {
            val r = Shell.cmd("setenforce 0").exec()
            r.isSuccess
        } catch (e: Exception) { false }
    }

    suspend fun executeCommand(command: String): Result<String> = withContext(Dispatchers.IO) {
        try {
            val result = Shell.cmd(command).exec()
            if (result.isSuccess) Result.success(result.out.joinToString("\n"))
            else Result.failure(Exception(result.err.joinToString("\n")))
        } catch (e: Exception) { Result.failure(e) }
    }

    suspend fun readFile(path: String): Result<String> = withContext(Dispatchers.IO) {
        executeCommand("cat $path 2>/dev/null")
    }

    suspend fun writeFile(path: String, content: String): Result<Unit> = withContext(Dispatchers.IO) {
        val escaped = content.replace("'", "'\\''")
        executeCommand("echo '$escaped' > $path").map { Unit }
    }

    suspend fun getProp(name: String): String = withContext(Dispatchers.IO) {
        executeCommand("getprop $name").getOrNull()?.trim() ?: ""
    }

    suspend fun fileExists(path: String): Boolean = withContext(Dispatchers.IO) {
        val result = Shell.cmd("[ -f $path ] && echo exists || [ -d $path ] && echo exists").exec()
        result.out.firstOrNull() == "exists"
    }
}
