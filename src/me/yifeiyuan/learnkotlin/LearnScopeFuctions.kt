package me.yifeiyuan.learnkotlin

import java.util.*

/**
 * Created by 程序亦非猿 on 2019/11/12.
 */


fun main(args: Array<String>) {



    Student().apply {
        age = 18
    }

    Student().let {
        it.age = 18
    }



    var name = "hhhhh"

    Student(name = "程序亦非猿", age = 18).let {
        println(it.name)
    }


    Student("程序亦非猿", 18).let {
        println(it.name)
    }


    var student = Student("程序亦非猿", 18)
    println(student.name)


    var l = getStudent().let {
        it.age = 18;
        it.name = "let 程序亦非猿"

        println(it.name)
        "Hi let"
    }
    println(l)//Hi let

    var ss = getStudent().run {
        age = 18;
        name = "run 程序亦非猿"
        println(name)
        "Hi run"
    }

    println(ss)//Hi run

    var s = getStudent().apply {
        age = 18;
        name = "run 程序亦非猿"
        println(name)
    }

    println(s)//me.yifeiyuan.learnkotlin.Student@2626b418


    getOneProduct()?.apply {

    }
}

fun getStudent(): Student {
    return Student()
}


fun getOneProduct(): Product? {
    return Product(price = 1.1)
}