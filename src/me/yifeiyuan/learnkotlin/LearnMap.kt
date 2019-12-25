package me.yifeiyuan.learnkotlin

/**
 * Created by 程序亦非猿 on 2019/12/23.
 *

@SinceKotlin("1.1") public typealias ArrayList<E> = java.util.ArrayList<E>
@SinceKotlin("1.1") public typealias LinkedHashMap<K, V> = java.util.LinkedHashMap<K, V>
@SinceKotlin("1.1") public typealias HashMap<K, V> = java.util.HashMap<K, V>
@SinceKotlin("1.1") public typealias LinkedHashSet<E> = java.util.LinkedHashSet<E>
@SinceKotlin("1.1") public typealias HashSet<E> = java.util.HashSet<E>


// also @SinceKotlin("1.1")
internal typealias SortedSet<E> = java.util.SortedSet<E>
internal typealias TreeSet<E> = java.util.TreeSet<E>

 */


fun main(args: Array<String>) {

    createMap()
}

fun createMap() {

    //mapOf 只是可读
    var intMap = mapOf<Int, Int>()
    var stringMap = mapOf<String, String>(
            "1" to "1", "2" to "2"
    )

    //mutableMapOf 可读可写
    var msMap = mutableMapOf<String, Int>("1" to 1, "2" to 2)
    //LinkedHashMap
    var linkedMap = linkedMapOf<String, String>()
    // HashMap
    var hashMap = hashMapOf<String, String>()


    println(msMap)

    msMap = (msMap - "1") as MutableMap<String, Int> //如果减法操作后为空 map 了，会变成一个 EmptyMap ，就会导致强转错误

    println(msMap)


}
