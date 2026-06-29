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
import com.farewell.kernelmanager.kernel.NativeLib
import com.farewell.kernelmanager.ui.components.*
import com.farewell.kernelmanager.viewmodel.CPUViewModel
import com.farewell.kernelmanager.viewmodel.GPUViewModel

@Composable
fun SoCScreen(cpuVm: CPUViewModel = viewModel(), gpuVm: GPUViewModel = viewModel()) {
    val cpu by cpuVm.state.collectAsState()
    val gpu by gpuVm.state.collectAsState()
    var govDialog by remember { mutableIntStateOf(-1) }
    var coreExp by remember { mutableStateOf(false) }
    var advExp by remember { mutableStateOf(false) }
    var gpuExp by remember { mutableStateOf(false) }
    var freqMinVals = remember { mutableStateMapOf<Int, Float>() }
    var freqMaxVals = remember { mutableStateMapOf<Int, Float>() }

    LazyColumn(Modifier.fillMaxSize().padding(16.dp), verticalArrangement = Arrangement.spacedBy(10.dp)) {
        // ── CPU ──
        item { SectionHeader("CPU — ${cpu.clusters.size} clusters · ${cpu.cores.count{it.online}}/${cpu.cores.size} online") }

        cpu.clusters.forEachIndexed { ci, cl ->
            val tag = if (ci == 0) "Little" else "Big"
            item {
                TestParamCard(if (ci == 0) Icons.Default.Memory else Icons.Default.Speed, "C$ci $tag Governor", cl.governor,
                    testResult = cpuVm.lastTest["gov$ci"] ?: TestResult.Idle,
                    onTest = { cpuVm.testGovernor("performance") },
                    onClick = { govDialog = ci })
            }
            item {
                var mFreq by remember { mutableStateOf((cl.maxFreq / 1000).toFloat()) }
                SliderCard(Icons.Default.ArrowUpward, "C$ci Max Freq", mFreq.toInt(), 300f..3000f,
                    { mFreq = it; cpuVm.setFreqLimit(cl.cores.first(), cl.currentMinFreq, (it * 1000).toInt()) },
                    testResult = cpuVm.lastTest["freq${ci}hi"] ?: TestResult.Idle,
                    onTest = { cpuVm.testFreqLimit() }, suffix = " MHz")
            }
            item {
                var mMin by remember { mutableStateOf((cl.currentMinFreq / 1000).toFloat()) }
                val maxF = cpu.clusters.getOrNull(ci)?.maxFreq?.div(1000) ?: 2400
                SliderCard(Icons.Default.ArrowDownward, "C$ci Min Freq", mMin.toInt(), 300f..3000f,
                    { mMin = it; cpuVm.setFreqLimit(cl.cores.first(), (it * 1000).toInt(), maxF * 1000) },
                    testResult = cpuVm.lastTest["freq${ci}lo"] ?: TestResult.Idle,
                    onTest = { cpuVm.testFreqLimit() }, suffix = " MHz")
            }
        }

        // ── Core toggles ──
        item {
            ExpandableCard(Icons.Default.Memory, "Cores", coreExp, onClick = { coreExp = !coreExp }) {
                cpu.cores.forEach { core ->
                    TestSwitchCard(if (core.online) Icons.Default.CheckCircle else Icons.Default.Cancel,
                        "Core ${core.core} · ${core.freq / 1000}MHz · ${core.governor.take(10)}", core.online,
                        { cpuVm.setCoreOnline(core.core, it) },
                        testResult = cpuVm.lastTest["c$core"] ?: TestResult.Idle,
                        onTest = { cpuVm.testCoreOnline(core.core) })
                }
            }
        }

        // ── CPU Advanced ──
        item {
            ExpandableCard(Icons.Default.Tune, "CPU Advanced", advExp, onClick = { advExp = !advExp }) {
                TestParamCard(Icons.Default.Bolt, "Input Boost",
                    "${cpu.clusters.firstOrNull()?.let { cl -> try { NativeLib.readSysfsNative("/sys/devices/system/cpu/cpu_boost/input_boost_ms") } catch (_: Exception) { "?" } } ?: "?"}",
                    testResult = cpuVm.lastTest["boost"] ?: TestResult.Idle,
                    onTest = { cpuVm.testGovernor("schedutil") })
                TestParamCard(Icons.Default.Star, "Stune Boost",
                    try { NativeLib.readSysfsNative("/dev/stune/top-app/schedtune.boost") } catch (_: Exception) { "?" },
                    testResult = cpuVm.lastTest["stune"] ?: TestResult.Idle)
            }
        }

        // ── GPU ──
        item { SectionHeader("GPU — ${gpu.model}") }
        item {
            TestParamCard(Icons.Default.GraphicEq, "GPU Freq", "${gpu.freq} MHz · Load ${gpu.busy}%",
                testResult = gpuVm.lastTest["freq"] ?: TestResult.Idle,
                onTest = { gpuVm.testFreq() })
        }
        item { TestParamCard(Icons.Default.Star, "Devfreq Gov", gpu.currentGovernor.ifEmpty { "default" }) }

        item {
            ExpandableCard(Icons.Default.Tune, "GPU Tuning", gpuExp, onClick = { gpuExp = !gpuExp }) {
                TestSwitchCard(Icons.Default.Bolt, "Force Clock", gpu.forceClk, { gpuVm.setForce("force_clk_on", it) },
                    testResult = gpuVm.lastTest["fclk"] ?: TestResult.Idle, onTest = { gpuVm.testForce() })
                TestSwitchCard(Icons.Default.Speed, "Force Bus", gpu.forceBus, { gpuVm.setForce("force_bus_on", it) })
                TestSwitchCard(Icons.Default.Speed, "Force Rail", gpu.forceRail, { gpuVm.setForce("force_rail_on", it) })
                Spacer(Modifier.height(8.dp))
                TestParamCard(Icons.Default.Speed, "Pwr Levels",
                    "min=${gpu.availableFreqs.firstOrNull()?:0} max=${gpu.availableFreqs.lastOrNull()?:0} MHz",
                    testResult = gpuVm.lastTest["pwr"] ?: TestResult.Idle, onTest = { gpuVm.testPowerLevels() })
            }
        }
    }

    // Governor dialog
    if (govDialog >= 0) {
        val ci = govDialog
        val governors = cpu.clusters.getOrNull(ci)?.availableGovernors ?: emptyList()
        AlertDialog(onDismissRequest = { govDialog = -1 },
            title = { Text("Cluster $ci Governor") },
            text = { Column { governors.forEach { gov ->
                TextButton(onClick = { cpuVm.setGovernor(ci, gov); govDialog = -1 }, Modifier.fillMaxWidth()) {
                    Text(gov, Modifier.weight(1f)); if (gov == cpu.clusters.getOrNull(ci)?.governor) Icon(Icons.Default.Check, "")
                }
            } } },
            confirmButton = { TextButton(onClick = { govDialog = -1 }) { Text("Close") } }
        )
    }
}
