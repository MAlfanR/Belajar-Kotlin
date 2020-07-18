package com.alfan.kotlin.modul4.libraryHelper

val buildString = StringBuilder().apply {
    append("Hello ")
    append("Kotlin ")

    //default menggunakan it
    val text = "Hello"
    text.let{
        val pesan ="$it kotli"
        println(pesan)
    }

    //no default
    val king = "Yeah"
    king.let { hmm ->
        val message = "$hmm Ye"
        println(message)
    }
}

fun main(){
    println(buildString)


}