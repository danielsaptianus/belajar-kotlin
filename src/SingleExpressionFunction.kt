fun double(a: Int): Int = a * 2

fun hi(name: String): Unit = println("Hello $name")

fun main() {
    val result = double(5)
    println(double(6))
    println(result)
    hi("Daniel")
}