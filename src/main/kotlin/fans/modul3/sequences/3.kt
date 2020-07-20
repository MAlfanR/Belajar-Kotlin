package fans.modul3.sequences

fun main(){
    val sn = generateSequence  (2) {it + 1}
    sn.take(100).forEach { println(it) }
}