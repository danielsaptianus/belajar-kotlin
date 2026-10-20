fun main() {

    val result = 10/2
    val result1 = 10.0 / 3.0
    val result2 = 10 + 10 / 2

    println(result)
    println(result1)
    println(result2)

    // Augmented Assignments
    var total: Int = 0

    val barang1 = 100
    total += barang1

    val barang2 = 200
    total += barang2

    val barang3 = 300
    total += barang3

    println(total)

    // Unary Operator

    total++ // total = total + 1
    println(total)

    total -- // total == total - 1

    val suhu = -5
    println(suhu)

    val sehat = true
    println(!sehat)

}