package fans.modul4.memberReferences

fun Int.nGanjil() = this %2 ==1

fun main(){
    val number = 1.rangeTo(15)
    val nomorGanjil = number.filter(Int:: nGanjil)

    println(nomorGanjil)
}