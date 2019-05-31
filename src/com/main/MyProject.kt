package com.main


fun main(args: Array<String>) {

    var number_1: Int?
    var number_2: Int?

    number_1 = 20;
    number_2 = 30;

    val mainNumber = number_1+number_2;
    println(mainNumber)


    var checkNumber : Boolean?;

    checkNumber = (number_1>number_2);
    println(checkNumber)


    var myArray = arrayOf(3 , 2, 1);

    if (3 in myArray){
        println("found 3")
    }else{
        println("not found")
    }

    for (i in myArray.indices){
        println("number is "+myArray[i]);
    }


    val myName = "pavel";

    for ((i , v) in myName.withIndex()){
        println("$i"+ "index "+ v);

    }

    for (i in myArray){
        println(i)
    }
}
