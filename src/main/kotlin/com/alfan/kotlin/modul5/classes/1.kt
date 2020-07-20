package com.alfan.kotlin.modul5.classes

class Hewan( val name: String,
             val weight: Double,
             val age: Int,
             val isMamalia: Boolean
) {

    fun eat(){
        println("$name makan !!")
    }

    fun sleep(){
        println("$name tidur !!")
    }
}

fun main(){
    val alfanCat = Hewan("Popo",4.0, 2,true)
    println("Nama: ${alfanCat.name}, Berat: ${alfanCat.weight}, Umur: ${alfanCat.age}, Mamalia: ${alfanCat.isMamalia}")

    alfanCat.eat()
    alfanCat.sleep()
}