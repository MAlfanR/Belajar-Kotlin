package fans.modul5.constructor

class Animal( var name: String,
              var weight: Double,
              var age: Int = 0,
              var isMammal: Boolean = true
)
fun main(){
    val alfanCat = Animal("Miki", 4.5, isMammal = true)
    println("Nama: ${alfanCat.name}, Berat: ${alfanCat.weight}, Umur: ${alfanCat.age}, Mammal: ${alfanCat.isMammal}")
}