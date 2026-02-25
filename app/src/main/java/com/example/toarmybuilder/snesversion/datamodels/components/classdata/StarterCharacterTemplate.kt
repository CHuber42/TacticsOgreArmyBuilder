package com.example.toarmybuilder.snesversion.datamodels.components.classdata

import androidx.compose.ui.Alignment
import com.example.toarmybuilder.snesversion.datamodels.components.CharacterAlignment
import com.example.toarmybuilder.snesversion.datamodels.components.CharacterClass
import com.example.toarmybuilder.snesversion.datamodels.components.Element

abstract class StarterCharacterTemplate{
    abstract val hp: Int
    abstract val mp: Int
    abstract val str: Int
    abstract val vit: Int
    abstract val dex: Int
    abstract val agi: Int
    abstract val int: Int
    abstract val men: Int
    abstract val sprite: Int
    abstract val initialClass: CharacterClass
    abstract val classOptions: List<CharacterClass>

    // For Uniques
    open val luk: Int = 50
    open val spriteChangeable: Boolean = true
    open val initialLevel : Int = 1
    open val element : Element = Element.FIRE // TODO: Make "no default" value
    open val alignment : CharacterAlignment = CharacterAlignment.NEUTRAL // TODO: Make "no default" value
}