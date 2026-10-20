fun sum( a: Int, b: Int): Int {
    val total = a + b
    return total
}

fun bagi(a: Int, b: Int): Int {
    if (b == 0){
        return 0
    } else {
        val result = a / b
        return result
    }
    val result = a / b
    return result
}

fun main() {
    val result1 = sum(1, 2)
    println(result1)

    println(sum(5, 6))

    println(bagi(100, 10))
    println(bagi(100, 0))

}