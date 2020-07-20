package fans.modul4.Recursion


fun faktorial(n: Int): Int{
    return if(n==1){
        n
    }else{
        var hasil =1
        for (i in 1..n){
            hasil = hasil * i
        }
        hasil
    }
}
fun main(){
    println(faktorial(5))
}