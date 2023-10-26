package com.example.testapplication

fun main() {

    /*var i = 5
    while (i>0)
    {
        println(i)
        i--
    }
     */

    var k=1
    var fact=1
    while (k<6)
    {
        fact *= k
        println( " $k! = $fact")
        k++
    }
}