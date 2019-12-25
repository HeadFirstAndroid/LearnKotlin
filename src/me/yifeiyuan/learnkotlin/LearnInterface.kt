package me.yifeiyuan.learnkotlin

/**
 * Created by 程序亦非猿 on 2019/11/18.
 */

fun main(args: Array<String>) {

    //named get()
    //默认名字
//    Foo12("12").name.also {
//        println(it)
//    }


    //13
//    Foo13("13").name.also {
//        println(it)
//    }

    D().foo()
}
interface Named {

    //Foo12
    val name: String
        get() {
            return "默认名字".also { println("named get()") }
        }

}

//不 override 的 name 属性不会赋值
class Foo12(name: String) : Named {


}

//重写了接口的属性
class Foo13(override var name: String) : Named {


}


interface Foo3 {

    //var属性
    var name: String
    //val 属性
    val age: Int
        get() = 18

    //抽象方法的定义
    fun sum(a: Int, b: Int): Int

    //方法的定义+实现
    fun minus(a: Int, b: Int): Int {
        return a - b
    }
}

class Foo31(override var name: String, override val age: Int) : Foo3 {
    override fun sum(a: Int, b: Int): Int {
        return a + b
    }
}

class Foo4 : Foo3 {
    override var name: String
        get() {
            return "程序亦非猿"
        }
        set(value) {}
    override val age: Int
        get() {
            return 18
        }

    override fun sum(a: Int, b: Int): Int {
        return a + b
    }

}


interface Sum {

    fun sum(a: Int, b: Int): Int
}

interface Minus : Sum {
    fun minus(a: Int, b: Int): Int
}

class Cal : Minus {
    override fun sum(a: Int, b: Int): Int {
        return a + b
    }

    override fun minus(a: Int, b: Int): Int {
        return a - b
    }

}

interface A {
    fun foo() { println("A") }
    fun bar()
}

interface B {
    fun foo() { println("B") }
    fun bar() { print("bar") }
}

class C : A {
    override fun bar() { print("bar") }
}

class D : A, B {
    override fun foo() {
        super<A>.foo()
        super<B>.foo()
    }

    override fun bar() {
        super<B>.bar()
    }
}
//D().foo()
//A
//B