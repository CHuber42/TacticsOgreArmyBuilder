package com.example.toarmybuilder.datamodels.components.classdata.female

import com.example.toarmybuilder.datamodels.components.CharacterAlignment
import com.example.toarmybuilder.datamodels.components.ClassStats
import com.example.toarmybuilder.datamodels.components.Element

data class Cleric(
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
    override val hp: Int = 6,
    override val mp: Int = 4,
    override val str: Int = 4,
    override val vit: Int = 4,
    override val dex: Int = 3,
    override val agi: Int = 4,
    override val int: Int = 7,
    override val men: Int = 6,
    override val wt: Int = 5,
    override val lefthand: String,
    override val righthand: String,
    override val body: String,
    override val accessory: String,
    override val characterAlignment: CharacterAlignment,
) : ClassStats(){
    init {
        super.setMpValid(16)
        super.setIntValid(42)
        super.setMenValid(6)
        super.setAlignmentValid(characterAlignment)
    }
}