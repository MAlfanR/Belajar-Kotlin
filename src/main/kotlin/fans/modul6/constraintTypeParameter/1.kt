package fans.modul6.constraintTypeParameter

class ListNumber<T: Number>: List<T>{
    override fun get(Index: Int): T {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}

fun <T: Number> List<T>.sumNumber(){
    /* .. */
}

fun main(){
    val numbers = ListNumber<Long>()
    val numbers2 = ListNumber<Int>()
//    val number3 = ListNumber<String>() error out of bounds

    val angka = listOf(2,3,4,5,6)
    angka.sumNumber()
    val nama = listOf("GG", "WP")
    nama.sumNumber()
}

private fun <E> kotlin.collections.List<E>.sumNumber() {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
}
