package com.example.toarmybuilder.snesversion.characterdetails.levels

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun LevelRow(LevelItem: String){
    HorizontalDivider()
    Row(modifier = Modifier
        .fillMaxWidth()
    ){
        Text(LevelItem)
    }
}