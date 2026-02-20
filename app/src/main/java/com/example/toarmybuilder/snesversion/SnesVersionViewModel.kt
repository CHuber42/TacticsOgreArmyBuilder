package com.example.toarmybuilder.snesversion

import androidx.lifecycle.ViewModel
import com.example.toarmybuilder.snesversion.datamodels.Character
import com.example.toarmybuilder.snesversion.datamodels.StarterDenim

class SnesVersionViewModel : ViewModel() {

    val armyList = listOf(
        StarterDenim(Id = 1),
        StarterDenim(Id = 2),
        StarterDenim(Id = 3),
        StarterDenim(Id = 4),
        StarterDenim(Id = 5),
        StarterDenim(Id = 6),
        StarterDenim(Id = 7),
        StarterDenim(Id = 8),
        StarterDenim(Id = 9),
        StarterDenim(Id = 10)
    )
    val focusedCharacter : Character = armyList[0]
}