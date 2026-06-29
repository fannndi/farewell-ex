package com.farewell.kernelmanager.ui.components

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

sealed class TestResult {
    object Idle : TestResult()
    object Loading : TestResult()
    data class Pass(val msg: String = "OK") : TestResult()
    data class Fail(val msg: String = "Error") : TestResult()
}

@Composable
fun TestResultWidget(result: TestResult) {
    when (result) {
        is TestResult.Idle -> {}
        is TestResult.Loading -> CircularProgressIndicator(modifier = Modifier.size(16.dp), strokeWidth = 2.dp)
        is TestResult.Pass -> Text("✅ ${result.msg}", style = MaterialTheme.typography.bodySmall, color = Color(0xFF4CAF50))
        is TestResult.Fail -> Text("❌ ${result.msg}", style = MaterialTheme.typography.bodySmall, color = Color(0xFFF44336))
    }
}

@Composable
fun ParamCard(
    icon: ImageVector, title: String, value: String,
    modifier: Modifier = Modifier, onClick: (() -> Unit)? = null
) {
    Card(
        modifier = modifier.then(if (onClick != null) Modifier.clickable { onClick() } else Modifier),
        shape = RoundedCornerShape(24.dp),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceBright)
    ) {
        Row(modifier = Modifier.padding(16.dp).fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
            Box(modifier = Modifier.clip(CircleShape).size(40.dp).padding(8.dp), contentAlignment = Alignment.Center) {
                Icon(icon, contentDescription = null, tint = MaterialTheme.colorScheme.primary)
            }
            Spacer(Modifier.width(12.dp))
            Text(title, style = MaterialTheme.typography.titleMedium, modifier = Modifier.weight(1f))
            Text(value, style = MaterialTheme.typography.bodyMedium, color = MaterialTheme.colorScheme.onSurfaceVariant)
        }
    }
}

@Composable
fun SwitchCard(
    icon: ImageVector, title: String, checked: Boolean,
    onCheckedChange: (Boolean) -> Unit, modifier: Modifier = Modifier
) {
    Card(modifier = modifier, shape = RoundedCornerShape(24.dp),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceBright)
    ) {
        Row(modifier = Modifier.padding(16.dp).fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
            Box(modifier = Modifier.clip(CircleShape).size(40.dp).padding(8.dp), contentAlignment = Alignment.Center) {
                Icon(icon, contentDescription = null, tint = MaterialTheme.colorScheme.primary)
            }
            Spacer(Modifier.width(12.dp))
            Text(title, modifier = Modifier.weight(1f))
            Switch(checked = checked, onCheckedChange = onCheckedChange)
        }
    }
}

@Composable
fun TestParamCard(
    icon: ImageVector, title: String, value: String,
    testResult: TestResult = TestResult.Idle,
    onTest: (() -> Unit)? = null,
    modifier: Modifier = Modifier, onClick: (() -> Unit)? = null
) {
    Card(
        modifier = modifier.then(if (onClick != null) Modifier.clickable { onClick() } else Modifier),
        shape = RoundedCornerShape(24.dp),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceBright)
    ) {
        Row(modifier = Modifier.padding(16.dp).fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
            Box(modifier = Modifier.clip(CircleShape).size(40.dp).padding(8.dp), contentAlignment = Alignment.Center) {
                Icon(icon, contentDescription = null, tint = MaterialTheme.colorScheme.primary)
            }
            Spacer(Modifier.width(12.dp))
            Column(modifier = Modifier.weight(1f)) {
                Text(title, style = MaterialTheme.typography.titleMedium)
                TestResultWidget(result = testResult)
            }
            Text(value, style = MaterialTheme.typography.bodyMedium, color = MaterialTheme.colorScheme.onSurfaceVariant)
            if (onTest != null) {
                Spacer(Modifier.width(8.dp))
                IconButton(onClick = onTest, modifier = Modifier.size(40.dp)) {
                    if (testResult is TestResult.Loading) CircularProgressIndicator(modifier = Modifier.size(18.dp), strokeWidth = 2.dp)
                    else Icon(Icons.Default.PlayArrow, "Test", tint = MaterialTheme.colorScheme.primary)
                }
            }
        }
    }
}

