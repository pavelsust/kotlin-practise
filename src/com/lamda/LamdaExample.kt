package com.lamda


var add : (Int , Int) -> Int = {a , b -> a+ b}
var empty : ((Int) -> Int) = {value -> value
}

fun numberAdd(): ((Int, Int) -> Int){
    return add
}

fun anotherNumber(abc: () -> Unit){
    abc()
}

fun main(){
    var number = numberAdd()
    var result = number(2,1)
    var result2 = anotherNumber {  }
    println(result)

    var anotherResult = empty(2)

}