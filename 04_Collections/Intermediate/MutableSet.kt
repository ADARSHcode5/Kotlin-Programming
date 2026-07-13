fun main() {
    val colors = mutableSetOf("Red", "Blue", "Green")

    println("Original Set: $colors")

    colors.add("Yellow")
    colors.add("Blue")   // Duplicate won't be added

    colors.remove("Green")

    println("Updated Set: $colors")
}