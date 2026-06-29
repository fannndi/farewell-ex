package com.farewell.kernelmanager.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.farewell.kernelmanager.kernel.FarewellDaemon
import com.farewell.kernelmanager.kernel.NativeLib
import com.farewell.kernelmanager.ui.components.ParamCard
import com.farewell.kernelmanager.ui.components.SectionHeader
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

@Composable
fun DaemonScreen() {
    val scope = rememberCoroutineScope()
    var connected by remember { mutableStateOf(false) }
    var status by remember { mutableStateOf("Checking...") }
    var kernelInfo by remember { mutableStateOf("") }
    val paths = remember { mutableStateListOf<FarewellDaemon.PathInfo>() }
    val checking = remember { mutableStateOf(false) }

    val testPaths = listOf(
        "CPU Governor" to "/sys/devices/system/cpu/cpu0/cpufreq/scaling_governor",
        "CPU Max Freq" to "/sys/devices/system/cpu/cpu0/cpufreq/scaling_max_freq",
        "CPU Min Freq" to "/sys/devices/system/cpu/cpu0/cpufreq/scaling_min_freq",
        "CPU Online" to "/sys/devices/system/cpu/cpu0/online",
        "GPU Freq" to "/sys/class/kgsl/kgsl-3d0/gpuclk",
        "GPU Model" to "/sys/kernel/gpu/gpu_model",
        "GPU Busy" to "/sys/class/kgsl/kgsl-3d0/gpubusy",
        "GPU Pwr Level" to "/sys/class/kgsl/kgsl-3d0/max_pwrlevel",
        "Battery Capacity" to "/sys/class/power_supply/battery/capacity",
        "Battery Status" to "/sys/class/power_supply/battery/status",
        "Thermal SConfig" to "/sys/class/thermal/thermal_message/sconfig",
        "Stune Boost" to "/dev/stune/top-app/schedtune.boost",
        "TCP Congestion" to "/proc/sys/net/ipv4/tcp_congestion_control",
        "Swappiness" to "/proc/sys/vm/swappiness",
        "Sched Bore" to "/proc/sys/kernel/sched_bore",
        "WireGuard" to "/sys/module/wireguard/version",
        "Kcal" to "/sys/devices/platform/kcal_ctrl.0/kcal",
        "DFPS" to "/sys/devices/virtual/graphics/fb0/dyn_pu",
    )

    fun doCheckAll() {
        scope.launch {
            connected = FarewellDaemon.connect()
            status = if (connected) "Daemon Connected ✅" else "No Daemon (ADB hanya monitoring)"
            kernelInfo = withContext(Dispatchers.IO) {
                NativeLib.readSysfsNative("/proc/version").take(60)
            }
            checking.value = true
            paths.clear()
            for ((name, path) in testPaths) {
                val resp = FarewellDaemon.check(path)
                paths.add(FarewellDaemon.PathInfo(path, resp, resp.contains("rw")))
            }
            checking.value = false
        }
    }

    LaunchedEffect(Unit) { doCheckAll() }

    LazyColumn(Modifier.fillMaxSize().padding(16.dp), verticalArrangement = Arrangement.spacedBy(10.dp)) {
        item {
            Card(Modifier.fillMaxWidth(), colors = CardDefaults.cardColors(
                containerColor = if (connected) Color(0xFFE8F5E9) else Color(0xFFFFF3E0)
            )) {
                Row(Modifier.padding(16.dp), verticalAlignment = Alignment.CenterVertically) {
                    Icon(if (connected) Icons.Default.CheckCircle else Icons.Default.Warning, "",
                        tint = if (connected) Color(0xFF4CAF50) else Color(0xFFFF9800))
                    Spacer(Modifier.width(12.dp))
                    Column {
                        Text(status, fontWeight = androidx.compose.ui.text.font.FontWeight.Bold)
                        Text(kernelInfo, fontSize = 11.sp, color = MaterialTheme.colorScheme.onSurfaceVariant)
                    }
                }
            }
        }

        item { SectionHeader("Kernel Path Check") }

        if (checking.value) {
            item { LinearProgressIndicator(Modifier.fillMaxWidth()) }
        }

        items(testPaths.size) { i ->
            val (name, path) = testPaths[i]
            val info = paths.getOrNull(i)
            val icon = when {
                info == null -> Icons.Default.HourglassEmpty
                info.writable -> Icons.Default.CheckCircle
                info.status.contains("EXISTS") -> Icons.Default.Lock
                else -> Icons.Default.Cancel
            }
            val color = when {
                info == null -> MaterialTheme.colorScheme.onSurfaceVariant
                info.writable -> Color(0xFF4CAF50)
                info.status.contains("EXISTS") -> Color(0xFFFF9800)
                else -> Color(0xFFF44336)
            }
            ParamCard(icon, name, info?.status ?: "...", onClick = null,
                modifier = Modifier.padding(vertical = 2.dp))
        }

        item {
            Spacer(Modifier.height(8.dp))
            Button(onClick = { doCheckAll() }, Modifier.fillMaxWidth()) {
                Icon(Icons.Default.Refresh, "")
                Spacer(Modifier.width(8.dp))
                Text("Refresh Check")
            }
        }
    }
}
