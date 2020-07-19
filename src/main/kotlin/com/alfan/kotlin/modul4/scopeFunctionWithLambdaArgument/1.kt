package com.alfan.kotlin.modul4.scopeFunctionWithLambdaArgument

fun main(){
    var text: String? = null

    val textLength = if (text != null) text.length else 7

    println(textLength)

}