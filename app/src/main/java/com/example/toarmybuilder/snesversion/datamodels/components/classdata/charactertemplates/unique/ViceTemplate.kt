package com.example.toarmybuilder.snesversion.datamodels.components.classdata.charactertemplates.unique

import com.example.toarmybuilder.R
import com.example.toarmybuilder.snesversion.datamodels.components.CharacterAlignment
import com.example.toarmybuilder.snesversion.datamodels.components.CharacterClass
import com.example.toarmybuilder.snesversion.datamodels.components.Element
import com.example.toarmybuilder.snesversion.datamodels.components.Jobs
import com.example.toarmybuilder.snesversion.datamodels.components.classdata.StarterCharacterTemplate

object ViceTemplate : StarterCharacterTemplate() {
    // TODO: Possibly Changeable based on recruitment in later chapter?
    override val sprite: Int = R.drawable.unique_vice1
    override val spriteChangeable: Boolean = false
    override val initialLevel: Int = 2
    override val element: Element = Element.WATER // TODO Changeable?
    override val alignment: CharacterAlignment = CharacterAlignment.NEUTRAL // TODO Changeable?

    override val hp: Int = 78
    override val mp: Int = 9
    override val str: Int = 35
    override val vit: Int = 32
    override val int: Int = 34
    override val men: Int = 32
    override val agi: Int = 29
    override val dex: Int = 34
    override val luk: Int = 55

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

object Vice3LTemplate : StarterCharacterTemplate() {
    // 3L Route
    override val sprite: Int = R.drawable.unique_vice1
    override val spriteChangeable: Boolean = false
    override val initialLevel: Int = 21
    override val element: Element = Element.WATER // TODO Changeable?
    override val alignment: CharacterAlignment = CharacterAlignment.NEUTRAL // TODO Changeable?

    override val hp: Int = 229
    override val mp: Int = 104
    override val str: Int = 167
    override val vit: Int = 125
    override val int: Int = 144
    override val men: Int = 144
    override val agi: Int = 166
    override val dex: Int = 166
    override val luk: Int = 55

    override val initialClass: CharacterClass = Jobs.Unique.Vice
    override val classOptions: List<CharacterClass> =
        listOf(
            Jobs.Unique.Vice
        )
}