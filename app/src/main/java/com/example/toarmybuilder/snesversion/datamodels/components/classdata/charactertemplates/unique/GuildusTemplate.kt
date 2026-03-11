package com.example.toarmybuilder.snesversion.datamodels.components.classdata.charactertemplates.unique

import com.example.toarmybuilder.R
import com.example.toarmybuilder.snesversion.datamodels.components.CharacterAlignment
import com.example.toarmybuilder.snesversion.datamodels.components.CharacterClass
import com.example.toarmybuilder.snesversion.datamodels.components.Element
import com.example.toarmybuilder.snesversion.datamodels.components.Jobs
import com.example.toarmybuilder.snesversion.datamodels.components.classdata.StarterCharacterTemplate

object GuildusTemplate : StarterCharacterTemplate() {
    // 3L Route
    override val sprite: Int = R.drawable.unique_guildus1
    override val spriteChangeable: Boolean = false
    override val initialLevel: Int = 21
    override val element: Element = Element.WATER
    override val alignment = CharacterAlignment.LAWFUL

    override val hp: Int = 247
    override val mp: Int = 0
    override val str: Int = 158
    override val vit: Int = 138
    override val int: Int = 124
    override val men: Int = 155
    override val agi: Int = 159
    override val dex: Int = 176
    override val luk: Int = 53

    override val initialClass: CharacterClass = Jobs.Unique.Guildus
    override val classOptions: List<CharacterClass> =
        listOf(
            Jobs.Unique.Guildus
        )
}

// 3C Route
object GuildusTemplate : StarterCharacterTemplate() {
    // 3C Route
    override val sprite: Int = R.drawable.unique_guildus1
    override val spriteChangeable: Boolean = false
    override val initialLevel: Int = 22
    override val element: Element = Element.WATER
    override val alignment = CharacterAlignment.LAWFUL

    override val hp: Int = 256
    override val mp: Int = 0
    override val str: Int = 165
    override val vit: Int = 144
    override val int: Int = 129
    override val men: Int = 162
    override val agi: Int = 165
    override val dex: Int = 184
    override val luk: Int = 53

    override val initialClass: CharacterClass = Jobs.Unique.Guildus
    override val classOptions: List<CharacterClass> =
        listOf(
            Jobs.Unique.Guildus
        )
}