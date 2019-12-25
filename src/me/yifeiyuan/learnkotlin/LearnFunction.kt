package me.yifeiyuan.learnkotlin

/**
 * Created by 程序亦非猿 on 2019/11/12.
 */


class Holder {

}

fun main(args: Array<String>) {


//    val result = double(2)
//    println(result)
//    test()

    var a = "Hi";
    var b = " yo";

    binaryLet(a, b) {
        a, b ->
        print(a + b)
        print(a + b)
    }

    checkNull(null, null, {})
}

fun double(x: Int): Int {
    return x * 2;
}

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun <S, T> binaryLet(va: S, vb: T, ex: (S, T) -> (Unit)) {

    if (va != null && vb != null) {
        ex(va, vb)
    }
}

inline fun <T> checkNull(any: Any?, a: Any?, default: () -> T) {
    default()
}

inline fun <A, B, R> notNull(a: A?, b: B?, block: (A, B) -> R) {
    if (a != null && b != null) {
        block(a, b)
    }
}

fun <R> nonNull(vararg args: Any?, block: () -> R) {
    when {
        args.filterNotNull().size == args.size -> block()
    }
}

fun test() {
    var name = "Hi"
    var age = 12
    notNull(name, age) { name, age ->
        println(name + age)
    }
}
