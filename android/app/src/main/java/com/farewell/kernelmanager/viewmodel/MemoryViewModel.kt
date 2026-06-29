package com.farewell.kernelmanager.viewmodel

import android.util.Log
import androidx.lifecycle.viewModelScope
import com.farewell.kernelmanager.kernel.AccessManager
import com.farewell.kernelmanager.kernel.NativeLib
import com.farewell.kernelmanager.ui.components.TestResult
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

data class MemoryState(
    val totalMb: Long = 0, val availableMb: Long = 0, val usedMb: Long = 0, val cachedMb: Long = 0,
    val swapTotalMb: Long = 0, val swapUsedMb: Long = 0,
    val zramDisksize: Long = 0, val zramRatio: Float = 0f, val zramAlgorithm: String = "unknown",
    val swappiness: Int = 60, val dirtyRatio: Int = 20, val vfsCachePressure: Int = 100,
    val pressure: Float = 0f, val availableAlgorithms: List<String> = emptyList(),
    val isLoading: Boolean = true,
)

class MemoryViewModel : PollingViewModel<MemoryState>(MemoryState(), intervalMs = 3000) {
    val lastTest = mutableMapOf<String, TestResult>()

    override suspend fun refresh() {
        if (!NativeLib.isAvailable()) return
        try {
            val memObj = org.json.JSONObject(NativeLib.readMemInfoNative())
            val zramSize = NativeLib.readZramSizeNative()
            updateState {
                MemoryState(
                    totalMb = memObj.getLong("total_kb") / 1024,
                    availableMb = memObj.getLong("available_kb") / 1024,
                    usedMb = (memObj.getLong("total_kb") - memObj.getLong("available_kb")) / 1024,
                    cachedMb = memObj.optLong("cached_kb", 0) / 1024,
                    swapTotalMb = memObj.optLong("swap_total_kb", 0) / 1024,
                    zramDisksize = zramSize, zramRatio = NativeLib.getZramCompressionRatioNative(),
                    zramAlgorithm = NativeLib.getZramAlgorithmNative() ?: "unknown",
                    swappiness = NativeLib.getSwappinessNative(), pressure = NativeLib.getMemoryPressureNative(),
                    availableAlgorithms = try { org.json.JSONArray(NativeLib.getAvailableZramAlgorithmsNative()).let { a -> (0 until a.length()).map { a.getString(it) } } } catch (_: Exception) { emptyList() },
                    isLoading = false
                )
            }
        } catch (e: Exception) { Log.e("MemVM", "refresh failed", e) }
    }

    fun setSwappiness(v: Int) { viewModelScopeIO { AccessManager.writeFile("/proc/sys/vm/swappiness", v.toString()) } }
    fun setDirtyRatio(v: Int) { viewModelScopeIO { AccessManager.writeFile("/proc/sys/vm/dirty_background_ratio", v.toString()) } }
    fun setVfsCachePressure(v: Int) { viewModelScopeIO { AccessManager.writeFile("/proc/sys/vm/vfs_cache_pressure", v.toString()) } }
    fun dropCaches() { viewModelScopeIO { AccessManager.writeFile("/proc/sys/vm/drop_caches", "3") } }
    fun setZramAlgorithm(algo: String) { viewModelScopeIO { AccessManager.writeFile("/sys/block/zram0/comp_algorithm", algo) } }

    fun testSwappiness() { test("swap") { AccessManager.writeFile("/proc/sys/vm/swappiness", "60") } }
    fun testDropCaches() { test("drop") { AccessManager.writeFile("/proc/sys/vm/drop_caches", "1") } }
    private fun test(key: String, block: suspend () -> Boolean) {
        viewModelScope.launch { lastTest[key] = TestResult.Loading; lastTest[key] = if (withContext(Dispatchers.IO) { block() }) TestResult.Pass("OK") else TestResult.Fail("failed") }
    }
}
