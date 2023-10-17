//you can do practice program so step by step i written

package com.example.testapplication

fun main() {
    var age= arrayListOf<Int>(1,2,3,4,5)
    age.add(9)
    println("first numbe is =" +age[0])
    println("first numbe is =" +age[1])
    println("first numbe is =" +age[2])

    println("__________________________")

    var cars= arrayListOf<String>("BMW","kotlin","java")
    println("First name is name=" + cars[0])
    println("Second name is name =" + cars.get(1))
    println("Third name is name=" + cars[2])

    println("____________________________")

    var anyName=ArrayList<Any>()
    anyName.add(2)
    anyName.add("kotlin")
    anyName.add('R')
    anyName.add(5.67)
    anyName.add(2,"Android")

    println(anyName[0])
    println(anyName[1])
    println(anyName[2])
    println(anyName[3])
    println(anyName[4])
}