package me.yifeiyuan.learnkotlin

/**
 * Created by 程序亦非猿 on 2019/12/25.
 */


fun main(args: Array<String>) {


    println(testClosure())

//    foo(){
//        return@foo
//    }
}

fun foo(block: () -> Unit) :String{
    println("hahh")
    block.invoke()
    return "A"
}

fun testClosure(): Int {

    "test".apply {

        foo {
            return@foo
        }
        println("apply foo")

        //注释这个 if 或者 return@apply 会返回 1
        if (this.equals("test")) {
            return@apply
            println("apply test")
        }
        println("返回 1")
        return 1

    }

    println("返回 0")
    return 0
}