package com.example.toarmybuilder.snesversion.datamodels.components.classdata.startingtemplates.demihuman

import com.example.toarmybuilder.R
import com.example.toarmybuilder.snesversion.datamodels.components.CharacterClass
import com.example.toarmybuilder.snesversion.datamodels.components.Jobs
import com.example.toarmybuilder.snesversion.datamodels.components.classdata.StarterCharacterTemplate

object FaerieTemplate : StarterCharacterTemplate() {
    override val hp: Int = 72
    override val mp: Int = 0
    override val str: Int = 34
    override val vit: Int = 34
    override val int: Int = 33
    override val men: Int = 3
    override val agi: Int = 13
    override val dex: Int = 8

    override val sprite: Int = R.drawable.template1 //TODO correct sprite
    override val initialClass: CharacterClass = Jobs.DemiHuman.Faerie

    override val classOptions: List<CharacterClass> =
        listOf(
            Jobs.DemiHuman.Faerie
        )
}