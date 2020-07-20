package fans.modul4.scopeFunctionWithLambdaArgument

fun main(){
    val teks = "Hello Alfan"
    val hasil = teks.also {
        println("Panjang value -> ${it.length}")
    }

    println("text ->$hasil")
}