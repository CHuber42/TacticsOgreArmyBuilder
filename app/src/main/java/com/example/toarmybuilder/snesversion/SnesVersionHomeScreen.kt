package com.example.toarmybuilder.snesversion

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.toarmybuilder.snesversion.armypreview.ArmyPreviewContainer
import com.example.toarmybuilder.snesversion.characterdetails.CharacterDetailsContainer

@Composable
fun SnesVersionHomeScreen(){
    Box(modifier = Modifier
        .fillMaxSize()
    ) {
        val characterDetailsModifier = Modifier
            .fillMaxHeight(0.8F) // 4/5 of Screen Height for Character Details
            .fillMaxWidth()
        CharacterDetailsContainer(characterDetailsModifier)

        val armyPreviewModifier = Modifier
            .fillMaxHeight(0.2F) // 1/5 of Screen Height for ArmyPreview
            .fillMaxWidth()
            .align(Alignment.BottomCenter)
        ArmyPreviewContainer(
            armyPreviewModifier
        )
    }
}