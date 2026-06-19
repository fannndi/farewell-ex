package com.farewell.kernelmanager.service

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log
import com.farewell.kernelmanager.kernel.NativeLib
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class BootReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {
        if (intent.action == Intent.ACTION_BOOT_COMPLETED) {
            Log.d("BootReceiver", "Boot completed, applying saved config...")
            CoroutineScope(Dispatchers.IO).launch {
                if (NativeLib.isAvailable()) {
                    NativeLib.applyBootConfigNative()
                    Log.d("BootReceiver", "Boot config applied")
                    // Start foreground monitor if profiles exist
                    val profiles = NativeLib.loadProfilesNative()
                    if (profiles != "[]" && profiles.isNotEmpty()) {
                        NativeLib.startProfileMonitorNative()
                        Log.d("BootReceiver", "Profile monitor started")
                    }
                }
            }
        }
    }
}
