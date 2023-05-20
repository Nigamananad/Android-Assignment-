package com.example.module2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class FirstActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)

        Thread{
            Thread.sleep(2000)
            startActivity(Intent(this,SecondActivity::class.java))
            finish()
        }.start()
    }
}