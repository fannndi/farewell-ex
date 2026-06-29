package com.farewell.kernelmanager.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
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
    var govExp by remember { mutableStateOf(false) }
    var coreExp by remember { mutableStateOf(false) }
    var gpuExp by remember { mutableStateOf(false) }

    LazyColumn(Modifier.fillMaxSize().padding(16.dp), verticalArrangement = Arrangement.spacedBy(12.dp)) {
        item { SectionHeader("CPU") }
        item {
            val cluster = cpu.clusters.firstOrNull()
            val governors = cluster?.availableGovernors ?: emptyList()
            var selected by remember { mutableStateOf(cluster?.governor ?: "") }

            TestParamCard(Icons.Default.Speed, "Governor", cluster?.governor ?: "?",
                testResult = cpuVm.lastTest["gov"] ?: TestResult.Idle,
                onTest = { cpuVm.testGovernor() },
                onClick = if (governors.isNotEmpty()) {{ govExp = true }} else null)
        }
        item {
            val c = cpu.clusters.firstOrNull()
            TestParamCard(Icons.Default.ArrowUpward, "Max Freq", "${c?.maxFreq?.div(1000) ?: 0} MHz",
                testResult = cpuVm.lastTest["freq"] ?: TestResult.Idle,
                onTest = { cpuVm.testFreqLimit() })
        }
        item {
            val c = cpu.clusters.firstOrNull()
            TestParamCard(Icons.Default.ArrowDownward, "Min Freq", "${c?.currentMinFreq?.div(1000) ?: 0} MHz",
                testResult = cpuVm.lastTest["freq"] ?: TestResult.Idle,
                onTest = { cpuVm.testFreqLimit() })
        }
        item {
            ExpandableCard(Icons.Default.Memory, "Cores (${cpu.cores.count{it.online}}/8)", coreExp, onClick = { coreExp = !coreExp }) {
                cpu.cores.forEach { core ->
                    TestSwitchCard(if (core.online) Icons.Default.CheckCircle else Icons.Default.Cancel,
                        "Core ${core.core} | ${core.freq/1000}MHz", core.online,
                        { cpuVm.setCoreOnline(core.core, it) },
                        testResult = cpuVm.lastTest["core${core.core}"] ?: TestResult.Idle,
                        onTest = { cpuVm.testCoreOnline(core.core) })
                }
            }
        }

        item { SectionHeader("GPU") }
        item {
            TestParamCard(Icons.Default.GraphicEq, "Freq", "${gpu.freq} MHz",
                testResult = gpuVm.lastTest["freq"] ?: TestResult.Idle,
                onTest = { gpuVm.testFreq() })
        }
        item {
            ExpandableCard(Icons.Default.Tune, "GPU Tuning", gpuExp, onClick = { gpuExp = !gpuExp }) {
                TestSwitchCard(Icons.Default.Bolt, "Force Clock", gpu.forceClk,
                    { gpuVm.setForce("force_clk_on", it) },
                    testResult = gpuVm.lastTest["force"] ?: TestResult.Idle,
                    onTest = { gpuVm.testForce() })
                TestParamCard(Icons.Default.Star, "Devfreq Gov", gpu.currentGovernor.ifEmpty { "default" })
                TestParamCard(Icons.Default.Speed, "Pwr Levels", "min=${gpu.availableFreqs.firstOrNull()?:0} max=${gpu.availableFreqs.lastOrNull()?:0}")
            }
        }
    }

    // Governor selector dialog
    if (govExp) {
        val cluster = cpu.clusters.firstOrNull()
        val governors = cluster?.availableGovernors ?: emptyList()
        AlertDialog(onDismissRequest = { govExp = false },
            title = { Text("Select Governor") },
            text = {
                Column {
                    governors.forEach { gov ->
                        TextButton(onClick = { cpuVm.setGovernor(0, gov); govExp = false }, modifier = Modifier.fillMaxWidth()) {
                            Text(gov, modifier = Modifier.weight(1f))
                            if (gov == cluster?.governor) Icon(Icons.Default.Check, "selected")
                        }
                    }
                }
            },
            confirmButton = { TextButton(onClick = { govExp = false }) { Text("Cancel") } }
        )
    }
}
