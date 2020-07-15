package com.alfan.kotlin.modul1

fun main(){
    //contoh compile time error
//    val teks : String = null

    val text: String? = null

    if(text !=null){
        val textLength = text.length
    }
}