fun main(args: Array<String>) {

    var nums = 1..10
    var value = 3

    var charters = 'a'..'z'

    println(value in nums)
    println(isChar('x', charters))

}

fun isChar(char: Char, characters: CharRange) = char in characters