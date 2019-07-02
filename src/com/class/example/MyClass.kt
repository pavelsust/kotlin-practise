package com.`class`.example

class MyClass constructor(firstName: String) {


    var schoolName: String? = null;
    var collegeName: String? = null;
    var number: Int? = null


    init {
        println("hello $firstName")
    }


    constructor(firstName: String, schoolName: String, collegeName: String, number: Int) : this(firstName) {
        this.schoolName = schoolName;
        this.collegeName = collegeName;
        this.number = number;
    }

    fun checkNumber() {
        var checkNumber = if (number!! > 3) true else false;
        println(checkNumber)
    }


    fun checkSchool() {
        if (schoolName.equals(collegeName)) {
            println("Ya match")
        } else {
            println("Didn't match")
        }
    }


}