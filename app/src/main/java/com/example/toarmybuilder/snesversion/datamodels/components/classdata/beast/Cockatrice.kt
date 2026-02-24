package com.example.toarmybuilder.snesversion.datamodels.components.classdata.beast

import com.example.toarmybuilder.R
import com.example.toarmybuilder.snesversion.datamodels.components.CharacterAlignment
import com.example.toarmybuilder.snesversion.datamodels.components.CharacterClass
import com.example.toarmybuilder.snesversion.datamodels.components.Element

object Cockatrice : CharacterClass() {
    // Title Attributes
    override val name: String = "Cockatrice"
    override val sprite : Int = R.drawable.malewarrior1 //todo correct sprite

    // Stat Growths
    override val hp: Int = 9
    override val mp: Int = 0
    override val str: Int = 7
    override val vit: Int = 4
    override val int: Int = 3
    override val men: Int = 4
    override val agi: Int = 3
    override val dex: Int = 4

    // Constant Stats
    override val movement: Int = 7
    override val wt: Int = 40

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