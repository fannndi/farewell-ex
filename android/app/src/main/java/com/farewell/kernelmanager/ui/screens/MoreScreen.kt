package com.farewell.kernelmanager.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import com.farewell.kernelmanager.ui.components.ParamCard
import com.farewell.kernelmanager.ui.components.SectionHeader

private data class MenuItem(val title: String, val desc: String, val icon: ImageVector, val route: String)

@Composable
fun MoreScreen(onNavigate: (String) -> Unit) {
    val items = listOf(
        MenuItem("Daemon", "Kernel checker + farewelld status", Icons.Default.Dns, "daemon"),
        MenuItem("Thermal", "Thermal zones, MSM/EARA/FPSGO", Icons.Default.Thermostat, "thermal"),
        MenuItem("Kernel Params", "Sched, TCP, printk, dmesg", Icons.Default.Tune, "kernel"),
        MenuItem("Display", "KCAL, DFPS, dimmer", Icons.Default.BrightnessHigh, "display"),
        MenuItem("Xiaomi", "Charging, haptic, boot QCOM", Icons.Default.PhoneAndroid, "xiaomi"),
        MenuItem("Tier Access", "Root/Shizuku detection", Icons.Default.Security, "tier"),
        MenuItem("Diagnostic", "Debug logs & checker", Icons.Default.BugReport, "debug"),
    )

    LazyColumn(modifier = Modifier.fillMaxSize().padding(16.dp), verticalArrangement = Arrangement.spacedBy(8.dp)) {
        item { SectionHeader("More Tools") }
        items(items) { item ->
            ParamCard(icon = item.icon, title = item.title, value = item.desc, onClick = { onNavigate(item.route) })
        }
    }
}
