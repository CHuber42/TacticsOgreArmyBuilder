package com.example.toarmybuilder.snesversion.datamodels.components.classdata.charactertemplates.unique

import com.example.toarmybuilder.R
import com.example.toarmybuilder.snesversion.datamodels.components.CharacterAlignment
import com.example.toarmybuilder.snesversion.datamodels.components.CharacterClass
import com.example.toarmybuilder.snesversion.datamodels.components.Element
import com.example.toarmybuilder.snesversion.datamodels.components.Jobs
import com.example.toarmybuilder.snesversion.datamodels.components.classdata.StarterCharacterTemplate

// 3N Route
object TamuzuTemplate : StarterCharacterTemplate() {
    override val sprite: Int = R.drawable.male_knight1
    override val spriteChangeable: Boolean = true
    override val initialLevel: Int = 17
    override val element: Element = Element.WIND
    override val alignment = CharacterAlignment.LAWFUL

    override val hp: Int = 200
    override val mp: Int = 40
    override val str: Int = 129
    override val vit: Int = 100
    override val int: Int = 102
    override val men: Int = 114
    override val agi: Int = 104
    override val dex: Int = 128
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