package com.example.toarmybuilder.snesversion

import androidx.lifecycle.ViewModel
import com.example.toarmybuilder.snesversion.datamodels.Character
import com.example.toarmybuilder.snesversion.datamodels.StarterDenim
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import com.example.toarmybuilder.R
import com.example.toarmybuilder.snesversion.datamodels.components.CharacterBuilder
import com.example.toarmybuilder.snesversion.datamodels.components.CharacterClass
import com.example.toarmybuilder.snesversion.datamodels.components.Jobs

class SnesVersionViewModel : ViewModel() {

    val armyList
        get() = _armyList
    private val _armyList = listOf(
        StarterDenim(Id = 1, hp = 10),
        StarterDenim(Id = 2, hp = 20),
        StarterDenim(Id = 3, hp = 30),
        StarterDenim(Id = 4, sprite = R.drawable.amazon1),
        StarterDenim(Id = 5),
        StarterDenim(Id = 6),
        StarterDenim(Id = 7),
        StarterDenim(Id = 8),
        StarterDenim(Id = 9, levels = List<CharacterClass>(1){Jobs.Male.BeastTamer}),
        StarterDenim(Id = 10, levels = List<CharacterClass>(1){Jobs.Male.Warrior})
    )

    private val _focusedCharacter = MutableStateFlow<Character>(armyList[0])
    val focusedCharacter : StateFlow<Character> = _focusedCharacter.asStateFlow()

    fun setFocusedCharacter(id: Int){
        val chosen = _armyList.find {it.Id == id} as Character
        val characterCopy = CharacterBuilder(chosen)
        _focusedCharacter.value = characterCopy
    }
}