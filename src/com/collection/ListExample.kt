package com.collection


/**
 *  in the list we can pass different type of data
 *  at the same time
 *
 */

var listString = listOf<String>("a" , "b" , "c")
var listInt = listOf<Int>(1 ,2 ,3)
var listMutable = mutableListOf("a" , "b" , "c")

var arrayList : ArrayList<String> = ArrayList<String>()
var mutableList : MutableList<String> = mutableListOf<String>()

fun main(){
    var list = listOf(1 , 2 ,3 ,"pavel" , "robin")


    for (it in listString){
        mutableList.add(it)
    }

    println()

    for (it in mutableList){
        println(it)
    }

    println()

    for (element in list){
        println(element)
    }

    for (it in listString){

    }

    println()

    for (it in listInt){
        println(it)
    }

    println()

    listMutable.add(1 , "d")

    for (it in listMutable){
        println(it)
    }
}