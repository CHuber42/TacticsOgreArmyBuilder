package com.example.toarmybuilder.snesversion.characterdetails

import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun CharacterDetailsContainer(characterDetailsContainerModifier: Modifier){
    Row(modifier = characterDetailsContainerModifier){

        val characterStatsFragmentModifier =
            Modifier.weight(1F)
        CharacterStatsColumn(characterStatsFragmentModifier)

        val characterLevelFragmentModifier =
            Modifier.weight(1F)
        CharacterLevelsColumn(characterLevelFragmentModifier)
    }
}