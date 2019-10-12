package com.delegation

interface AnotherBase {
    fun print()
    val name: String
}


class AnotherBaseImp(var x: Int): AnotherBase{
    override fun print() {
        println(x)
    }

    override val name: String
        get() = "pavel"

}

class DerivedAnother(b : AnotherBase): AnotherBase by b{
    override val name: String
        get() = "robin"
}

fun main(){
    val b = AnotherBaseImp(10)
    val anotherDerived = DerivedAnother(b)
    println(anotherDerived.print().toString())
    anotherDerived.print()
}