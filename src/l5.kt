fun main(args: Array<String>){
    val st: String?
    st = getSt()
    val size = st!!.length

    println(size)
}

fun getSt(): String? {
  throw KotlinNullPointerException()
    return null
}