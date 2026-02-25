package com.example.toarmybuilder.snesversion.armypreview

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.toarmybuilder.snesversion.SnesVersionViewModel
import com.example.toarmybuilder.snesversion.datamodels.components.classdata.CharacterFactory

@Composable
fun ArmyPreviewSelectable(
    armyPreviewSelectableModifier: Modifier,
    listItem: CharacterFactory,
    snesVersionViewModel: SnesVersionViewModel = viewModel()
){
    Box(modifier = armyPreviewSelectableModifier,
        contentAlignment = Alignment.Center
        ){
        Image(
            modifier = Modifier.fillMaxSize(0.8F),
            painter = painterResource(id = listItem.sprite),
            contentDescription = null,
            contentScale = ContentScale.Fit

        )
        TextButton(
            onClick = {snesVersionViewModel.setFocusedCharacter(listItem.id)}
        ){
            Text("")
        }
    }
}