package fans.modul4.functionInsideFunction

fun setKata (pesan: String){
    fun printPesan(){
        println(pesan)
    }

    printPesan()
}
fun main(){
    setKata("King")
}