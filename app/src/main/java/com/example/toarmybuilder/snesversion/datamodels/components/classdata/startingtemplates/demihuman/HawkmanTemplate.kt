package com.example.toarmybuilder.snesversion.datamodels.components.classdata.startingtemplates.demihuman

import com.example.toarmybuilder.R
import com.example.toarmybuilder.snesversion.datamodels.components.CharacterClass
import com.example.toarmybuilder.snesversion.datamodels.components.Jobs
import com.example.toarmybuilder.snesversion.datamodels.components.classdata.StarterCharacterTemplate

object HawkmanTemplate : StarterCharacterTemplate() {
    override val hp: Int = 60
    override val mp: Int = 0
    override val str: Int = 21
    override val vit: Int = 24
    override val int: Int = 18
    override val men: Int = 18
    override val agi: Int = 20
    override val dex: Int = 16

    override val sprite: Int = R.drawable.malewarrior1 // TODO correct sprite
    override val initialClass: CharacterClass = Jobs.DemiHuman.Hawkman

    override val classOptions: List<CharacterClass> =
        listOf(
            Jobs.DemiHuman.Hawkman
        )
}