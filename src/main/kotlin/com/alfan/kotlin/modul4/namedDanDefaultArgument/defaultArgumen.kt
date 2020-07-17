package com.alfan.kotlin.modul4.namedDanDefaultArgument

fun namaLengkap(first: String ="M", middle: String= "Alfan", last:String = "Riyadi"): String{
    return "$first $middle $last"
}
fun main(){
    val namaLengkaps = namaLengkap()
    println(namaLengkaps)

    val coba = namaLengkap(middle = "Ranger")
    println(coba)
}