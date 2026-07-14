fun main() {
    val list: List<String?> = listOf("A", null, "B", "C", null)

    for (item in list) {
        println(item ?: "Null Value")
    }
}