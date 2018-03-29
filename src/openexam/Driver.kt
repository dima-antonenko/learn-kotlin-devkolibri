package openexam

class Driver(name: String = "DriverDefaultName"): Person() {

    override var age: Int = 2

    override fun getAddress(): String {
       return "Driver -> getAddress"
    }

    override fun toString(): String {
        return "Driver (age=$age, name=$name)"
    }
}