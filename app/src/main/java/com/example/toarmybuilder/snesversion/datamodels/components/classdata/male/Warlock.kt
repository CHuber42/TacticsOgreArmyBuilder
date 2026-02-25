package com.example.toarmybuilder.snesversion.datamodels.components.classdata.male

import com.example.toarmybuilder.snesversion.datamodels.components.CharacterAlignment
import com.example.toarmybuilder.snesversion.datamodels.components.CharacterClass
import com.example.toarmybuilder.snesversion.datamodels.components.Element
import com.example.toarmybuilder.R

object Warlock: CharacterClass(){
    // Title Attributes
    override val name : String = "Warlock"
    override val sprite : Int = R.drawable.male_warlock1

    // Stat Growths
    override val hp: Int = 5
    override val mp: Int = 7
    override val str: Int = 3
    override val vit: Int = 1
    override val dex: Int = 3
    override val agi: Int = 3
    override val int: Int = 6
    override val men: Int = 8

    // Constant Stats
    override val movement: Int = 5
    override val wt: Int = 15
    
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
//        super.setAlignmentValid(characterAlignment)
//        super.setMpValid(84)
//        super.setIntValid(124)
//        super.setMenValid(112)
//    }
}