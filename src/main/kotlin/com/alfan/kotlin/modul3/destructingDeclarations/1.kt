package com.alfan.kotlin.modul3.destructingDeclarations

import com.alfan.kotlin.modul3.penggunaanDataClass.DataPengguna

fun main(){

    val dataUser = DataPengguna("Alfan", 20)

    //fungsi komponen dihasilkan sesuai dengan jumlah properti
    val name = dataUser.component1()
    val age = dataUser.component2()

    println("Nama saya is $name, Saya berumur $age ")

    //bisa menggunakan cara ini

    val (nama, umur) = dataUser
    println("Nama saya is $nama, Saya berumur $umur")
}