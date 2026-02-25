package com.example.toarmybuilder.snesversion.datamodels.components.classdata.startingtemplates.demihuman

import com.example.toarmybuilder.R
import com.example.toarmybuilder.snesversion.datamodels.components.CharacterClass
import com.example.toarmybuilder.snesversion.datamodels.components.Jobs
import com.example.toarmybuilder.snesversion.datamodels.components.classdata.StarterCharacterTemplate

object LizardmanTemplate : StarterCharacterTemplate() {
    override val hp: Int = 64
    override val mp: Int = 0
    override val str: Int = 20
    override val vit: Int = 20
    override val int: Int = 22
    override val men: Int = 18
    override val agi: Int = 24
    override val dex: Int = 16

    override val sprite: Int = R.drawable.template1 // TODO correct sprite
    override val initialClass: CharacterClass = Jobs.DemiHuman.Lizardman

    override val classOptions: List<CharacterClass> =
        listOf(
            Jobs.DemiHuman.Lizardman
        )
}