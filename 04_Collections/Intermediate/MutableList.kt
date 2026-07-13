fun main() {
    val numbers = mutableListOf(10, 20, 30)

    println("Original List: $numbers")

    numbers.add(40)
    numbers.add(50)

    numbers.remove(20)

    numbers[0] = 100

    println("Updated List: $numbers")
}