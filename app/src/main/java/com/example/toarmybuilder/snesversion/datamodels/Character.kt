package com.example.toarmybuilder.snesversion.datamodels

import com.example.toarmybuilder.snesversion.datamodels.components.Element

abstract class Character() {
    abstract var Id : Int
    abstract var sprite : Int
    abstract var name: String

    abstract var creatureTypeSelectable : Boolean
    abstract var creatureType: String
    abstract var element: Element
    abstract var movement: Int
    abstract var jump: Int
    //    abstract var job: Jobs,
    abstract var hp: Int
    abstract var mp: Int
    abstract var str: Int
    abstract var vit: Int
    abstract var dex: Int
    abstract var agi: Int
    abstract var int: Int
    abstract var men: Int
    abstract var levels: List<String>
}
