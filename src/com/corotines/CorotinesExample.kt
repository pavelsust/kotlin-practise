package com.corotines

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking


fun main(){

    val job = GlobalScope.launch {
        delay(1000)
        println("World!!")
    }

    println("hello")
    GlobalScope.launch {
        Thread.sleep(2000)
        job.join()
    }
}

suspend fun show(){
    delay(1000)
    println("world!!")
}

fun blockThread(){
    GlobalScope.launch { // run a corotine in background and continue
        delay(1000)
        println("world!!")
    }
    println("hello") // main thread continue here immediately

    runBlocking { // but this expression block the main thread
        delay(2000) // while we delay for 2 second to keep jvm alive
    }
}


/**
        waiting for a job
        **/
