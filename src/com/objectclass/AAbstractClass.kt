package com.objectclass

abstract class AAbstractClass {

    abstract fun doSomething(number: Int)

    open fun isIamDoingSomething(){
        println("Yes i am doing something")
    }
}