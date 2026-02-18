package com.example.toarmybuilder.snesversion.armypreview

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.toarmybuilder.R
import com.example.toarmybuilder.snesversion.SnesVersionViewModel
import com.example.toarmybuilder.utilities.Wallpaper

@Composable
fun ArmyPreviewContainer(
    previewModifier: Modifier,
    viewModel: SnesVersionViewModel = viewModel()){
    Box(modifier = previewModifier,
        contentAlignment = Alignment.BottomCenter
    ){
        Wallpaper(R.drawable.backgroundtexture1)
        // Contents of Army Preview
        Column(modifier = Modifier.fillMaxSize()){

            val armyPreviewRowModifier = Modifier
                .weight(1F)
                .fillMaxWidth()

            ArmyPreviewRow(armyPreviewRowModifier, viewModel.armyList.subList(0, 5)) //todo: Pagination
            ArmyPreviewRow(armyPreviewRowModifier, viewModel.armyList.subList(5, 10))

        }
    }
}