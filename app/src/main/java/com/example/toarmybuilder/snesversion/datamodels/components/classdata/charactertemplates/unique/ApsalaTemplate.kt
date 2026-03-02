package com.example.toarmybuilder.snesversion.datamodels.components.classdata.charactertemplates.unique

import com.example.toarmybuilder.R
import com.example.toarmybuilder.snesversion.datamodels.components.CharacterAlignment
import com.example.toarmybuilder.snesversion.datamodels.components.CharacterClass
import com.example.toarmybuilder.snesversion.datamodels.components.Element
import com.example.toarmybuilder.snesversion.datamodels.components.Jobs
import com.example.toarmybuilder.snesversion.datamodels.components.classdata.StarterCharacterTemplate

object ApsalaTemplate : StarterCharacterTemplate() {
    // 3L Path
    override val sprite: Int = R.drawable.female_priest1
    override val spriteChangeable: Boolean = true
    override val initialLevel: Int = 21
    override val element: Element = Element.FIRE
    override val alignment: CharacterAlignment = CharacterAlignment.LAWFUL

    override val hp: Int = 196
    override val mp: Int = 122
    override val str: Int = 118
    override val vit: Int = 98
    override val int: Int = 184
    override val men: Int = 159
    override val agi: Int = 118
    override val dex: Int = 116

    override val initialClass: CharacterClass = Jobs.Female.Priest
    override val classOptions: List<CharacterClass> =
        listOf(
            Jobs.Female.Amazon,
            Jobs.Female.Archer,
            Jobs.Female.Valkyrie,
            Jobs.Female.Cleric,
            Jobs.Female.Witch,
            Jobs.Female.DragonTamer,
            Jobs.Female.Siren,
            Jobs.Female.Priest,
            Jobs.Female.AngelKnight
        )
}