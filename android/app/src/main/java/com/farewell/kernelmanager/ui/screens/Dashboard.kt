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
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.farewell.kernelmanager.kernel.AccessMode
import com.farewell.kernelmanager.viewmodel.DashboardState

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DashboardScreen(state: DashboardState) {
    Column(modifier = Modifier.fillMaxSize().verticalScroll(rememberScrollState()).padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)) {

        Text("Farewell Kernel Manager", style = MaterialTheme.typography.headlineMedium, fontWeight = FontWeight.Bold)
        Text("Access: ${state.accessMode.name} | ${state.deviceModel} ${state.soc}", style = MaterialTheme.typography.bodyMedium, color = MaterialTheme.colorScheme.onSurfaceVariant)

        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(12.dp)) {
            InfoCard("CPU Load", "${String.format("%.1f", state.cpuLoad)}%", Icons.Default.Speed, Modifier.weight(1f))
            InfoCard("CPU Temp", "${String.format("%.1f", state.cpuTemp)}°C", Icons.Default.Thermostat, Modifier.weight(1f))
        }

        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(12.dp)) {
            InfoCard("GPU", "${state.gpuFreq} MHz", Icons.Default.Memory, Modifier.weight(1f))
            InfoCard("GPU Load", "${state.gpuLoad}%", Icons.Default.Speed, Modifier.weight(1f))
        }

        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(12.dp)) {
            InfoCard("Battery", "${state.batteryLevel}%", if (state.isCharging) Icons.Default.BatteryChargingFull else Icons.Default.BatteryFull, Modifier.weight(1f))
            InfoCard("RAM", "${state.ramUsedMb}/${state.ramTotalMb} MB", Icons.Default.Storage, Modifier.weight(1f))
        }

        Card(modifier = Modifier.fillMaxWidth()) {
            Column(modifier = Modifier.padding(16.dp), verticalArrangement = Arrangement.spacedBy(4.dp)) {
                Text("Device Info", fontWeight = FontWeight.Bold)
                Text("Model: ${state.deviceModel}", style = MaterialTheme.typography.bodySmall)
                Text("SoC: ${state.soc}", style = MaterialTheme.typography.bodySmall)
                Text("GPU: ${state.gpuVendor} ${state.gpuModel}", style = MaterialTheme.typography.bodySmall)
                Text("Battery: ${String.format("%.1f", state.batteryTemp)}°C, ${String.format("%.1f", state.batteryVoltage)}V", style = MaterialTheme.typography.bodySmall)
                Text("Android: ${state.androidVersion}", style = MaterialTheme.typography.bodySmall)
            }
        }
    }
}

@Composable
fun InfoCard(title: String, value: String, icon: ImageVector, modifier: Modifier = Modifier) {
    Card(modifier = modifier) {
        Column(modifier = Modifier.padding(16.dp), horizontalAlignment = Alignment.CenterHorizontally) {
            Icon(icon, contentDescription = null, tint = MaterialTheme.colorScheme.primary)
            Spacer(modifier = Modifier.height(8.dp))
            Text(title, style = MaterialTheme.typography.bodySmall)
            Text(value, style = MaterialTheme.typography.titleMedium, fontWeight = FontWeight.Bold)
        }
    }
}
