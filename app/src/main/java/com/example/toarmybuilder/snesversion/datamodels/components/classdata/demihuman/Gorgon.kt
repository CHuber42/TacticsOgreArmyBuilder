package com.example.toarmybuilder.snesversion.datamodels.components.classdata.demihuman

import com.example.toarmybuilder.R
import com.example.toarmybuilder.snesversion.datamodels.components.CharacterAlignment
import com.example.toarmybuilder.snesversion.datamodels.components.CharacterClass
import com.example.toarmybuilder.snesversion.datamodels.components.Element

object Gorgon : CharacterClass() {
    // Title Attributes
    override val name: String = "Gorgon"
    override val sprite : Int = R.drawable.demi_gorgon1

    // Stat Growths
    override val hp: Int = 7
    override val mp: Int = 0
    override val str: Int = 5
    override val vit: Int = 4
    override val int: Int = 5
    override val men: Int = 5
    override val agi: Int = 6
    override val dex: Int = 6

    // Constant Stats
    override val movement: Int = 5
    override val wt: Int = 45

    // Alignment and Element Attributes
    override val acceptableCharacterAlignment: List<CharacterAlignment> = listOf(
        CharacterAlignment.CHAOTIC
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