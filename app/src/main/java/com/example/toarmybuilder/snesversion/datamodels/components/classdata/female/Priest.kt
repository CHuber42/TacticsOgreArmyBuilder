package com.example.toarmybuilder.snesversion.datamodels.components.classdata.female

import com.example.toarmybuilder.snesversion.datamodels.components.CharacterAlignment
import com.example.toarmybuilder.snesversion.datamodels.components.CharacterClass
import com.example.toarmybuilder.snesversion.datamodels.components.Element
import com.example.toarmybuilder.R

object Priest : CharacterClass(){
    // Title Attributes
    override val name = "Priest"
    override val sprite = R.drawable.cleric1

    // Stat Growths
    override val hp: Int = 5
    override val mp: Int = 6
    override val str: Int = 3
    override val vit: Int = 2
    override val dex: Int = 4
    override val agi: Int = 3
    override val int: Int = 8
    override val men: Int = 6

    // Constant Stats
    override val movement: Int = 5
    override val wt: Int = 20

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
    override val walkInWater: Boolean = false
    override val walkOnLava: Boolean = false

//    init {
//        super.setMpValid(70)
//        super.setIntValid(125)
//        super.setMenValid(110)
//        super.setAlignmentValid(characterAlignment)
//    }
}