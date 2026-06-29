package com.farewell.kernelmanager.service

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log
import com.farewell.kernelmanager.kernel.native.NativeLib

class BootReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {
        if (intent.action != Intent.ACTION_BOOT_COMPLETED) return
        Log.d("BootReceiver", "Applying boot config...")

        if (!NativeLib.isAvailable()) return

        val result = NativeLib.applyBootConfigNative()
        if (result != 0) {
            Log.d("BootReceiver", "Boot config applied successfully")
        } else {
            Log.w("BootReceiver", "Boot config apply failed (no config saved)")
        }
    }
}
