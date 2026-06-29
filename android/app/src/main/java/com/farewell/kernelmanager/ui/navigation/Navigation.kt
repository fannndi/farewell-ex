package com.farewell.kernelmanager.ui.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.ui.graphics.vector.ImageVector

sealed class Screen(val route: String, val title: String, val icon: ImageVector) {
    object Home : Screen("home", "Home", Icons.Default.Home)
    object CPU : Screen("cpu", "CPU", Icons.Default.Memory)
    object GPU : Screen("gpu", "GPU", Icons.Default.GraphicEq)
    object Battery : Screen("battery", "Battery", Icons.Default.BatteryFull)
    object Kernel : Screen("kernel", "Kernel", Icons.Default.Tune)
    object More : Screen("more", "More", Icons.Default.MoreVert)

    // Sub-screens (from More menu)
    object Memory : Screen("memory", "Memory", Icons.Default.Storage)
    object Thermal : Screen("thermal", "Thermal", Icons.Default.Thermostat)
    object Display : Screen("display", "Display", Icons.Default.BrightnessHigh)
    object Xiaomi : Screen("xiaomi", "Xiaomi", Icons.Default.PhoneAndroid)
    object Debug : Screen("debug", "Diagnostic", Icons.Default.BugReport)
    object Tier : Screen("tier", "Tier Access", Icons.Default.Security)
}

val bottomNavItems = listOf(Screen.Home, Screen.CPU, Screen.GPU, Screen.Battery, Screen.Kernel, Screen.More)
