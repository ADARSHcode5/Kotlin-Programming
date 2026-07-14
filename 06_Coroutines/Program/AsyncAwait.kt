import kotlinx.coroutines.*
import kotlin.time.Duration.Companion.milliseconds

fun main() = runBlocking {

    val result = async {
        delay(1000.milliseconds)
        50 + 50
    }

    println("Result = ${result.await()}")
}