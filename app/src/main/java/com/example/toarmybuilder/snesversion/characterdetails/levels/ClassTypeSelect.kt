package com.example.toarmybuilder.snesversion.characterdetails.levels

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.toarmybuilder.snesversion.SnesVersionViewModel

@Composable
fun ClassTypeSelect(
    snesVersionViewModel: SnesVersionViewModel = viewModel()
){
    var expanded by rememberSaveable { mutableStateOf(false) }
    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text("Select Type") // TODO
        IconButton(onClick = { expanded = !expanded }) {
            Icon(
                Icons.Default.ArrowDropDown,
                contentDescription = "More options"
            )
        }
        DropdownMenu(
            expanded = expanded,
            onDismissRequest = {}
        ) {
            DropdownMenuItem({ Text("Male") }, onClick = {
                expanded = false
                snesVersionViewModel.focusedCharacter.creatureType = "Male"
            })
            DropdownMenuItem({ Text("Female") }, onClick = {
                expanded = false
                snesVersionViewModel.focusedCharacter.creatureType = "Female"
            })
            DropdownMenuItem({ Text("Demihuman") }, onClick = {
                expanded = false
                snesVersionViewModel.focusedCharacter.creatureType = "Demihuman"
            })
            DropdownMenuItem({ Text("Dragon") }, onClick = {
                expanded = false
                snesVersionViewModel.focusedCharacter.creatureType = "Dragon"
            })
            DropdownMenuItem({ Text("Beast") }, onClick = {
                expanded = false
                snesVersionViewModel.focusedCharacter.creatureType = "Beast"
            })
            DropdownMenuItem({ Text("Golem") }, onClick = {
                expanded = false
                snesVersionViewModel.focusedCharacter.creatureType = "Golem"
            })
            DropdownMenuItem({ Text("Unique") }, onClick = {
                expanded = false
                snesVersionViewModel.focusedCharacter.creatureType = "Unique"
            })
        }
    }
}