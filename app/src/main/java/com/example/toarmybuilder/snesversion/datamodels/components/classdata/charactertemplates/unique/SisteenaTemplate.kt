package com.example.toarmybuilder.snesversion.datamodels.components.classdata.charactertemplates.unique

import com.example.toarmybuilder.R
import com.example.toarmybuilder.snesversion.datamodels.components.CharacterAlignment
import com.example.toarmybuilder.snesversion.datamodels.components.CharacterClass
import com.example.toarmybuilder.snesversion.datamodels.components.Element
import com.example.toarmybuilder.snesversion.datamodels.components.Jobs
import com.example.toarmybuilder.snesversion.datamodels.components.classdata.StarterCharacterTemplate

object SisteenaTemplate : StarterCharacterTemplate() {
    override val sprite: Int = R.drawable.unique_windsisteena1
    override val spriteChangeable: Boolean = false
    override val initialLevel: Int = 13
    override val element: Element = Element.WIND
    override val alignment = CharacterAlignment.NEUTRAL

    override val hp: Int = 169
    override val mp: Int = 52
    override val str: Int = 98
    override val vit: Int = 85
    override val int: Int = 96
    override val men: Int = 95
    override val agi: Int = 98
    override val dex: Int = 100
    override val luk: Int = 48

    override val initialClass: CharacterClass = Jobs.Female.Amazon
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