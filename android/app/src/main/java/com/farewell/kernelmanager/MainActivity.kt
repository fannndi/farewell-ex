package com.farewell.kernelmanager

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
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
    val settingsVm: SettingsViewModel = viewModel()
    val state by mainVm.state.collectAsState()
    val appCtx = LocalContext.current.applicationContext
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route
    val subRoutes = listOf("memory", "thermal", "kernel", "display", "xiaomi", "debug", "tier", "daemon")
    val isSub = currentRoute in subRoutes
    val title = bottomNavItems.find { it.route == currentRoute }?.title ?:
        when (currentRoute) { "memory"->"Memory";"thermal"->"Thermal";"kernel"->"Kernel";"display"->"Display"
            "xiaomi"->"Xiaomi";"debug"->"Diagnostic";"tier"->"Tier Access";"more"->"More";else->"Farewell KM" }

    LaunchedEffect(Unit) { mainVm.setAppContext(appCtx); mainVm.detectAccessMode() }

    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = { Text(title, fontWeight = FontWeight.Bold, fontSize = 20.sp) },
                navigationIcon = { if (isSub) IconButton(onClick = { navController.popBackStack() }) { Icon(Icons.Default.ArrowBack, "Back") } },
                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer,
                    titleContentColor = MaterialTheme.colorScheme.onPrimaryContainer)
            )
        },
        bottomBar = {
            if (!isSub && currentRoute != "more") {
                NavigationBar {
                    bottomNavItems.forEach { s ->
                        NavigationBarItem(
                            icon = { Icon(s.icon, contentDescription = s.title) },
                            label = { Text(s.title) },
                            selected = currentRoute == s.route,
                            onClick = { navController.navigate(s.route) { popUpTo(Screen.Home.route) { saveState = true }; launchSingleTop = true; restoreState = true } }
                        )
                    }
                }
            }
        }
    ) { padding ->
        NavHost(navController, startDestination = Screen.Home.route, modifier = Modifier.padding(padding)) {
            composable(Screen.Home.route) { HomeScreen(mainVm = mainVm) }
            composable(Screen.SoC.route) { SoCScreen() }
            composable(Screen.Battery.route) { BatteryScreen() }
            composable(Screen.More.route) { MoreScreen { navController.navigate(it) } }
            composable(Screen.Memory.route) { MemoryScreen() }
            composable(Screen.Thermal.route) { ThermalScreen() }
            composable(Screen.Kernel.route) { KernelScreen() }
            composable(Screen.Display.route) { DisplayScreen() }
            composable("daemon") { DaemonScreen() }
            composable(Screen.Xiaomi.route) { XiaomiScreen() }
            composable(Screen.Tier.route) { TierAccessScreen(viewModel = settingsVm) }
            composable(Screen.Debug.route) { DebugScreen(mainVm) }
        }
    }
}
