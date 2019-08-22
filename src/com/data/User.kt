package com.data

data class User(var name: String , var number: Int) {

    var designation: String? = null

    constructor(name: String , designation: String , number: Int): this(name , number){
        this.designation = designation;
    }

    fun showName(){
        println("$name")
    }

}