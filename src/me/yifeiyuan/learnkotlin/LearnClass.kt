package me.yifeiyuan.learnkotlin

/**
 * Created by 程序亦非猿 on 2019/10/10.
 */


interface Greeting {
    fun sayHi(name: String);
}

open class Person : Greeting {
    override fun sayHi(name: String) {
     println("Hi ,$name !")
    }
}

open class Student (var name: String ="未名", var age: Int =1) : Person() {

}

class BadStudent(var name: String){

}

class Man : Greeting, Person() {
    override fun sayHi(name: String) {
        println("Hi man ,${name}")
    }
}


class Android {

}

fun Android.hellWorld(){
    println("Android, hello world!")
}

fun main(args: Array<String>) {
//    Android().hellWorld()
//
//    var intlist: MutableList<Int> = mutableListOf(1, 2, 3, 4, 5)
//    intlist.swap(1,2).also {
//        println(it)
//    }

    var stu = BadStudent("Hehe")
    println(stu.name)
}

fun <T> MutableList<T>.swap(index1:Int,index2:Int):MutableList<T>{
    val tmp = this[index1] // “this”对应该列表
    this[index1] = this[index2]
    this[index2] = tmp
    return this
}
