package com.example.toarmybuilder.snesversion.datamodels.components.classdata.demihuman

import com.example.toarmybuilder.R
import com.example.toarmybuilder.snesversion.datamodels.components.CharacterAlignment
import com.example.toarmybuilder.snesversion.datamodels.components.CharacterClass
import com.example.toarmybuilder.snesversion.datamodels.components.Element

object Hawkman : CharacterClass() {
    // Title Attributes
    override val name: String = "Hawkman"
    override val sprite : Int = R.drawable.demi_hawkman1

    // Stat Growths
    override val hp: Int = 7
    override val mp: Int = 3
    override val str: Int = 5
    override val vit: Int = 3
    override val int: Int = 5
    override val men: Int = 5
    override val agi: Int = 6
    override val dex: Int = 6

    // Constant Stats
    override val movement: Int = 6
    override val wt: Int = 0

    // Alignment and Element Attributes
    override val acceptableCharacterAlignment: List<CharacterAlignment> = listOf(
        CharacterAlignment.LAWFUL,
        CharacterAlignment.NEUTRAL,
        CharacterAlignment.CHAOTIC
    )
    override val acceptableElement: List<Element> = listOf(
        Element.WIND,
        Element.EARTH,
        Element.WATER,
        Element.FIRE
    )

    // Movement Modifiers
    override val fly: Boolean = true
    override val teleport: Boolean = false
    override val walkInWater: Boolean = false
    override val walkOnLava: Boolean = false
}