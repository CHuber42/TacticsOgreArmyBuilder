package com.example.toarmybuilder.snesversion.characterdetails.levels

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.toarmybuilder.R
import com.example.toarmybuilder.snesversion.SnesVersionViewModel
import com.example.toarmybuilder.utilities.Wallpaper
import java.util.logging.Level

@Composable
fun CharacterLevelsColumn(
    snesVersionViewModel: SnesVersionViewModel = viewModel()
){
    Wallpaper(R.drawable.backgroundtexture1)
    val levels = snesVersionViewModel.focusedCharacter.levels
    val focusedCharacter = snesVersionViewModel.focusedCharacter
    LazyColumn(
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        if(focusedCharacter.creatureTypeSelectable){
            item{
                ClassTypeSelect()
            }
        }
        items(levels){
                item -> LevelRow(item)
        }
    }

}