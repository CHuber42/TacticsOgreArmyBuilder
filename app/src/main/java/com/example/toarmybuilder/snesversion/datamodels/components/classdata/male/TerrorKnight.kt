package com.example.toarmybuilder.snesversion.datamodels.components.classdata.male

import com.example.toarmybuilder.snesversion.datamodels.components.CharacterAlignment
import com.example.toarmybuilder.snesversion.datamodels.components.CharacterClass
import com.example.toarmybuilder.snesversion.datamodels.components.Element
import com.example.toarmybuilder.R

object TerrorKnight: CharacterClass(){
    // Title Attributes
    override val name : String = "Terror Knight"
    override val sprite : Int = R.drawable.maleterrorknight1

    // Stat Growths
    override val hp: Int = 9
    override val mp: Int = 0
    override val str: Int = 6
    override val vit: Int = 6
    override val dex: Int = 5
    override val agi: Int = 3
    override val int: Int = 3
    override val men: Int = 5

    // Constant Stats
    override val movement: Int = 5
    override val wt: Int = 10
    
    // Alignment and Element Attributes
    override val acceptableCharacterAlignment: List<CharacterAlignment> = listOf(
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
//        super.setAlignmentValid(characterAlignment)
//        super.setStrValid(117)
//        super.setVitValid(114)
//        super.setDexValid(104)
//    }
}