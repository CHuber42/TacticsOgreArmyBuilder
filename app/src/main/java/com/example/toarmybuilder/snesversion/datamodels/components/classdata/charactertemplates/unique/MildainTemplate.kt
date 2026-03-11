package com.example.toarmybuilder.snesversion.datamodels.components.classdata.charactertemplates.unique

import com.example.toarmybuilder.R
import com.example.toarmybuilder.snesversion.datamodels.components.CharacterAlignment
import com.example.toarmybuilder.snesversion.datamodels.components.CharacterClass
import com.example.toarmybuilder.snesversion.datamodels.components.Element
import com.example.toarmybuilder.snesversion.datamodels.components.Jobs
import com.example.toarmybuilder.snesversion.datamodels.components.classdata.StarterCharacterTemplate

object MildainTemplate : StarterCharacterTemplate() {
    // 3L Path
    override val sprite: Int = R.drawable.unique_mildain1
    override val spriteChangeable: Boolean = false
    override val initialLevel: Int = 21
    override val element: Element = Element.EARTH
    override val alignment = CharacterAlignment.LAWFUL

    override val hp: Int = 245
    override val mp: Int = 0
    override val str: Int = 142
    override val vit: Int = 137
    override val int: Int = 139
    override val men: Int = 155
    override val agi: Int = 174
    override val dex: Int = 160
    override val luk: Int = 52

    override val initialClass: CharacterClass = Jobs.Unique.Mildain
    override val classOptions: List<CharacterClass> =
        listOf(
            Jobs.Unique.Mildain
        )
}

// 3C Route
object MildainTemplate : StarterCharacterTemplate() {
    // 3C Path
    override val sprite: Int = R.drawable.unique_mildain1
    override val spriteChangeable: Boolean = false
    override val initialLevel: Int = 22
    override val element: Element = Element.EARTH
    override val alignment = CharacterAlignment.LAWFUL

    override val hp: Int = 254
    override val mp: Int = 0
    override val str: Int = 148
    override val vit: Int = 143
    override val int: Int = 145
    override val men: Int = 162
    override val agi: Int = 181
    override val dex: Int = 167
    override val luk: Int = 52

    override val initialClass: CharacterClass = Jobs.Unique.Mildain
    override val classOptions: List<CharacterClass> =
        listOf(
            Jobs.Unique.Mildain
        )
}

object MildainTemplate : StarterCharacterTemplate() {
    // 3N Path
    override val sprite: Int = R.drawable.unique_mildain1
    override val spriteChangeable: Boolean = false
    override val initialLevel: Int = 17
    override val element: Element = Element.EARTH
    override val alignment = CharacterAlignment.LAWFUL

    override val hp: Int = 209
    override val mp: Int = 0
    override val str: Int = 118
    override val vit: Int = 113
    override val int: Int = 115
    override val men: Int = 127
    override val agi: Int = 146
    override val dex: Int = 132
    override val luk: Int = 52

    override val initialClass: CharacterClass = Jobs.Unique.Mildain
    override val classOptions: List<CharacterClass> =
        listOf(
            Jobs.Unique.Mildain
        )
}