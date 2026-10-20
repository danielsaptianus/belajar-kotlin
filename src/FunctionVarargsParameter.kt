//

fun hitungTotal(name: String, vararg values: Int): Int {
    var total = 0

    for (value in values) {
        total += value
    }

    return total
}

fun main() {
//    val values = arrayOf(1,2,3,4,5)
//    val result = hitungTotal(values)
//    println(result)

    val result = hitungTotal("Daniel",1, 2, 3, 4, 5, 6, 7, 8, 9)
    println(result)

}