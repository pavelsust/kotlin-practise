package com.objectclass

class UsageClass {
    fun useClassFunction(someClass: AClass){
        someClass.someFunctionCall()
    }
}


fun main (array: Array<String>){
    var ugaesClass = UsageClass()
    ugaesClass.useClassFunction(object : AClass(){
        override fun someFunctionCall() {
            super.someFunctionCall()
            println("Some class overwritten")
        }
    })
}