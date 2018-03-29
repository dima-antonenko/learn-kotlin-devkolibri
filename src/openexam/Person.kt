package openexam

open class Person(val name: String = "PersonDefaultName") {

    open var age: Int = 0

    override fun toString(): String {
        return "Person(name='$name')"
    }

    open fun getAddress(): String {
        return "Person address"
    }

}