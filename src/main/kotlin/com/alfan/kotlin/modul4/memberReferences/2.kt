package com.alfan.kotlin.modul4.memberReferences

fun nomorGenap(number: Int) = number %2 ==0
fun main(){
    val numbers = 1.rangeTo(20)
    val nomorGenap = numbers.filter ( :: nomorGenap )


    println(nomorGenap)
}