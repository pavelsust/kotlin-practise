package com.sealed

import com.sealed.BasicScreenState.Loading

sealed class BasicScreenState {
    class Error(): BasicScreenState()
    class Loading():BasicScreenState()
    class Data():BasicScreenState()
}

fun main (array: Array<String>){
    var basicScreenState: BasicScreenState? = null

    var myArray = arrayOf(1,2,3)

    if (myArray.contains(2)){
        basicScreenState = BasicScreenState.Error()
    }

    when(basicScreenState){
        is BasicScreenState.Error -> println("Error shows")
        is Loading -> print("loading shows")
        is BasicScreenState.Data -> print("Data shows")
    }

    var number: Int = 10

    when(number){
        in 10..20 -> println("done")
    }
}