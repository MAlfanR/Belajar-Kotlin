package com.alfan.kotlin.modul4.scopeFunctionWithLambdaArgument

fun main(){
    val pesan: String? = null
    val panjang = pesan?.length ?: 0 *2
    val text ="Panjang Text $panjang"

    println(text)
}