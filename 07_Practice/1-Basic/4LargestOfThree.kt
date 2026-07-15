fun main() {
    val a = 10
    val b = 25
    val c = 15

    if (a >= b && a >= c)
        println(a)
    else if (b >= a && b >= c)
        println(b)
    else
        println(c)
}