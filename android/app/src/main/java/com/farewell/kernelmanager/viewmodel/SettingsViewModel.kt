package com.farewell.kernelmanager.viewmodel

import androidx.lifecycle.ViewModel
import com.farewell.kernelmanager.kernel.native.NativeLib
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

data class TierState(
    val currentTier: Int = 1,
    val isRooted: Boolean = false,
    val hasZygisk: Boolean = false,
    val hasXposed: Boolean = false,
    val hasShizuku: Boolean = false,
    val frameworkJson: String = "",
    val unlockedFeatures: Int = 0,
    val lockedFeatures: Int = 0,
)

data class FeatureUnlock(
    val name: String,
    val tier: Int,
    val unlocked: Boolean,
    val requiredFramework: String = "",
)

class SettingsViewModel : ViewModel() {
    private val _tierState = MutableStateFlow(TierState())
    val tierState: StateFlow<TierState> = _tierState

    private val _features = MutableStateFlow<List<FeatureUnlock>>(emptyList())
    val features: StateFlow<List<FeatureUnlock>> = _features

    init { refresh() }

    fun refresh() {
        if (!NativeLib.isAvailable()) return

        val tier = NativeLib.detectTierNative()
        val json = NativeLib.getFrameworkStatusJsonNative()
        val unlocked = NativeLib.getUnlockedFeaturesNative()
        val locked = NativeLib.getLockedFeaturesNative()

        _tierState.value = TierState(
            currentTier = tier,
            isRooted = tier >= 3,
            hasZygisk = tier >= 4,
            hasXposed = tier >= 5,
            hasShizuku = NativeLib.hasKernelSuNative() != 0,
            frameworkJson = json,
            unlockedFeatures = unlocked,
            lockedFeatures = locked,
        )

        _features.value = listOf(
            FeatureUnlock("CPU Governor", 3, tier >= 3),
            FeatureUnlock("GPU Control", 3, tier >= 3),
            FeatureUnlock("Memory Tuning", 3, tier >= 3),
            FeatureUnlock("Thermal Control", 3, tier >= 3),
            FeatureUnlock("Charging Control", 3, tier >= 3),
            FeatureUnlock("I/O Scheduler", 3, tier >= 3),
            FeatureUnlock("Device Spoofing", 3, tier >= 3),
            FeatureUnlock("GPU Renderer Switch", 3, tier >= 3),
            FeatureUnlock("Display DPI (Global)", 2, tier >= 2),
            FeatureUnlock("Per-App Renderer", 4, tier >= 4, "ZygiskNext"),
            FeatureUnlock("Per-App Spoofing", 4, tier >= 4, "ZygiskNext"),
            FeatureUnlock("COW Properties", 4, tier >= 4, "ZygiskNext"),
            FeatureUnlock("Per-App CPU Info", 4, tier >= 4, "ZygiskNext"),
            FeatureUnlock("Per-App DPI (No Flicker)", 5, tier >= 5, "LSPosed/Vector"),
            FeatureUnlock("Per-App Font Scaling", 5, tier >= 5, "LSPosed/Vector"),
        )
    }
}
