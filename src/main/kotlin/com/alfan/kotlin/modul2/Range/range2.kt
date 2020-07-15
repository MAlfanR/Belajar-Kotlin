package com.alfan.kotlin.modul2.Range

fun main(){
    var ranges = 1..25 step 2
    ranges.forEach{
        println("$it ")
    }

    println(ranges.step)
    println(ranges.first)
}