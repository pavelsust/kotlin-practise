package com.corotines

import kotlinx.coroutines.*

fun main(){
    showNumber()
}

fun showNumber(){
    GlobalScope.launch(Dispatchers.Default) {
        repeat(1000){i->
            println("number is $i")
            delay(1000)
        }
    }

}
