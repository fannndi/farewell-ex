package com.farewell.kernelmanager.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.farewell.kernelmanager.ui.components.ExpandableCard
import com.farewell.kernelmanager.ui.components.SectionHeader
import com.farewell.kernelmanager.ui.components.SwitchCard
import com.farewell.kernelmanager.ui.components.ParamCard

@Composable
fun XiaomiScreen() {
    LazyColumn(modifier = Modifier.fillMaxSize().padding(16.dp), verticalArrangement = Arrangement.spacedBy(12.dp)) {
        item { SectionHeader("Xiaomi Features") }
        item {
            ExpandableCard(Icons.Default.BatteryChargingFull, "Charging", true, onClick = {}) {
                Text("Reverse charge, night charging, cool mode, smart battery controls.",
                    style = MaterialTheme.typography.bodyMedium,
                    color = MaterialTheme.colorScheme.onSurfaceVariant)
            }
        }
        item {
            Card(Modifier.fillMaxWidth()) {
                Text("Connect device with root to see live Xiaomi tuning options.",
                    modifier = Modifier.padding(16.dp),
                    style = MaterialTheme.typography.bodyMedium)
            }
        }
    }
}
