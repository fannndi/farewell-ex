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
import com.farewell.kernelmanager.viewmodel.GPUViewModel
import com.farewell.kernelmanager.viewmodel.GpuState

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun GPUScreen(viewModel: GPUViewModel, snackbar: SnackbarHostState? = null) {
    val state by viewModel.state.collectAsState()
    var showGovDropdown by remember { mutableStateOf(false) }

    LaunchedEffect(state.lastWriteOk) {
        state.lastWriteOk?.let { ok ->
            snackbar?.showSnackbar(if (ok) "Applied" else "Failed")
        }
    }

    LazyColumn(modifier = Modifier.fillMaxSize().padding(16.dp), verticalArrangement = Arrangement.spacedBy(12.dp)) {
        item {
            ParamCard(Icons.Default.Info, "GPU", "${state.vendor} ${state.model}")
            ParamCard(Icons.Default.Speed, "Frequency", "${state.freq} MHz")
            ParamCard(Icons.Default.GraphicEq, "Load", "${state.busy}%")
            if (state.currentGovernor.isNotEmpty()) {
                ParamCard(Icons.Default.Tune, "Governor", state.currentGovernor)
            }
        }
        item {
            ExpandableCard(Icons.Default.Tune, "Governor & Frequencies", showGovDropdown, onClick = { showGovDropdown = !showGovDropdown }) {
                Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
                    if (state.availablePolicies.isNotEmpty()) {
                        Text("Available governors:", style = MaterialTheme.typography.bodySmall)
                        state.availablePolicies.forEach { gov ->
                            FilterChip(selected = state.currentGovernor == gov, onClick = { viewModel.setGovernor(gov) }, label = { Text(gov) })
                        }
                    }
                    if (state.availableFreqs.isNotEmpty()) {
                        Text("Available freqs: ${state.availableFreqs.joinToString(" MHz, ")} MHz", style = MaterialTheme.typography.bodySmall)
                    }
                }
            }
        }
        item {
            Card(modifier = Modifier.fillMaxWidth(), shape = MaterialTheme.shapes.large,
                colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceBright)) {
                Column(modifier = Modifier.padding(16.dp), verticalArrangement = Arrangement.spacedBy(8.dp)) {
                    Text("Force Controls", fontWeight = FontWeight.Bold)
                    Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                        FilterChip(selected = state.forceClk, onClick = { viewModel.setForce("force_clk_on", !state.forceClk) }, label = { Text("Clk") })
                        FilterChip(selected = state.forceBus, onClick = { viewModel.setForce("force_bus_on", !state.forceBus) }, label = { Text("Bus") })
                        FilterChip(selected = state.forceRail, onClick = { viewModel.setForce("force_rail_on", !state.forceRail) }, label = { Text("Rail") })
                        FilterChip(selected = state.forceNoNap, onClick = { viewModel.setForce("force_no_nap", !state.forceNoNap) }, label = { Text("NoNap") })
                    }
                }
            }
        }
        item {
            Button(onClick = { viewModel.resetStats() }) { Text("Reset Stats") }
        }
        if (state.isLoading) {
            item { Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) { CircularProgressIndicator() } }
        }
    }
}

@Composable
fun GPUContent(viewModel: GPUViewModel, state: GpuState, snackbar: SnackbarHostState? = null) {
    Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
        ParamCard(Icons.Default.Info, "GPU", "${state.vendor} ${state.model}")
        ParamCard(Icons.Default.Speed, "Freq", "${state.freq} MHz")
        ParamCard(Icons.Default.GraphicEq, "Load", "${state.busy}%")
    }
}
