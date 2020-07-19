package com.alfan.kotlin.modul4.advancedCollectionFunction

fun main(){
    val numbers = listOf<Int>(1,10,3)

    val fold = numbers.fold(10){
        current,item ->
        println("Current $current")
        println("Item $item")
        println()
        current + item
    }

    println("Hasil fold: $fold")
}