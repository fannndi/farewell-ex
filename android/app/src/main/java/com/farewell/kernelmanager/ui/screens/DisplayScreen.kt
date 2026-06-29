package com.farewell.kernelmanager.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.farewell.kernelmanager.ui.components.SectionHeader

@Composable
fun DisplayScreen() {
    LazyColumn(modifier = Modifier.fillMaxSize().padding(16.dp), verticalArrangement = Arrangement.spacedBy(12.dp)) {
        item {
            SectionHeader("Display Control")
            Text("KCAL, DFPS, and brightness controls coming soon.",
                 style = MaterialTheme.typography.bodyMedium,
                 color = MaterialTheme.colorScheme.onSurfaceVariant)
        }
    }
}
