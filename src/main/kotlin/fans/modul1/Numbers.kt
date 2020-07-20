package fans.modul1

fun main(){
    val maxInt = Int.MAX_VALUE
    val minInt = Int.MIN_VALUE

    println(maxInt)
    println(minInt)

    val byteNumber: Byte = 10
    val intNumber: Int = byteNumber.toInt()

    println(intNumber)

    //konversi string to int

    val stringNumber = "23"
    val nomor = 3

    println(nomor + stringNumber.toInt())

    //membaca nomor
    val readNumber = 1_000_000
    print(readNumber)
}