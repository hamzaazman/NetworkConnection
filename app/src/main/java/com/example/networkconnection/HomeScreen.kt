package com.example.networkconnection

import androidx.compose.animation.Crossfade
import androidx.compose.animation.animateColor
import androidx.compose.animation.core.updateTransition
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

@Composable
fun HomeScreen(isOnline: Boolean, modifier: Modifier = Modifier) {
    val transition = updateTransition(targetState = isOnline, label = "Online Status Transition")

    val bgColor by transition.animateColor(label = "Background Color") { online ->
        if (online) Color(0xFF4CAF50) else Color(0xFF9E9E9E)
    }

    val msgStr = stringResource(
        id = if (isOnline) {
            R.string.you_are_online_msg
        } else {
            R.string.you_are_offline_msg
        }
    )

    Card(
        modifier = modifier
            .fillMaxWidth()
            .padding(16.dp),
        shape = RoundedCornerShape(8.dp),
        colors = androidx.compose.material3.CardDefaults.cardColors(
            containerColor = bgColor
        ),
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Crossfade(targetState = isOnline, label = "") { isOnline ->
                val icon = if (isOnline) R.drawable.online else R.drawable.offline

                Icon(
                    contentDescription = null,
                    tint = Color.White,
                    modifier = Modifier.padding(end = 8.dp),
                    painter = painterResource(id = icon)
                )
            }
            Text(
                text = msgStr,
                style = TextStyle(color = Color.White, fontWeight = FontWeight.Bold),
                textAlign = TextAlign.Center
            )
        }
    }
}
