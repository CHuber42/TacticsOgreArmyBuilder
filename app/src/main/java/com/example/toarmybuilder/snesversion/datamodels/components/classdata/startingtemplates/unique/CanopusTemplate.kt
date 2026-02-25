package com.example.toarmybuilder.snesversion.datamodels.components.classdata.startingtemplates.unique

import com.example.toarmybuilder.R
import com.example.toarmybuilder.snesversion.datamodels.components.CharacterAlignment
import com.example.toarmybuilder.snesversion.datamodels.components.CharacterClass
import com.example.toarmybuilder.snesversion.datamodels.components.Element
import com.example.toarmybuilder.snesversion.datamodels.components.Jobs
import com.example.toarmybuilder.snesversion.datamodels.components.classdata.StarterCharacterTemplate

object CanopusTemplate : StarterCharacterTemplate() {
    override val sprite: Int = R.drawable.unique_canopus1
    override val spriteChangeable: Boolean = false
    override val initialLevel: Int = 3
    override val element: Element = Element.WIND
    override val alignment = CharacterAlignment.LAWFUL

    override val hp: Int = 91
    override val mp: Int = 0
    override val str: Int = 39
    override val vit: Int = 35
    override val int: Int = 38
    override val men: Int = 36
    override val agi: Int = 37
    override val dex: Int = 33
    override val luk: Int = 55

    override val initialClass: CharacterClass = Jobs.Unique.Canopus
    override val classOptions: List<CharacterClass> =
        listOf(
            Jobs.Unique.Canopus
        )
}