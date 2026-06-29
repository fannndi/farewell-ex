package com.farewell.kernelmanager.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.farewell.kernelmanager.ui.components.*
import com.farewell.kernelmanager.viewmodel.CPUViewModel
import com.farewell.kernelmanager.viewmodel.CpuState

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CPUScreen(viewModel: CPUViewModel, snackbar: SnackbarHostState? = null) {
    val state by viewModel.state.collectAsState()
    LazyColumn(modifier = Modifier.fillMaxSize().padding(16.dp), verticalArrangement = Arrangement.spacedBy(12.dp)) {
        item {
            ParamCard(Icons.Default.Info, "Model", state.cpuModel)
            ParamCard(Icons.Default.Speed, "Load", "${String.format("%.1f", state.cpuLoad)}%")
            ParamCard(Icons.Default.Thermostat, "Temp", "${String.format("%.1f", state.cpuTemp)}°C")
        }
        item { SectionHeader("Clusters") }
        state.clusters.forEach { cluster ->
            item {
                ExpandableCard(Icons.Default.Memory, "Cluster ${cluster.clusterNumber} (${cluster.cores.joinToString()})",
                    false, onClick = {}) {
                    Column(verticalArrangement = Arrangement.spacedBy(4.dp)) {
                        ParamCard(Icons.Default.Speed, "Freq", "${cluster.minFreq}–${cluster.maxFreq} MHz")
                        ParamCard(Icons.Default.Tune, "Governor", cluster.governor)
                    }
                }
            }
        }
        if (state.cores.isNotEmpty()) {
            item { SectionHeader("Per-Core Status") }
            state.cores.forEach { core ->
                item {
                    SwitchCard(if (core.online) Icons.Default.CheckCircle else Icons.Default.Cancel,
                        "Core ${core.core} — ${core.freq} MHz (${core.governor})",
                        core.online, { viewModel.setCoreOnline(core.core, it) })
                }
            }
        }
        if (state.isLoading) {
            item { Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) { CircularProgressIndicator() } }
        }
    }
}

@Composable
fun CPUContent(viewModel: CPUViewModel, state: CpuState, snackbar: SnackbarHostState? = null) {
    Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
        ParamCard(Icons.Default.Info, "Model", state.cpuModel)
        ParamCard(Icons.Default.Speed, "Load", "${String.format("%.1f", state.cpuLoad)}%")
        ParamCard(Icons.Default.Thermostat, "Temp", "${String.format("%.1f", state.cpuTemp)}°C")
        state.clusters.forEach { cluster ->
            ParamCard(Icons.Default.Memory, "Cluster ${cluster.clusterNumber}", "${cluster.minFreq}–${cluster.maxFreq} MHz (${cluster.governor})")
        }
    }
}
