class A : MyInterface {

    override fun fun1() { // переопределение метода
        println("overrided fun2 A -> fun1")
    }

    override fun fun2() {
        super.fun2()
    }
}
