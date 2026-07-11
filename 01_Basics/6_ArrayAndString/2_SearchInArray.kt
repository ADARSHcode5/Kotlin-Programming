fun main() {
    val numbers = arrayOf(10, 20, 30, 40, 50)
    val search = 30

    if (search in numbers)
        println("Element Found")
    else
        println("Element Not Found")
}