package com.alfan.kotlin.modul4.advancedCollectionFunction

fun main(){
    val word = "Qwerty"
    val chun = word.chunked(2)

    println(chun)

    val chunkedT = word.chunked(3){
        it.toString().toUpperCase()
    }

    println(chunkedT)
}