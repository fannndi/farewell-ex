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
import com.farewell.kernelmanager.kernel.NativeLib
import com.farewell.kernelmanager.kernel.AccessManager
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import com.farewell.kernelmanager.ui.components.*

@Composable
fun SoCScreen() {
    val scope = rememberCoroutineScope()
    var freqMin by remember { mutableIntStateOf(300000) }
    var freqMax by remember { mutableIntStateOf(2400000) }
    var governor by remember { mutableStateOf("") }
    val coreOnline = remember { mutableStateListOf(*Array(8) { true }) }
    var gpuPwr by remember { mutableIntStateOf(0) }
    var adrenoboost by remember { mutableIntStateOf(0) }

    // Test results
    val tr = remember { mutableStateMapOf<String, TestResult>() }

    fun test(key: String, block: suspend () -> Boolean) {
        scope.launch {
            tr[key] = TestResult.Loading
            val ok = withContext(Dispatchers.IO) { block() }
            tr[key] = if (ok) TestResult.Pass() else TestResult.Fail("write failed")
        }
    }

    LaunchedEffect(Unit) {
        withContext(Dispatchers.IO) {
            governor = AccessManager.readFile("/sys/devices/system/cpu/cpu0/cpufreq/scaling_governor")
            freqMin = AccessManager.readFile("/sys/devices/system/cpu/cpu0/cpufreq/scaling_min_freq").toIntOrNull() ?: 300000
            freqMax = AccessManager.readFile("/sys/devices/system/cpu/cpu0/cpufreq/scaling_max_freq").toIntOrNull() ?: 2400000
            for (i in 0 until 8) {
                val o = AccessManager.readFile("/sys/devices/system/cpu/cpu$i/online")
                coreOnline[i] = o == "1"
            }
        }
    }

    LazyColumn(Modifier.fillMaxSize().padding(16.dp), verticalArrangement = Arrangement.spacedBy(12.dp)) {
        item { SectionHeader("CPU Control") }

        item {
            TestParamCard(Icons.Default.Speed, "Governor", governor,
                tr["governor"] ?: TestResult.Idle,
                onTest = { test("governor") { NativeLib.setGovernorNative("performance") == 1 } })
        }
        item {
            SliderCard(Icons.Default.ArrowUpward, "Max Freq", freqMax / 1000, 300f..3000f,
                { scope.launch { NativeLib.setFreqLimitNative(0, freqMin, (it * 1000).toInt()); freqMax = (it * 1000).toInt() } },
                tr["freq_max"] ?: TestResult.Idle,
                onTest = { test("freq_max") { NativeLib.setFreqLimitNative(0, freqMin, freqMax) == 1 } }, suffix = " MHz")
        }
        item {
            SliderCard(Icons.Default.ArrowDownward, "Min Freq", freqMin / 1000, 300f..3000f,
                { scope.launch { NativeLib.setFreqLimitNative(0, (it * 1000).toInt(), freqMax); freqMin = (it * 1000).toInt() } },
                tr["freq_min"] ?: TestResult.Idle,
                onTest = { test("freq_min") { NativeLib.setFreqLimitNative(0, freqMin, freqMax) == 1 } }, suffix = " MHz")
        }

        item {
            ExpandableCard(Icons.Default.Memory, "CPU Cores", false, onClick = {},
                content = {
                    for (i in 0 until 8) {
                        TestSwitchCard(if (coreOnline[i]) Icons.Default.CheckCircle else Icons.Default.Cancel,
                            "Core $i", coreOnline[i],
                            { scope.launch { NativeLib.setCoreOnlineNative(i, it); coreOnline[i] = it } },
                            tr["core_$i"] ?: TestResult.Idle,
                            onTest = { test("core_$i") { NativeLib.setCoreOnlineNative(i, !coreOnline[i]) == 1 } })
                    }
                })
        }

        item { SectionHeader("GPU Control") }
        item {
            SliderCard(Icons.Default.GraphicEq, "Max Power Level", gpuPwr, 0f..3f,
                { scope.launch { NativeLib.setGpuPowerLevelsNative(it.toInt(), gpuPwr); gpuPwr = it.toInt() } },
                tr["gpu_pwr"] ?: TestResult.Idle,
                onTest = { test("gpu_pwr") { NativeLib.setGpuPowerLevelsNative(0, 3) == 1 } }, suffix = "/3")
        }
        item {
            SliderCard(Icons.Default.Bolt, "Adrenoboost", adrenoboost, 0f..3f,
                { scope.launch { NativeLib.setAdrenoboostNative(it.toInt()); adrenoboost = it.toInt() } },
                tr["adreno"] ?: TestResult.Idle,
                onTest = { test("adreno") { NativeLib.setAdrenoboostNative(2) == 1 } }, suffix = "/3")
        }
    }
}
