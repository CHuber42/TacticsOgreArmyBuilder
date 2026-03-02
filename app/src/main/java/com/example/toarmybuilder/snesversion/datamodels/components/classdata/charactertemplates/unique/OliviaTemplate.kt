package com.example.toarmybuilder.snesversion.datamodels.components.classdata.charactertemplates.unique

import com.example.toarmybuilder.R
import com.example.toarmybuilder.snesversion.datamodels.components.CharacterAlignment
import com.example.toarmybuilder.snesversion.datamodels.components.CharacterClass
import com.example.toarmybuilder.snesversion.datamodels.components.Element
import com.example.toarmybuilder.snesversion.datamodels.components.Jobs
import com.example.toarmybuilder.snesversion.datamodels.components.classdata.StarterCharacterTemplate

object OliviaTemplate : StarterCharacterTemplate() {
    // 4L Path
    override val sprite: Int = R.drawable.unique_waterolivia1
    override val spriteChangeable: Boolean = false
    override val initialLevel: Int = 25
    override val element: Element = Element.WATER
    override val alignment = CharacterAlignment.LAWFUL

    override val hp: Int = 234
    override val mp: Int = 157
    override val str: Int = 138
    override val vit: Int = 113
    override val int: Int = 229
    override val men: Int = 195
    override val agi: Int = 138
    override val dex: Int = 141
    override val luk: Int = 55

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
            Jobs.Female.AngelKnight,
            Jobs.Unique.Sisteena
        )
}