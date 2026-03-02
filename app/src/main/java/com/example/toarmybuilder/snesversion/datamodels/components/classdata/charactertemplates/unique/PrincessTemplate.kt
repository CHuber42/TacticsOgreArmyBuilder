package com.example.toarmybuilder.snesversion.datamodels.components.classdata.charactertemplates.unique

import com.example.toarmybuilder.R
import com.example.toarmybuilder.snesversion.datamodels.components.CharacterAlignment
import com.example.toarmybuilder.snesversion.datamodels.components.CharacterClass
import com.example.toarmybuilder.snesversion.datamodels.components.Element
import com.example.toarmybuilder.snesversion.datamodels.components.Jobs
import com.example.toarmybuilder.snesversion.datamodels.components.classdata.StarterCharacterTemplate

object PrincessTemplate : StarterCharacterTemplate() {
    // 4L Path
    override val sprite: Int = R.drawable.unique_princess1
    override val spriteChangeable: Boolean = false
    override val initialLevel: Int = 28
    override val element: Element = Element.EARTH
    override val alignment = CharacterAlignment.LAWFUL

    override val hp: Int = 241
    override val mp: Int = 187
    override val str: Int = 160
    override val vit: Int = 133
    override val int: Int = 241
    override val men: Int = 214
    override val agi: Int = 160
    override val dex: Int = 160
    override val luk: Int = 45

    override val initialClass: CharacterClass = Jobs.Unique.Princess
    override val classOptions: List<CharacterClass> =
        listOf(
            Jobs.Unique.Princess
        )
}