import kotlinx.coroutines.*

fun main() = runBlocking {
    launch {
        println("Coroutine Started")
    }

    println("Main Function")
}