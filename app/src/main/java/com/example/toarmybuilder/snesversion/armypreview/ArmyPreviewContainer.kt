package com.example.toarmybuilder.snesversion.armypreview

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import com.example.toarmybuilder.R

@Composable
fun ArmyPreviewContainer(previewModifier: Modifier){
    Box(modifier = previewModifier,
        contentAlignment = Alignment.BottomCenter){
        Image(
            painter = painterResource(id = R.drawable.backgroundtexture1),
            contentDescription = null,
            contentScale = ContentScale.FillBounds,
            modifier = Modifier.fillMaxSize()
        )
    }
}