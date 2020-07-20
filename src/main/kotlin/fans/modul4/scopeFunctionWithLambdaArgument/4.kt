package fans.modul4.scopeFunctionWithLambdaArgument

fun main(){
    val pesan: String? = null
    pesan?.let {
        val panjang = it.length * 2
        val teks = "Panjang Text $panjang"
        println(teks)
    } ?: run {
        val text =" pesan is null"
        println(text)
    }
    }
