package com.interfaces.part_2

class Tiger : Animal {

    override var animalName: String = "Tiger"
    override fun animalName() {
        println("Animal Name is: $animalName")
    }

    override fun isCanRun(age: Int): Boolean {
        var isRun = age > 6
        return isRun
    }

    override fun eat(age: Int) {
        if (age>3)  println("Yes it can eat")
        println("No cat can't eat")
    }

    override fun numberOfTeeth(teeth: Int) {
        println("Number of teeth is $teeth")
    }
}