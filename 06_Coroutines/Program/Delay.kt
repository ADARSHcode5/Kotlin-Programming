import kotlinx.coroutines.*
import kotlin.time.Duration.Companion.milliseconds

fun main() = runBlocking {
    launch {
        delay(2000.milliseconds)
        println("Task Completed")
    }

    println("Waiting...")
}