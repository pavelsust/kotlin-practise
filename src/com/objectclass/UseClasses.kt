package com.objectclass

class UseClasses {

    fun useAbstract(abstractClass: AAbstractClass){
        abstractClass.doSomething(20)
        abstractClass.isIamDoingSomething()
    }

    fun useInterfaceFunction(useInterface : IInterface){
        useInterface.calldingDoSomething()
    }

    fun useAClass(aclass: AClass){
        aclass.someFunctionCall()
    }
}


fun main (array: Array<String>){
    var useClasses = UseClasses()

    var value = 0

    useClasses.useAbstract(object : AAbstractClass(){
        override fun doSomething(number: Int) {
            println("do something $number")
        }

        override fun isIamDoingSomething() {
            super.isIamDoingSomething()
            value++
            println("Value is $value")
        }
    })

    useClasses.useInterfaceFunction( object : IInterface{
        override fun calldingDoSomething() {
           println("interface class")
        }
    })

    useClasses.useAClass(object : AClass(){
        override fun someFunctionCall() {
            super.someFunctionCall()
        }
    })
}