package me.yifeiyuan.learnkotlin

/**
 * Created by 程序亦非猿 on 2019/12/18.
 */

fun main(args: Array<String>) {

    Foo234In().foo()
}

interface Foo234{
    fun foo(){
        println("default foo")
    }
}

class Foo234In : Foo234