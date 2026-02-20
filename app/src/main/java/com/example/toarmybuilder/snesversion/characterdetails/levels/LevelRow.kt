package com.example.toarmybuilder.snesversion.characterdetails.levels

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun LevelRow(index: Int, LevelItem: String){
    var expanded by rememberSaveable { mutableStateOf(false) }
    HorizontalDivider()
    Row(modifier = Modifier
        .fillMaxWidth(0.95F),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ){
        Text((index + 1).toString()) // Add one for level display
        TextButton(onClick = {expanded = !expanded}) {
            Text(LevelItem)
            DropdownMenu(expanded = expanded, onDismissRequest = {expanded = false}) {
                DropdownMenuItem(text = {Text(LevelItem)}, onClick = {expanded = false})
                DropdownMenuItem(text = {Text("Dragoon")}, onClick = {expanded = false})
            }
        }
    }
}