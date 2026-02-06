package com.example.toarmybuilder.datamodels

import android.media.Image
import com.example.toarmybuilder.datamodels.components.Element

open class Character(
    val sprite : Int,
    val name: String,
    val element: Element,
    val movement: Int,
    val jump: Int,
//    val job: Jobs,
    val hp: Int,
    val mp: Int,
    val str: Int,
    val vit: Int,
    val dex: Int,
    val agi: Int,
    val int: Int,
    val mnd: Int,
) {}
