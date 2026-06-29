package com.farewell.kernelmanager.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.farewell.kernelmanager.kernel.access.AccessManager
import com.farewell.kernelmanager.kernel.access.AccessMode

@Deprecated("Use SettingScreen instead", replaceWith = ReplaceWith("SettingScreen(accessModeName, onNavigateTier)"))
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SettingsScreen(onNavigateTier: () -> Unit = {}) {
    SettingScreen(accessModeName = AccessManager.currentMode.name, onNavigateTier = onNavigateTier, onNavigateDebug = {})
}
