package fans.modul3.collections

fun main(){
    val macamList = mutableListOf('x', "Java", 4, true)
    macamList.add("King") //menambahkan item di akhir list
    println(macamList) // mencetak semua
    println(macamList[4]) //menampilkan item indeks 4
    macamList.add(0, 'A') //menambahkan item pada index 0
    println(macamList) // mencetak semua
    macamList[1] = "Haha" //mengubah item pada index 1
    println(macamList) // mencetak semua
}