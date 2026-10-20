fun fullName(firstName: String, middleName: String ,lastName: String) {
    println("Hello $firstName $middleName $lastName")
}

fun main() {
    fullName("Daniel", "Hulio", "Saptianus")
    fullName( firstName = "Daniel", lastName = "Hulio", middleName = "Saptianus")
}

