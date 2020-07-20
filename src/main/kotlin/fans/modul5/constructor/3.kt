package fans.modul5.constructor

//default constructor

class Animali{
    val nama: String = "Pipi"
    val berat: Double = 5.1
    val umur: Int = 3
    val isMammal: Boolean = true
    val color: String = "White"
}

fun main(){
    val alfanCat = Animali()
    println("Nama: ${alfanCat.nama}, Berat: ${alfanCat.berat}, Umur: ${alfanCat.umur}, Mammal: ${alfanCat.isMammal}, Warna: ${alfanCat.color}")
}