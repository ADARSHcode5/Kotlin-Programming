fun main() {
    val number = 7

    val result = when {
        number % 2 == 0 -> "Even"
        else -> "Odd"
    }

    println(result)
}