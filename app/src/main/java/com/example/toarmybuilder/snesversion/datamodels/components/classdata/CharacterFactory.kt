package com.example.toarmybuilder.snesversion.datamodels.components.classdata

import com.example.toarmybuilder.snesversion.datamodels.components.CharacterClass
import com.example.toarmybuilder.snesversion.datamodels.components.Jobs

data class CharacterFactory(
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
    val spriteChangeable : Boolean = template.spriteChangeable,
    val levels: List<CharacterClass> = List(50) { if (it < template.initialLevel) Jobs.Unique.PreRecruit else template.initialClass },
    val id: Int
) {
    init {
        for (level in levels){
            applyLevelUp(level)
        }
    }

    fun applyLevelUp(classLevel: CharacterClass){
        this.hp += classLevel.hp
        this.mp += classLevel.mp
        this.str += classLevel.str
        this.vit += classLevel.vit
        this.agi += classLevel.agi
        this.dex += classLevel.dex
        this.int += classLevel.int
        this.men += classLevel.men

        if (this.spriteChangeable) this.sprite = classLevel.sprite
    }
}