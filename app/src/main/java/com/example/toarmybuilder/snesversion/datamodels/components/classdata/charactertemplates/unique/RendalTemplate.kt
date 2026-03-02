package com.example.toarmybuilder.snesversion.datamodels.components.classdata.charactertemplates.unique

import com.example.toarmybuilder.R
import com.example.toarmybuilder.snesversion.datamodels.components.CharacterAlignment
import com.example.toarmybuilder.snesversion.datamodels.components.CharacterClass
import com.example.toarmybuilder.snesversion.datamodels.components.Element
import com.example.toarmybuilder.snesversion.datamodels.components.Jobs
import com.example.toarmybuilder.snesversion.datamodels.components.classdata.StarterCharacterTemplate

object RendalTemplate : StarterCharacterTemplate() {
    //4L Path
    override val sprite: Int = R.drawable.male_fusilier1 //TODO: Fix with gunner sprite
    override val spriteChangeable: Boolean = false
    override val initialLevel: Int = 29
    override val element: Element = Element.WIND
    override val alignment = CharacterAlignment.NEUTRAL

    override val hp: Int = 275
    override val mp: Int = 0
    override val str: Int = 156
    override val vit: Int = 151
    override val int: Int = 162
    override val men: Int = 177
    override val agi: Int = 227
    override val dex: Int = 212
    override val luk: Int = 50

    override val initialClass: CharacterClass = Jobs.Male.Gunner
    override val classOptions: List<CharacterClass> =
        listOf(
            Jobs.Male.Gunner
        )
}