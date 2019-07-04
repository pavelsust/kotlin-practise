package com.properties

class Girls {
    var age: Int? = null
        get() = field
        set(value) {
            field = if (value!! < 18)
                value
            else if (value!! in 18..30)
                value
            else value - 3
        }

    var actualAge: Int? = null

    fun checkit(number:Int): IntRange {
        var number = 10..18
        return number
    }

}

fun main (array: Array<String>){
    var lia = Girls();
    lia.actualAge = 18
    lia.age = 20

    println("Actual age is ${lia.actualAge}")
    println("Calculated age ${lia.age}")
}