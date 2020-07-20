package fans.modul4.Recursion

fun faktorials(n: Int): Int {
    return if(n==1){
        n
    }else{
        n* faktorials(n-1)
    }
}
fun main(){
    println(faktorials(4))
}