fun main(args: Array<String>) {

    val user = User("Alex", 24)
    val user2 = user.copy(age = 1)

    user.age = 19

    println(user)
    println(user2)

    var (age) = user

    println("user age: $age")


}