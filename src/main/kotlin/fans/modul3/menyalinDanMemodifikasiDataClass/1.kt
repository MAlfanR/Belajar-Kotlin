package fans.modul3.menyalinDanMemodifikasiDataClass

import fans.modul3.penggunaanDataClass.DataPengguna

fun main(){
    val dataUser = DataPengguna("Alfan", 20)
    val dataUser2 = DataPengguna("Alfan", 20)
    val dataUser3 = DataPengguna("Ranger",21)
    val dataUser4 = dataUser.copy(age =16)

    println(dataUser4)
}