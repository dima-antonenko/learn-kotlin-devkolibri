class B : MyInterface {

    override fun fun1() { // переопределение метода
        println("overrided fun2 B -> fun1")
    }

    override fun fun2() {
        super.fun2()
    }
}
