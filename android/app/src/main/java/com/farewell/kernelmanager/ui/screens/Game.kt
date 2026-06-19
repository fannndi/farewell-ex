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

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun GameScreen() {
    Column(modifier = Modifier.fillMaxSize().verticalScroll(rememberScrollState()).padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)) {
        Text("Game Mode", style = MaterialTheme.typography.headlineMedium, fontWeight = FontWeight.Bold)

        Card(modifier = Modifier.fillMaxWidth()) {
            Column(modifier = Modifier.padding(16.dp), verticalArrangement = Arrangement.spacedBy(8.dp)) {
                Text("Performance Preset", fontWeight = FontWeight.Bold)
                Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                    var selected by remember { mutableStateOf("balanced") }
                    FilterChip(selected = selected == "powersave", onClick = { selected = "powersave" }, label = { Text("Powersave") })
                    FilterChip(selected = selected == "balanced", onClick = { selected = "balanced" }, label = { Text("Balanced") })
                    FilterChip(selected = selected == "performance", onClick = { selected = "performance" }, label = { Text("Performance") })
                    FilterChip(selected = selected == "monster", onClick = { selected = "monster" }, label = { Text("Monster") })
                }
            }
        }

        Card(modifier = Modifier.fillMaxWidth()) {
            Column(modifier = Modifier.padding(16.dp), verticalArrangement = Arrangement.spacedBy(8.dp)) {
                Text("Quick Actions", fontWeight = FontWeight.Bold)
                Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                    var dnd by remember { mutableStateOf(false) }
                    var gpuBoost by remember { mutableStateOf(false) }
                    var ramClear by remember { mutableStateOf(false) }
                    FilterChip(selected = dnd, onClick = { dnd = !dnd }, label = { Text("DND") }, leadingIcon = { Icon(Icons.Default.DoNotDisturbOn, contentDescription = null) })
                    FilterChip(selected = gpuBoost, onClick = { gpuBoost = !gpuBoost }, label = { Text("GPU Boost") }, leadingIcon = { Icon(Icons.Default.Speed, contentDescription = null) })
                    FilterChip(selected = ramClear, onClick = { ramClear = !ramClear }, label = { Text("RAM Clear") }, leadingIcon = { Icon(Icons.Default.CleaningServices, contentDescription = null) })
                }
            }
        }

        Card(modifier = Modifier.fillMaxWidth()) {
            Column(modifier = Modifier.padding(16.dp), verticalArrangement = Arrangement.spacedBy(8.dp)) {
                Text("Game Detection", fontWeight = FontWeight.Bold)
                Text("Automatically detect and apply profiles when a game is launched.", style = MaterialTheme.typography.bodySmall)
                Text("Coming soon — requires foreground app detection service.", style = MaterialTheme.typography.bodySmall, color = MaterialTheme.colorScheme.onSurfaceVariant)
            }
        }
    }
}
