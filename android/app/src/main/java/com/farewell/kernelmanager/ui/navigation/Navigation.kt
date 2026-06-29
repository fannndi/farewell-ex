package com.farewell.kernelmanager.ui.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.ui.graphics.vector.ImageVector

sealed class Screen(val route: String, val title: String, val icon: ImageVector) {
    object Home : Screen("home", "Home", Icons.Default.Home)
    object SoC : Screen("soc", "SoC", Icons.Default.Memory)
    object Battery : Screen("battery", "Battery", Icons.Default.BatteryFull)
    object More : Screen("more", "More", Icons.Default.MoreVert)

    object Memory : Screen("memory", "Memory", Icons.Default.Storage)
    object Thermal : Screen("thermal", "Thermal", Icons.Default.Thermostat)
    object Kernel : Screen("kernel", "Kernel", Icons.Default.Tune)
    object Display : Screen("display", "Display", Icons.Default.BrightnessHigh)
    object Xiaomi : Screen("xiaomi", "Xiaomi", Icons.Default.PhoneAndroid)
    object Debug : Screen("debug", "Diagnostic", Icons.Default.BugReport)
    object Tier : Screen("tier", "Tier Access", Icons.Default.Security)
}

val bottomNavItems = listOf(Screen.Home, Screen.SoC, Screen.Battery, Screen.More)
