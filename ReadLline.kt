package com.lkrd.realtimedatabase

    fun main() {

        println("What is your name?")
        var name:String?= readln()

        println("How old are you?")
        var age:Int= readln()!!.toInt()

        println("your name is $name and your age is=" +age)
    }