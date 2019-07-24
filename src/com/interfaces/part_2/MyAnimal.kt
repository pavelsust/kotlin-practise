package com.interfaces.part_2


fun main(array: Array<String>) {

    /**
     *  Create Object
     */

    var cat = Cat()
    var tiger = Tiger()

    var sentance :String = "my name is pavel"
    var change = sentance.removeFirstLastChar()
    println(change)

    /**
     *  Cat animal
     */
    cat.animalName()
    cat.isCanRun(5)
    cat.eat(1)
    cat.numberOfTeeth(10)
    cat.numberOfTeeth(15)
    cat.numberOfEyes(2)
    cat.show("hello")

    println()

    /**
     *  Tiger Animal
     */
    tiger.animalName()
    tiger.isCanRun(15)
    tiger.eat(15)
    tiger.numberOfTeeth(30)
    println(checkNumber(2, 2))

}

fun checkNumber(number_1: Int , number_2:Int):Boolean{
    return number_1 == number_2;
}

fun Cat.show(name: String) {
    println(name)
}

fun String.removeFirstLastChar(): String {
    return this.substring(1, this.length - 1);
}
