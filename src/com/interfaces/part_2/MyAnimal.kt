package com.interfaces.part_2


fun main(array: Array<String>){
    var cat = Cat()
    var tiger = Tiger()

    cat.animalName()
    cat.isCanRun(5)
    cat.eat(1)
    cat.numberOfTeeth(10)

    println()
    tiger.animalName()
    tiger.isCanRun(15)
    tiger.eat(15)
    tiger.numberOfTeeth(30)

}