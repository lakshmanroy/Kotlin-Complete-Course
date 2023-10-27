package com.example.testapplication

import kotlin.random.Random

fun main(args: Array<String>) {

    val number = Random .nextInt(0,100)
    println("Please enter a number:")

    while (2 > 1)
    {
        val userGuess:Int= readLine()!!.toInt()
        if (userGuess == number)
        {
            println("congratulations, you know the number in my mind")
            break
        }
        else if (userGuess < number)
        {
            println("Increase you guess")
        }
        else
        {
            println("Decrease your guess")
        }
    }

}