package fans.modul5.propertyDelegation


fun main(){
    val animal = Animal()
    animal.name ="Popo"
    println("Nama Hewan: ${animal.name}")

    val person = Person()
    person.name = "Ranger"
    println("Nama orang: ${person.name}")
}