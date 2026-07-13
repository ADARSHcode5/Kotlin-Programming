fun main() {
    val fruits = listOf("Apple", "Banana", "Mango", "Apple")

    println("List Elements:")
    for (fruit in fruits) {
        println(fruit)
    }

    println("First Element: ${fruits.first()}")
    println("Last Element: ${fruits.last()}")
    println("Element at Index 2: ${fruits[2]}")
    println("Size: ${fruits.size}")
}