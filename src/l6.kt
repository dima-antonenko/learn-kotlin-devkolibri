fun main(args: Array<String>){
    val person = Person("Alex", "Ivanov", 19)

   // println(person.firstName)
   // println(person.lastName)
   // println(person.age)

    val car = Car(9.0, 10)
    car.isNew = false
    println(car.isNew)

    car.isNew = true
}