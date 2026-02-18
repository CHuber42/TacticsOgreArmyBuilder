package com.example.toarmybuilder.snesversion.armypreview

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import com.example.toarmybuilder.R
import com.example.toarmybuilder.datamodels.Character

@Composable
fun ArmyPreviewSelectable(
    armyPreviewSelectableModifier: Modifier,
    listItem: Character
){
    Box(modifier = armyPreviewSelectableModifier,
        contentAlignment = Alignment.Center
        ){
        // Denim Sprite // todo
        Image(
            painter = painterResource(id = R.drawable.denim1),
            contentDescription = null,
            contentScale = ContentScale.None
        )
    }
}