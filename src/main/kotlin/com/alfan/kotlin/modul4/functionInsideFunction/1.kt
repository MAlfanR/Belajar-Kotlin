package com.alfan.kotlin.modul4.functionInsideFunction

import com.alfan.kotlin.modul4.lambda.printPesan


fun setWord(pesan: String){
    fun printPesans(teks: String){
        println(teks)
    }

    printPesans("King")
}
fun main(){

}