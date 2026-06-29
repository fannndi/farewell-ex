package com.farewell.kernelmanager.kernel

import android.util.Log
import java.io.BufferedReader
import java.io.InputStreamReader

object ShellReader {
    private const val TAG = "ShellReader"

    fun read(vararg cmd: String): String? {
        try {
            val proc = ProcessBuilder(*cmd)
                .redirectErrorStream(true)
                .start()
            val reader = BufferedReader(InputStreamReader(proc.inputStream))
            val out = reader.readText().trim()
            val exit = proc.waitFor()
            reader.close()
            return if (out.isNotEmpty()) out else null
        } catch (e: Exception) {
            Log.w(TAG, "${cmd[0]} failed: ${e.message}")
            return null
        }
    }

    fun readInt(vararg cmd: String): Int? = read(*cmd)?.toIntOrNull()
    fun readFloat(vararg cmd: String): Float? = read(*cmd)?.toFloatOrNull()

    fun exists(path: String): Boolean = read("test", "-e", path) != null
}
