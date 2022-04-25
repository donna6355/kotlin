package com.donna6355.kotlinplaygroud

fun main() {
    myFunction()
    var res = avg(4.0,5.23) //argument
    println("res is $res")
}

//parameter (inputP
fun addUp(a:Int, b:Int):Int{
    return a+b
}

fun avg(a:Double, b:Double):Double{
    return (a+b)/2
}

fun myFunction(){
    print("Good Morning from S.Korea")
}