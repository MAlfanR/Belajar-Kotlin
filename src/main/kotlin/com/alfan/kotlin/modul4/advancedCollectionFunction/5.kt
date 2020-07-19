package com.alfan.kotlin.modul4.advancedCollectionFunction

//slice

fun main(){
    val total = listOf<Int>(1,2,3,4,5,6,7,8,9,9,9,20)
    val slice = total.slice(8..11)
    println(slice)

    //bisa menggunakan step
    val slice1 = total.slice(2..6 step 3)
    println(slice1)

    //bisa menggunakan index
    val index = listOf<Int>(1,2,5,10)
    val slice2 = total.slice(index)

    println(slice2)
}