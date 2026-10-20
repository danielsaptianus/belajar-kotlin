fun main() {

    val nilai = "A"

    when(nilai) {
        "a" -> {
            println("Amazing")
        }
        "b" -> {
            println("Good")
        }
        "c" -> {
            println("Not Bad")
        }
        "d" -> {
            println("Bad")
        }
        else -> {
            println("gagal wakakaka")
        }
    }

    // multiple option
    val finalExam = 'A'
    when (finalExam) {
        'A', 'B', 'C', 'D', 'E', 'F' -> {
            println("Selamat anda Lulus")
        }
        else -> {
            println("Tidak Lulus wkwkwkwkwk ")
        }
    }

    // In
    val finalExam1 = 'A'
    val passValues = arrayOf('A', 'B', 'C', 'D', 'E', 'F')
    when (finalExam1) {
        in passValues -> {println("Selamat anda Lulus")}
        !in passValues -> {println("Tidak Lulus awokawok")}
    }

    val nilaiLulus: Array<String> = arrayOf("A", "B", "C")
    when (nilai) {
        in nilaiLulus -> println("Selamat anda Lulus")
        !in nilaiLulus -> println("Tidak anda Lulus")
    }

    // When Expression Is
    val name = "Daniel"
    when (name) {
        is String -> println("Ini adalah String")
        !is String -> println("Ini bukan String")
    }

    // When tanda Variable
    val examValue = 90
    when {
        examValue > 80 -> println("Selamat anda Lulus")
        examValue > 60 -> println("Tidak Lulus")
        else -> println("Tidak Lulus")
    }
}