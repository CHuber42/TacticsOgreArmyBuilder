package com.example.toarmybuilder.snesversion.datamodels

import com.example.toarmybuilder.R
import com.example.toarmybuilder.snesversion.datamodels.components.Element

class StarterDenim(
    override var Id: Int = 1,
    override var name: String = "Denim",
    override var creatureTypeSelectable: Boolean = true,
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
    override var levels: List<String> = List(50){index -> index.toString()} //todo
) : Character() {

}