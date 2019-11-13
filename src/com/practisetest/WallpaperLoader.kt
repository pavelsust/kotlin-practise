package com.practisetest

object WallpaperLoader {

    var name: String? = null

    fun init(): WallpaperLoader{
        return WallpaperLoader
    }

    fun setMessage(name:String){
        this.name = name
    }

    fun showMessage(){
        println(name)
    }

    fun showAnoter(): WallpaperLoader{
        println("Nothing")
        return this
    }
}