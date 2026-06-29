package com.farewell.kernelmanager

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.farewell.kernelmanager.ui.components.ParamCard
import com.farewell.kernelmanager.ui.navigation.Screen
import com.farewell.kernelmanager.ui.navigation.bottomNavItems
import com.farewell.kernelmanager.ui.screens.*
import com.farewell.kernelmanager.ui.screens.KernelScreen
import com.farewell.kernelmanager.ui.screens.DisplayScreen
import com.farewell.kernelmanager.ui.settings.TierAccessScreen
import com.farewell.kernelmanager.ui.debug.DebugScreen
import com.farewell.kernelmanager.ui.theme.FarewellKernelManagerTheme
import com.farewell.kernelmanager.viewmodel.*

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
    val gameVm: GameViewModel = viewModel()
    val settingsVm: SettingsViewModel = viewModel()
    val state by mainVm.state.collectAsState()
    val snackbar = remember { SnackbarHostState() }
    val appCtx = LocalContext.current.applicationContext
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route
    val subScreenRoutes = listOf("debug", "tier", "thermal", "display", "xiaomi", "memory")
    val isSubScreen = currentRoute in subScreenRoutes
    val currentTitle = bottomNavItems.find { it.route == currentRoute }?.title ?:
        when (currentRoute) { "more" -> "More"; "thermal" -> "Thermal"; "kernel" -> "Kernel";
            "display" -> "Display"; "xiaomi" -> "Xiaomi"; "debug" -> "Diagnostic";
            "tier" -> "Tier Access"; "memory" -> "Memory"; else -> "Farewell KM" }

    LaunchedEffect(Unit) {
        mainVm.setAppContext(appCtx)
        mainVm.detectAccessMode()
    }

    Scaffold(
        snackbarHost = { SnackbarHost(snackbar) },
        topBar = {
            CenterAlignedTopAppBar(
                title = { Text(currentTitle, fontWeight = FontWeight.Bold, fontSize = 20.sp) },
                navigationIcon = {
                    if (isSubScreen) {
                        IconButton(onClick = { navController.popBackStack() }) {
                            Icon(Icons.Default.ArrowBack, "Back")
                        }
                    }
                },
                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer,
                    titleContentColor = MaterialTheme.colorScheme.onPrimaryContainer
                )
            )
        },
        bottomBar = {
            if (!isSubScreen && currentRoute != "more") {
                NavigationBar {
                    bottomNavItems.forEach { screen ->
                        NavigationBarItem(
                            icon = { Icon(screen.icon, contentDescription = screen.title) },
                            label = { Text(screen.title) },
                            selected = currentRoute == screen.route,
                            onClick = {
                                if (currentRoute != screen.route) {
                                    navController.navigate(screen.route) {
                                        popUpTo(Screen.Home.route) { saveState = true }
                                        launchSingleTop = true; restoreState = true
                                    }
                                }
                            }
                        )
                    }
                }
            }
        }
    ) { padding ->
        NavHost(navController = navController, startDestination = Screen.Home.route,
            modifier = Modifier.padding(padding)) {
            composable(Screen.Home.route) {
                HomeScreen(state, cpuVm, gpuVm, memVm, thermalVm, batteryVm, gameVm, snackbar)
            }
            composable(Screen.CPU.route) { CPUScreen(cpuVm, snackbar) }
            composable(Screen.GPU.route) { GPUScreen(gpuVm, snackbar) }
            composable(Screen.Battery.route) { BatteryScreen(batteryVm, snackbar) }
            composable(Screen.Memory.route) { MemoryScreen(memVm) }
            composable(Screen.More.route) {
                MoreScreen(onNavigate = { route -> navController.navigate(route) })
            }
            composable(Screen.Thermal.route) { ThermalScreen(thermalVm) }
            composable(Screen.Kernel.route) { KernelScreen() }
            composable(Screen.Display.route) { DisplayScreen() }
            composable(Screen.Xiaomi.route) { XiaomiScreen() }
            composable(Screen.Tier.route) { TierAccessScreen(viewModel = settingsVm) }
            composable(Screen.Debug.route) { DebugScreen(mainVm) }
        }
    }
}
