package com.farewell.kernelmanager.ui.settings

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.farewell.kernelmanager.viewmodel.FeatureUnlock
import com.farewell.kernelmanager.viewmodel.SettingsViewModel

private val TierColors = mapOf(
    1 to Color(0xFF9E9E9E),
    2 to Color(0xFF2196F3),
    3 to Color(0xFF4CAF50),
    4 to Color(0xFFFF9800),
    5 to Color(0xFFF44336),
)

private val TierNames = mapOf(
    1 to "Non-Root",
    2 to "ADB (Shizuku)",
    3 to "Root (KernelSU)",
    4 to "Zygisk (ZygiskNext)",
    5 to "Xposed (Vector)",
)

@Composable
fun TierAccessScreen(viewModel: SettingsViewModel) {
    val tierState by viewModel.tierState.collectAsState()
    val features by viewModel.features.collectAsState()

    Column(modifier = Modifier.padding(16.dp)) {
        // Tier Status
        Card(
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(12.dp),
            colors = CardDefaults.cardColors(
                containerColor = TierColors[tierState.currentTier]?.copy(alpha = 0.1f)
                    ?: MaterialTheme.colorScheme.surface
            )
        ) {
            Column(modifier = Modifier.padding(20.dp)) {
                Text("Tier Access", fontWeight = FontWeight.Bold, fontSize = 20.sp)
                Spacer(modifier = Modifier.height(8.dp))

                TierBar(currentTier = tierState.currentTier)

                Spacer(modifier = Modifier.height(12.dp))

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Column {
                        Text("Current: Tier ${tierState.currentTier}", fontSize = 14.sp)
                        Text(
                            TierNames[tierState.currentTier] ?: "Unknown",
                            fontSize = 12.sp, color = Color.Gray
                        )
                    }
                    Column {
                        Text("${tierState.unlockedFeatures} features", fontSize = 14.sp)
                        Text("unlocked", fontSize = 12.sp, color = Color.Gray)
                    }
                }

                if (tierState.lockedFeatures > 0) {
                    Spacer(modifier = Modifier.height(8.dp))
                    Text(
                        "${tierState.lockedFeatures} features locked — install framework to unlock",
                        fontSize = 12.sp, color = Color(0xFFFF9800)
                    )
                }
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Feature List
        Text("Features", fontWeight = FontWeight.Bold, fontSize = 16.sp)
        Spacer(modifier = Modifier.height(8.dp))

        features.forEach { feature ->
            FeatureItem(feature)
            Spacer(modifier = Modifier.height(4.dp))
        }
    }
}

@Composable
private fun TierBar(currentTier: Int) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(8.dp),
        horizontalArrangement = Arrangement.spacedBy(4.dp)
    ) {
        for (tier in 1..5) {
            Box(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(
                        color = if (tier <= currentTier) TierColors[tier] ?: Color.Gray
                        else Color.Gray.copy(alpha = 0.3f),
                        shape = RoundedCornerShape(4.dp)
                    )
            )
        }
    }
}

@Composable
private fun FeatureItem(feature: FeatureUnlock) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 6.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            imageVector = if (feature.unlocked) Icons.Default.CheckCircle
            else Icons.Default.Lock,
            contentDescription = null,
            tint = if (feature.unlocked) Color(0xFF4CAF50) else Color(0xFF9E9E9E),
            modifier = Modifier.size(20.dp)
        )
        Spacer(modifier = Modifier.width(12.dp))
        Column(modifier = Modifier.weight(1f)) {
            Text(feature.name, fontSize = 14.sp)
            Text(
                if (feature.unlocked) "Unlocked"
                else "Requires Tier ${feature.tier}",
                fontSize = 11.sp,
                color = if (feature.unlocked) Color.Gray else Color(0xFFFF9800)
            )
        }
    }
}
