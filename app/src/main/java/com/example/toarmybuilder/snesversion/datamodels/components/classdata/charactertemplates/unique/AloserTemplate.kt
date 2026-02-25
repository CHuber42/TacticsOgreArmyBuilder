package com.example.toarmybuilder.snesversion.datamodels.components.classdata.charactertemplates.unique

import com.example.toarmybuilder.R
import com.example.toarmybuilder.snesversion.datamodels.components.CharacterAlignment
import com.example.toarmybuilder.snesversion.datamodels.components.CharacterClass
import com.example.toarmybuilder.snesversion.datamodels.components.Element
import com.example.toarmybuilder.snesversion.datamodels.components.Jobs
import com.example.toarmybuilder.snesversion.datamodels.components.classdata.StarterCharacterTemplate

object AloserTemplate : StarterCharacterTemplate() {
    override val sprite: Int = R.drawable.female_archer1
    override val spriteChangeable: Boolean = true
    override val initialLevel: Int = 9
    override val element: Element = Element.WIND
    override val alignment = CharacterAlignment.NEUTRAL

    override val hp: Int = 137
    override val mp: Int = 31
    override val str: Int = 69
    override val vit: Int = 70
    override val int: Int = 67
    override val men: Int = 71
    override val agi: Int = 79
    override val dex: Int = 89
    override val luk: Int = 53

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