package com.example.toarmybuilder.snesversion.datamodels.components.classdata.charactertemplates.female

import com.example.toarmybuilder.R
import com.example.toarmybuilder.snesversion.datamodels.components.CharacterClass
import com.example.toarmybuilder.snesversion.datamodels.components.Jobs
import com.example.toarmybuilder.snesversion.datamodels.components.classdata.StarterCharacterTemplate

object AmazonTemplate : StarterCharacterTemplate() {
    override val sprite: Int = R.drawable.female_amazon1

    override val hp: Int = 58
    override val mp: Int = 0
    override val str: Int = 20
    override val vit: Int = 19
    override val int: Int = 18
    override val men: Int = 17
    override val agi: Int = 20
    override val dex: Int = 23

    override val initialClass: CharacterClass = Jobs.Female.Amazon
    override val classOptions: List<CharacterClass> =
        listOf(
            Jobs.Female.Amazon,
            Jobs.Female.Archer,
            Jobs.Female.Valkyrie,
            Jobs.Female.Cleric,
            Jobs.Female.Witch,
            Jobs.Female.DragonTamer,
            Jobs.Female.Siren,
            Jobs.Female.Priest,
            Jobs.Female.AngelKnight
        )
}