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
import com.farewell.kernelmanager.kernel.access.AccessMode
import com.farewell.kernelmanager.ui.components.*
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
            ParamCard(Icons.Default.Speed, "CPU Load", "${String.format("%.1f", mainState.cpuLoad)}%", Modifier.weight(1f))
            ParamCard(Icons.Default.Thermostat, "CPU Temp", "${String.format("%.1f", mainState.cpuTemp)}°C", Modifier.weight(1f))
        }

        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(12.dp)) {
            ParamCard(Icons.Default.Memory, "GPU", "${mainState.gpuFreq} MHz", Modifier.weight(1f))
            ParamCard(Icons.Default.Speed, "GPU Load", "${mainState.gpuLoad}%", Modifier.weight(1f))
        }

        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(12.dp)) {
            ParamCard(if (mainState.isCharging) Icons.Default.BatteryChargingFull else Icons.Default.BatteryFull,
                "Battery", "${mainState.batteryLevel}%", Modifier.weight(1f))
            ParamCard(Icons.Default.Storage, "RAM", "${mainState.ramUsedMb}/${mainState.ramTotalMb} MB", Modifier.weight(1f))
        }

        Card(modifier = Modifier.fillMaxWidth(), shape = MaterialTheme.shapes.large,
            colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceBright)) {
            Column(modifier = Modifier.padding(16.dp), verticalArrangement = Arrangement.spacedBy(4.dp)) {
                Text("Device Info", fontWeight = FontWeight.Bold)
                Text("Model: ${mainState.deviceModel}", style = MaterialTheme.typography.bodySmall)
                Text("Name: ${mainState.deviceName}", style = MaterialTheme.typography.bodySmall)
                Text("SoC: ${mainState.soc}", style = MaterialTheme.typography.bodySmall)
                Text("GPU: ${mainState.gpuModel} (${mainState.gpuGmem}MB)", style = MaterialTheme.typography.bodySmall)
                Text("Android: ${mainState.androidVersion}", style = MaterialTheme.typography.bodySmall)
                Text("ABI: ${mainState.abis}", style = MaterialTheme.typography.bodySmall)
                Text("Panel: ${mainState.panelName}", style = MaterialTheme.typography.bodySmall)
                Text("Battery: ${mainState.batteryTech} ${mainState.batteryCycleCount}cyc ${mainState.batteryStatus}/${mainState.batteryHealth}", style = MaterialTheme.typography.bodySmall)
            }
        }

        HorizontalDivider()
        SectionHeader("Tuning Controls")

        if (!isRoot) {
            Card(modifier = Modifier.fillMaxWidth(), colors = CardDefaults.cardColors(containerColor = Color(0xFFFFF3E0))) {
                Row(modifier = Modifier.padding(16.dp), verticalAlignment = Alignment.CenterVertically) {
                    Icon(Icons.Default.Lock, contentDescription = null, tint = Color(0xFFFF9800))
                    Spacer(modifier = Modifier.width(8.dp))
                    Text("Most tuning requires ROOT. Go to Tier Access tab.", fontSize = 13.sp, color = Color(0xFFE65100))
                }
            }
        }

        ExpandableCard(Icons.Default.Memory, "CPU Control", expanded == "cpu", { expanded = if (expanded == "cpu") "" else "cpu" }) {
            CPUContent(cpuVm, cpuState, snackbar)
        }
        ExpandableCard(Icons.Default.GraphicEq, "GPU Control", expanded == "gpu", { expanded = if (expanded == "gpu") "" else "gpu" }) {
            GPUContent(gpuVm, gpuState, snackbar)
        }
        ExpandableCard(Icons.Default.Storage, "Memory & ZRAM", expanded == "mem", { expanded = if (expanded == "mem") "" else "mem" }) {
            MemoryContent(memVm, memState, snackbar)
        }
        ExpandableCard(Icons.Default.Thermostat, "Thermal", expanded == "thermal", { expanded = if (expanded == "thermal") "" else "thermal" }) {
            ThermalContent(thermalState, onSetPreset = { thermalVm.setPreset(it) })
        }
        ExpandableCard(Icons.Default.BatteryFull, "Battery", expanded == "battery", { expanded = if (expanded == "battery") "" else "battery" }) {
            BatteryContent(batteryState, onToggleBypass = { batteryVm.toggleBypass(it) })
        }
        ExpandableCard(Icons.Default.SportsEsports, "Game Mode", expanded == "game", { expanded = if (expanded == "game") "" else "game" }) {
            GameContent(gameState,
                onSetPreset = { gameVm.setPreset(it) },
                onToggleDnd = { gameVm.toggleDnd() },
                onSetAdrenoboost = { gameVm.setAdrenoboost(it) },
                onClearRam = { gameVm.clearRam() },
                onToggleGameDetect = { gameVm.toggleGameDetect(it) })
        }
    }
}
