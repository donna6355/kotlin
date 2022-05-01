package com.donna6355.kotlinplaygroud

fun main() {
    println(OuterClass.NestedClass().description)
    var obj = OuterClass.NestedClass()
    obj.foo()

    println(OuterClass().InnerClass().description)
    var obj2 = OuterClass().InnerClass()
    obj2.foo()


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