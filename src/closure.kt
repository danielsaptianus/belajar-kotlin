fun main() {

    var counter: Int = 0
    var name:String = "Daniel"

    val lambdaIncrement: () -> Unit = {
        println("Lambda increment")
        counter++
    }

    val anonymousIncrement = fun() {
        println("Anonymous increment:")
        counter++
    }

    fun functionIncrement(){
        println("function increment")
        counter++
    }

    lambdaIncrement()
    anonymousIncrement()
    functionIncrement()
    lambdaIncrement()
    anonymousIncrement()
    functionIncrement()

    println(counter)
}