package com.objectclass

class AnonimusObject {

    private fun privateFunction() = object {
        val x: String = "x";
    }

    public fun publicFunction() = object {
        val x: String = "x"
    }


    fun main (array: Array<String>){

    }
}