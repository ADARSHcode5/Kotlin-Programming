fun main() {
    val str = "Programming"

    var count = 0

    for (ch in str.lowercase()) {
        if (ch in "aeiou")
            count++
    }

    println("Vowels = $count")
}