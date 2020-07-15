package com.alfan.kotlin.modul2.enumeration

fun main(){
    val colors: Array<Color> = Color.values()
    colors.forEach { color -> println(color)
    }

    val ran : Color = Color.valueOf("GREEN")
    println("The color is $ran")
}

