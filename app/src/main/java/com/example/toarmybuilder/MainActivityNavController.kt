package com.example.toarmybuilder

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.toarmybuilder.luctversion.LuctVersionHomeScreen
import com.example.toarmybuilder.navigationaccessories.*
import com.example.toarmybuilder.rebornversion.RebornVersionHomeScreen
import com.example.toarmybuilder.snesversion.SnesVersionHomeScreen

@Composable
fun MainActivityNavController() {
    val navController = rememberNavController()
    val navigateFun : (destination: Any) -> Unit = { destination -> navController.navigate(destination)}
//    Log.d("ZXZ", VersionSelectScreen.toString())
    NavHost(
        navController = navController,
        startDestination = VersionSelectScreen
    ){
        composable<VersionSelectScreen> { VersionSelectScreen(navigate = navigateFun) }
        composable<SnesVersionHomeScreen> { SnesVersionHomeScreen() }
        composable<LuctVersionHomeScreen> { LuctVersionHomeScreen() }
        composable<RebornVersionHomeScreen> { RebornVersionHomeScreen() }    }
}