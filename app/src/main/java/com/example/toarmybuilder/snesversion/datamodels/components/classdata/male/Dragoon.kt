package com.example.toarmybuilder.snesversion.datamodels.components.classdata.male

import com.example.toarmybuilder.snesversion.datamodels.components.CharacterAlignment
import com.example.toarmybuilder.snesversion.datamodels.components.CharacterClass
import com.example.toarmybuilder.snesversion.datamodels.components.Element
import com.example.toarmybuilder.R

object Dragoon : CharacterClass(){
    // Title Attributes
    override val name : String = "Dragoon"
    override val sprite : Int = R.drawable.male_dragoon1

    // Stat Growths
    override val hp: Int = 8
    override val mp: Int = 0
    override val str: Int = 7
    override val vit: Int = 4
    override val dex: Int = 7
    override val agi: Int = 3
    override val int: Int = 3
    override val men: Int = 4

    // Constant Stats
    override val movement: Int = 5
    override val wt: Int = 5
    
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
//        super.setStrValid(115)
//        super.setVitValid(106)
//        super.setDexValid(114)
//    }
}