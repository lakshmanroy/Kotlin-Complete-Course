package com.lkrd.spinner

import androidx.core.util.rangeTo

fun main() {
    var myCharRange= 'a' .rangeTo('k')
    var myRange= 'm' in myCharRange

    println("My Range is =" + myRange)
}
