package me.yifeiyuan.learnkotlin

/**
 * Created by 程序亦非猿 on 2019/11/15.
 */

fun main(args: Array<String>) {

}


//如果一个类要能够被继承，得用 open 关键字修饰
open class Base

class Foo : Base() {}


open class Base1(name: String)


class Foo1(name: String, age: Int = 1) : Base1(name) {

}

open class Base2(name: String) {

    var age: Int = name.length.also {

    }

    open fun sayHi() {
        println("Hi base")
    }
}

class Foo2 : Base2("程序") {

    override fun sayHi() {
        super.sayHi()
        println("Hi Foo2")
    }

    inner class Fooooo{
        fun sayHi(){
            super@Foo2.sayHi()
        }
    }
}
