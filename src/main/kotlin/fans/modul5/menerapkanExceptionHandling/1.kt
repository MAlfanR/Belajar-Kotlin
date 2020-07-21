package fans.modul5.menerapkanExceptionHandling

import java.lang.Exception

fun main(){
    val nilaiNull: String? = null
    lateinit var harusnyaTidakNull: String

    try{
        harusnyaTidakNull = nilaiNull!!
        println(harusnyaTidakNull)
    }catch (e: Exception){
        harusnyaTidakNull ="Nilai String null"
        println(harusnyaTidakNull)
    }
}