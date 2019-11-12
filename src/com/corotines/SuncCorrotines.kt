package com.corotines

import kotlinx.coroutines.CoroutineStart
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlin.system.measureNanoTime
import kotlin.system.measureTimeMillis

/**
 *  launcher return a job and doesn't carry any resulting value
 *  async returns a deferred value and with non blocking future
 *  and it promose you to return a value later.
 *  we can use .await() on deferred value to get its eventual result
 *
 */

fun main() = runBlocking{
    val time = measureTimeMillis {
        val one = async {  doSomethingOne()}
        val two = async { doSomethingTwo() }

        println("The answer is ${one.await() + two.await()}")

    }


    val time2 = measureTimeMillis {
        val one = doSomethingOne()
        val two = doSomethingTwo()

        println("The answer is ${one +two}")
    }


    val time3 = measureTimeMillis {

        var one = async(start = CoroutineStart.LAZY){ doSomethingOne()}
        var two = async (start = CoroutineStart.LAZY){ doSomethingTwo()}

        // need to start the function to call
        one.start()
        two.start()

        println("The answer is ${one.await() + two.await()}")
    }

    println("Complete time is $time3 in ms")

    println("Process complete in $time ms")
    println("Process complete in $time2 ms")
}

suspend fun doSomethingOne(): Int{
    delay(1000)
    return 13
}

suspend fun doSomethingTwo(): Int{
    delay(1000)
    return 50
}

