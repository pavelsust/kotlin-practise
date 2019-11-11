package com.scopping.function


/**
 *  run -> can take any kind of input and workes with this statement
 *  it -> can provide itself into the lambda function and can return different element
 *  also -> also and it almost same the main difference is it can return different value but also will return only itself
 *  and also will operate will it statement
 *
 *  also only works with original input you can't menupulate the original
 *
 *  apply -> it is an extention function it sends this as it's argument and return this as itself
 *
 *  apply -> it is an extension function it sends this as it's argument and it returns this as itself
 *
 */

fun main(){

    /*
    var data = insertData("my data")
    showData()
    showData()
     */
    //val objectName = createInstance("pavel")
    //println(objectName.name)

    alsoTest()

}

fun let(){
    var name : String = "my name is pavel"

    name.let {
        println("Length is ${it.length}")
    }

    name.run {
        println("Length is $length")
    }

}


fun letTest(){
    val name = "pavel"
    name.let {
        println("My name is $it")
        it.reversed()
    }.let {
        println("Reversed name is $it")
    }
}

fun alsoTest(){

    /*
    var name = "pavel"
    name.also {
        println("My name is $it")
        it.reversed()
    }.also {
        println("Reversed name is ${it.reversed()}")
    }

     */

    var name = "pavel"
    name.also {
        name = "robin"
    }
    println(name)

    var againName = "pavel"
    againName.let {
        againName = "robin"
    }

    println(againName)
}





fun alsoWorks(){
    var name = "robin"
    name.also {
        println("My name is $it")
    }.also {
        println("My reversed name is ${it.reversed()}")
    }
}

fun insertDataIntoMySchool(schoolName :String , schoolLocation:String) = MySchool().run {
    name = schoolName
    location = schoolLocation

    println(name)
    println(location)
}


fun insertData(schoolName: String , schoolLocation: String){
    var mySchool = MySchool()
    mySchool.name = schoolName
    mySchool.location = schoolLocation
}

fun showSchoolData(){
    var mySchool  = MySchool()
    println(mySchool.name)
    println(mySchool.location)
}


fun insertData(data:String) = MyData(data).run {
    name = data
    println(name)
}

fun showData(){
    var myData:MyData?=null
    println(myData?.name)
}

/*
fun createInstance(nameString:String) = MyData(nameString).apply {
    name = nameString
}

 */

fun createInstance(nameString: String): MyData{
    val myData = MyData(nameString)
    return myData!!
}