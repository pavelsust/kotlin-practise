package com.interfaces.part_2

class Cat : Animal {
    override var animalName: String = "Cat"

    override fun animalName() {
        println("Animal Name is: $animalName")
    }

    override fun eat(age: Int) {
        if (age>2){
            println("Yes it can eat")
        }else{
            println("No cat can't eat")
        }
    }

    override fun numberOfTeeth(teeth: Int) {

    }

    override fun isCanRun(age: Int): Boolean {
        var run = age>=10
        return run
    }
}