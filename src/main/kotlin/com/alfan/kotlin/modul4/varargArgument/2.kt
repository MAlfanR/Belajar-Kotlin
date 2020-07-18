package com.alfan.kotlin.modul4.varargArgument

fun main(){
    val number = intArrayOf(10,12,34,56)
    val bzz =sets(10,20,30,*number,40)

    println(bzz)
}

fun sets(vararg number: Int): Int{
    var ye: Int = 0
    for (item in number){
        ye += item
    }

    return ye
}