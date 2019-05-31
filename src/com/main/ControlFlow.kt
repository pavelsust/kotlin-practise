package com.main


fun main(args: Array<String>){

    var number_1 =19;
    var number_2 = 20;

    var find = if (number_1>number_2) number_1 else number_2;
    println(find);


    /// if branches can be block

    val max = if (number_1>number_2){
        println("find ")
        number_1;
    }else{
        println("another find")
        number_2;
    }

    println(max)

    var x = 3;

    when(x){
        1 -> println("it is 1")
        2 -> println("it is 2")
        3 -> println("it is 3")
    }
}