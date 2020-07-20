package fans.modul5.visibilityModifiers

fun main(){
    val alfanCat = animal("Popo", 3.1, 2)
    println(alfanCat.getName())
    alfanCat.setName("king")
    println(alfanCat.getName())
}