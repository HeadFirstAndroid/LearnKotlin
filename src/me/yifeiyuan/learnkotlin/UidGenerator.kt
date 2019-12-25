package me.yifeiyuan.learnkotlin

import java.util.*

/**
 * Created by 程序亦非猿 on 2019/12/20.
 */

class UidGenerator{



}

fun main(args: Array<String>) {

    println(generateUid())

}


fun generateUid(): String {
    var len = 20
    val str = arrayOfNulls<String>(20)
    val d = System.currentTimeMillis()
    //k4dtcho7
    val ds = d.toString(36)
    val random = Random()
    var r: Int
    while (len-- > 0) {
        r = random.nextInt(36)
        println("r:$r")
        val c = Integer.toString(r, 36)
        println("c:$c")
        str[len] = if (r % 3 == 0) c.toUpperCase() else c
    }
    val arr = ArrayList(Arrays.asList<String>(*str))
    //在arr的下标为2、5、8、11、14、17、20、23
    for (i in 0..7) {
        arr.add(i * 3 + 2, ds[i].toString() + "")
    }
    val sb = StringBuilder()
    for (s in arr) {
        sb.append(s)
    }
    return sb.toString()
}