package com.example.toarmybuilder.snesversion.characterdetails

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun CharacterStatsFragment(characterStatsModifier: Modifier){
    Column(modifier = characterStatsModifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text("Stats Display")
    }
}
