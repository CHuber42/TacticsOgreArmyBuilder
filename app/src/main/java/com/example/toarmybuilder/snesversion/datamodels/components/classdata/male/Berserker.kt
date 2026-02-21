package com.example.toarmybuilder.snesversion.datamodels.components.classdata.male

import com.example.toarmybuilder.snesversion.datamodels.components.CharacterAlignment
import com.example.toarmybuilder.snesversion.datamodels.components.CharacterClass
import com.example.toarmybuilder.snesversion.datamodels.components.Element
import com.example.toarmybuilder.R
object Berserker : CharacterClass(){
    override val sprite: Int = R.drawable.maleberzerker1
    override val name = "Berserker"
//    init {
//        super.setAlignmentValid(characterAlignment)
//        super.setStrValid(45)
//        super.setVitValid(46)
//        super.setDexValid(44)
//    }
    override val level: Int = 1
    override val acceptableCharacterAlignment: List<CharacterAlignment> = listOf(
        CharacterAlignment.NEUTRAL,
        CharacterAlignment.CHAOTIC
    )
    override val fly: Boolean = false
    override val teleport: Boolean = false
    override val walkInWater: Boolean = false
    override val walkOnLava: Boolean = false
    override val acceptableElement: List<Element> = listOf(
        Element.WIND,
        Element.EARTH,
        Element.WATER,
        Element.FIRE
    )
    override val movement: Int = 5
//    override val jump: Int,
    override val hp: Int = 9
    override val mp: Int = 1
    override val str: Int = 6
    override val vit: Int = 5
    override val dex: Int = 5
    override val agi: Int = 4
    override val int: Int = 3
    override val men: Int = 6
    override val wt: Int = 5
//    override val lefthand: String,
//    override val righthand: String,
//    override val body: String,
//    override val accessory: String,
//    override val characterAlignment: CharacterAlignment
}