package fans.modul4.functionInsideFunction


fun sums(valueA: Int, valueB: Int, valueC: Int): Int{
    fun Int.validasi(){
        if(this==0){
            throw IllegalArgumentException("Value must better than 0")
        }
    }


    valueA.validasi()
    valueB.validasi()
    valueC.validasi()
    return (valueA + valueB)

}
fun main(){
    val X = sums(10,20,30)

    println(X)
}