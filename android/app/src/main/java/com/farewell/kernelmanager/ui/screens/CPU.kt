package com.farewell.kernelmanager.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.farewell.kernelmanager.viewmodel.CPUViewModel
import com.farewell.kernelmanager.viewmodel.CpuState

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CPUScreen(viewModel: CPUViewModel, snackbar: SnackbarHostState? = null) {
    val state by viewModel.state.collectAsState()
    Column(modifier = Modifier.fillMaxSize().padding(16.dp), verticalArrangement = Arrangement.spacedBy(12.dp)) {
        CPUContent(viewModel, state)
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CPUContent(viewModel: CPUViewModel, state: CpuState, snackbar: SnackbarHostState? = null) {
    val clusterDropdowns = remember { mutableStateMapOf<Int, Boolean>() }
    val selectedGovernors = remember { mutableStateMapOf<Int, String>() }

    Column(verticalArrangement = Arrangement.spacedBy(12.dp)) {
        Text("Model: ${state.cpuModel} | Load: ${String.format("%.1f", state.cpuLoad)}% | Temp: ${String.format("%.1f", state.cpuTemp)}°C")

        state.clusters.forEach { cluster ->
            Card(modifier = Modifier.fillMaxWidth()) {
                Column(modifier = Modifier.padding(16.dp), verticalArrangement = Arrangement.spacedBy(8.dp)) {
                    Text("Cluster ${cluster.clusterNumber} (${cluster.cores.joinToString()})", fontWeight = FontWeight.Bold)
                    Text("Freq: ${cluster.minFreq}–${cluster.maxFreq} MHz | Governor: ${cluster.governor}")
                    Text("Cores: ${cluster.cores.size}", style = MaterialTheme.typography.bodySmall)
                    Text("Governor", fontWeight = FontWeight.SemiBold)
                    val expanded = clusterDropdowns[cluster.clusterNumber] ?: false
                    val selected = selectedGovernors[cluster.clusterNumber] ?: ""
                    ExposedDropdownMenuBox(expanded = expanded, onExpandedChange = { clusterDropdowns[cluster.clusterNumber] = it }) {
                        OutlinedTextField(
                            value = selected.ifEmpty { cluster.governor },
                            onValueChange = {},
                            readOnly = true,
                            trailingIcon = { ExposedDropdownMenuDefaults.TrailingIcon(expanded = expanded) },
                            modifier = Modifier.menuAnchor().fillMaxWidth()
                        )
                        ExposedDropdownMenu(expanded = expanded, onDismissRequest = { clusterDropdowns[cluster.clusterNumber] = false }) {
                            cluster.availableGovernors.forEach { gov ->
                                DropdownMenuItem(text = { Text(gov) }, onClick = {
                                    selectedGovernors[cluster.clusterNumber] = gov
                                    clusterDropdowns[cluster.clusterNumber] = false
                                    viewModel.setGovernor(cluster.clusterNumber, gov)
                                })
                            }
                        }
                    }
                }
            }
        }

        if (state.cores.isNotEmpty()) {
            Text("Per-Core Status", fontWeight = FontWeight.Bold)
            state.cores.forEach { core ->
                Row(modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp), horizontalArrangement = Arrangement.SpaceBetween, verticalAlignment = Alignment.CenterVertically) {
                    Text("Core ${core.core}", style = MaterialTheme.typography.bodyMedium)
                    Text("${core.freq} MHz", style = MaterialTheme.typography.bodySmall)
                    Text(core.governor, style = MaterialTheme.typography.bodySmall, color = MaterialTheme.colorScheme.onSurfaceVariant)
                    Switch(checked = core.online, onCheckedChange = { viewModel.setCoreOnline(core.core, it) })
                }
            }
        }

        if (state.isLoading) {
            Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
                CircularProgressIndicator()
            }
        }
    }
}
