package com.example.toarmybuilder.snesversion.datamodels.components.classdata.charactertemplates.unique

import com.example.toarmybuilder.R
import com.example.toarmybuilder.snesversion.datamodels.components.CharacterAlignment
import com.example.toarmybuilder.snesversion.datamodels.components.CharacterClass
import com.example.toarmybuilder.snesversion.datamodels.components.Element
import com.example.toarmybuilder.snesversion.datamodels.components.Jobs
import com.example.toarmybuilder.snesversion.datamodels.components.classdata.StarterCharacterTemplate

object KachuaTemplate : StarterCharacterTemplate() {
    // TODO: Possibly Changeable based on recruitment in later chapter?
    override val sprite: Int = R.drawable.unique_kachua1
    override val spriteChangeable: Boolean = false
    override val initialLevel: Int = 2
    override val element: Element = Element.EARTH
    override val alignment = CharacterAlignment.NEUTRAL

    override val hp: Int = 76
    override val mp: Int = 28
    override val str: Int = 34
    override val vit: Int = 32
    override val int: Int = 26
    override val men: Int = 27
    override val agi: Int = 20
    override val dex: Int = 39
    override val luk: Int = 45

    override val initialClass: CharacterClass = Jobs.Unique.HighPriest
    override val classOptions: List<CharacterClass> =
        listOf(
            Jobs.Unique.HighPriest
        )
}