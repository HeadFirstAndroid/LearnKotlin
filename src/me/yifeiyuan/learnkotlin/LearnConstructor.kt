package me.yifeiyuan.learnkotlin

/**
 * Created by 程序亦非猿 on 2019/11/15.
 */


fun main(args: Array<String>) {


//    Person1("程序亦非猿")
//    Person11("程序亦非猿")
//    Person2("程序亦非猿")
    Person5("程序亦非猿",18)

}

class Person1 {
    //次构造函数
    constructor(name: String) {
        println("constructor,$name")
    }
    init {
        //不能引用 name
//        println("Hi ${name},it's init block")
    }
}

//主构造函数是类头的一部分
class Person2 constructor(name: String) {

}

//没有注解、可见性修饰符的时候 constructor 关键字可以省略
class Person11 constructor(name: String) {
    init {
        println("Hi ${name},it's init block")
    }
}

class Person4(name: String) {

    //次构造函数需要显示地调用主构造函数
    constructor(name: String, age: Int) : this(name) {

    }

}


//Person5("程序亦非猿",18)
//输出：
//Hi 程序亦非猿 , this is init block，
//程序亦非猿, 18 岁，性别 0
class Person5(name: String) {

    //默认参数 sex
    constructor(name: String, age: Int, sex: Int = 0) : this(name) {

        println("$name, $age 岁，性别 ${sex}")
    }

    init {
        //只能访问主构造函数里的 name
        println("Hi ${name} , this is init block，")
    }

}
//私有构造器 不能这么实例化 Person6()
class Person6 private constructor(name :String){

}