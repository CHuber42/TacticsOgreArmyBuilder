package com.example.toarmybuilder.snesversion.datamodels.components.classdata.charactertemplates.monster

import com.example.toarmybuilder.R
import com.example.toarmybuilder.snesversion.datamodels.components.CharacterClass
import com.example.toarmybuilder.snesversion.datamodels.components.Jobs
import com.example.toarmybuilder.snesversion.datamodels.components.classdata.StarterCharacterTemplate

object GolemTemplate : StarterCharacterTemplate() {
    override val hp: Int = 30
    override val mp: Int = 0
    override val str: Int = 30
    override val vit: Int = 30
    override val int: Int = 17
    override val men: Int = 12
    override val agi: Int = 10
    override val dex: Int = 15

    override val sprite: Int = R.drawable.monster_golem1
    override val initialClass: CharacterClass = Jobs.Monster.Golem

    override val classOptions: List<CharacterClass> =
        listOf(
            Jobs.Monster.Golem
        )
}