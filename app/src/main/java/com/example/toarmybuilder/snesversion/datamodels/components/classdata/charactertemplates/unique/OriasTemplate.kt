package com.example.toarmybuilder.snesversion.datamodels.components.classdata.charactertemplates.unique

import com.example.toarmybuilder.R
import com.example.toarmybuilder.snesversion.datamodels.components.CharacterAlignment
import com.example.toarmybuilder.snesversion.datamodels.components.CharacterClass
import com.example.toarmybuilder.snesversion.datamodels.components.Element
import com.example.toarmybuilder.snesversion.datamodels.components.Jobs
import com.example.toarmybuilder.snesversion.datamodels.components.classdata.StarterCharacterTemplate

object OriasTemplate : StarterCharacterTemplate() {
    override val sprite: Int = R.drawable.female_priest1
    override val spriteChangeable: Boolean = true
    override val initialLevel: Int = 18
    override val element: Element = Element.FIRE
    override val alignment: CharacterAlignment = CharacterAlignment.LAWFUL

    override val hp: Int = 184
    override val mp: Int = 108
    override val str: Int = 110
    override val vit: Int = 91
    override val int: Int = 158
    override val men: Int = 139
    override val agi: Int = 110
    override val dex: Int = 106
    override val luk: Int = 47

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