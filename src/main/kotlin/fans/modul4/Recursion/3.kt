package fans.modul4.Recursion

fun faktoriala(n: Int, result: Int = 1):Int{
    val newResult = n * result
    println(result)
    return if (n ==1){
        newResult
    }else{
        faktoriala(n-1, newResult)
    }
}

tailrec fun factiorial(n: Int, result: Int = 1): Int{
    val newResult = n * result
    return if (n ==1){
        newResult
    }else{
        faktoriala(n-1, newResult)
    }
}

fun main(){
    println(faktoriala(4,1))

    println(factiorial(100,1))
}