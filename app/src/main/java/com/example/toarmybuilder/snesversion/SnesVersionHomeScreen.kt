package com.example.toarmybuilder.snesversion

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun SnesVersionHomeScreen(){
    Box(modifier = Modifier
        .fillMaxSize()
    ) {
        val characterDetailsModifier = Modifier
            .fillMaxHeight(0.8F)
            .fillMaxWidth()
        CharacterDetailsFragment(characterDetailsModifier)

        val previewModifier = Modifier
            .fillMaxHeight(0.2F)
            .fillMaxWidth()
            .align(Alignment.BottomCenter)
        ArmyPreviewFragment(previewModifier)
    }
}