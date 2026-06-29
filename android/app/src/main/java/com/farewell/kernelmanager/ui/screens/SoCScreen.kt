package com.farewell.kernelmanager.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.farewell.kernelmanager.ui.components.*
import com.farewell.kernelmanager.viewmodel.CPUViewModel
import com.farewell.kernelmanager.viewmodel.GPUViewModel

@Composable
fun SoCScreen(cpuVm: CPUViewModel = viewModel(), gpuVm: GPUViewModel = viewModel()) {
    val cpu by cpuVm.state.collectAsState()
    val gpu by gpuVm.state.collectAsState()
    var govDialog by remember { mutableIntStateOf(-1) }
    var coreExp by remember { mutableStateOf(false) }
    var gpuExp by remember { mutableStateOf(false) }

    LazyColumn(Modifier.fillMaxSize().padding(16.dp), verticalArrangement = Arrangement.spacedBy(12.dp)) {
        item { SectionHeader("CPU — ${cpu.clusters.size} Cluster(s) · ${cpu.cores.count{it.online}}/${cpu.cores.size} online") }

        cpu.clusters.forEachIndexed { ci, cluster ->
            val isBig = cluster.clusterNumber > 0
            item {
                TestParamCard(
                    if (isBig) Icons.Default.Speed else Icons.Default.Memory,
                    "C${ci} Gov ${if (isBig) "(Big)" else "(Little)"}",
                    cluster.governor,
                    testResult = cpuVm.lastTest["gov$ci"] ?: TestResult.Idle,
                    onTest = { cpuVm.testGovernor(cluster.governor) },
                    onClick = { govDialog = ci }
                )
            }
            item {
                TestParamCard(Icons.Default.ArrowUpward, "C${ci} Max Freq", "${cluster.maxFreq / 1000} MHz",
                    testResult = cpuVm.lastTest["freq$ci"] ?: TestResult.Idle,
                    onTest = { cpuVm.testFreqLimit() })
            }
            item {
                TestParamCard(Icons.Default.ArrowDownward, "C${ci} Min Freq", "${cluster.currentMinFreq / 1000} MHz",
                    testResult = cpuVm.lastTest["freq$ci"] ?: TestResult.Idle,
                    onTest = { cpuVm.testFreqLimit() })
            }
        }

        item {
            ExpandableCard(Icons.Default.Memory, "Cores (${cpu.cores.count{it.online}}/8)", coreExp, onClick = { coreExp = !coreExp }) {
                cpu.cores.forEach { core ->
                    TestSwitchCard(
                        if (core.online) Icons.Default.CheckCircle else Icons.Default.Cancel,
                        "Core ${core.core} @ ${core.freq/1000}MHz · Gov: ${core.governor.take(12)}",
                        core.online,
                        { cpuVm.setCoreOnline(core.core, it) },
                        testResult = cpuVm.lastTest["core${core.core}"] ?: TestResult.Idle,
                        onTest = { cpuVm.testCoreOnline(core.core) }
                    )
                }
            }
        }

        item { SectionHeader("GPU — ${gpu.model}") }
        item {
            TestParamCard(Icons.Default.GraphicEq, "GPU Freq", "${gpu.freq} MHz · Load ${gpu.busy}%",
                testResult = gpuVm.lastTest["freq"] ?: TestResult.Idle,
                onTest = { gpuVm.testFreq() })
        }
        item {
            TestParamCard(Icons.Default.Star, "Devfreq Gov", gpu.currentGovernor.ifEmpty { "default" },
                onTest = { gpuVm.testPowerLevels() })
        }
        item {
            ExpandableCard(Icons.Default.Tune, "GPU Tuning", gpuExp, onClick = { gpuExp = !gpuExp }) {
                TestSwitchCard(Icons.Default.Bolt, "Force Clock On", gpu.forceClk,
                    { gpuVm.setForce("force_clk_on", it) },
                    testResult = gpuVm.lastTest["force"] ?: TestResult.Idle,
                    onTest = { gpuVm.testForce() })
                TestSwitchCard(Icons.Default.Speed, "Force Bus On", gpu.forceBus,
                    { gpuVm.setForce("force_bus_on", it) })
                TestSwitchCard(Icons.Default.Speed, "Force Rail On", gpu.forceRail,
                    { gpuVm.setForce("force_rail_on", it) })
                TestParamCard(Icons.Default.Speed, "Pwr Levels", "${gpu.availableFreqs.firstOrNull()?:0}–${gpu.availableFreqs.lastOrNull()?:0} MHz")
            }
        }
    }

    // Governor selector dialog per cluster
    if (govDialog >= 0) {
        val ci = govDialog
        val cluster = cpu.clusters.getOrNull(ci)
        val governors = cluster?.availableGovernors ?: emptyList()
        AlertDialog(onDismissRequest = { govDialog = -1 },
            title = { Text("Cluster $ci Governor") },
            text = {
                Column {
                    governors.forEach { gov ->
                        TextButton(onClick = { cpuVm.setGovernor(ci, gov); govDialog = -1 }, modifier = Modifier.fillMaxWidth()) {
                            Text(gov, modifier = Modifier.weight(1f))
                            if (gov == cluster?.governor) Icon(Icons.Default.Check, "")
                        }
                    }
                }
            },
            confirmButton = { TextButton(onClick = { govDialog = -1 }) { Text("Close") } }
        )
    }
}
