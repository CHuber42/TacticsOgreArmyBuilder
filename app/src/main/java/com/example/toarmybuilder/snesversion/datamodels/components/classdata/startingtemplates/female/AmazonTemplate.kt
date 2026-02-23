package com.example.toarmybuilder.snesversion.datamodels.components.classdata.startingtemplates.female

import com.example.toarmybuilder.R
import com.example.toarmybuilder.snesversion.datamodels.components.CharacterClass
import com.example.toarmybuilder.snesversion.datamodels.components.Jobs
import com.example.toarmybuilder.snesversion.datamodels.components.classdata.StarterCharacterTemplate

object AmazonTemplate : StarterCharacterTemplate() {
    override val hp: Int = 30
    override val mp: Int = 30
    override val str: Int = 20
    override val vit: Int = 20
    override val dex: Int = 20
    override val agi: Int = 20
    override val int: Int = 20
    override val men: Int = 20
    override val sprite: Int = R.drawable.amazon1
    override val initialClass: CharacterClass = Jobs.Female.Amazon
}