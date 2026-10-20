fun main() {

    // factorial for loop
    fun factorialLoop(value: Int): Int {
        var result = 1
        for (i in value downTo 1) {
            result *= i
        }
        return result
    }

//    println(factorialLoop(10))

    // factorial Recursive Function
    fun factorialRecursive(value: Int): Int {
        return when (value) {
            1 -> 1
            else -> value * factorialRecursive(value - 1)
        }
    }

   
}