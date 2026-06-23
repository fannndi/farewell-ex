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
import com.farewell.kernelmanager.viewmodel.GPUViewModel
import com.farewell.kernelmanager.viewmodel.GpuState
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun GPUScreen(viewModel: GPUViewModel, snackbar: SnackbarHostState? = null) {
    val state by viewModel.state.collectAsState()
    Column(modifier = Modifier.fillMaxSize().padding(16.dp), verticalArrangement = Arrangement.spacedBy(12.dp)) {
        GPUContent(viewModel, state, snackbar)
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun GPUContent(viewModel: GPUViewModel, state: GpuState, snackbar: SnackbarHostState? = null) {
    val scope = rememberCoroutineScope()
    var showGovDropdown by remember { mutableStateOf(false) }

    LaunchedEffect(state.lastWriteOk) {
        state.lastWriteOk?.let { ok ->
            snackbar?.showSnackbar(if (ok) "Applied" else "Failed")
        }
    }

    Column(verticalArrangement = Arrangement.spacedBy(12.dp)) {
        Text("${state.vendor} ${state.model} | Driver: ${state.driverInfo}")

        Card(modifier = Modifier.fillMaxWidth()) {
            Column(modifier = Modifier.padding(16.dp), verticalArrangement = Arrangement.spacedBy(8.dp)) {
                Text("Status", fontWeight = FontWeight.Bold)
                Text("Frequency: ${state.freq} MHz")
                Text("Load: ${state.busy}%")
                if (state.currentGovernor.isNotEmpty()) {
                    Text("Governor: ${state.currentGovernor}")
                }
                Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                    Button(onClick = { viewModel.resetStats() }) { Text("Reset Stats") }
                }
            }
        }

        if (state.availablePolicies.isNotEmpty()) {
            Card(modifier = Modifier.fillMaxWidth()) {
                Column(modifier = Modifier.padding(16.dp), verticalArrangement = Arrangement.spacedBy(8.dp)) {
                    Text("Governor", fontWeight = FontWeight.Bold)
                    ExposedDropdownMenuBox(expanded = showGovDropdown, onExpandedChange = { showGovDropdown = it }) {
                        OutlinedTextField(
                            value = state.currentGovernor.ifEmpty { "—" },
                            onValueChange = {},
                            readOnly = true,
                            trailingIcon = { ExposedDropdownMenuDefaults.TrailingIcon(expanded = showGovDropdown) },
                            modifier = Modifier.menuAnchor().fillMaxWidth()
                        )
                        ExposedDropdownMenu(expanded = showGovDropdown, onDismissRequest = { showGovDropdown = false }) {
                            state.availablePolicies.forEach { gov ->
                                DropdownMenuItem(text = { Text(gov) }, onClick = {
                                    showGovDropdown = false; viewModel.setGovernor(gov)
                                })
                            }
                        }
                    }
                }
            }
        }

        if (state.availableFreqs.isNotEmpty()) {
            Card(modifier = Modifier.fillMaxWidth()) {
                Column(modifier = Modifier.padding(16.dp)) {
                    Text("Available Frequencies", fontWeight = FontWeight.Bold)
                    Text(state.availableFreqs.joinToString(" MHz, ") { it.toString() } + " MHz")
                }
            }
        }

        Card(modifier = Modifier.fillMaxWidth()) {
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

        if (state.isLoading) { Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) { CircularProgressIndicator() } }
    }
}
