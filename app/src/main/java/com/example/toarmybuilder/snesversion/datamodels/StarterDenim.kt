package com.example.toarmybuilder.snesversion.datamodels

import com.example.toarmybuilder.R
import com.example.toarmybuilder.snesversion.datamodels.components.CharacterClass
import com.example.toarmybuilder.snesversion.datamodels.components.Element
import com.example.toarmybuilder.snesversion.datamodels.components.Jobs

class StarterDenim(

    override var Id: Int = 1,
    override var name: String = "Denim",
    override var creatureTypeSelectable: Boolean = false,
    override var creatureType: String = "Male",
    override var element: Element = Element.WATER,
    override var movement: Int = 5,
    override var jump: Int = 2,
//    job = JobCategory.MALE.WARRIOR, //todo
    override var hp: Int = 50,
    override var mp: Int = 10,
    override var str: Int = 25,
    override var vit: Int = 25,
    override var dex: Int = 25,
    override var int: Int = 25,
    override var men: Int = 25,
    override var agi: Int = 25,
    override var sprite: Int = R.drawable.denim1,
    override val uniqueSprite: Boolean = true,
    override var levels: List<CharacterClass> = List(50){ Jobs.Male.Warrior }, //todo
    override var characterClass: CharacterClass = levels[0]
) : Character() {

}