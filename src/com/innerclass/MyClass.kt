package com.innerclass

class MyClass {

    fun show(){
        println("Main class")
    }

    val number = 10;

    inner class AnotherClass{
        fun show(){
            println("Inner class")
        }

        fun showNumber(){
            println(number)
        }
    }
}


fun main (array: Array<String>){
    var myClass: MyClass = MyClass()
    myClass.show()
    myClass.AnotherClass().show()
    myClass.AnotherClass().showNumber()
}