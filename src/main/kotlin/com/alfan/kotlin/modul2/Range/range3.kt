package com.alfan.kotlin.modul2.Range

fun main(){
    //menggunakan fungsi rangeTo
    val rangeInt = 1.rangeTo(20) step 3
    rangeInt.forEach{
        print("$it ")
    }
    println(" ")
    val yea = 15.downTo(0)
    yea.forEach{
        println("$it ")
    }
}