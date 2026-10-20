fun main() {
    var firstName: String = "Daniel"
    var lastName: String = "Saptianus"
//    var fullname: String = firstName + " " + lastName
    var fullname: String = "$firstName $lastName"
    var desc: String = "Total $fullname char = ${fullname.length}"

//    var adrress: String = """
//        |Jalan dimana aja, RT 100 RW 1000
//        |Kabupaten paten banget
//        |Jawa Barat
//        |Indonesia
//    """.trimMargin()

    var adrress: String = """
        >Jalan dimana aja, RT 100 RW 1000
        >Kabupaten paten banget
        >Jawa Barat
        >Indonesia
    """.trimMargin(">")

    println(firstName)
    println(lastName)
    println(fullname)
    println(desc)
    println(adrress)
}