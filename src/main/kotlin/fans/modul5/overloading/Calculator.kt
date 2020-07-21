package fans.modul5.overloading

class Calculator {
    fun add(nilai1: Int, nilai2: Int) = nilai1 + nilai2
    fun add(nilai1: Int, nilai2: Int, nilai3: Int) = nilai1 + nilai2+ nilai3
    fun add(nilai1: Double, nilai2: Double) = nilai1 + nilai2
    fun add(nilai1: Float, nilai2: Float) = nilai1 + nilai2

    fun min(nilai1: Int, nilai2: Int) = if (nilai1 < nilai2) nilai1 else nilai2
    fun min(nilai1: Double, nilai2: Double) = if (nilai1 < nilai2) nilai1 else nilai2
}