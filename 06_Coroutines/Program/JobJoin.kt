import kotlinx.coroutines.*
import kotlin.time.Duration.Companion.milliseconds

fun main() = runBlocking {

    val job = launch {
        delay(1000.milliseconds)
        println("Job Finished")
    }

    job.join()

    println("Main Finished")
}