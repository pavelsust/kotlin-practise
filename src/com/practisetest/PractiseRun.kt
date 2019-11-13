package com.practisetest

fun main(){
    WallpaperLoader.init().let {
        it.setMessage("pavel")
        it.showMessage()
    }

}