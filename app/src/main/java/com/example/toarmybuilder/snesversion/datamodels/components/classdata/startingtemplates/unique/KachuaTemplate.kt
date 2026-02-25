package com.example.toarmybuilder.snesversion.datamodels.components.classdata.startingtemplates.unique

import com.example.toarmybuilder.R
import com.example.toarmybuilder.snesversion.datamodels.components.CharacterClass
import com.example.toarmybuilder.snesversion.datamodels.components.Jobs
import com.example.toarmybuilder.snesversion.datamodels.components.classdata.StarterCharacterTemplate

object KachuaTemplate : StarterCharacterTemplate() {
    // TODO: Possibly Changeable based on recruitment in later chapter?
    override val sprite: Int = R.drawable.unique_denim1
    override val spriteChangeable: Boolean = false

    override val hp: Int = 50
    override val mp: Int = 0
    override val str: Int = 20
    override val vit: Int = 20
    override val int: Int = 20
    override val men: Int = 20
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