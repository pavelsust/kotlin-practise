package com.interfaces.part_2


fun main(array: Array<String>){

    /**
     *  Create Object
     */

    var cat = Cat()
    var tiger = Tiger()


    /**
     *  Cat animal
     */
    cat.animalName()
    cat.isCanRun(5)
    cat.eat(1)
    cat.numberOfTeeth(10)
    cat.numberOfTeeth(15)
    cat.numberOfEyes(2)

    println()

    /**
     *  Tiger Animal
     */
    tiger.animalName()
    tiger.isCanRun(15)
    tiger.eat(15)
    tiger.numberOfTeeth(30)

}