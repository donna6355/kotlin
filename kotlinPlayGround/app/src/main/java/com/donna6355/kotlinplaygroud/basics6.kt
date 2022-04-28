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

    //ArrayList
    val arrayList = ArrayList<String>()
    arrayList.add("One")
    arrayList.add("Two")
    println("\n.........print ArrayList.........")
    for (i in arrayList) {
        println(i)
    }

    val arraylist: ArrayList<String> = ArrayList<String>(5)
    val list: MutableList<String> = mutableListOf<String>()

    list.add("one")
    list.add("two")

    arraylist.addAll(list)
    println("........print arraylist........")
    val itr = arraylist.iterator()

    while (itr.hasNext()) {
        println(itr.next())
    }
    println("size of arrayList = ${arraylist.size}")

    for (i in arraylist) {
        println(i)
    }
    println("........arraylist.get(1)........")
    println(arraylist.get(1)) // equivalent to arraylist[1]

    val myArrayList: ArrayList<Double> = ArrayList()
    myArrayList.add(13.212312)
    myArrayList.add(23.151232)
    myArrayList.add(32.651553)
    myArrayList.add(16.223817)
    myArrayList.add(18.523999)
    var total = 0.0
    for (i in myArrayList) {
        total += i
    }
    var average = total / myArrayList.size
    println("Average is " + average)
}

data class Fruit2(val name: String, val price: Double)