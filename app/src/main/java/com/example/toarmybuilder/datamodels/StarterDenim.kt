package com.example.toarmybuilder.datamodels

import com.example.toarmybuilder.datamodels.components.Element
import com.example.toarmybuilder.R

class StarterDenim(
    override val Id: Int = 1,
    override val name: String = "Denim",
    override val element: Element = Element.WATER,
    override val movement: Int = 5,
    override val jump: Int = 2,
//    job = JobCategory.MALE.WARRIOR, //todo
    override val hp: Int = 50,
    override val mp: Int = 10,
    override val str: Int = 25,
    override val vit: Int = 25,
    override val dex: Int = 25,
    override val int: Int = 25,
    override val men: Int = 25,
    override val agi: Int = 25,
    override val sprite: Int = R.drawable.denim1,
    override val levels: List<String>//todo
) : Character(){
}