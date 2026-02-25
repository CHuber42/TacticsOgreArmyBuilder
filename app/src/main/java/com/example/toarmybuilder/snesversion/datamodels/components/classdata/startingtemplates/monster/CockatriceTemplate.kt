package com.example.toarmybuilder.snesversion.datamodels.components.classdata.startingtemplates.monster

import com.example.toarmybuilder.R
import com.example.toarmybuilder.snesversion.datamodels.components.CharacterClass
import com.example.toarmybuilder.snesversion.datamodels.components.Jobs
import com.example.toarmybuilder.snesversion.datamodels.components.classdata.StarterCharacterTemplate

object CockatriceTemplate : StarterCharacterTemplate() {
    override val hp: Int = 60
    override val mp: Int = 0
    override val str: Int = 31
    override val vit: Int = 34
    override val int: Int = 13
    override val men: Int = 43
    override val agi: Int = 8
    override val dex: Int = 8

    override val sprite: Int = R.drawable.template1 // TODO correct sprite
    override val initialClass: CharacterClass = Jobs.Monster.Cockatrice

    override val classOptions: List<CharacterClass> =
        listOf(
            Jobs.Monster.Cockatrice
        )
}