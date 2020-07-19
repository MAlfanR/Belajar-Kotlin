package com.alfan.kotlin.modul4.functionInsideFunction

import java.lang.IllegalArgumentException

//penerapan InnerFunction


fun jumlah(A: Int, B: Int, C: Int): Int {
    fun validasiNomor(nilai: Int){
        if(nilai == 0){
            throw IllegalArgumentException("Nilai haeus lebih besar dari 0")
        }
    }

    validasiNomor(A)
    validasiNomor(B)
    validasiNomor(C)

    return A + B
}
fun main(){
    println(jumlah(10,1,7))
}