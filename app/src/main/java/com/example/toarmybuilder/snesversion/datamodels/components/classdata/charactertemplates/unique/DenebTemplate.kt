package com.example.toarmybuilder.snesversion.datamodels.components.classdata.charactertemplates.unique

import com.example.toarmybuilder.R
import com.example.toarmybuilder.snesversion.datamodels.components.CharacterAlignment
import com.example.toarmybuilder.snesversion.datamodels.components.CharacterClass
import com.example.toarmybuilder.snesversion.datamodels.components.Element
import com.example.toarmybuilder.snesversion.datamodels.components.Jobs
import com.example.toarmybuilder.snesversion.datamodels.components.classdata.StarterCharacterTemplate

// 4N + 4L Route
object DenebTemplate : StarterCharacterTemplate() {
    override val sprite: Int = R.drawable.female_witch1
    override val spriteChangeable: Boolean = false
    override val initialLevel: Int = 25
    override val element: Element = Element.FIRE
    override val alignment = CharacterAlignment.CHAOTIC

    override val hp: Int = 216
    override val mp: Int = 160
    override val str: Int = 128
    override val vit: Int = 124
    override val int: Int = 189
    override val men: Int = 209
    override val agi: Int = 149
    override val dex: Int = 151
    override val luk: Int = 70

    override val initialClass: CharacterClass = Jobs.Unique.PreRecruit //todo: Sorc
    override val classOptions: List<CharacterClass> =
        listOf( // TODO: Sorc
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