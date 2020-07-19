package com.alfan.kotlin.modul4.memberReferences


//function type
val total: (Int, Int) -> Int ={valueA, valueB -> valueA + valueB}

//mekanisme reflection
val sum: (Int, Int) -> Int = ::count
fun count(valueA: Int, valueB: Int): Int{
    return valueA + valueB
}
fun main(){

}