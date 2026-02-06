package com.example.toarmybuilder

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavController
import com.example.toarmybuilder.navigationaccessories.*

@Composable
fun VersionSelectScreen(
    navigate: (Any) -> Unit
){
    Box(modifier = Modifier
        .fillMaxHeight()
        .fillMaxWidth(),
        contentAlignment = Alignment.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.backgroundtexture1),
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = Modifier.fillMaxWidth(0.8F),
        )
    }
    Column(modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally){
        TextButton(onClick = {navigate(SnesVersionHomeScreen)}) {
            Text(text = "Tactics Ogre (SNES)")
        }
        TextButton(onClick = {navigate(LuctVersionHomeScreen)}) {
            Text(text = "Tactics Ogre: Let Us Cling Together")
        }
        TextButton(onClick = {navigate(RebornVersionHomeScreen)}) {
            Text(text = "Tactics Ogre: Reborn")
        }
    }
}