@Composable
fun TestSwitchCard(
    icon: ImageVector, title: String, checked: Boolean,
    onCheckedChange: (Boolean) -> Unit,
    testResult: TestResult = TestResult.Idle,
    onTest: (() -> Unit)? = null,
    modifier: Modifier = Modifier
) {
    Card(modifier = modifier, shape = RoundedCornerShape(24.dp),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceBright)
    ) {
        Row(modifier = Modifier.padding(16.dp).fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
            Box(modifier = Modifier.clip(CircleShape).size(40.dp).padding(8.dp), contentAlignment = Alignment.Center) {
                Icon(icon, contentDescription = null, tint = MaterialTheme.colorScheme.primary)
            }
            Spacer(Modifier.width(12.dp))
            Column(modifier = Modifier.weight(1f)) {
                Text(title)
                TestResultWidget(result = testResult)
            }
            Switch(checked = checked, onCheckedChange = onCheckedChange)
            if (onTest != null) {
                Spacer(Modifier.width(4.dp))
                IconButton(onClick = onTest, modifier = Modifier.size(40.dp)) {
                    if (testResult is TestResult.Loading) CircularProgressIndicator(modifier = Modifier.size(18.dp), strokeWidth = 2.dp)
                    else Icon(Icons.Default.PlayArrow, "Test", tint = MaterialTheme.colorScheme.primary)
                }
            }
        }
    }
}

@Composable
fun SliderCard(
    icon: ImageVector, title: String, value: Int, range: ClosedFloatingPointRange<Float>,
    onValueChange: (Float) -> Unit, testResult: TestResult = TestResult.Idle,
    onTest: (() -> Unit)? = null, modifier: Modifier = Modifier, suffix: String = ""
) {
    Card(modifier = modifier, shape = RoundedCornerShape(24.dp),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceBright)
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Box(modifier = Modifier.clip(CircleShape).size(36.dp).padding(6.dp), contentAlignment = Alignment.Center) {
                    Icon(icon, contentDescription = null, tint = MaterialTheme.colorScheme.primary, modifier = Modifier.size(20.dp))
                }
                Spacer(Modifier.width(10.dp))
                Text(title, style = MaterialTheme.typography.titleMedium, modifier = Modifier.weight(1f))
                Text("$value$suffix", style = MaterialTheme.typography.bodyMedium, color = MaterialTheme.colorScheme.onSurfaceVariant)
                if (onTest != null) {
                    IconButton(onClick = onTest, modifier = Modifier.size(36.dp)) {
                        if (testResult is TestResult.Loading) CircularProgressIndicator(modifier = Modifier.size(16.dp), strokeWidth = 2.dp)
                        else Icon(Icons.Default.PlayArrow, "Test", tint = MaterialTheme.colorScheme.primary, modifier = Modifier.size(18.dp))
                    }
                }
            }
            Slider(value = value.toFloat().coerceIn(range), onValueChange = onValueChange, valueRange = range)
            TestResultWidget(result = testResult)
        }
    }
}

@Composable
fun ExpandableCard(
    icon: ImageVector, title: String, expanded: Boolean,
    onClick: () -> Unit, modifier: Modifier = Modifier, content: @Composable () -> Unit
) {
    val rotation = animateFloatAsState(targetValue = if (expanded) 180f else 0f).value
    Card(modifier = modifier, shape = RoundedCornerShape(24.dp),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceBright)
    ) {
        Column(modifier = Modifier.padding(16.dp).fillMaxWidth()) {
            Row(modifier = Modifier.fillMaxWidth().clickable { onClick() }, verticalAlignment = Alignment.CenterVertically) {
                Box(modifier = Modifier.clip(CircleShape).size(40.dp).padding(8.dp), contentAlignment = Alignment.Center) {
                    Icon(icon, contentDescription = null, tint = MaterialTheme.colorScheme.primary)
                }
                Spacer(Modifier.width(12.dp))
                Text(title, style = MaterialTheme.typography.titleMedium, modifier = Modifier.weight(1f))
                Icon(Icons.Default.ExpandMore, "", modifier = Modifier.rotate(rotation))
            }
            if (expanded) { Spacer(Modifier.height(12.dp)); content() }
        }
    }
}

@Composable
fun SectionHeader(title: String, modifier: Modifier = Modifier) {
    Text(title, style = MaterialTheme.typography.titleSmall.copy(fontWeight = FontWeight.Bold),
        color = MaterialTheme.colorScheme.primary, modifier = modifier.padding(top = 8.dp, bottom = 4.dp))
}
