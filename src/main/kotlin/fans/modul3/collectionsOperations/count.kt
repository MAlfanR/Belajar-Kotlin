package fans.modul3.collectionsOperations


fun main(){
   val nomor = listOf(1,2,3,4,5,6,7,8,9,10)
    //mengetahui jumlah item dalam collection
    println(nomor.count())

    //dapat menambahkan parameter berupa lambda
    println(nomor.count { it % 3 ==0 })

    //find
    val firstOddNumber = nomor.find { it %3 ==0 }
    val x = nomor.firstOrNull { it %2 ==3 }
    println(firstOddNumber)
    println(x)

    //first dan last
    val a = nomor.first()
    println(a)
    val b = nomor.last()
    println(b)

    val c = nomor.first { it >4 }
    println(c)

    //sum
    val d = nomor.sum()
    println(d)

    //sorting
    val charAlfan = listOf<Char>('a', 'l', 'f','a','n')
    var ascending = charAlfan.sorted()
    println(ascending)

    val descending = charAlfan.sortedDescending()
    println(descending)

}