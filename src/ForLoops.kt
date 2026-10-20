fun main() {

    val names = arrayOf("Daniel", "Hulio", "Saptianus")

    var total = 0
    for (name in names) {
        println(name)
        total++
    }
    println("Total perulangan = $total")

    // for Range
    for (value in 0..100) {
        println()
    }

    for (value1 in 1000 downTo 1 step 81) {
        println()
    }

    val ukuranArray = names.size - 1
    for (value2 in 0..ukuranArray) {
        println(names.get(value2))
    }
}