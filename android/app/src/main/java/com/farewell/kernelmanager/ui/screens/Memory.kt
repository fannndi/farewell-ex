package com.farewell.kernelmanager.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.farewell.kernelmanager.viewmodel.MemoryViewModel
import com.farewell.kernelmanager.viewmodel.MemoryState
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MemoryScreen(viewModel: MemoryViewModel, snackbar: SnackbarHostState? = null) {
    val state by viewModel.state.collectAsState()
    Column(modifier = Modifier.fillMaxSize().padding(16.dp), verticalArrangement = Arrangement.spacedBy(12.dp)) {
        MemoryContent(viewModel, state, snackbar)
    }
}

@Composable
fun MemoryContent(viewModel: MemoryViewModel, state: MemoryState, snackbar: SnackbarHostState? = null) {
    var swappiness by remember(state.swappiness) { mutableStateOf(state.swappiness.toString()) }
    val scope = rememberCoroutineScope()

    Column(verticalArrangement = Arrangement.spacedBy(12.dp)) {
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
                Button(onClick = {
                    swappiness.toIntOrNull()?.let {
                        viewModel.setSwappiness(it)
                        scope.launch { snackbar?.showSnackbar("Swappiness set to $it") }
                    }
                }) { Text("Apply Swappiness") }
            }
        }

        if (state.isLoading) { Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) { CircularProgressIndicator() } }
    }
}
