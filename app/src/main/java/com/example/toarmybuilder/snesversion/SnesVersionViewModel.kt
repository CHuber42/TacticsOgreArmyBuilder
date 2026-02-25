package com.example.toarmybuilder.snesversion

import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.toMutableStateList
import androidx.lifecycle.ViewModel
import com.example.toarmybuilder.snesversion.datamodels.components.CharacterClass
import com.example.toarmybuilder.snesversion.datamodels.components.Jobs
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import com.example.toarmybuilder.snesversion.datamodels.components.classdata.CharacterFactory
import com.example.toarmybuilder.snesversion.datamodels.components.classdata.startingtemplates.female.AmazonTemplate
import com.example.toarmybuilder.snesversion.datamodels.components.classdata.startingtemplates.male.SoldierTemplate

val starterArmy = listOf(
    CharacterFactory(template = SoldierTemplate, id = 1),
    CharacterFactory(template = SoldierTemplate, id = 2),
    CharacterFactory(template = SoldierTemplate, id = 3),
    CharacterFactory(template = SoldierTemplate, id = 4),
    CharacterFactory(template = SoldierTemplate, id = 5),
    CharacterFactory(template = AmazonTemplate, id = 6),
    CharacterFactory(template = AmazonTemplate, id = 7),
    CharacterFactory(template = AmazonTemplate, id = 8),
    CharacterFactory(template = AmazonTemplate, id = 9),
    CharacterFactory(template = AmazonTemplate, id = 10)
)
class SnesVersionViewModel : ViewModel() {

    private val _armyList = starterArmy.toMutableStateList()
    val armyList : List<CharacterFactory>
        get() = _armyList
    private val _focusedCharacter = MutableStateFlow<CharacterFactory>(armyList[0])
    val focusedCharacter : StateFlow<CharacterFactory> = _focusedCharacter.asStateFlow()

    fun setFocusedCharacter(id: Int){
        val chosen = _armyList.find {it.id == id} as CharacterFactory
        val replacement = CharacterFactory(template = chosen.template, id = chosen.id, levels = chosen.levels)
        _focusedCharacter.value = replacement
    }
    fun updateCharacterLevels(levelIndex: Int, levelType: CharacterClass){
        val source = focusedCharacter.value
        val sourceLevels = focusedCharacter.value.levels.toMutableList()
        sourceLevels[levelIndex] = levelType
        val replacement = CharacterFactory(template = source.template, id = source.id, levels = sourceLevels)
        _focusedCharacter.value = replacement
        _armyList.replaceAll {if (it.id == replacement.id) replacement else it}
    }
}