package fans.modul7.memulaiCoroutine
import kotlinx.coroutines.*
fun main() = runBlocking {
    launch {
        delay(3000L)
        println("Coroutines!!!")
    }
    println("Hello, ")
    delay(4000L)
}