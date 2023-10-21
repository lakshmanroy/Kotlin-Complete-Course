package com.lkrd.spinner

import androidx.core.util.rangeTo

fun main() {
    var myCharRange= 'a' .rangeTo('k')
    var myRange= 'p' in myCharRange

    println("My Range is =" + myRange)
}