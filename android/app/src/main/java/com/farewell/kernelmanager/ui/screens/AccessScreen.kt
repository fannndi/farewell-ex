package com.farewell.kernelmanager.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.farewell.kernelmanager.kernel.access.AccessManager
import com.farewell.kernelmanager.kernel.access.AccessMode
import com.farewell.kernelmanager.viewmodel.MainViewModel
import kotlinx.coroutines.launch

private data class TierInfo(
    val level: Int, val name: String, val description: String,
    val mode: AccessMode, val icon: @Composable () -> Unit
)

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AccessScreen(viewModel: MainViewModel, snackbar: SnackbarHostState? = null) {
    val state by viewModel.state.collectAsState()
    val scope = rememberCoroutineScope()

    val tiers = remember {
        listOf(
            TierInfo(5, "Xposed", "LSPosed / Vector — per-app DPI, font, metrics", AccessMode.ROOT,
                { Icon(Icons.Default.Security, contentDescription = null, tint = Color(0xFFF44336)) }),
            TierInfo(4, "Zygisk", "ZygiskNext — per-app renderer, spoof, Android ID", AccessMode.ROOT,
                { Icon(Icons.Default.SafetyDivider, contentDescription = null, tint = Color(0xFFFF9800)) }),
            TierInfo(3, "ROOT", "KernelSU / Magisk — all sysfs, resetprop, mount", AccessMode.ROOT,
                { Icon(Icons.Default.AdminPanelSettings, contentDescription = null, tint = Color(0xFF4CAF50)) }),
            TierInfo(2, "Shizuku", "ADB / Shizuku — density, font, brightness", AccessMode.SHIZUKU,
                { Icon(Icons.Default.Usb, contentDescription = null, tint = Color(0xFF2196F3)) }),
            TierInfo(1, "Non-ROOT", "Read-only: CPU, GPU, battery, thermal info", AccessMode.NON_ROOT,
                { Icon(Icons.Default.Visibility, contentDescription = null, tint = Color(0xFF9E9E9E)) }),
        )
    }

    val currentAccessMode = state.accessMode

    Column(modifier = Modifier.fillMaxSize().verticalScroll(rememberScrollState()).padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)) {

        Text("Access Level", style = MaterialTheme.typography.headlineMedium, fontWeight = FontWeight.Bold)
        Text("Tap a tier below to check if your device supports it.",
            style = MaterialTheme.typography.bodyMedium, color = MaterialTheme.colorScheme.onSurfaceVariant)

        tiers.forEach { tier ->
            val isActive = when (tier.mode) {
                AccessMode.ROOT -> currentAccessMode == AccessMode.ROOT && tier.level >= 3
                else -> currentAccessMode == tier.mode
            }
            val levelColor = when {
                isActive -> Color(0xFF4CAF50)
                tier.level <= 3 && currentAccessMode == AccessMode.ROOT -> Color(0xFF4CAF50).copy(alpha = 0.5f)
                else -> Color.Gray
            }

            Card(
                modifier = Modifier.fillMaxWidth().clickable {
                    if (!isActive) {
                        scope.launch {
                            viewModel.detectAccessMode()
                            snackbar?.showSnackbar("Access: ${com.farewell.kernelmanager.kernel.access.AccessManager.currentMode.name}")
                        }
                    }
                },
                shape = RoundedCornerShape(12.dp),
                colors = CardDefaults.cardColors(
                    containerColor = if (isActive) Color(0xFF1B5E20).copy(alpha = 0.15f)
                    else MaterialTheme.colorScheme.surface
                )
            ) {
                Row(modifier = Modifier.padding(16.dp), verticalAlignment = Alignment.CenterVertically) {
                    Box(modifier = Modifier.size(40.dp), contentAlignment = Alignment.Center) { tier.icon() }
                    Spacer(modifier = Modifier.width(12.dp))
                    Column(modifier = Modifier.weight(1f)) {
                        Text("${tier.level}. ${tier.name}", fontWeight = FontWeight.Bold, fontSize = 16.sp)
                        Text(tier.description, fontSize = 12.sp, color = MaterialTheme.colorScheme.onSurfaceVariant)
                    }
                    Spacer(modifier = Modifier.width(8.dp))
                    Icon(
                        if (isActive) Icons.Default.CheckCircle else Icons.Default.ArrowForwardIos,
                        contentDescription = null,
                        tint = levelColor,
                        modifier = Modifier.size(24.dp)
                    )
                }
            }
        }

        Spacer(modifier = Modifier.height(8.dp))
        Card(modifier = Modifier.fillMaxWidth()) {
            Row(modifier = Modifier.padding(16.dp), verticalAlignment = Alignment.CenterVertically) {
                Text("Current Access: ", fontWeight = FontWeight.SemiBold)
                Text(currentAccessMode.name,
                    color = when (currentAccessMode) {
                        AccessMode.ROOT -> Color(0xFF4CAF50)
                        AccessMode.SHIZUKU -> Color(0xFF2196F3)
                        AccessMode.NON_ROOT -> Color(0xFF9E9E9E)
                    },
                    fontWeight = FontWeight.Bold)
                Spacer(modifier = Modifier.weight(1f))
                Text("Root:${AccessManager.isRootAvailable()} Shizuku:${AccessManager.isShizukuAvailable()}",
                    fontSize = 11.sp, color = MaterialTheme.colorScheme.onSurfaceVariant)
            }
        }
    }
}
