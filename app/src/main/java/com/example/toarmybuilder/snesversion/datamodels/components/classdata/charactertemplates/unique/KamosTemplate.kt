package com.example.toarmybuilder.snesversion.datamodels.components.classdata.charactertemplates.unique

import com.example.toarmybuilder.R
import com.example.toarmybuilder.snesversion.datamodels.components.CharacterAlignment
import com.example.toarmybuilder.snesversion.datamodels.components.CharacterClass
import com.example.toarmybuilder.snesversion.datamodels.components.Element
import com.example.toarmybuilder.snesversion.datamodels.components.Jobs
import com.example.toarmybuilder.snesversion.datamodels.components.classdata.StarterCharacterTemplate

// 3N Route
object KamosTemplate : StarterCharacterTemplate() {
    override val sprite: Int = R.drawable.male_wizard1
    override val spriteChangeable: Boolean = true
    override val initialLevel: Int = 17
    override val element: Element = Element.FIRE
    override val alignment = CharacterAlignment.NEUTRAL

    override val hp: Int = 164
    override val mp: Int = 106
    override val str: Int = 93
    override val vit: Int = 76
    override val int: Int = 145
    override val men: Int = 132
    override val agi: Int = 104
    override val dex: Int = 104
    override val luk: Int = 50

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