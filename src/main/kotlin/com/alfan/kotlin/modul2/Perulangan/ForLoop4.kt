package com.alfan.kotlin.modul2.Perulangan

fun main(){
    val rangess = 0.rangeTo(25) step 3
    rangess.forEach { value ->
        println("value is $value")
    }

    //penggunaan indexnya
    rangess.forEachIndexed { a, b ->
        println("Nilai $b dengan index $a ")
    }

    println(" ")
    //jika hanya ingin menggunakan index
    rangess.forEachIndexed { index, _ ->
        println("Indexnya $index")
    }

    println(" ")
    //coba aja
    rangess.forEachIndexed { _, i ->
        println("valuenya $i")
    }


}