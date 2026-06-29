package com.farewell.kernelmanager.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.farewell.kernelmanager.kernel.NativeLib
import com.farewell.kernelmanager.ui.components.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

data class KernelState(
    val printk: String = "",
    val tcpCongestion: String = "",
    val availableTcp: List<String> = emptyList(),
    val schedAutogroup: Boolean = false,
    val dmesgRestrict: Boolean = false,
    val wireguardVersion: String = "",
    val kernelVersion: String = "",
    val isLoading: Boolean = true,
)

@Composable
fun KernelScreen() {
    var state by remember { mutableStateOf(KernelState()) }
    var expanded by remember { mutableStateOf(false) }
    var tcpDialog by remember { mutableStateOf(false) }

    LaunchedEffect(Unit) {
        withContext(Dispatchers.IO) {
            val nl = if (NativeLib.isAvailable()) NativeLib else null
            state = KernelState(
                printk = nl?.getPrintkNative() ?: "",
                tcpCongestion = NativeLib.readSysfsNative("/proc/sys/net/ipv4/tcp_congestion_control").takeIf { it.isNotEmpty() } ?: "unknown",
                availableTcp = NativeLib.readSysfsNative("/proc/sys/net/ipv4/tcp_available_congestion_control").takeIf { it.isNotEmpty() }?.split(" ".toRegex())?.map { it.trim() }?.filter { it.isNotEmpty() } ?: emptyList(),
                wireguardVersion = nl?.getWireguardVersionNative() ?: "",
                kernelVersion = NativeLib.readSysfsNative("/proc/version")?.substringBefore(" (")?.substringAfter("Linux version ") ?: "",
                isLoading = false,
            )
        }
    }

    LazyColumn(modifier = Modifier.fillMaxSize().padding(16.dp), verticalArrangement = Arrangement.spacedBy(12.dp)) {
        item {
            SectionHeader("Kernel Parameters")
            ParamCard(Icons.Default.Info, "Kernel Version", state.kernelVersion, onClick = null)
            if (state.wireguardVersion.isNotEmpty()) {
                ParamCard(Icons.Default.Security, "WireGuard", state.wireguardVersion)
            }
        }
        item {
            ExpandableCard(Icons.Default.Tune, "Network & Debug", expanded, onClick = { expanded = !expanded }) {
                Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
                    SwitchCard(Icons.Default.Lock, "Dmesg Restrict", state.dmesgRestrict, {})
                    SwitchCard(Icons.Default.AccountTree, "Sched Autogroup", state.schedAutogroup, {})
                    ParamCard(Icons.Default.SpeakerNotes, "Printk", state.printk)
                    ParamCard(Icons.Default.SwapHoriz, "TCP Congestion", state.tcpCongestion, onClick = { tcpDialog = true })
                }
            }
        }
    }

    if (tcpDialog) {
        AlertDialog(
            onDismissRequest = { tcpDialog = false },
            title = { Text("TCP Congestion") },
            text = {
                if (state.availableTcp.isNotEmpty()) {
                    Column { state.availableTcp.forEach { algo -> Text(algo) } }
                } else Text("No alternatives available")
            },
            confirmButton = { TextButton(onClick = { tcpDialog = false }) { Text("Close") } }
        )
    }
}
