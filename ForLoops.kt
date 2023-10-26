package com.example.testapplication

fun main() {

    for (number in 1..10)
    {
        println(number)
    }

     //second step

//    var sum:Int= 0
//    for (x in 0..10)
//    {
//        println(x)
//        sum +=x
//
//    }
//    println("sum of numbers = $sum")

    //third step

   /* var sum:Int= 0
    for (x in 0..10)
    {
        if (x % 2 == 0)
        {
            println(x)
            sum +=x
        }
    }
    println("sum of numbers = $sum")

    */

    // four step

   /* var myNumberArray = arrayListOf<Int>(1,2,3,4,5,6,7,8,9,10)
    for ( y in myNumberArray)
    {
        println(y)
    }
    */

    var myNumberArray = arrayListOf<Int>(1,2,3,4,5,6,7,8,9)
    for ( y in 0..(myNumberArray.size)-1)
    {
        println("myNumberArray[$y] = ${myNumberArray[y]}")
    }
}