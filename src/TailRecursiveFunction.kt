tailrec fun display(value: Int) {
    println(value)
    if (value > 0) {
        display(value - 1)
    }
}

fun main() {

    tailrec fun display1(value: Int) {
        println("Recursive value: $value")
        if (value > 0) {
            display1(value - 1)
        }
    }

    tailrec fun factorialRecursive(value: Int, total: Int = 1): Int {
        return when (value) {
            1 -> 1
            else -> value * factorialRecursive(value - 1, total * value)
        }
    }

    println(factorialRecursive(13))
}