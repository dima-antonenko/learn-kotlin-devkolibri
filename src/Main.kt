class Main {

}

fun main(args: Array<String>) {
    var name: String = "Alex"

    var a: Int = 1
    var b: Int = 2

    println("Hello $name")
    println("A + B = ${a + b}")

    val userKotlin = UserKotlin("test@gmail.com")
    println("userKotlin: ${userKotlin.email}") // userKotlin: test@gmail.com
    userKotlin.email = "new string"
    println("userKotlin: ${userKotlin.email}") // userKotlin: new string

    var some_name: String = "name1"
    var some_name2 = "name2"

    println("$some_name, $some_name2")
}