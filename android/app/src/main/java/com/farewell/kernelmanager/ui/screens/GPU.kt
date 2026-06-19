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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.farewell.kernelmanager.viewmodel.GPUViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun GPUScreen(viewModel: GPUViewModel) {
    val state by viewModel.state.collectAsState()

    Column(modifier = Modifier.fillMaxSize().verticalScroll(rememberScrollState()).padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)) {
        Text("GPU Control", style = MaterialTheme.typography.headlineMedium, fontWeight = FontWeight.Bold)
        Text("${state.vendor} ${state.model} | Driver: ${state.driverInfo}")

        Card(modifier = Modifier.fillMaxWidth()) {
            Column(modifier = Modifier.padding(16.dp), verticalArrangement = Arrangement.spacedBy(8.dp)) {
                Text("Status", fontWeight = FontWeight.Bold)
                Text("Frequency: ${state.freq} MHz")
                Text("Load: ${state.busy}%")
                Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                    Button(onClick = { viewModel.resetStats() }) { Text("Reset Stats") }
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

        if (state.availablePolicies.isNotEmpty()) {
            Card(modifier = Modifier.fillMaxWidth()) {
                Column(modifier = Modifier.padding(16.dp)) {
                    Text("Available Governors", fontWeight = FontWeight.Bold)
                    Text(state.availablePolicies.joinToString(", "))
                }
            }
        }

        Card(modifier = Modifier.fillMaxWidth()) {
            Column(modifier = Modifier.padding(16.dp), verticalArrangement = Arrangement.spacedBy(8.dp)) {
                Text("Force Controls", fontWeight = FontWeight.Bold)
                Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                    var forceClk by remember { mutableStateOf(false) }
                    var forceBus by remember { mutableStateOf(false) }
                    var forceRail by remember { mutableStateOf(false) }
                    var forceNoNap by remember { mutableStateOf(false) }

                    FilterChip(selected = forceClk, onClick = { forceClk = !forceClk; viewModel.setForce("force_clk_on", forceClk) }, label = { Text("Clk") })
                    FilterChip(selected = forceBus, onClick = { forceBus = !forceBus; viewModel.setForce("force_bus_on", forceBus) }, label = { Text("Bus") })
                    FilterChip(selected = forceRail, onClick = { forceRail = !forceRail; viewModel.setForce("force_rail_on", forceRail) }, label = { Text("Rail") })
                    FilterChip(selected = forceNoNap, onClick = { forceNoNap = !forceNoNap; viewModel.setForce("force_no_nap", forceNoNap) }, label = { Text("NoNap") })
                }
            }
        }

        if (state.isLoading) { Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) { CircularProgressIndicator() } }
    }
}
