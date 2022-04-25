package com.donna6355.kotlinplaygroud


data class User(val id: Long, var name: String)

fun main() {
    val user1 = User(1, "Isaac")

    val name = user1.name
    println(name)
    user1.name = "Michael"
    val user2 = User(1, "Michael")
    println(user1 == user2)

    println("user1 details: $user1")

    val updateUser = user1.copy(id = 2)
    println(updateUser)
    println(updateUser.component1()) // prints id
    println(updateUser.component2()) // prints name

    //deconstruction
    val (updatedUserId, updatedUserName) = updateUser
//    same result as below!
//    val updatedUserId = updateUser.id
//    val updatedUserName = updateUser.name


    var audi = MyCar("A3", "AUDI", 200.0)
    var tesla = ElectricCar("S300", "TESLA", 250.0, 20.00)

    //Polymorphism
    //Polymorphism is a mechanism when a behavior can be implemented differently by many classes
    audi.drive(200.0)
    tesla.drive(200.0)

    tesla.extendRange(5.0)
    tesla.drive()

    tesla.brake()
    audi.brake()
}


interface drivable {
    val maxSpeed: Double
    fun drive(): String
    fun brake() {
        println("The drivable is breaking")
    }

}

//super class, parent class,base class
//need 'open' to inherits, otherwise 'sealed' to block inherits
open class MyCar(val name: String, val brand: String, override val maxSpeed: Double) : drivable {
    open var range: Double = 0.0

    fun extendRange(amount: Double) {
        if (amount > 0) range += amount
    }

    override fun drive() = "driving the interface drive"

    //    same override
//    override fun drive(): String {
//        return "driving the interface drive"
//    }
    open fun drive(distance: Double) {
        println("drove for $distance km")
    }

}

//sub class, child class, derived class
class ElectricCar(name: String, brand: String, maxSpeed: Double, battery: Double) :
    MyCar(name, brand, maxSpeed) {
    override var range = battery * 6

    override fun drive(distance: Double) {
        println("drove for $distance km on Electricity")
    }

    override fun drive(): String {
        return "drove for $range km on Electricity"
    }

    override fun brake() {
        super.brake()
        println("brake inside of electic car")
    }
}