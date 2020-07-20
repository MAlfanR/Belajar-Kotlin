package fans.modul2.WhenExpression

import kotlin.random.Random

fun main(){
    val nomorRegis = when (val regis = getnomorRegis()){
        in 1..50 -> 50 * regis
        in 51..100 -> 100 * regis
        else ->regis
    }
}

fun getnomorRegis() = Random.nextInt(100)