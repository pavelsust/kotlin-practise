package com.sealed

sealed class SealedData {

    class IncreaseNumber(i : Int) : SealedData()
    class DecreaseNumber(i : Int) : SealedData()
}


fun main (array: Array<String>){
    var myArray = arrayOf(2,3,4,5)
    var sealedData : SealedData? = null
    for (i in myArray.indices){
        if (i == 2) SealedData.IncreaseNumber(i)
         if (i==3) SealedData.DecreaseNumber(2)
    }

    when(sealedData){
        is SealedData.IncreaseNumber -> 2+4
        is SealedData.DecreaseNumber -> 4-2
    }

    println(""+SealedData.IncreaseNumber(2).toString())
}