package com.slash.slash.android_tutorial_kotlin

/**

 * Created by juhyang on 2020-03-03.

 */
class HelloWorld(var name: String?, var age: Int, var grade: Int) {

    fun greet() {
        println("Hello World !")
    }

    fun foo() : Int = age + 10
}