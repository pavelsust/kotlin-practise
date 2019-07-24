package com.main

fun main(args: Array<String>) {


    /**
     *  break loops
     */
    for (i in 1..10) {
        if (i == 7) {
            break
        }
        println(i)
    }

    for (i in 1..10) {
        if (i == 6) {
            continue
        }
        println(i)
    }

    listOf<Int>(1, 2, 3, 4).forEach {
        println()
    }

    var result = check(3)
    println(result)

    println(againcheck(5))

}

fun check(number: Int): Boolean {
    return number == 2
}

fun againcheck(number: Int): Boolean {
    return number == 4
}

