package com.slash.slash.android_tutorial_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    var helloWorld = HelloWorld(age = 25, name = "이주향", grade = 4)

    var tempAge = 100
        set(value) {
            field = value
            if (value in 9..18) {
                println("학생입니다")
            }
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        helloWorld.name = null

        if (helloWorld.name != null) {
            val bar: String = helloWorld.name!!
        }

        var fooBar: String? = null
        if (fooBar != null) {
            var foo: String = fooBar
        }

        var helloWorlds = ArrayList<HelloWorld>()

        for (hello in helloWorlds) {
            println(hello.name)
        }

        for (i in 0..10) {
            println(i)
        }

        for (i in 0 until 11) {
            println(i)
        }

    }
}
