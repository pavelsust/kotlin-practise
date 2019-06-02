package com.`class`.example

class Car {

    var id: Int? = null;
    var name: String? = null;

    constructor(id: Int , name: String){
        this.id = id;
        this.name = name;
    }


    fun printAll(){
        println("Name is $name")
        println("id is $id")
    }

}