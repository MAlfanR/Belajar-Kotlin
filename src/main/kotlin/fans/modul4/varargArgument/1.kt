package fans.modul4.varargArgument

fun sumNumbers (vararg number: Int): Int{
    return number.sum()
}

fun <T> asList (vararg input: T): List<T>{
    val result = ArrayList<T>()
    for (item in input){
        result.add(item)
    }

    return result
}

fun getNumberSize(vararg number: Int): Int{
    return number.size
}
fun main(){
    val numbers = sumNumbers(10,30,40,50)
    println(numbers)

    val king = asList(43,45,65)
    println(king)

    val jer = getNumberSize(10,43,21,4,5,5)
    println(jer)
}