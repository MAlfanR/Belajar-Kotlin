package fans.modul2.Perulangan

//penggunaan index
fun main(){
    val range = 1.rangeTo(20) step 3
    for((index, value) in range.withIndex()){
        println("value $value with index $index ")
    }
}