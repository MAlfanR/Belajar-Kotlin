package fans.modul5.constructor

class Hewans (name: String, weight: Double, age: Int){
    val name: String
    val weight: Double
    val age: Int
    var isMammal: Boolean

    init {
        this.weight = if (weight< 0.0) 0.1 else weight
        this.age = if (age< 0)0 else age
        this.name = name
        this.isMammal = false
    }

    //secondary constructor
    constructor(name: String, weight: Double, age: Int, isMammal: Boolean): this(name, weight, age){
        this.isMammal = isMammal
    }
}



fun main(){
    val alfanCat = Hewans("Miki", -0.2, 2, true)
    println("Nama: ${alfanCat.name}, Berat: ${alfanCat.weight}, Umur: ${alfanCat.age}, Mammal: ${alfanCat.isMammal}")

    val alfanBird = Hewans("ye", 0.1, 1)
    println("Nama: ${alfanBird.name}, Berat: ${alfanBird.weight}, Umur: ${alfanBird.age}, Mammal: ${alfanBird.isMammal}")
}