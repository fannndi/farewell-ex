package com.farewell.kernelmanager.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.isActive
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

abstract class PollingViewModel<S>(initialState: S, intervalMs: Long = 2000) : ViewModel() {
    protected val _state = MutableStateFlow(initialState)
    val state: StateFlow<S> = _state.asStateFlow()
    private var job: Job? = null

    init {
        job = viewModelScope.launch {
            while (isActive) {
                refresh()
                delay(intervalMs)
            }
        }
    }

    protected abstract suspend fun refresh()

    protected fun updateState(transform: (S) -> S) {
        _state.value = transform(_state.value)
    }

    protected fun viewModelScopeIO(block: suspend () -> Unit) {
        viewModelScope.launch { withContext(Dispatchers.IO) { block() } }
    }

    override fun onCleared() {
        job?.cancel()
    }
}
