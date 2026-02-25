package com.example.toarmybuilder.snesversion.datamodels.components.classdata.charactertemplates.monster

import com.example.toarmybuilder.R
import com.example.toarmybuilder.snesversion.datamodels.components.CharacterClass
import com.example.toarmybuilder.snesversion.datamodels.components.Jobs
import com.example.toarmybuilder.snesversion.datamodels.components.classdata.StarterCharacterTemplate

object OctopusTemplate : StarterCharacterTemplate() {
    override val hp: Int = 55
    override val mp: Int = 0
    override val str: Int = 30
    override val vit: Int = 14
    override val int: Int = 15
    override val men: Int = 8
    override val agi: Int = 7
    override val dex: Int = 8

    override val sprite: Int = R.drawable.monster_octopus1
    override val initialClass: CharacterClass = Jobs.Monster.Octopus

    override val classOptions: List<CharacterClass> =
        listOf(
            Jobs.Monster.Octopus
        )
}