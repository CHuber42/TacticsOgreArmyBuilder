package com.example.toarmybuilder.snesversion.characterdetails.levels


import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.toarmybuilder.R
import com.example.toarmybuilder.snesversion.SnesVersionViewModel
import com.example.toarmybuilder.utilities.Wallpaper
import com.example.toarmybuilder.snesversion.datamodels.components.classdata.CharacterFactory

@Composable
fun CharacterLevelsColumn(
    snesVersionViewModel: SnesVersionViewModel = viewModel()
){
    Wallpaper(R.drawable.backgroundtexture2)
    val focusedCharacter : CharacterFactory by snesVersionViewModel.focusedCharacter.collectAsState()
    val levels = focusedCharacter.levels
    LazyColumn(
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        itemsIndexed(levels){ index, item ->
            LevelRow(index, focusedCharacter)
        }
    }
}