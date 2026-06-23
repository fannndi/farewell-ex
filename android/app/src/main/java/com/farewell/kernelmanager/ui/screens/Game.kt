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
import com.farewell.kernelmanager.viewmodel.GameViewModel
import com.farewell.kernelmanager.viewmodel.GameState

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun GameScreen(viewModel: GameViewModel, snackbar: SnackbarHostState? = null) {
    val state by viewModel.state.collectAsState()
    Column(modifier = Modifier.fillMaxSize().padding(16.dp), verticalArrangement = Arrangement.spacedBy(12.dp)) {
        GameContent(state,
            onSetPreset = { viewModel.setPreset(it) },
            onToggleDnd = { viewModel.toggleDnd() },
            onSetAdrenoboost = { viewModel.setAdrenoboost(it) },
            onClearRam = { viewModel.clearRam() },
            onToggleGameDetect = { viewModel.toggleGameDetect(it) })
    }
}

@Composable
fun GameContent(
    state: GameState,
    onSetPreset: (String) -> Unit = {},
    onToggleDnd: () -> Unit = {},
    onSetAdrenoboost: (Int) -> Unit = {},
    onClearRam: () -> Unit = {},
    onToggleGameDetect: (Boolean) -> Unit = {}
) {
    Column(verticalArrangement = Arrangement.spacedBy(12.dp)) {
        Card(modifier = Modifier.fillMaxWidth()) {
            Column(modifier = Modifier.padding(16.dp), verticalArrangement = Arrangement.spacedBy(8.dp)) {
                Text("Performance Preset", fontWeight = FontWeight.Bold)
                Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                    listOf("powersave", "balanced", "performance", "monster").forEach { p ->
                        FilterChip(selected = state.preset == p, onClick = { onSetPreset(p) },
                            label = { Text(p.replaceFirstChar { it.uppercase() }) })
                    }
                }
            }
        }

        Card(modifier = Modifier.fillMaxWidth()) {
            Column(modifier = Modifier.padding(16.dp), verticalArrangement = Arrangement.spacedBy(8.dp)) {
                Text("Quick Actions", fontWeight = FontWeight.Bold)
                Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                    FilterChip(selected = state.dndEnabled, onClick = onToggleDnd,
                        label = { Text("DND") }, leadingIcon = { Icon(Icons.Default.DoNotDisturbOn, contentDescription = null) })
                    FilterChip(selected = state.adrenoboost > 0, onClick = {
                        if (state.adrenoboost > 0) onSetAdrenoboost(0) else onSetAdrenoboost(1)
                    }, label = { Text("GPU Boost") }, leadingIcon = { Icon(Icons.Default.Speed, contentDescription = null) })
                    FilterChip(selected = false, onClick = onClearRam,
                        label = { Text("RAM Clear") }, leadingIcon = { Icon(Icons.Default.CleaningServices, contentDescription = null) })
                }
            }
        }

        Card(modifier = Modifier.fillMaxWidth()) {
            Column(modifier = Modifier.padding(16.dp), verticalArrangement = Arrangement.spacedBy(8.dp)) {
                Text("Game Detection", fontWeight = FontWeight.Bold)
                Text("Foreground: ${state.foregroundApp.ifEmpty { "—" }}", style = MaterialTheme.typography.bodySmall)
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text("Auto-detect games", modifier = Modifier.weight(1f))
                    Switch(checked = state.gameDetectActive, onCheckedChange = onToggleGameDetect)
                }
                Text("Applies performance profile when a game launches.", style = MaterialTheme.typography.bodySmall, color = MaterialTheme.colorScheme.onSurfaceVariant)
            }
        }
    }
}
