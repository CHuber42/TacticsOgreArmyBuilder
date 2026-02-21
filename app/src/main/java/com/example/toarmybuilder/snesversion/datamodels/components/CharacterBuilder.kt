package com.example.toarmybuilder.snesversion.datamodels.components

import com.example.toarmybuilder.snesversion.datamodels.Character

class CharacterBuilder(template: Character) : Character() {
    override var characterClass: CharacterClass = template.characterClass
    override var Id: Int = template.Id
    override var sprite: Int = template.sprite
    override val uniqueSprite: Boolean = template.uniqueSprite
    override var name: String = template.name
    override var creatureTypeSelectable: Boolean = template.creatureTypeSelectable
    override var creatureType: String = template.creatureType
    override var element: Element = template.element
    override var movement: Int = template.movement
    override var jump: Int = template.jump
    override var hp: Int = template.hp
    override var mp: Int = template.mp
    override var str: Int = template.str
    override var vit: Int = template.vit
    override var dex: Int = template.dex
    override var agi: Int = template.agi
    override var int: Int = template.int
    override var men: Int = template.men
    override var levels: List<CharacterClass> = template.levels
}