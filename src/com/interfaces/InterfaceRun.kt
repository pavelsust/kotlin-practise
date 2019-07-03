package com.interfaces

fun main(array: Array<String>){
    val myInterfaceImplementation = MyInterfaceImplementation()
    myInterfaceImplementation.bar()
    myInterfaceImplementation.foo()
    println("Properties{${myInterfaceImplementation.properties}}")
    println("String{${myInterfaceImplementation.propertiesWithImplementatin}}")
}