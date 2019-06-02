package com.`class`.example

class MyClass constructor(firstName : String) {

    var id: Int?=null;

    init {
        println("name is $firstName")
    }

    constructor(firstName: String , id: Int): this(firstName){
        this.id =id;
        println("id is $id")
    }

    fun checkNumber(){
        var check = if (id!! <30) true else false;
        println(check)
    }
}