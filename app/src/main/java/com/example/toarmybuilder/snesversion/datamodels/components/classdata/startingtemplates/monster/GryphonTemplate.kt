package com.example.toarmybuilder.snesversion.datamodels.components.classdata.startingtemplates.monster

import com.example.toarmybuilder.R
import com.example.toarmybuilder.snesversion.datamodels.components.CharacterClass
import com.example.toarmybuilder.snesversion.datamodels.components.Jobs
import com.example.toarmybuilder.snesversion.datamodels.components.classdata.StarterCharacterTemplate

object GryphonTemplate : StarterCharacterTemplate() {
    override val hp: Int = 64
    override val mp: Int = 0
    override val str: Int = 27
    override val vit: Int = 34
    override val int: Int = 17
    override val men: Int = 39
    override val agi: Int = 8
    override val dex: Int = 12

    override val sprite: Int = R.drawable.monster_gryphon1
    override val initialClass: CharacterClass = Jobs.Monster.Gryphon

    override val classOptions: List<CharacterClass> =
        listOf(
            Jobs.Monster.Gryphon
        )
}