package com.example.toarmybuilder.snesversion.datamodels

import com.example.toarmybuilder.snesversion.datamodels.components.CharacterClass
import com.example.toarmybuilder.snesversion.datamodels.components.Element


// Reminder: Characters() have 3 "key components":
// 1. A "Template" they init from (Special Character or a generic)
// 2. An Id
// 3. A list of Levels

abstract class Character() {

    abstract var characterClass: CharacterClass
    abstract var Id : Int
    abstract var sprite : Int
    abstract val uniqueSprite : Boolean
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
    abstract var levels: List<CharacterClass>
    fun applyLevelUp(classLevel: CharacterClass){
        this.hp += classLevel.hp
        this.mp += classLevel.mp
        this.str += classLevel.str
        this.vit += classLevel.vit
        this.dex += classLevel.dex
        this.int += classLevel.int
        this.men += classLevel.men
        this.agi += classLevel.agi
    }
}
