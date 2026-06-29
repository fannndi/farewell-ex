package com.farewell.kernelmanager.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.farewell.kernelmanager.viewmodel.BatteryViewModel
import com.farewell.kernelmanager.viewmodel.BatteryState

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BatteryScreen(viewModel: BatteryViewModel = androidx.lifecycle.viewmodel.compose.viewModel(), snackbar: SnackbarHostState? = null) {
    val state by viewModel.state.collectAsState()
    Column(modifier = Modifier.fillMaxSize().padding(16.dp), verticalArrangement = Arrangement.spacedBy(12.dp)) {
        BatteryContent(state, onToggleBypass = { viewModel.toggleBypass(it) })
    }
}

@Composable
fun BatteryContent(state: BatteryState, onToggleBypass: (Boolean) -> Unit = {}) {
    Column(verticalArrangement = Arrangement.spacedBy(12.dp)) {
        Card(modifier = Modifier.fillMaxWidth()) {
            Column(modifier = Modifier.padding(16.dp), verticalArrangement = Arrangement.spacedBy(4.dp)) {
                Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
                    Text("${state.level}%", style = MaterialTheme.typography.displayLarge, fontWeight = FontWeight.Bold)
                    Icon(if (state.isCharging) Icons.Default.BatteryChargingFull else Icons.Default.BatteryFull,
                        contentDescription = null, modifier = Modifier.size(48.dp),
                        tint = if (state.isCharging) Color(0xFF388E3C) else Color(0xFF1565C0))
                }
                LinearProgressIndicator(modifier = Modifier.fillMaxWidth().padding(vertical = 8.dp),
                    progress = { state.level / 100f })
                Text("Status: ${state.status} | Health: ${state.health}")
                Text("Temp: ${String.format("%.1f", state.temp)}°C | Voltage: ${String.format("%.2f", state.voltage)}V")
                Text("Current: ${state.current} mA | Cycles: ${state.cycleCount}")
                Text("Capacity: ${String.format("%.1f", state.capacityLevel)}% (current/design)")
            }
        }

        Card(modifier = Modifier.fillMaxWidth()) {
            Column(modifier = Modifier.padding(16.dp), verticalArrangement = Arrangement.spacedBy(8.dp)) {
                Text("Bypass Charging", fontWeight = FontWeight.Bold)
                Text("Disable internal charging, power directly from charger", style = MaterialTheme.typography.bodySmall)
                Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween, verticalAlignment = Alignment.CenterVertically) {
                    Text("Enable Bypass")
                    Switch(checked = state.bypassEnabled, onCheckedChange = onToggleBypass)
                }
            }
        }

        if (state.isLoading) { Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) { CircularProgressIndicator() } }
    }
}
