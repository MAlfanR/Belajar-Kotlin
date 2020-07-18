package com.alfan.kotlin.modul4.extensions


//class NewInt: Int(){
//    fun printInt(){
//        println("value $this")
//    }
//}

//extension function
fun Int.printInt(){
    println("value $this")
}

//extension function mengembalikan nilai seperti fungsi biasa
fun Int.minusFive(): Int{
    return this-5
}

//extension properties
val Int.slice: Int
    get() = this /2

fun main(){
    10.printInt()
    val yeah = 16.minusFive()

    println(yeah)

    println(90.slice)
}