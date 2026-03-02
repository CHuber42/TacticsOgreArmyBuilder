package com.example.toarmybuilder.snesversion.datamodels.components.classdata.charactertemplates.unique

import com.example.toarmybuilder.R
import com.example.toarmybuilder.snesversion.datamodels.components.CharacterAlignment
import com.example.toarmybuilder.snesversion.datamodels.components.CharacterClass
import com.example.toarmybuilder.snesversion.datamodels.components.Element
import com.example.toarmybuilder.snesversion.datamodels.components.Jobs
import com.example.toarmybuilder.snesversion.datamodels.components.classdata.StarterCharacterTemplate

object RadlumTemplate : StarterCharacterTemplate() {
    //4L Route
    override val sprite: Int = R.drawable.male_warlock1
    override val spriteChangeable: Boolean = true
    override val initialLevel: Int = 28
    override val element: Element = Element.WATER
    override val alignment = CharacterAlignment.NEUTRAL

    override val hp: Int = 236
    override val mp: Int = 206
    override val str: Int = 141
    override val vit: Int = 98
    override val int: Int = 220
    override val men: Int = 238
    override val agi: Int = 150
    override val dex: Int = 150
    override val luk: Int = 54

    override val initialClass: CharacterClass = Jobs.Male.Warlock
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