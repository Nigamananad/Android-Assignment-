package com.example.twosumnumber

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ShowActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show)


        val show = findViewById<TextView>(R.id.tv_show)
        val sum = intent.getIntExtra("SHOW",0)
        show.text = "Sum: $sum"
    }
}

