package com.example.toarmybuilder.snesversion.datamodels.components.classdata.demihuman

import com.example.toarmybuilder.R
import com.example.toarmybuilder.snesversion.datamodels.components.CharacterAlignment
import com.example.toarmybuilder.snesversion.datamodels.components.CharacterClass
import com.example.toarmybuilder.snesversion.datamodels.components.Element

object Faerie : CharacterClass() {
    // Title Attributes
    override val name: String = "Faerie"
    override val sprite : Int = R.drawable.malewarrior1 // TODO

    // Stat Growths
    override val hp: Int = 5
    override val mp: Int = 0
    override val str: Int = 3
    override val vit: Int = 2
    override val int: Int = 3
    override val men: Int = 7
    override val agi: Int = 6
    override val dex: Int = 7

    // Constant Stats
    override val wt: Int = 0
    override val movement: Int = 5

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