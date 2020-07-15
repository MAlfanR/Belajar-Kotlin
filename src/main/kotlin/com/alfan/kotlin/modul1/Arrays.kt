package com.alfan.kotlin.modul1

fun main(){
    //contoh inisialisasi array
    val array = arrayOf(1,3,5,7)

    //dapat memasukkan berbagai jenis tipe data ke dalam arrayof()
    val mixArray = arrayOf(1,3,5,7, "Alfans", true)

    //jika hanya membuat array yang hanya bisa dimasukkan tipe data int
    val intArray = intArrayOf(1, 3, 5, 7)

    //jika ingin mengambil nilai dengan indexing
    println(intArray[1])

    //membuat array pada kotlin dapat menggunakan array() dan harus memiliki 2 argumen yakni size dan fungsi lambda
    val intArrays = Array(3, {i -> i *i })
    println(intArrays[2])
}