package com.example.toarmybuilder.snesversion.datamodels.components.classdata.charactertemplates.unique

import com.example.toarmybuilder.R
import com.example.toarmybuilder.snesversion.datamodels.components.CharacterAlignment
import com.example.toarmybuilder.snesversion.datamodels.components.CharacterClass
import com.example.toarmybuilder.snesversion.datamodels.components.Element
import com.example.toarmybuilder.snesversion.datamodels.components.Jobs
import com.example.toarmybuilder.snesversion.datamodels.components.classdata.StarterCharacterTemplate

object ByanTemplate : StarterCharacterTemplate() {
    override val sprite: Int = R.drawable.male_wizard1
    override val spriteChangeable: Boolean = true
    override val initialLevel: Int = 13
    override val element: Element = Element.EARTH
    override val alignment = CharacterAlignment.NEUTRAL

    override val hp: Int = 152
    override val mp: Int = 88
    override val str: Int = 81
    override val vit: Int = 67
    override val int: Int = 121
    override val men: Int = 111
    override val agi: Int = 89
    override val dex: Int = 89
    override val luk: Int = 47

    override val initialClass: CharacterClass = Jobs.Male.Wizard
    override val classOptions: List<CharacterClass> =
        listOf(
            Jobs.Male.Soldier,
            Jobs.Male.Knight,
            Jobs.Male.Berserker,
            Jobs.Male.BeastTamer,
            Jobs.Male.Exorcist,
            Jobs.Male.Ninja,
            Jobs.Male.Wizard,
            Jobs.Male.Swordmaster,
            Jobs.Male.Dragoon,
            Jobs.Male.TerrorKnight,
            Jobs.Male.Warlock,
            Jobs.Male.Gunner,
        )
}