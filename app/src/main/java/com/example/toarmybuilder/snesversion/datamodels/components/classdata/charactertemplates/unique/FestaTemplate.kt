package com.example.toarmybuilder.snesversion.datamodels.components.classdata.charactertemplates.unique

import com.example.toarmybuilder.R
import com.example.toarmybuilder.snesversion.datamodels.components.CharacterAlignment
import com.example.toarmybuilder.snesversion.datamodels.components.CharacterClass
import com.example.toarmybuilder.snesversion.datamodels.components.Element
import com.example.toarmybuilder.snesversion.datamodels.components.Jobs
import com.example.toarmybuilder.snesversion.datamodels.components.classdata.StarterCharacterTemplate

// 3N Route
object FestaTemplate : StarterCharacterTemplate() {
    override val sprite: Int = R.drawable.female_valkyrie1
    override val spriteChangeable: Boolean = true
    override val initialLevel: Int = 17
    override val element: Element = Element.EARTH
    override val alignment = CharacterAlignment.LAWFUL

    override val hp: Int = 198
    override val mp: Int = 52
    override val str: Int = 128
    override val vit: Int = 100
    override val int: Int = 126
    override val men: Int = 113
    override val agi: Int = 104
    override val dex: Int = 118
    override val luk: Int = 50

    override val initialClass: CharacterClass = Jobs.Female.Valkyrie
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