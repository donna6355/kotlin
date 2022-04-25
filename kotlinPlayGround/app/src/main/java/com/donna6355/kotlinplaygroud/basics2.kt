package com.donna6355.kotlinplaygroud

fun main() {
    myFunction()
    var res = avg(4.0, 5.23) //argument
    println("res is $res")

//    var name: String = "Denis"
//    name = null //compilation error
    var nameNull: String? = "Isaac"
    nameNull = null

//    var len2 = nameNull?.length //safe code operator
    nameNull?.let { println("$it is not null") }// this function is called when it is not null!

    val name = nameNull ?: "Guest" //?: Elvis operator
    //val wifesAge2: String? = user?.wife?.age ?: 0

    println("name is $name")
    println(name!!.lowercase()) // use if 100% sure this var is not null

}

//parameter (inputP
fun addUp(a: Int, b: Int): Int {
    return a + b
}

fun avg(a: Double, b: Double): Double {
    return (a + b) / 2
}

fun myFunction() {
    print("Good Morning from S.Korea")
}
//
//// NULLABLES/OPTIONALS in Kotlin
//// Kotlin supports nullability as part of its type System.
//// That means You have the ability to declare whether
//// a variable can hold a null value or not.
//// By supporting nullability in the type system,
//// the compiler can detect
//// possible NullPointerException errors at compile time
//// and reduce the possibility of having them thrown at runtime.
//var name: String = "Denis"
//// name = null // Compilation Error
//
//var nullableName: String? = "Denis"
//nullableName = null // Works
//
//// Here name cannot/must not be null
//val len = name.length
//val upper = name.toLowerCase()
//
//// but the same methods won't work on nullable types
//val len2 = nullableName.length // Compilation Error
//val upper2 = nullableName.toLowerCase()  // Compilation Error
//
//// So how can we solve this? We could do a null check before hand
//
//val nullableName2: String? = "Denis"
//
//if(nullableName2 != null) {
//    println("Hello, ${nullableName2.toLowerCase()}.")
//    println("Your name is ${nullableName2.length} characters long.")
//} else {
//    println("Hello, Guest")
//}
//
//// This works but seems to be quite some work...
//// So how about we shorten the syntax...
//// Kotlin provides a Safe call operator, ?.
//// It allows you to combine a null-check and
//// a method call in a single expression.
//
//nullableName2?.toLowerCase()
//
//// This is the same as:
//if(nullableName2 != null)
//nullableName2.toLowerCase()
//else
//null
//
//// You can use methods on a nullable variable like this
//val nullableName3: String? = null
//
//println(nullableName3?.toLowerCase()) // prints null
//println(nullableName3?.length) // prints null
//
//// You can perform a chain safe calls:
////val wifesAge: String? = user?.wife?.age
//
//
//// Let'S say we don’t want to print anything if
//// the variable is null?
//
//// In order to perform an operation only if the
//// variable is not null, we can use the safe call
//// operator with let -
//
//val nullableName4: String? = null
//
//nullableName4?.let { println(it.toLowerCase()) }
//nullableName4?.let { println(it.length) }
//// Prints nothing because there nullableName is null
//// and we used let to prevent anything from being performed
//
//
//// What if we would like to enter a default value?
//// Then we can use the elvis operator ?:
//val name2 = nullableName4 ?: "Guest"
//
////val wifesAge2: String? = user?.wife?.age ?: 0
//
//
//// Not null assertion : !! Operator
//// The !! operator converts a nullable type to a
//// non-null type, and throws a NullPointerException
//// if the nullable type holds a null value.
//// This is risky, and you should only use it if
//// you are 100% certain, that there will be a value in
//// the variable.
//val nullableName5: String? = null
//nullableName5!!.toLowerCase() // Results in NullPointerException
//