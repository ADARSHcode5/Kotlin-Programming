fun main() {
    val numbers = arrayOf(25, 60, 15, 80, 45)

    var max = numbers[0]

    for (num in numbers) {
        if (num > max)
            max = num
    }

    println("Largest = $max")
}