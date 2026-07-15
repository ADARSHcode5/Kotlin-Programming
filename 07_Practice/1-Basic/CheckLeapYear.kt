fun main() {
    val year = 2024

    if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))
        println("Leap Year")
    else
        println("Not Leap Year")
}