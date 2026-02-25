package com.example.toarmybuilder.snesversion.datamodels.components.classdata.charactertemplates.unique

import com.example.toarmybuilder.R
import com.example.toarmybuilder.snesversion.datamodels.components.CharacterAlignment
import com.example.toarmybuilder.snesversion.datamodels.components.CharacterClass
import com.example.toarmybuilder.snesversion.datamodels.components.Element
import com.example.toarmybuilder.snesversion.datamodels.components.Jobs
import com.example.toarmybuilder.snesversion.datamodels.components.classdata.StarterCharacterTemplate

object VoltelTemplate : StarterCharacterTemplate() {
    override val sprite: Int = R.drawable.male_knight1
    override val spriteChangeable: Boolean = true
    override val initialLevel: Int = 5
    override val element: Element = Element.FIRE
    override val alignment: CharacterAlignment = CharacterAlignment.LAWFUL

    override val hp: Int = 92
    override val mp: Int = 16
    override val str: Int = 45
    override val vit: Int = 40
    override val int: Int = 42
    override val men: Int = 42
    override val agi: Int = 44
    override val dex: Int = 44

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