fun main() {

    fun hello(name: String, transformer: (String) -> String): String {
        val nameTransform = transformer(name)
        return "Hello $nameTransform"
    }

    val upper = fun(value: String): String {
        if (value == "") {
            return "Kosong"
        } else {
            return value.uppercase()
        }
    }

    println(hello("Kosong", upper))
    println(hello("", upper))

    println(hello("Daniel", fun(value: String): String {
        return value.lowercase()
    }))
}