package fans.modul5.overloading

class Hewan(private var nama: String){
    fun makan(){
        println("$nama makan")
    }

    fun makan(typeFood: String){
        println("$nama makan $typeFood")
    }

    fun makan(typeFood: String, quantity: Double){
        println("$nama makan sebanyak $quantity gram")
    }

    fun sleep(){
        println("$nama tidur")
    }

}
fun main(){
    val alfanCat = Hewan("Popo")

    alfanCat.makan()
    alfanCat.makan("Ikan lele")
    alfanCat.makan("Ikan lele", 50.0)
}