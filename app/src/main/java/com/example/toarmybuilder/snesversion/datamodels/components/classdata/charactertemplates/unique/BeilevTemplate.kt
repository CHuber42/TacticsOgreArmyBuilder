package com.example.toarmybuilder.snesversion.datamodels.components.classdata.charactertemplates.unique

import com.example.toarmybuilder.R
import com.example.toarmybuilder.snesversion.datamodels.components.CharacterAlignment
import com.example.toarmybuilder.snesversion.datamodels.components.CharacterClass
import com.example.toarmybuilder.snesversion.datamodels.components.Element
import com.example.toarmybuilder.snesversion.datamodels.components.Jobs
import com.example.toarmybuilder.snesversion.datamodels.components.classdata.StarterCharacterTemplate

object BeilevTemplate : StarterCharacterTemplate() {
    //3L Route
    override val sprite: Int = R.drawable.male_exorcist1
    override val spriteChangeable: Boolean = true
    override val initialLevel: Int = 21
    override val element: Element = Element.EARTH
    override val alignment = CharacterAlignment.LAWFUL

    override val hp: Int = 204
    override val mp: Int = 128
    override val str: Int = 109
    override val vit: Int = 120
    override val int: Int = 170
    override val men: Int = 138
    override val agi: Int = 108
    override val dex: Int = 124
    override val luk: Int = 50

    override val initialClass: CharacterClass = Jobs.Male.Exorcist
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