package com.example.toarmybuilder.datamodels

import android.media.Image
import com.example.toarmybuilder.datamodels.components.Element

abstract class Character() {
    abstract val Id : Int
    abstract val sprite : Int
    abstract val name: String
    abstract val element: Element
    abstract val movement: Int
    abstract val jump: Int
    //    abstract val job: Jobs,
    abstract val hp: Int
    abstract val mp: Int
    abstract val str: Int
    abstract val vit: Int
    abstract val dex: Int
    abstract val agi: Int
    abstract val int: Int
    abstract val mnd: Int
    abstract val levels: List<String>
}
