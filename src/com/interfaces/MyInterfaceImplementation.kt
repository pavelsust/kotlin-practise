package com.interfaces

class MyInterfaceImplementation: MyInterfaces {
    override val properties: Int = 20
    override var propertiesWithImplementatin: String = "name"

    override fun foo() {
        println("This is a foo function")
    }

    override fun bar() {
        println("This is a bar function")
    }
}