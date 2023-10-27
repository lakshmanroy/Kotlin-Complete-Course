package com.example.testapplication

fun main() {

    print("please enter a day number of week :")
    var dayNumber:Int= readln()!!.toInt()
    var day:String
    when(dayNumber)
    {
        1 -> day= "Monday"
        2 -> day= "Tuesday"
        3 -> day= "wednesday"
        4 -> day= "Thursday"
        5 -> day= "Friday"
        6 -> day= "saturday"
        7 -> day= "sunday"
        else -> day ="invalid day choice"
    }
    println("Day is $day")
    println("Thanks for choose")
}