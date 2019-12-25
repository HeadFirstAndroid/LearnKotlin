package me.yifeiyuan.learnkotlin

/**
 * Created by 程序亦非猿 on 2019/11/19.
 */


class FooF {

    var size: Int = 0
        get() {
            return field + 1
        }
        set

    val isEmpty: Boolean
        get() = this.size == 0

    var age: Int = 0
        set(value) {
            field = field + value
        }

}

fun main(args: Array<String>) {

    var foo = FooF()
    foo.age = 3
    foo.age = 3

    println(foo.age)//6

}