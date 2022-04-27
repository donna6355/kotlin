package com.donna6355.kotlinplaygroud

fun main() {
//    val numbers:IntArray = intArrayOf(1,2,3,4,5,6)
//    val numbers = intArrayOf(1,2,3,4,5,6,)
    val numbers = arrayOf(1, 2, 3, 4, 5, 6)

    println("initial values ${numbers.contentToString()}")
//    for(element in numbers){
//        print(element)
//    }
    numbers[0] = 6
    numbers[1] = 5
    numbers[2] = 4

    println("initial values ${numbers.contentToString()}")

    val days = arrayOf("SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT")
    println(days.contentToString())

    val fruits = arrayOf(Fruit("Apple", 5), Fruit("Orange", 3))
    for (idx in fruits.indices) {
        println("${fruits[idx].name} is at $idx")
    }

    val mix = arrayOf(Fruit("Apple", 5), "MON", "TUE", 1, "THU", 4, "SAT")
    println(mix.contentToString())
}

data class Fruit(val name: String, val price: Int)