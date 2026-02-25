package com.example.toarmybuilder.snesversion.datamodels.components.classdata.unique

import com.example.toarmybuilder.R
import com.example.toarmybuilder.snesversion.datamodels.components.CharacterAlignment
import com.example.toarmybuilder.snesversion.datamodels.components.CharacterClass
import com.example.toarmybuilder.snesversion.datamodels.components.Element

object Princess : CharacterClass() {
    // Title Attributes
    override val name: String = "Princess"
    override val sprite : Int = R.drawable.unique_princess1

    // Stat Growths
    override val hp: Int = 8
    override val mp: Int = 6
    override val str: Int = 5
    override val vit: Int = 4
    override val int: Int = 8
    override val men: Int = 7
    override val agi: Int = 5
    override val dex: Int = 5

    // Constant Stats
    override val movement: Int = 5
    override val wt: Int = 0

    // Alignment and Element Attributes
    override val acceptableCharacterAlignment: List<CharacterAlignment> = listOf(
        CharacterAlignment.LAWFUL
    )
    override val acceptableElement: List<Element> = listOf(
        Element.WIND,
        Element.EARTH,
        Element.WATER,
        Element.FIRE
    )

    // Movement Modifiers
    override val fly: Boolean = false
    override val teleport: Boolean = false
    override val walkInWater: Boolean = false
    override val walkOnLava: Boolean = false
}