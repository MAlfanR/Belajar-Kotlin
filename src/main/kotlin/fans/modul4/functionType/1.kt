package fans.modul4.functionType


typealias Aritmatika = ((Int, Int) -> Int)?

val sum: Aritmatika={nilaiA, nilaiB -> nilaiA + nilaiB}
val multiply: Aritmatika= {nilaiA, nilaiB -> nilaiA * nilaiB}
fun main(){
    println(sum?.invoke(10,50))
    println(multiply?.invoke(67, 10))
}