fun main() {
    val numbers = arrayOf(10, 20, 30, 40, 50)

    for (i in numbers.indices.reversed()) {
        print("${numbers[i]} ")
    }
}