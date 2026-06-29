package com.farewell.kernelmanager.kernel

import android.net.LocalSocket
import android.net.LocalSocketAddress
import android.util.Log
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import java.io.BufferedReader
import java.io.InputStreamReader

object FarewellDaemon {
    private const val TAG = "FarewellDaemon"
    private const val SOCKET = "farewell"
    private var socket: LocalSocket? = null

    suspend fun connect(): Boolean = withContext(Dispatchers.IO) {
        try {
            socket?.close()
            socket = LocalSocket().apply {
                connect(LocalSocketAddress(SOCKET, LocalSocketAddress.Namespace.RESERVED))
                soTimeout = 3000
            }
            val ping = send("ping")
            val ok = ping == "PONG"
            Log.d(TAG, "connect: ${if (ok) "OK" else "fail ($ping)"}")
            ok
        } catch (e: Exception) {
            Log.w(TAG, "connect failed: ${e.message}")
            false
        }
    }

    suspend fun write(path: String, value: String): String = send("write $path $value")
    suspend fun check(path: String): String = send("check $path")
    suspend fun read(path: String): String = send("read $path")

    private suspend fun send(cmd: String): String = withContext(Dispatchers.IO) {
        try {
            val s = socket ?: return@withContext "ERR:no_socket"
            s.outputStream.write((cmd + "\n").toByteArray())
            s.outputStream.flush()
            val reader = BufferedReader(InputStreamReader(s.inputStream))
            val resp = reader.readLine() ?: "ERR:no_response"
            Log.d(TAG, "$cmd → $resp")
            resp
        } catch (e: Exception) {
            Log.w(TAG, "$cmd failed: ${e.message}")
            "ERR:${e.message}"
        }
    }

    fun disconnect() {
        try { socket?.close() } catch (_: Exception) {}
        socket = null
    }

    data class PathInfo(val path: String, val status: String, val writable: Boolean)
    data class KernelCheckResult(
        val kernel: String = "", val daemonConnected: Boolean = false,
        val paths: List<PathInfo> = emptyList()
    )
}
