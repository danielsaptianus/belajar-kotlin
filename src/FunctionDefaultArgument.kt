fun hello(firstName: String, lastName: String? = "Apa Aja") {
    if ( lastName == null) {
        println("Hello $firstName")
    } else {
        println("Hello $firstName $lastName")
    }

}

fun main() {
    hello("Daniel")
    hello("Daniel", "Saptianus")
}