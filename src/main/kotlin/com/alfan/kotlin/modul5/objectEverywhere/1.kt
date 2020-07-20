package com.alfan.kotlin.modul5.objectEverywhere


fun main(){
    val someString = "Alfan"
    println(someString.reversed())
    println(someString.toUpperCase())
    println(someString.toLowerCase())


    val a = "1234"
    val someA = a.toInt()
    val someOther ="123.456"
    val someDouble = someOther.toDouble()

    println(someA)
    println(someDouble)

    println(someA is Int)
    println(someDouble is Double)
}