package com.example.toarmybuilder.snesversion.datamodels.components.classdata.female

import com.example.toarmybuilder.snesversion.datamodels.components.CharacterAlignment
import com.example.toarmybuilder.snesversion.datamodels.components.CharacterClass
import com.example.toarmybuilder.snesversion.datamodels.components.Element
import com.example.toarmybuilder.R

object AngelKnight : CharacterClass(){
    // Title Attributes
    override val name = "Angel"
    override val sprite = R.drawable.femaleangel1

    // Stat Growths
    override val hp: Int = 8
    override val mp: Int = 5
    override val str: Int = 7
    override val vit: Int = 4
    override val int: Int = 7
    override val men: Int = 5
    override val agi: Int = 5
    override val dex: Int = 5

    // Constant Stats
    override val movement: Int = 6
    override val wt: Int = 5

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
    override val fly: Boolean = true
    override val teleport: Boolean = false
    override val walkInWater: Boolean = true
    override val walkOnLava: Boolean = false

//    init {
//        super.setMpValid(92)
//        super.setStrValid(135)
//        super.setVitValid(122)
//        super.setIntValid(144)
//        super.setMenValid(119)
//        super.setAgiValid(122)
//        super.setDexValid(124)
//        super.setAlignmentValid(characterAlignment)
//    }
    // Title Attributes


    // Alignment and Element Attributes

}