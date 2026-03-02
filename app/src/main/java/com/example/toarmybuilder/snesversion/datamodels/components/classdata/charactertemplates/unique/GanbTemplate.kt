package com.example.toarmybuilder.snesversion.datamodels.components.classdata.charactertemplates.unique

import com.example.toarmybuilder.R
import com.example.toarmybuilder.snesversion.datamodels.components.CharacterAlignment
import com.example.toarmybuilder.snesversion.datamodels.components.CharacterClass
import com.example.toarmybuilder.snesversion.datamodels.components.Element
import com.example.toarmybuilder.snesversion.datamodels.components.Jobs
import com.example.toarmybuilder.snesversion.datamodels.components.classdata.StarterCharacterTemplate

object GanbTemplate : StarterCharacterTemplate() {
    //4L Path
    override val sprite: Int = R.drawable.male_beasttamer1 //TODO: Fix with beast tamer sprite
    override val spriteChangeable: Boolean = false
    override val initialLevel: Int = 30
    override val element: Element = Element.WATER
    override val alignment = CharacterAlignment.NEUTRAL

    override val hp: Int = 321
    override val mp: Int = 20
    override val str: Int = 224
    override val vit: Int = 219
    override val int: Int = 145
    override val men: Int = 196
    override val agi: Int = 203
    override val dex: Int = 198
    override val luk: Int = 54

    override val initialClass: CharacterClass = Jobs.Unique.Ganb
    override val classOptions: List<CharacterClass> =
        listOf(
            Jobs.Unique.Ganb
        )
}