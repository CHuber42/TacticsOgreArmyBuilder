package com.example.toarmybuilder.snesversion.characterdetails

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

@Composable
fun StatRow(
    statLabel: String,
    statValue: String
) {
    Row(
        modifier = Modifier
            .fillMaxWidth(),
    ){
        val textModifier = Modifier.weight(1F).padding(8.dp)
        Text(statLabel, modifier = textModifier, textAlign = TextAlign.Center)
        Text(statValue, modifier = textModifier, textAlign = TextAlign.Center)
    }
}