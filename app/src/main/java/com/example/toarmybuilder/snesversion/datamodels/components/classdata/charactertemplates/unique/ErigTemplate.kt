package com.example.toarmybuilder.snesversion.datamodels.components.classdata.charactertemplates.unique

import com.example.toarmybuilder.R
import com.example.toarmybuilder.snesversion.datamodels.components.CharacterAlignment
import com.example.toarmybuilder.snesversion.datamodels.components.CharacterClass
import com.example.toarmybuilder.snesversion.datamodels.components.Element
import com.example.toarmybuilder.snesversion.datamodels.components.Jobs
import com.example.toarmybuilder.snesversion.datamodels.components.classdata.StarterCharacterTemplate

// 4N
object ErigTemplate : StarterCharacterTemplate() {
    override val sprite: Int = R.drawable.male_exorcist1
    override val spriteChangeable: Boolean = true
    override val initialLevel: Int = 28
    override val element: Element = Element.WATER
    override val alignment = CharacterAlignment.LAWFUL

    override val hp: Int = 253
    override val mp: Int = 177
    override val str: Int = 137
    override val vit: Int = 155
    override val int: Int = 226
    override val men: Int = 180
    override val agi: Int = 136
    override val dex: Int = 159
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