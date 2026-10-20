fun String.hello(): String {
    return "Hello $this"
}

fun String.printHello(): Unit = println("Hello $this")

fun main() {
    val name: String = "James"
    val hello: String = "$name.hello"
    println(name.hello())

    "Kurniawan".printHello()
}