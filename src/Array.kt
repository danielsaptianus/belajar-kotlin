fun main() {

    val members: Array<String> = arrayOf("Daniel", "Hulio", "Saptianus")
    val values: Array<Byte> = arrayOf(1, 2, 3)
    val balances: Array<Int> = arrayOf(1, 2, 3)

    val daniel: String = members[0]
    val hulio: String = members[1]

    members.set(0, "El Saptian")
    val el: String =  members[2]

    val nilai: Array<Int?> = arrayOf(1, 2, 3)
    println(nilai[0])

    val users: Array<Int?> = arrayOfNulls(5)
    users[0] = 1
    users[1] = 2
    users[2] = 3
    users[3] = 4
    users[4] = 5
    println(users.size)

}