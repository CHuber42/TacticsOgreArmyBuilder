package com.example.toarmybuilder.snesversion.datamodels.components.classdata

import com.example.toarmybuilder.snesversion.datamodels.components.CharacterClass

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
}