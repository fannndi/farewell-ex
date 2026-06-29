package com.farewell.kernelmanager.viewmodel

import android.util.Log
import com.farewell.kernelmanager.kernel.native.NativeLib

data class GameState(
    val preset: String = "balanced",
    val dndEnabled: Boolean = false,
    val adrenoboost: Int = 0,
    val gameDetectActive: Boolean = false,
    val foregroundApp: String = "",
)

class GameViewModel : PollingViewModel<GameState>(GameState(), intervalMs = 3000) {

    override suspend fun refresh() {
        if (!NativeLib.isAvailable()) return
        try {
            val boost = NativeLib.getAdrenoboostNative()
            val fg = NativeLib.getForegroundAppNative()
            updateState { it.copy(adrenoboost = boost, foregroundApp = fg) }
        } catch (e: Exception) { Log.e("GameViewModel", "refresh failed", e) }
    }

    fun setPreset(preset: String) {
        updateState { it.copy(preset = preset) }
        viewModelScopeIO {
            when (preset) {
                "powersave" -> {
                    NativeLib.setGovernorNative("powersave")
                    NativeLib.setGpuPowerLevelsNative(0, 7)
                }
                "balanced" -> NativeLib.setGovernorNative("schedutil")
                "performance" -> NativeLib.setGovernorNative("performance")
                "monster" -> {
                    NativeLib.setGovernorNative("performance")
                    NativeLib.setAdrenoboostNative(3)
                    NativeLib.setStuneBoostNative(100)
                    NativeLib.setSchedUtilClampMaxNative(1024)
                }
            }
        }
    }

    fun toggleDnd() {
        val newState = !_state.value.dndEnabled
        updateState { it.copy(dndEnabled = newState) }
        viewModelScopeIO { NativeLib.setDndEnabledNative(newState) }
    }

    fun setAdrenoboost(value: Int) {
        updateState { it.copy(adrenoboost = value) }
        viewModelScopeIO { NativeLib.setAdrenoboostNative(value) }
    }

    fun clearRam() {
        viewModelScopeIO { NativeLib.dropCachesAndKillNative() }
    }

    fun toggleGameDetect(enable: Boolean) {
        updateState { it.copy(gameDetectActive = enable) }
        viewModelScopeIO { NativeLib.startProfileMonitorNative() }
    }
}
