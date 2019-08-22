package com.interfaces.part_2

interface Animal {

    var animalName: String
    fun animalName()
    fun eat(age: Int)
    fun numberOfTeeth(teeth: Int)
    fun isCanRun(age:Int): Boolean

}