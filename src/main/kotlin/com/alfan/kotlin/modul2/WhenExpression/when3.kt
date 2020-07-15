package com.alfan.kotlin.modul2.WhenExpression

//memeriksa instance menggunakan is
fun main(){
    val apaYa : Any = 5L
    when(apaYa){

        is String -> println("Merupakan String Type")
        is Long -> println("Merupakan  Long Type")
        else -> println("Tidak dapat didefinisikan")
    }
}