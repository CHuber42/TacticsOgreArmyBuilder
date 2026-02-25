package com.example.toarmybuilder.snesversion.datamodels.components.classdata.charactertemplates.male

import com.example.toarmybuilder.R
import com.example.toarmybuilder.snesversion.datamodels.components.CharacterClass
import com.example.toarmybuilder.snesversion.datamodels.components.Jobs
import com.example.toarmybuilder.snesversion.datamodels.components.classdata.StarterCharacterTemplate

object SoldierTemplate : StarterCharacterTemplate() {
    override val sprite: Int = R.drawable.male_soldier1

    override val hp: Int = 60
    override val mp: Int = 0
    override val str: Int = 21
    override val vit: Int = 20
    override val int: Int = 18
    override val men: Int = 18
    override val agi: Int = 20
    override val dex: Int = 20

    override val initialClass: CharacterClass = Jobs.Male.Soldier
    override val classOptions: List<CharacterClass> =
        listOf(
            Jobs.Male.Soldier,
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