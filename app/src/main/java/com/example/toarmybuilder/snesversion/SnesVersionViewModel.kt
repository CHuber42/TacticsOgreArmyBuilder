package com.example.toarmybuilder.snesversion

import androidx.lifecycle.ViewModel
import com.example.toarmybuilder.datamodels.Character
import com.example.toarmybuilder.datamodels.StarterDenim

class SnesVersionViewModel : ViewModel() {

    val armyList = listOf(
        StarterDenim(Id = 1, levels = listOf("Warrior")),
        StarterDenim(Id = 2, levels = listOf("Warrior")),
        StarterDenim(Id = 3, levels = listOf("Warrior")),
        StarterDenim(Id = 4, levels = listOf("Warrior")),
        StarterDenim(Id = 5, levels = listOf("Warrior")),
        StarterDenim(Id = 6, levels = listOf("Warrior")),
        StarterDenim(Id = 7, levels = listOf("Warrior")),
        StarterDenim(Id = 8, levels = listOf("Warrior")),
        StarterDenim(Id = 9, levels = listOf("Warrior")),
        StarterDenim(Id = 10, levels = listOf("Warrior"))
    )
    val focusedCharacter : Character = armyList[0]
}