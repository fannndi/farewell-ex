package com.farewell.kernelmanager.ui.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.ui.graphics.vector.ImageVector

sealed class Screen(val route: String, val title: String, val icon: ImageVector) {
    object Home : Screen("home", "Home", Icons.Default.Home)
    object Access : Screen("access", "Access", Icons.Default.Tune)
    object Setting : Screen("setting", "Setting", Icons.Default.Settings)
    object TierAccess : Screen("tier", "Tier Access", Icons.Default.Security)
    object Debug : Screen("debug", "Diagnostic", Icons.Default.BugReport)
}

val bottomNavItems = listOf(Screen.Home, Screen.Access, Screen.Setting)
