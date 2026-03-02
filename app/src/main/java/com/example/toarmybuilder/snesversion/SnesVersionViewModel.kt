package com.example.toarmybuilder.snesversion

import androidx.compose.runtime.toMutableStateList
import androidx.lifecycle.ViewModel
import com.example.toarmybuilder.snesversion.datamodels.components.CharacterClass
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import com.example.toarmybuilder.snesversion.datamodels.components.classdata.CharacterFactory
import com.example.toarmybuilder.snesversion.datamodels.components.classdata.charactertemplates.male.SoldierTemplate
import com.example.toarmybuilder.snesversion.datamodels.components.classdata.charactertemplates.unique.CanopusTemplate
import com.example.toarmybuilder.snesversion.datamodels.components.classdata.charactertemplates.unique.GuildusTemplate
import com.example.toarmybuilder.snesversion.datamodels.components.classdata.charactertemplates.unique.HaborymTemplate
import com.example.toarmybuilder.snesversion.datamodels.components.classdata.charactertemplates.unique.KachuaTemplate
import com.example.toarmybuilder.snesversion.datamodels.components.classdata.charactertemplates.unique.MildainTemplate
import com.example.toarmybuilder.snesversion.datamodels.components.classdata.charactertemplates.unique.OliviaTemplate
import com.example.toarmybuilder.snesversion.datamodels.components.classdata.charactertemplates.unique.PrincessTemplate
import com.example.toarmybuilder.snesversion.datamodels.components.classdata.charactertemplates.unique.RendalTemplate
import com.example.toarmybuilder.snesversion.datamodels.components.classdata.charactertemplates.unique.ShelleyTemplate
import com.example.toarmybuilder.snesversion.datamodels.components.classdata.charactertemplates.unique.SisteenaTemplate

val starterArmy = listOf(
    CharacterFactory(template = SoldierTemplate, id = 1),
    CharacterFactory(template = GuildusTemplate, id = 2),
    CharacterFactory(template = HaborymTemplate, id = 3),
    CharacterFactory(template = KachuaTemplate, id = 4),
    CharacterFactory(template = CanopusTemplate, id = 5),
    CharacterFactory(template = OliviaTemplate, id = 6),
    CharacterFactory(template = PrincessTemplate, id = 7),
    CharacterFactory(template = ShelleyTemplate, id = 8),
    CharacterFactory(template = SisteenaTemplate, id = 9),
    CharacterFactory(template = RendalTemplate, id = 10)
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
        val characterBeingUpdated = focusedCharacter.value
        val newLevels = List(50){if (it == levelIndex) levelType else characterBeingUpdated.levels[it]}
        val replacement = CharacterFactory(
            template = characterBeingUpdated.template,
            id = characterBeingUpdated.id,
            levels = newLevels)
        _focusedCharacter.value = replacement
        _armyList.replaceAll {if (it.id == replacement.id) replacement else it}
    }
}