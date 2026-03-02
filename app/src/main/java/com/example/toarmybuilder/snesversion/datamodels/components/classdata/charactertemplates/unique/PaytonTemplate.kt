package com.example.toarmybuilder.snesversion.datamodels.components.classdata.charactertemplates.unique

import com.example.toarmybuilder.R
import com.example.toarmybuilder.snesversion.datamodels.components.CharacterAlignment
import com.example.toarmybuilder.snesversion.datamodels.components.CharacterClass
import com.example.toarmybuilder.snesversion.datamodels.components.Element
import com.example.toarmybuilder.snesversion.datamodels.components.Jobs
import com.example.toarmybuilder.snesversion.datamodels.components.classdata.StarterCharacterTemplate

object PaytonTemplate : StarterCharacterTemplate() {
    //3L Route
    override val sprite: Int = R.drawable.male_knight1
    override val spriteChangeable: Boolean = true
    override val initialLevel: Int = 21
    override val element: Element = Element.WIND
    override val alignment = CharacterAlignment.NEUTRAL

    override val hp: Int = 236
    override val mp: Int = 48
    override val str: Int = 157
    override val vit: Int = 120
    override val int: Int = 122
    override val men: Int = 138
    override val agi: Int = 124
    override val dex: Int = 156
    override val luk: Int = 50

    override val initialClass: CharacterClass = Jobs.Male.Knight
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