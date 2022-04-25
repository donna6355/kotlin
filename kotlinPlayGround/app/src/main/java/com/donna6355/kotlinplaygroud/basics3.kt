package com.donna6355.kotlinplaygroud

import java.lang.IllegalArgumentException

fun main() {
    //creating instances of classes
    val isaac = Person("Isaac", "Kim", 1)
    isaac.stateHobby()
    val john = Person()
    john.hobby = "painting"
    john.stateHobby()
    val johnClinton = Person(lastName = "Clinton")


    var s20: MobilePhone = MobilePhone("Android", "Samsun", "Galaxy S20 Ultra")

    var myCar = Car()
    println(myCar.myBrand)
    myCar.maxSpeed = 0
    println(myCar.maxSpeed)
}

// possible to omit constructor and set default value
class Person(firstName: String = "John", lastName: String = "Doe") {
    //Member variables = properties
    var age: Int? = null
    var hobby: String = "playing with my cat"
    var firstName: String = ""

    init {
        //initializer block
        this.firstName = firstName
        println("Person class created, firstName = $firstName, lastName = $lastName")
    }

    //secondary constructor
    constructor(firstName: String, lastName: String, age: Int) : this(firstName, lastName) {
        this.age = age
    }

    //member function = methods
    fun stateHobby() {
        println("${this.firstName}'s hobby is $hobby")
    }
}

class MobilePhone(osName: String, brand: String, model: String) {
    init {
        println("mobilePhone created, osName=$osName, brand=$brand, model=$model")
    }
}

class Car() {
    lateinit var owner: String

    val myBrand: String = "BMW"
        get() {
            //custom getter
            return field.lowercase()
        }

    // once you declare variable, this get/set are registered automatically!
    var maxSpeed: Int = 250
        //        get()=field
        //        set(value){field=value}
        set(value) {
            field =
                if (value > 0) value else throw IllegalArgumentException("this value is not allowed")
        }

    var myModel: String = "SM5"
        private set // it can be set inside the class only i.e. init{...}

    init {
        this.myModel = "SM7"
        this.owner = "Isaac"
    }
}