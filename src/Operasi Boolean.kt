fun main() {
    val nilaiUjian = 90
    val nilaiAbsen = 80
    val nilaiEkstra = 80

    val apakahLulusUjian = nilaiUjian > 80
    val apakahLulusAbsen = nilaiAbsen > 80
    val apakahLulusEkstra = nilaiEkstra > 80

    val apakahLulus = apakahLulusUjian && apakahLulusAbsen && apakahLulusEkstra
    println(apakahLulus)


}