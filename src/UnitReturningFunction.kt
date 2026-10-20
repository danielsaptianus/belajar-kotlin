fun printHello(name: String): Unit {
    if (name == "Daniel") {
        println("Hello Bro")
    } else {
        println("Hello $name")
    }
}

fun main() {
    printHello("Daniel")
}