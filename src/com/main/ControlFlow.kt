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

    val x = 4;

    when(x){
        2 -> println("found 2")
        3 -> println("found 3")
        4 -> println("found 4")
        else -> println("not found")
    }


    /**
     *  we can also check the value from a range
     */

    var y = 30;

    when(y){
        in 1..20 -> println("found");
        !in 1..20 -> println("out side the range")
        else -> println("not found")
    }

    /**
     *  check directly number is odd or even from when
     */

}