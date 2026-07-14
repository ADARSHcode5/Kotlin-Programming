import kotlinx.coroutines.*
import kotlin.time.Duration.Companion.milliseconds

fun main() = runBlocking {

    launch {
        delay(1000.milliseconds)
        println("First Coroutine")
    }

    launch {
        delay(500.milliseconds)
        println("Second Coroutine")
    }

    println("Main Started")
}