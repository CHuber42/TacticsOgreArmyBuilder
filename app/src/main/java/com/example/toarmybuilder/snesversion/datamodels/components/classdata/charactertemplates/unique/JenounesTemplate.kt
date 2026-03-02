package com.example.toarmybuilder.snesversion.datamodels.components.classdata.charactertemplates.unique

import com.example.toarmybuilder.R
import com.example.toarmybuilder.snesversion.datamodels.components.CharacterAlignment
import com.example.toarmybuilder.snesversion.datamodels.components.CharacterClass
import com.example.toarmybuilder.snesversion.datamodels.components.Element
import com.example.toarmybuilder.snesversion.datamodels.components.Jobs
import com.example.toarmybuilder.snesversion.datamodels.components.classdata.StarterCharacterTemplate

object JenounesTemplate : StarterCharacterTemplate() {
    // 2L Route
    override val sprite: Int = R.drawable.male_dragoon1
    override val spriteChangeable: Boolean = true
    override val initialLevel: Int = 18
    override val element: Element = Element.FIRE
    override val alignment: CharacterAlignment = CharacterAlignment.NEUTRAL

    override val hp: Int = 225
    override val mp: Int = 25
    override val str: Int = 147
    override val vit: Int = 110
    override val int: Int = 108
    override val men: Int = 122
    override val agi: Int = 110
    override val dex: Int = 146
    override val luk: Int = 52

    override val initialClass: CharacterClass = Jobs.Male.Dragoon
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