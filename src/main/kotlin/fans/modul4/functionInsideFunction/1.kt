package fans.modul4.functionInsideFunction

import fans.modul4.lambda.printPesan


fun setWord(pesan: String){
    fun printPesans(teks: String){
        println(teks)
    }

    printPesans("King")
}
fun main(){

}