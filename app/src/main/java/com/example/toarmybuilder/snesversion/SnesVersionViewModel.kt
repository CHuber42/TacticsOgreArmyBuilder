package com.example.toarmybuilder.snesversion

import androidx.lifecycle.ViewModel
import com.example.toarmybuilder.snesversion.datamodels.components.CharacterClass
import com.example.toarmybuilder.snesversion.datamodels.components.Jobs
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import com.example.toarmybuilder.snesversion.datamodels.components.classdata.CharacterFactory
import com.example.toarmybuilder.snesversion.datamodels.components.classdata.startingtemplates.female.AmazonTemplate
import com.example.toarmybuilder.snesversion.datamodels.components.classdata.startingtemplates.male.WarriorTemplate


class SnesVersionViewModel : ViewModel() {

    val armyList
        get() = _armyList
    private val _armyList = listOf(
        CharacterFactory(template = WarriorTemplate, id = 1, levels = List<CharacterClass>(3){ Jobs.Male.Warrior}),
        CharacterFactory(template = WarriorTemplate, id = 2, levels = List<CharacterClass>(3){ Jobs.Male.Ninja}),
        CharacterFactory(template = WarriorTemplate, id = 3, levels = List<CharacterClass>(3){ Jobs.Male.Dragoon}),
        CharacterFactory(template = WarriorTemplate, id = 4, levels = List<CharacterClass>(3){ Jobs.Male.Knight}),
        CharacterFactory(template = WarriorTemplate, id = 5, levels = List<CharacterClass>(3){ Jobs.Male.Swordmaster}),
        CharacterFactory(template = AmazonTemplate, id = 6, levels = List<CharacterClass>(3){ Jobs.Female.Amazon}),
        CharacterFactory(template = AmazonTemplate, id = 7, levels = List<CharacterClass>(3){ Jobs.Female.Archer}),
        CharacterFactory(template = AmazonTemplate, id = 8, levels = List<CharacterClass>(3){ Jobs.Female.Cleric}),
        CharacterFactory(template = AmazonTemplate, id = 9, levels = List<CharacterClass>(3){ Jobs.Female.Siren}),
        CharacterFactory(template = AmazonTemplate, id = 10, levels = listOf(Jobs.Female.Amazon,
            Jobs.Female.Amazon,
            Jobs.Female.Witch)),
//        CharacterFactory(template = AmazonTemplate, id = 10, levels = List<CharacterClass>(3){ Jobs.Female.Witch})
    )

    private val _focusedCharacter = MutableStateFlow<CharacterFactory>(armyList[0])
    val focusedCharacter : StateFlow<CharacterFactory> = _focusedCharacter.asStateFlow()

    fun setFocusedCharacter(id: Int){
        val chosen = _armyList.find {it.id == id} as CharacterFactory
        val replacement = CharacterFactory(template = chosen.template, id = chosen.id, levels = chosen.levels)
        _focusedCharacter.value = replacement
    }
    fun updateCharacterLevels(levelIndex: Int, levelType: CharacterClass){
        val target = _focusedCharacter.value
        val levelList = _focusedCharacter.value.levels.toMutableList()
        levelList[levelIndex] = levelType
        val replacement = CharacterFactory(template = target.template, id = target.id, levels = levelList)
        _focusedCharacter.value = replacement
    }
}