package com.example.toarmybuilder.snesversion.datamodels.components.classdata.charactertemplates.dragon

import com.example.toarmybuilder.R
import com.example.toarmybuilder.snesversion.datamodels.components.CharacterClass
import com.example.toarmybuilder.snesversion.datamodels.components.Jobs
import com.example.toarmybuilder.snesversion.datamodels.components.classdata.StarterCharacterTemplate

object DragonTemplate : StarterCharacterTemplate() {
    override val hp: Int = 60
    override val mp: Int = 0
    override val str: Int = 23
    override val vit: Int = 25
    override val int: Int = 26
    override val men: Int = 23
    override val agi: Int = 28
    override val dex: Int = 22

    override val sprite: Int = R.drawable.dragon_earth1 //TODO depends on element
    override val initialClass: CharacterClass = Jobs.Dragon.Dragon

    override val classOptions: List<CharacterClass> =
        listOf(
            Jobs.Dragon.Dragon,
            Jobs.Dragon.BlackDragon,
            Jobs.Dragon.WhiteDragon,
            Jobs.Dragon.HolyDragon,
            Jobs.Dragon.Tiamat
        )
}