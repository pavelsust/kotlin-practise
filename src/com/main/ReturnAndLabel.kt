package com.main

fun main(args: Array<String>){


    /**
     *  break loops
     */
    for (i in 1..10){
        if (i==7){
            break
        }
        println(i)
    }

    /**
     *  return and labels
     */


    fun foo(){
        listOf(1 , 2, 3, 4).forEach {
            if (it ==3){
                println(it)
            }
        }
    }
}