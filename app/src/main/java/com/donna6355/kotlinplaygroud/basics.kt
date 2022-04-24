package com.donna6355.kotlinplaygroud

fun main(){
    var myName = "Isaac" //mutable
    val greeting = "Hi," //immutable
    myName = "Mir"
    println("$greeting $myName")

    //defalut number will be Int and double. other case u gotta explicitly indicate the types
    val one:Int = 1 // Int
    val threeBillion:Long = 3000000000 // Long
    val hundred:Short = 327
    val oneByte: Byte = 1

    val myFloat:Float = 23.12F
    val myDouble:Double = 2.2348173984719837498729384

    var isSunny:Boolean = false
    isSunny = true

    // char is limited to assign only one character
    val letterChar:Char = 'A'

    val myString:String = "hello"
    var firstCharacter = myString[0]
    var lastCharacter = myString[myString.length-1]
    println(firstCharacter)
    println(lastCharacter)

    println("Hello, world!!!")
    // This is a comment. Comments start with //
    // val is used for variables which are immutable (not changable)

    //create a variable for testing all condition
        val age = 17
    //create a variable for drinkingAge
        val drinkingAge = 21
    //create a variable for votingAge
        val votingAge = 18
    //create a variable for drivingAge
        val drivingAge = 16

    if (age >=drinkingAge){
        println("Now you may drink in the US")
    }else if(age >=votingAge){
        println("You may vote now")
    }else if (age>=drivingAge){
        println("You may drive now")
    }else{
        println("You are too young")
    }

    var month:Any = 14
    when(month){
        in 3..5 -> println("spring")
        in 6..8 -> println("summer")
        in 11 downTo 9 -> println("autumn")
        12,1, 2 -> println("winter")
        !in 1..12 -> println("APOCALYPSE")
        is Double ->println("IMPOSSIBLE") // to check type or value!
        else -> println("ERROR")
    }

    when(age){
        // with the !in it's the same as saying not in ...
        !in 0..20  -> print("now you may drink in the US")
        in 18..20  -> print("now you may vote")
        16,17 -> print("you now may drive")
        else -> print("you're too young")
    }

    var x : Any = 13.37
    when(x) {
        is Int -> println("$x is an Int")
        !is Double -> println("$x is not Double")
        is String -> println("$x is a String")
        else -> println("$x is none of the above")
    }

    var y = 100
    while (y >= 10){
        print(y)
        y -=10
    }
    println("\nwhile is done")

    var z = 12
    do{
        print(z)
        z++
    }while (z<=10)
    println("\ndo while is done")
//    Arithmetic operators (+, -, *, /, %)
//    Assignment operators (+=, -=, *=, /=, %=)
//    Comparison operators (==, !=, <, >, <=, >=)
//    Increment & Decrement operators (++, --)


// code from Udemy
//    val myName = "Denis"
//    // myName = "Michael" // ERROR: Val cannot be reassigned
//
//    /* This is a multi line comment starts with /* and ends with *'/ without the '
//     var is used for variables which are mutable/changeable.
//     kotlin is a strongly typed language that supports Type Inference.
//     The compiler will directly assume the size and type to a variable by that.
//     For example, if you assign any whole number to a variable,
//     the compiler will directly assume that the variable is of type Int
//    */ */
//    var myAge = 31
//
//    // Integer TYPES: Byte (8 bit), Short (16 bit), Int (32 bit), Long (64 bit)
//    val myByte: Byte = 13
//    val myShort: Short = 125
//    val myInt: Int = 123123123
//    val myLong: Long = 12_039_812_309_487_120
//
//    // Floating Point number Types: Float (32 bit), Double (64 bit)
//    val myFloat: Float = 13.37F
//    val myDouble: Double = 3.14159265358979323846
//
//    // Booleans the type Boolean is used to represent logical values.
//    // It can have two possible values true and false.
//    var isSunny: Boolean = true
//    // not sunny anymore...
//    isSunny = false
//
//    // Characters
//    val letterChar = 'A'
//    val digitChar = '1'
//
//    // Strings
//    val myStr = "Hello World"
//    var firCharInStr = myStr[0]
//    var lastCharInStr = myStr[myStr.length - 1]

}
