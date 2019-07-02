package com.`class`.example

class Car (name: String){

    var id: Int? = null;
    var name: String? = null;


    init {
        println("first init")
    }

    init {
        println("second init")
    }

    constructor(name_1: String, id: Int , name: String): this(name){
        this.name = name_1
        this.id = id;
        this.name = name;
    }


    fun printAll(){
        println("Name is $name")
        println("id is $id")
    }

}