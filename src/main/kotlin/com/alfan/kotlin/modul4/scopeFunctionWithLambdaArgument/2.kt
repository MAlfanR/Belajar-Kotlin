package com.alfan.kotlin.modul4.scopeFunctionWithLambdaArgument

fun main(){
    val pesan: String? = null
    pesan?.let {
        val panjang = it.length *2
        val text = "Panjang text $panjang"
        println(panjang)
        println(text)
    }
}