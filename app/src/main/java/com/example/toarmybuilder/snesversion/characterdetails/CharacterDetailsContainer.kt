package com.example.toarmybuilder.snesversion.characterdetails

import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.toarmybuilder.snesversion.characterdetails.levels.CharacterLevelsColumn
import com.example.toarmybuilder.snesversion.characterdetails.stats.CharacterStatsColumn

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