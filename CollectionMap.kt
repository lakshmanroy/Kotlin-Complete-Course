package com.lkrd.chatgpt

fun main() {
    var age= mapOf<String,Int>("virat" to 34,"ronaldo" to 40)

    println("Age of virat =" +age["virat"])
    println("Age of ronaldo =" +age["ronaldo"])

    println("_____________________________")

    var myAge= mapOf<String,Int>("kotlin" to 2017,"Android" to 2008)
    
    println("start kotlin =" +myAge["kotlin"])
    println("start Android =" +myAge["Android"])

}