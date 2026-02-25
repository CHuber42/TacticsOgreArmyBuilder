package com.example.toarmybuilder.snesversion.datamodels.components.classdata.male

import com.example.toarmybuilder.snesversion.datamodels.components.CharacterAlignment
import com.example.toarmybuilder.snesversion.datamodels.components.CharacterClass
import com.example.toarmybuilder.snesversion.datamodels.components.Element
import com.example.toarmybuilder.R

object Ninja: CharacterClass(){
    // Title Attributes
    override val name : String = "Ninja"
    override val sprite : Int = R.drawable.male_ninja1

    // Stat Growths
    override val hp: Int = 7
    override val mp: Int = 2
    override val str: Int = 4
    override val vit: Int = 4
    override val dex: Int = 6
    override val agi: Int = 7
    override val int: Int = 4
    override val men: Int = 5

    // Constant Stats
    override val movement: Int = 5
    override val wt: Int = -5
    
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
    override val walkInWater: Boolean = true
    override val walkOnLava: Boolean = false

//    init {
//        super.setStrValid(45)
//        super.setAgiValid(46)
//        super.setDexValid(44)
//    }
}