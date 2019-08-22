package com.generics

class Box<T>(t: T) {
    var value = t

    fun showValue() {
        println("value is $value")
    }

}