package com.example.toarmybuilder.snesversion.characterdetails.levels

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun CharacterLevelsColumn(characterLevelsModifier: Modifier){
    Column(modifier = characterLevelsModifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
//        LazyColumn() {
//            items(list = )
//        }
        Text("Levels Select")
        for (i in 0..50){
            LevelRow(i)
        }
    }
}