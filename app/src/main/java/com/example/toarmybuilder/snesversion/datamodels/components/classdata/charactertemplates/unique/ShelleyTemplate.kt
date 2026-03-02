package com.example.toarmybuilder.snesversion.datamodels.components.classdata.charactertemplates.unique

import com.example.toarmybuilder.R
import com.example.toarmybuilder.snesversion.datamodels.components.CharacterAlignment
import com.example.toarmybuilder.snesversion.datamodels.components.CharacterClass
import com.example.toarmybuilder.snesversion.datamodels.components.Element
import com.example.toarmybuilder.snesversion.datamodels.components.Jobs
import com.example.toarmybuilder.snesversion.datamodels.components.classdata.StarterCharacterTemplate

object ShelleyTemplate : StarterCharacterTemplate() {
    // 4L Path
    override val sprite: Int = R.drawable.unique_earthshelley1
    override val spriteChangeable: Boolean = false
    override val initialLevel: Int = 27
    override val element: Element = Element.EARTH
    override val alignment = CharacterAlignment.LAWFUL

    override val hp: Int = 229
    override val mp: Int = 172
    override val str: Int = 146
    override val vit: Int = 119
    override val int: Int = 242
    override val men: Int = 203
    override val agi: Int = 147
    override val dex: Int = 166
    override val luk: Int = 52

    override val initialClass: CharacterClass = Jobs.Female.Siren
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