package fans.modul4.scopeFucntionWithLambdaReceiver

fun main(){
    val bangun = StringBuilder()
    bangun.append("Hallo")
    bangun.append("Indo")

    println(bangun.toString())

    //menggunakan apply
    val message = StringBuilder().apply {
        append("Halloo")
        append(" Yeah!!!!!")


    }
    println(message.toString())
}