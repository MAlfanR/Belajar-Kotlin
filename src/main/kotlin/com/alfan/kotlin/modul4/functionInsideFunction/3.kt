package com.alfan.kotlin.modul4.functionInsideFunction

import java.lang.IllegalArgumentException

fun sum(nilaiA: Int, nilaiB: Int, nilaiC: Int): Int{
    if(nilaiA == 0){
        throw IllegalArgumentException("Nilai A harus lebih besar dari 0")
    }

    if(nilaiB == 0){
        throw IllegalArgumentException("Nilai A harus lebih besar dari 0")
    }

    if(nilaiC == 0){
        throw IllegalArgumentException("Nilai A harus lebih besar dari 0")
    }

    return nilaiA + nilaiB

}