package com.example.toarmybuilder.snesversion.characterdetails.levels

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.toarmybuilder.snesversion.SnesVersionViewModel

@Composable
fun ClassTypeSelect(
    snesVersionViewModel: SnesVersionViewModel = viewModel()
){
    Row(modifier = Modifier.fillMaxWidth()){
        Text("Select Type") // TODO
    }
}