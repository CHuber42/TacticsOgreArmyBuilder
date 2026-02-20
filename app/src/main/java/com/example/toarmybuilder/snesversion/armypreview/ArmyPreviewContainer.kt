package com.example.toarmybuilder.snesversion.armypreview

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.toarmybuilder.R
import com.example.toarmybuilder.snesversion.SnesVersionViewModel
import com.example.toarmybuilder.utilities.Wallpaper

@Composable
fun ArmyPreviewContainer(
    viewModel: SnesVersionViewModel = viewModel()
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