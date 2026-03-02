package com.example.toarmybuilder.snesversion.datamodels.components.classdata.charactertemplates.unique

import com.example.toarmybuilder.R
import com.example.toarmybuilder.snesversion.datamodels.components.CharacterAlignment
import com.example.toarmybuilder.snesversion.datamodels.components.CharacterClass
import com.example.toarmybuilder.snesversion.datamodels.components.Element
import com.example.toarmybuilder.snesversion.datamodels.components.Jobs
import com.example.toarmybuilder.snesversion.datamodels.components.classdata.StarterCharacterTemplate

object ZapanTemplate : StarterCharacterTemplate() {
    // 2L Route
    override val sprite: Int = R.drawable.male_berserker1
    override val spriteChangeable: Boolean = true
    override val initialLevel: Int = 10
    override val element: Element = Element.WIND
    override val alignment: CharacterAlignment = CharacterAlignment.CHAOTIC

    override val hp: Int = 158
    override val mp: Int = 28
    override val str: Int = 87
    override val vit: Int = 76
    override val int: Int = 66
    override val men: Int = 84
    override val agi: Int = 74
    override val dex: Int = 80
    override val luk: Int = 59

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