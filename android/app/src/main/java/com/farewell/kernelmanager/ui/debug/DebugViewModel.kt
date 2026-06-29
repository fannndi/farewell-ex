package com.farewell.kernelmanager.ui.debug

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.farewell.kernelmanager.kernel.native.NativeLib
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

data class DebugState(
    val log: String = "",
    val isLoading: Boolean = false,
    val lastTier: String = "",
)

class DebugViewModel : ViewModel() {
    private val _state = MutableStateFlow(DebugState())
    val state: StateFlow<DebugState> = _state

    fun runDiagnostic(tier: String) {
        if (!NativeLib.isAvailable()) {
            _state.value = DebugState(log = "Native library not loaded", lastTier = tier)
            return
        }
        _state.value = _state.value.copy(isLoading = true, lastTier = tier)
        viewModelScope.launch {
            val log = withContext(Dispatchers.IO) {
                NativeLib.runDebugDiagnosticNative(tier)
            }
            _state.value = DebugState(log = log, lastTier = tier)
        }
    }

    fun readLog() {
        if (!NativeLib.isAvailable()) return
        viewModelScope.launch {
            val log = withContext(Dispatchers.IO) {
                NativeLib.readDebugLogNative()
            }
            if (log.isNotEmpty()) {
                _state.value = _state.value.copy(log = log)
            }
        }
    }
}
