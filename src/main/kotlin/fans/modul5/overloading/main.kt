package fans.modul5.overloading



fun main(){
    val kalkulator = Calculator()

    println(kalkulator.add(2,4))
    println(kalkulator.add(2.4, 2.6))
    println(kalkulator.add(6f, 7f))
    println(kalkulator.add(1, 2, 3))

    println(kalkulator.min(9, 2))
    println(kalkulator.min(17.2, 18.3))

}