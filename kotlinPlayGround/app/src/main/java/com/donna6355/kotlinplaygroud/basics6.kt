package com.donna6355.kotlinplaygroud

fun main() {
    val fruits =
        setOf("Orange", "Apple", "Mango", "Grape", "Apple", "Orange") // ignores duplicated elements
    println(fruits.toSortedSet())

    val newFruits = fruits.toMutableList()
    newFruits.add("Water Melon")
    print(newFruits.elementAt(4))

    val daysOfTheWeek = mapOf(1 to "Monday", 2 to "Tuesday", 3 to "Wednesday")
    //each key only exists once
    print(daysOfTheWeek[2])
    for (key in daysOfTheWeek.keys) {
        print("$key is to ${daysOfTheWeek[key]}")
    }

    val fruitsMap = mapOf("Favorite" to Fruit2("Grape", 2.3), "OK" to Fruit2("Mango", 4.2))
    val newDaysOfWeek = daysOfTheWeek.toMutableMap()
    newDaysOfWeek[4] = "Thursday"
    newDaysOfWeek[5] = "Friday"

    print(newDaysOfWeek.toSortedMap())
    newDaysOfWeek.
}

data class Fruit2(val name: String, val price: Double)