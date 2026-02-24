package com.example.toarmybuilder.snesversion.datamodels.components.classdata.female

import com.example.toarmybuilder.snesversion.datamodels.components.CharacterAlignment
import com.example.toarmybuilder.snesversion.datamodels.components.CharacterClass
import com.example.toarmybuilder.snesversion.datamodels.components.Element
import com.example.toarmybuilder.R

object Valkyrie : CharacterClass(){
    // Title Attributes
    override val name = "Valkyrie"
    override val sprite = R.drawable.femalevalkyrie1

    // Stat Growths
    override val hp: Int = 8
    override val mp: Int = 2
    override val str: Int = 6
    override val vit: Int = 4
    override val dex: Int = 5
    override val agi: Int = 4
    override val int: Int = 6
    override val men: Int = 5

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
    override val walkInWater: Boolean = true
    override val walkOnLava: Boolean = false

//    init {
//        super.setStrValid(44)
//        super.setVitValid(46)
//        super.setIntValid(42)
//        super.setAlignmentValid(characterAlignment)
//    }
}