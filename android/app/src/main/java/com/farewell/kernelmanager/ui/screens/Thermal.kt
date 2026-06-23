package com.farewell.kernelmanager.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.farewell.kernelmanager.viewmodel.ThermalViewModel
import com.farewell.kernelmanager.viewmodel.ThermalState

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ThermalScreen(viewModel: ThermalViewModel, snackbar: SnackbarHostState? = null) {
    val state by viewModel.state.collectAsState()
    Column(modifier = Modifier.fillMaxSize().padding(16.dp), verticalArrangement = Arrangement.spacedBy(12.dp)) {
        ThermalContent(state, onSetPreset = { viewModel.setPreset(it) })
    }
}

@Composable
fun ThermalContent(state: ThermalState, onSetPreset: (String) -> Unit = {}) {
    val presets = listOf("default", "extreme", "dynamic", "incalls", "cool")

    Column(verticalArrangement = Arrangement.spacedBy(12.dp)) {
        Text("CPU Temperature: ${String.format("%.1f", state.cpuTemp)}°C")

        Card(modifier = Modifier.fillMaxWidth()) {
            Column(modifier = Modifier.padding(16.dp), verticalArrangement = Arrangement.spacedBy(8.dp)) {
                Text("Thermal Presets", fontWeight = FontWeight.Bold)
                Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                    presets.forEach { preset ->
                        FilterChip(selected = state.selectedPreset == preset,
                            onClick = { onSetPreset(preset) },
                            label = { Text(preset.replaceFirstChar { it.uppercase() }) })
                    }
                }
            }
        }

        if (state.zones.isNotEmpty()) {
            Text("Thermal Zones (${state.zones.size})", fontWeight = FontWeight.Bold)
            state.zones.forEach { zone ->
                val color = when {
                    zone.temp > 70f -> Color(0xFFD32F2F)
                    zone.temp > 45f -> Color(0xFFFFA000)
                    else -> Color(0xFF388E3C)
                }
                Row(modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp),
                    horizontalArrangement = Arrangement.SpaceBetween, verticalAlignment = Alignment.CenterVertically) {
                    Text(zone.name, style = MaterialTheme.typography.bodyMedium)
                    Text("${String.format("%.1f", zone.temp)}°C", color = color, fontWeight = FontWeight.Bold)
                }
                LinearProgressIndicator(modifier = Modifier.fillMaxWidth().padding(vertical = 4.dp),
                    progress = { (zone.temp / 100f).coerceIn(0f, 1f) }, color = color)
            }
        }

        if (state.isLoading) { Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) { CircularProgressIndicator() } }
    }
}
