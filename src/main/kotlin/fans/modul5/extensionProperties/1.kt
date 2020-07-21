package fans.modul5.extensionProperties

class Animal (var name: String, var weight: Double, var age: Int, var isMammal: Boolean)

val Animal.getAnimalInfo: String
    get() = "Nama: ${this.name}, Berat: ${this.weight}, Umur: ${this.age} Mamalia: ${this.isMammal} "
fun main(){
    val kucing = Animal("Popo", 4.1, 2, true)
    println(kucing.getAnimalInfo)
}