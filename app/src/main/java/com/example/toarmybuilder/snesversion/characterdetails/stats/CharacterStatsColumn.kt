package com.example.toarmybuilder.snesversion.characterdetails.stats

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.toarmybuilder.R
import com.example.toarmybuilder.snesversion.SnesVersionViewModel
import com.example.toarmybuilder.snesversion.datamodels.Character
import com.example.toarmybuilder.utilities.Wallpaper

@Composable
fun CharacterStatsColumn(
    snesVersionViewModel: SnesVersionViewModel = viewModel()
){
    val focusedCharacter : Character by snesVersionViewModel.focusedCharacter.collectAsState()

    Wallpaper(R.drawable.backgroundtexture1)

    // Contents
    Column(modifier = Modifier
        .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ){

        TitleRow(focusedCharacter.name, focusedCharacter.Id, focusedCharacter.creatureType)
        Image(
            painter = painterResource(id = focusedCharacter.sprite),
            contentDescription = null,
            contentScale = ContentScale.None
        )
        StatRow(statLabel = "Ali", statValue = "L / N / C") // TODO
        StatRow(statLabel = "HP", statValue = focusedCharacter.hp.toString())
        StatRow(statLabel = "MP", statValue = focusedCharacter.mp.toString())
        StatRow(statLabel = "Str", statValue = focusedCharacter.str.toString())
        StatRow(statLabel = "Vit", statValue = focusedCharacter.vit.toString())
        StatRow(statLabel = "Dex", statValue = focusedCharacter.dex.toString())
        StatRow(statLabel = "Int", statValue = focusedCharacter.int.toString())
        StatRow(statLabel = "Men", statValue = focusedCharacter.men.toString())
        StatRow(statLabel = "Agi", statValue = focusedCharacter.agi.toString())
    }
}
