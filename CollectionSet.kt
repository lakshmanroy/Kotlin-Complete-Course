package com.example.testapplication

fun main() {
    var mySetArray = arrayListOf<Any>("kotlin",2,2.5,'k',true,"kotlin")

    println(mySetArray.size)
    println(mySetArray.last())

    //All are same but method is different your have choose

    println("_________________________")

    var mySet = setOf<Any>("kotlin",2,2.5,'k',true,"kotlin")

    println(mySet.size)
    println(mySet.last())

}