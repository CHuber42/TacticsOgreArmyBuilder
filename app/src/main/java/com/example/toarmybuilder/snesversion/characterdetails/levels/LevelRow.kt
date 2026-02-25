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
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.toarmybuilder.snesversion.SnesVersionViewModel
import com.example.toarmybuilder.snesversion.datamodels.components.CharacterClass
import com.example.toarmybuilder.snesversion.datamodels.components.Jobs
import com.example.toarmybuilder.snesversion.datamodels.components.classdata.CharacterFactory

@Composable
fun LevelRow(
    index: Int,
    focusedCharacter: CharacterFactory,
    snesVersionViewModel: SnesVersionViewModel = viewModel()
){
    val classOptions = focusedCharacter.template.classOptions
    val levelItem = focusedCharacter.levels[index]
    var expanded by rememberSaveable { mutableStateOf(false) }
    HorizontalDivider()
    Row(modifier = Modifier
        .fillMaxWidth(0.95F),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ){
        Text((index + 1).toString()) // Add one for level display
        TextButton(onClick = {expanded = !expanded}) {
            Text(levelItem.name)
            DropdownMenu(expanded = expanded, onDismissRequest = {expanded = false}) {
                classOptions.forEach { option ->
                    DropdownMenuItem(
                        text = {Text(option.name)},
                        onClick = {
                            expanded = false
                            snesVersionViewModel.updateCharacterLevels(index, option)
                        }
                    )
                }
            }
        }
    }
}