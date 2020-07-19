package com.alfan.kotlin.modul4.scopeFucntionWithLambdaReceiver

fun main(){
    val pesan = "Hello World!"
    val hasil = with(pesan){
        println("Nilai ini $this")
        println("Dengan panjang ${this.length}")
    }
}