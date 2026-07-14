import kotlinx.coroutines.*
import kotlin.time.Duration.Companion.milliseconds

fun main() = runBlocking {

    val job = launch {

        repeat(10) {
            println("Running $it")
            delay(500.milliseconds)
        }
    }

    delay(1500.milliseconds)

    job.cancel()

    println("Coroutine Cancelled")
}