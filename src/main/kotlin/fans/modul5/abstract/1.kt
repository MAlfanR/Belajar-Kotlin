package fans.modul5.abstract

abstract class hewan(var name: String, var weight: Double, var age: Int, var isCarnivore: Boolean){

    fun eat(){
        println("$name sedang makan")
    }

    fun sleep(){
        println("$name sedang tidur")
    }
}

//fun main(){
//    val animal = hewan("Moko", 2.6, 1, true)
//}