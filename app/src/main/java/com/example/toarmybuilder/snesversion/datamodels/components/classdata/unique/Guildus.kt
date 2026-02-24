package com.example.toarmybuilder.snesversion.datamodels.components.classdata.unique

import com.example.toarmybuilder.R
import com.example.toarmybuilder.snesversion.datamodels.components.CharacterAlignment
import com.example.toarmybuilder.snesversion.datamodels.components.CharacterClass
import com.example.toarmybuilder.snesversion.datamodels.components.Element

object Guildus : CharacterClass() {
    // Title Attributes
    override val name: String = "Guildus"
    override val sprite : Int = R.drawable.malewarrior1 //todo correct sprite

    // Stat Growths
    override val hp: Int = 8
    override val mp: Int = 0
    override val str: Int = 6
    override val vit: Int = 5
    override val int: Int = 4
    override val men: Int = 6
    override val agi: Int = 5
    override val dex: Int = 7

    // Constant Stats
    override val movement: Int = 5
    override val wt: Int = -5

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