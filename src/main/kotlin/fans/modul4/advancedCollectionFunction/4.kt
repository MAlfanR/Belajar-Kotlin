package fans.modul4.advancedCollectionFunction

fun main(){
    val total = listOf<Int>(1,2,5,4,56,7,8)
    val take = total.take(3)

    println(take)

    val takeLast = total.takeLast(4)
    println(takeLast)
}