package com.example.toarmybuilder.snesversion.datamodels.components.classdata.female

import com.example.toarmybuilder.snesversion.datamodels.components.CharacterAlignment
import com.example.toarmybuilder.snesversion.datamodels.components.CharacterClass
import com.example.toarmybuilder.snesversion.datamodels.components.Element
import com.example.toarmybuilder.R
object Cleric : CharacterClass(){
    // Title Attributes
    override val name : String = "Cleric"
    override val sprite: Int = R.drawable.cleric1

    // Stat Growths
    override val hp: Int = 6
    override val mp: Int = 4
    override val str: Int = 4
    override val vit: Int = 4
    override val int: Int = 7
    override val men: Int = 6
    override val agi: Int = 4
    override val dex: Int = 3

    // Constant Stats
    override val movement: Int = 5
    override val wt: Int = 5

    // Alignment and Element Attributes
    override val acceptableCharacterAlignment: List<CharacterAlignment> = listOf(
        CharacterAlignment.LAWFUL,
        CharacterAlignment.NEUTRAL
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

//    init {
//        super.setMpValid(16)
//        super.setIntValid(42)
//        super.setMenValid(6)
//        super.setAlignmentValid(characterAlignment)
//    }
}