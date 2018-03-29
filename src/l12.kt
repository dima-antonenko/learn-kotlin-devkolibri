import openexam.Driver
import openexam.Person

fun main(args: Array<String>) {

    println(Person("Alex").name) // выводит Alex
    println(Driver().name) // DriverDefaultName
    println(Driver().getAddress()) // Driver -> getAddress

    var person = Person("Alex")
    var driver = Driver("Ben")

    println(person.getAddress())
    println(driver.getAddress())
}