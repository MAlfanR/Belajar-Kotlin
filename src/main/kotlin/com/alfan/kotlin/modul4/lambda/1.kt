package com.alfan.kotlin.modul4.lambda


fun main(){
    pesan()
    printPesan("YEAY")
    println( panjangPesan("BZZZZZZ"))
}
val pesan = { println("Hello lambda")}

val printPesan = {pesans: String ->
    println(pesans)}

val panjangPesan = {pesanq: String -> pesanq.length}