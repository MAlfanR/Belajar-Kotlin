package fans.modul6.mendeklarasikanKelasGeneric


//
//public fun <T> List<T>.slice(indices: Iterable<Int>): List<T>{
//
//}

fun main(){
    val number = (1..100).toList()
    print(number.slice<Int>(1..10))
}