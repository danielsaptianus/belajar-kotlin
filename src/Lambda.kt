fun toUpper(value: String): String = value.uppercase()

fun main() {
    // membuat lambda
    val contohLambda: (String, String) -> String = {
        firstName: String, lastName: String -> val result = "$firstName, $lastName"
        result
    }

    val result = contohLambda("A", "B")
    println(result)

    // kode it
    val sayHello: (String) -> String = {
        "Hello $it"
    }

    println(sayHello("Daniel"))

    // method references
    val toUppercase : (String) -> String = ::toUpper

    println(toUppercase("Daniel"))
}