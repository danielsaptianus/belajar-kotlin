fun main() {

    var i = 0
    while (true) {
        println("Break Me")
        i++
        if (i > 2) {
            break
        }
    }

    for (a in 1..10) {
        if (a % 2 == 0) {
            continue
        }
        println("angka $a")
    }

}