package com.example.toarmybuilder.snesversion.datamodels.components.classdata.male

import com.example.toarmybuilder.snesversion.datamodels.components.CharacterAlignment
import com.example.toarmybuilder.snesversion.datamodels.components.CharacterClass
import com.example.toarmybuilder.snesversion.datamodels.components.Element
import com.example.toarmybuilder.R

object Knight : CharacterClass(){
    // Title Attributes
    override val name : String = "Knight"
    override val sprite : Int = R.drawable.maleknight1

    // Stat Growths
    override val hp: Int = 8
    override val mp: Int = 1
    override val str: Int = 6
    override val vit: Int = 4
    override val dex: Int = 6
    override val agi: Int = 4
    override val int: Int = 4
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
    override val walkInWater: Boolean = false
    override val walkOnLava: Boolean = false

//    init {
//        super.setAlignmentValid(characterAlignment)
//        super.setStrValid(45)
//        super.setVitValid(44)
//        super.setMenValid(42)
//        super.setDexValid(46)
//    }
}