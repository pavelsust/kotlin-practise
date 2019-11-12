package com.corotines

import kotlinx.coroutines.*


fun main() = runBlocking {

    val job = launch {
        repeat(1000){i ->
            println("job: I am sleeping $i")
            delay(1000)
        }
    }

    delay(3000)
    println("main: I am tired of waiting")
    job.cancelAndJoin()
    println("main: now i am quiting")
}
