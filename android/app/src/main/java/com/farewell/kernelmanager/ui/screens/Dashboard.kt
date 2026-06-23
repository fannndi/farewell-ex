package com.farewell.kernelmanager.ui.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.farewell.kernelmanager.kernel.AccessMode
import com.farewell.kernelmanager.viewmodel.*

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(
    mainState: DashboardState,
    cpuVm: CPUViewModel, gpuVm: GPUViewModel, memVm: MemoryViewModel,
    thermalVm: ThermalViewModel, batteryVm: BatteryViewModel, gameVm: GameViewModel,
    snackbar: SnackbarHostState? = null
) {
    val isRoot = mainState.accessMode == AccessMode.ROOT
    var expanded by remember { mutableStateOf("") }
    val cpuState by cpuVm.state.collectAsState()
    val gpuState by gpuVm.state.collectAsState()
    val memState by memVm.state.collectAsState()
    val thermalState by thermalVm.state.collectAsState()
    val batteryState by batteryVm.state.collectAsState()
    val gameState by gameVm.state.collectAsState()

    Column(modifier = Modifier.fillMaxSize().verticalScroll(rememberScrollState()).padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)) {

        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(12.dp)) {
            InfoCard("CPU Load", "${String.format("%.1f", mainState.cpuLoad)}%", Icons.Default.Speed, Modifier.weight(1f))
            InfoCard("CPU Temp", "${String.format("%.1f", mainState.cpuTemp)}°C", Icons.Default.Thermostat, Modifier.weight(1f))
        }

        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(12.dp)) {
            InfoCard("GPU", "${mainState.gpuFreq} MHz", Icons.Default.Memory, Modifier.weight(1f))
            InfoCard("GPU Load", "${mainState.gpuLoad}%", Icons.Default.Speed, Modifier.weight(1f))
        }

        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(12.dp)) {
            InfoCard("Battery", "${mainState.batteryLevel}%",
                if (mainState.isCharging) Icons.Default.BatteryChargingFull else Icons.Default.BatteryFull, Modifier.weight(1f))
            InfoCard("RAM", "${mainState.ramUsedMb}/${mainState.ramTotalMb} MB", Icons.Default.Storage, Modifier.weight(1f))
        }

        Card(modifier = Modifier.fillMaxWidth()) {
            Column(modifier = Modifier.padding(16.dp), verticalArrangement = Arrangement.spacedBy(4.dp)) {
                Text("Device Info", fontWeight = FontWeight.Bold)
                Text("Model: ${mainState.deviceModel}", style = MaterialTheme.typography.bodySmall)
                Text("SoC: ${mainState.soc}", style = MaterialTheme.typography.bodySmall)
                Text("Android: ${mainState.androidVersion}", style = MaterialTheme.typography.bodySmall)
            }
        }

        HorizontalDivider()
        Text("Tuning Controls", fontWeight = FontWeight.Bold, style = MaterialTheme.typography.titleMedium)

        if (!isRoot) {
            Card(modifier = Modifier.fillMaxWidth(), colors = CardDefaults.cardColors(containerColor = Color(0xFFFFF3E0))) {
                Row(modifier = Modifier.padding(16.dp), verticalAlignment = Alignment.CenterVertically) {
                    Icon(Icons.Default.Lock, contentDescription = null, tint = Color(0xFFFF9800))
                    Spacer(modifier = Modifier.width(8.dp))
                    Text("Most tuning requires ROOT. Go to Access tab to check.", fontSize = 13.sp, color = Color(0xFFE65100))
                }
            }
        }

        TuningSection("CPU Control", isRoot, expanded == "cpu", { expanded = if (expanded == "cpu") "" else "cpu" }) {
            CPUContent(cpuVm, cpuState, snackbar)
        }
        TuningSection("GPU Control", isRoot, expanded == "gpu", { expanded = if (expanded == "gpu") "" else "gpu" }) {
            GPUContent(gpuVm, gpuState, snackbar)
        }
        TuningSection("Memory & ZRAM", isRoot, expanded == "mem", { expanded = if (expanded == "mem") "" else "mem" }) {
            MemoryContent(memVm, memState, snackbar)
        }
        TuningSection("Thermal", isRoot, expanded == "thermal", { expanded = if (expanded == "thermal") "" else "thermal" }) {
            ThermalContent(thermalState, onSetPreset = { thermalVm.setPreset(it) })
        }
        TuningSection("Battery", isRoot, expanded == "battery", { expanded = if (expanded == "battery") "" else "battery" }) {
            BatteryContent(batteryState, onToggleBypass = { batteryVm.toggleBypass(it) })
        }
        TuningSection("Game Mode", isRoot, expanded == "game", { expanded = if (expanded == "game") "" else "game" }) {
            GameContent(gameState,
                onSetPreset = { gameVm.setPreset(it) },
                onToggleDnd = { gameVm.toggleDnd() },
                onSetAdrenoboost = { gameVm.setAdrenoboost(it) },
                onClearRam = { gameVm.clearRam() },
                onToggleGameDetect = { gameVm.toggleGameDetect(it) })
        }
    }
}

@Composable
fun TuningSection(title: String, unlocked: Boolean, expanded: Boolean, onToggle: () -> Unit, content: @Composable () -> Unit) {
    Card(modifier = Modifier.fillMaxWidth().clickable(enabled = unlocked, onClick = onToggle)) {
        Column {
            Row(modifier = Modifier.padding(16.dp), horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    if (!unlocked) {
                        Icon(Icons.Default.Lock, contentDescription = null, tint = Color.Gray, modifier = Modifier.padding(end = 8.dp))
                    }
                    Text(title, fontWeight = FontWeight.SemiBold, color = if (unlocked) MaterialTheme.colorScheme.onSurface else Color.Gray)
                }
                if (unlocked) {
                    Icon(if (expanded) Icons.Default.ExpandLess else Icons.Default.ExpandMore, contentDescription = null)
                }
            }
            if (expanded && unlocked) {
                Box(modifier = Modifier.padding(start = 8.dp, end = 8.dp, bottom = 8.dp)) {
                    content()
                }
            }
        }
    }
}

@Composable
fun InfoCard(title: String, value: String, icon: ImageVector, modifier: Modifier = Modifier) {
    Card(modifier = modifier) {
        Column(modifier = Modifier.padding(16.dp), horizontalAlignment = Alignment.CenterHorizontally) {
            Icon(icon, contentDescription = null, tint = MaterialTheme.colorScheme.primary)
            Spacer(modifier = Modifier.height(8.dp))
            Text(title, style = MaterialTheme.typography.bodySmall)
            Text(value, style = MaterialTheme.typography.titleMedium, fontWeight = FontWeight.Bold)
        }
    }
}
