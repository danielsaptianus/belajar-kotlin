fun main() {

    fun sayHello(name: String = ""): String {
        return if(name == "") {
            "Hello Brow"
        } else {
            "Hello, $name"
        }
    }

//    fun sayHello(name: String = ""): String {
//        return when(name) {
//            "" -> "Hello Bro"
//            else -> "Hello $name"
//        }
//    }

    println(sayHello())
    println(sayHello("Daniel"))
}