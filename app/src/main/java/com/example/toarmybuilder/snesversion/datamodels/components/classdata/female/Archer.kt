package com.example.toarmybuilder.snesversion.datamodels.components.classdata.female

import com.example.toarmybuilder.snesversion.datamodels.components.CharacterAlignment
import com.example.toarmybuilder.snesversion.datamodels.components.ClassStats
import com.example.toarmybuilder.snesversion.datamodels.components.Element

class Archer(
    override val level: Int = 1,
    override val acceptableCharacterAlignment: List<CharacterAlignment> = listOf(
        CharacterAlignment.NEUTRAL,
        CharacterAlignment.CHAOTIC
    ),
    override val fly: Boolean = false,
    override val teleport: Boolean = false,
    override val walkInWater: Boolean = true,
    override val walkOnLava: Boolean = false,
    override val acceptableElement: List<Element> = listOf(
        Element.WIND,
        Element.EARTH,
        Element.WATER,
        Element.FIRE
    ),
    override val movement: Int = 5,
    override val jump: Int,
    override val hp: Int = 7,
    override val mp: Int = 3,
    override val str: Int = 4,
    override val vit: Int = 5,
    override val dex: Int = 7,
    override val agi: Int = 6,
    override val int: Int = 4,
    override val men: Int = 5,
    override val wt: Int = -5,
    override val lefthand: String,
    override val righthand: String,
    override val body: String,
    override val accessory: String,
    override val characterAlignment: CharacterAlignment
) : ClassStats(){
    init {
        super.setVitValid(44)
        super.setAgiValid(44)
        super.setDexValid(48)
        super.setAlignmentValid(characterAlignment)
    }
}