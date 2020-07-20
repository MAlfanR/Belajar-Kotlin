package fans.modul4.advancedCollectionFunction

//distinct
data class Item(val key: Int, val nilai: Any)
fun main() {
    val sum = listOf<Int>(0,1,2,3,4,5,6,7,8,9,5,3,4,6,3,2)
    val berbeda = sum.distinct()

    println(berbeda)

    val items = listOf(
        Item(1, "Kotlin"),
        Item(2,"Is" ),
        Item(3, "GGWP"),
        Item (4, "Yeah"),
        Item(2, "GG")
    )

    val distinctItem = items.distinctBy { it.key }

    distinctItem.forEach {
        println("${it.key} dengan nilai ${it.nilai}")
    }


    val teks = listOf<String>("Aa", "B", "C", "DD", "EEE")
    val distinct = teks.distinctBy {
        it.length
    }

    println(distinct)
}