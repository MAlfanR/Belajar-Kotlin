package fans.modul3.collectionsOperations

fun main(){
    val numberList = listOf(1,2,3,4,5,6,7,8)
    val evenList = numberList.filter { it %2 ==0 }

    println(numberList)
    println(evenList)

    val notEvenList = numberList.filterNot { it %2 ==0 }
    println(notEvenList)
}