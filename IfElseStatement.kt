package com.lkrd.spinner

fun main() {

    print("Please enter your number:")

    val number:Int= readln()!!.toInt()

    if (number % 2==0){
        println("$number is even")
    }else{
        print("$number is odd")
    }
}