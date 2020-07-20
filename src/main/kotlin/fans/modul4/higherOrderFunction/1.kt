package fans.modul4.higherOrderFunction


var sum: (Int) ->Int = {value -> value + value}

fun printHasil(nilai: Int, sum: (Int) ->Int){
    val hasil = sum(nilai)
    println(hasil)
}
fun main(){
    printHasil(20, sum)

    printHasil(50){value -> value + value }
}