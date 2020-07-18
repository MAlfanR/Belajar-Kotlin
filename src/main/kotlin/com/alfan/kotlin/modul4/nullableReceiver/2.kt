package com.alfan.kotlin.modul4.nullableReceiver

val Int.potong: Int
    get() = this.div(2)

//langsung dari receiver objek jika bernilai null

val Int?.A: Int
    get() = this?.div(3) ?:0
fun main(){
    val nilai: Int? = null
    val nilai2: Int? = null

    println(nilai?.potong)
    println(nilai2?.potong)

    println(nilai.A)
    println(nilai2.A)
}