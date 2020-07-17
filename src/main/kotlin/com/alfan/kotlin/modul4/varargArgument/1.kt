package com.alfan.kotlin.modul4.varargArgument

fun sumNumbers (vararg number: Int): Int{
    return number.sum()
}
fun main(){
    val numbers = sumNumbers(10,30,40,50)
    println(numbers)
}