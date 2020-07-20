package fans.modul4.scopeFucntionWithLambdaReceiver

//fungsi run
fun main(){
    val text ="Hallo"
    val hasil = text.run {
        val x = this
        val y = this.replace("Hallo", "Kotlin")
        "Replace text dari $x ke $y"
    }

    println("Result : $hasil")
}