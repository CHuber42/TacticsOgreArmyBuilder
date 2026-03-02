package com.example.toarmybuilder.snesversion.datamodels.components.classdata.charactertemplates.unique

import com.example.toarmybuilder.R
import com.example.toarmybuilder.snesversion.datamodels.components.CharacterAlignment
import com.example.toarmybuilder.snesversion.datamodels.components.CharacterClass
import com.example.toarmybuilder.snesversion.datamodels.components.Element
import com.example.toarmybuilder.snesversion.datamodels.components.Jobs
import com.example.toarmybuilder.snesversion.datamodels.components.classdata.StarterCharacterTemplate

object HaborymTemplate : StarterCharacterTemplate() {
    //4L Route
    override val sprite: Int = R.drawable.male_swordmaster1
    override val spriteChangeable: Boolean = true
    override val initialLevel: Int = 22
    override val element: Element = Element.FIRE
    override val alignment = CharacterAlignment.LAWFUL

    override val hp: Int = 243
    override val mp: Int = 78
    override val str: Int = 135
    override val vit: Int = 122
    override val int: Int = 140
    override val men: Int = 158
    override val agi: Int = 195
    override val dex: Int = 207
    override val luk: Int = 51

    override val initialClass: CharacterClass = Jobs.Male.Swordmaster
    override val classOptions: List<CharacterClass> =
        listOf(
            Jobs.Male.Swordmaster
        )
}