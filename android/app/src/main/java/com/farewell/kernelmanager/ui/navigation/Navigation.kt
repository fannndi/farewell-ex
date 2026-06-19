package com.farewell.kernelmanager.ui.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.ui.graphics.vector.ImageVector

sealed class Screen(val route: String, val title: String, val icon: ImageVector) {
    object Dashboard : Screen("dashboard", "Dashboard", Icons.Default.Dashboard)
    object CPU : Screen("cpu", "CPU", Icons.Default.Speed)
    object GPU : Screen("gpu", "GPU", Icons.Default.Memory)
    object Memory : Screen("memory", "Memory", Icons.Default.Storage)
    object Thermal : Screen("thermal", "Thermal", Icons.Default.Thermostat)
    object Battery : Screen("battery", "Battery", Icons.Default.BatteryFull)
    object Game : Screen("game", "Game", Icons.Default.SportsEsports)
    object Settings : Screen("settings", "Settings", Icons.Default.Settings)
}

val bottomNavItems = listOf(Screen.Dashboard, Screen.CPU, Screen.GPU, Screen.Memory, Screen.Thermal, Screen.Battery, Screen.Game, Screen.Settings)
