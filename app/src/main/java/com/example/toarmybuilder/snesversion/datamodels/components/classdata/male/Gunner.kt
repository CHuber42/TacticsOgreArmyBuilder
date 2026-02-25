package com.example.toarmybuilder.snesversion.datamodels.components.classdata.male

import com.example.toarmybuilder.snesversion.datamodels.components.CharacterAlignment
import com.example.toarmybuilder.snesversion.datamodels.components.CharacterClass
import com.example.toarmybuilder.snesversion.datamodels.components.Element
import com.example.toarmybuilder.R

object Gunner : CharacterClass(){
    // Title Attributes
    override val name : String = "Gunner"
    override val sprite : Int = R.drawable.female_fusilier

    // Stat Growths
    override val hp: Int = 6
    override val mp: Int = 0
    override val str: Int = 4
    override val vit: Int = 3
    override val dex: Int = 6
    override val agi: Int = 6
    override val int: Int = 4
    override val men: Int = 4

    // Constant Stats
    override val movement: Int = 5
    override val wt: Int = 35

    // Alignment and Element Attributes
    override val acceptableCharacterAlignment: List<CharacterAlignment> = listOf(
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
//        super.setStrValid(120)
//        super.setAgiValid(164)
//        super.setDexValid(150)
//    }

}