package fans.modul5.inheritances

open class Animal (val nama: String, val berat: Int, val umur: Int, val isCarnivora: Boolean){

    open fun makan(){
        println("$nama lagi makan oy !!")
    }

    open fun tidur(){
        println("$nama lagi tidur !!")
    }
}

