package fans.modul5.inheritances

class Cat(pNama: String, pBerat: Int, pUmur: Int, pIsCarnivora: Boolean, val warnaBulu: String, val banyakKaki: Int)
    : Animal(pNama, pBerat, pUmur, pIsCarnivora){

    fun bermainDenganManusia(){
        println("$nama bermain dengan manusia")
    }

    override fun makan(){
        println("$nama lagi memakan ikan")
    }

    override fun tidur() {
        println("$nama lagi tidur di kasur!!")
    }
}

fun main(){
    val alfanCat = Cat("Moko", 3, 2, true, "Coklat", 4)

    alfanCat.bermainDenganManusia()
    alfanCat.tidur()
    alfanCat.makan()
}

