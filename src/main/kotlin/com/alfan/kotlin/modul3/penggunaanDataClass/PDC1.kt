package com.alfan.kotlin.modul3.penggunaanDataClass


class User (val name : String, val age: Int){
    override fun toString(): String {
        return "User(name=$name, age=$age)"
    }
}

data class DataPengguna(val name : String, val age : Int)
fun main(){
    val user = User("Ranger", 18)
    val dataPengguna = DataPengguna("Kings", 18)
    val dataPengguna2 = DataPengguna("Kings", 18)

    println(user)
    println(dataPengguna)
    //mengecek kesamaan
    println(dataPengguna.equals(dataPengguna2))

    val user2 = User("Ranger", 18)

    println(user.equals(user2))

}