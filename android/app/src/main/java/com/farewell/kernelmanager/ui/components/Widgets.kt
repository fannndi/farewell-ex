package com.farewell.kernelmanager.ui.components

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ExpandLess
import androidx.compose.material.icons.filled.ExpandMore
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

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
    Card(
        modifier = modifier,
        shape = RoundedCornerShape(24.dp),
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
fun ExpandableCard(
    icon: ImageVector, title: String, expanded: Boolean,
    onClick: () -> Unit, modifier: Modifier = Modifier,
    content: @Composable () -> Unit
) {
    val rotation = animateFloatAsState(targetValue = if (expanded) 180f else 0f).value
    Card(
        modifier = modifier,
        shape = RoundedCornerShape(24.dp),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceBright)
    ) {
        Column(modifier = Modifier.padding(16.dp).fillMaxWidth()) {
            Row(
                modifier = Modifier.fillMaxWidth().clickable { onClick() },
                verticalAlignment = Alignment.CenterVertically
            ) {
                Box(modifier = Modifier.clip(CircleShape).size(40.dp).padding(8.dp), contentAlignment = Alignment.Center) {
                    Icon(icon, contentDescription = null, tint = MaterialTheme.colorScheme.primary)
                }
                Spacer(Modifier.width(12.dp))
                Text(title, style = MaterialTheme.typography.titleMedium, modifier = Modifier.weight(1f))
                Icon(Icons.Default.ExpandMore, contentDescription = null, modifier = Modifier.rotate(rotation))
            }
            if (expanded) {
                Spacer(Modifier.height(12.dp))
                content()
            }
        }
    }
}

@Composable
fun SectionHeader(title: String, modifier: Modifier = Modifier) {
    Text(title, style = MaterialTheme.typography.titleSmall.copy(fontWeight = FontWeight.Bold),
        color = MaterialTheme.colorScheme.primary, modifier = modifier.padding(top = 8.dp, bottom = 4.dp))
}
