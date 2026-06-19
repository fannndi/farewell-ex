package com.farewell.kernelmanager

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.farewell.kernelmanager.kernel.AccessManager
import com.farewell.kernelmanager.ui.navigation.Screen
import com.farewell.kernelmanager.ui.navigation.bottomNavItems
import com.farewell.kernelmanager.ui.screens.*
import com.farewell.kernelmanager.ui.theme.FarewellKernelManagerTheme
import com.farewell.kernelmanager.viewmodel.*
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { FarewellKernelManagerTheme { MainApp() } }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainApp() {
    val navController = rememberNavController()
    val mainVm: MainViewModel = viewModel()
    val cpuVm: CPUViewModel = viewModel()
    val gpuVm: GPUViewModel = viewModel()
    val memVm: MemoryViewModel = viewModel()
    val thermalVm: ThermalViewModel = viewModel()
    val batteryVm: BatteryViewModel = viewModel()
    val state by mainVm.state.collectAsState()
    val scope = rememberCoroutineScope()
    val snackbar = remember { SnackbarHostState() }

    LaunchedEffect(Unit) {
        mainVm.detectAccessMode()
        snackbar.showSnackbar("Access: ${state.accessMode.name}")
    }

    Scaffold(
        snackbarHost = { SnackbarHost(snackbar) },
        bottomBar = {
            NavigationBar {
                val navBackStackEntry by navController.currentBackStackEntryAsState()
                val currentRoute = navBackStackEntry?.destination?.route
                bottomNavItems.forEach { screen ->
                    NavigationBarItem(
                        icon = { Icon(screen.icon, contentDescription = screen.title) },
                        label = { Text(screen.title) },
                        selected = currentRoute == screen.route,
                        onClick = {
                            if (currentRoute != screen.route) {
                                navController.navigate(screen.route) {
                                    popUpTo(Screen.Dashboard.route) { saveState = true }
                                    launchSingleTop = true; restoreState = true
                                }
                            }
                        }
                    )
                }
            }
        }
    ) { padding ->
        NavHost(navController = navController, startDestination = Screen.Dashboard.route, modifier = Modifier.padding(padding)) {
            composable(Screen.Dashboard.route) { DashboardScreen(state) }
            composable(Screen.CPU.route) { CPUScreen(cpuVm) }
            composable(Screen.GPU.route) { GPUScreen(gpuVm) }
            composable(Screen.Memory.route) { MemoryScreen(memVm) }
            composable(Screen.Thermal.route) { ThermalScreen(thermalVm) }
            composable(Screen.Battery.route) { BatteryScreen(batteryVm) }
            composable(Screen.Game.route) { GameScreen() }
            composable(Screen.Settings.route) { SettingsScreen() }
        }
    }
}
