fun main(args: Array<String>) {
    myFirstFunction()
    myFirstFunction2(2)
    val result = myFirstFunction3(1, 2.3)
    println(result)
}

fun myFirstFunction(): Int {
    return 1
}

fun myFirstFunction2(a: Long): Int {
    return a.toInt()
}

fun myFirstFunction3(a: Long, b: Double) = a + b