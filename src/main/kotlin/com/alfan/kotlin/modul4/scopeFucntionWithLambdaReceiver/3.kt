package com.alfan.kotlin.modul4.scopeFucntionWithLambdaReceiver

fun main (){
    val message = "Hello Kotlin!"
    val result = with(message){
        "Karakter pertama adalah ${this[0]}" +
                " dan karakter terakhir ${this[this.length - 1]}"
    }

    println(result)
}