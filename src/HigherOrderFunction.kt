fun main() {

    fun hello(name: String, transformer: (String) -> String): String {
        val nameTransform= transformer(name)
        return "Hello, $nameTransform"
    }

    val lambdaUpper = {value : String -> value.uppercase()}
    val lambdaLower = {value : String -> value.lowercase()}

    println(hello("Daniel", lambdaLower))
    println(hello("Daniel", {value : String -> value.uppercase()}))

    // kode Trailng Lambda

    val result1 = hello("Daniel", { value: String -> value.lowercase()})
    val result2 = hello("Daniel") { value : String ->
        value.uppercase()
    } // ini trailing lambda
}