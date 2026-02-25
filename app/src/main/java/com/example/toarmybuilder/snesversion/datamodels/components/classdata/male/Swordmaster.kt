package com.example.toarmybuilder.snesversion.datamodels.components.classdata.male

import com.example.toarmybuilder.snesversion.datamodels.components.CharacterAlignment
import com.example.toarmybuilder.snesversion.datamodels.components.CharacterClass
import com.example.toarmybuilder.snesversion.datamodels.components.Element
import com.example.toarmybuilder.R
//
object Swordmaster : CharacterClass(){
    // Title Attributes
    override val name : String = "SwordMaster"
    override val sprite : Int = R.drawable.male_swordmaster1

    // Stat Growths
    override val hp: Int = 7
    override val mp: Int = 3
    override val str: Int = 4
    override val vit: Int = 3
    override val dex: Int = 8
    override val agi: Int = 6
    override val int: Int = 5
    override val men: Int = 6

    // Constant Stats
    override val movement: Int = 5
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
    override val fly: Boolean = false
    override val teleport: Boolean = false
    override val walkInWater: Boolean = true
    override val walkOnLava: Boolean = false

//    init {
//        super.setAlignmentValid(characterAlignment)
//        super.setStrValid(95)
//        super.setAgiValid(102)
//        super.setDexValid(126)
//    }
}