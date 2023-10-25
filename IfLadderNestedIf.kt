package com.example.testapplication

fun main() {

    print("please enter 3 number :")
    var number1: Int = readln()!!.toInt()
    var number2: Int = readln()!!.toInt()
    var number3: Int = readln()!!.toInt()

    var largestNumber: Int

    if (number1 >= number2) {
        if (number1 >= number3) {
            largestNumber = number1
        } else {
            largestNumber = number3
        }
    }
    else
    {
        if (number2 >=number3)
        {
            largestNumber = number2
        }
        else
        {
            largestNumber= number3
        }
    }
    println("The largest number is $largestNumber")

//    println("Please enter your age:")
//    var yourAge:Int= readln()!!.toInt()
//
//    if (yourAge<13){
//        print("your are child")
//    }else if (yourAge<19){
//        print("your are teenager:")
//    }else{
//        if (yourAge <65){
//            print("you are an adult:")
//        }else{
//            print("you are senior")
//        }
//
//    }
}