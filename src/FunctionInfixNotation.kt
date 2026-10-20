infix fun String.to(type: String): String {
    if (type == "UP") {
        return this.uppercase()
    } else {
        return this.lowercase()
    }
}

fun main() {
    val result = "Daniel Saptianus" to "UP"
    println(result)

    1000.downTo(1)

}