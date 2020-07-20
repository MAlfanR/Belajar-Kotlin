package com.alfan.kotlin.modul5.properties


class Animal {
    var name: String = "Moko"

    get() {
        println("Fungsi Getter terpanggil!!!!")
        return field
    }

    set(value) {
        println("Fungsi Setter terpanggil!!!")
        field = value
    }
}
fun main(){
    val alfanCat = Animal()
    println("Nama: ${alfanCat.name}")
    alfanCat.name ="Popo"
    println("Nama: ${alfanCat.name}")
}