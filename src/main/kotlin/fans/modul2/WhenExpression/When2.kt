package fans.modul2.WhenExpression

fun main(){
    val value = 7
    val stringofnilai = when(value){
        6 -> {
            println("six")
            "value is 6"
        }
        7 -> {
            println("tujuh")
            "value is 7"
        }
        else ->{
            println("Tidak dapat didefinisikan")
            "Value cannot be reach"
        }
    }

    println(stringofnilai)
}