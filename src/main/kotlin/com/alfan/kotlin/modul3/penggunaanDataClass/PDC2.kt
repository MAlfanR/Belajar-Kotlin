package com.alfan.kotlin.modul3.penggunaanDataClass

//menggunakan equals untuk mengecek kesamaan

class Users(val name: String, val age : Int){
    override fun equals(other: Any?): Boolean {
        if(this === other)
            return true
        if (javaClass != other?.javaClass)
            return false

        other as Users

        if(name != other.name)
            return false
        if (age != other.age)
            return false

        return true
    }

    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + age
        return result
    }
}
fun main(){

}