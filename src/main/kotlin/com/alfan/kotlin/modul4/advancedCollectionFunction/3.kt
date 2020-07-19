package com.alfan.kotlin.modul4.advancedCollectionFunction

fun main(){
    val himpunan = listOf<Int>(4,5,6,7,8,9,10)
    val drop = himpunan.drop(4)

    println(drop)

    //jika ingin memangkas dari nilai akhir
    val drop1 = himpunan.dropLast(3)
    println(drop1)
}