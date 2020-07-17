package com.alfan.kotlin.modul4.namedDanDefaultArgument

//tidak perlu lagi menghafal posisi parameter jika ingin melampirkan sebuah argumen
fun getFullName( middle: String , first: String , last: String): String{
    return "$first $middle $last"
}

fun main(){
    val namaLengkap = getFullName(first = "M", middle = "Alfan", last = "Riyadi")
    println(namaLengkap)
}