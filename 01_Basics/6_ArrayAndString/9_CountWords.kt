fun main() {
    val sentence = "Kotlin is easy to learn"

    val words = sentence.trim().split("\\s+".toRegex())

    println("Words = ${words.size}")
}