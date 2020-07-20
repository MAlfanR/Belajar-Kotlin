package fans.modul4.nullableReceiver

import kotlin.math.sign


val Int?.potong: Int
    get() = if(this == null) 0
    else this.div(2)

val Int?.slice: Int
    get() = this?.div(2) ?: 0
fun main(){
    val nilai: Int? =null
    println(nilai.slice)

    println(nilai.potong)
}