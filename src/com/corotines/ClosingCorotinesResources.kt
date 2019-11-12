package com.corotines

import kotlinx.coroutines.*

fun main() = runBlocking {
    val job = launch {
        try {
            repeat(1000){i->
                println("job: i am sleeping $i")
                delay(500)
            }
        }finally {
            println("job: i am running finally")
        }
    }

    delay(1500)
    println("main: i am tired of waiting")
    job.cancelAndJoin()
    println("now i quit")
}