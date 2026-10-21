inline fun hello(name: () -> String): String {
    return "Hello, ${name()}"
}

inline fun hello1(
    firstName: () -> String,
    noinline lastName: () -> String): String {
    return "Hello, ${firstName()}, ${lastName()}"
}

fun main() {
//    println(hello { "Daniel" })
//    println(hello { "Saptianus" })

//    for (i in 0..100) {
//        println(hello("Daniel"))
//    }
}


