import Colors.*

fun main(args: Array<String>) {
    println(getNumber(2))
    println(getFavoriteColor(BLACK))
    exampleThree()
}

fun getFavoriteColor (color: Colors) =  when (color) {
    BLACK -> "Черный"
    WHITE -> "Белый"
    RED, GREEN -> "Красно-зеленый"
    else -> "Без цвета"
}

fun getNumber(n: Int) = when (n) {
    1 -> "One"
    2 -> "Two"
    3 -> "Three"
    4 -> "Four"
    5 -> "Five"
    6 -> "Six"
    else -> "None"
}

fun exampleThree() {
    var a = 6
    var b = 4

    when {
        (a > b)  -> println("$a > $b = true")
        (a < b)  -> println("$a < $b = true")
        (a == b) -> println("$a == $b = true")
        else -> println("Произошла ошибка")
    }
}