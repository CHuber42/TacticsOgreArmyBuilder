package com.example.toarmybuilder.snesversion.datamodels.components.classdata.startingtemplates.male

import com.example.toarmybuilder.R
import com.example.toarmybuilder.snesversion.datamodels.components.CharacterClass
import com.example.toarmybuilder.snesversion.datamodels.components.Jobs
import com.example.toarmybuilder.snesversion.datamodels.components.classdata.StarterCharacterTemplate

object WarriorTemplate : StarterCharacterTemplate() {
    override val hp: Int = 40
    override val mp: Int = 20
    override val str: Int = 20
    override val vit: Int = 20
    override val dex: Int = 20
    override val agi: Int = 20
    override val int: Int = 20
    override val men: Int = 20
    override val sprite: Int = R.drawable.malewarrior1
    override val initialClass: CharacterClass = Jobs.Male.Warrior
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