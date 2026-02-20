package com.example.toarmybuilder.snesversion.characterdetails

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.toarmybuilder.snesversion.characterdetails.levels.CharacterLevelsColumn
import com.example.toarmybuilder.snesversion.characterdetails.stats.CharacterStatsColumn

@Composable
fun CharacterDetailsContainer(){
    Row(){
        val characterStatsFragmentModifier =
            Modifier.weight(1F)
        Box(characterStatsFragmentModifier){
            CharacterStatsColumn()
        }

        val characterLevelFragmentModifier =
            Modifier.weight(1F)
        Box(characterLevelFragmentModifier){
            CharacterLevelsColumn()
        }
    }
}