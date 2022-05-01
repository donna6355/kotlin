package com.donna6355.kotlinplaygroud

import java.lang.ArithmeticException
import java.lang.NumberFormatException

fun main() {
    println(OuterClass.NestedClass().description)
    var obj = OuterClass.NestedClass()
    obj.foo()

    println(OuterClass().InnerClass().description)
    var obj2 = OuterClass().InnerClass()
    obj2.foo()


    //exception handling


    val str = getNumber("10.5")
    println(str)
    validate(15)
    println("code after validation check...")
}


fun getNumber(str: String): Int {
    return try {
        Integer.parseInt(str)
    } catch (e: ArithmeticException) {
        println("ArithmeticException")
        1
    } catch (e: NumberFormatException) {
        println("NumberFormatException")
        0
    } finally {
        println("finally block always executes")
    }
}

fun validate(age: Int) {
    if (age < 18) throw ArithmeticException("under age")
    //throw is not for productino as it causes crash
    else println("eligible for drive")
}

class OuterClass {
    //outer class code
    private var name: String = "Isaac"

    class NestedClass {
        var description: String = "code inside nested class"
        private var id: Int = 101
        fun foo() {
//            print("name is $name") // cannot access the outer class member
            println("id is $id")

        }
    }

    //inner class can access the outer class member
    inner class InnerClass {
        var description: String = "code inside inner class"
        private var id: Int = 20201231
        fun foo() {
            println("name is $name")
            println("id id $id")
        }
    }
}