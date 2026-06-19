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
import com.farewell.kernelmanager.kernel.AccessManager
import com.farewell.kernelmanager.kernel.AccessMode

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SettingsScreen() {
    var accessMode by remember { mutableStateOf(AccessMode.NON_ROOT) }

    Column(modifier = Modifier.fillMaxSize().verticalScroll(rememberScrollState()).padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)) {
        Text("Settings", style = MaterialTheme.typography.headlineMedium, fontWeight = FontWeight.Bold)

        Card(modifier = Modifier.fillMaxWidth()) {
            Column(modifier = Modifier.padding(16.dp), verticalArrangement = Arrangement.spacedBy(8.dp)) {
                Text("Access Mode", fontWeight = FontWeight.Bold)
                Text("Current: ${AccessManager.currentMode.name}", style = MaterialTheme.typography.bodySmall)
                Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                    AccessMode.values().forEach { mode ->
                        FilterChip(
                            selected = accessMode == mode,
                            onClick = { accessMode = mode },
                            label = { Text(mode.name) }
                        )
                    }
                }
                Text("Root: ${AccessManager.isRootAvailable()} | Shizuku: ${AccessManager.isShizukuAvailable()}",
                    style = MaterialTheme.typography.bodySmall, color = MaterialTheme.colorScheme.onSurfaceVariant)
            }
        }

        Card(modifier = Modifier.fillMaxWidth()) {
            Column(modifier = Modifier.padding(16.dp), verticalArrangement = Arrangement.spacedBy(8.dp)) {
                Text("About", fontWeight = FontWeight.Bold)
                Text("Farewell Kernel Manager v1.0.0")
                Text("Target: POCO X3 NFC (SM7150-AC, Adreno 618)")
                Text("Stack: Rust SDK + Kotlin/Compose + Material 3")
            }
        }
    }
}
