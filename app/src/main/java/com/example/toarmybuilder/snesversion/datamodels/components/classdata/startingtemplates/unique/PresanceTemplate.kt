package com.example.toarmybuilder.snesversion.datamodels.components.classdata.startingtemplates.unique

import com.example.toarmybuilder.R
import com.example.toarmybuilder.snesversion.datamodels.components.CharacterAlignment
import com.example.toarmybuilder.snesversion.datamodels.components.CharacterClass
import com.example.toarmybuilder.snesversion.datamodels.components.Element
import com.example.toarmybuilder.snesversion.datamodels.components.Jobs
import com.example.toarmybuilder.snesversion.datamodels.components.classdata.StarterCharacterTemplate

object PresanceTemplate : StarterCharacterTemplate() {
    override val sprite: Int = R.drawable.male_exorcist1
    override val spriteChangeable: Boolean = true
    override val initialLevel: Int = 4
    override val element: Element = Element.EARTH
    override val alignment: CharacterAlignment = CharacterAlignment.LAWFUL

    override val hp: Int = 92
    override val mp: Int = 46
    override val str: Int = 45
    override val vit: Int = 44
    override val int: Int = 46
    override val men: Int = 42
    override val agi: Int = 44
    override val dex: Int = 44
    override val luk: Int = 46

    override val initialClass: CharacterClass = Jobs.Male.Soldier
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