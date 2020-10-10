package com.example.componentdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.homemodule.utils.Test

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Test.test("我是 ")
    }
}