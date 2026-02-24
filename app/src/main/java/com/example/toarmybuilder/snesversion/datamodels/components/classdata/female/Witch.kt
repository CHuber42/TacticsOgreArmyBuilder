package com.example.toarmybuilder.snesversion.datamodels.components.classdata.female

import com.example.toarmybuilder.snesversion.datamodels.components.CharacterAlignment
import com.example.toarmybuilder.snesversion.datamodels.components.CharacterClass
import com.example.toarmybuilder.snesversion.datamodels.components.Element
import com.example.toarmybuilder.R

object Witch: CharacterClass(){
    // Title Attributes
    override val name = "Witch"
    override val sprite = R.drawable.femalewitch1

    // Stat Growths
    override val hp: Int = 5
    override val mp: Int = 5
    override val str: Int = 3
    override val vit: Int = 3
    override val dex: Int = 4
    override val agi: Int = 4
    override val int: Int = 6
    override val men: Int = 7

    // Constant Stats
    override val movement: Int = 5
    override val wt: Int = 10
    
    // Alignment and Element Attributes
    override val acceptableCharacterAlignment: List<CharacterAlignment> = listOf(
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

//    init {
//        super.setMpValid(16)
//        super.setIntValid(45)
//        super.setMenValid(41)
//        super.setAlignmentValid(characterAlignment)
//    }
}