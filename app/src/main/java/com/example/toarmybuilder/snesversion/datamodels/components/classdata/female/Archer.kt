package com.example.toarmybuilder.snesversion.datamodels.components.classdata.female

import com.example.toarmybuilder.snesversion.datamodels.components.CharacterAlignment
import com.example.toarmybuilder.snesversion.datamodels.components.CharacterClass
import com.example.toarmybuilder.snesversion.datamodels.components.Element
import com.example.toarmybuilder.R
object Archer : CharacterClass(){
//    init {
//        super.setVitValid(44)
//        super.setAgiValid(44)
//        super.setDexValid(48)
//        super.setAlignmentValid(characterAlignment)
//    }

    // Title Attributes
    override val name : String = "Archer"
    override val sprite: Int = R.drawable.female_archer1

    // Stat Growths
    override val hp: Int = 7
    override val mp: Int = 3
    override val str: Int = 4
    override val vit: Int = 5
    override val int: Int = 4
    override val men: Int = 5
    override val agi: Int = 6
    override val dex: Int = 7

    // Constant Stats
    override val movement: Int = 5
    override val wt: Int = -5

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
    override val walkInWater: Boolean = true
    override val walkOnLava: Boolean = false

}