package com.interfaces.part_2

class Cat : Animal, BodyInterface {

    override var animalName: String = "Cat"

    override fun animalName() {
        println("Animal Name is: $animalName")
    }

    override fun eat(age: Int) {
        if (age > 2) {
            println("Yes it can eat")
        } else {
            println("No cat can't eat")
        }
    }

    override fun numberOfTeeth(teeth: Int) {

    }

    override fun isCanRun(age: Int): Boolean {
        return age >= 10
    }

    override fun numberOfEyes(eyes: Int) {
        println("$animalName has $eyes")
    }

    override fun numberOfLegs(legs: Int) {
        println("$animalName has $legs")
    }
}