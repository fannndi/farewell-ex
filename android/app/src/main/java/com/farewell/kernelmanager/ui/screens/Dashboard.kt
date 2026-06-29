package com.farewell.kernelmanager.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.farewell.kernelmanager.kernel.AccessMode
import com.farewell.kernelmanager.viewmodel.MainViewModel

@Composable
fun HomeScreen(mainVm: MainViewModel) {
    val state by mainVm.state.collectAsState()
    val colors = listOf(Color(0xFF1976D2), Color(0xFF388E3C), Color(0xFFF57C00), Color(0xFF7B1FA2))
    val items = listOf(
        Triple("${state.cpuLoad.toInt()}%", "CPU Load", "Speed"),
        Triple("${state.gpuFreq}MHz", "GPU Freq", "GraphicEq"),
        Triple("${state.batteryLevel}%", "Battery", "BatteryFull"),
        Triple("${state.cpuTemp.toInt()}°C", "CPU Temp", "Thermostat"),
    )

    Column(Modifier.fillMaxSize().verticalScroll(rememberScrollState()).padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)) {

        // Stats row
        Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(8.dp)) {
            items.forEachIndexed { i, (val_, label, _) ->
                Card(Modifier.weight(1f), shape = RoundedCornerShape(16.dp),
                    colors = CardDefaults.cardColors(containerColor = colors[i].copy(alpha = 0.15f))) {
                    Column(Modifier.padding(12.dp), horizontalAlignment = Alignment.CenterHorizontally) {
                        Text(val_, fontWeight = FontWeight.Bold, fontSize = 22.sp, color = colors[i])
                        Text(label, fontSize = 11.sp, color = MaterialTheme.colorScheme.onSurfaceVariant)
                    }
                }
            }
        }

        // Profile selector
        Card(Modifier.fillMaxWidth(), shape = RoundedCornerShape(24.dp),
            colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceBright)) {
            Column(Modifier.padding(16.dp)) {
                Text("Performance Profile", fontWeight = FontWeight.SemiBold)
                Spacer(Modifier.height(12.dp))
                Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                    listOf("Powersave", "Balance", "Performance").forEachIndexed { i, label ->
                        val clr = listOf(Color(0xFF388E3C), Color(0xFFF57C00), Color(0xFFD32F2F))[i]
                        Button(
                            onClick = { /* TODO: apply profile */ },
                            modifier = Modifier.weight(1f),
                            colors = ButtonDefaults.buttonColors(containerColor = clr),
                            shape = RoundedCornerShape(16.dp)
                        ) { Text(label, maxLines = 1, fontSize = 12.sp) }
                    }
                }
            }
        }

        // Device info
        Card(Modifier.fillMaxWidth(), shape = RoundedCornerShape(24.dp),
            colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceBright)) {
            Column(Modifier.padding(16.dp), verticalArrangement = Arrangement.spacedBy(4.dp)) {
                Text("Device", fontWeight = FontWeight.SemiBold)
                Text("${state.deviceModel} · ${state.soc}", fontSize = 13.sp, color = MaterialTheme.colorScheme.onSurfaceVariant)
                Text("GPU: ${state.gpuModel} · RAM: ${state.ramUsedMb}/${state.ramTotalMb}MB", fontSize = 13.sp, color = MaterialTheme.colorScheme.onSurfaceVariant)
                Text("Android: ${state.androidVersion} · Kernel: ${state.kernelVersion.take(30)}", fontSize = 13.sp, color = MaterialTheme.colorScheme.onSurfaceVariant)
                Text("Tier: ${state.accessMode.name}", fontSize = 13.sp, color = if (state.accessMode == AccessMode.ROOT) Color(0xFF4CAF50) else Color(0xFFFF9800))
            }
        }

        if (state.accessMode != AccessMode.ROOT) {
            Card(Modifier.fillMaxWidth(), colors = CardDefaults.cardColors(containerColor = Color(0xFFFFF3E0))) {
                Text("⚠ Root required for tuning. Swipe ke tab SoC atau Battery.",
                    modifier = Modifier.padding(16.dp), fontSize = 13.sp, color = Color(0xFFE65100))
            }
        }
    }
}
