package com.example.toarmybuilder.snesversion.datamodels.components

abstract class ClassStats() {

    abstract val characterAlignment : CharacterAlignment
    abstract val level: Int
    abstract val walkInWater: Boolean
    abstract val fly: Boolean
    abstract val teleport: Boolean
    abstract val walkOnLava: Boolean
    abstract val acceptableCharacterAlignment: List<CharacterAlignment>
    abstract val acceptableElement: List<Element>
    abstract val movement: Int
    abstract val jump: Int
    abstract val hp: Int
    abstract val mp: Int
    abstract val str: Int
    abstract val vit: Int
    abstract val dex: Int
    abstract val agi: Int
    abstract val int: Int
    abstract val men: Int
    abstract val wt: Int
    abstract val lefthand: String // todo
    abstract val righthand: String // todo
    abstract val body: String // todo
    abstract val accessory: String // todo

    var elementIsValid: Boolean = true
    var characterAlignmentIsValid : Boolean = true
    var hpIsValid : Boolean = true
    var mpIsValid : Boolean = true
    var strIsValid : Boolean = true
    var vitIsValid : Boolean = true
    var dexIsValid : Boolean = true
    var agiIsValid : Boolean = true
    var intIsValid : Boolean = true
    var menIsValid : Boolean = true

    fun setElementValid(element: Element) {
        elementIsValid = acceptableElement.contains(element)
    }
    fun setAlignmentValid(characterAlignment: CharacterAlignment) {
        characterAlignmentIsValid = acceptableCharacterAlignment.contains(characterAlignment)
    }
    fun setHpValid(threshhold: Int){
        this.hp >= threshhold
    }
    fun setMpValid(threshhold: Int){
        this.mp >= threshhold
    }
    fun setStrValid(threshhold: Int){
        this.str >= threshhold
    }
    fun setVitValid(threshhold: Int){
        this.vit >= threshhold
    }
    fun setDexValid(threshhold: Int){
        this.dex >= threshhold
    }
    fun setAgiValid(threshhold: Int){
        this.agi >= threshhold
    }
    fun setIntValid(threshhold: Int){
        this.int >= threshhold
    }
    fun setMenValid(threshhold: Int){
        this.men >= threshhold
    }
}