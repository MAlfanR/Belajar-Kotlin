package com.alfan.kotlin.modul3.collectionsOperations

//fungsi yang membuat collection baru sesuai perubahan dari collection sebelumnya
fun main(){
    val nomor = listOf(1,2,3,4,5,6,7,8,9,10)
    val dikali6 = nomor.map { it * 6 }

    println(dikali6)
}