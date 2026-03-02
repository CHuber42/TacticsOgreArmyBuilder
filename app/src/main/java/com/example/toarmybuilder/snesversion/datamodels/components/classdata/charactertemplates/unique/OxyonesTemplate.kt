package com.example.toarmybuilder.snesversion.datamodels.components.classdata.charactertemplates.unique

import com.example.toarmybuilder.R
import com.example.toarmybuilder.snesversion.datamodels.components.CharacterAlignment
import com.example.toarmybuilder.snesversion.datamodels.components.CharacterClass
import com.example.toarmybuilder.snesversion.datamodels.components.Element
import com.example.toarmybuilder.snesversion.datamodels.components.Jobs
import com.example.toarmybuilder.snesversion.datamodels.components.classdata.StarterCharacterTemplate

object OxyonesTemplate : StarterCharacterTemplate() {
    // 4L Path
    override val sprite: Int = R.drawable.female_dragoner1
    override val spriteChangeable: Boolean = true
    override val initialLevel: Int = 30
    override val element: Element = Element.WATER
    override val alignment = CharacterAlignment.LAWFUL

    override val hp: Int = 330
    override val mp: Int = 78
    override val str: Int = 226
    override val vit: Int = 138
    override val int: Int = 208
    override val men: Int = 213
    override val agi: Int = 174
    override val dex: Int = 218
    override val luk: Int = 56

    override val initialClass: CharacterClass = Jobs.Female.DragonTamer
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
            Jobs.Female.AngelKnight,
            Jobs.Unique.Sisteena
        )
}