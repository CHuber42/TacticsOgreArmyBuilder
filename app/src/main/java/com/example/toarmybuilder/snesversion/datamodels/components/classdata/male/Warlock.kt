package com.example.toarmybuilder.snesversion.datamodels.components.classdata.male

import com.example.toarmybuilder.snesversion.datamodels.components.CharacterAlignment
import com.example.toarmybuilder.snesversion.datamodels.components.ClassStats
import com.example.toarmybuilder.snesversion.datamodels.components.Element

data class Warlock(
    override val level: Int = 1,
    override val acceptableCharacterAlignment: List<CharacterAlignment> = listOf(
        CharacterAlignment.LAWFUL,
        CharacterAlignment.NEUTRAL
    ),
    override val fly: Boolean = false,
    override val teleport: Boolean = false,
    override val walkInWater: Boolean = false,
    override val walkOnLava: Boolean = false,
    override val acceptableElement: List<Element> = listOf(
        Element.WIND,
        Element.EARTH,
        Element.WATER,
        Element.FIRE
    ),
    override val movement: Int = 5,
    override val jump: Int,
    override val hp: Int = 5,
    override val mp: Int = 7,
    override val str: Int = 3,
    override val vit: Int = 1,
    override val dex: Int = 3,
    override val agi: Int = 3,
    override val int: Int = 6,
    override val men: Int = 8,
    override val wt: Int = 15,
    override val lefthand: String,
    override val righthand: String,
    override val body: String,
    override val accessory: String,
    override val characterAlignment: CharacterAlignment
) : ClassStats(){
    init {
        super.setAlignmentValid(characterAlignment)
        super.setMpValid(84)
        super.setIntValid(124)
        super.setMenValid(112)
    }
}