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

}