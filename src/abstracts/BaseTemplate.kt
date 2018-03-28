package abstracts

abstract class BaseTemplate {

    var count = 0

    fun a() {
        count ++
        println("count: $count")
    }

    abstract fun minus()

}