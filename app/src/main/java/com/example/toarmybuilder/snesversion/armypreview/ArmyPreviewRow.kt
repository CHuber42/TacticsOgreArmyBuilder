package com.example.toarmybuilder.snesversion.armypreview

import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.toarmybuilder.datamodels.Character
import com.example.toarmybuilder.datamodels.StarterDenim

@Composable
fun ArmyPreviewRow(
    armyPreviewRowModifier: Modifier,
    subList: List<Character>
){
    LazyRow(modifier = armyPreviewRowModifier
    ){
        items(items = subList
            // key = {it.Id} // todo
        ){
            val armyPreviewSelectableModifier = Modifier
                .fillParentMaxWidth(0.2F)
                .fillParentMaxHeight()
            ArmyPreviewSelectable(armyPreviewSelectableModifier, it)
        }
    }
}