package com.example.toarmybuilder.datamodels.components.classdata.male

import com.example.toarmybuilder.datamodels.components.CharacterAlignment
import com.example.toarmybuilder.datamodels.components.ClassStats
import com.example.toarmybuilder.datamodels.components.Element

data class Warrior(
    override val level: Int = 1,
    override val acceptableCharacterAlignment: List<CharacterAlignment> = listOf(
        CharacterAlignment.LAWFUL,
        CharacterAlignment.NEUTRAL,
        CharacterAlignment.CHAOTIC
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
    override val hp: Int = 7,
    override val mp: Int = 3,
    override val str: Int = 5,
    override val vit: Int = 4,
    override val dex: Int = 5,
    override val agi: Int = 5,
    override val int: Int = 5,
    override val men: Int = 5,
    override val wt: Int = 0,
    override val lefthand: String,
    override val righthand: String,
    override val body: String,
    override val accessory: String,
    override val characterAlignment: CharacterAlignment
) : ClassStats(){}