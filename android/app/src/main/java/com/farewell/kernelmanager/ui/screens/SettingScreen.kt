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
import com.farewell.kernelmanager.kernel.access.AccessManager
import com.farewell.kernelmanager.kernel.access.AccessMode

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SettingScreen(accessModeName: String, onNavigateTier: () -> Unit = {}, onNavigateDebug: () -> Unit = {}) {
    Column(modifier = Modifier.fillMaxSize().verticalScroll(rememberScrollState()).padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)) {

        Text("Settings", style = MaterialTheme.typography.headlineMedium, fontWeight = FontWeight.Bold)

        Card(modifier = Modifier.fillMaxWidth()) {
            Column(modifier = Modifier.padding(16.dp), verticalArrangement = Arrangement.spacedBy(8.dp)) {
                Text("Access Mode", fontWeight = FontWeight.Bold)
                Text("Current: ${AccessManager.currentMode.name}",
                    style = MaterialTheme.typography.bodyMedium,
                    color = when (AccessManager.currentMode) {
                        AccessMode.ROOT -> MaterialTheme.colorScheme.tertiary
                        AccessMode.SHIZUKU -> MaterialTheme.colorScheme.secondary
                        AccessMode.NON_ROOT -> MaterialTheme.colorScheme.error
                    })
                Text("Root: ${AccessManager.isRootAvailable()} | Shizuku: ${AccessManager.isShizukuAvailable()}",
                    style = MaterialTheme.typography.bodySmall, color = MaterialTheme.colorScheme.onSurfaceVariant)
            }
        }

        Card(modifier = Modifier.fillMaxWidth(), onClick = onNavigateTier) {
            Row(modifier = Modifier.padding(16.dp), verticalAlignment = Alignment.CenterVertically) {
                Icon(Icons.Default.Security, contentDescription = null, modifier = Modifier.padding(end = 12.dp))
                Column(modifier = Modifier.weight(1f)) {
                    Text("Tier Access", fontWeight = FontWeight.Bold)
                    Text("Feature unlock status & framework detection", style = MaterialTheme.typography.bodySmall,
                        color = MaterialTheme.colorScheme.onSurfaceVariant)
                }
                Icon(Icons.Default.ChevronRight, contentDescription = null)
            }
        }

        Card(modifier = Modifier.fillMaxWidth(), onClick = onNavigateDebug) {
            Row(modifier = Modifier.padding(16.dp), verticalAlignment = Alignment.CenterVertically) {
                Icon(Icons.Default.BugReport, contentDescription = null, modifier = Modifier.padding(end = 12.dp),
                    tint = MaterialTheme.colorScheme.error)
                Column(modifier = Modifier.weight(1f)) {
                    Text("Debug Diagnostic", fontWeight = FontWeight.Bold)
                    Text("Test all features per tier, export log to root.log", style = MaterialTheme.typography.bodySmall,
                        color = MaterialTheme.colorScheme.onSurfaceVariant)
                }
                Icon(Icons.Default.ChevronRight, contentDescription = null)
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
