package com.farewell.kernelmanager.service

import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.Service
import android.content.Intent
import android.graphics.Color
import android.graphics.PixelFormat
import android.os.IBinder
import android.os.Process
import android.view.WindowManager
import android.widget.TextView
import kotlin.concurrent.thread

class FpsOverlayService : Service() {
    private var overlayView: TextView? = null
    private var wm: WindowManager? = null
    @Volatile private var active = false
    private var pollThread: Thread? = null

    override fun onBind(intent: Intent?): IBinder? = null

    override fun onCreate() {
        super.onCreate()
        wm = getSystemService(WINDOW_SERVICE) as WindowManager
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        when (intent?.action) {
            "STOP" -> { stopOverlay(); return START_NOT_STICKY }
        }
        if (active) return START_STICKY
        startForeground(1, buildNotification())
        showOverlay()
        active = true
        pollThread = thread(isDaemon = true, name = "FpsPoller") { pollFps() }
        return START_STICKY
    }

    private fun showOverlay() {
        val params = WindowManager.LayoutParams(
            200, 50, WindowManager.LayoutParams.TYPE_APPLICATION_OVERLAY,
            WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE or
                WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE,
            PixelFormat.TRANSLUCENT
        ).apply { x = 20; y = 100 }

        overlayView = TextView(this).apply {
            setTextColor(Color.GREEN)
            textSize = 12f
            setShadowLayer(2f, 1f, 1f, Color.BLACK)
            setBackgroundColor(0x80000000.toInt())
            text = "FPS: --"
        }
        wm?.addView(overlayView, params)
    }

    private fun pollFps() {
        while (active && !Thread.currentThread().isInterrupted) {
            try {
                val fps = getSystemFps()
                overlayView?.post { overlayView?.text = "FPS: $fps" }
                Thread.sleep(500)
            } catch (_: InterruptedException) { break }
            catch (_: Exception) { }
        }
    }

    private fun getSystemFps(): Int {
        var proc: Process? = null
        try {
            proc = Runtime.getRuntime().exec(arrayOf("dumpsys", "SurfaceFlinger", "--latency"))
            val ts = proc.inputStream.bufferedReader().useLines { lines ->
                lines.drop(1).take(128)
                    .mapNotNull { it.split("\t").firstOrNull()?.toLongOrNull() }
                    .toList()
            }
            if (ts.size > 1) {
                val total = ts.last() - ts.first()
                if (total > 0) (ts.size * 1000000000L / total).toInt() else 0
            } else 0
        } catch (_: Exception) { 0 }
        finally { proc?.destroy() }
    }

    private fun buildNotification(): Notification {
        val chan = NotificationChannel("fps_overlay", "FPS Overlay", NotificationManager.IMPORTANCE_LOW)
        (getSystemService(NOTIFICATION_SERVICE) as NotificationManager).createNotificationChannel(chan)
        return Notification.Builder(this, "fps_overlay")
            .setContentTitle("Farewell KM").setContentText("FPS overlay active")
            .setSmallIcon(android.R.drawable.ic_menu_info_details).build()
    }

    private fun stopOverlay() {
        active = false
        pollThread?.interrupt()
        pollThread = null
        overlayView?.let { wm?.removeView(it) }
        overlayView = null
        stopForeground(STOP_FOREGROUND_REMOVE)
        stopSelf()
    }

    override fun onDestroy() {
        stopOverlay()
        super.onDestroy()
    }
}
