package com.example.toarmybuilder.snesversion

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun CharacterDetailsFragment(characterDetailsModifier: Modifier){
    Row(modifier = characterDetailsModifier){
        Column(modifier = Modifier.weight(1F),
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Text("Stats Display")
        }
        Column(modifier = Modifier.weight(1F),
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Text("Levels Select")
        }
    }
}