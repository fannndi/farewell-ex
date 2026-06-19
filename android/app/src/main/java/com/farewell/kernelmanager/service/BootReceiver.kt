package com.farewell.kernelmanager.service

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log
import com.farewell.kernelmanager.kernel.AccessManager

class BootReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {
        if (intent.action == Intent.ACTION_BOOT_COMPLETED) {
            Log.d("BootReceiver", "Boot completed, applying settings...")
            // TODO: Read saved profile from DataStore and apply via AccessManager
        }
    }
}
