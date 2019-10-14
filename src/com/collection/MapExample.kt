package com.collection

val myMap = mapOf<Int , String>(1 to "pavel" , 2 to "robin" , 3 to "humbba")
var myIntMap = mapOf<String , Int>("pavel" to 1 , "robin" to 2 , "hambba" to 3)

fun main(){
    for (key in myMap.keys){
        println("Element is key $key = ${myMap.get(key)}")
    }

    for (key in myIntMap.keys){
        println("Element is $key = ${myIntMap.get(key)}")
    }
}