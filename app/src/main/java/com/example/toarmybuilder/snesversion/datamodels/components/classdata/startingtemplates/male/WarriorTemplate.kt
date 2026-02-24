package com.example.toarmybuilder.snesversion.datamodels.components.classdata.startingtemplates.male

import com.example.toarmybuilder.R
import com.example.toarmybuilder.snesversion.datamodels.components.CharacterClass
import com.example.toarmybuilder.snesversion.datamodels.components.Jobs
import com.example.toarmybuilder.snesversion.datamodels.components.classdata.StarterCharacterTemplate

object WarriorTemplate : StarterCharacterTemplate() {
    override val sprite: Int = R.drawable.malewarrior1
    override val initialClass: CharacterClass = Jobs.Male.Warrior

    override val hp: Int = 60
    override val mp: Int = 0
    override val str: Int = 21
    override val vit: Int = 20
    override val int: Int = 18
    override val men: Int = 18
    override val agi: Int = 20
    override val dex: Int = 20
    override val classOptions: List<CharacterClass> =
        listOf(
            Jobs.Male.Warrior,
            Jobs.Male.Knight,
            Jobs.Male.Berserker,
            Jobs.Male.BeastTamer,
            Jobs.Male.Exorcist,
            Jobs.Male.Ninja,
            Jobs.Male.Wizard,
            Jobs.Male.Swordmaster,
            Jobs.Male.Dragoon,
            Jobs.Male.TerrorKnight,
            Jobs.Male.Warlock,
            Jobs.Male.Gunner,
        )
}