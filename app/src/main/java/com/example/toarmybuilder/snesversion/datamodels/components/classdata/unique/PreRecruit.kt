package com.example.toarmybuilder.snesversion.datamodels.components.classdata.unique

import com.example.toarmybuilder.R
import com.example.toarmybuilder.snesversion.datamodels.components.CharacterAlignment
import com.example.toarmybuilder.snesversion.datamodels.components.CharacterClass
import com.example.toarmybuilder.snesversion.datamodels.components.Element

object PreRecruit : CharacterClass() {
    // Title Attributes
    override val name: String = "Pre-Recruit"
    override val sprite : Int = R.drawable.template1

    // Stat Growths
    override val hp: Int = 0
    override val mp: Int = 0
    override val str: Int = 0
    override val vit: Int = 0
    override val int: Int = 0
    override val men: Int = 0
    override val agi: Int = 0
    override val dex: Int = 0

    // Constant Stats
    override val movement: Int = 5
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
    override val fly: Boolean = false
    override val teleport: Boolean = false
    override val walkInWater: Boolean = false
    override val walkOnLava: Boolean = false
}