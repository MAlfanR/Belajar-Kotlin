package fans.modul1

fun booleanAnd (a: Int, b:Int, c: Int){
    val isOpen = if(c >= a && c <=b){
        true
    }else{
        false
    }
    println("Kantor buka : $isOpen")
}

fun booleanAnd1 (a: Int, b:Int, c: Int){
    val isOpen = c >=a && c<=b
    println("Kantor buka : $isOpen")
}

fun main(){
    val kantorBuka = 5
    val kantorTutup = 16
    val now = 18

    booleanAnd(kantorBuka, kantorTutup, now)
    booleanAnd1(kantorBuka, kantorTutup, now)
}