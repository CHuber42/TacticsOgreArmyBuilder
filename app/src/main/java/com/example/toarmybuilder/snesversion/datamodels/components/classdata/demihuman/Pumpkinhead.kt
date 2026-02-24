package com.example.toarmybuilder.snesversion.datamodels.components.classdata.demihuman

import com.example.toarmybuilder.R
import com.example.toarmybuilder.snesversion.datamodels.components.CharacterAlignment
import com.example.toarmybuilder.snesversion.datamodels.components.CharacterClass
import com.example.toarmybuilder.snesversion.datamodels.components.Element

object Pumpkinhead : CharacterClass() {
    // Title Attributes
    override val name: String = "Pumpkinhead"
    override val sprite : Int = R.drawable.malewarrior1 // ToDO: Correct sprite

    // Stat Growths
    override val hp: Int = 4
    override val mp: Int = 0
    override val str: Int = 3
    override val vit: Int = 8
    override val int: Int = 2
    override val men: Int = 8
    override val agi: Int = 4
    override val dex: Int = 4

    // Constant Stats
    override val movement: Int = 5 //todo verify
    override val wt: Int = 5

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
    override val fly: Boolean = false
    override val teleport: Boolean = false
    override val walkInWater: Boolean = false
    override val walkOnLava: Boolean = false
}