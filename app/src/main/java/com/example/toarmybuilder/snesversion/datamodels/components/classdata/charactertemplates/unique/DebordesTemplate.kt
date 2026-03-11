package com.example.toarmybuilder.snesversion.datamodels.components.classdata.charactertemplates.unique

import com.example.toarmybuilder.R
import com.example.toarmybuilder.snesversion.datamodels.components.CharacterAlignment
import com.example.toarmybuilder.snesversion.datamodels.components.CharacterClass
import com.example.toarmybuilder.snesversion.datamodels.components.Element
import com.example.toarmybuilder.snesversion.datamodels.components.Jobs
import com.example.toarmybuilder.snesversion.datamodels.components.classdata.StarterCharacterTemplate

object DebordesTemplate : StarterCharacterTemplate() {
    override val sprite: Int = R.drawable.male_terrorknight1
    override val spriteChangeable: Boolean = true
    override val initialLevel: Int = 18
    override val element: Element = Element.EARTH
    override val alignment = CharacterAlignment.CHAOTIC

    override val hp: Int = 242
    override val mp: Int = 25
    override val str: Int = 143
    override val vit: Int = 128
    override val int: Int = 98
    override val men: Int = 136
    override val agi: Int = 110
    override val dex: Int = 128
    override val luk: Int = 42

    override val initialClass: CharacterClass = Jobs.Male.TerrorKnight
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