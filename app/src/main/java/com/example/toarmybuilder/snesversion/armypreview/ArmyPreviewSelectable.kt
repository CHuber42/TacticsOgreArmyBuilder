package com.example.toarmybuilder.snesversion.armypreview

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.toarmybuilder.R
import com.example.toarmybuilder.snesversion.SnesVersionViewModel
import com.example.toarmybuilder.snesversion.datamodels.Character

@Composable
fun ArmyPreviewSelectable(
    armyPreviewSelectableModifier: Modifier,
    listItem: Character,
    snesVersionViewModel: SnesVersionViewModel = viewModel()
){
    Box(modifier = armyPreviewSelectableModifier,
        contentAlignment = Alignment.Center
        ){
        // Denim Sprite // todo
        Image(
            painter = painterResource(id = listItem.sprite),
            contentDescription = null,
            contentScale = ContentScale.None
        )
        TextButton(
            onClick = {snesVersionViewModel.setFocusedCharacter(listItem.Id)}
        ){
            Text(listItem.Id.toString())
        }
    }
}