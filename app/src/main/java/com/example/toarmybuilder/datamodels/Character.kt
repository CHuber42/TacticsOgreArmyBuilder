package com.example.toarmybuilder.datamodels

import com.example.toarmybuilder.datamodels.components.Element

data class Character(
    val name: String,
    val element: Element,
    val movement: Int,
    val jump: Int,
    val job: Int,
    val hp: Int,
    val mp: Int,
    val str: Int,
    val vit: Int,
    val dex: Int,
    val agi: Int,
    val int: Int,
    val mnd: Int,
    val res: Int,

    )
