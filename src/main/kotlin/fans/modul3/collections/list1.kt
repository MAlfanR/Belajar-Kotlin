package fans.modul3.collections

import fans.modul3.penggunaanDataClass.User

//list bersifat immutable yang artinya tidak dapat diubah
fun main(){
    //declaration list 1
    val numberList : List<Int> = listOf(1,2,3,4,5,6)

    //declarations list 2
    val nomorList = listOf(1,2,3,4,5,6,7)
    val charList = listOf<Char>('a','b','c')

    //declarations list 3
    //tipe data yang berbeda bisa juga data class
    val anyList = listOf('a', "kotlinGood", 4, false, User("alfan",21))

    println(anyList)
    println(anyList[2])
}