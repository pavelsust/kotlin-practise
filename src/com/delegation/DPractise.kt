package com.delegation

interface Base {
    fun printMessage()
    fun printMessageLine()
}

class BaseImp(var x : Int) : Base {
    override fun printMessageLine() {
        print(x)
    }

    override fun printMessage() {
        print(x)
    }

}


class Derived (b : Base) : Base by b{

}


fun main(){
    var b = BaseImp(10)
    Derived(b).printMessage()
    Derived(b).printMessageLine()
}