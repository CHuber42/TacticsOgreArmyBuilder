package com.example.toarmybuilder.snesversion.datamodels.components.classdata

import com.example.toarmybuilder.snesversion.datamodels.components.CharacterClass

class CharacterFactory(
    val template: StarterCharacterTemplate,
    var hp: Int = template.hp,
    var mp: Int = template.mp,
    var str: Int = template.str,
    var vit: Int = template.vit,
    var agi: Int = template.agi,
    var dex: Int = template.dex,
    var int: Int = template.int,
    var men: Int = template.men,
    var sprite: Int = template.sprite,
    val levels: List<CharacterClass> = List<CharacterClass>(50){template.initialClass},
    val id: Int
) {
    fun applyLevelUp(classLevel: CharacterClass){
        this.hp += classLevel.hp
        this.mp += classLevel.mp
        this.str += classLevel.str
        this.vit += classLevel.vit
        this.agi += classLevel.agi
        this.dex += classLevel.dex
        this.int += classLevel.int
        this.men += classLevel.men
    }
}