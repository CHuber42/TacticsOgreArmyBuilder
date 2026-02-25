package com.example.toarmybuilder.snesversion.datamodels.components.classdata.startingtemplates.unique

import com.example.toarmybuilder.R
import com.example.toarmybuilder.snesversion.datamodels.components.CharacterAlignment
import com.example.toarmybuilder.snesversion.datamodels.components.CharacterClass
import com.example.toarmybuilder.snesversion.datamodels.components.Element
import com.example.toarmybuilder.snesversion.datamodels.components.Jobs
import com.example.toarmybuilder.snesversion.datamodels.components.classdata.StarterCharacterTemplate

object SaraTemplate : StarterCharacterTemplate() {
    override val sprite: Int = R.drawable.female_archer1
    override val spriteChangeable: Boolean = true
    override val initialLevel: Int = 5
    override val element: Element = Element.WIND
    override val alignment: CharacterAlignment = CharacterAlignment.NEUTRAL

    override val hp: Int = 90
    override val mp: Int = 16
    override val str: Int = 44
    override val vit: Int = 40
    override val int: Int = 42
    override val men: Int = 41
    override val agi: Int = 44
    override val dex: Int = 47

    override val initialClass: CharacterClass = Jobs.Female.Archer
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