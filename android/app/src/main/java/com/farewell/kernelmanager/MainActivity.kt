package com.farewell.kernelmanager

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
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
import com.farewell.kernelmanager.ui.navigation.Screen
import com.farewell.kernelmanager.ui.navigation.bottomNavItems
import com.farewell.kernelmanager.ui.screens.*
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

    LaunchedEffect(Unit) {
        mainVm.setAppContext(appCtx)
        mainVm.detectAccessMode()
    }

    Scaffold(
        snackbarHost = { SnackbarHost(snackbar) },
        topBar = {
            CenterAlignedTopAppBar(
                title = {
                    Text("Farewell Kernel Manager",
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp,
                        letterSpacing = 0.5.sp)
                },
                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer,
                    titleContentColor = MaterialTheme.colorScheme.onPrimaryContainer
                )
            )
        },
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
                                    popUpTo(Screen.Home.route) { saveState = true }
                                    launchSingleTop = true; restoreState = true
                                }
                            }
                        }
                    )
                }
            }
        }
    ) { padding ->
        NavHost(navController = navController, startDestination = Screen.Home.route,
            modifier = Modifier.padding(padding)) {
            composable(Screen.Home.route) {
                HomeScreen(state, cpuVm, gpuVm, memVm, thermalVm, batteryVm, gameVm, snackbar)
            }
            composable(Screen.Access.route) {
                AccessScreen(mainVm, snackbar)
            }
            composable(Screen.Setting.route) {
                SettingScreen(
                    accessModeName = state.accessMode.name,
                    onNavigateTier = { navController.navigate(Screen.TierAccess.route) },
                    onNavigateDebug = { navController.navigate(Screen.Debug.route) }
                )
            }
            composable(Screen.TierAccess.route) { TierAccessScreen(viewModel = settingsVm) }
            composable(Screen.Debug.route) { DebugScreen(mainVm) }
        }
    }
}
