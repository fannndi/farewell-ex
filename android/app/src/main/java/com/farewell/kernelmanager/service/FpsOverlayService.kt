package com.farewell.kernelmanager.service

import android.app.Service
import android.content.Intent
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.PixelFormat
import android.os.IBinder
import android.view.View
import android.view.WindowManager
import android.widget.TextView
import com.farewell.kernelmanager.kernel.NativeLib

class FpsOverlayService : Service() {
    private var overlayView: TextView? = null
    private var wm: WindowManager? = null
    private var active = false

    override fun onBind(intent: Intent?): IBinder? = null

    override fun onCreate() {
        super.onCreate()
        wm = getSystemService(WINDOW_SERVICE) as WindowManager
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        if (intent?.action == "STOP") { stopOverlay(); return START_NOT_STICKY }
        if (active) return START_STICKY

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
        active = true
        Thread { pollFps() }.start()
        return START_STICKY
    }

    private fun pollFps() {
        while (active) {
            try {
                val fps = getSystemFps()
                overlayView?.post { overlayView?.text = "FPS: $fps" }
            } catch (_: Exception) {}
            Thread.sleep(500)
        }
    }

    private fun getSystemFps(): Int {
        return try {
            val proc = Runtime.getRuntime().exec(arrayOf("dumpsys", "SurfaceFlinger", "--latency"))
            val lines = proc.inputStream.bufferedReader().readLines()
            if (lines.size > 2) {
                val ts = lines.drop(1).take(128).mapNotNull { it.split("\t").firstOrNull()?.toLongOrNull() }
                if (ts.size > 1) {
                    val total = ts.last() - ts.first()
                    if (total > 0) (ts.size * 1000000000L / total).toInt() else 0
                } else 0
            } else 0
        } catch (_: Exception) { 0 }
    }

    private fun stopOverlay() {
        active = false
        overlayView?.let { wm?.removeView(it) }
        stopSelf()
    }

    override fun onDestroy() { stopOverlay(); super.onDestroy() }
}
