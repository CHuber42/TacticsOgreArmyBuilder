package com.example.toarmybuilder.snesversion.characterdetails

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun CharacterLevelsColumn(characterLevelsModifier: Modifier){
    Column(modifier = characterLevelsModifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text("Levels Select")
    }
}