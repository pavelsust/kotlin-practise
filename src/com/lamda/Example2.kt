package com.lamda

var number : ((Int) -> Int) = {value -> value + value}
var addExample: ((Int , Int) -> Int) = {a , b -> a+b}

fun numberShow(abc: () -> Unit){
    abc()
}

fun numberAddValue(): ((Int , Int) -> Int){
    return addExample
}

fun main (){
    var showNumberResult = number(3)
    println(showNumberResult)

    var addNumberValue = numberAddValue()
    var result = addNumberValue(3 ,4)
    println(result)
}