fun main() {
    val numbers = setOf(10, 20, 30, 20, 10, 40)

    println("Set Elements:")

    for (num in numbers) {
        println(num)
    }

    println("Contains 30: ${numbers.contains(30)}")
    println("Size: ${numbers.size}")
}