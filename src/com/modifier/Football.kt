package com.modifier

open class Football {
    private var name:String = "pavel"
    protected open var myNumber: Int = 10;


    fun checkNumber(number: Int) : Boolean{
        var check = (number in 10..18)
        return check
    }
}