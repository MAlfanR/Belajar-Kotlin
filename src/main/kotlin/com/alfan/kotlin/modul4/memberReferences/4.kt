package com.alfan.kotlin.modul4.memberReferences

var pesan = "Kotlin"
fun main(){
    println(:: pesan.name)
    println(::pesan.get())

    ::pesan.set("Alfan R")
    println(::pesan.get())
}