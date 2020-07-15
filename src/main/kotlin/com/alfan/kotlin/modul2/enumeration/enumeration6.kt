package com.alfan.kotlin.modul2.enumeration

//penggunaan enum values
fun main(){
    val a: Array<Color> = enumValues()
    a.forEach { color ->
        println(color)
    }

    val color: Color = enumValueOf("BLUE")
    println("Color is $color")

    //menggunakan properti ordinal

    print("Posisi BLUE  adalah ${color.ordinal}")
}