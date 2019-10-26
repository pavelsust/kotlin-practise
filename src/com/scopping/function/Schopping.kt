package com.scopping.function


fun main(){
    test()
}

fun test(){
    var mood = "i am sad"
    run{
        var mood = "i am happy"
        println(mood)
    }
    println(mood)
}