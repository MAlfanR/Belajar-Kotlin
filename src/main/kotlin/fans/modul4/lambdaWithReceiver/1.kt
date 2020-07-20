package fans.modul4.lambdaWithReceiver



fun main(){
    val pesan = bangunString {
        append("Hello")
        append("From")
        append("Ranger")
        append("GO")
        append("LALALALA")
    }

    println(pesan)
}

fun bangunString(jeray: StringBuilder.() -> Unit): String{
    val stringBuilder = StringBuilder()
    stringBuilder.jeray()
    return stringBuilder.toString()
}