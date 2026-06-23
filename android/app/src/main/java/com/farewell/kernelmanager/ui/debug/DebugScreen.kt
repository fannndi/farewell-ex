package com.farewell.kernelmanager.ui.debug

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.farewell.kernelmanager.viewmodel.MainViewModel

private val BgLog = Color(0xFF1A1A2E)
private val GreenLog = Color(0xFF4CAF50)
private val RedLog = Color(0xFFF44336)
private val YellowLog = Color(0xFFFFC107)
private val WhiteLog = Color(0xFFE0E0E0)

@Composable
fun DebugScreen(mainVm: MainViewModel) {
    val debugVm: DebugViewModel = viewModel()
    val state by debugVm.state.collectAsState()
    val mainState by mainVm.state.collectAsState()

    Column(modifier = Modifier.fillMaxSize().padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)) {

        Text("Debug Diagnostic", style = MaterialTheme.typography.headlineMedium, fontWeight = FontWeight.Bold)
        Text("Test all features per tier. Log exported to /sdcard/root.log",
            style = MaterialTheme.typography.bodySmall, color = MaterialTheme.colorScheme.onSurfaceVariant)

        Card(modifier = Modifier.fillMaxWidth()) {
            Column(modifier = Modifier.padding(16.dp), verticalArrangement = Arrangement.spacedBy(8.dp)) {
                Text("Run by Tier", fontWeight = FontWeight.Bold)
                Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                    Button(
                        onClick = { debugVm.runDiagnostic("ksu") },
                        enabled = !state.isLoading,
                        modifier = Modifier.weight(1f),
                        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF4CAF50))
                    ) { Text("Root KSU") }
                    Button(
                        onClick = { debugVm.runDiagnostic("zygisk") },
                        enabled = !state.isLoading,
                        modifier = Modifier.weight(1f),
                        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFFF9800))
                    ) { Text("Zygisk") }
                    Button(
                        onClick = { debugVm.runDiagnostic("lsposed") },
                        enabled = !state.isLoading,
                        modifier = Modifier.weight(1f),
                        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFF44336))
                    ) { Text("LSPosed") }
                }
            }
        }

        if (state.isLoading) {
            Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically) {
                CircularProgressIndicator(modifier = Modifier.size(16.dp), strokeWidth = 2.dp)
                Spacer(modifier = Modifier.width(8.dp))
                Text("Running diagnostic...", style = MaterialTheme.typography.bodySmall)
            }
        }

        Card(
            modifier = Modifier.fillMaxWidth().weight(1f),
            shape = RoundedCornerShape(12.dp),
            colors = CardDefaults.cardColors(containerColor = BgLog)
        ) {
            if (state.log.isEmpty()) {
                Box(modifier = Modifier.fillMaxSize().padding(16.dp), contentAlignment = Alignment.Center) {
                    Text("No diagnostic output yet.\nTap a tier button above to run.",
                        color = WhiteLog.copy(alpha = 0.5f), lineHeight = 20.sp)
                }
            } else {
                Column(modifier = Modifier.verticalScroll(rememberScrollState()).padding(12.dp),
                    verticalArrangement = Arrangement.spacedBy(1.dp)) {
                    state.log.lines().forEach { line ->
                        val lineColor = when {
                            line.contains("[PASS]") || line.contains("===") && line.contains("PASS") -> GreenLog
                            line.contains("[FAIL]") -> RedLog
                            line.contains("[E]") -> RedLog
                            line.contains("[W]") -> YellowLog
                            else -> WhiteLog
                        }
                        Text(
                            text = line,
                            color = lineColor,
                            fontSize = 11.sp,
                            fontFamily = FontFamily.Monospace,
                            lineHeight = 16.sp
                        )
                    }
                }
            }
        }

        if (state.log.isNotEmpty()) {
            val passCount = state.log.lines().count { it.contains("[PASS]") }
            val totalCount = state.log.lines().count { it.contains("[PASS]") || it.contains("[FAIL]") }
            val rate = if (totalCount > 0) (passCount * 100 / totalCount) else 0

            Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically) {
                Text("$passCount/$totalCount PASS ($rate%)", fontWeight = FontWeight.Bold,
                    color = if (rate >= 80) GreenLog else if (rate >= 50) YellowLog else RedLog)
                TextButton(onClick = { debugVm.readLog() }) {
                    Text("Refresh Log")
                }
            }
        }
    }
}
