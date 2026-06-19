package com.farewell.kernelmanager.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.farewell.kernelmanager.viewmodel.MemoryViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MemoryScreen(viewModel: MemoryViewModel) {
    val state by viewModel.state.collectAsState()
    var swappiness by remember { mutableStateOf(state.swappiness.toString()) }

    Column(modifier = Modifier.fillMaxSize().verticalScroll(rememberScrollState()).padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)) {
        Text("Memory & ZRAM", style = MaterialTheme.typography.headlineMedium, fontWeight = FontWeight.Bold)

        Card(modifier = Modifier.fillMaxWidth()) {
            Column(modifier = Modifier.padding(16.dp), verticalArrangement = Arrangement.spacedBy(4.dp)) {
                Text("RAM", fontWeight = FontWeight.Bold)
                Text("Total: ${state.totalMb} MB | Used: ${state.usedMb} MB | Available: ${state.availableMb} MB")
                Text("Cached: ${state.cachedMb} MB | Pressure: ${String.format("%.1f", state.pressure)}%")
                LinearProgressIndicator(modifier = Modifier.fillMaxWidth().padding(vertical = 8.dp),
                    progress = { if (state.totalMb > 0) state.usedMb.toFloat() / state.totalMb else 0f })
            }
        }

        Card(modifier = Modifier.fillMaxWidth()) {
            Column(modifier = Modifier.padding(16.dp), verticalArrangement = Arrangement.spacedBy(4.dp)) {
                Text("ZRAM", fontWeight = FontWeight.Bold)
                Text("Disksize: ${state.zramDisksize} bytes")
                Text("Compression: ${state.zramAlgorithm} (${String.format("%.2f", state.zramRatio)}x)")
                if (state.availableAlgorithms.isNotEmpty()) {
                    Text("Available: ${state.availableAlgorithms.joinToString(", ")}")
                }
            }
        }

        Card(modifier = Modifier.fillMaxWidth()) {
            Column(modifier = Modifier.padding(16.dp), verticalArrangement = Arrangement.spacedBy(8.dp)) {
                Text("VM Parameters", fontWeight = FontWeight.Bold)
                OutlinedTextField(value = swappiness, onValueChange = { swappiness = it },
                    label = { Text("Swappiness (0-200)") }, modifier = Modifier.fillMaxWidth())
                Button(onClick = { swappiness.toIntOrNull()?.let { viewModel.setSwappiness(it) } }) {
                    Text("Apply Swappiness")
                }
            }
        }

        if (state.isLoading) { Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) { CircularProgressIndicator() } }
    }
}
