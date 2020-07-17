package com.alfan.kotlin.modul3.maps

fun main(){
    val capital = mapOf(
        "Beijing" to "China",
        "New Delhi" to "India",
        "Jakarta" to "Indonesia"
    )

    println(capital["Beijing"])
    println(capital["China"]) // hasilnya bakal null hehe

    println(capital.getValue("Beijing")) //hasilnya sama

    //terdapat perbedaan menggunakan "[]" dan "get value"
    //jika menggunakan [] kalo tidak ada dalam maps hasilnya "null", kalo pakai get value hasilnya exceptions

    //key pada maps bersifat unik

    //untuk mengetahui key apa saja yang ada dalam maps
    val kunciMap = capital.keys
    println(kunciMap)

    //untuk mengetahui value apa saja yang ada dalam maps
    val nilaiMap = capital.values
    println(nilaiMap)

    //coba
    val mutableCapital = capital.toMutableMap()

    mutableCapital.put("Beijing", "Tiongkok")
    mutableCapital.put("Indo","Indonesia")

    println(mutableCapital)

}