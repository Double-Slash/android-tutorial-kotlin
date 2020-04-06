package com.slash.slash.android_tutorial_kotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_main.setOnClickListener {// button 에 이벤트 리스너 등록
            val input = editText_main.text.toString() // editText 에서 text 를 가져오는 방법 !
            textView_main.text = input // textView 에 문자열을 넣는 방법 !
        }

    }
}
