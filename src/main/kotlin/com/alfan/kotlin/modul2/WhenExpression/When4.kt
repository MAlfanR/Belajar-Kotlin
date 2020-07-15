package com.alfan.kotlin.modul2.WhenExpression

fun main(){

    val q = 1000
    val w = 13..50

    when(q){
        in w -> println("q berada di range w")
        !in w -> println("q tidak berada di range w")
        else -> println("nilai tidak di temukan")
    }
}