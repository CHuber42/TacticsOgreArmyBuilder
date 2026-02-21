package com.example.toarmybuilder.snesversion.characterdetails.stats

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.TextAutoSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun StatRow(
    statLabel: String,
    statValue: String
) {
    Row(
        modifier = Modifier
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceAround
    ){
        val textModifier = Modifier.padding(8.dp)
        Text(statLabel, modifier = textModifier, textAlign = TextAlign.Center, maxLines = 1)
        Text(statValue, modifier = textModifier, textAlign = TextAlign.Center, maxLines = 1)
    }
}