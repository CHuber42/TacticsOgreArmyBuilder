package com.example.toarmybuilder.snesversion.datamodels.components.classdata.charactertemplates.unique

import com.example.toarmybuilder.R
import com.example.toarmybuilder.snesversion.datamodels.components.CharacterAlignment
import com.example.toarmybuilder.snesversion.datamodels.components.CharacterClass
import com.example.toarmybuilder.snesversion.datamodels.components.Element
import com.example.toarmybuilder.snesversion.datamodels.components.Jobs
import com.example.toarmybuilder.snesversion.datamodels.components.classdata.StarterCharacterTemplate

// 3C Route
object SelyeTemplate : StarterCharacterTemplate() {
    override val sprite: Int = R.drawable.unique_fireselye1
    override val spriteChangeable: Boolean = false
    override val initialLevel: Int = 22
    override val element: Element = Element.FIRE
    override val alignment = CharacterAlignment.NEUTRAL

    override val hp: Int = 259
    override val mp: Int = 70
    override val str: Int = 170
    override val vit: Int = 130
    override val int: Int = 168
    override val men: Int = 149
    override val agi: Int = 134
    override val dex: Int = 154
    override val luk: Int = 45

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
            Jobs.Female.AngelKnight,
            Jobs.Unique.Selye
        )
}

// 4N Route: Has Volcano Spear
object SelyeTemplate : StarterCharacterTemplate() {
    override val sprite: Int = R.drawable.unique_fireselye1
    override val spriteChangeable: Boolean = false
    override val initialLevel: Int = 28
    override val element: Element = Element.FIRE
    override val alignment = CharacterAlignment.NEUTRAL

    override val hp: Int = 313
    override val mp: Int = 88
    override val str: Int = 212
    override val vit: Int = 160
    override val int: Int = 210
    override val men: Int = 185
    override val agi: Int = 164
    override val dex: Int = 190
    override val luk: Int = 45

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
            Jobs.Female.AngelKnight,
            Jobs.Unique.Selye
        )
}