package me.yifeiyuan.learnkotlin

import com.sun.xml.internal.fastinfoset.util.StringArray

/**
 * Created by 程序亦非猿 on 2019/10/9.
 */


fun main(args: Array<String>) {

    greeting("程序亦非猿")

    var intArray: IntArray = intArrayOf(1, 2, 3)
    println(intArray.size)

    var floatArray: FloatArray = floatArrayOf(1.0f, 2.0f)

}

fun greeting(name: String){
    println("Hi ${name} !")
}
